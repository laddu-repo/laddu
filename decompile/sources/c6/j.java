package c6;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements f, Runnable, Comparable, w6.b {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final a6.h f2196c0 = new a6.h("glide_thread_priority_override", null, a6.h.f156e);
    public com.bumptech.glide.g C;
    public a6.f D;
    public com.bumptech.glide.h E;
    public s F;
    public int G;
    public int H;
    public l I;
    public a6.i J;
    public q K;
    public int L;
    public long M;
    public Object N;
    public a9.g O;
    public Supplier P;
    public Thread Q;
    public a6.f R;
    public a6.f S;
    public Object T;
    public com.bumptech.glide.load.data.d U;
    public volatile g V;
    public volatile boolean W;
    public volatile boolean X;
    public boolean Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f2197a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f2198b0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q7.h f2202y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s0.c f2203z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f2199v = new h();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f2200w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w6.e f2201x = new w6.e();
    public final a7.j A = new a7.j(10, false);
    public final ab.b B = new ab.b();

    public j(q7.h hVar, hd.a aVar) {
        this.f2202y = hVar;
        this.f2203z = aVar;
    }

    @Override // c6.f
    public final void a(a6.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        dVar.b();
        w wVar = new w("Fetching data failed", Collections.singletonList(exc));
        Class clsA = dVar.a();
        wVar.f2246w = fVar;
        wVar.f2247x = i;
        wVar.f2248y = clsA;
        this.f2200w.add(wVar);
        if (Thread.currentThread() != this.Q) {
            o(2);
        } else {
            q();
        }
    }

    @Override // c6.f
    public final void b(a6.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, int i, a6.f fVar2) {
        this.R = fVar;
        this.T = obj;
        this.U = dVar;
        this.f2198b0 = i;
        this.S = fVar2;
        this.Y = fVar != this.f2199v.a().get(0);
        if (Thread.currentThread() != this.Q) {
            o(3);
        } else {
            f();
        }
    }

    @Override // w6.b
    public final w6.e c() {
        return this.f2201x;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int iOrdinal = this.E.ordinal() - jVar.E.ordinal();
        return iOrdinal == 0 ? this.L - jVar.L : iOrdinal;
    }

    public final b0 d(com.bumptech.glide.load.data.d dVar, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i10 = v6.h.f13224b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            b0 b0VarE = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i(jElapsedRealtimeNanos, "Decoded result " + b0VarE, null);
            }
            return b0VarE;
        } finally {
            dVar.b();
        }
    }

    public final b0 e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        h hVar = this.f2199v;
        z zVarC = hVar.c(cls);
        a6.i iVar = this.J;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z2 = i == 4 || hVar.f2192r;
            a6.h hVar2 = j6.p.i;
            Boolean bool = (Boolean) iVar.c(hVar2);
            if (bool == null || (bool.booleanValue() && !z2)) {
                iVar = new a6.i();
                v6.c cVar = this.J.f161b;
                v6.c cVar2 = iVar.f161b;
                cVar2.g(cVar);
                cVar2.put(hVar2, Boolean.valueOf(z2));
            }
        }
        a6.i iVar2 = iVar;
        com.bumptech.glide.load.data.f fVarH = this.C.b().h(obj);
        try {
            return zVarC.a(this.G, this.H, iVar2, new i(i, 0, this), fVarH);
        } finally {
            fVarH.b();
        }
    }

    public final void f() {
        b0 b0VarD;
        boolean zB;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            i(this.M, "Retrieved data", "data: " + this.T + ", cache key: " + this.R + ", fetcher: " + this.U);
        }
        a0 a0Var = null;
        if (((Map) this.O.f273w).containsKey(com.bumptech.glide.e.class) && (supplier = this.P) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.P.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e7) {
                this.P = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e7);
                }
            }
        }
        try {
            b0VarD = d(this.U, this.T, this.f2198b0);
        } catch (w e10) {
            a6.f fVar = this.S;
            int i = this.f2198b0;
            e10.f2246w = fVar;
            e10.f2247x = i;
            e10.f2248y = null;
            this.f2200w.add(e10);
            b0VarD = null;
        }
        if (b0VarD == null) {
            q();
            return;
        }
        int i10 = this.f2198b0;
        boolean z2 = this.Y;
        if (b0VarD instanceof x) {
            ((x) b0VarD).a();
        }
        if (((a0) this.A.f204y) != null) {
            a0Var = (a0) a0.f2142z.k();
            a0Var.f2146y = false;
            a0Var.f2145x = true;
            a0Var.f2144w = b0VarD;
            b0VarD = a0Var;
        }
        j(b0VarD, i10, z2);
        this.Z = 5;
        try {
            a7.j jVar = this.A;
            if (((a0) jVar.f204y) != null) {
                q7.h hVar = this.f2202y;
                a6.i iVar = this.J;
                jVar.getClass();
                try {
                    hVar.a().b((a6.f) jVar.f202w, new a7.j((a6.l) jVar.f203x, (a0) jVar.f204y, iVar, 9));
                    ((a0) jVar.f204y).a();
                } catch (Throwable th) {
                    ((a0) jVar.f204y).a();
                    throw th;
                }
            }
            ab.b bVar = this.B;
            synchronized (bVar) {
                bVar.f288b = true;
                zB = bVar.b();
            }
            if (zB) {
                n();
            }
        } finally {
            if (a0Var != null) {
                a0Var.a();
            }
        }
    }

    public final g g() {
        int iC = y.e.c(this.Z);
        h hVar = this.f2199v;
        if (iC == 1) {
            return new c0(hVar, this);
        }
        if (iC == 2) {
            return new d(hVar.a(), hVar, this);
        }
        if (iC == 3) {
            return new g0(hVar, this);
        }
        if (iC == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(j4.a.z(this.Z)));
    }

    public final int h(int i) {
        boolean z2;
        boolean z10;
        int iC = y.e.c(i);
        if (iC == 0) {
            switch (this.I.f2212a) {
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                case 1:
                    z2 = false;
                    break;
                default:
                    z2 = true;
                    break;
            }
            if (z2) {
                return 2;
            }
            return h(2);
        }
        if (iC != 1) {
            if (iC == 2) {
                return 4;
            }
            if (iC == 3 || iC == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(j4.a.z(i)));
        }
        switch (this.I.f2212a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                z10 = false;
                break;
            case 1:
            default:
                z10 = true;
                break;
        }
        if (z10) {
            return 3;
        }
        return h(3);
    }

    public final void i(long j8, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(v6.h.a(j8));
        sb2.append(", load key: ");
        sb2.append(this.F);
        sb2.append(str2 != null ? ", ".concat(str2) : "");
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    public final void j(b0 b0Var, int i, boolean z2) {
        if (((Map) this.O.f273w).containsKey(com.bumptech.glide.e.class)) {
            p();
        }
        s();
        q qVar = this.K;
        synchronized (qVar) {
            qVar.I = b0Var;
            qVar.J = i;
            qVar.Q = z2;
        }
        qVar.h();
    }

    public final void k() {
        if (((Map) this.O.f273w).containsKey(com.bumptech.glide.e.class)) {
            p();
        }
        s();
        w wVar = new w("Failed to load resource", new ArrayList(this.f2200w));
        q qVar = this.K;
        synchronized (qVar) {
            qVar.L = wVar;
        }
        qVar.g();
        l();
    }

    public final void l() {
        boolean zB;
        ab.b bVar = this.B;
        synchronized (bVar) {
            bVar.f289c = true;
            zB = bVar.b();
        }
        if (zB) {
            n();
        }
    }

    public final void m() {
        boolean zB;
        ab.b bVar = this.B;
        synchronized (bVar) {
            bVar.f287a = true;
            zB = bVar.b();
        }
        if (zB) {
            n();
        }
    }

    public final void n() {
        ab.b bVar = this.B;
        synchronized (bVar) {
            bVar.f288b = false;
            bVar.f287a = false;
            bVar.f289c = false;
        }
        a7.j jVar = this.A;
        jVar.f202w = null;
        jVar.f203x = null;
        jVar.f204y = null;
        h hVar = this.f2199v;
        hVar.f2179c = null;
        hVar.f2180d = null;
        hVar.f2188n = null;
        hVar.f2182g = null;
        hVar.f2185k = null;
        hVar.i = null;
        hVar.f2189o = null;
        hVar.f2184j = null;
        hVar.f2190p = null;
        hVar.f2177a.clear();
        hVar.f2186l = false;
        hVar.f2178b.clear();
        hVar.f2187m = false;
        this.W = false;
        this.C = null;
        this.D = null;
        this.J = null;
        this.E = null;
        this.F = null;
        this.K = null;
        this.Z = 0;
        this.V = null;
        this.Q = null;
        this.R = null;
        this.T = null;
        this.f2198b0 = 0;
        this.U = null;
        this.M = 0L;
        this.X = false;
        this.N = null;
        this.f2200w.clear();
        this.f2203z.e(this);
    }

    public final void o(int i) {
        this.f2197a0 = i;
        q qVar = this.K;
        (qVar.H ? qVar.D : qVar.C).execute(this);
    }

    public final void p() {
        if (!((Map) this.O.f273w).containsKey(com.bumptech.glide.e.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.P;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e7) {
            this.P = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e7);
            }
        }
    }

    public final void q() {
        this.Q = Thread.currentThread();
        int i = v6.h.f13224b;
        this.M = SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.X && this.V != null && !(zC = this.V.c())) {
            this.Z = h(this.Z);
            this.V = g();
            if (this.Z == 4) {
                o(2);
                return;
            }
        }
        if ((this.Z == 6 || this.X) && !zC) {
            k();
        }
    }

    public final void r() {
        int iC = y.e.c(this.f2197a0);
        if (iC == 0) {
            this.Z = h(1);
            this.V = g();
            q();
        } else if (iC == 1) {
            q();
        } else if (iC == 2) {
            f();
        } else {
            int i = this.f2197a0;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d dVar = this.U;
        try {
            try {
                if (this.X) {
                    k();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                r();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (c e7) {
                throw e7;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.X + ", stage: " + j4.a.z(this.Z), th);
                }
                if (this.Z != 5) {
                    this.f2200w.add(th);
                    k();
                }
                if (!this.X) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            throw th2;
        }
    }

    public final void s() {
        Throwable th;
        this.f2201x.a();
        if (!this.W) {
            this.W = true;
            return;
        }
        if (this.f2200w.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f2200w;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }
}
