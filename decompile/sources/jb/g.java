package jb;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.unity3d.ads.metadata.MediationMetaData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rb.k;
import v.l;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final v.e f7330k = new l(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f7331a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7332b;

    /* renamed from: c, reason: collision with root package name */
    public final j f7333c;

    /* renamed from: d, reason: collision with root package name */
    public final qb.e f7334d;

    /* renamed from: g, reason: collision with root package name */
    public final qb.l f7337g;

    /* renamed from: h, reason: collision with root package name */
    public final bc.a f7338h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7335e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f7336f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f7339i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, p.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public g(Context context, String str, j jVar) {
        ?? arrayList;
        int i6 = 0;
        new CopyOnWriteArrayList();
        this.f7331a = context;
        x.d(str);
        this.f7332b = str;
        this.f7333c = jVar;
        a aVar = FirebaseInitProvider.f2851x;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            ?? r42 = 1;
            if (!it.hasNext()) {
                break;
            } else {
                arrayList2.add(new cc.b((String) it.next(), r42 == true ? 1 : 0));
            }
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f11948x;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i10 = 2;
        arrayList3.add(new cc.b(new FirebaseCommonRegistrar(), i10));
        arrayList3.add(new cc.b(new ExecutorsRegistrar(), i10));
        arrayList4.add(qb.b.c(context, Context.class, new Class[0]));
        arrayList4.add(qb.b.c(this, g.class, new Class[0]));
        arrayList4.add(qb.b.c(jVar, j.class, new Class[0]));
        ?? obj = new Object();
        if ((Build.VERSION.SDK_INT >= 24 ? p0.b.f(context) : true) && FirebaseInitProvider.f2852y.get()) {
            arrayList4.add(qb.b.c(aVar, a.class, new Class[0]));
        }
        qb.e eVar = new qb.e(arrayList3, arrayList4, obj);
        this.f7334d = eVar;
        Trace.endSection();
        this.f7337g = new qb.l(new c(i6, this, context));
        this.f7338h = eVar.c(zb.c.class);
        d dVar = new d(this);
        a();
        if (this.f7335e.get()) {
            v8.c.B.f13444x.get();
        }
        this.f7339i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (j) {
            try {
                gVar = (g) f7330k.get("[DEFAULT]");
                if (gVar != null) {
                    ((zb.c) gVar.f7338h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + a9.b.b() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (j) {
            try {
                if (f7330k.containsKey("[DEFAULT]")) {
                    return c();
                }
                j a10 = j.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [v8.b, java.lang.Object] */
    public static g g(Context context, j jVar) {
        g gVar;
        AtomicReference atomicReference = e.f7327a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f7327a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        v8.c.b(application);
                        v8.c.B.a(obj);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            v.e eVar = f7330k;
            x.i("FirebaseApp name [DEFAULT] already exists!", !eVar.containsKey("[DEFAULT]"));
            x.h(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", jVar);
            eVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        x.i("FirebaseApp was deleted", !this.f7336f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f7334d.a(cls);
    }

    public final String d() {
        String encodeToString;
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f7332b.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb2.append(encodeToString);
        sb2.append("+");
        a();
        byte[] bytes2 = this.f7333c.f7344b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        HashMap hashMap;
        Context context = this.f7331a;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = p0.b.f(context);
        } else {
            z10 = true;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f7332b);
            Log.i("FirebaseApp", sb2.toString());
            Context context2 = this.f7331a;
            AtomicReference atomicReference = f.f7328b;
            if (atomicReference.get() == null) {
                f fVar = new f(context2);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context2.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f7332b);
        Log.i("FirebaseApp", sb3.toString());
        qb.e eVar = this.f7334d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f7332b);
        AtomicReference atomicReference2 = eVar.C;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (eVar) {
                    hashMap = new HashMap(eVar.f11160x);
                }
                eVar.f(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((zb.c) this.f7338h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f7332b.equals(gVar.f7332b);
    }

    public final boolean h() {
        boolean z10;
        a();
        gc.a aVar = (gc.a) this.f7337g.get();
        synchronized (aVar) {
            z10 = aVar.f5605a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f7332b.hashCode();
    }

    public final String toString() {
        s8.l lVar = new s8.l(this);
        lVar.a(this.f7332b, MediationMetaData.KEY_NAME);
        lVar.a(this.f7333c, "options");
        return lVar.toString();
    }
}
