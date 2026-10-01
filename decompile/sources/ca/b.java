package ca;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import w4.c0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends c0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1994q = 1;

    public /* synthetic */ b(Context context) {
        super(context);
    }

    @Override // w4.c0
    public int b(View view, int i6) {
        switch (this.f1994q) {
            case 0:
                return 0;
            default:
                return super.b(view, i6);
        }
    }

    @Override // w4.c0
    public int c(View view, int i6) {
        switch (this.f1994q) {
            case 0:
                return 0;
            default:
                return super.c(view, i6);
        }
    }

    @Override // w4.c0
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f1994q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // w4.c0
    public PointF f(int i6) {
        switch (this.f1994q) {
            case 0:
                return null;
            default:
                return super.f(i6);
        }
    }

    public b(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
