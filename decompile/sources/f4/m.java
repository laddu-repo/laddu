package f4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final y2.f0 f4844a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4845b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4846c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4847d;

    /* renamed from: e, reason: collision with root package name */
    public int f4848e;

    /* renamed from: f, reason: collision with root package name */
    public int f4849f;

    /* renamed from: g, reason: collision with root package name */
    public long f4850g;

    /* renamed from: h, reason: collision with root package name */
    public long f4851h;

    public m(y2.f0 f0Var) {
        this.f4844a = f0Var;
    }

    public final void a(byte[] bArr, int i6, int i10) {
        boolean z10;
        if (this.f4846c) {
            int i11 = this.f4849f;
            int i12 = (i6 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4847d = z10;
                this.f4846c = false;
                return;
            }
            this.f4849f = (i10 - i6) + i11;
        }
    }

    public final void b(int i6, long j, boolean z10) {
        boolean z11;
        if (this.f4851h != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.g(z11);
        if (this.f4848e == 182 && z10 && this.f4845b) {
            int i10 = (int) (j - this.f4850g);
            boolean z12 = this.f4847d;
            this.f4844a.c(this.f4851h, z12 ? 1 : 0, i10, i6, null);
        }
        if (this.f4848e != 179) {
            this.f4850g = j;
        }
    }
}
