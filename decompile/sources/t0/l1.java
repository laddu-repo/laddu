package t0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f12369a;

    /* renamed from: b, reason: collision with root package name */
    public l0.c[] f12370b;

    public l1() {
        this(new w1());
    }

    public final void a() {
        l0.c[] cVarArr = this.f12370b;
        if (cVarArr != null) {
            l0.c cVar = cVarArr[0];
            l0.c cVar2 = cVarArr[1];
            w1 w1Var = this.f12369a;
            if (cVar2 == null) {
                cVar2 = w1Var.f12417a.f(2);
            }
            if (cVar == null) {
                cVar = w1Var.f12417a.f(1);
            }
            g(l0.c.a(cVar, cVar2));
            l0.c cVar3 = this.f12370b[a8.c.g(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            l0.c cVar4 = this.f12370b[a8.c.g(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            l0.c cVar5 = this.f12370b[a8.c.g(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract w1 b();

    public void c(int i6, l0.c cVar) {
        if (this.f12370b == null) {
            this.f12370b = new l0.c[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i6 & i10) != 0) {
                this.f12370b[a8.c.g(i10)] = cVar;
            }
        }
    }

    public abstract void e(l0.c cVar);

    public abstract void g(l0.c cVar);

    public l1(w1 w1Var) {
        this.f12369a = w1Var;
    }

    public void d(l0.c cVar) {
    }

    public void f(l0.c cVar) {
    }

    public void h(l0.c cVar) {
    }
}
