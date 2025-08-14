package android.os;

import android.compat.annotation.UnsupportedAppUsage;

import java.util.HashMap;
import java.util.Map;

public final class ServiceManager {

    @UnsupportedAppUsage
    private static HashMap<String, IBinder> sCache = new HashMap<String, IBinder>();

    @UnsupportedAppUsage
    public static IBinder getService(final String name) {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public static void addService(final String name, final IBinder service) {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public static void addService(final String name, final IBinder service, final boolean allowIsolated) {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public static IBinder checkService(final String name) {
        throw new RuntimeException("Stub!");
    }

    @UnsupportedAppUsage
    public static String[] listServices() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static void initServiceCache(final Map<String, IBinder> cache) {
        throw new RuntimeException("Stub!");
    }

}
