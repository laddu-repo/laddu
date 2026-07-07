package na;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends x.h implements ScheduledFuture {
    public final ScheduledFuture C;

    public g(f fVar) {
        this.C = fVar.a(new k4(this));
    }

    @Override // x.h
    public final void b() {
        ScheduledFuture scheduledFuture = this.C;
        Object obj = this.f14058v;
        scheduledFuture.cancel((obj instanceof x.a) && ((x.a) obj).f14041a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.C.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.C.getDelay(timeUnit);
    }
}
