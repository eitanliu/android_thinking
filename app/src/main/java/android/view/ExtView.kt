package android.view

import android.content.Context
import android.util.AttributeSet
import kotlin.math.min

class ExtView : View {

    constructor(
        context: Context
    ) : super(context) {
        init(context)
    }

    constructor(
        context: Context, attrs: AttributeSet?
    ) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(
        context: Context, attrs: AttributeSet?, defStyleAttr: Int
    ) : super(
        context, attrs, defStyleAttr
    ) {
        init(context, attrs, defStyleAttr)
    }

    constructor(
        context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context, attrs, defStyleAttr)
    }

    private fun init(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) {
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(
            getDefaultSize2(suggestedMinimumWidth, widthMeasureSpec),
            getDefaultSize2(suggestedMinimumHeight, heightMeasureSpec),
        )
    }

    companion object {

        @JvmStatic
        fun getDefaultSize2(size: Int, measureSpec: Int): Int {
            var result = size
            val specMode = MeasureSpec.getMode(measureSpec)
            val specSize = MeasureSpec.getSize(measureSpec)

            when (specMode) {
                MeasureSpec.UNSPECIFIED -> {}
                MeasureSpec.AT_MOST -> result = min(size, specSize)
                MeasureSpec.EXACTLY -> result = specSize
            }
            return result
        }
    }
}