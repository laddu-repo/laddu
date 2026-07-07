package nc;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements s9.e, s9.d, s9.b {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9603x;

    /* renamed from: y, reason: collision with root package name */
    public final CountDownLatch f9604y;

    public d(int i6) {
        this.f9603x = i6;
        switch (i6) {
            case 1:
                this.f9604y = new CountDownLatch(1);
                return;
            default:
                this.f9604y = new CountDownLatch(1);
                return;
        }
    }

    @Override // s9.b
    public final void b() {
        switch (this.f9603x) {
            case 0:
                this.f9604y.countDown();
                return;
            default:
                this.f9604y.countDown();
                return;
        }
    }

    @Override // s9.d
    public final void onFailure(Exception exc) {
        switch (this.f9603x) {
            case 0:
                this.f9604y.countDown();
                return;
            default:
                this.f9604y.countDown();
                return;
        }
    }

    @Override // s9.e
    public final void onSuccess(Object obj) {
        switch (this.f9603x) {
            case 0:
                this.f9604y.countDown();
                return;
            default:
                this.f9604y.countDown();
                return;
        }
    }
}
