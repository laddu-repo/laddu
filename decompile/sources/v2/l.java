package v2;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f13126x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final GestureDetector f13128z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final PointF f13124v = new PointF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PointF f13125w = new PointF();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f13127y = 25.0f;
    public volatile float A = 3.1415927f;

    public l(Context context, j jVar) {
        this.f13126x = jVar;
        this.f13128z = new GestureDetector(context, this);
    }

    @Override // v2.c
    public final void a(float[] fArr, float f) {
        this.A = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f13124v.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f4) {
        float x10 = (motionEvent2.getX() - this.f13124v.x) / this.f13127y;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f13124v;
        float f10 = (y10 - pointF.y) / this.f13127y;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.A;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f13125w;
        pointF2.x -= (fCos * x10) - (fSin * f10);
        float f11 = (fCos * f10) + (fSin * x10) + pointF2.y;
        pointF2.y = f11;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f11));
        j jVar = this.f13126x;
        PointF pointF3 = this.f13125w;
        synchronized (jVar) {
            float f12 = pointF3.y;
            jVar.B = f12;
            Matrix.setRotateM(jVar.f13118z, 0, -f12, (float) Math.cos(jVar.C), (float) Math.sin(jVar.C), 0.0f);
            Matrix.setRotateM(jVar.A, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f13126x.F.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f13128z.onTouchEvent(motionEvent);
    }
}
