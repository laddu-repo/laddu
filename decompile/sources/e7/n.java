package e7;

import android.graphics.Path;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: i, reason: collision with root package name */
    public final i7.k f4428i;
    public final Path j;

    /* renamed from: k, reason: collision with root package name */
    public Path f4429k;

    /* renamed from: l, reason: collision with root package name */
    public Path f4430l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4431m;

    public n(List list) {
        super(list);
        this.f4428i = new i7.k();
        this.j = new Path();
    }

    @Override // e7.e
    public final Object f(o7.a aVar, float f3) {
        i7.k kVar;
        boolean z10;
        i7.k kVar2;
        i7.k kVar3;
        Path path;
        int i6;
        PointF pointF;
        ArrayList arrayList;
        PointF pointF2;
        boolean z11;
        i7.k kVar4;
        i7.k kVar5;
        i7.k kVar6;
        i7.k kVar7;
        PointF pointF3;
        PointF pointF4;
        boolean z12;
        i7.k kVar8 = (i7.k) aVar.f10013b;
        i7.k kVar9 = (i7.k) aVar.f10014c;
        if (kVar9 == null) {
            kVar = kVar8;
        } else {
            kVar = kVar9;
        }
        i7.k kVar10 = this.f4428i;
        ArrayList arrayList2 = kVar10.f6675a;
        if (kVar10.f6676b == null) {
            kVar10.f6676b = new PointF();
        }
        boolean z13 = kVar8.f6677c;
        ArrayList arrayList3 = kVar8.f6675a;
        if (!z13 && !kVar.f6677c) {
            z10 = false;
        } else {
            z10 = true;
        }
        kVar10.f6677c = z10;
        int size = arrayList3.size();
        ArrayList arrayList4 = kVar.f6675a;
        if (size != arrayList4.size()) {
            n7.c.b("Curves must have the same number of control points. Shape 1: " + arrayList3.size() + "\tShape 2: " + arrayList4.size());
        }
        int min = Math.min(arrayList3.size(), arrayList4.size());
        if (arrayList2.size() < min) {
            for (int size2 = arrayList2.size(); size2 < min; size2++) {
                arrayList2.add(new g7.a());
            }
        } else if (arrayList2.size() > min) {
            for (int size3 = arrayList2.size() - 1; size3 >= min; size3--) {
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        PointF pointF5 = kVar8.f6676b;
        PointF pointF6 = kVar.f6676b;
        kVar10.a(n7.g.f(pointF5.x, pointF6.x, f3), n7.g.f(pointF5.y, pointF6.y, f3));
        int size4 = arrayList2.size() - 1;
        while (size4 >= 0) {
            g7.a aVar2 = (g7.a) arrayList3.get(size4);
            g7.a aVar3 = (g7.a) arrayList4.get(size4);
            PointF pointF7 = aVar2.f5481a;
            PointF pointF8 = aVar2.f5482b;
            PointF pointF9 = aVar2.f5483c;
            PointF pointF10 = aVar3.f5481a;
            PointF pointF11 = aVar3.f5482b;
            PointF pointF12 = aVar3.f5483c;
            i7.k kVar11 = kVar10;
            ((g7.a) arrayList2.get(size4)).f5481a.set(n7.g.f(pointF7.x, pointF10.x, f3), n7.g.f(pointF7.y, pointF10.y, f3));
            ((g7.a) arrayList2.get(size4)).f5482b.set(n7.g.f(pointF8.x, pointF11.x, f3), n7.g.f(pointF8.y, pointF11.y, f3));
            ((g7.a) arrayList2.get(size4)).f5483c.set(n7.g.f(pointF9.x, pointF12.x, f3), n7.g.f(pointF9.y, pointF12.y, f3));
            size4--;
            arrayList3 = arrayList3;
            kVar10 = kVar11;
            arrayList4 = arrayList4;
        }
        i7.k kVar12 = kVar10;
        ArrayList arrayList5 = this.f4431m;
        if (arrayList5 != null) {
            int size5 = arrayList5.size() - 1;
            kVar2 = kVar12;
            while (true) {
                ArrayList arrayList6 = kVar2.f6675a;
                if (size5 < 0) {
                    break;
                }
                d7.r rVar = (d7.r) this.f4431m.get(size5);
                rVar.getClass();
                if (arrayList6.size() > 2) {
                    float floatValue = ((Float) rVar.f3950b.e()).floatValue();
                    if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        boolean z14 = kVar2.f6677c;
                        int size6 = arrayList6.size() - 1;
                        int i10 = 0;
                        while (size6 >= 0) {
                            g7.a aVar4 = (g7.a) arrayList6.get(size6);
                            g7.a aVar5 = (g7.a) arrayList6.get(d7.r.d(size6 - 1, arrayList6.size()));
                            if (size6 == 0 && !z14) {
                                pointF3 = kVar2.f6676b;
                            } else {
                                pointF3 = aVar5.f5483c;
                            }
                            if (size6 == 0 && !z14) {
                                pointF4 = pointF3;
                            } else {
                                pointF4 = aVar5.f5482b;
                            }
                            PointF pointF13 = aVar4.f5481a;
                            int i11 = size5;
                            if (!kVar2.f6677c && (size6 == 0 || size6 == arrayList6.size() - 1)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (pointF4.equals(pointF3) && pointF13.equals(pointF3) && !z12) {
                                i10 += 2;
                            } else {
                                i10++;
                            }
                            size6--;
                            size5 = i11;
                        }
                        i6 = size5;
                        i7.k kVar13 = rVar.f3951c;
                        if (kVar13 == null || kVar13.f6675a.size() != i10) {
                            ArrayList arrayList7 = new ArrayList(i10);
                            for (int i12 = 0; i12 < i10; i12++) {
                                arrayList7.add(new g7.a());
                            }
                            rVar.f3951c = new i7.k(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, arrayList7);
                        }
                        i7.k kVar14 = rVar.f3951c;
                        kVar14.f6677c = z14;
                        PointF pointF14 = kVar2.f6676b;
                        kVar14.a(pointF14.x, pointF14.y);
                        ArrayList arrayList8 = kVar14.f6675a;
                        boolean z15 = kVar2.f6677c;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < arrayList6.size()) {
                            g7.a aVar6 = (g7.a) arrayList6.get(i13);
                            g7.a aVar7 = (g7.a) arrayList6.get(d7.r.d(i13 - 1, arrayList6.size()));
                            g7.a aVar8 = (g7.a) arrayList6.get(d7.r.d(i13 - 2, arrayList6.size()));
                            if (i13 == 0 && !z15) {
                                pointF = kVar2.f6676b;
                            } else {
                                pointF = aVar7.f5483c;
                            }
                            if (i13 == 0 && !z15) {
                                arrayList = arrayList6;
                                pointF2 = pointF;
                            } else {
                                arrayList = arrayList6;
                                pointF2 = aVar7.f5482b;
                            }
                            float f10 = floatValue;
                            PointF pointF15 = aVar6.f5481a;
                            PointF pointF16 = aVar8.f5483c;
                            boolean z16 = z15;
                            PointF pointF17 = aVar6.f5483c;
                            if (!kVar2.f6677c && (i13 == 0 || i13 == arrayList.size() - 1)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (pointF2.equals(pointF) && pointF15.equals(pointF) && !z11) {
                                float f11 = pointF.x;
                                float f12 = f11 - pointF16.x;
                                float f13 = pointF.y;
                                float f14 = f13 - pointF16.y;
                                float f15 = pointF17.x - f11;
                                float f16 = pointF17.y - f13;
                                kVar4 = kVar8;
                                kVar5 = kVar9;
                                double d10 = f12;
                                i7.k kVar15 = kVar14;
                                i7.k kVar16 = kVar2;
                                float hypot = (float) Math.hypot(d10, f14);
                                float hypot2 = (float) Math.hypot(f15, f16);
                                float min2 = Math.min(f10 / hypot, 0.5f);
                                float min3 = Math.min(f10 / hypot2, 0.5f);
                                float f17 = pointF.x;
                                float f18 = h8.c.f(pointF16.x, f17, min2, f17);
                                float f19 = pointF.y;
                                float f20 = h8.c.f(pointF16.y, f19, min2, f19);
                                float f21 = h8.c.f(pointF17.x, f17, min3, f17);
                                float f22 = h8.c.f(pointF17.y, f19, min3, f19);
                                float f23 = f18 - ((f18 - f17) * 0.5519f);
                                float f24 = f20 - ((f20 - f19) * 0.5519f);
                                float f25 = f21 - ((f21 - f17) * 0.5519f);
                                float f26 = f22 - ((f22 - f19) * 0.5519f);
                                g7.a aVar9 = (g7.a) arrayList8.get(d7.r.d(i14 - 1, arrayList8.size()));
                                g7.a aVar10 = (g7.a) arrayList8.get(i14);
                                kVar7 = kVar16;
                                aVar9.f5482b.set(f18, f20);
                                aVar9.f5483c.set(f18, f20);
                                kVar6 = kVar15;
                                if (i13 == 0) {
                                    kVar6.a(f18, f20);
                                }
                                aVar10.f5481a.set(f23, f24);
                                g7.a aVar11 = (g7.a) arrayList8.get(i14 + 1);
                                aVar10.f5482b.set(f25, f26);
                                aVar10.f5483c.set(f21, f22);
                                aVar11.f5481a.set(f21, f22);
                                i14 += 2;
                            } else {
                                kVar4 = kVar8;
                                kVar5 = kVar9;
                                kVar6 = kVar14;
                                kVar7 = kVar2;
                                g7.a aVar12 = (g7.a) arrayList8.get(d7.r.d(i14 - 1, arrayList8.size()));
                                g7.a aVar13 = (g7.a) arrayList8.get(i14);
                                PointF pointF18 = aVar7.f5482b;
                                aVar12.f5482b.set(pointF18.x, pointF18.y);
                                PointF pointF19 = aVar7.f5483c;
                                aVar12.f5483c.set(pointF19.x, pointF19.y);
                                PointF pointF20 = aVar6.f5481a;
                                aVar13.f5481a.set(pointF20.x, pointF20.y);
                                i14++;
                            }
                            i13++;
                            kVar14 = kVar6;
                            kVar8 = kVar4;
                            arrayList6 = arrayList;
                            floatValue = f10;
                            z15 = z16;
                            kVar9 = kVar5;
                            kVar2 = kVar7;
                        }
                        kVar2 = kVar14;
                        size5 = i6 - 1;
                        kVar8 = kVar8;
                        kVar9 = kVar9;
                    }
                }
                i6 = size5;
                size5 = i6 - 1;
                kVar8 = kVar8;
                kVar9 = kVar9;
            }
        } else {
            kVar2 = kVar12;
        }
        i7.k kVar17 = kVar8;
        i7.k kVar18 = kVar9;
        Path path2 = this.j;
        n7.g.e(kVar2, path2);
        if (this.f4408e != null) {
            if (this.f4429k == null) {
                this.f4429k = new Path();
                this.f4430l = new Path();
            }
            n7.g.e(kVar17, this.f4429k);
            if (kVar18 != null) {
                kVar3 = kVar18;
                n7.g.e(kVar3, this.f4430l);
            } else {
                kVar3 = kVar18;
            }
            f0 f0Var = this.f4408e;
            float f27 = aVar.f10018g;
            float floatValue2 = aVar.f10019h.floatValue();
            i7.k kVar19 = kVar3;
            Path path3 = this.f4429k;
            if (kVar19 == null) {
                path = path3;
            } else {
                path = this.f4430l;
            }
            return (Path) f0Var.U(f27, floatValue2, path3, path, f3, d(), this.f4407d);
        }
        return path2;
    }

    @Override // e7.e
    public final boolean k() {
        ArrayList arrayList = this.f4431m;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }
}
