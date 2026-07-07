package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class z3 extends v3 {
    public boolean A;

    public z3(e4 e4Var) {
        super(e4Var);
        this.f9511z.O++;
    }

    public final void e1() {
        if (this.A) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void f1() {
        if (!this.A) {
            g1();
            this.f9511z.P++;
            this.A = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract void g1();
}
