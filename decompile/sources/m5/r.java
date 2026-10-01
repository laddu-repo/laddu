package m5;

import android.graphics.Matrix;
import android.graphics.PointF;
import j5.a0;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f8491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f8492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f8493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f8494e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f8499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f8500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f8501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f8502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f8503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f8504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f8505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f8506s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f8507t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f8508u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f8509v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f8510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f8511x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f8490a = new Matrix();
    public float f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f8495g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f8496h = Float.NaN;
    public float i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f8497j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8498k = true;

    public r(p5.d dVar) {
        md.c cVar = dVar.f10385a;
        this.f8499l = cVar == null ? null : cVar.f();
        p5.e eVar = dVar.f10386b;
        this.f8500m = eVar == null ? null : eVar.f();
        p5.a aVar = dVar.f10387c;
        this.f8501n = aVar == null ? null : aVar.f();
        p5.b bVar = dVar.f10388d;
        this.f8502o = bVar == null ? null : bVar.f();
        p5.b bVar2 = dVar.f;
        this.f8504q = bVar2 == null ? null : bVar2.f();
        this.f8511x = dVar.f10395m;
        p5.b bVar3 = dVar.f10391h;
        this.f8506s = bVar3 == null ? null : bVar3.f();
        p5.b bVar4 = dVar.i;
        this.f8507t = bVar4 == null ? null : bVar4.f();
        p5.b bVar5 = dVar.f10392j;
        this.f8508u = bVar5 == null ? null : bVar5.f();
        if (this.f8504q != null) {
            this.f8491b = new Matrix();
            this.f8492c = new Matrix();
            this.f8493d = new Matrix();
            this.f8494e = new float[9];
        } else {
            this.f8491b = null;
            this.f8492c = null;
            this.f8493d = null;
            this.f8494e = null;
        }
        p5.b bVar6 = dVar.f10390g;
        this.f8505r = bVar6 == null ? null : bVar6.f();
        p5.a aVar2 = dVar.f10389e;
        if (aVar2 != null) {
            this.f8503p = aVar2.f();
        }
        p5.b bVar7 = dVar.f10393k;
        if (bVar7 != null) {
            this.f8509v = bVar7.f();
        } else {
            this.f8509v = null;
        }
        p5.b bVar8 = dVar.f10394l;
        if (bVar8 != null) {
            this.f8510w = bVar8.f();
        } else {
            this.f8510w = null;
        }
    }

    public final void a(r5.a aVar) {
        aVar.d(this.f8503p);
        aVar.d(this.f8509v);
        aVar.d(this.f8510w);
        aVar.d(this.f8499l);
        aVar.d(this.f8500m);
        aVar.d(this.f8501n);
        aVar.d(this.f8502o);
        aVar.d(this.f8504q);
        aVar.d(this.f8505r);
        aVar.d(this.f8506s);
        aVar.d(this.f8507t);
        aVar.d(this.f8508u);
    }

    public final void b(a aVar) {
        e eVar = this.f8503p;
        if (eVar != null) {
            eVar.a(aVar);
        }
        e eVar2 = this.f8509v;
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        e eVar3 = this.f8510w;
        if (eVar3 != null) {
            eVar3.a(aVar);
        }
        e eVar4 = this.f8499l;
        if (eVar4 != null) {
            eVar4.a(aVar);
        }
        e eVar5 = this.f8500m;
        if (eVar5 != null) {
            eVar5.a(aVar);
        }
        e eVar6 = this.f8501n;
        if (eVar6 != null) {
            eVar6.a(aVar);
        }
        e eVar7 = this.f8502o;
        if (eVar7 != null) {
            eVar7.a(aVar);
        }
        i iVar = this.f8504q;
        if (iVar != null) {
            iVar.a(aVar);
        }
        i iVar2 = this.f8505r;
        if (iVar2 != null) {
            iVar2.a(aVar);
        }
        i iVar3 = this.f8506s;
        if (iVar3 != null) {
            iVar3.a(aVar);
            this.f8506s.a(new q(0, this));
        }
        i iVar4 = this.f8507t;
        if (iVar4 != null) {
            iVar4.a(aVar);
            this.f8507t.a(new q(1, this));
        }
        i iVar5 = this.f8508u;
        if (iVar5 != null) {
            iVar5.a(aVar);
            this.f8508u.a(new q(2, this));
        }
    }

    public final boolean c(Object obj, p2.c cVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == a0.f6788a) {
            e eVar = this.f8499l;
            if (eVar == null) {
                this.f8499l = new s(new PointF(), cVar);
                return true;
            }
            eVar.j(cVar);
            return true;
        }
        if (obj == a0.f6789b) {
            e eVar2 = this.f8500m;
            if (eVar2 == null) {
                this.f8500m = new s(new PointF(), cVar);
                return true;
            }
            eVar2.j(cVar);
            return true;
        }
        if (obj == a0.f6790c) {
            e eVar3 = this.f8500m;
            if (eVar3 instanceof o) {
                ((o) eVar3).f8484m = cVar;
                return true;
            }
        }
        if (obj == a0.f6791d) {
            e eVar4 = this.f8500m;
            if (eVar4 instanceof o) {
                ((o) eVar4).f8485n = cVar;
                return true;
            }
        }
        if (obj == a0.f6795j) {
            e eVar5 = this.f8501n;
            if (eVar5 == null) {
                this.f8501n = new s(new w5.b(), cVar);
                return true;
            }
            eVar5.j(cVar);
            return true;
        }
        if (obj == a0.f6796k) {
            e eVar6 = this.f8502o;
            if (eVar6 == null) {
                this.f8502o = new s(fValueOf2, cVar);
                return true;
            }
            eVar6.j(cVar);
            return true;
        }
        if (obj == 3) {
            e eVar7 = this.f8503p;
            if (eVar7 == null) {
                this.f8503p = new s(100, cVar);
                return true;
            }
            eVar7.j(cVar);
            return true;
        }
        if (obj == a0.A) {
            e eVar8 = this.f8509v;
            if (eVar8 == null) {
                this.f8509v = new s(fValueOf, cVar);
                return true;
            }
            eVar8.j(cVar);
            return true;
        }
        if (obj == a0.B) {
            e eVar9 = this.f8510w;
            if (eVar9 == null) {
                this.f8510w = new s(fValueOf, cVar);
                return true;
            }
            eVar9.j(cVar);
            return true;
        }
        if (obj == a0.f6800o) {
            if (this.f8504q == null) {
                this.f8504q = new i(Collections.singletonList(new w5.a(fValueOf2)));
            }
            this.f8504q.j(cVar);
            return true;
        }
        if (obj == a0.f6801p) {
            if (this.f8505r == null) {
                this.f8505r = new i(Collections.singletonList(new w5.a(fValueOf2)));
            }
            this.f8505r.j(cVar);
            return true;
        }
        if (obj == a0.f6797l) {
            if (this.f8506s == null) {
                this.f8506s = new i(Collections.singletonList(new w5.a(fValueOf2)));
            }
            this.f8506s.j(cVar);
            return true;
        }
        if (obj == a0.f6798m) {
            if (this.f8507t == null) {
                this.f8507t = new i(Collections.singletonList(new w5.a(fValueOf2)));
            }
            this.f8507t.j(cVar);
            return true;
        }
        if (obj != a0.f6799n) {
            return false;
        }
        if (this.f8508u == null) {
            this.f8508u = new i(Collections.singletonList(new w5.a(fValueOf2)));
        }
        this.f8508u.j(cVar);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.f8494e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        i iVar;
        i iVar2;
        PointF pointF;
        w5.b bVar;
        PointF pointF2;
        Matrix matrix = this.f8490a;
        matrix.reset();
        i iVar3 = this.f8506s;
        if ((iVar3 == null || iVar3.l() == 0.0f) && (((iVar = this.f8507t) == null || iVar.l() == 0.0f) && ((iVar2 = this.f8508u) == null || iVar2.l() == 0.0f))) {
            e eVar = this.f8500m;
            if (eVar != null && (pointF2 = (PointF) eVar.e()) != null) {
                float f = pointF2.x;
                if (f != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.f8511x) {
                e eVar2 = this.f8502o;
                if (eVar2 != null) {
                    float fFloatValue = eVar2 instanceof s ? ((Float) eVar2.e()).floatValue() : ((i) eVar2).l();
                    if (fFloatValue != 0.0f) {
                        matrix.preRotate(fFloatValue);
                    }
                }
            } else if (eVar != null) {
                float f4 = eVar.f8458d;
                PointF pointF3 = (PointF) eVar.e();
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                eVar.i(1.0E-4f + f4);
                PointF pointF4 = (PointF) eVar.e();
                eVar.i(f4);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f11, pointF4.x - f10)));
            }
            if (this.f8504q != null) {
                float fCos = this.f8505r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
                float fSin = this.f8505r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(r1.l()));
                d();
                float[] fArr = this.f8494e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f12 = -fSin;
                fArr[3] = f12;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f8491b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f8492c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = fCos;
                fArr[1] = f12;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f8493d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            e eVar3 = this.f8501n;
            if (eVar3 != null && (bVar = (w5.b) eVar3.e()) != null) {
                float f13 = bVar.f13911a;
                if (f13 != 1.0f || bVar.f13912b != 1.0f) {
                    matrix.preScale(f13, bVar.f13912b);
                }
            }
            e eVar4 = this.f8499l;
            if (eVar4 != null && (pointF = (PointF) eVar4.e()) != null) {
                float f14 = pointF.x;
                if (f14 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f14, -pointF.y);
                }
            }
        } else {
            i iVar4 = this.f8506s;
            float fL = iVar4 != null ? iVar4.l() : 0.0f;
            i iVar5 = this.f8507t;
            float fL2 = iVar5 != null ? iVar5.l() : 0.0f;
            i iVar6 = this.f8508u;
            float fL3 = iVar6 != null ? iVar6.l() : 0.0f;
            if (this.f8498k || fL != this.f || fL2 != this.f8495g || fL3 != this.f8496h) {
                this.f = fL;
                this.f8495g = fL2;
                this.f8496h = fL3;
                if (fL != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(fL));
                } else {
                    this.i = 1.0f;
                }
                if (fL2 != 0.0f) {
                    this.f8497j = (float) Math.cos(Math.toRadians(fL2));
                } else {
                    this.f8497j = 1.0f;
                }
                this.f8498k = false;
            }
            e eVar5 = this.f8499l;
            PointF pointF5 = eVar5 == null ? null : (PointF) eVar5.e();
            e eVar6 = this.f8500m;
            PointF pointF6 = eVar6 == null ? null : (PointF) eVar6.e();
            e eVar7 = this.f8501n;
            w5.b bVar2 = eVar7 != null ? (w5.b) eVar7.e() : null;
            float f15 = bVar2 != null ? bVar2.f13911a : 1.0f;
            float f16 = bVar2 != null ? bVar2.f13912b : 1.0f;
            float f17 = this.i;
            float f18 = this.f8497j;
            matrix.reset();
            if (pointF6 != null) {
                float f19 = pointF6.x;
                if (f19 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f19, pointF6.y);
                }
            }
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(f18, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, f17);
            }
            if (f15 != 1.0f || f16 != 1.0f) {
                matrix.preScale(f15, f16);
            }
            if (pointF5 != null) {
                float f20 = pointF5.x;
                if (f20 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f20, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        e eVar = this.f8500m;
        PointF pointF = eVar == null ? null : (PointF) eVar.e();
        e eVar2 = this.f8501n;
        w5.b bVar = eVar2 == null ? null : (w5.b) eVar2.e();
        e eVar3 = this.f8499l;
        PointF pointF2 = eVar3 != null ? (PointF) eVar3.e() : null;
        Matrix matrix = this.f8490a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        i iVar = this.f8506s;
        float fL = iVar != null ? iVar.l() * f : 0.0f;
        i iVar2 = this.f8507t;
        float fL2 = iVar2 != null ? iVar2.l() * f : 0.0f;
        i iVar3 = this.f8508u;
        float fL3 = iVar3 != null ? iVar3.l() * f : 0.0f;
        if (fL == 0.0f && fL2 == 0.0f && fL3 == 0.0f) {
            e eVar4 = this.f8502o;
            if (eVar4 != null) {
                matrix.preRotate(((Float) eVar4.e()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fL != 0.0f ? (float) Math.cos(Math.toRadians(fL)) : 1.0f;
            float fCos2 = fL2 != 0.0f ? (float) Math.cos(Math.toRadians(fL2)) : 1.0f;
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (bVar != null) {
            double d10 = f;
            matrix.preScale((float) Math.pow(bVar.f13911a, d10), (float) Math.pow(bVar.f13912b, d10));
        }
        return matrix;
    }
}
