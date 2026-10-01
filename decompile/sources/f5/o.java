package f5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f5262p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f5263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f5264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f5265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f5266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f5267e;
    public PathMeasure f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f5268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5269h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f5271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f5274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v.e f5275o;

    public o() {
        this.f5265c = new Matrix();
        this.f5269h = 0.0f;
        this.i = 0.0f;
        this.f5270j = 0.0f;
        this.f5271k = 0.0f;
        this.f5272l = 255;
        this.f5273m = null;
        this.f5274n = null;
        this.f5275o = new v.e(0);
        this.f5268g = new l();
        this.f5263a = new Path();
        this.f5264b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(l lVar, Matrix matrix, Canvas canvas, int i, int i10) {
        int i11;
        float f;
        int i12;
        float f4;
        Matrix matrix2 = lVar.f5250a;
        ArrayList arrayList = lVar.f5251b;
        matrix2.set(matrix);
        Matrix matrix3 = lVar.f5250a;
        matrix3.preConcat(lVar.f5257j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            m mVar = (m) arrayList.get(i13);
            if (mVar instanceof l) {
                a((l) mVar, matrix3, canvas, i, i10);
            } else if (mVar instanceof n) {
                n nVar = (n) mVar;
                float f10 = i / this.f5270j;
                float f11 = i10 / this.f5271k;
                float fMin = Math.min(f10, f11);
                Matrix matrix4 = this.f5265c;
                matrix4.set(matrix3);
                matrix4.postScale(f10, f11);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                boolean z2 = c10;
                i11 = i13;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f12 = (fArr[z2 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f12) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f5263a;
                    path.reset();
                    l0.e[] eVarArr = nVar.f5259a;
                    if (eVarArr != null) {
                        l0.e.b(eVarArr, path);
                    }
                    Path path2 = this.f5264b;
                    path2.reset();
                    if (nVar instanceof j) {
                        path2.setFillType(nVar.f5261c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        k kVar = (k) nVar;
                        float f13 = kVar.i;
                        if (f13 != 0.0f || kVar.f5245j != 1.0f) {
                            float f14 = kVar.f5246k;
                            float f15 = (f13 + f14) % 1.0f;
                            float f16 = (kVar.f5245j + f14) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z2);
                            float length = this.f.getLength();
                            float f17 = f15 * length;
                            float f18 = f16 * length;
                            path.reset();
                            if (f17 > f18) {
                                this.f.getSegment(f17, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f18, path, true);
                            } else {
                                f = 0.0f;
                                this.f.getSegment(f17, f18, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        b3.a aVar = kVar.f;
                        if (((Shader) aVar.f1529x) == null && aVar.f1528w == 0) {
                            f4 = 255.0f;
                            i12 = 16777215;
                        } else {
                            if (this.f5267e == null) {
                                i12 = 16777215;
                                Paint paint = new Paint(1);
                                this.f5267e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i12 = 16777215;
                            }
                            Paint paint2 = this.f5267e;
                            Shader shader = (Shader) aVar.f1529x;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(kVar.f5244h * 255.0f));
                                f4 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i14 = aVar.f1528w;
                                float f19 = kVar.f5244h;
                                PorterDuff.Mode mode = r.E;
                                f4 = 255.0f;
                                paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f19)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(kVar.f5261c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        b3.a aVar2 = kVar.f5241d;
                        if (((Shader) aVar2.f1529x) != null || aVar2.f1528w != 0) {
                            if (this.f5266d == null) {
                                Paint paint3 = new Paint(1);
                                this.f5266d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f5266d;
                            Paint.Join join = kVar.f5248m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = kVar.f5247l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(kVar.f5249n);
                            Shader shader2 = (Shader) aVar2.f1529x;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(kVar.f5243g * f4));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i15 = aVar2.f1528w;
                                float f20 = kVar.f5243g;
                                PorterDuff.Mode mode2 = r.E;
                                paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f20)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(kVar.f5242e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i13 = i11 + 1;
                c10 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f5272l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f5272l = i;
    }

    public o(o oVar) {
        this.f5265c = new Matrix();
        this.f5269h = 0.0f;
        this.i = 0.0f;
        this.f5270j = 0.0f;
        this.f5271k = 0.0f;
        this.f5272l = 255;
        this.f5273m = null;
        this.f5274n = null;
        v.e eVar = new v.e(0);
        this.f5275o = eVar;
        this.f5268g = new l(oVar.f5268g, eVar);
        this.f5263a = new Path(oVar.f5263a);
        this.f5264b = new Path(oVar.f5264b);
        this.f5269h = oVar.f5269h;
        this.i = oVar.i;
        this.f5270j = oVar.f5270j;
        this.f5271k = oVar.f5271k;
        this.f5272l = oVar.f5272l;
        this.f5273m = oVar.f5273m;
        String str = oVar.f5273m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f5274n = oVar.f5274n;
    }
}
