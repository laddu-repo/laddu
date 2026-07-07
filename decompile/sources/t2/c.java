package t2;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import r1.e1;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f12513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12514b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f12515c;

    /* renamed from: d, reason: collision with root package name */
    public final r1.q[] f12516d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f12517e;

    /* renamed from: f, reason: collision with root package name */
    public int f12518f;

    public c(e1 e1Var, int[] iArr) {
        boolean z10;
        int i6 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        e1Var.getClass();
        this.f12513a = e1Var;
        int length = iArr.length;
        this.f12514b = length;
        this.f12516d = new r1.q[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f12516d[i10] = e1Var.f11389d[iArr[i10]];
        }
        Arrays.sort(this.f12516d, new d2.a(8));
        this.f12515c = new int[this.f12514b];
        while (true) {
            int i11 = this.f12514b;
            if (i6 < i11) {
                this.f12515c[i6] = e1Var.a(this.f12516d[i6]);
                i6++;
            } else {
                this.f12517e = new long[i11];
                return;
            }
        }
    }

    @Override // t2.s
    public final boolean a(int i6, long j) {
        if (this.f12517e[i6] > j) {
            return true;
        }
        return false;
    }

    @Override // t2.s
    public final e1 c() {
        return this.f12513a;
    }

    @Override // t2.s
    public final /* synthetic */ boolean e(long j, r2.e eVar, List list) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f12513a.equals(cVar.f12513a) && Arrays.equals(this.f12515c, cVar.f12515c)) {
                return true;
            }
        }
        return false;
    }

    @Override // t2.s
    public final int g(r1.q qVar) {
        for (int i6 = 0; i6 < this.f12514b; i6++) {
            if (this.f12516d[i6] == qVar) {
                return i6;
            }
        }
        return -1;
    }

    @Override // t2.s
    public final r1.q h(int i6) {
        return this.f12516d[i6];
    }

    public final int hashCode() {
        if (this.f12518f == 0) {
            this.f12518f = Arrays.hashCode(this.f12515c) + (System.identityHashCode(this.f12513a) * 31);
        }
        return this.f12518f;
    }

    @Override // t2.s
    public final int j(int i6) {
        return this.f12515c[i6];
    }

    @Override // t2.s
    public int k(long j, List list) {
        return list.size();
    }

    @Override // t2.s
    public final int length() {
        return this.f12515c.length;
    }

    @Override // t2.s
    public final int m() {
        return this.f12515c[d()];
    }

    @Override // t2.s
    public final r1.q n() {
        return this.f12516d[d()];
    }

    @Override // t2.s
    public final boolean p(int i6, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a10 = a(i6, elapsedRealtime);
        for (int i10 = 0; i10 < this.f12514b && !a10; i10++) {
            if (i10 != i6 && !a(i10, elapsedRealtime)) {
                a10 = true;
            } else {
                a10 = false;
            }
        }
        if (!a10) {
            return false;
        }
        long[] jArr = this.f12517e;
        long j10 = jArr[i6];
        String str = a0.f12750a;
        long j11 = elapsedRealtime + j;
        if (((j ^ j11) & (elapsedRealtime ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        jArr[i6] = Math.max(j10, j11);
        return true;
    }

    @Override // t2.s
    public final int u(int i6) {
        for (int i10 = 0; i10 < this.f12514b; i10++) {
            if (this.f12515c[i10] == i6) {
                return i10;
            }
        }
        return -1;
    }

    @Override // t2.s
    public void i() {
    }

    @Override // t2.s
    public void l() {
    }

    @Override // t2.s
    public final /* synthetic */ void s() {
    }

    @Override // t2.s
    public final /* synthetic */ void t() {
    }

    @Override // t2.s
    public final void f(boolean z10) {
    }

    @Override // t2.s
    public void q(float f3) {
    }
}
