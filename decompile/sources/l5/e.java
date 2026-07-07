package l5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import j5.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f, n, m5.a, o5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6.i f8181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f8182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5.h f8183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f8184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f8185e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8187h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f8188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f8189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m5.r f8190l;

    public e(w wVar, r5.a aVar, q5.m mVar, j5.j jVar) {
        p5.d dVar;
        String str = mVar.f10861a;
        boolean z2 = mVar.f10863c;
        List list = mVar.f10862b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVarA = ((q5.b) list.get(i10)).a(wVar, jVar, aVar);
            if (dVarA != null) {
                arrayList.add(dVarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                dVar = null;
                break;
            }
            q5.b bVar = (q5.b) list.get(i);
            if (bVar instanceof p5.d) {
                dVar = (p5.d) bVar;
                break;
            }
            i++;
        }
        this(wVar, aVar, str, z2, arrayList, dVar);
    }

    @Override // l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        Matrix matrix2 = this.f8184d;
        matrix2.set(matrix);
        m5.r rVar = this.f8190l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof f) {
                ((f) dVar).a(rectF2, matrix2, z2);
                rectF.union(rectF2);
            }
        }
    }

    @Override // m5.a
    public final void b() {
        this.f8188j.invalidateSelf();
    }

    @Override // l5.d
    public final void c(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) arrayList.get(size2);
            dVar.c(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(dVar);
        }
    }

    public final List d() {
        if (this.f8189k == null) {
            this.f8189k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                d dVar = (d) arrayList.get(i);
                if (dVar instanceof n) {
                    this.f8189k.add((n) dVar);
                }
                i++;
            }
        }
        return this.f8189k;
    }

    @Override // l5.f
    public final void e(Canvas canvas, Matrix matrix, int i, v5.a aVar) {
        if (this.f8187h) {
            return;
        }
        Matrix matrix2 = this.f8184d;
        matrix2.set(matrix);
        m5.r rVar = this.f8190l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
            i = (int) (((((rVar.f8503p == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        w wVar = this.f8188j;
        boolean z2 = (wVar.N && i() && i != 255) || (aVar != null && wVar.O && i());
        int i10 = z2 ? 255 : i;
        v5.h hVar = this.f8183c;
        if (z2) {
            RectF rectF = this.f8182b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(rectF, matrix, true);
            c6.i iVar = this.f8181a;
            iVar.f2194w = i;
            if (aVar != null) {
                if (Color.alpha(aVar.f13169d) > 0) {
                    iVar.f2195x = aVar;
                } else {
                    iVar.f2195x = null;
                }
                aVar = null;
            } else {
                iVar.f2195x = null;
            }
            canvas = hVar.e(canvas, rectF, iVar);
        } else if (aVar != null) {
            v5.a aVar2 = new v5.a(aVar);
            aVar2.b(i10);
            aVar = aVar2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof f) {
                ((f) obj).e(canvas, matrix2, i10, aVar);
            }
        }
        if (z2) {
            hVar.c();
        }
    }

    @Override // l5.n
    public final Path f() {
        Matrix matrix = this.f8184d;
        matrix.reset();
        m5.r rVar = this.f8190l;
        if (rVar != null) {
            matrix.set(rVar.e());
        }
        Path path = this.f8185e;
        path.reset();
        if (!this.f8187h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVar = (d) arrayList.get(size);
                if (dVar instanceof n) {
                    path.addPath(((n) dVar).f(), matrix);
                }
            }
        }
        return path;
    }

    @Override // o5.f
    public final void g(Object obj, p2.c cVar) {
        m5.r rVar = this.f8190l;
        if (rVar != null) {
            rVar.c(obj, cVar);
        }
    }

    @Override // l5.d
    public final String getName() {
        throw null;
    }

    @Override // o5.f
    public final void h(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        String str = this.f8186g;
        if (!eVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            o5.e eVar3 = new o5.e(eVar2);
            eVar3.f9951a.add(str);
            if (eVar.a(i, str)) {
                o5.e eVar4 = new o5.e(eVar3);
                eVar4.f9952b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (!eVar.d(i, str)) {
            return;
        }
        int iB = eVar.b(i, str) + i;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i10 >= arrayList2.size()) {
                return;
            }
            d dVar = (d) arrayList2.get(i10);
            if (dVar instanceof o5.f) {
                ((o5.f) dVar).h(eVar, iB, arrayList, eVar2);
            }
            i10++;
        }
    }

    public final boolean i() {
        int i = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof f) && (i10 = i10 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public e(w wVar, r5.a aVar, String str, boolean z2, ArrayList arrayList, p5.d dVar) {
        this.f8181a = new c6.i(10, (byte) 0);
        this.f8182b = new RectF();
        this.f8183c = new v5.h();
        this.f8184d = new Matrix();
        this.f8185e = new Path();
        this.f = new RectF();
        this.f8186g = str;
        this.f8188j = wVar;
        this.f8187h = z2;
        this.i = arrayList;
        if (dVar != null) {
            m5.r rVar = new m5.r(dVar);
            this.f8190l = rVar;
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
            ((k) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }
}
