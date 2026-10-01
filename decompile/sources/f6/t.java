package f6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final u f5066x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5067y;

    public t(u uVar, String str) {
        this.f5066x = uVar;
        this.f5067y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5066x.f5072d) {
            try {
                if (((t) this.f5066x.f5070b.remove(this.f5067y)) != null) {
                    s sVar = (s) this.f5066x.f5071c.remove(this.f5067y);
                    if (sVar != null) {
                        String str = this.f5067y;
                        v5.o.f().b(y5.e.G, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((y5.e) sVar).f();
                    }
                } else {
                    v5.o.f().b("WrkTimerRunnable", "Timer with " + this.f5067y + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
