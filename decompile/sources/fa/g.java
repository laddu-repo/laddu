package fa;

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
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ma.n;
import t7.k;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f5334k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v.e f5335l = new v.e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f5338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ma.g f5339d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f5341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mb.b f5342h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5340e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f5343j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    public g(Context context, String str, j jVar) {
        ?? arrayList;
        int i = 0;
        this.f5336a = context;
        y.d(str);
        this.f5337b = str;
        this.f5338c = jVar;
        a aVar = FirebaseInitProvider.f3621v;
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
        while (it.hasNext()) {
            arrayList2.add(new ma.d(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        na.j jVar2 = na.j.f9066v;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new ma.d(1 == true ? 1 : 0, new FirebaseCommonRegistrar()));
        arrayList3.add(new ma.d(1 == true ? 1 : 0, new ExecutorsRegistrar()));
        arrayList4.add(ma.b.c(context, Context.class, new Class[0]));
        arrayList4.add(ma.b.c(this, g.class, new Class[0]));
        arrayList4.add(ma.b.c(jVar, j.class, new Class[0]));
        k kVar = new k(11);
        if ((Build.VERSION.SDK_INT >= 24 ? p0.d.f(context) : true) && FirebaseInitProvider.f3622w.get()) {
            arrayList4.add(ma.b.c(aVar, a.class, new Class[0]));
        }
        ma.g gVar = new ma.g(arrayList3, arrayList4, kVar);
        this.f5339d = gVar;
        Trace.endSection();
        this.f5341g = new n(new c(i, this, context));
        this.f5342h = gVar.e(kb.d.class);
        d dVar = new d(this);
        a();
        if (this.f5340e.get()) {
            s7.c.f11507z.f11508v.get();
        }
        this.i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f5334k) {
            try {
                gVar = (g) f5335l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + x7.b.b() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((kb.d) gVar.f5342h.get()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f5334k) {
            try {
                if (f5335l.containsKey("[DEFAULT]")) {
                    return c();
                }
                j jVarA = j.a(context);
                if (jVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, jVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g g(Context context, j jVar) {
        g gVar;
        AtomicReference atomicReference = e.f5331a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f5331a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        s7.c.b(application);
                        s7.c.f11507z.a(eVar);
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
        synchronized (f5334k) {
            v.e eVar2 = f5335l;
            y.i("FirebaseApp name [DEFAULT] already exists!", !eVar2.containsKey("[DEFAULT]"));
            y.h(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", jVar);
            eVar2.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        y.i("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f5339d.b(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f5337b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f5338c.f5350b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void e() {
        HashMap map;
        if (!(Build.VERSION.SDK_INT >= 24 ? p0.d.f(this.f5336a) : true)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f5337b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f5336a;
            AtomicReference atomicReference = f.f5332b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f5337b);
        Log.i("FirebaseApp", sb3.toString());
        ma.g gVar = this.f5339d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f5337b);
        AtomicReference atomicReference2 = gVar.A;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (gVar) {
                    map = new HashMap(gVar.f8541v);
                }
                gVar.a(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((kb.d) this.f5342h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f5337b.equals(gVar.f5337b);
    }

    public final boolean h() {
        boolean z2;
        a();
        rb.a aVar = (rb.a) this.f5341g.get();
        synchronized (aVar) {
            z2 = aVar.f11357a;
        }
        return z2;
    }

    public final int hashCode() {
        return this.f5337b.hashCode();
    }

    public final String toString() {
        ob.d dVar = new ob.d(this);
        dVar.a(this.f5337b, "name");
        dVar.a(this.f5338c, "options");
        return dVar.toString();
    }
}
