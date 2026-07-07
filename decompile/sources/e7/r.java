package e7;

import android.graphics.Matrix;
import android.graphics.PointF;
import b7.c0;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.Collections;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f4440b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f4441c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f4442d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f4443e;

    /* renamed from: l, reason: collision with root package name */
    public e f4449l;

    /* renamed from: m, reason: collision with root package name */
    public e f4450m;

    /* renamed from: n, reason: collision with root package name */
    public e f4451n;

    /* renamed from: o, reason: collision with root package name */
    public e f4452o;

    /* renamed from: p, reason: collision with root package name */
    public e f4453p;

    /* renamed from: q, reason: collision with root package name */
    public i f4454q;

    /* renamed from: r, reason: collision with root package name */
    public i f4455r;
    public i s;

    /* renamed from: t, reason: collision with root package name */
    public i f4456t;

    /* renamed from: u, reason: collision with root package name */
    public i f4457u;

    /* renamed from: v, reason: collision with root package name */
    public e f4458v;

    /* renamed from: w, reason: collision with root package name */
    public e f4459w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4460x;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f4439a = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public float f4444f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f4445g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f4446h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f4447i = 1.0f;
    public float j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4448k = true;

    public r(h7.d dVar) {
        e G0;
        e G02;
        e G03;
        i G04;
        i G05;
        i G06;
        i G07;
        i G08;
        i G09;
        d7.c cVar = dVar.f5983a;
        if (cVar == null) {
            G0 = null;
        } else {
            G0 = cVar.G0();
        }
        this.f4449l = G0;
        h7.e eVar = dVar.f5984b;
        if (eVar == null) {
            G02 = null;
        } else {
            G02 = eVar.G0();
        }
        this.f4450m = G02;
        h7.a aVar = dVar.f5985c;
        if (aVar == null) {
            G03 = null;
        } else {
            G03 = aVar.G0();
        }
        this.f4451n = G03;
        h7.b bVar = dVar.f5986d;
        if (bVar == null) {
            G04 = null;
        } else {
            G04 = bVar.G0();
        }
        this.f4452o = G04;
        h7.b bVar2 = dVar.f5988f;
        if (bVar2 == null) {
            G05 = null;
        } else {
            G05 = bVar2.G0();
        }
        this.f4454q = G05;
        this.f4460x = dVar.f5994m;
        h7.b bVar3 = dVar.f5990h;
        if (bVar3 == null) {
            G06 = null;
        } else {
            G06 = bVar3.G0();
        }
        this.s = G06;
        h7.b bVar4 = dVar.f5991i;
        if (bVar4 == null) {
            G07 = null;
        } else {
            G07 = bVar4.G0();
        }
        this.f4456t = G07;
        h7.b bVar5 = dVar.j;
        if (bVar5 == null) {
            G08 = null;
        } else {
            G08 = bVar5.G0();
        }
        this.f4457u = G08;
        if (this.f4454q != null) {
            this.f4440b = new Matrix();
            this.f4441c = new Matrix();
            this.f4442d = new Matrix();
            this.f4443e = new float[9];
        } else {
            this.f4440b = null;
            this.f4441c = null;
            this.f4442d = null;
            this.f4443e = null;
        }
        h7.b bVar6 = dVar.f5989g;
        if (bVar6 == null) {
            G09 = null;
        } else {
            G09 = bVar6.G0();
        }
        this.f4455r = G09;
        h7.a aVar2 = dVar.f5987e;
        if (aVar2 != null) {
            this.f4453p = aVar2.G0();
        }
        h7.b bVar7 = dVar.f5992k;
        if (bVar7 != null) {
            this.f4458v = bVar7.G0();
        } else {
            this.f4458v = null;
        }
        h7.b bVar8 = dVar.f5993l;
        if (bVar8 != null) {
            this.f4459w = bVar8.G0();
        } else {
            this.f4459w = null;
        }
    }

    public final void a(j7.a aVar) {
        aVar.f(this.f4453p);
        aVar.f(this.f4458v);
        aVar.f(this.f4459w);
        aVar.f(this.f4449l);
        aVar.f(this.f4450m);
        aVar.f(this.f4451n);
        aVar.f(this.f4452o);
        aVar.f(this.f4454q);
        aVar.f(this.f4455r);
        aVar.f(this.s);
        aVar.f(this.f4456t);
        aVar.f(this.f4457u);
    }

    public final void b(a aVar) {
        e eVar = this.f4453p;
        if (eVar != null) {
            eVar.a(aVar);
        }
        e eVar2 = this.f4458v;
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        e eVar3 = this.f4459w;
        if (eVar3 != null) {
            eVar3.a(aVar);
        }
        e eVar4 = this.f4449l;
        if (eVar4 != null) {
            eVar4.a(aVar);
        }
        e eVar5 = this.f4450m;
        if (eVar5 != null) {
            eVar5.a(aVar);
        }
        e eVar6 = this.f4451n;
        if (eVar6 != null) {
            eVar6.a(aVar);
        }
        e eVar7 = this.f4452o;
        if (eVar7 != null) {
            eVar7.a(aVar);
        }
        i iVar = this.f4454q;
        if (iVar != null) {
            iVar.a(aVar);
        }
        i iVar2 = this.f4455r;
        if (iVar2 != null) {
            iVar2.a(aVar);
        }
        i iVar3 = this.s;
        if (iVar3 != null) {
            iVar3.a(aVar);
            this.s.a(new q(this, 0));
        }
        i iVar4 = this.f4456t;
        if (iVar4 != null) {
            iVar4.a(aVar);
            this.f4456t.a(new q(this, 1));
        }
        i iVar5 = this.f4457u;
        if (iVar5 != null) {
            iVar5.a(aVar);
            this.f4457u.a(new q(this, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [e7.i, e7.e] */
    /* JADX WARN: Type inference failed for: r6v15, types: [e7.i, e7.e] */
    /* JADX WARN: Type inference failed for: r6v3, types: [e7.i, e7.e] */
    /* JADX WARN: Type inference failed for: r6v6, types: [e7.i, e7.e] */
    /* JADX WARN: Type inference failed for: r6v9, types: [e7.i, e7.e] */
    public final boolean c(f0 f0Var, Object obj) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (obj == c0.f1490a) {
            e eVar = this.f4449l;
            if (eVar == null) {
                this.f4449l = new s(f0Var, new PointF());
                return true;
            }
            eVar.j(f0Var);
            return true;
        }
        if (obj == c0.f1491b) {
            e eVar2 = this.f4450m;
            if (eVar2 == null) {
                this.f4450m = new s(f0Var, new PointF());
                return true;
            }
            eVar2.j(f0Var);
            return true;
        }
        if (obj == c0.f1492c) {
            e eVar3 = this.f4450m;
            if (eVar3 instanceof o) {
                ((o) eVar3).f4435m = f0Var;
                return true;
            }
        }
        if (obj == c0.f1493d) {
            e eVar4 = this.f4450m;
            if (eVar4 instanceof o) {
                ((o) eVar4).f4436n = f0Var;
                return true;
            }
        }
        if (obj == c0.j) {
            e eVar5 = this.f4451n;
            if (eVar5 == null) {
                this.f4451n = new s(f0Var, new o7.c());
                return true;
            }
            eVar5.j(f0Var);
            return true;
        }
        if (obj == c0.f1499k) {
            e eVar6 = this.f4452o;
            if (eVar6 == null) {
                this.f4452o = new s(f0Var, valueOf2);
                return true;
            }
            eVar6.j(f0Var);
            return true;
        }
        if (obj == 3) {
            e eVar7 = this.f4453p;
            if (eVar7 == null) {
                this.f4453p = new s(f0Var, 100);
                return true;
            }
            eVar7.j(f0Var);
            return true;
        }
        if (obj == c0.A) {
            e eVar8 = this.f4458v;
            if (eVar8 == null) {
                this.f4458v = new s(f0Var, valueOf);
                return true;
            }
            eVar8.j(f0Var);
            return true;
        }
        if (obj == c0.B) {
            e eVar9 = this.f4459w;
            if (eVar9 == null) {
                this.f4459w = new s(f0Var, valueOf);
                return true;
            }
            eVar9.j(f0Var);
            return true;
        }
        if (obj == c0.f1503o) {
            if (this.f4454q == null) {
                this.f4454q = new e(Collections.singletonList(new o7.a(valueOf2)));
            }
            this.f4454q.j(f0Var);
            return true;
        }
        if (obj == c0.f1504p) {
            if (this.f4455r == null) {
                this.f4455r = new e(Collections.singletonList(new o7.a(valueOf2)));
            }
            this.f4455r.j(f0Var);
            return true;
        }
        if (obj == c0.f1500l) {
            if (this.s == null) {
                this.s = new e(Collections.singletonList(new o7.a(valueOf2)));
            }
            this.s.j(f0Var);
            return true;
        }
        if (obj == c0.f1501m) {
            if (this.f4456t == null) {
                this.f4456t = new e(Collections.singletonList(new o7.a(valueOf2)));
            }
            this.f4456t.j(f0Var);
            return true;
        }
        if (obj == c0.f1502n) {
            if (this.f4457u == null) {
                this.f4457u = new e(Collections.singletonList(new o7.a(valueOf2)));
            }
            this.f4457u.j(f0Var);
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i6 = 0; i6 < 9; i6++) {
            this.f4443e[i6] = 0.0f;
        }
    }

    public final Matrix e() {
        i iVar;
        i iVar2;
        float l10;
        PointF pointF;
        o7.c cVar;
        float cos;
        float sin;
        PointF pointF2;
        float f3;
        float f10;
        float f11;
        PointF pointF3;
        PointF pointF4;
        float f12;
        float f13;
        Matrix matrix = this.f4439a;
        matrix.reset();
        i iVar3 = this.s;
        if ((iVar3 != null && iVar3.l() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || (((iVar = this.f4456t) != null && iVar.l() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || ((iVar2 = this.f4457u) != null && iVar2.l() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
            i iVar4 = this.s;
            if (iVar4 != null) {
                f3 = iVar4.l();
            } else {
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            i iVar5 = this.f4456t;
            if (iVar5 != null) {
                f10 = iVar5.l();
            } else {
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            i iVar6 = this.f4457u;
            if (iVar6 != null) {
                f11 = iVar6.l();
            } else {
                f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (this.f4448k || f3 != this.f4444f || f10 != this.f4445g || f11 != this.f4446h) {
                this.f4444f = f3;
                this.f4445g = f10;
                this.f4446h = f11;
                if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.f4447i = (float) Math.cos(Math.toRadians(f3));
                } else {
                    this.f4447i = 1.0f;
                }
                if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.j = (float) Math.cos(Math.toRadians(f10));
                } else {
                    this.j = 1.0f;
                }
                this.f4448k = false;
            }
            e eVar = this.f4449l;
            o7.c cVar2 = null;
            if (eVar == null) {
                pointF3 = null;
            } else {
                pointF3 = (PointF) eVar.e();
            }
            e eVar2 = this.f4450m;
            if (eVar2 == null) {
                pointF4 = null;
            } else {
                pointF4 = (PointF) eVar2.e();
            }
            e eVar3 = this.f4451n;
            if (eVar3 != null) {
                cVar2 = (o7.c) eVar3.e();
            }
            if (cVar2 != null) {
                f12 = cVar2.f10034a;
            } else {
                f12 = 1.0f;
            }
            if (cVar2 != null) {
                f13 = cVar2.f10035b;
            } else {
                f13 = 1.0f;
            }
            float f14 = this.f4447i;
            float f15 = this.j;
            matrix.reset();
            if (pointF4 != null) {
                float f16 = pointF4.x;
                if (f16 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF4.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(f16, pointF4.y);
                }
            }
            if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preRotate(f11);
            }
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(f15, 1.0f);
            }
            if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(1.0f, f14);
            }
            if (f12 != 1.0f || f13 != 1.0f) {
                matrix.preScale(f12, f13);
            }
            if (pointF3 != null) {
                float f17 = pointF3.x;
                if (f17 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF3.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(-f17, -pointF3.y);
                    return matrix;
                }
            }
        } else {
            e eVar4 = this.f4450m;
            if (eVar4 != null && (pointF2 = (PointF) eVar4.e()) != null) {
                float f18 = pointF2.x;
                if (f18 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF2.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(f18, pointF2.y);
                }
            }
            if (this.f4460x) {
                if (eVar4 != null) {
                    float f19 = eVar4.f4407d;
                    PointF pointF5 = (PointF) eVar4.e();
                    float f20 = pointF5.x;
                    float f21 = pointF5.y;
                    eVar4.i(1.0E-4f + f19);
                    PointF pointF6 = (PointF) eVar4.e();
                    eVar4.i(f19);
                    matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF6.y - f21, pointF6.x - f20)));
                }
            } else {
                e eVar5 = this.f4452o;
                if (eVar5 != null) {
                    if (eVar5 instanceof s) {
                        l10 = ((Float) eVar5.e()).floatValue();
                    } else {
                        l10 = ((i) eVar5).l();
                    }
                    if (l10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        matrix.preRotate(l10);
                    }
                }
            }
            if (this.f4454q != null) {
                if (this.f4455r == null) {
                    cos = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    cos = (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
                }
                if (this.f4455r == null) {
                    sin = 1.0f;
                } else {
                    sin = (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
                }
                float tan = (float) Math.tan(Math.toRadians(r1.l()));
                d();
                float[] fArr = this.f4443e;
                fArr[0] = cos;
                fArr[1] = sin;
                float f22 = -sin;
                fArr[3] = f22;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.f4440b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = tan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.f4441c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = cos;
                fArr[1] = f22;
                fArr[3] = sin;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.f4442d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            e eVar6 = this.f4451n;
            if (eVar6 != null && (cVar = (o7.c) eVar6.e()) != null) {
                float f23 = cVar.f10034a;
                if (f23 != 1.0f || cVar.f10035b != 1.0f) {
                    matrix.preScale(f23, cVar.f10035b);
                }
            }
            e eVar7 = this.f4449l;
            if (eVar7 != null && (pointF = (PointF) eVar7.e()) != null) {
                float f24 = pointF.x;
                if (f24 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    matrix.preTranslate(-f24, -pointF.y);
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f3) {
        PointF pointF;
        o7.c cVar;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        e eVar = this.f4450m;
        PointF pointF2 = null;
        if (eVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) eVar.e();
        }
        e eVar2 = this.f4451n;
        if (eVar2 == null) {
            cVar = null;
        } else {
            cVar = (o7.c) eVar2.e();
        }
        e eVar3 = this.f4449l;
        if (eVar3 != null) {
            pointF2 = (PointF) eVar3.e();
        }
        Matrix matrix = this.f4439a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f3, pointF.y * f3);
        }
        i iVar = this.s;
        float f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (iVar != null) {
            f10 = iVar.l() * f3;
        } else {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        i iVar2 = this.f4456t;
        if (iVar2 != null) {
            f11 = iVar2.l() * f3;
        } else {
            f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        i iVar3 = this.f4457u;
        if (iVar3 != null) {
            f12 = iVar3.l() * f3;
        } else {
            f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f12 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            e eVar4 = this.f4452o;
            if (eVar4 != null) {
                float floatValue = ((Float) eVar4.e()).floatValue() * f3;
                if (pointF2 == null) {
                    f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    f16 = pointF2.x;
                }
                if (pointF2 != null) {
                    f17 = pointF2.y;
                }
                matrix.preRotate(floatValue, f16, f17);
            }
        } else {
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f13 = (float) Math.cos(Math.toRadians(f10));
            } else {
                f13 = 1.0f;
            }
            if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f14 = (float) Math.cos(Math.toRadians(f11));
            } else {
                f14 = 1.0f;
            }
            if (f12 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (pointF2 == null) {
                    f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    f15 = pointF2.x;
                }
                if (pointF2 != null) {
                    f17 = pointF2.y;
                }
                matrix.preRotate(f12, f15, f17);
            }
            if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(f14, 1.0f);
            }
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preScale(1.0f, f13);
            }
        }
        if (cVar != null) {
            double d10 = f3;
            matrix.preScale((float) Math.pow(cVar.f10034a, d10), (float) Math.pow(cVar.f10035b, d10));
        }
        return matrix;
    }
}
