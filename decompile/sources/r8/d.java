package r8;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: x, reason: collision with root package name */
    public final WeakReference f11881x;

    /* renamed from: y, reason: collision with root package name */
    public final long f11882y;

    /* renamed from: z, reason: collision with root package name */
    public final CountDownLatch f11883z = new CountDownLatch(1);
    public boolean A = false;

    public d(b bVar, long j) {
        this.f11881x = new WeakReference(bVar);
        this.f11882y = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.f11881x;
        try {
            if (!this.f11883z.await(this.f11882y, TimeUnit.MILLISECONDS) && (bVar = (b) weakReference.get()) != null) {
                bVar.b();
                this.A = true;
            }
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.b();
                this.A = true;
            }
        }
    }
}
