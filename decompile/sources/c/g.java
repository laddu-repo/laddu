package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1637v = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Runnable f1638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h.j f1640y;

    public g(h.j jVar) {
        this.f1640y = jVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        de.i.e(runnable, "runnable");
        this.f1638w = runnable;
        View decorView = this.f1640y.getWindow().getDecorView();
        de.i.d(decorView, "getDecorView(...)");
        if (!this.f1639x) {
            decorView.postOnAnimation(new androidx.emoji2.text.v(3, this));
        } else if (de.i.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1638w;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1637v) {
                this.f1639x = false;
                this.f1640y.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1638w = null;
        t tVar = (t) this.f1640y.B.getValue();
        synchronized (tVar.f1665a) {
            z2 = tVar.f1666b;
        }
        if (z2) {
            this.f1639x = false;
            this.f1640y.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1640y.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
