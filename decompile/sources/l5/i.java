package l5;

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
import j5.a0;
import j5.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f, m5.a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5.a f8210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v.g f8211d = new v.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v.g f8212e = new v.g();
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k5.a f8213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f8214h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m5.j f8216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m5.f f8217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m5.j f8218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m5.j f8219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m5.s f8220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m5.s f8221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f8222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m5.e f8224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f8225t;

    public i(w wVar, j5.j jVar, r5.a aVar, q5.d dVar) {
        Path path = new Path();
        this.f = path;
        this.f8213g = new k5.a(1, 0);
        this.f8214h = new RectF();
        this.i = new ArrayList();
        this.f8225t = 0.0f;
        this.f8210c = aVar;
        this.f8208a = dVar.f10819g;
        this.f8209b = dVar.f10820h;
        this.f8222q = wVar;
        this.f8215j = dVar.f10814a;
        path.setFillType(dVar.f10815b);
        this.f8223r = (int) (jVar.b() / 32.0f);
        m5.e eVarF = dVar.f10816c.f();
        this.f8216k = (m5.j) eVarF;
        eVarF.a(this);
        aVar.d(eVarF);
        m5.e eVarF2 = dVar.f10817d.f();
        this.f8217l = (m5.f) eVarF2;
        eVarF2.a(this);
        aVar.d(eVarF2);
        m5.e eVarF3 = dVar.f10818e.f();
        this.f8218m = (m5.j) eVarF3;
        eVarF3.a(this);
        aVar.d(eVarF3);
        m5.e eVarF4 = dVar.f.f();
        this.f8219n = (m5.j) eVarF4;
        eVarF4.a(this);
        aVar.d(eVarF4);
        if (aVar.l() != null) {
            m5.i iVarF = ((p5.b) aVar.l().f7607v).f();
            this.f8224s = iVarF;
            iVarF.a(this);
            aVar.d(this.f8224s);
        }
    }

    @Override // l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i)).f(), matrix);
                i++;
            }
        }
    }

    @Override // m5.a
    public final void b() {
        this.f8222q.invalidateSelf();
    }

    @Override // l5.d
    public final void c(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            d dVar = (d) list2.get(i);
            if (dVar instanceof n) {
                this.i.add((n) dVar);
            }
        }
    }

    public final int[] d(int[] iArr) {
        m5.s sVar = this.f8221p;
        if (sVar != null) {
            Integer[] numArr = (Integer[]) sVar.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // l5.f
    public final void e(Canvas canvas, Matrix matrix, int i, v5.a aVar) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.f8209b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i10 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i10)).f(), matrix);
            i10++;
        }
        path.computeBounds(this.f8214h, false);
        int i11 = this.f8215j;
        m5.j jVar = this.f8216k;
        m5.j jVar2 = this.f8219n;
        m5.j jVar3 = this.f8218m;
        if (i11 == 1) {
            long jI = i();
            v.g gVar = this.f8211d;
            linearGradient = (LinearGradient) gVar.d(jI);
            if (linearGradient == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                q5.c cVar = (q5.c) jVar.e();
                int[] iArrD = d(cVar.f10813b);
                float[] fArr2 = cVar.f10812a;
                if (iArrD.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrD[0], iArrD[0]};
                } else {
                    iArr2 = iArrD;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                gVar.h(jI, linearGradient);
            }
        } else {
            long jI2 = i();
            v.g gVar2 = this.f8212e;
            RadialGradient radialGradient = (RadialGradient) gVar2.d(jI2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                q5.c cVar2 = (q5.c) jVar.e();
                int[] iArrD2 = d(cVar2.f10813b);
                float[] fArr3 = cVar2.f10812a;
                if (iArrD2.length < 2) {
                    iArr = new int[]{iArrD2[0], iArrD2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrD2;
                }
                float f = pointF3.x;
                float f4 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f4);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f4, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                gVar2.h(jI2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        k5.a aVar2 = this.f8213g;
        aVar2.setShader(linearGradient);
        m5.s sVar = this.f8220o;
        if (sVar != null) {
            aVar2.setColorFilter((ColorFilter) sVar.e());
        }
        m5.e eVar = this.f8224s;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (fFloatValue != this.f8225t) {
                aVar2.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f8225t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f8217l.e()).intValue() / 100.0f;
        aVar2.setAlpha(v5.g.c((int) (i * fIntValue)));
        if (aVar != null) {
            aVar.a((int) (fIntValue * 255.0f), aVar2);
        }
        canvas.drawPath(path, aVar2);
    }

    @Override // o5.f
    public final void g(Object obj, p2.c cVar) {
        PointF pointF = a0.f6788a;
        if (obj == 4) {
            this.f8217l.j(cVar);
            return;
        }
        ColorFilter colorFilter = a0.I;
        r5.a aVar = this.f8210c;
        if (obj == colorFilter) {
            m5.s sVar = this.f8220o;
            if (sVar != null) {
                aVar.o(sVar);
            }
            m5.s sVar2 = new m5.s(null, cVar);
            this.f8220o = sVar2;
            sVar2.a(this);
            aVar.d(this.f8220o);
            return;
        }
        if (obj == a0.J) {
            m5.s sVar3 = this.f8221p;
            if (sVar3 != null) {
                aVar.o(sVar3);
            }
            this.f8211d.b();
            this.f8212e.b();
            m5.s sVar4 = new m5.s(null, cVar);
            this.f8221p = sVar4;
            sVar4.a(this);
            aVar.d(this.f8221p);
            return;
        }
        if (obj == a0.f6792e) {
            m5.e eVar = this.f8224s;
            if (eVar != null) {
                eVar.j(cVar);
                return;
            }
            m5.s sVar5 = new m5.s(null, cVar);
            this.f8224s = sVar5;
            sVar5.a(this);
            aVar.d(this.f8224s);
        }
    }

    @Override // l5.d
    public final String getName() {
        return this.f8208a;
    }

    @Override // o5.f
    public final void h(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        v5.g.g(eVar, i, arrayList, eVar2, this);
    }

    public final int i() {
        float f = this.f8218m.f8458d;
        float f4 = this.f8223r;
        int iRound = Math.round(f * f4);
        int iRound2 = Math.round(this.f8219n.f8458d * f4);
        int iRound3 = Math.round(this.f8216k.f8458d * f4);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
