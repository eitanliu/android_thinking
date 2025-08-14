package android.app;

import android.annotation.UnsupportedAppUsage;
import android.content.AttributionSource;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;

import androidx.annotation.RequiresApi;

/**
 * https://android.googlesource.com/platform/frameworks/base/+/main/core/java/android/app/ActivityThread.java
 * This manages the execution of the main thread in an
 * application process, scheduling and executing activities,
 * broadcasts, and other operations on it as the activity
 * manager requests.
 *
 * {@hide}
 */
public final class ActivityThread {

    @UnsupportedAppUsage
    public static ActivityThread currentActivityThread() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isSystem() {
        throw new RuntimeException("Stub!");
    }

    public static String currentOpPackageName() {
        throw new RuntimeException("Stub!");
    }

    @RequiresApi(api = Build.VERSION_CODES.S)
    public static AttributionSource currentAttributionSource() {
        ActivityThread am = currentActivityThread();
        return (am != null && am.getApplication() != null)
                ? am.getApplication().getAttributionSource() : null;
    }

    @UnsupportedAppUsage
    public static String currentPackageName() {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public static String currentProcessName() {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public static Application currentApplication() {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public ApplicationThread getApplicationThread() {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public Instrumentation getInstrumentation() {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public Looper getLooper() {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public Application getApplication() {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public String getProcessName() {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public final ActivityInfo resolveActivityInfo(final Intent intent) {
        throw new RuntimeException("Stub!");
    }


    public final Activity getActivity(final IBinder token) {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    final Handler getHandler() {
        throw new RuntimeException("Stub!");
    }

    private class ApplicationThread extends ApplicationThreadNative {


    }
}
