package d7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import b7.c0;
import b7.y;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements n, e7.a, l {

    /* renamed from: e, reason: collision with root package name */
    public final String f3917e;

    /* renamed from: f, reason: collision with root package name */
    public final y f3918f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3919g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3920h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3921i;
    public final e7.i j;

    /* renamed from: k, reason: collision with root package name */
    public final e7.e f3922k;

    /* renamed from: l, reason: collision with root package name */
    public final e7.i f3923l;

    /* renamed from: m, reason: collision with root package name */
    public final e7.i f3924m;

    /* renamed from: n, reason: collision with root package name */
    public final e7.i f3925n;

    /* renamed from: o, reason: collision with root package name */
    public final e7.i f3926o;

    /* renamed from: p, reason: collision with root package name */
    public final e7.i f3927p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3929r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f3913a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f3914b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f3915c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f3916d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final c f3928q = new c();

    public o(y yVar, j7.a aVar, i7.h hVar) {
        this.f3918f = yVar;
        this.f3917e = hVar.f6658a;
        int i6 = hVar.f6659b;
        this.f3919g = i6;
        this.f3920h = hVar.j;
        this.f3921i = hVar.f6667k;
        e7.i G0 = hVar.f6660c.G0();
        this.j = G0;
        e7.e G02 = hVar.f6661d.G0();
        this.f3922k = G02;
        e7.i G03 = hVar.f6662e.G0();
        this.f3923l = G03;
        e7.i G04 = hVar.f6664g.G0();
        this.f3925n = G04;
        e7.i G05 = hVar.f6666i.G0();
        this.f3927p = G05;
        if (i6 == 1) {
            this.f3924m = hVar.f6663f.G0();
            this.f3926o = hVar.f6665h.G0();
        } else {
            this.f3924m = null;
            this.f3926o = null;
        }
        aVar.f(G0);
        aVar.f(G02);
        aVar.f(G03);
        aVar.f(G04);
        aVar.f(G05);
        if (i6 == 1) {
            aVar.f(this.f3924m);
            aVar.f(this.f3926o);
        }
        G0.a(this);
        G02.a(this);
        G03.a(this);
        G04.a(this);
        G05.a(this);
        if (i6 == 1) {
            this.f3924m.a(this);
            this.f3926o.a(this);
        }
    }

    @Override // e7.a
    public final void a() {
        this.f3929r = false;
        this.f3918f.invalidateSelf();
    }

    @Override // d7.d
    public final void b(List list, List list2) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i6 < arrayList.size()) {
                d dVar = (d) arrayList.get(i6);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f3965c == 1) {
                        this.f3928q.f3850x.add(uVar);
                        uVar.d(this);
                    }
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // g7.f
    public final void d(f0 f0Var, Object obj) {
        e7.i iVar;
        e7.i iVar2;
        if (obj == c0.f1508u) {
            this.j.j(f0Var);
            return;
        }
        if (obj == c0.f1509v) {
            this.f3923l.j(f0Var);
            return;
        }
        if (obj == c0.f1498i) {
            this.f3922k.j(f0Var);
            return;
        }
        if (obj == c0.f1510w && (iVar2 = this.f3924m) != null) {
            iVar2.j(f0Var);
            return;
        }
        if (obj == c0.f1511x) {
            this.f3925n.j(f0Var);
            return;
        }
        if (obj == c0.f1512y && (iVar = this.f3926o) != null) {
            iVar.j(f0Var);
        } else if (obj == c0.f1513z) {
            this.f3927p.j(f0Var);
        }
    }

    @Override // d7.n
    public final Path g() {
        float f3;
        float f10;
        float f11;
        double d10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i6;
        double d11;
        boolean z10 = this.f3929r;
        Path path = this.f3913a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f3920h) {
            this.f3929r = true;
            return path;
        }
        int c10 = y.e.c(this.f3919g);
        e7.e eVar = this.f3922k;
        e7.i iVar = this.f3925n;
        e7.i iVar2 = this.f3927p;
        double d12 = 0.0d;
        e7.i iVar3 = this.f3923l;
        e7.i iVar4 = this.j;
        if (c10 != 0) {
            if (c10 == 1) {
                int floor = (int) Math.floor(((Float) iVar4.e()).floatValue());
                if (iVar3 != null) {
                    d12 = ((Float) iVar3.e()).floatValue();
                }
                double radians = Math.toRadians(d12 - 90.0d);
                double d13 = floor;
                float floatValue = ((Float) iVar2.e()).floatValue() / 100.0f;
                float floatValue2 = ((Float) iVar.e()).floatValue();
                double d14 = floatValue2;
                float cos = (float) (Math.cos(radians) * d14);
                float sin = (float) (Math.sin(radians) * d14);
                path.moveTo(cos, sin);
                double d15 = (float) (6.283185307179586d / d13);
                double ceil = Math.ceil(d13);
                double d16 = radians + d15;
                int i10 = 0;
                while (true) {
                    double d17 = i10;
                    if (d17 >= ceil) {
                        break;
                    }
                    double d18 = ceil;
                    float cos2 = (float) (Math.cos(d16) * d14);
                    float sin2 = (float) (Math.sin(d16) * d14);
                    if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i6 = i10;
                        Path path2 = path;
                        d11 = d14;
                        double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                        float cos3 = (float) Math.cos(atan2);
                        float sin3 = (float) Math.sin(atan2);
                        double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                        float f23 = floatValue2 * floatValue * 0.25f;
                        float f24 = f23 * cos3;
                        float f25 = f23 * sin3;
                        float cos4 = ((float) Math.cos(atan22)) * f23;
                        float sin4 = f23 * ((float) Math.sin(atan22));
                        if (d17 == d18 - 1.0d) {
                            Path path3 = this.f3914b;
                            path3.reset();
                            path3.moveTo(cos, sin);
                            float f26 = cos - f24;
                            float f27 = sin - f25;
                            float f28 = cos2 + cos4;
                            float f29 = sin2 + sin4;
                            path3.cubicTo(f26, f27, f28, f29, cos2, sin2);
                            PathMeasure pathMeasure = this.f3915c;
                            pathMeasure.setPath(path3, false);
                            float length = pathMeasure.getLength() * 0.9999f;
                            float[] fArr = this.f3916d;
                            pathMeasure.getPosTan(length, fArr, null);
                            path = path2;
                            path.cubicTo(f26, f27, f28, f29, fArr[0], fArr[1]);
                            cos = cos2;
                            sin = sin2;
                        } else {
                            float f30 = sin2 + sin4;
                            path = path2;
                            sin = sin2;
                            path.cubicTo(cos - f24, sin - f25, cos2 + cos4, f30, cos2, sin);
                            cos = cos2;
                        }
                    } else {
                        i6 = i10;
                        d11 = d14;
                        cos = cos2;
                        sin = sin2;
                        if (d17 != d18 - 1.0d) {
                            path.lineTo(cos, sin);
                        } else {
                            i10 = i6 + 1;
                            ceil = d18;
                            d14 = d11;
                        }
                    }
                    d16 += d15;
                    i10 = i6 + 1;
                    ceil = d18;
                    d14 = d11;
                }
                PointF pointF = (PointF) eVar.e();
                path.offset(pointF.x, pointF.y);
                path.close();
            }
        } else {
            float floatValue3 = ((Float) iVar4.e()).floatValue();
            if (iVar3 != null) {
                d12 = ((Float) iVar3.e()).floatValue();
            }
            double radians2 = Math.toRadians(d12 - 90.0d);
            double d19 = floatValue3;
            float f31 = (float) (6.283185307179586d / d19);
            if (this.f3921i) {
                f31 *= -1.0f;
            }
            float f32 = f31;
            float f33 = f32 / 2.0f;
            float f34 = floatValue3 - ((int) floatValue3);
            if (f34 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = 2.0f;
                radians2 += (1.0f - f34) * f33;
            } else {
                f3 = 2.0f;
            }
            float floatValue4 = ((Float) iVar.e()).floatValue();
            float floatValue5 = ((Float) this.f3924m.e()).floatValue();
            e7.i iVar5 = this.f3926o;
            if (iVar5 != null) {
                f10 = ((Float) iVar5.e()).floatValue() / 100.0f;
            } else {
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (iVar2 != null) {
                f11 = ((Float) iVar2.e()).floatValue() / 100.0f;
            } else {
                f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (f34 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f35 = h8.c.f(floatValue4, floatValue5, f34, floatValue5);
                double d20 = f35;
                f14 = f35;
                float cos5 = (float) (Math.cos(radians2) * d20);
                float sin5 = (float) (Math.sin(radians2) * d20);
                path.moveTo(cos5, sin5);
                d10 = radians2 + ((f32 * f34) / f3);
                f12 = cos5;
                f13 = sin5;
            } else {
                double d21 = floatValue4;
                float cos6 = (float) (Math.cos(radians2) * d21);
                float sin6 = (float) (Math.sin(radians2) * d21);
                path.moveTo(cos6, sin6);
                d10 = radians2 + f33;
                f12 = cos6;
                f13 = sin6;
                f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            double ceil2 = Math.ceil(d19) * 2.0d;
            double d22 = d10;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                double d23 = i11;
                if (d23 >= ceil2) {
                    break;
                }
                if (z11) {
                    f15 = floatValue4;
                } else {
                    f15 = floatValue5;
                }
                if (f14 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && d23 == ceil2 - 2.0d) {
                    f16 = (f32 * f34) / f3;
                } else {
                    f16 = f33;
                }
                if (f14 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && d23 == ceil2 - 1.0d) {
                    f15 = f14;
                }
                double d24 = f15;
                float cos7 = (float) (Math.cos(d22) * d24);
                float sin7 = (float) (Math.sin(d22) * d24);
                if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    path.lineTo(cos7, sin7);
                    f17 = f34;
                    f22 = cos7;
                } else {
                    f17 = f34;
                    Path path4 = path;
                    double atan23 = (float) (Math.atan2(f13, f12) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    float f36 = f12;
                    float f37 = f13;
                    double atan24 = (float) (Math.atan2(sin7, cos7) - 1.5707963267948966d);
                    float cos9 = (float) Math.cos(atan24);
                    float sin9 = (float) Math.sin(atan24);
                    if (z11) {
                        f18 = f10;
                    } else {
                        f18 = f11;
                    }
                    if (z11) {
                        f19 = f11;
                    } else {
                        f19 = f10;
                    }
                    if (z11) {
                        f20 = floatValue5;
                    } else {
                        f20 = floatValue4;
                    }
                    if (z11) {
                        f21 = floatValue4;
                    } else {
                        f21 = floatValue5;
                    }
                    float f38 = f20 * f18 * 0.47829f;
                    float f39 = cos8 * f38;
                    float f40 = f38 * sin8;
                    float f41 = f21 * f19 * 0.47829f;
                    float f42 = cos9 * f41;
                    float f43 = f41 * sin9;
                    if (f34 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (i11 == 0) {
                            f39 *= f17;
                            f40 *= f17;
                        } else if (d23 == ceil2 - 1.0d) {
                            f42 *= f17;
                            f43 *= f17;
                        }
                    }
                    f22 = cos7;
                    path = path4;
                    path.cubicTo(f36 - f39, f37 - f40, f42 + cos7, sin7 + f43, f22, sin7);
                }
                d22 += f16;
                z11 = !z11;
                i11++;
                f12 = f22;
                f13 = sin7;
                f34 = f17;
                f3 = 2.0f;
            }
            PointF pointF2 = (PointF) eVar.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f3928q.a(path);
        this.f3929r = true;
        return path;
    }

    @Override // d7.d
    public final String getName() {
        return this.f3917e;
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        n7.g.g(eVar, i6, arrayList, eVar2, this);
    }
}
