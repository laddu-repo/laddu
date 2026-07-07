package hb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends h implements Runnable {
    public final Runnable E;

    public b0(Runnable runnable) {
        runnable.getClass();
        this.E = runnable;
    }

    @Override // hb.o
    public final String i() {
        return "task=[" + this.E + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.E.run();
        } catch (Throwable th) {
            l(th);
            throw th;
        }
    }
}
