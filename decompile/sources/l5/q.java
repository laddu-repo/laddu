package l5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import j5.a0;
import j5.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements f, n, k, m5.a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f8266a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f8267b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f8268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r5.a f8269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8270e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m5.i f8271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m5.i f8272h;
    public final m5.r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f8273j;

    public q(w wVar, r5.a aVar, q5.i iVar) {
        this.f8268c = wVar;
        this.f8269d = aVar;
        this.f8270e = iVar.f10848b;
        this.f = iVar.f10850d;
        m5.i iVarF = iVar.f10849c.f();
        this.f8271g = iVarF;
        aVar.d(iVarF);
        iVarF.a(this);
        m5.i iVarF2 = ((p5.b) iVar.f10851e).f();
        this.f8272h = iVarF2;
        aVar.d(iVarF2);
        iVarF2.a(this);
        p5.d dVar = (p5.d) iVar.f;
        dVar.getClass();
        m5.r rVar = new m5.r(dVar);
        this.i = rVar;
        rVar.a(aVar);
        rVar.b(this);
    }

    @Override // l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        this.f8273j.a(rectF, matrix, z2);
    }

    @Override // m5.a
    public final void b() {
        this.f8268c.invalidateSelf();
    }

    @Override // l5.d
    public final void c(List list, List list2) {
        this.f8273j.c(list, list2);
    }

    @Override // l5.k
    public final void d(ListIterator listIterator) {
        if (this.f8273j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((d) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f8273j = new e(this.f8268c, this.f8269d, "Repeater", this.f, arrayList, null);
    }

    @Override // l5.f
    public final void e(Canvas canvas, Matrix matrix, int i, v5.a aVar) {
        float fFloatValue = ((Float) this.f8271g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f8272h.e()).floatValue();
        m5.r rVar = this.i;
        float fFloatValue3 = ((Float) rVar.f8509v.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) rVar.f8510w.e()).floatValue() / 100.0f;
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix2 = this.f8266a;
            matrix2.set(matrix);
            float f = i10;
            matrix2.preConcat(rVar.f(f + fFloatValue2));
            this.f8273j.e(canvas, matrix2, (int) (v5.g.f(fFloatValue3, fFloatValue4, f / fFloatValue) * i), aVar);
        }
    }

    @Override // l5.n
    public final Path f() {
        Path pathF = this.f8273j.f();
        Path path = this.f8267b;
        path.reset();
        float fFloatValue = ((Float) this.f8271g.e()).floatValue();
        float fFloatValue2 = ((Float) this.f8272h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.f8266a;
            matrix.set(matrixF);
            path.addPath(pathF, matrix);
        }
        return path;
    }

    @Override // o5.f
    public final void g(Object obj, p2.c cVar) {
        if (this.i.c(obj, cVar)) {
            return;
        }
        if (obj == a0.f6804s) {
            this.f8271g.j(cVar);
        } else if (obj == a0.f6805t) {
            this.f8272h.j(cVar);
        }
    }

    @Override // l5.d
    public final String getName() {
        return this.f8270e;
    }

    @Override // o5.f
    public final void h(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        v5.g.g(eVar, i, arrayList, eVar2, this);
        for (int i10 = 0; i10 < this.f8273j.i.size(); i10++) {
            d dVar = (d) this.f8273j.i.get(i10);
            if (dVar instanceof l) {
                v5.g.g(eVar, i, arrayList, eVar2, (l) dVar);
            }
        }
    }
}
