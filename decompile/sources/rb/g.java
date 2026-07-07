package rb;

import a2.a2;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends x.g implements ScheduledFuture {
    public final ScheduledFuture E;

    public g(f fVar) {
        this.E = fVar.a(new a2(this, 21));
    }

    @Override // x.g
    public final void c() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.E;
        Object obj = this.f14445x;
        if ((obj instanceof x.a) && ((x.a) obj).f14430a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.E.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.E.getDelay(timeUnit);
    }
}
