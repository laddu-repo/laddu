package c5;

import android.view.animation.Animation;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f2134b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f2133a = i;
        this.f2134b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j jVar;
        switch (this.f2133a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                SwipeRefreshLayout swipeRefreshLayout = this.f2134b;
                if (!swipeRefreshLayout.f1429x) {
                    swipeRefreshLayout.l();
                } else {
                    swipeRefreshLayout.U.setAlpha(255);
                    swipeRefreshLayout.U.start();
                    if (swipeRefreshLayout.f1421c0 && (jVar = swipeRefreshLayout.f1428w) != null) {
                        jVar.a();
                    }
                    swipeRefreshLayout.I = swipeRefreshLayout.O.getTop();
                }
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f2134b;
                g gVar = new g(swipeRefreshLayout2, 1);
                swipeRefreshLayout2.W = gVar;
                gVar.setDuration(150L);
                a aVar = swipeRefreshLayout2.O;
                aVar.f2103v = null;
                aVar.clearAnimation();
                swipeRefreshLayout2.O.startAnimation(swipeRefreshLayout2.W);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f2133a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f2133a;
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
