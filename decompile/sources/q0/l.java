package q0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10824x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f10825y;

    public l(Handler handler) {
        this.f10824x = 0;
        this.f10825y = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f10824x) {
            case 0:
                runnable.getClass();
                Handler handler = this.f10825y;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                this.f10825y.post(runnable);
                return;
        }
    }

    public l() {
        this.f10824x = 1;
        this.f10825y = new Handler(Looper.getMainLooper());
    }
}
