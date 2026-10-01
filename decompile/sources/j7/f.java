package j7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import b7.c0;
import b7.j;
import b7.y;
import i7.m;
import j1.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends a {
    public final d7.e D;
    public final b E;
    public final e7.h F;

    public f(y yVar, d dVar, b bVar, j jVar) {
        super(yVar, dVar);
        this.E = bVar;
        d7.e eVar = new d7.e(yVar, this, new m("__container", dVar.f7266a, false), jVar);
        this.D = eVar;
        List list = Collections.EMPTY_LIST;
        eVar.b(list, list);
        b4.h hVar = this.f7256p.f7287x;
        if (hVar != null) {
            this.F = new e7.h(this, this, hVar);
        }
    }

    @Override // j7.a, g7.f
    public final void d(f0 f0Var, Object obj) {
        super.d(f0Var, obj);
        PointF pointF = c0.f1490a;
        e7.h hVar = this.F;
        if (obj == 5 && hVar != null) {
            hVar.f4415c.j(f0Var);
            return;
        }
        if (obj == c0.E && hVar != null) {
            hVar.c(f0Var);
            return;
        }
        if (obj == c0.F && hVar != null) {
            hVar.f4417e.j(f0Var);
            return;
        }
        if (obj == c0.G && hVar != null) {
            hVar.f4418f.j(f0Var);
        } else if (obj == c0.H && hVar != null) {
            hVar.f4419g.j(f0Var);
        }
    }

    @Override // j7.a, d7.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.D.e(rectF, this.f7254n, z10);
    }

    @Override // j7.a
    public final void k(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        e7.h hVar = this.F;
        if (hVar != null) {
            aVar = hVar.b(matrix, i6);
        }
        this.D.c(canvas, matrix, i6, aVar);
    }

    @Override // j7.a
    public final k7.d l() {
        k7.d dVar = this.f7256p.f7286w;
        if (dVar != null) {
            return dVar;
        }
        return this.E.f7256p.f7286w;
    }

    @Override // j7.a
    public final void p(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        this.D.h(eVar, i6, arrayList, eVar2);
    }
}
