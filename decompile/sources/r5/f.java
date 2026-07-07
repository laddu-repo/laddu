package r5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import j5.a0;
import j5.j;
import j5.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k8.k4;
import q5.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public final l5.e D;
    public final b E;
    public final m5.h F;

    public f(w wVar, d dVar, b bVar, j jVar) {
        super(wVar, dVar);
        this.E = bVar;
        l5.e eVar = new l5.e(wVar, this, new m("__container", dVar.f11264a, false), jVar);
        this.D = eVar;
        List list = Collections.EMPTY_LIST;
        eVar.c(list, list);
        ad.c cVar = this.f11253p.f11285x;
        if (cVar != null) {
            this.F = new m5.h(this, this, cVar);
        }
    }

    @Override // r5.a, l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        super.a(rectF, matrix, z2);
        this.D.a(rectF, this.f11251n, z2);
    }

    @Override // r5.a, o5.f
    public final void g(Object obj, p2.c cVar) {
        super.g(obj, cVar);
        PointF pointF = a0.f6788a;
        m5.h hVar = this.F;
        if (obj == 5 && hVar != null) {
            hVar.f8465c.j(cVar);
            return;
        }
        if (obj == a0.E && hVar != null) {
            hVar.c(cVar);
            return;
        }
        if (obj == a0.F && hVar != null) {
            hVar.f8467e.j(cVar);
            return;
        }
        if (obj == a0.G && hVar != null) {
            hVar.f.j(cVar);
        } else {
            if (obj != a0.H || hVar == null) {
                return;
            }
            hVar.f8468g.j(cVar);
        }
    }

    @Override // r5.a
    public final void k(Canvas canvas, Matrix matrix, int i, v5.a aVar) {
        m5.h hVar = this.F;
        if (hVar != null) {
            aVar = hVar.a(matrix, i);
        }
        this.D.e(canvas, matrix, i, aVar);
    }

    @Override // r5.a
    public final k4 l() {
        k4 k4Var = this.f11253p.f11284w;
        return k4Var != null ? k4Var : this.E.f11253p.f11284w;
    }

    @Override // r5.a
    public final void p(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        this.D.h(eVar, i, arrayList, eVar2);
    }
}
