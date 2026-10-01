package pa;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends r {

    /* renamed from: f, reason: collision with root package name */
    public float f10713f;

    /* renamed from: g, reason: collision with root package name */
    public float f10714g;

    /* renamed from: h, reason: collision with root package name */
    public float f10715h;

    /* renamed from: i, reason: collision with root package name */
    public float f10716i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f10717k;

    /* renamed from: l, reason: collision with root package name */
    public int f10718l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10719m;

    /* renamed from: n, reason: collision with root package name */
    public float f10720n;

    /* renamed from: o, reason: collision with root package name */
    public Pair f10721o;

    @Override // pa.r
    public final void a(Canvas canvas, Rect rect, float f3, boolean z10, boolean z11) {
        if (this.f10713f != rect.width()) {
            this.f10713f = rect.width();
            g();
        }
        float e10 = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (rect.height() - e10) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        x xVar = (x) this.f10708a;
        if (xVar.f10743q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f10 = this.f10713f / 2.0f;
        float f11 = e10 / 2.0f;
        canvas.clipRect(-f10, -f11, f10, f11);
        this.f10714g = xVar.f10633a * f3;
        this.f10715h = Math.min(r0 / 2, xVar.a()) * f3;
        this.j = xVar.f10643l * f3;
        this.f10716i = Math.min(xVar.f10633a / 2.0f, xVar.e()) * f3;
        if (z10 || z11) {
            if ((z10 && xVar.f10639g == 2) || (z11 && xVar.f10640h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && xVar.f10640h != 3)) {
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((1.0f - f3) * xVar.f10633a) / 2.0f);
            }
        }
        if (z11 && xVar.f10640h == 3) {
            this.f10720n = f3;
        } else {
            this.f10720n = 1.0f;
        }
    }

    @Override // pa.r
    public final void b(Canvas canvas, Paint paint, int i6, int i10) {
        float f3;
        int m9 = jb.b.m(i6, i10);
        this.f10719m = false;
        x xVar = (x) this.f10708a;
        if (xVar.f10744r > 0 && m9 != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(m9);
            Integer num = xVar.s;
            if (num != null) {
                f3 = (xVar.f10744r / 2.0f) + num.floatValue();
            } else {
                f3 = this.f10714g / 2.0f;
            }
            q qVar = new q(new float[]{(this.f10713f / 2.0f) - f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
            int i11 = xVar.f10744r;
            j(canvas, paint, qVar, i11, i11, (this.f10715h * i11) / this.f10714g, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        }
    }

    @Override // pa.r
    public final void c(Canvas canvas, Paint paint, p pVar, int i6) {
        int m9 = jb.b.m(pVar.f10699c, i6);
        this.f10719m = pVar.f10704h;
        float f3 = pVar.f10697a;
        float f10 = pVar.f10698b;
        int i10 = pVar.f10700d;
        i(canvas, paint, f3, f10, m9, i10, i10, pVar.f10701e, pVar.f10702f, true);
    }

    @Override // pa.r
    public final void d(Canvas canvas, Paint paint, float f3, float f10, int i6, int i10, int i11) {
        int m9 = jb.b.m(i6, i10);
        this.f10719m = false;
        i(canvas, paint, f3, f10, m9, i11, i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }

    @Override // pa.r
    public final int e() {
        e eVar = this.f10708a;
        return (((x) eVar).f10643l * 2) + ((x) eVar).f10633a;
    }

    @Override // pa.r
    public final int f() {
        return -1;
    }

    @Override // pa.r
    public final void g() {
        int i6;
        Path path = this.f10709b;
        path.rewind();
        x xVar = (x) this.f10708a;
        if (xVar.b(this.f10719m)) {
            if (this.f10719m) {
                i6 = xVar.j;
            } else {
                i6 = xVar.f10642k;
            }
            float f3 = this.f10713f;
            int i10 = (int) (f3 / i6);
            this.f10717k = f3 / i10;
            for (int i11 = 0; i11 <= i10; i11++) {
                int i12 = i11 * 2;
                float f10 = i12 + 1;
                path.cubicTo(i12 + 0.48f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10 - 0.48f, 1.0f, f10, 1.0f);
                float f11 = f10 + 0.48f;
                float f12 = i12 + 2;
                path.cubicTo(f11, 1.0f, f12 - 0.48f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            Matrix matrix = this.f10712e;
            matrix.reset();
            matrix.setScale(this.f10717k / 2.0f, -2.0f);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f10713f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.f10711d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f3, float f10, int i6, int i10, int i11, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        boolean z11;
        Paint.Cap cap;
        x xVar;
        int i12;
        Canvas canvas2;
        Pair pair = this.f10721o;
        float a10 = c9.a.a(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float a11 = c9.a.a(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float q9 = a8.i.q(1.0f - this.f10720n, 1.0f, a10);
        float q10 = a8.i.q(1.0f - this.f10720n, 1.0f, a11);
        int a12 = (int) ((c9.a.a(q9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.01f) * i10) / 0.01f);
        int a13 = (int) (((1.0f - c9.a.a(q10, 0.99f, 1.0f)) * i11) / 0.01f);
        float f15 = this.f10713f;
        int i13 = (int) ((q9 * f15) + a12);
        int i14 = (int) ((q10 * f15) - a13);
        float f16 = this.f10715h;
        float f17 = this.f10716i;
        if (f16 != f17) {
            float max = Math.max(f16, f17);
            float f18 = this.f10713f;
            float f19 = max / f18;
            f13 = a8.i.q(this.f10715h, this.f10716i, c9.a.a(i13 / f18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f19) / f19);
            float f20 = this.f10715h;
            float f21 = this.f10716i;
            float f22 = this.f10713f;
            f14 = a8.i.q(f20, f21, c9.a.a((f22 - i14) / f22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f19) / f19);
        } else {
            f13 = f16;
            f14 = f13;
        }
        float f23 = (-this.f10713f) / 2.0f;
        x xVar2 = (x) this.f10708a;
        if (xVar2.b(this.f10719m) && z10 && f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i13 <= i14) {
            float f24 = i13 + f13;
            float f25 = i14 - f14;
            float f26 = f13 * 2.0f;
            float f27 = f14 * 2.0f;
            paint.setColor(i6);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f10714g);
            ((q) pair.first).b();
            ((q) pair.second).b();
            ((q) pair.first).e(f24 + f23);
            ((q) pair.second).e(f25 + f23);
            if (i13 == 0 && f25 + f14 < f24 + f13) {
                q qVar = (q) pair.first;
                float f28 = this.f10714g;
                j(canvas, paint, qVar, f26, f28, f13, (q) pair.second, f27, f28, f14, true);
                return;
            }
            if (f24 - f13 > f25 - f14) {
                q qVar2 = (q) pair.second;
                float f29 = this.f10714g;
                j(canvas, paint, qVar2, f27, f29, f14, (q) pair.first, f26, f29, f13, false);
                return;
            }
            float f30 = f14;
            paint.setStyle(Paint.Style.STROKE);
            if (xVar2.c()) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            if (!z11) {
                float[] fArr = ((q) pair.first).f10705a;
                float f31 = fArr[0];
                float f32 = fArr[1];
                float[] fArr2 = ((q) pair.second).f10705a;
                canvas.drawLine(f31, f32, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                xVar = xVar2;
            } else {
                float f33 = this.f10713f;
                float f34 = f24 / f33;
                float f35 = f25 / f33;
                xVar = xVar2;
                if (this.f10719m) {
                    i12 = xVar.j;
                } else {
                    i12 = xVar.f10642k;
                }
                if (i12 != this.f10718l) {
                    this.f10718l = i12;
                    g();
                }
                Path path = this.f10710c;
                path.rewind();
                float f36 = (-this.f10713f) / 2.0f;
                boolean b10 = xVar.b(this.f10719m);
                if (b10) {
                    float f37 = this.f10713f;
                    float f38 = this.f10717k;
                    float f39 = f37 / f38;
                    float f40 = f12 / f39;
                    float f41 = f39 / (f39 + 1.0f);
                    f34 = (f34 + f40) * f41;
                    f35 = (f35 + f40) * f41;
                    f36 -= f38 * f12;
                }
                PathMeasure pathMeasure = this.f10711d;
                float length = pathMeasure.getLength() * f34;
                float length2 = pathMeasure.getLength() * f35;
                pathMeasure.getSegment(length, length2, path, true);
                q qVar3 = (q) pair.first;
                qVar3.b();
                pathMeasure.getPosTan(length, qVar3.f10705a, qVar3.f10706b);
                q qVar4 = (q) pair.second;
                qVar4.b();
                pathMeasure.getPosTan(length2, qVar4.f10705a, qVar4.f10706b);
                Matrix matrix = this.f10712e;
                matrix.reset();
                matrix.setTranslate(f36, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                qVar3.e(f36);
                qVar4.e(f36);
                if (b10) {
                    float f42 = this.j * f11;
                    matrix.postScale(1.0f, f42);
                    qVar3.d(f42);
                    qVar4.d(f42);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            }
            if (!xVar.c()) {
                if (f24 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    j(canvas2, paint, (q) pair.first, f26, this.f10714g, f13, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
                }
                if (f25 < this.f10713f && f30 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    j(canvas, paint, (q) pair.second, f27, this.f10714g, f30, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
                }
            }
        }
    }

    public final void j(Canvas canvas, Paint paint, q qVar, float f3, float f10, float f11, q qVar2, float f12, float f13, float f14, boolean z10) {
        float f15;
        float min = Math.min(f10, this.f10714g);
        float f16 = (-f3) / 2.0f;
        float f17 = (-min) / 2.0f;
        float f18 = f3 / 2.0f;
        float f19 = min / 2.0f;
        RectF rectF = new RectF(f16, f17, f18, f19);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (qVar2 != null) {
            float[] fArr = qVar2.f10706b;
            float[] fArr2 = qVar2.f10705a;
            float min2 = Math.min(f13, this.f10714g);
            float min3 = Math.min(f12 / 2.0f, (f14 * min2) / this.f10714g);
            RectF rectF2 = new RectF();
            if (z10) {
                float f20 = (fArr2[0] - min3) - (qVar.f10705a[0] - f11);
                if (f20 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    qVar2.e((-f20) / 2.0f);
                    f15 = f12 + f20;
                } else {
                    f15 = f12;
                }
                rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f17, f18, f19);
            } else {
                float f21 = (fArr2[0] + min3) - (qVar.f10705a[0] + f11);
                if (f21 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    qVar2.e((-f21) / 2.0f);
                    f15 = f12 - f21;
                } else {
                    f15 = f12;
                }
                rectF2.set(f16, f17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f19);
            }
            RectF rectF3 = new RectF((-f15) / 2.0f, (-min2) / 2.0f, f15 / 2.0f, min2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(r.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-r.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = qVar.f10705a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(r.h(qVar.f10706b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f11, f11, paint);
        } else {
            float[] fArr4 = qVar.f10705a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(r.h(qVar.f10706b));
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        canvas.restore();
    }
}
