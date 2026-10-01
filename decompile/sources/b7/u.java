package b7;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1590x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f1591y;

    public /* synthetic */ u(y yVar, int i6) {
        this.f1590x = i6;
        this.f1591y = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1590x) {
            case 0:
                Drawable drawable = this.f1591y;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                y yVar = this.f1591y;
                Semaphore semaphore = yVar.f1608j0;
                j7.b bVar = yVar.L;
                if (bVar != null) {
                    try {
                        semaphore.acquire();
                        bVar.r(yVar.f1614y.a());
                        if (y.f1596p0 && yVar.f1606h0) {
                            if (yVar.f1609k0 == null) {
                                yVar.f1609k0 = new Handler(Looper.getMainLooper());
                                yVar.f1610l0 = new u(yVar, 0);
                            }
                            yVar.f1609k0.post(yVar.f1610l0);
                        }
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        semaphore.release();
                        throw th;
                    }
                    semaphore.release();
                    return;
                }
                return;
        }
    }
}
