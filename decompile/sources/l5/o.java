package l5;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import j5.a0;
import j5.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n, m5.a, l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8245e;
    public final w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8247h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m5.i f8248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m5.e f8249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m5.i f8250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m5.i f8251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m5.i f8252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m5.i f8253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m5.i f8254p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8256r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f8241a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f8242b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PathMeasure f8243c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f8244d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f8255q = new c(0);

    public o(w wVar, r5.a aVar, q5.h hVar) {
        this.f = wVar;
        this.f8245e = hVar.f10838a;
        int i = hVar.f10839b;
        this.f8246g = i;
        this.f8247h = hVar.f10845j;
        this.i = hVar.f10846k;
        m5.i iVarF = hVar.f10840c.f();
        this.f8248j = iVarF;
        m5.e eVarF = hVar.f10841d.f();
        this.f8249k = eVarF;
        m5.i iVarF2 = hVar.f10842e.f();
        this.f8250l = iVarF2;
        m5.i iVarF3 = hVar.f10843g.f();
        this.f8252n = iVarF3;
        m5.i iVarF4 = hVar.i.f();
        this.f8254p = iVarF4;
        if (i == 1) {
            this.f8251m = hVar.f.f();
            this.f8253o = hVar.f10844h.f();
        } else {
            this.f8251m = null;
            this.f8253o = null;
        }
        aVar.d(iVarF);
        aVar.d(eVarF);
        aVar.d(iVarF2);
        aVar.d(iVarF3);
        aVar.d(iVarF4);
        if (i == 1) {
            aVar.d(this.f8251m);
            aVar.d(this.f8253o);
        }
        iVarF.a(this);
        eVarF.a(this);
        iVarF2.a(this);
        iVarF3.a(this);
        iVarF4.a(this);
        if (i == 1) {
            this.f8251m.a(this);
            this.f8253o.a(this);
        }
    }

    @Override // m5.a
    public final void b() {
        this.f8256r = false;
        this.f.invalidateSelf();
    }

    @Override // l5.d
    public final void c(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                if (uVar.f8290c == 1) {
                    this.f8255q.f8180a.add(uVar);
                    uVar.d(this);
                }
            }
            i++;
        }
    }

    @Override // l5.n
    public final Path f() {
        boolean z2;
        float f;
        double d10;
        float f4;
        float f10;
        float f11;
        float f12;
        float f13;
        int i;
        double d11;
        boolean z10 = this.f8256r;
        Path path = this.f8241a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f8247h) {
            this.f8256r = true;
            return path;
        }
        int iC = y.e.c(this.f8246g);
        m5.e eVar = this.f8249k;
        m5.i iVar = this.f8252n;
        m5.i iVar2 = this.f8254p;
        m5.i iVar3 = this.f8250l;
        m5.i iVar4 = this.f8248j;
        if (iC == 0) {
            z2 = true;
            float fFloatValue = ((Float) iVar4.e()).floatValue();
            double radians = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d12 = fFloatValue;
            float f14 = (float) (6.283185307179586d / d12);
            if (this.i) {
                f14 *= -1.0f;
            }
            float f15 = f14;
            float f16 = f15 / 2.0f;
            float f17 = fFloatValue - ((int) fFloatValue);
            if (f17 != 0.0f) {
                f = 2.0f;
                radians += (double) ((1.0f - f17) * f16);
            } else {
                f = 2.0f;
            }
            float fFloatValue2 = ((Float) iVar.e()).floatValue();
            float fFloatValue3 = ((Float) this.f8251m.e()).floatValue();
            m5.i iVar5 = this.f8253o;
            float fFloatValue4 = iVar5 != null ? ((Float) iVar5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = iVar2 != null ? ((Float) iVar2.e()).floatValue() / 100.0f : 0.0f;
            if (f17 != 0.0f) {
                float fG = j4.a.g(fFloatValue2, fFloatValue3, f17, fFloatValue3);
                double d13 = fG;
                f11 = fG;
                float fCos = (float) (Math.cos(radians) * d13);
                float fSin = (float) (Math.sin(radians) * d13);
                path.moveTo(fCos, fSin);
                d10 = radians + ((double) ((f15 * f17) / f));
                f4 = fCos;
                f10 = fSin;
            } else {
                double d14 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d14);
                float fSin2 = (float) (Math.sin(radians) * d14);
                path.moveTo(fCos2, fSin2);
                d10 = radians + ((double) f16);
                f4 = fCos2;
                f10 = fSin2;
                f11 = 0.0f;
            }
            double dCeil = Math.ceil(d12) * 2.0d;
            double d15 = d10;
            int i10 = 0;
            boolean z11 = false;
            while (true) {
                double d16 = i10;
                if (d16 >= dCeil) {
                    break;
                }
                float f18 = z11 ? fFloatValue2 : fFloatValue3;
                float f19 = (f11 == 0.0f || d16 != dCeil - 2.0d) ? f16 : (f15 * f17) / f;
                if (f11 != 0.0f && d16 == dCeil - 1.0d) {
                    f18 = f11;
                }
                double d17 = f18;
                float fCos3 = (float) (Math.cos(d15) * d17);
                float fSin3 = (float) (Math.sin(d15) * d17);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f12 = f17;
                    f13 = fCos3;
                } else {
                    f12 = f17;
                    Path path2 = path;
                    double dAtan2 = (float) (Math.atan2(f10, f4) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f20 = f4;
                    float f21 = f10;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f22 = z11 ? fFloatValue4 : fFloatValue5;
                    float f23 = z11 ? fFloatValue5 : fFloatValue4;
                    float f24 = (z11 ? fFloatValue3 : fFloatValue2) * f22 * 0.47829f;
                    float f25 = fCos4 * f24;
                    float f26 = f24 * fSin4;
                    float f27 = (z11 ? fFloatValue2 : fFloatValue3) * f23 * 0.47829f;
                    float f28 = fCos5 * f27;
                    float f29 = f27 * fSin5;
                    if (f17 != 0.0f) {
                        if (i10 == 0) {
                            f25 *= f12;
                            f26 *= f12;
                        } else if (d16 == dCeil - 1.0d) {
                            f28 *= f12;
                            f29 *= f12;
                        }
                    }
                    f13 = fCos3;
                    path = path2;
                    path.cubicTo(f20 - f25, f21 - f26, f28 + fCos3, fSin3 + f29, f13, fSin3);
                }
                d15 += (double) f19;
                z11 = !z11;
                i10++;
                f4 = f13;
                f10 = fSin3;
                f17 = f12;
                f = 2.0f;
            }
            PointF pointF = (PointF) eVar.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iC != 1) {
            z2 = true;
        } else {
            int iFloor = (int) Math.floor(((Float) iVar4.e()).floatValue());
            double radians2 = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d18 = iFloor;
            float fFloatValue6 = ((Float) iVar2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) iVar.e()).floatValue();
            double d19 = fFloatValue7;
            z2 = true;
            float fCos6 = (float) (Math.cos(radians2) * d19);
            float fSin6 = (float) (Math.sin(radians2) * d19);
            path.moveTo(fCos6, fSin6);
            double d20 = (float) (6.283185307179586d / d18);
            double dCeil2 = Math.ceil(d18);
            double d21 = radians2 + d20;
            int i11 = 0;
            while (true) {
                double d22 = i11;
                if (d22 >= dCeil2) {
                    break;
                }
                double d23 = dCeil2;
                float fCos7 = (float) (Math.cos(d21) * d19);
                float fSin7 = (float) (Math.sin(d21) * d19);
                if (fFloatValue6 != 0.0f) {
                    i = i11;
                    Path path3 = path;
                    d11 = d19;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f30 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f31 = f30 * fCos8;
                    float f32 = f30 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f30;
                    float fSin9 = f30 * ((float) Math.sin(dAtan24));
                    if (d22 == d23 - 1.0d) {
                        Path path4 = this.f8242b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f33 = fCos6 - f31;
                        float f34 = fSin6 - f32;
                        float f35 = fCos7 + fCos9;
                        float f36 = fSin7 + fSin9;
                        path4.cubicTo(f33, f34, f35, f36, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f8243c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f8244d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f33, f34, f35, f36, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f37 = fSin7 + fSin9;
                        path = path3;
                        fSin6 = fSin7;
                        path.cubicTo(fCos6 - f31, fSin6 - f32, fCos7 + fCos9, f37, fCos7, fSin6);
                        fCos6 = fCos7;
                    }
                } else {
                    i = i11;
                    d11 = d19;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d22 == d23 - 1.0d) {
                        i11 = i + 1;
                        dCeil2 = d23;
                        d19 = d11;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d21 += d20;
                i11 = i + 1;
                dCeil2 = d23;
                d19 = d11;
            }
            PointF pointF2 = (PointF) eVar.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f8255q.a(path);
        this.f8256r = z2;
        return path;
    }

    @Override // o5.f
    public final void g(Object obj, p2.c cVar) {
        m5.i iVar;
        m5.i iVar2;
        if (obj == a0.f6806u) {
            this.f8248j.j(cVar);
            return;
        }
        if (obj == a0.f6807v) {
            this.f8250l.j(cVar);
            return;
        }
        if (obj == a0.i) {
            this.f8249k.j(cVar);
            return;
        }
        if (obj == a0.f6808w && (iVar2 = this.f8251m) != null) {
            iVar2.j(cVar);
            return;
        }
        if (obj == a0.f6809x) {
            this.f8252n.j(cVar);
            return;
        }
        if (obj == a0.f6810y && (iVar = this.f8253o) != null) {
            iVar.j(cVar);
        } else if (obj == a0.f6811z) {
            this.f8254p.j(cVar);
        }
    }

    @Override // l5.d
    public final String getName() {
        return this.f8245e;
    }

    @Override // o5.f
    public final void h(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        v5.g.g(eVar, i, arrayList, eVar2, this);
    }
}
