package dev.deepseek.runtimeprobe;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Build;

import de.robv.android.xposed.callbacks.XC_LoadPackage;

final class HostProfile {
    private HostProfile() {}

    static String describe(XC_LoadPackage.LoadPackageParam param) {
        return "package=" + param.packageName + " process=" + param.processName;
    }

    static String fromApplication(Application application) {
        String versionName = "unknown";
        long versionCode = -1L;
        try {
            PackageInfo info = application.getPackageManager()
                    .getPackageInfo(application.getPackageName(), 0);
            if (info.versionName != null) versionName = info.versionName;
            versionCode = Build.VERSION.SDK_INT >= 28
                    ? info.getLongVersionCode() : info.versionCode;
        } catch (Throwable ignored) {
            // Keep host identification best-effort and metadata-only.
        }
        ClassLoader loader = application.getClassLoader();
        return "target=" + application.getPackageName()
                + "; versionName=" + versionName
                + "; versionCode=" + versionCode
                + "; classloader=" + (loader == null ? "null" : loader.getClass().getName())
                + "; channel=unclassified; mapping=runtime-unverified";
    }
}
