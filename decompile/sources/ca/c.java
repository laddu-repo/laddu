package ca;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import w4.p0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1995a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1996b;

    public c() {
        Paint paint = new Paint();
        this.f1995a = paint;
        this.f1996b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // w4.p0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f1995a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f1996b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            ThreadLocal threadLocal = l0.b.f8060a;
            float f3 = 1.0f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.alpha(-65281) * f3)), (int) ((Color.red(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.red(-65281) * f3)), (int) ((Color.green(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.green(-65281) * f3)), (int) ((Color.blue(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.blue(-65281) * f3))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).D0()) {
                canvas2 = canvas;
                canvas2.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2646q.g(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2646q.c(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f2646q.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2646q.e(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
            }
            canvas = canvas2;
        }
    }
}
