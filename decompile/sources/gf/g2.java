package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g2 extends mf.t implements Runnable {
    public final long B;

    public g2(long j, ne.c cVar) {
        super(cVar, cVar.getContext());
        this.B = j;
    }

    @Override // gf.t1
    public final String M() {
        return super.M() + "(timeMillis=" + this.B + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0.o(this.f5647z);
        q(new f2("Timed out waiting for " + this.B + " ms", this));
    }
}
