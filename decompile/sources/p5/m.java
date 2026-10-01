package p5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f10556p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f10557a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f10558b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f10559c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f10560d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f10561e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f10562f;

    /* renamed from: g, reason: collision with root package name */
    public final j f10563g;

    /* renamed from: h, reason: collision with root package name */
    public float f10564h;

    /* renamed from: i, reason: collision with root package name */
    public float f10565i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f10566k;

    /* renamed from: l, reason: collision with root package name */
    public int f10567l;

    /* renamed from: m, reason: collision with root package name */
    public String f10568m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f10569n;

    /* renamed from: o, reason: collision with root package name */
    public final v.e f10570o;

    /* JADX WARN: Type inference failed for: r0v4, types: [v.l, v.e] */
    public m() {
        this.f10559c = new Matrix();
        this.f10564h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10565i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10566k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10567l = 255;
        this.f10568m = null;
        this.f10569n = null;
        this.f10570o = new v.l(0);
        this.f10563g = new j();
        this.f10557a = new Path();
        this.f10558b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i6, int i10) {
        int i11;
        float f3;
        float f10;
        int i12;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f10543a;
        ArrayList arrayList = jVar.f10544b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f10543a;
        matrix3.preConcat(jVar.j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            k kVar = (k) arrayList.get(i13);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i6, i10);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i6 / this.j;
                float f13 = i10 / this.f10566k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f10559c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c10], fArr[1]);
                i11 = i13;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                if (max > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = Math.abs(f14) / max;
                } else {
                    f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    Path path = this.f10557a;
                    path.reset();
                    l0.e[] eVarArr = lVar.f10553a;
                    if (eVarArr != null) {
                        l0.e.b(eVarArr, path);
                    }
                    Path path2 = this.f10558b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f10555c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f10538i;
                        if (f15 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || iVar.j != 1.0f) {
                            float f16 = iVar.f10539k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.j + f16) % 1.0f;
                            if (this.f10562f == null) {
                                this.f10562f = new PathMeasure();
                            }
                            this.f10562f.setPath(path, false);
                            float length = this.f10562f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f10562f.getSegment(f19, length, path, true);
                                PathMeasure pathMeasure = this.f10562f;
                                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                pathMeasure.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f20, path, true);
                            } else {
                                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                this.f10562f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        b2.k kVar2 = iVar.f10535f;
                        if (((Shader) kVar2.f1384z) != null || kVar2.f1383y != 0) {
                            if (this.f10561e == null) {
                                i12 = 16777215;
                                Paint paint = new Paint(1);
                                this.f10561e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i12 = 16777215;
                            }
                            Paint paint2 = this.f10561e;
                            Shader shader = (Shader) kVar2.f1384z;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f10537h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i14 = kVar2.f1383y;
                                float f21 = iVar.f10537h;
                                PorterDuff.Mode mode = p.G;
                                f11 = 255.0f;
                                paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f10555c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            i12 = 16777215;
                            f11 = 255.0f;
                        }
                        b2.k kVar3 = iVar.f10533d;
                        if (((Shader) kVar3.f1384z) != null || kVar3.f1383y != 0) {
                            if (this.f10560d == null) {
                                Paint paint3 = new Paint(1);
                                this.f10560d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f10560d;
                            Paint.Join join = iVar.f10541m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f10540l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f10542n);
                            Shader shader2 = (Shader) kVar3.f1384z;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f10536g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i15 = kVar3.f1383y;
                                float f22 = iVar.f10536g;
                                PorterDuff.Mode mode2 = p.G;
                                paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f10534e * min * f3);
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
        return this.f10567l;
    }

    public void setAlpha(float f3) {
        setRootAlpha((int) (f3 * 255.0f));
    }

    public void setRootAlpha(int i6) {
        this.f10567l = i6;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [v.l, v.e] */
    public m(m mVar) {
        this.f10559c = new Matrix();
        this.f10564h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10565i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10566k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10567l = 255;
        this.f10568m = null;
        this.f10569n = null;
        ?? lVar = new v.l(0);
        this.f10570o = lVar;
        this.f10563g = new j(mVar.f10563g, lVar);
        this.f10557a = new Path(mVar.f10557a);
        this.f10558b = new Path(mVar.f10558b);
        this.f10564h = mVar.f10564h;
        this.f10565i = mVar.f10565i;
        this.j = mVar.j;
        this.f10566k = mVar.f10566k;
        this.f10567l = mVar.f10567l;
        this.f10568m = mVar.f10568m;
        String str = mVar.f10568m;
        if (str != null) {
            lVar.put(str, this);
        }
        this.f10569n = mVar.f10569n;
    }
}
