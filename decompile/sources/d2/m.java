package d2;

import j1.f0;
import j4.b0;
import q2.z0;
import r1.q;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements z0 {
    public boolean A;
    public e2.g B;
    public boolean C;
    public int D;

    /* renamed from: x, reason: collision with root package name */
    public final q f3754x;

    /* renamed from: z, reason: collision with root package name */
    public long[] f3756z;

    /* renamed from: y, reason: collision with root package name */
    public final f0 f3755y = new f0(3);
    public long E = -9223372036854775807L;

    public m(e2.g gVar, q qVar, boolean z10) {
        this.f3754x = qVar;
        this.B = gVar;
        this.f3756z = gVar.f4241b;
        a(gVar, z10);
    }

    public final void a(e2.g gVar, boolean z10) {
        long j;
        int i6 = this.D;
        long j10 = -9223372036854775807L;
        if (i6 == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.f3756z[i6 - 1];
        }
        this.A = z10;
        this.B = gVar;
        long[] jArr = gVar.f4241b;
        this.f3756z = jArr;
        long j11 = this.E;
        if (j11 != -9223372036854775807L) {
            int a10 = a0.a(jArr, j11, true);
            this.D = a10;
            if (this.A && a10 == this.f3756z.length) {
                j10 = j11;
            }
            this.E = j10;
            return;
        }
        if (j != -9223372036854775807L) {
            this.D = a0.a(jArr, j, false);
        }
    }

    @Override // q2.z0
    public final boolean isReady() {
        return true;
    }

    @Override // q2.z0
    public final int j(long j) {
        int max = Math.max(this.D, a0.a(this.f3756z, j, true));
        int i6 = max - this.D;
        this.D = max;
        return i6;
    }

    @Override // q2.z0
    public final int n(b0 b0Var, y1.h hVar, int i6) {
        boolean z10;
        int i10 = this.D;
        if (i10 == this.f3756z.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.A) {
            hVar.setFlags(4);
            return -4;
        }
        if ((i6 & 2) == 0 && this.C) {
            if (z10) {
                return -3;
            }
            if ((i6 & 1) == 0) {
                this.D = i10 + 1;
            }
            if ((i6 & 4) == 0) {
                byte[] R = this.f3755y.R(this.B.f4240a[i10]);
                hVar.b(R.length);
                hVar.f14812z.put(R);
            }
            hVar.B = this.f3756z[i10];
            hVar.setFlags(1);
            return -4;
        }
        b0Var.f7159y = this.f3754x;
        this.C = true;
        return -5;
    }

    @Override // q2.z0
    public final void b() {
    }
}
