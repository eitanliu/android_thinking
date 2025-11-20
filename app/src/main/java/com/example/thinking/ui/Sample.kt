package com.example.thinking.ui

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.scene.Scene
import androidx.navigation3.scene.SceneStrategy
import androidx.navigation3.scene.SceneStrategyScope
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.NavDisplay.popTransitionSpec
import androidx.navigation3.ui.NavDisplay.predictivePopTransitionSpec
import androidx.navigationevent.NavigationEventDispatcherOwner
import androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner
import androidx.navigationevent.compose.rememberNavigationEventDispatcherOwner
import kotlinx.serialization.Serializable


@Serializable
object A : NavKey

@Serializable
object B : NavKey

@Serializable
object C : NavKey

@Composable
fun LocalNavigationEventDispatcherProvider(
    parent: NavigationEventDispatcherOwner? = LocalNavigationEventDispatcherOwner.current,
    content: @Composable () -> Unit
) {
    val newOwner = rememberNavigationEventDispatcherOwner(enabled = true, parent)
    CompositionLocalProvider(LocalNavigationEventDispatcherOwner provides newOwner) {
        content()
    }
}

val LocalNavBackStack = staticCompositionLocalOf<NavBackStack<NavKey>> {
    error("Not NavBackStack<NavKey> provided")
}

@Composable
fun LocalNavBackStackProvider(
    backStack: NavBackStack<NavKey> = rememberNavBackStack(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalNavBackStack provides backStack) {
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun SceneDefaultPreview() {
    LocalNavigationEventDispatcherProvider {
        LocalNavBackStackProvider(rememberNavBackStack(A)) {

            SceneDefaultTransitionsSample()
        }
    }
}

// @Sampled
@Composable
fun SceneDefaultTransitionsSample() {
    val backStack = LocalNavBackStack.current
    NavDisplay(
        backStack,
        onBack = { backStack.removeLastOrNull() },
        entryDecorators = listOf(rememberSaveableStateHolderNavEntryDecorator()),
        // NavDisplay default transitions slide vertically
        transitionSpec = { slideVertical },
        popTransitionSpec = { popSlideHorizontal },
        predictivePopTransitionSpec = { slideVertical },
        // but the Scene provides default transitions that slide horizontally
        sceneStrategy = DefaultSceneTransitionsSceneStrategy(),
        entryProvider = entryProvider {
            entry<A> { BlueBox("A") { backStack.add(B) } }
            entry<B> { RedBox("B") }
        },
    )
}

private class DefaultSceneTransitionsSceneStrategy<T : Any>() : SceneStrategy<T> {
    override fun SceneStrategyScope<T>.calculateScene(entries: List<NavEntry<T>>): Scene<T>? {
        if (entries.isEmpty()) return null
        return DefaultSceneTransitionsScene(entries.last(), entries.dropLast(1))
    }
}

private class DefaultSceneTransitionsScene<T : Any>(
    val currentEntry: NavEntry<T>,
    override val previousEntries: List<NavEntry<T>>,
) : Scene<T> {
    override val key = currentEntry.contentKey
    override val entries: List<NavEntry<T>> = listOf(currentEntry)
    override val content: @Composable (() -> Unit) = { currentEntry.Content() }

    // overrides the default animations passed to NavDisplay
    override val metadata: Map<String, Any> = sceneTransitions
}

// @Sampled
@Composable
fun SceneOverrideEntryTransitionsSample() {
    val backStack = rememberNavBackStack(A)
    NavDisplay(
        backStack,
        onBack = { backStack.removeLastOrNull() },
        entryDecorators = listOf(rememberSaveableStateHolderNavEntryDecorator()),
        // the Scene overrides the NavEntry's slide vertical with slide horizontal transitions
        // sceneStrategy = SceneOverrideEntryTransitionsSceneStrategy(),
        entryProvider = entryProvider {
            entry<A> { BlueBox("A") { backStack.add(B) } }
            // the entry defines slide vertical transitions
            entry<B>(
                // metadata =
                //     NavDisplay.transitionSpec({ slideVertical }) +
                //             popTransitionSpec({ popSlideHorizontal }) +
                //             predictivePopTransitionSpec({ slideVertical })
            ) {
                RedBox("B")
            }
        },
    )
}

private class SceneOverrideEntryTransitionsSceneStrategy<T : Any>() : SceneStrategy<T> {
    override fun SceneStrategyScope<T>.calculateScene(entries: List<NavEntry<T>>): Scene<T>? {
        if (entries.isEmpty()) return null
        return SceneOverrideEntryTransitionsScene(entries.last(), entries.dropLast(1))
    }
}

private class SceneOverrideEntryTransitionsScene<T : Any>(
    val currentEntry: NavEntry<T>,
    override val previousEntries: List<NavEntry<T>>,
) : Scene<T> {
    override val key = currentEntry.contentKey
    override val entries: List<NavEntry<T>> = listOf(currentEntry)
    override val content: @Composable (() -> Unit) = { currentEntry.Content() }

    // super.metadata defaults to [entries.last()]'s metadata
    // so this overrides the last entry's transitions
    override val metadata: Map<String, Any> = super.metadata + sceneTransitions
}

private val sceneTransitions =
    NavDisplay.transitionSpec({ slideHorizontal }) +
            popTransitionSpec({ popSlideHorizontal }) +
            predictivePopTransitionSpec({ popSlideHorizontal })

private val duration = 500
private val animSpec: FiniteAnimationSpec<IntOffset> =
    tween(duration, easing = LinearOutSlowInEasing)
private val slideHorizontal =
    slideInHorizontally(animSpec) { it / 2 } togetherWith ExitTransition.None
private val popSlideHorizontal =
    EnterTransition.None togetherWith slideOutHorizontally(animSpec) { -it / 2 }
private val slideVertical =
    slideInVertically(animSpec) { it / 2 } togetherWith slideOutVertically(animSpec) { -it / 2 }

@Composable
fun BlueBox(text: String, onClick: (() -> Unit)?) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color(0.2f, 0.2f, 1.0f, 1.0f))
            .border(10.dp, Color.Blue),
        contentAlignment = Alignment.Center,
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            BasicText(text, Modifier.size(50.dp), style = TextStyle(textAlign = TextAlign.Center))
            if (onClick != null) {
                Button(onClick = onClick) { Text("Click to navigate") }
            }
        }
    }
}

@Composable
fun RedBox(text: String) {
    val backStack = LocalNavBackStack.current
    Box(
        Modifier
            .fillMaxSize()
            .background(Color(1.0f, 0.3f, 0.3f, 1.0f))
            .border(10.dp, Color.Red),
        contentAlignment = Alignment.Center,
    ) {
        BasicText(text, Modifier.size(50.dp), style = TextStyle(textAlign = TextAlign.Center))
        Button(onClick = {
            backStack.removeLastOrNull()
        }) { Text("Click to back") }
    }
}
