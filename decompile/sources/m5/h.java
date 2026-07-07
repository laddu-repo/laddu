package m5;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends Animation {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8636x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f8637y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f8638z;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i6, int i10) {
        this.f8638z = swipeRefreshLayout;
        this.f8636x = i6;
        this.f8637y = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f3, Transformation transformation) {
        this.f8638z.W.setAlpha((int) (((this.f8637y - r0) * f3) + this.f8636x));
    }
}
