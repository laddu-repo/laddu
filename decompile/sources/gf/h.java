package gf;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5676x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f5677y;

    public /* synthetic */ h(Object obj, int i6) {
        this.f5676x = i6;
        this.f5677y = obj;
    }

    @Override // gf.i
    public final void a(Throwable th) {
        switch (this.f5676x) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f5677y).cancel(false);
                    return;
                }
                return;
            case 1:
                ((ve.l) this.f5677y).invoke(th);
                return;
            default:
                ((q0) this.f5677y).d();
                return;
        }
    }

    public final String toString() {
        switch (this.f5676x) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f5677y) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ve.l) this.f5677y).getClass().getSimpleName() + '@' + f0.p(this) + ']';
            default:
                return "DisposeOnCancel[" + ((q0) this.f5677y) + ']';
        }
    }
}
