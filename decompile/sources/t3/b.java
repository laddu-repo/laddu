package t3;

import u1.a0;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements g {
    public final i A;
    public int B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: x, reason: collision with root package name */
    public final f f12568x;

    /* renamed from: y, reason: collision with root package name */
    public final long f12569y;

    /* renamed from: z, reason: collision with root package name */
    public final long f12570z;

    public b(i iVar, long j, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j >= 0 && j10 > j) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.b(z11);
        this.A = iVar;
        this.f12569y = j;
        this.f12570z = j10;
        if (j11 != j10 - j && !z10) {
            this.B = 0;
        } else {
            this.C = j12;
            this.B = 4;
        }
        this.f12568x = new f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    @Override // t3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j(y2.p r28) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.j(y2.p):long");
    }

    @Override // t3.g
    public final z k() {
        if (this.C != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // t3.g
    public final void q(long j) {
        this.E = a0.j(j, 0L, this.C - 1);
        this.B = 2;
        this.F = this.f12569y;
        this.G = this.f12570z;
        this.H = 0L;
        this.I = this.C;
    }
}
