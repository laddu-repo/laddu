package b7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.internal.measurement.a4;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1516c;

    public /* synthetic */ d(int i6, Object obj, Object obj2) {
        this.f1514a = i6;
        this.f1515b = obj;
        this.f1516c = obj2;
    }

    private final Object a() {
        mc.d dVar = (mc.d) this.f1515b;
        mc.i iVar = (mc.i) this.f1516c;
        nc.o oVar = dVar.f8809i;
        synchronized (oVar.f9667b) {
            SharedPreferences.Editor edit = oVar.f9666a.edit();
            iVar.getClass();
            edit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", iVar.f8812a).commit();
        }
        return null;
    }

    private final Object b() {
        nc.e eVar = (nc.e) this.f1515b;
        nc.g gVar = (nc.g) this.f1516c;
        nc.p pVar = eVar.f9608b;
        synchronized (pVar) {
            FileOutputStream openFileOutput = pVar.f9671a.openFileOutput(pVar.f9672b, 0);
            try {
                openFileOutput.write(gVar.f9617a.toString().getBytes("UTF-8"));
            } finally {
                openFileOutput.close();
            }
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        ComponentName startService;
        String str2 = null;
        int i6 = 0;
        int i10 = -1;
        switch (this.f1514a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f1515b;
                String str3 = (String) this.f1516c;
                if (lottieAnimationView.J) {
                    Context context = lottieAnimationView.getContext();
                    HashMap hashMap = o.f1570a;
                    return o.b(str3, "asset_" + str3, context);
                }
                return o.b(str3, null, lottieAnimationView.getContext());
            case 1:
                return AndroidDiagnosticEventRepository.a((AndroidDiagnosticEventRepository) this.f1515b, (List) this.f1516c);
            case 2:
                Context context2 = (Context) this.f1515b;
                Intent intent = (Intent) this.f1516c;
                ic.s k8 = ic.s.k();
                k8.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) k8.A).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context2.getPackageName());
                synchronized (k8) {
                    try {
                        String str4 = (String) k8.f6781x;
                        if (str4 != null) {
                            str2 = str4;
                        } else {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(".")) {
                                        k8.f6781x = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        k8.f6781x = serviceInfo.name;
                                    }
                                    str2 = (String) k8.f6781x;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context2.getPackageName(), str2);
                }
                try {
                    if (k8.r(context2)) {
                        startService = ic.c0.d(context2, intent2);
                    } else {
                        startService = context2.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            case 3:
                return a();
            case 4:
                return b();
            case 5:
                w1.i iVar = (w1.i) this.f1515b;
                byte[] bArr = (byte[]) this.f1516c;
                return a4.f(bArr, bArr.length, iVar.f13536c);
            default:
                w1.i iVar2 = (w1.i) this.f1515b;
                Uri uri = (Uri) this.f1516c;
                w1.h c10 = iVar2.f13535b.c();
                int i11 = iVar2.f13536c;
                try {
                    w1.l lVar = new w1.l(uri);
                    w1.m mVar = (w1.m) c10;
                    mVar.y(lVar);
                    byte[] bArr2 = new byte[1024];
                    int i12 = 0;
                    while (i6 != -1) {
                        if (i12 == bArr2.length) {
                            bArr2 = Arrays.copyOf(bArr2, bArr2.length * 2);
                        }
                        i6 = mVar.read(bArr2, i12, bArr2.length - i12);
                        if (i6 != -1) {
                            i12 += i6;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, i12);
                    Bitmap f3 = a4.f(copyOf, copyOf.length, i11);
                    mVar.close();
                    return f3;
                } catch (Throwable th) {
                    ((w1.m) c10).close();
                    throw th;
                }
        }
    }
}
