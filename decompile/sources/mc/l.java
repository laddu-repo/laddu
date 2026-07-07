package mc;

import android.app.Application;
import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import j1.f0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import nc.o;
import nc.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements pc.a {
    public static final Random j = new Random();

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f8815k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f8817b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f8818c;

    /* renamed from: d, reason: collision with root package name */
    public final jb.g f8819d;

    /* renamed from: e, reason: collision with root package name */
    public final cc.e f8820e;

    /* renamed from: f, reason: collision with root package name */
    public final kb.c f8821f;

    /* renamed from: g, reason: collision with root package name */
    public final bc.a f8822g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8823h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8816a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f8824i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [v8.b, java.lang.Object] */
    public l(Context context, ScheduledExecutorService scheduledExecutorService, jb.g gVar, cc.e eVar, kb.c cVar, bc.a aVar) {
        this.f8817b = context;
        this.f8818c = scheduledExecutorService;
        this.f8819d = gVar;
        this.f8820e = eVar;
        this.f8821f = cVar;
        this.f8822g = aVar;
        gVar.a();
        this.f8823h = gVar.f7333c.f7344b;
        AtomicReference atomicReference = k.f8814a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = k.f8814a;
        if (atomicReference2.get() == null) {
            ?? obj = new Object();
            while (true) {
                if (atomicReference2.compareAndSet(null, obj)) {
                    v8.c.b(application);
                    v8.c.B.a(obj);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        dg.b.c(scheduledExecutorService, new b7.l(this, 1));
    }

    public final synchronized d a(jb.g gVar, cc.e eVar, kb.c cVar, Executor executor, nc.e eVar2, nc.e eVar3, nc.e eVar4, nc.j jVar, nc.k kVar, o oVar, n9.j jVar2) {
        kb.c cVar2;
        try {
            if (!this.f8816a.containsKey("firebase")) {
                Context context = this.f8817b;
                gVar.a();
                if (gVar.f7332b.equals("[DEFAULT]")) {
                    cVar2 = cVar;
                } else {
                    cVar2 = null;
                }
                d dVar = new d(context, cVar2, executor, eVar2, eVar3, eVar4, jVar, kVar, oVar, e(gVar, eVar, jVar, eVar3, this.f8817b, oVar), jVar2);
                eVar3.b();
                eVar4.b();
                eVar2.b();
                this.f8816a.put("firebase", dVar);
                f8815k.put("firebase", dVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (d) this.f8816a.get("firebase");
    }

    public final nc.e b(String str) {
        p pVar;
        String str2 = "frc_" + this.f8823h + "_firebase_" + str + ".json";
        ScheduledExecutorService scheduledExecutorService = this.f8818c;
        Context context = this.f8817b;
        HashMap hashMap = p.f9670c;
        synchronized (p.class) {
            try {
                HashMap hashMap2 = p.f9670c;
                if (!hashMap2.containsKey(str2)) {
                    hashMap2.put(str2, new p(context, str2));
                }
                pVar = (p) hashMap2.get(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return nc.e.d(scheduledExecutorService, pVar);
    }

    public final d c() {
        f0 f0Var;
        synchronized (this) {
            try {
                try {
                    nc.e b10 = b("fetch");
                    nc.e b11 = b("activate");
                    nc.e b12 = b("defaults");
                    o oVar = new o(this.f8817b.getSharedPreferences("frc_" + this.f8823h + "_firebase_settings", 0));
                    nc.k kVar = new nc.k(this.f8818c, b11, b12);
                    jb.g gVar = this.f8819d;
                    bc.a aVar = this.f8822g;
                    gVar.a();
                    if (gVar.f7332b.equals("[DEFAULT]")) {
                        f0Var = new f0(aVar);
                    } else {
                        f0Var = null;
                    }
                    if (f0Var != null) {
                        kVar.a(new j(f0Var));
                    }
                    f0 f0Var2 = new f0(23);
                    f0Var2.f6907y = b11;
                    f0Var2.f6908z = b12;
                    ScheduledExecutorService scheduledExecutorService = this.f8818c;
                    n9.j jVar = new n9.j(5);
                    jVar.A = Collections.newSetFromMap(new ConcurrentHashMap());
                    jVar.f9355y = f0Var2;
                    jVar.f9356z = scheduledExecutorService;
                    return a(this.f8819d, this.f8820e, this.f8821f, this.f8818c, b10, b11, b12, d(b10, oVar), kVar, oVar, jVar);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final synchronized nc.j d(nc.e eVar, o oVar) {
        cc.e eVar2;
        bc.a jVar;
        bc.a aVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        jb.g gVar;
        try {
            eVar2 = this.f8820e;
            jb.g gVar2 = this.f8819d;
            gVar2.a();
            if (gVar2.f7332b.equals("[DEFAULT]")) {
                jVar = this.f8822g;
            } else {
                jVar = new ic.j(1);
            }
            aVar = jVar;
            scheduledExecutorService = this.f8818c;
            random = j;
            jb.g gVar3 = this.f8819d;
            gVar3.a();
            str = gVar3.f7333c.f7343a;
            gVar = this.f8819d;
            gVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new nc.j(eVar2, aVar, scheduledExecutorService, random, eVar, new ConfigFetchHttpClient(this.f8817b, gVar.f7333c.f7344b, str, oVar.f9666a.getLong("fetch_timeout_in_seconds", 60L), oVar.f9666a.getLong("fetch_timeout_in_seconds", 60L)), oVar, this.f8824i);
    }

    public final synchronized f0 e(jb.g gVar, cc.e eVar, nc.j jVar, nc.e eVar2, Context context, o oVar) {
        return new f0(gVar, eVar, jVar, eVar2, context, oVar, this.f8818c);
    }
}
