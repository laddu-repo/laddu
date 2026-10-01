package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v1 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10398x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w1 f10399y;

    public /* synthetic */ v1(w1 w1Var, int i6) {
        this.f10398x = i6;
        this.f10399y = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10398x) {
            case 0:
                ViewParent parent = this.f10399y.A.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                w1 w1Var = this.f10399y;
                w1Var.a();
                View view = w1Var.A;
                if (view.isEnabled() && !view.isLongClickable() && w1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    w1Var.D = true;
                    return;
                }
                return;
        }
    }
}
