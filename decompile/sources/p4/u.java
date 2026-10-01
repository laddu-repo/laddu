package p4;

import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public re.c f10355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f10356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h.o f10357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0.e f10358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f10359e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10360g;
    public final hd.a f = new hd.a(new t(0, this, u.class, "onClosed", "onClosed()V", 0, 0));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ThreadLocal f10361h = new ThreadLocal();
    public final LinkedHashMap i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10362j = true;

    public final void a() {
        if (this.f10360g) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!m() || n()) {
            return;
        }
        sd.h hVar = (sd.h) this.f10361h.get();
        if ((hVar != null ? (b0) hVar.A(b0.f10286w) : null) != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        w4.a aVarE0 = j().e0();
        if (!aVarE0.f()) {
            com.bumptech.glide.e.q(new cb.c(i(), null, 2));
        }
        if (aVarE0.L()) {
            aVarE0.T();
        } else {
            aVarE0.k();
        }
    }

    public abstract g d();

    public androidx.emoji2.text.h e() {
        throw new od.e(0);
    }

    public w4.c f(a aVar) {
        de.i.e(aVar, "config");
        throw new od.e(0);
    }

    public final void g() {
        j().e0().j();
        if (n()) {
            return;
        }
        g gVarI = i();
        gVarI.f10301b.e(gVarI.f10304e, gVarI.f);
    }

    public List h(LinkedHashMap linkedHashMap) {
        return pd.p.f10551v;
    }

    public final g i() {
        g gVar = this.f10359e;
        if (gVar != null) {
            return gVar;
        }
        de.i.i("internalTracker");
        throw null;
    }

    public final w4.c j() {
        b0.e eVar = this.f10358d;
        if (eVar == null) {
            de.i.i("connectionManager");
            throw null;
        }
        w4.c cVar = (w4.c) eVar.f1453g;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set k() {
        return pd.r.f10553v;
    }

    public Map l() {
        return pd.q.f10552v;
    }

    public final boolean m() {
        b0.e eVar = this.f10358d;
        if (eVar != null) {
            return ((w4.c) eVar.f1453g) != null;
        }
        de.i.i("connectionManager");
        throw null;
    }

    public final boolean n() {
        return p() && j().e0().f();
    }

    public final void o(v4.a aVar) throws Exception {
        de.i.e(aVar, "connection");
        g gVarI = i();
        l0 l0Var = gVarI.f10301b;
        l0Var.getClass();
        v4.c cVarJ0 = aVar.j0("PRAGMA query_only");
        try {
            cVarJ0.Z();
            boolean zP = cVarJ0.P();
            b8.h.h(cVarJ0, null);
            if (!zP) {
                v.x(aVar, "PRAGMA temp_store = MEMORY");
                v.x(aVar, "PRAGMA recursive_triggers = 1");
                v.x(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (l0Var.f10328c) {
                    v.x(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    v.x(aVar, ke.p.z("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                k kVar = l0Var.f10331g;
                ReentrantLock reentrantLock = kVar.f10319a;
                reentrantLock.lock();
                try {
                    kVar.f10322d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (gVarI.f10305g) {
            }
        } finally {
        }
    }

    public final boolean p() {
        b0.e eVar = this.f10358d;
        if (eVar == null) {
            de.i.i("connectionManager");
            throw null;
        }
        w4.a aVar = (w4.a) eVar.f1454h;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }
}
