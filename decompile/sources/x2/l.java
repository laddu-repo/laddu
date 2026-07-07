package x2;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {
    public final GestureDetector B;

    /* renamed from: z, reason: collision with root package name */
    public final j f14494z;

    /* renamed from: x, reason: collision with root package name */
    public final PointF f14492x = new PointF();

    /* renamed from: y, reason: collision with root package name */
    public final PointF f14493y = new PointF();
    public final float A = 25.0f;
    public volatile float C = 3.1415927f;

    public l(Context context, j jVar) {
        this.f14494z = jVar;
        this.B = new GestureDetector(context, this);
    }

    @Override // x2.c
    public final void a(float[] fArr, float f3) {
        this.C = -f3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f14492x.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        float x10 = (motionEvent2.getX() - this.f14492x.x) / this.A;
        float y9 = motionEvent2.getY();
        PointF pointF = this.f14492x;
        float f11 = (y9 - pointF.y) / this.A;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.C;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f14493y;
        pointF2.x -= (cos * x10) - (sin * f11);
        float f12 = (cos * f11) + (sin * x10) + pointF2.y;
        pointF2.y = f12;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f12));
        j jVar = this.f14494z;
        PointF pointF3 = this.f14493y;
        synchronized (jVar) {
            float f13 = pointF3.y;
            jVar.D = f13;
            Matrix.setRotateM(jVar.B, 0, -f13, (float) Math.cos(jVar.E), (float) Math.sin(jVar.E), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Matrix.setRotateM(jVar.C, 0, -pointF3.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f14494z.H.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.B.onTouchEvent(motionEvent);
    }
}
