package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements n, ViewTreeObserver.OnDrawListener, Runnable {
    public final /* synthetic */ q A;

    /* renamed from: x, reason: collision with root package name */
    public final long f3469x = SystemClock.uptimeMillis() + UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;

    /* renamed from: y, reason: collision with root package name */
    public Runnable f3470y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3471z;

    public o(q qVar) {
        this.A = qVar;
    }

    public final void a(View view) {
        if (!this.f3471z) {
            this.f3471z = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.k.e(runnable, "runnable");
        this.f3470y = runnable;
        View decorView = this.A.getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView, "getDecorView(...)");
        if (this.f3471z) {
            if (kotlin.jvm.internal.k.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new a2.a(this, 16));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f3470y;
        if (runnable != null) {
            runnable.run();
            this.f3470y = null;
            z fullyDrawnReporter = this.A.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f3486b) {
                z10 = fullyDrawnReporter.f3487c;
            }
            if (z10) {
                this.f3471z = false;
                this.A.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.f3469x) {
            this.f3471z = false;
            this.A.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
