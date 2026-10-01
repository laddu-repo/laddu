package w4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements f0 {

    /* renamed from: x, reason: collision with root package name */
    public final f0 f13870x;

    /* renamed from: y, reason: collision with root package name */
    public int f13871y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f13872z = -1;
    public int A = -1;
    public Object B = null;

    public f(v9.b bVar) {
        this.f13870x = bVar;
    }

    public final void a() {
        int i6 = this.f13871y;
        if (i6 == 0) {
            return;
        }
        f0 f0Var = this.f13870x;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    f0Var.e(this.f13872z, this.A, this.B);
                }
            } else {
                f0Var.d(this.f13872z, this.A);
            }
        } else {
            f0Var.c(this.f13872z, this.A);
        }
        this.B = null;
        this.f13871y = 0;
    }

    @Override // w4.f0
    public final void b(int i6, int i10) {
        a();
        this.f13870x.b(i6, i10);
    }

    @Override // w4.f0
    public final void c(int i6, int i10) {
        int i11;
        if (this.f13871y == 1 && i6 >= (i11 = this.f13872z)) {
            int i12 = this.A;
            if (i6 <= i11 + i12) {
                this.A = i12 + i10;
                this.f13872z = Math.min(i6, i11);
                return;
            }
        }
        a();
        this.f13872z = i6;
        this.A = i10;
        this.f13871y = 1;
    }

    @Override // w4.f0
    public final void d(int i6, int i10) {
        int i11;
        if (this.f13871y == 2 && (i11 = this.f13872z) >= i6 && i11 <= i6 + i10) {
            this.A += i10;
            this.f13872z = i6;
        } else {
            a();
            this.f13872z = i6;
            this.A = i10;
            this.f13871y = 2;
        }
    }

    @Override // w4.f0
    public final void e(int i6, int i10, Object obj) {
        int i11;
        int i12;
        int i13;
        if (this.f13871y == 3 && i6 <= (i12 = this.A + (i11 = this.f13872z)) && (i13 = i6 + i10) >= i11 && this.B == obj) {
            this.f13872z = Math.min(i6, i11);
            this.A = Math.max(i12, i13) - this.f13872z;
            return;
        }
        a();
        this.f13872z = i6;
        this.A = i10;
        this.B = obj;
        this.f13871y = 3;
    }
}
