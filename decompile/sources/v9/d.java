package v9;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d extends f {

    /* renamed from: c, reason: collision with root package name */
    public d6.b f13483c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f13484d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13485e;

    /* renamed from: f, reason: collision with root package name */
    public int f13486f;

    /* renamed from: g, reason: collision with root package name */
    public int f13487g;

    /* renamed from: h, reason: collision with root package name */
    public int f13488h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f13489i;

    @Override // f0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        View view2;
        int findPointerIndex;
        if (this.f13488h < 0) {
            this.f13488h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f13485e) {
            int i6 = this.f13486f;
            if (i6 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i6)) != -1) {
                int y9 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y9 - this.f13487g) > this.f13488h) {
                    this.f13487g = y9;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f13486f = -1;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f2566n;
            if ((weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) && coordinatorLayout.p(view, x10, y10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f13485e = z10;
            if (z10) {
                this.f13487g = y10;
                this.f13486f = motionEvent.getPointerId(0);
                if (this.f13489i == null) {
                    this.f13489i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f13484d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f13484d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f13489i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    @Override // f0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.d.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int u();

    public abstract int v(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11);

    public final void w(CoordinatorLayout coordinatorLayout, View view, int i6) {
        v(coordinatorLayout, view, i6, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
