package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u1 f9299w;

    public /* synthetic */ t1(u1 u1Var, int i) {
        this.f9298v = i;
        this.f9299w = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9298v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ViewParent parent = this.f9299w.f9305y.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                u1 u1Var = this.f9299w;
                u1Var.a();
                View view = u1Var.f9305y;
                if (view.isEnabled() && !view.isLongClickable() && u1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    u1Var.B = true;
                    break;
                }
                break;
        }
    }
}
