package d7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import j2.y;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements f, n, e7.a, g7.f {

    /* renamed from: a, reason: collision with root package name */
    public final y f3851a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f3852b;

    /* renamed from: c, reason: collision with root package name */
    public final n7.h f3853c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f3854d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f3855e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f3856f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3857g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3858h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3859i;
    public final b7.y j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3860k;

    /* renamed from: l, reason: collision with root package name */
    public final e7.r f3861l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(b7.y r8, j7.a r9, i7.m r10, b7.j r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f6684a
            boolean r4 = r10.f6686c
            java.util.List r10 = r10.f6685b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = 0
        L11:
            int r2 = r10.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r10.get(r1)
            i7.b r2 = (i7.b) r2
            d7.d r2 = r2.a(r8, r11, r9)
            if (r2 == 0) goto L26
            r5.add(r2)
        L26:
            int r1 = r1 + 1
            goto L11
        L29:
            int r11 = r10.size()
            if (r0 >= r11) goto L43
            java.lang.Object r11 = r10.get(r0)
            i7.b r11 = (i7.b) r11
            boolean r1 = r11 instanceof h7.d
            if (r1 == 0) goto L40
            h7.d r11 = (h7.d) r11
        L3b:
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r11
            goto L45
        L40:
            int r0 = r0 + 1
            goto L29
        L43:
            r11 = 0
            goto L3b
        L45:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.e.<init>(b7.y, j7.a, i7.m, b7.j):void");
    }

    @Override // e7.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // d7.d
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f3859i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) arrayList.get(size2);
            dVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(dVar);
        }
    }

    @Override // d7.f
    public final void c(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        boolean z10;
        int intValue;
        if (!this.f3858h) {
            Matrix matrix2 = this.f3854d;
            matrix2.set(matrix);
            e7.r rVar = this.f3861l;
            if (rVar != null) {
                matrix2.preConcat(rVar.e());
                e7.e eVar = rVar.f4453p;
                if (eVar == null) {
                    intValue = 100;
                } else {
                    intValue = ((Integer) eVar.e()).intValue();
                }
                i6 = (int) ((((intValue / 100.0f) * i6) / 255.0f) * 255.0f);
            }
            b7.y yVar = this.j;
            int i10 = 255;
            if ((yVar.P && i() && i6 != 255) || (aVar != null && yVar.Q && i())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10 = i6;
            }
            n7.h hVar = this.f3853c;
            if (z10) {
                RectF rectF = this.f3852b;
                rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                e(rectF, matrix, true);
                y yVar2 = this.f3851a;
                yVar2.f7144y = i6;
                if (aVar != null) {
                    if (Color.alpha(aVar.f9087d) > 0) {
                        yVar2.f7145z = aVar;
                    } else {
                        yVar2.f7145z = null;
                    }
                    aVar = null;
                } else {
                    yVar2.f7145z = null;
                }
                canvas = hVar.e(canvas, rectF, yVar2);
            } else if (aVar != null) {
                n7.a aVar2 = new n7.a(aVar);
                aVar2.b(i10);
                aVar = aVar2;
            }
            ArrayList arrayList = this.f3859i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof f) {
                    ((f) obj).c(canvas, matrix2, i10, aVar);
                }
            }
            if (z10) {
                hVar.c();
            }
        }
    }

    @Override // g7.f
    public final void d(f0 f0Var, Object obj) {
        e7.r rVar = this.f3861l;
        if (rVar != null) {
            rVar.c(f0Var, obj);
        }
    }

    @Override // d7.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f3854d;
        matrix2.set(matrix);
        e7.r rVar = this.f3861l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
        }
        RectF rectF2 = this.f3856f;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList arrayList = this.f3859i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof f) {
                ((f) dVar).e(rectF2, matrix2, z10);
                rectF.union(rectF2);
            }
        }
    }

    public final List f() {
        if (this.f3860k == null) {
            this.f3860k = new ArrayList();
            int i6 = 0;
            while (true) {
                ArrayList arrayList = this.f3859i;
                if (i6 >= arrayList.size()) {
                    break;
                }
                d dVar = (d) arrayList.get(i6);
                if (dVar instanceof n) {
                    this.f3860k.add((n) dVar);
                }
                i6++;
            }
        }
        return this.f3860k;
    }

    @Override // d7.n
    public final Path g() {
        Matrix matrix = this.f3854d;
        matrix.reset();
        e7.r rVar = this.f3861l;
        if (rVar != null) {
            matrix.set(rVar.e());
        }
        Path path = this.f3855e;
        path.reset();
        if (!this.f3858h) {
            ArrayList arrayList = this.f3859i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVar = (d) arrayList.get(size);
                if (dVar instanceof n) {
                    path.addPath(((n) dVar).g(), matrix);
                }
            }
        }
        return path;
    }

    @Override // d7.d
    public final String getName() {
        throw null;
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        String str = this.f3857g;
        if (eVar.c(i6, str) || "__container".equals(str)) {
            if (!"__container".equals(str)) {
                g7.e eVar3 = new g7.e(eVar2);
                eVar3.f5506a.add(str);
                if (eVar.a(i6, str)) {
                    g7.e eVar4 = new g7.e(eVar3);
                    eVar4.f5507b = this;
                    arrayList.add(eVar4);
                }
                eVar2 = eVar3;
            }
            if (eVar.d(i6, str)) {
                int b10 = eVar.b(i6, str) + i6;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f3859i;
                    if (i10 < arrayList2.size()) {
                        d dVar = (d) arrayList2.get(i10);
                        if (dVar instanceof g7.f) {
                            ((g7.f) dVar).h(eVar, b10, arrayList, eVar2);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean i() {
        int i6 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3859i;
            if (i6 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i6) instanceof f) && (i10 = i10 + 1) >= 2) {
                return true;
            }
            i6++;
        }
    }

    public e(b7.y yVar, j7.a aVar, String str, boolean z10, ArrayList arrayList, h7.d dVar) {
        this.f3851a = new y((byte) 0, 2);
        this.f3852b = new RectF();
        this.f3853c = new n7.h();
        this.f3854d = new Matrix();
        this.f3855e = new Path();
        this.f3856f = new RectF();
        this.f3857g = str;
        this.j = yVar;
        this.f3858h = z10;
        this.f3859i = arrayList;
        if (dVar != null) {
            e7.r rVar = new e7.r(dVar);
            this.f3861l = rVar;
            rVar.a(aVar);
            rVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar2 = (d) arrayList.get(size);
            if (dVar2 instanceof k) {
                arrayList2.add((k) dVar2);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((k) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
        }
    }
}
