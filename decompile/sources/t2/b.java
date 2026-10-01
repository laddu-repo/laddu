package t2;

import android.os.SystemClock;
import db.h0;
import db.k0;
import java.util.ArrayList;
import java.util.List;
import r1.e1;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public final u2.d f12500g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12501h;

    /* renamed from: i, reason: collision with root package name */
    public final long f12502i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12503k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12504l;

    /* renamed from: m, reason: collision with root package name */
    public final float f12505m;

    /* renamed from: n, reason: collision with root package name */
    public final float f12506n;

    /* renamed from: o, reason: collision with root package name */
    public final k0 f12507o;

    /* renamed from: p, reason: collision with root package name */
    public final u1.v f12508p;

    /* renamed from: q, reason: collision with root package name */
    public float f12509q;

    /* renamed from: r, reason: collision with root package name */
    public int f12510r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public long f12511t;

    /* renamed from: u, reason: collision with root package name */
    public r2.l f12512u;

    public b(e1 e1Var, int[] iArr, u2.d dVar, long j, long j10, long j11, k0 k0Var) {
        super(e1Var, iArr);
        if (j11 < j) {
            u1.a.p("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j;
        }
        this.f12500g = dVar;
        this.f12501h = j * 1000;
        this.f12502i = j10 * 1000;
        this.j = j11 * 1000;
        this.f12503k = 1279;
        this.f12504l = 719;
        this.f12505m = 0.7f;
        this.f12506n = 0.75f;
        this.f12507o = k0.k(k0Var);
        this.f12508p = u1.v.f12817a;
        this.f12509q = 1.0f;
        this.s = 0;
        this.f12511t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j10 : jArr) {
            j += j10;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            h0 h0Var = (h0) arrayList.get(i6);
            if (h0Var != null) {
                h0Var.a(new a(j, jArr[i6]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            r2.l lVar = (r2.l) db.r.l(list);
            long j = lVar.D;
            if (j != -9223372036854775807L) {
                long j10 = lVar.E;
                if (j10 != -9223372036854775807L) {
                    return j10 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // t2.s
    public final void b(long j, long j10, long j11, List list, r2.m[] mVarArr) {
        long x10;
        int g10;
        long j12;
        this.f12508p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i6 = this.f12510r;
        if (i6 < mVarArr.length && mVarArr[i6].next()) {
            r2.m mVar = mVarArr[this.f12510r];
            x10 = mVar.c() - mVar.a();
        } else {
            int length = mVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    r2.m mVar2 = mVarArr[i10];
                    if (mVar2.next()) {
                        x10 = mVar2.c() - mVar2.a();
                        break;
                    }
                    i10++;
                } else {
                    x10 = x(list);
                    break;
                }
            }
        }
        int i11 = this.s;
        if (i11 == 0) {
            this.s = 1;
            this.f12510r = w(elapsedRealtime);
            return;
        }
        int i12 = this.f12510r;
        if (list.isEmpty()) {
            g10 = -1;
        } else {
            g10 = g(((r2.l) db.r.l(list)).A);
        }
        if (g10 != -1) {
            i11 = ((r2.l) db.r.l(list)).B;
            i12 = g10;
        }
        int w10 = w(elapsedRealtime);
        if (w10 != i12 && !a(i12, elapsedRealtime)) {
            r1.q[] qVarArr = this.f12516d;
            r1.q qVar = qVarArr[i12];
            r1.q qVar2 = qVarArr[w10];
            long j13 = this.f12501h;
            if (j11 != -9223372036854775807L) {
                if (x10 != -9223372036854775807L) {
                    j12 = j11 - x10;
                } else {
                    j12 = j11;
                }
                j13 = Math.min(((float) j12) * this.f12506n, j13);
            }
            int i13 = qVar2.j;
            int i14 = qVar.j;
            if ((i13 > i14 && j10 < j13) || (i13 < i14 && j10 >= this.f12502i)) {
                w10 = i12;
            }
        }
        if (w10 != i12) {
            i11 = 3;
        }
        this.s = i11;
        this.f12510r = w10;
    }

    @Override // t2.s
    public final int d() {
        return this.f12510r;
    }

    @Override // t2.c, t2.s
    public final void i() {
        this.f12511t = -9223372036854775807L;
        this.f12512u = null;
    }

    @Override // t2.c, t2.s
    public final int k(long j, List list) {
        r2.l lVar;
        int i6;
        int i10;
        this.f12508p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f12511t;
        if (j10 != -9223372036854775807L && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((r2.l) db.r.l(list)).equals(this.f12512u))) {
            return list.size();
        }
        this.f12511t = elapsedRealtime;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (r2.l) db.r.l(list);
        }
        this.f12512u = lVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long D = a0.D(((r2.l) list.get(size - 1)).D - j, this.f12509q);
        long j11 = this.j;
        if (D >= j11) {
            x(list);
            r1.q qVar = this.f12516d[w(elapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                r2.l lVar2 = (r2.l) list.get(i11);
                r1.q qVar2 = lVar2.A;
                if (a0.D(lVar2.D - j, this.f12509q) >= j11 && qVar2.j < qVar.j && (i6 = qVar2.f11677v) != -1 && i6 <= this.f12504l && (i10 = qVar2.f11676u) != -1 && i10 <= this.f12503k && i6 < qVar.f11677v) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override // t2.c, t2.s
    public final void l() {
        this.f12512u = null;
    }

    @Override // t2.s
    public final int o() {
        return this.s;
    }

    @Override // t2.c, t2.s
    public final void q(float f3) {
        this.f12509q = f3;
    }

    @Override // t2.s
    public final Object r() {
        return null;
    }

    public final int w(long j) {
        long j10;
        u2.g gVar = (u2.g) this.f12500g;
        synchronized (gVar) {
            j10 = gVar.f12856l;
        }
        long j11 = ((float) j10) * this.f12505m;
        this.f12500g.getClass();
        long j12 = ((float) j11) / this.f12509q;
        if (!this.f12507o.isEmpty()) {
            int i6 = 1;
            while (i6 < this.f12507o.size() - 1 && ((a) this.f12507o.get(i6)).f12498a < j12) {
                i6++;
            }
            a aVar = (a) this.f12507o.get(i6 - 1);
            a aVar2 = (a) this.f12507o.get(i6);
            long j13 = aVar.f12498a;
            float f3 = ((float) (j12 - j13)) / ((float) (aVar2.f12498a - j13));
            j12 = aVar.f12499b + (f3 * ((float) (aVar2.f12499b - r1)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12514b; i11++) {
            if (j == Long.MIN_VALUE || !a(i11, j)) {
                if (this.f12516d[i11].j <= j12) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
