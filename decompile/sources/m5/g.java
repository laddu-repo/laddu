package m5;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends Animation {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8634x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f8635y;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i6) {
        this.f8634x = i6;
        this.f8635y = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f3, Transformation transformation) {
        switch (this.f8634x) {
            case 0:
                this.f8635y.setAnimationProgress(f3);
                return;
            case 1:
                this.f8635y.setAnimationProgress(1.0f - f3);
                return;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f8635y;
                int abs = swipeRefreshLayout.U - Math.abs(swipeRefreshLayout.T);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.S + ((int) ((abs - r1) * f3))) - swipeRefreshLayout.Q.getTop());
                e eVar = swipeRefreshLayout.W;
                float f10 = 1.0f - f3;
                d dVar = eVar.f8629x;
                if (f10 != dVar.f8624p) {
                    dVar.f8624p = f10;
                }
                eVar.invalidateSelf();
                return;
            default:
                this.f8635y.k(f3);
                return;
        }
    }
}
