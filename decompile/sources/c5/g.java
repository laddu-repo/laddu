package c5;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f2136w;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f2135v = i;
        this.f2136w = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f2135v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f2136w.setAnimationProgress(f);
                break;
            case 1:
                this.f2136w.setAnimationProgress(1.0f - f);
                break;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f2136w;
                int iAbs = swipeRefreshLayout.S - Math.abs(swipeRefreshLayout.R);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.Q + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout.O.getTop());
                e eVar = swipeRefreshLayout.U;
                float f4 = 1.0f - f;
                d dVar = eVar.f2128v;
                if (f4 != dVar.f2122p) {
                    dVar.f2122p = f4;
                }
                eVar.invalidateSelf();
                break;
            default:
                this.f2136w.k(f);
                break;
        }
    }
}
