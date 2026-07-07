package j5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import com.airbnb.lottie.LottieAnimationView;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6817c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f6815a = i;
        this.f6816b = obj;
        this.f6817c = obj2;
    }

    private final Object a() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName componentNameStartService;
        Context context = (Context) this.f6816b;
        Intent intent = (Intent) this.f6817c;
        sb.p pVarS = sb.p.s();
        pVarS.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        ((ArrayDeque) pVarS.f11745z).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (pVarS) {
            try {
                str = (String) pVarS.f11742w;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    } else {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(".")) {
                                pVarS.f11742w = context.getPackageName() + serviceInfo.name;
                            } else {
                                pVarS.f11742w = serviceInfo.name;
                            }
                            str = (String) pVarS.f11742w;
                        }
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                    }
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (pVarS.v(context)) {
                componentNameStartService = sb.x.d(context, intent2);
            } else {
                componentNameStartService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i = 404;
            } else {
                i = -1;
            }
        } catch (IllegalStateException e7) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e7);
            i = 402;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            i = 401;
        }
        return Integer.valueOf(i);
    }

    private final Object b() {
        vb.b bVar = (vb.b) this.f6816b;
        t1.r rVar = (t1.r) this.f6817c;
        wb.l lVar = bVar.i;
        synchronized (lVar.f14012b) {
            SharedPreferences.Editor editorEdit = lVar.f14011a.edit();
            rVar.getClass();
            editorEdit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", rVar.f12092a).commit();
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6815a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f6816b;
                String str = (String) this.f6817c;
                if (!lottieAnimationView.H) {
                    return n.b(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = n.f6869a;
                return n.b(context, str, "asset_" + str);
            case 1:
                return a();
            case 2:
                return b();
            default:
                wb.c cVar = (wb.c) this.f6816b;
                wb.e eVar = (wb.e) this.f6817c;
                wb.m mVar = cVar.f13960b;
                synchronized (mVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = mVar.f14016a.openFileOutput(mVar.f14017b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(eVar.f13968a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
        }
    }
}
