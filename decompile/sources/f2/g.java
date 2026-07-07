package f2;

import a2.c0;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.j5;
import db.c1;
import db.i0;
import db.p0;
import db.q1;
import j4.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import o5.e0;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements o {
    public final HashMap A;
    public final boolean B;
    public final int[] C;
    public final boolean D;
    public final b0 E;
    public final e0 F;
    public final lc.c G;
    public final long H;
    public final ArrayList I;
    public final Set J;
    public final Set K;
    public int L;
    public t M;
    public d N;
    public d O;
    public Looper P;
    public Handler Q;
    public byte[] R;
    public b2.m S;
    public volatile c T;

    /* renamed from: x, reason: collision with root package name */
    public final UUID f4666x;

    /* renamed from: y, reason: collision with root package name */
    public final com.unity3d.ads.adplayer.b f4667y;

    /* renamed from: z, reason: collision with root package name */
    public final y f4668z;

    public g(UUID uuid, y yVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, e0 e0Var) {
        uuid.getClass();
        u1.c.a("Use C.CLEARKEY_UUID instead", !r1.g.f11400b.equals(uuid));
        this.f4666x = uuid;
        this.f4667y = w.A;
        this.f4668z = yVar;
        this.A = hashMap;
        this.B = z10;
        this.C = iArr;
        this.D = z11;
        this.F = e0Var;
        this.E = new b0(18);
        this.G = new lc.c(this);
        this.I = new ArrayList();
        this.J = Collections.newSetFromMap(new IdentityHashMap());
        this.K = Collections.newSetFromMap(new IdentityHashMap());
        this.H = 300000L;
    }

    public static boolean d(d dVar) {
        dVar.n();
        if (dVar.f4654o == 1) {
            h error = dVar.getError();
            error.getClass();
            Throwable cause = error.getCause();
            if ((cause instanceof ResourceBusyException) || j5.o(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList h(r1.m mVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(mVar.A);
        for (int i6 = 0; i6 < mVar.A; i6++) {
            r1.l lVar = mVar.f11583x[i6];
            if ((lVar.a(uuid) || (r1.g.f11401c.equals(uuid) && lVar.a(r1.g.f11400b))) && (lVar.B != null || z10)) {
                arrayList.add(lVar);
            }
        }
        return arrayList;
    }

    @Override // f2.o
    public final void a() {
        k(true);
        int i6 = this.L - 1;
        this.L = i6;
        if (i6 != 0) {
            return;
        }
        if (this.H != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.I);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).d(null);
            }
        }
        q1 it = p0.k(this.J).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
        i();
    }

    public final i b(Looper looper, l lVar, r1.q qVar, boolean z10) {
        ArrayList arrayList;
        if (this.T == null) {
            this.T = new c(this, looper, 1);
        }
        r1.m mVar = qVar.f11674r;
        int i6 = 0;
        d dVar = null;
        if (mVar == null) {
            int i10 = k0.i(qVar.f11670n);
            t tVar = this.M;
            tVar.getClass();
            if (tVar.p() != 2 || !u.f4684c) {
                int[] iArr = this.C;
                while (true) {
                    if (i6 < iArr.length) {
                        if (iArr[i6] == i10) {
                            break;
                        }
                        i6++;
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                if (i6 != -1 && tVar.p() != 1) {
                    d dVar2 = this.N;
                    if (dVar2 == null) {
                        i0 i0Var = db.k0.f4008y;
                        d f3 = f(c1.B, true, null, z10);
                        this.I.add(f3);
                        this.N = f3;
                    } else {
                        dVar2.c(null);
                    }
                    return this.N;
                }
            }
            return null;
        }
        if (this.R == null) {
            arrayList = h(mVar, this.f4666x, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f4666x);
                u1.a.h("DefaultDrmSessionMgr", "DRM error", exc);
                if (lVar != null) {
                    lVar.d(exc);
                }
                return new q(new h(exc, 6003));
            }
        } else {
            arrayList = null;
        }
        if (!this.B) {
            dVar = this.O;
        } else {
            ArrayList arrayList2 = this.I;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i11);
                i11++;
                d dVar3 = (d) obj;
                if (Objects.equals(dVar3.f4641a, arrayList)) {
                    dVar = dVar3;
                    break;
                }
            }
        }
        if (dVar == null) {
            d f10 = f(arrayList, false, lVar, z10);
            if (!this.B) {
                this.O = f10;
            }
            this.I.add(f10);
            return f10;
        }
        dVar.c(lVar);
        return dVar;
    }

    @Override // f2.o
    public final void c() {
        t dVar;
        k(true);
        int i6 = this.L;
        this.L = i6 + 1;
        if (i6 == 0) {
            if (this.M == null) {
                UUID uuid = this.f4666x;
                this.f4667y.getClass();
                try {
                    try {
                        dVar = new w(uuid);
                    } catch (UnsupportedSchemeException e10) {
                        throw new Exception(e10);
                    } catch (Exception e11) {
                        throw new Exception(e11);
                    }
                } catch (a0 unused) {
                    u1.a.g("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    dVar = new zb.d(11);
                }
                this.M = dVar;
                dVar.d(new k7.d(this, 7));
                return;
            }
            if (this.H != -9223372036854775807L) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.I;
                    if (i10 < arrayList.size()) {
                        ((d) arrayList.get(i10)).c(null);
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final d e(List list, boolean z10, l lVar) {
        this.M.getClass();
        boolean z11 = this.D | z10;
        t tVar = this.M;
        byte[] bArr = this.R;
        Looper looper = this.P;
        looper.getClass();
        b2.m mVar = this.S;
        mVar.getClass();
        d dVar = new d(this.f4666x, tVar, this.E, this.G, list, z11, z10, bArr, this.A, this.f4668z, looper, this.F, mVar);
        dVar.c(lVar);
        if (this.H != -9223372036854775807L) {
            dVar.c(null);
        }
        return dVar;
    }

    public final d f(List list, boolean z10, l lVar, boolean z11) {
        d e10 = e(list, z10, lVar);
        boolean d10 = d(e10);
        long j = this.H;
        Set set = this.K;
        if (d10 && !set.isEmpty()) {
            q1 it = p0.k(set).iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(null);
            }
            e10.d(lVar);
            if (j != -9223372036854775807L) {
                e10.d(null);
            }
            e10 = e(list, z10, lVar);
        }
        if (d(e10) && z11) {
            Set set2 = this.J;
            if (!set2.isEmpty()) {
                q1 it2 = p0.k(set2).iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    q1 it3 = p0.k(set).iterator();
                    while (it3.hasNext()) {
                        ((i) it3.next()).d(null);
                    }
                }
                e10.d(lVar);
                if (j != -9223372036854775807L) {
                    e10.d(null);
                }
                return e(list, z10, lVar);
            }
        }
        return e10;
    }

    @Override // f2.o
    public final i g(l lVar, r1.q qVar) {
        boolean z10 = false;
        k(false);
        if (this.L > 0) {
            z10 = true;
        }
        u1.c.g(z10);
        u1.c.h(this.P);
        return b(this.P, lVar, qVar, true);
    }

    public final void i() {
        if (this.M != null && this.L == 0 && this.I.isEmpty() && this.J.isEmpty()) {
            t tVar = this.M;
            tVar.getClass();
            tVar.a();
            this.M = null;
        }
    }

    @Override // f2.o
    public final n j(l lVar, r1.q qVar) {
        boolean z10;
        if (this.L > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        u1.c.h(this.P);
        f fVar = new f(this, lVar);
        Handler handler = this.Q;
        handler.getClass();
        handler.post(new c0(15, fVar, qVar));
        return fVar;
    }

    public final void k(boolean z10) {
        if (z10 && this.P == null) {
            u1.a.q("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.P;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            u1.a.q("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.P.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // f2.o
    public final int l(r1.q qVar) {
        k(false);
        t tVar = this.M;
        tVar.getClass();
        int p10 = tVar.p();
        r1.m mVar = qVar.f11674r;
        if (mVar == null) {
            int i6 = k0.i(qVar.f11670n);
            int i10 = 0;
            while (true) {
                int[] iArr = this.C;
                if (i10 < iArr.length) {
                    if (iArr[i10] == i6) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                return 0;
            }
        } else if (this.R == null) {
            UUID uuid = this.f4666x;
            if (h(mVar, uuid, true).isEmpty()) {
                if (mVar.A == 1 && mVar.f11583x[0].a(r1.g.f11400b)) {
                    u1.a.p("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = mVar.f11585z;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return p10;
    }

    @Override // f2.o
    public final void n(Looper looper, b2.m mVar) {
        boolean z10;
        synchronized (this) {
            try {
                Looper looper2 = this.P;
                if (looper2 == null) {
                    this.P = looper;
                    this.Q = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.g(z10);
                    this.Q.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.S = mVar;
    }
}
