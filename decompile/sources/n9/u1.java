package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u1 extends e3.e {

    /* renamed from: z, reason: collision with root package name */
    public boolean f9493z;

    public u1(n1 n1Var) {
        super(n1Var);
        ((n1) this.f4301y).X++;
    }

    public abstract boolean e1();

    public final void f1() {
        if (this.f9493z) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void g1() {
        if (!this.f9493z) {
            if (!e1()) {
                ((n1) this.f4301y).Z.incrementAndGet();
                this.f9493z = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
