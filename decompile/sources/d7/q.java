package d7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import b7.c0;
import b7.y;
import j1.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements f, n, k, e7.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3940a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f3941b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final y f3942c;

    /* renamed from: d, reason: collision with root package name */
    public final j7.a f3943d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3944e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3945f;

    /* renamed from: g, reason: collision with root package name */
    public final e7.i f3946g;

    /* renamed from: h, reason: collision with root package name */
    public final e7.i f3947h;

    /* renamed from: i, reason: collision with root package name */
    public final e7.r f3948i;
    public e j;

    public q(y yVar, j7.a aVar, i7.i iVar) {
        this.f3942c = yVar;
        this.f3943d = aVar;
        this.f3944e = iVar.f6669b;
        this.f3945f = iVar.f6671d;
        e7.i G0 = iVar.f6670c.G0();
        this.f3946g = G0;
        aVar.f(G0);
        G0.a(this);
        e7.i G02 = ((h7.b) iVar.f6672e).G0();
        this.f3947h = G02;
        aVar.f(G02);
        G02.a(this);
        h7.d dVar = (h7.d) iVar.f6673f;
        dVar.getClass();
        e7.r rVar = new e7.r(dVar);
        this.f3948i = rVar;
        rVar.a(aVar);
        rVar.b(this);
    }

    @Override // e7.a
    public final void a() {
        this.f3942c.invalidateSelf();
    }

    @Override // d7.d
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // d7.f
    public final void c(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        float floatValue = ((Float) this.f3946g.e()).floatValue();
        float floatValue2 = ((Float) this.f3947h.e()).floatValue();
        e7.r rVar = this.f3948i;
        float floatValue3 = ((Float) rVar.f4458v.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) rVar.f4459w.e()).floatValue() / 100.0f;
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix2 = this.f3940a;
            matrix2.set(matrix);
            float f3 = i10;
            matrix2.preConcat(rVar.f(f3 + floatValue2));
            this.j.c(canvas, matrix2, (int) (n7.g.f(floatValue3, floatValue4, f3 / floatValue) * i6), aVar);
        }
    }

    @Override // g7.f
    public final void d(f0 f0Var, Object obj) {
        if (!this.f3948i.c(f0Var, obj)) {
            if (obj == c0.s) {
                this.f3946g.j(f0Var);
            } else if (obj == c0.f1507t) {
                this.f3947h.j(f0Var);
            }
        }
    }

    @Override // d7.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        this.j.e(rectF, matrix, z10);
    }

    @Override // d7.k
    public final void f(ListIterator listIterator) {
        if (this.j != null) {
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
        this.j = new e(this.f3942c, this.f3943d, "Repeater", this.f3945f, arrayList, null);
    }

    @Override // d7.n
    public final Path g() {
        Path g10 = this.j.g();
        Path path = this.f3941b;
        path.reset();
        float floatValue = ((Float) this.f3946g.e()).floatValue();
        float floatValue2 = ((Float) this.f3947h.e()).floatValue();
        for (int i6 = ((int) floatValue) - 1; i6 >= 0; i6--) {
            Matrix f3 = this.f3948i.f(i6 + floatValue2);
            Matrix matrix = this.f3940a;
            matrix.set(f3);
            path.addPath(g10, matrix);
        }
        return path;
    }

    @Override // d7.d
    public final String getName() {
        return this.f3944e;
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        n7.g.g(eVar, i6, arrayList, eVar2, this);
        for (int i10 = 0; i10 < this.j.f3859i.size(); i10++) {
            d dVar = (d) this.j.f3859i.get(i10);
            if (dVar instanceof l) {
                n7.g.g(eVar, i6, arrayList, eVar2, (l) dVar);
            }
        }
    }
}
