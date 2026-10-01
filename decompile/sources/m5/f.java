package m5;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f8633b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i6) {
        this.f8632a = i6;
        this.f8633b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j jVar;
        switch (this.f8632a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f8633b;
                if (swipeRefreshLayout.f1176z) {
                    swipeRefreshLayout.W.setAlpha(255);
                    swipeRefreshLayout.W.start();
                    if (swipeRefreshLayout.f1168e0 && (jVar = swipeRefreshLayout.f1175y) != null) {
                        jVar.c();
                    }
                    swipeRefreshLayout.K = swipeRefreshLayout.Q.getTop();
                    return;
                }
                swipeRefreshLayout.l();
                return;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f8633b;
                g gVar = new g(swipeRefreshLayout2, 1);
                swipeRefreshLayout2.f1165b0 = gVar;
                gVar.setDuration(150L);
                a aVar = swipeRefreshLayout2.Q;
                aVar.f8604x = null;
                aVar.clearAnimation();
                swipeRefreshLayout2.Q.startAnimation(swipeRefreshLayout2.f1165b0);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i6 = this.f8632a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i6 = this.f8632a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
