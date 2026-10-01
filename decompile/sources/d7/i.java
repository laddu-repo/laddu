package d7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import b7.c0;
import b7.y;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements f, e7.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final String f3881a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3882b;

    /* renamed from: c, reason: collision with root package name */
    public final j7.a f3883c;

    /* renamed from: d, reason: collision with root package name */
    public final v.i f3884d = new v.i();

    /* renamed from: e, reason: collision with root package name */
    public final v.i f3885e = new v.i();

    /* renamed from: f, reason: collision with root package name */
    public final Path f3886f;

    /* renamed from: g, reason: collision with root package name */
    public final c7.a f3887g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f3888h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3889i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final e7.j f3890k;

    /* renamed from: l, reason: collision with root package name */
    public final e7.f f3891l;

    /* renamed from: m, reason: collision with root package name */
    public final e7.j f3892m;

    /* renamed from: n, reason: collision with root package name */
    public final e7.j f3893n;

    /* renamed from: o, reason: collision with root package name */
    public e7.s f3894o;

    /* renamed from: p, reason: collision with root package name */
    public e7.s f3895p;

    /* renamed from: q, reason: collision with root package name */
    public final y f3896q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3897r;
    public e7.e s;

    /* renamed from: t, reason: collision with root package name */
    public float f3898t;

    public i(y yVar, b7.j jVar, j7.a aVar, i7.d dVar) {
        Path path = new Path();
        this.f3886f = path;
        this.f3887g = new c7.a(1, 0);
        this.f3888h = new RectF();
        this.f3889i = new ArrayList();
        this.f3898t = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f3883c = aVar;
        this.f3881a = dVar.f6638g;
        this.f3882b = dVar.f6639h;
        this.f3896q = yVar;
        this.j = dVar.f6632a;
        path.setFillType(dVar.f6633b);
        this.f3897r = (int) (jVar.b() / 32.0f);
        e7.e G0 = dVar.f6634c.G0();
        this.f3890k = (e7.j) G0;
        G0.a(this);
        aVar.f(G0);
        e7.e G02 = dVar.f6635d.G0();
        this.f3891l = (e7.f) G02;
        G02.a(this);
        aVar.f(G02);
        e7.e G03 = dVar.f6636e.G0();
        this.f3892m = (e7.j) G03;
        G03.a(this);
        aVar.f(G03);
        e7.e G04 = dVar.f6637f.G0();
        this.f3893n = (e7.j) G04;
        G04.a(this);
        aVar.f(G04);
        if (aVar.l() != null) {
            e7.i G05 = ((h7.b) aVar.l().f7747y).G0();
            this.s = G05;
            G05.a(this);
            aVar.f(this.s);
        }
    }

    @Override // e7.a
    public final void a() {
        this.f3896q.invalidateSelf();
    }

    @Override // d7.d
    public final void b(List list, List list2) {
        for (int i6 = 0; i6 < list2.size(); i6++) {
            d dVar = (d) list2.get(i6);
            if (dVar instanceof n) {
                this.f3889i.add((n) dVar);
            }
        }
    }

    @Override // d7.f
    public final void c(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        float[] fArr;
        int[] iArr;
        float f3;
        Shader shader;
        int[] iArr2;
        if (this.f3882b) {
            return;
        }
        Path path = this.f3886f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3889i;
            if (i10 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i10)).g(), matrix);
            i10++;
        }
        path.computeBounds(this.f3888h, false);
        int i11 = this.j;
        e7.j jVar = this.f3890k;
        e7.j jVar2 = this.f3893n;
        e7.j jVar3 = this.f3892m;
        if (i11 == 1) {
            long i12 = i();
            v.i iVar = this.f3884d;
            shader = (LinearGradient) iVar.d(i12);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                i7.c cVar = (i7.c) jVar.e();
                int[] f10 = f(cVar.f6631b);
                float[] fArr2 = cVar.f6630a;
                if (f10.length < 2) {
                    int[] iArr3 = {f10[0], f10[0]};
                    fArr2 = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
                    iArr2 = iArr3;
                } else {
                    iArr2 = f10;
                }
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                iVar.h(i12, shader);
            }
        } else {
            long i13 = i();
            v.i iVar2 = this.f3885e;
            RadialGradient radialGradient = (RadialGradient) iVar2.d(i13);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                i7.c cVar2 = (i7.c) jVar.e();
                int[] f11 = f(cVar2.f6631b);
                float[] fArr3 = cVar2.f6630a;
                if (f11.length < 2) {
                    iArr = new int[]{f11[0], f11[0]};
                    fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = f11;
                }
                float f12 = pointF3.x;
                float f13 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f12, pointF4.y - f13);
                if (hypot <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = 0.001f;
                } else {
                    f3 = hypot;
                }
                RadialGradient radialGradient2 = new RadialGradient(f12, f13, f3, iArr, fArr, Shader.TileMode.CLAMP);
                iVar2.h(i13, radialGradient2);
                shader = radialGradient2;
            }
        }
        shader.setLocalMatrix(matrix);
        c7.a aVar2 = this.f3887g;
        aVar2.setShader(shader);
        e7.s sVar = this.f3894o;
        if (sVar != null) {
            aVar2.setColorFilter((ColorFilter) sVar.e());
        }
        e7.e eVar = this.s;
        if (eVar != null) {
            float floatValue = ((Float) eVar.e()).floatValue();
            if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                aVar2.setMaskFilter(null);
            } else if (floatValue != this.f3898t) {
                aVar2.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f3898t = floatValue;
        }
        float intValue = ((Integer) this.f3891l.e()).intValue() / 100.0f;
        aVar2.setAlpha(n7.g.c((int) (i6 * intValue)));
        if (aVar != null) {
            aVar.a((int) (intValue * 255.0f), aVar2);
        }
        canvas.drawPath(path, aVar2);
    }

    @Override // g7.f
    public final void d(f0 f0Var, Object obj) {
        PointF pointF = c0.f1490a;
        if (obj == 4) {
            this.f3891l.j(f0Var);
            return;
        }
        ColorFilter colorFilter = c0.I;
        j7.a aVar = this.f3883c;
        if (obj == colorFilter) {
            e7.s sVar = this.f3894o;
            if (sVar != null) {
                aVar.o(sVar);
            }
            e7.s sVar2 = new e7.s(f0Var, null);
            this.f3894o = sVar2;
            sVar2.a(this);
            aVar.f(this.f3894o);
            return;
        }
        if (obj == c0.J) {
            e7.s sVar3 = this.f3895p;
            if (sVar3 != null) {
                aVar.o(sVar3);
            }
            this.f3884d.b();
            this.f3885e.b();
            e7.s sVar4 = new e7.s(f0Var, null);
            this.f3895p = sVar4;
            sVar4.a(this);
            aVar.f(this.f3895p);
            return;
        }
        if (obj == c0.f1494e) {
            e7.e eVar = this.s;
            if (eVar != null) {
                eVar.j(f0Var);
                return;
            }
            e7.s sVar5 = new e7.s(f0Var, null);
            this.s = sVar5;
            sVar5.a(this);
            aVar.f(this.s);
        }
    }

    @Override // d7.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f3886f;
        path.reset();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f3889i;
            if (i6 < arrayList.size()) {
                path.addPath(((n) arrayList.get(i6)).g(), matrix);
                i6++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final int[] f(int[] iArr) {
        e7.s sVar = this.f3895p;
        if (sVar != null) {
            Integer[] numArr = (Integer[]) sVar.e();
            int i6 = 0;
            if (iArr.length == numArr.length) {
                while (i6 < iArr.length) {
                    iArr[i6] = numArr[i6].intValue();
                    i6++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i6 < numArr.length) {
                    iArr[i6] = numArr[i6].intValue();
                    i6++;
                }
            }
        }
        return iArr;
    }

    @Override // d7.d
    public final String getName() {
        return this.f3881a;
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        n7.g.g(eVar, i6, arrayList, eVar2, this);
    }

    public final int i() {
        int i6;
        float f3 = this.f3892m.f4407d;
        float f10 = this.f3897r;
        int round = Math.round(f3 * f10);
        int round2 = Math.round(this.f3893n.f4407d * f10);
        int round3 = Math.round(this.f3890k.f4407d * f10);
        if (round != 0) {
            i6 = 527 * round;
        } else {
            i6 = 17;
        }
        if (round2 != 0) {
            i6 = i6 * 31 * round2;
        }
        if (round3 != 0) {
            return i6 * 31 * round3;
        }
        return i6;
    }
}
