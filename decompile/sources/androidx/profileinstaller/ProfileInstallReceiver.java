package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import k7.d;
import q.a;
import u4.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File cacheDir;
        Context createDeviceProtectedStorageContext;
        Context createDeviceProtectedStorageContext2;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                b.t(context, new a(1), new d(this, 28), true);
                return;
            }
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        d dVar = new d(this, 28);
                        try {
                            b.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            dVar.i(10, null);
                            return;
                        } catch (PackageManager.NameNotFoundException e10) {
                            dVar.i(7, e10);
                            return;
                        }
                    }
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                d dVar2 = new d(this, 28);
                if (Build.VERSION.SDK_INT >= 24) {
                    Process.sendSignal(Process.myPid(), 10);
                    dVar2.i(12, null);
                    return;
                } else {
                    dVar2.i(13, null);
                    return;
                }
            }
            if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                d dVar3 = new d(this, 28);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 34) {
                        createDeviceProtectedStorageContext2 = context.createDeviceProtectedStorageContext();
                        cacheDir = createDeviceProtectedStorageContext2.getCacheDir();
                    } else if (i6 >= 24) {
                        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                        cacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                    } else if (i6 == 23) {
                        cacheDir = context.getCodeCacheDir();
                    } else {
                        cacheDir = context.getCacheDir();
                    }
                    if (b.c(cacheDir)) {
                        dVar3.i(14, null);
                        return;
                    } else {
                        dVar3.i(15, null);
                        return;
                    }
                }
                dVar3.i(16, null);
            }
        }
    }
}
