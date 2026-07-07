package d7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import b7.c0;
import b7.y;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b implements e7.a, l, f {

    /* renamed from: e, reason: collision with root package name */
    public final y f3839e;

    /* renamed from: f, reason: collision with root package name */
    public final j7.a f3840f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f3842h;

    /* renamed from: i, reason: collision with root package name */
    public final c7.a f3843i;
    public final e7.i j;

    /* renamed from: k, reason: collision with root package name */
    public final e7.f f3844k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3845l;

    /* renamed from: m, reason: collision with root package name */
    public final e7.i f3846m;

    /* renamed from: n, reason: collision with root package name */
    public e7.s f3847n;

    /* renamed from: o, reason: collision with root package name */
    public e7.e f3848o;

    /* renamed from: p, reason: collision with root package name */
    public float f3849p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f3835a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f3836b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f3837c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f3838d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3841g = new ArrayList();

    public b(y yVar, j7.a aVar, Paint.Cap cap, Paint.Join join, float f3, h7.a aVar2, h7.b bVar, ArrayList arrayList, h7.b bVar2) {
        c7.a aVar3 = new c7.a(1, 0);
        this.f3843i = aVar3;
        this.f3849p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f3839e = yVar;
        this.f3840f = aVar;
        aVar3.setStyle(Paint.Style.STROKE);
        aVar3.setStrokeCap(cap);
        aVar3.setStrokeJoin(join);
        aVar3.setStrokeMiter(f3);
        this.f3844k = (e7.f) aVar2.G0();
        this.j = bVar.G0();
        if (bVar2 == null) {
            this.f3846m = null;
        } else {
            this.f3846m = bVar2.G0();
        }
        this.f3845l = new ArrayList(arrayList.size());
        this.f3842h = new float[arrayList.size()];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            this.f3845l.add(((h7.b) arrayList.get(i6)).G0());
        }
        aVar.f(this.f3844k);
        aVar.f(this.j);
        for (int i10 = 0; i10 < this.f3845l.size(); i10++) {
            aVar.f((e7.e) this.f3845l.get(i10));
        }
        e7.i iVar = this.f3846m;
        if (iVar != null) {
            aVar.f(iVar);
        }
        this.f3844k.a(this);
        this.j.a(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((e7.e) this.f3845l.get(i11)).a(this);
        }
        e7.i iVar2 = this.f3846m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (aVar.l() != null) {
            e7.i G0 = ((h7.b) aVar.l().f7747y).G0();
            this.f3848o = G0;
            G0.a(this);
            aVar.f(this.f3848o);
        }
    }

    @Override // e7.a
    public final void a() {
        this.f3839e.invalidateSelf();
    }

    @Override // d7.d
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        u uVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList2.get(size);
            if (dVar instanceof u) {
                u uVar2 = (u) dVar;
                if (uVar2.f3965c == 2) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f3841g;
            if (size2 < 0) {
                break;
            }
            d dVar2 = (d) list2.get(size2);
            if (dVar2 instanceof u) {
                u uVar3 = (u) dVar2;
                if (uVar3.f3965c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(uVar3);
                    uVar3.d(this);
                    aVar = aVar2;
                }
            }
            if (dVar2 instanceof n) {
                if (aVar == null) {
                    aVar = new a(uVar);
                }
                aVar.f3833a.add((n) dVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override // d7.f
    public void c(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        float f3;
        float f10;
        float f11;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        float floatValue;
        b bVar = this;
        float[] fArr2 = (float[]) n7.i.f9128e.get();
        boolean z10 = false;
        fArr2[0] = 0.0f;
        int i10 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            float f12 = 100.0f;
            float intValue = ((Integer) bVar.f3844k.e()).intValue() / 100.0f;
            int c10 = n7.g.c((int) (i6 * intValue));
            c7.a aVar2 = bVar.f3843i;
            aVar2.setAlpha(c10);
            aVar2.setStrokeWidth(bVar.j.l());
            if (aVar2.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ArrayList arrayList = bVar.f3845l;
                if (!arrayList.isEmpty()) {
                    int i11 = 0;
                    while (true) {
                        int size = arrayList.size();
                        fArr = bVar.f3842h;
                        if (i11 >= size) {
                            break;
                        }
                        float floatValue2 = ((Float) ((e7.e) arrayList.get(i11)).e()).floatValue();
                        fArr[i11] = floatValue2;
                        if (i11 % 2 == 0) {
                            if (floatValue2 < 1.0f) {
                                fArr[i11] = 1.0f;
                            }
                        } else if (floatValue2 < 0.1f) {
                            fArr[i11] = 0.1f;
                        }
                        i11++;
                    }
                    e7.i iVar = bVar.f3846m;
                    if (iVar == null) {
                        floatValue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        floatValue = ((Float) iVar.e()).floatValue();
                    }
                    aVar2.setPathEffect(new DashPathEffect(fArr, floatValue));
                }
                e7.s sVar = bVar.f3847n;
                if (sVar != null) {
                    aVar2.setColorFilter((ColorFilter) sVar.e());
                }
                e7.e eVar = bVar.f3848o;
                if (eVar != null) {
                    float floatValue3 = ((Float) eVar.e()).floatValue();
                    if (floatValue3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        aVar2.setMaskFilter(null);
                    } else if (floatValue3 != bVar.f3849p) {
                        j7.a aVar3 = bVar.f3840f;
                        if (aVar3.A == floatValue3) {
                            blurMaskFilter = aVar3.B;
                        } else {
                            BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                            aVar3.B = blurMaskFilter2;
                            aVar3.A = floatValue3;
                            blurMaskFilter = blurMaskFilter2;
                        }
                        aVar2.setMaskFilter(blurMaskFilter);
                    }
                    bVar.f3849p = floatValue3;
                }
                if (aVar != null) {
                    aVar.a((int) (intValue * 255.0f), aVar2);
                }
                canvas.save();
                canvas.concat(matrix);
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = bVar.f3841g;
                    if (i12 < arrayList2.size()) {
                        a aVar4 = (a) arrayList2.get(i12);
                        u uVar = aVar4.f3834b;
                        ArrayList arrayList3 = aVar4.f3833a;
                        Path path = bVar.f3836b;
                        if (uVar != null) {
                            path.reset();
                            for (int size2 = arrayList3.size() - i10; size2 >= 0; size2--) {
                                path.addPath(((n) arrayList3.get(size2)).g());
                            }
                            float floatValue4 = ((Float) uVar.f3966d.e()).floatValue() / f12;
                            float floatValue5 = ((Float) uVar.f3967e.e()).floatValue() / f12;
                            float floatValue6 = ((Float) uVar.f3968f.e()).floatValue() / 360.0f;
                            if (floatValue4 < 0.01f && floatValue5 > 0.99f) {
                                canvas.drawPath(path, aVar2);
                            } else {
                                PathMeasure pathMeasure = bVar.f3835a;
                                pathMeasure.setPath(path, z10);
                                float length = pathMeasure.getLength();
                                while (pathMeasure.nextContour()) {
                                    length += pathMeasure.getLength();
                                }
                                float f13 = floatValue6 * length;
                                float f14 = (floatValue4 * length) + f13;
                                float min = Math.min((floatValue5 * length) + f13, (f14 + length) - 1.0f);
                                int size3 = arrayList3.size() - i10;
                                float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                while (size3 >= 0) {
                                    Path g10 = ((n) arrayList3.get(size3)).g();
                                    Path path2 = bVar.f3837c;
                                    path2.set(g10);
                                    pathMeasure.setPath(path2, z10);
                                    float length2 = pathMeasure.getLength();
                                    if (min > length) {
                                        float f16 = min - length;
                                        if (f16 < f15 + length2 && f15 < f16) {
                                            if (f14 > length) {
                                                f11 = (f14 - length) / length2;
                                            } else {
                                                f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                            }
                                            n7.i.a(path2, f11, Math.min(f16 / length2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                            canvas.drawPath(path2, aVar2);
                                            f15 += length2;
                                            size3--;
                                            bVar = this;
                                            z10 = false;
                                        }
                                    }
                                    float f17 = f15 + length2;
                                    if (f17 >= f14 && f15 <= min) {
                                        if (f17 <= min && f14 < f15) {
                                            canvas.drawPath(path2, aVar2);
                                        } else {
                                            if (f14 < f15) {
                                                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                            } else {
                                                f3 = (f14 - f15) / length2;
                                            }
                                            if (min > f17) {
                                                f10 = 1.0f;
                                            } else {
                                                f10 = (min - f15) / length2;
                                            }
                                            n7.i.a(path2, f3, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                            canvas.drawPath(path2, aVar2);
                                        }
                                    }
                                    f15 += length2;
                                    size3--;
                                    bVar = this;
                                    z10 = false;
                                }
                            }
                        } else {
                            path.reset();
                            for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                                path.addPath(((n) arrayList3.get(size4)).g());
                            }
                            canvas.drawPath(path, aVar2);
                        }
                        i12++;
                        bVar = this;
                        z10 = false;
                        i10 = 1;
                        f12 = 100.0f;
                    } else {
                        canvas.restore();
                        return;
                    }
                }
            }
        }
    }

    @Override // g7.f
    public void d(f0 f0Var, Object obj) {
        PointF pointF = c0.f1490a;
        if (obj == 4) {
            this.f3844k.j(f0Var);
            return;
        }
        if (obj == c0.f1505q) {
            this.j.j(f0Var);
            return;
        }
        ColorFilter colorFilter = c0.I;
        j7.a aVar = this.f3840f;
        if (obj == colorFilter) {
            e7.s sVar = this.f3847n;
            if (sVar != null) {
                aVar.o(sVar);
            }
            e7.s sVar2 = new e7.s(f0Var, null);
            this.f3847n = sVar2;
            sVar2.a(this);
            aVar.f(this.f3847n);
            return;
        }
        if (obj == c0.f1494e) {
            e7.e eVar = this.f3848o;
            if (eVar != null) {
                eVar.j(f0Var);
                return;
            }
            e7.s sVar3 = new e7.s(f0Var, null);
            this.f3848o = sVar3;
            sVar3.a(this);
            aVar.f(this.f3848o);
        }
    }

    @Override // d7.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f3836b;
        path.reset();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f3841g;
            if (i6 < arrayList.size()) {
                a aVar = (a) arrayList.get(i6);
                for (int i10 = 0; i10 < aVar.f3833a.size(); i10++) {
                    path.addPath(((n) aVar.f3833a.get(i10)).g(), matrix);
                }
                i6++;
            } else {
                RectF rectF2 = this.f3838d;
                path.computeBounds(rectF2, false);
                float l10 = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - l10, rectF2.top - l10, rectF2.right + l10, rectF2.bottom + l10);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        n7.g.g(eVar, i6, arrayList, eVar2, this);
    }
}
