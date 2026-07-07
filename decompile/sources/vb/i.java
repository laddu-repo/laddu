package vb;

import android.app.Application;
import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import sb.p;
import wb.l;
import wb.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements yb.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Random f13579j = new Random();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f13580k = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f13583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fa.g f13584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nb.d f13585e;
    public final ga.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mb.b f13586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13587h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13581a = new HashMap();
    public final HashMap i = new HashMap();

    public i(Context context, ScheduledExecutorService scheduledExecutorService, fa.g gVar, nb.d dVar, ga.c cVar, mb.b bVar) {
        this.f13582b = context;
        this.f13583c = scheduledExecutorService;
        this.f13584d = gVar;
        this.f13585e = dVar;
        this.f = cVar;
        this.f13586g = bVar;
        gVar.a();
        this.f13587h = gVar.f5338c.f5350b;
        AtomicReference atomicReference = h.f13578a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = h.f13578a;
        if (atomicReference2.get() == null) {
            h hVar = new h();
            while (true) {
                if (atomicReference2.compareAndSet(null, hVar)) {
                    s7.c.b(application);
                    s7.c.f11507z.a(hVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        b8.h.d(scheduledExecutorService, new ab.e(3, this));
    }

    public final synchronized b a() throws Throwable {
        try {
            try {
                wb.c cVarC = c("fetch");
                wb.c cVarC2 = c("activate");
                wb.c cVarC3 = c("defaults");
                l lVar = new l(this.f13582b.getSharedPreferences("frc_" + this.f13587h + "_firebase_settings", 0));
                wb.h hVar = new wb.h(this.f13583c, cVarC2, cVarC3);
                fa.g gVar = this.f13584d;
                mb.b bVar = this.f13586g;
                gVar.a();
                ob.d dVar = gVar.f5337b.equals("[DEFAULT]") ? new ob.d(bVar) : null;
                if (dVar != null) {
                    hVar.a(new g(dVar));
                }
                p2.c cVar = new p2.c(19);
                cVar.f10196w = cVarC2;
                cVar.f10197x = cVarC3;
                ScheduledExecutorService scheduledExecutorService = this.f13583c;
                p pVar = new p(29, false);
                pVar.f11745z = Collections.newSetFromMap(new ConcurrentHashMap());
                pVar.f11742w = cVarC2;
                pVar.f11743x = cVar;
                pVar.f11744y = scheduledExecutorService;
                return b(this.f13584d, this.f13585e, this.f, this.f13583c, cVarC, cVarC2, cVarC3, d(cVarC, lVar), hVar, lVar, pVar);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized b b(fa.g gVar, nb.d dVar, ga.c cVar, Executor executor, wb.c cVar2, wb.c cVar3, wb.c cVar4, wb.g gVar2, wb.h hVar, l lVar, p pVar) {
        try {
            if (!this.f13581a.containsKey("firebase")) {
                Context context = this.f13582b;
                gVar.a();
                b bVar = new b(context, gVar.f5337b.equals("[DEFAULT]") ? cVar : null, executor, cVar2, cVar3, cVar4, gVar2, hVar, lVar, e(gVar, dVar, gVar2, cVar3, this.f13582b, lVar), pVar);
                cVar3.b();
                cVar4.b();
                cVar2.b();
                this.f13581a.put("firebase", bVar);
                f13580k.put("firebase", bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (b) this.f13581a.get("firebase");
    }

    public final wb.c c(String str) {
        m mVar;
        String str2 = "frc_" + this.f13587h + "_firebase_" + str + ".json";
        ScheduledExecutorService scheduledExecutorService = this.f13583c;
        Context context = this.f13582b;
        HashMap map = m.f14015c;
        synchronized (m.class) {
            try {
                HashMap map2 = m.f14015c;
                if (!map2.containsKey(str2)) {
                    map2.put(str2, new m(context, str2));
                }
                mVar = (m) map2.get(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return wb.c.d(scheduledExecutorService, mVar);
    }

    public final synchronized wb.g d(wb.c cVar, l lVar) {
        nb.d dVar;
        mb.b fVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        fa.g gVar;
        try {
            dVar = this.f13585e;
            fa.g gVar2 = this.f13584d;
            gVar2.a();
            fVar = gVar2.f5337b.equals("[DEFAULT]") ? this.f13586g : new ma.f(7);
            scheduledExecutorService = this.f13583c;
            random = f13579j;
            fa.g gVar3 = this.f13584d;
            gVar3.a();
            str = gVar3.f5338c.f5349a;
            gVar = this.f13584d;
            gVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new wb.g(dVar, fVar, scheduledExecutorService, random, cVar, new ConfigFetchHttpClient(this.f13582b, gVar.f5338c.f5350b, str, lVar.f14011a.getLong("fetch_timeout_in_seconds", 60L), lVar.f14011a.getLong("fetch_timeout_in_seconds", 60L)), lVar, this.i);
    }

    public final synchronized p2.c e(fa.g gVar, nb.d dVar, wb.g gVar2, wb.c cVar, Context context, l lVar) {
        return new p2.c(gVar, dVar, gVar2, cVar, context, lVar, this.f13583c);
    }
}
