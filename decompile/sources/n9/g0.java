package n9;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g0 extends c0 {

    /* renamed from: z, reason: collision with root package name */
    public boolean f9322z;

    public g0(n1 n1Var) {
        super(n1Var);
        ((n1) this.f4301y).X++;
    }

    public final void e1() {
        if (this.f9322z) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void f1() {
        if (!this.f9322z) {
            if (!g1()) {
                ((n1) this.f4301y).Z.incrementAndGet();
                this.f9322z = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean g1();
}
