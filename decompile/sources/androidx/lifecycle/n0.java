package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n0 {
    public final /* synthetic */ o0 A;

    /* renamed from: x, reason: collision with root package name */
    public final r0 f965x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f966y;

    /* renamed from: z, reason: collision with root package name */
    public int f967z = -1;

    public n0(o0 o0Var, r0 r0Var) {
        this.A = o0Var;
        this.f965x = r0Var;
    }

    public final void a(boolean z10) {
        int i6;
        boolean z11;
        boolean z12;
        if (z10 != this.f966y) {
            this.f966y = z10;
            if (z10) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            o0 o0Var = this.A;
            int i10 = o0Var.f971c;
            o0Var.f971c = i6 + i10;
            if (!o0Var.f972d) {
                o0Var.f972d = true;
                while (true) {
                    try {
                        int i11 = o0Var.f971c;
                        if (i10 == i11) {
                            break;
                        }
                        if (i10 == 0 && i11 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i10 > 0 && i11 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                            o0Var.e();
                        } else if (z12) {
                            o0Var.f();
                        }
                        i10 = i11;
                    } catch (Throwable th) {
                        o0Var.f972d = false;
                        throw th;
                    }
                }
                o0Var.f972d = false;
            }
            if (this.f966y) {
                o0Var.c(this);
            }
        }
    }

    public boolean c(f0 f0Var) {
        return false;
    }

    public abstract boolean e();

    public void b() {
    }
}
