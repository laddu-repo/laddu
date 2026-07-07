package d4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f4062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1.t f4063b = new w1.t(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4066e;
    public boolean f;

    public c0(b0 b0Var) {
        this.f4062a = b0Var;
    }

    @Override // d4.h0
    public final void a() {
        this.f = true;
    }

    @Override // d4.h0
    public final void b(int i, w1.t tVar) {
        boolean z2 = (i & 1) != 0;
        int iX = z2 ? tVar.f13739b + tVar.x() : -1;
        if (this.f) {
            if (!z2) {
                return;
            }
            this.f = false;
            tVar.J(iX);
            this.f4065d = 0;
        }
        while (tVar.a() > 0) {
            int i10 = this.f4065d;
            w1.t tVar2 = this.f4063b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iX2 = tVar.x();
                    tVar.J(tVar.f13739b - 1);
                    if (iX2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(tVar.a(), 3 - this.f4065d);
                tVar.h(tVar2.f13738a, this.f4065d, iMin);
                int i11 = this.f4065d + iMin;
                this.f4065d = i11;
                if (i11 == 3) {
                    tVar2.J(0);
                    tVar2.I(3);
                    tVar2.K(1);
                    int iX3 = tVar2.x();
                    int iX4 = tVar2.x();
                    this.f4066e = (iX3 & 128) != 0;
                    int i12 = (((iX3 & 15) << 8) | iX4) + 3;
                    this.f4064c = i12;
                    byte[] bArr = tVar2.f13738a;
                    if (bArr.length < i12) {
                        tVar2.c(Math.min(4098, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(tVar.a(), this.f4064c - this.f4065d);
                tVar.h(tVar2.f13738a, this.f4065d, iMin2);
                int i13 = this.f4065d + iMin2;
                this.f4065d = i13;
                int i14 = this.f4064c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f4066e) {
                        tVar2.I(i14);
                    } else {
                        if (w1.b0.l(0, i14, -1, tVar2.f13738a) != 0) {
                            this.f = true;
                            return;
                        }
                        tVar2.I(this.f4064c - 4);
                    }
                    tVar2.J(0);
                    this.f4062a.b(tVar2);
                    this.f4065d = 0;
                }
            }
        }
    }

    @Override // d4.h0
    public final void c(w1.y yVar, w2.q qVar, g0 g0Var) {
        this.f4062a.c(yVar, qVar, g0Var);
        this.f = true;
    }
}
