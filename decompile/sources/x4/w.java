package x4;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public mf.e f14661a;

    /* renamed from: b, reason: collision with root package name */
    public le.h f14662b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f14663c;

    /* renamed from: d, reason: collision with root package name */
    public i.o f14664d;

    /* renamed from: e, reason: collision with root package name */
    public s f14665e;

    /* renamed from: f, reason: collision with root package name */
    public i f14666f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14668h;

    /* renamed from: g, reason: collision with root package name */
    public final y1.c f14667g = new y1.c(new d.m0(0, this, w.class, "onClosed", "onClosed()V", 0, 2));

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f14669i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public boolean f14670k = true;

    public final void a() {
        boolean z10;
        if (!this.f14668h) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
            } else {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public final void b() {
        if (n() && !o() && this.f14669i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        h5.b G = k().G();
        if (!G.U()) {
            android.support.v4.media.session.b.q(new h(j(), null, 2));
        }
        if (G.W()) {
            G.C();
        } else {
            G.e();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ie.w.w(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(cf.m.r((bf.d) entry.getKey()), entry.getValue());
        }
        return ie.r.f6846x;
    }

    public abstract i e();

    public e1.g f() {
        throw new he.h();
    }

    public h5.d g(a config) {
        kotlin.jvm.internal.k.e(config, "config");
        throw new he.h();
    }

    public final void h() {
        k().G().J();
        if (!o()) {
            i j = j();
            j.f14579b.e(j.f14582e, j.f14583f);
        }
    }

    public final gf.c0 i() {
        mf.e eVar = this.f14661a;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.k.k("coroutineScope");
        throw null;
    }

    public final i j() {
        i iVar = this.f14666f;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.k.k("internalTracker");
        throw null;
    }

    public final h5.d k() {
        s sVar = this.f14665e;
        if (sVar != null) {
            h5.d c10 = sVar.c();
            if (c10 != null) {
                return c10;
            }
            throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        }
        kotlin.jvm.internal.k.k("connectionManager");
        throw null;
    }

    public Set l() {
        return ie.j.c0(new ArrayList(ie.l.x(ie.t.f6848x, 10)));
    }

    public LinkedHashMap m() {
        int w10 = ie.w.w(ie.l.x(ie.t.f6848x, 10));
        if (w10 < 16) {
            w10 = 16;
        }
        return new LinkedHashMap(w10);
    }

    public final boolean n() {
        s sVar = this.f14665e;
        if (sVar != null) {
            if (sVar.c() != null) {
                return true;
            }
            return false;
        }
        kotlin.jvm.internal.k.k("connectionManager");
        throw null;
    }

    public final boolean o() {
        if (q() && k().G().U()) {
            return true;
        }
        return false;
    }

    public final void p(g5.a connection) {
        kotlin.jvm.internal.k.e(connection, "connection");
        i j = j();
        p0 p0Var = j.f14579b;
        p0Var.getClass();
        g5.c d02 = connection.d0("PRAGMA query_only");
        try {
            d02.X();
            boolean z10 = d02.z();
            c9.a.c(d02, null);
            if (!z10) {
                a8.d.d(connection, "PRAGMA temp_store = MEMORY");
                a8.d.d(connection, "PRAGMA recursive_triggers = 1");
                a8.d.d(connection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (p0Var.f14623d) {
                    a8.d.d(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    a8.d.d(connection, df.u.F("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", HttpUrl.FRAGMENT_ENCODE_SET));
                }
                a2.c cVar = p0Var.f14627h;
                ReentrantLock reentrantLock = (ReentrantLock) cVar.f171y;
                reentrantLock.lock();
                try {
                    cVar.f170x = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (j.f14585h) {
            }
        } finally {
        }
    }

    public final boolean q() {
        s sVar = this.f14665e;
        if (sVar != null) {
            h5.b bVar = sVar.f14640g;
            if (bVar != null) {
                return bVar.isOpen();
            }
            return false;
        }
        kotlin.jvm.internal.k.k("connectionManager");
        throw null;
    }

    public final void r() {
        k().G().B();
    }

    public final Object s(boolean z10, ve.p pVar, ne.c cVar) {
        s sVar = this.f14665e;
        if (sVar != null) {
            return sVar.f14639f.V(z10, pVar, cVar);
        }
        kotlin.jvm.internal.k.k("connectionManager");
        throw null;
    }
}
