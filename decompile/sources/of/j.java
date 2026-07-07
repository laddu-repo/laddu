package of;

import gf.f0;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: z, reason: collision with root package name */
    public final Runnable f10181z;

    public j(Runnable runnable, long j, o oVar) {
        super(j, oVar);
        this.f10181z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10181z.run();
        } finally {
            this.f10180y.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f10181z;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(f0.p(runnable));
        sb2.append(", ");
        sb2.append(this.f10179x);
        sb2.append(", ");
        sb2.append(this.f10180y);
        sb2.append(']');
        return sb2.toString();
    }
}
