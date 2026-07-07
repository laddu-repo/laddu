package pa;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends r {

    /* renamed from: f, reason: collision with root package name */
    public float f10646f;

    /* renamed from: g, reason: collision with root package name */
    public float f10647g;

    /* renamed from: h, reason: collision with root package name */
    public float f10648h;

    /* renamed from: i, reason: collision with root package name */
    public float f10649i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f10650k;

    /* renamed from: l, reason: collision with root package name */
    public int f10651l;

    /* renamed from: m, reason: collision with root package name */
    public float f10652m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10653n;

    /* renamed from: o, reason: collision with root package name */
    public float f10654o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f10655p;

    /* renamed from: q, reason: collision with root package name */
    public final Pair f10656q;

    public f(k kVar) {
        super(kVar);
        this.f10655p = new RectF();
        this.f10656q = new Pair(new q(), new q());
    }

    @Override // pa.r
    public final void a(Canvas canvas, Rect rect, float f3, boolean z10, boolean z11) {
        float width = rect.width() / k();
        float height = rect.height() / k();
        k kVar = (k) this.f10708a;
        float f10 = (kVar.f10686p / 2.0f) + kVar.f10687q;
        canvas.translate((f10 * width) + rect.left, (f10 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (kVar.f10688r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f11 = -f10;
        canvas.clipRect(f11, f11, f10, f10);
        this.f10646f = kVar.f10633a * f3;
        this.f10647g = Math.min(r9 / 2, kVar.a()) * f3;
        this.f10648h = kVar.f10643l * f3;
        int i6 = kVar.f10686p;
        int i10 = kVar.f10633a;
        float f12 = (i6 - i10) / 2.0f;
        this.f10649i = f12;
        if (z10 || z11) {
            float f13 = ((1.0f - f3) * i10) / 2.0f;
            if ((z10 && kVar.f10639g == 2) || (z11 && kVar.f10640h == 1)) {
                this.f10649i = f12 + f13;
            } else if ((z10 && kVar.f10639g == 1) || (z11 && kVar.f10640h == 2)) {
                this.f10649i = f12 - f13;
            }
        }
        if (z11 && kVar.f10640h == 3) {
            this.f10654o = f3;
        } else {
            this.f10654o = 1.0f;
        }
    }

    @Override // pa.r
    public final void c(Canvas canvas, Paint paint, p pVar, int i6) {
        int m9 = jb.b.m(pVar.f10699c, i6);
        canvas.save();
        canvas.rotate(pVar.f10703g);
        this.f10653n = pVar.f10704h;
        float f3 = pVar.f10697a;
        float f10 = pVar.f10698b;
        int i10 = pVar.f10700d;
        i(canvas, paint, f3, f10, m9, i10, i10, pVar.f10701e, pVar.f10702f, true);
        canvas.restore();
    }

    @Override // pa.r
    public final void d(Canvas canvas, Paint paint, float f3, float f10, int i6, int i10, int i11) {
        int m9 = jb.b.m(i6, i10);
        this.f10653n = false;
        i(canvas, paint, f3, f10, m9, i11, i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }

    @Override // pa.r
    public final int e() {
        return k();
    }

    @Override // pa.r
    public final int f() {
        return k();
    }

    @Override // pa.r
    public final void g() {
        int i6;
        int i10;
        Path path = this.f10709b;
        path.rewind();
        path.moveTo(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i6 = 2;
            if (i12 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i12++;
        }
        Matrix matrix = this.f10712e;
        matrix.reset();
        float f3 = this.f10649i;
        matrix.setScale(f3, f3);
        path.transform(matrix);
        k kVar = (k) this.f10708a;
        boolean b10 = kVar.b(this.f10653n);
        PathMeasure pathMeasure = this.f10711d;
        if (b10) {
            pathMeasure.setPath(path, false);
            float f10 = this.f10650k;
            path.rewind();
            float length = pathMeasure.getLength();
            if (this.f10653n) {
                i10 = kVar.j;
            } else {
                i10 = kVar.f10642k;
            }
            float f11 = 2.0f;
            int max = Math.max(3, (int) ((length / i10) / 2.0f)) * 2;
            this.j = length / max;
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < max; i13++) {
                q qVar = new q();
                float f12 = i13;
                pathMeasure.getPosTan(this.j * f12, qVar.f10705a, qVar.f10706b);
                q qVar2 = new q();
                float f13 = this.j;
                pathMeasure.getPosTan((f13 / 2.0f) + (f12 * f13), qVar2.f10705a, qVar2.f10706b);
                arrayList.add(qVar);
                qVar2.a(f10 * 2.0f);
                arrayList.add(qVar2);
            }
            arrayList.add((q) arrayList.get(0));
            q qVar3 = (q) arrayList.get(0);
            float[] fArr = qVar3.f10705a;
            char c10 = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i14 = 1;
            while (i14 < arrayList.size()) {
                q qVar4 = (q) arrayList.get(i14);
                float f14 = (this.j / f11) * 0.48f;
                float[] fArr2 = qVar3.f10705a;
                float[] fArr3 = new float[i6];
                System.arraycopy(fArr2, i11, fArr3, i11, i6);
                System.arraycopy(qVar3.f10706b, i11, new float[i6], i11, i6);
                new Matrix();
                float[] fArr4 = qVar4.f10705a;
                float[] fArr5 = new float[i6];
                System.arraycopy(fArr4, i11, fArr5, i11, i6);
                System.arraycopy(qVar4.f10706b, i11, new float[i6], i11, i6);
                new Matrix();
                float atan2 = (float) Math.atan2(r6[c10], r6[i11]);
                double d10 = fArr3[i11];
                double d11 = f14;
                double d12 = atan2;
                fArr3[0] = (float) ((Math.cos(d12) * d11) + d10);
                fArr3[1] = (float) ((Math.sin(d12) * d11) + fArr3[1]);
                float f15 = -f14;
                double d13 = f15;
                double atan22 = (float) Math.atan2(r11[1], r11[0]);
                fArr5[0] = (float) ((Math.cos(atan22) * d13) + fArr5[0]);
                float sin = (float) ((Math.sin(atan22) * d13) + fArr5[1]);
                fArr5[1] = sin;
                float f16 = fArr3[0];
                float f17 = fArr3[1];
                float f18 = fArr5[0];
                float[] fArr6 = qVar4.f10705a;
                path.cubicTo(f16, f17, f18, sin, fArr6[0], fArr6[1]);
                i14++;
                qVar3 = qVar4;
                pathMeasure = pathMeasure;
                i11 = 0;
                i6 = 2;
                f11 = 2.0f;
                c10 = 1;
            }
        }
        pathMeasure.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f3, float f10, int i6, int i10, int i11, float f11, float f12, boolean z10) {
        float f13;
        boolean z11;
        Paint.Cap cap;
        int i12;
        float f14;
        float f15;
        float f16;
        float f17;
        Canvas canvas2;
        Paint paint2;
        if (f10 >= f3) {
            f13 = f10 - f3;
        } else {
            f13 = (f10 + 1.0f) - f3;
        }
        float f18 = f3 % 1.0f;
        if (f18 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f18 += 1.0f;
        }
        if (this.f10654o < 1.0f) {
            float f19 = f18 + f13;
            if (f19 > 1.0f) {
                i(canvas, paint, f18, 1.0f, i6, i10, 0, f11, f12, z10);
                i(canvas, paint, 1.0f, f19, i6, 0, i11, f11, f12, z10);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f10647g / this.f10649i);
        float f20 = f13 - 0.99f;
        if (f20 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f21 = ((f20 * degrees) / 180.0f) / 0.01f;
            f13 += f21;
            if (!z10) {
                f18 -= f21 / 2.0f;
            }
        }
        float q9 = a8.i.q(1.0f - this.f10654o, 1.0f, f18);
        float q10 = a8.i.q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f10654o, f13);
        float degrees2 = (float) Math.toDegrees(i10 / this.f10649i);
        float degrees3 = ((q10 * 360.0f) - degrees2) - ((float) Math.toDegrees(i11 / this.f10649i));
        float f22 = (q9 * 360.0f) + degrees2;
        if (degrees3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            k kVar = (k) this.f10708a;
            if (kVar.b(this.f10653n) && z10 && f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                z11 = true;
            } else {
                z11 = false;
            }
            paint.setAntiAlias(true);
            paint.setColor(i6);
            paint.setStrokeWidth(this.f10646f);
            float f23 = this.f10647g * 2.0f;
            float f24 = degrees * 2.0f;
            PathMeasure pathMeasure = this.f10711d;
            if (degrees3 < f24) {
                float f25 = degrees3 / f24;
                float f26 = (degrees * f25) + f22;
                q qVar = new q();
                if (!z11) {
                    qVar.c(f26 + 90.0f);
                    qVar.a(-this.f10649i);
                } else {
                    float length = (pathMeasure.getLength() * (f26 / 360.0f)) / 2.0f;
                    float f27 = this.f10648h * f11;
                    float f28 = this.f10649i;
                    if (f28 != this.f10652m || f27 != this.f10650k) {
                        this.f10650k = f27;
                        this.f10652m = f28;
                        g();
                    }
                    pathMeasure.getPosTan(length, qVar.f10705a, qVar.f10706b);
                }
                paint.setStyle(Paint.Style.FILL);
                j(canvas, paint, qVar, f23, this.f10646f, f25);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (kVar.c()) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f29 = f22 + degrees;
            float f30 = degrees3 - f24;
            Pair pair = this.f10656q;
            ((q) pair.first).b();
            ((q) pair.second).b();
            if (!z11) {
                ((q) pair.first).c(f29 + 90.0f);
                ((q) pair.first).a(-this.f10649i);
                ((q) pair.second).c(f29 + f30 + 90.0f);
                ((q) pair.second).a(-this.f10649i);
                float f31 = this.f10649i;
                float f32 = -f31;
                RectF rectF = this.f10655p;
                rectF.set(f32, f32, f31, f31);
                canvas.drawArc(rectF, f29, f30, false, paint);
                canvas2 = canvas;
                paint2 = paint;
                f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                float f33 = f29 / 360.0f;
                float f34 = f30 / 360.0f;
                float f35 = this.f10648h * f11;
                if (this.f10653n) {
                    i12 = kVar.j;
                } else {
                    i12 = kVar.f10642k;
                }
                float f36 = this.f10649i;
                if (f36 != this.f10652m || f35 != this.f10650k || i12 != this.f10651l) {
                    this.f10650k = f35;
                    this.f10651l = i12;
                    this.f10652m = f36;
                    g();
                }
                Path path = this.f10710c;
                path.rewind();
                float a10 = c9.a.a(f34, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                if (kVar.b(this.f10653n)) {
                    f14 = a10;
                    f15 = 1.0f;
                    float f37 = this.j;
                    f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float f38 = f12 / ((float) ((this.f10649i * 6.283185307179586d) / f37));
                    f33 += f38;
                    f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - (f38 * 360.0f);
                } else {
                    f14 = a10;
                    f15 = 1.0f;
                    f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                float f39 = f33 % f15;
                float length2 = (pathMeasure.getLength() * f39) / 2.0f;
                float length3 = (pathMeasure.getLength() * (f39 + f14)) / 2.0f;
                pathMeasure.getSegment(length2, length3, path, true);
                q qVar2 = (q) pair.first;
                qVar2.b();
                pathMeasure.getPosTan(length2, qVar2.f10705a, qVar2.f10706b);
                q qVar3 = (q) pair.second;
                qVar3.b();
                pathMeasure.getPosTan(length3, qVar3.f10705a, qVar3.f10706b);
                Matrix matrix = this.f10712e;
                matrix.reset();
                matrix.setRotate(f17);
                qVar2.c(f17);
                qVar3.c(f17);
                path.transform(matrix);
                canvas2 = canvas;
                paint2 = paint;
                canvas2.drawPath(path, paint2);
            }
            if (!kVar.c() && this.f10647g > f16) {
                paint2.setStyle(Paint.Style.FILL);
                j(canvas2, paint2, (q) pair.first, f23, this.f10646f, 1.0f);
                j(canvas, paint, (q) pair.second, f23, this.f10646f, 1.0f);
            }
        }
    }

    public final void j(Canvas canvas, Paint paint, q qVar, float f3, float f10, float f11) {
        float min = Math.min(f10, this.f10646f);
        float f12 = f3 / 2.0f;
        float min2 = Math.min(f12, (this.f10647g * min) / this.f10646f);
        RectF rectF = new RectF((-f3) / 2.0f, (-min) / 2.0f, f12, min / 2.0f);
        canvas.save();
        float[] fArr = qVar.f10705a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(r.h(qVar.f10706b));
        canvas.scale(f11, f11);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int k() {
        e eVar = this.f10708a;
        return (((k) eVar).f10687q * 2) + ((k) eVar).f10686p;
    }

    @Override // pa.r
    public final void b(Canvas canvas, Paint paint, int i6, int i10) {
    }
}
