package c5;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Animation {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2137v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2138w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f2139x;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i, int i10) {
        this.f2139x = swipeRefreshLayout;
        this.f2137v = i;
        this.f2138w = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f2139x.U.setAlpha((int) (((this.f2138w - r0) * f) + this.f2137v));
    }
}
