package l5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import j5.a0;
import j5.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b {
    public m5.s A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f8226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f8227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v.g f8228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v.g f8229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f8230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m5.j f8233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m5.j f8234y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m5.j f8235z;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(w wVar, r5.a aVar, q5.e eVar) {
        int iC = y.e.c(eVar.f10827h);
        Paint.Cap cap = iC != 0 ? iC != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iC2 = y.e.c(eVar.i);
        super(wVar, aVar, cap, iC2 != 0 ? iC2 != 1 ? iC2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, eVar.f10828j, eVar.f10824d, eVar.f10826g, eVar.f10829k, eVar.f10830l);
        this.f8228s = new v.g();
        this.f8229t = new v.g();
        this.f8230u = new RectF();
        this.f8226q = eVar.f10821a;
        this.f8231v = eVar.f10822b;
        this.f8227r = eVar.f10831m;
        this.f8232w = (int) (wVar.f6908v.b() / 32.0f);
        m5.e eVarF = eVar.f10823c.f();
        this.f8233x = (m5.j) eVarF;
        eVarF.a(this);
        aVar.d(eVarF);
        m5.e eVarF2 = eVar.f10825e.f();
        this.f8234y = (m5.j) eVarF2;
        eVarF2.a(this);
        aVar.d(eVarF2);
        m5.e eVarF3 = eVar.f.f();
        this.f8235z = (m5.j) eVarF3;
        eVarF3.a(this);
        aVar.d(eVarF3);
    }

    public final int[] d(int[] iArr) {
        m5.s sVar = this.A;
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

    @Override // l5.b, l5.f
    public final void e(Canvas canvas, Matrix matrix, int i, v5.a aVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f8227r) {
            return;
        }
        a(this.f8230u, matrix, false);
        int i10 = this.f8231v;
        m5.j jVar = this.f8233x;
        m5.j jVar2 = this.f8235z;
        m5.j jVar3 = this.f8234y;
        if (i10 == 1) {
            long jI = i();
            v.g gVar = this.f8228s;
            shader = (LinearGradient) gVar.d(jI);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                q5.c cVar = (q5.c) jVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, d(cVar.f10813b), cVar.f10812a, Shader.TileMode.CLAMP);
                gVar.h(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            v.g gVar2 = this.f8229t;
            shader = (RadialGradient) gVar2.d(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                q5.c cVar2 = (q5.c) jVar.e();
                int[] iArrD = d(cVar2.f10813b);
                float[] fArr = cVar2.f10812a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrD, fArr, Shader.TileMode.CLAMP);
                gVar2.h(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        this.i.setShader(shader);
        super.e(canvas, matrix, i, aVar);
    }

    @Override // l5.b, o5.f
    public final void g(Object obj, p2.c cVar) {
        super.g(obj, cVar);
        if (obj == a0.J) {
            m5.s sVar = this.A;
            r5.a aVar = this.f;
            if (sVar != null) {
                aVar.o(sVar);
            }
            m5.s sVar2 = new m5.s(null, cVar);
            this.A = sVar2;
            sVar2.a(this);
            aVar.d(this.A);
        }
    }

    @Override // l5.d
    public final String getName() {
        return this.f8226q;
    }

    public final int i() {
        float f = this.f8234y.f8458d;
        float f4 = this.f8232w;
        int iRound = Math.round(f * f4);
        int iRound2 = Math.round(this.f8235z.f8458d * f4);
        int iRound3 = Math.round(this.f8233x.f8458d * f4);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
