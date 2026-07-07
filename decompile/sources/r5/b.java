package r5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import j5.a0;
import j5.j;
import j5.w;
import java.util.ArrayList;
import java.util.List;
import m5.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public m5.e D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final v5.h I;
    public final c6.i J;
    public float K;
    public boolean L;
    public final m5.h M;

    public b(w wVar, d dVar, List list, j jVar) {
        a aVar;
        a bVar;
        String str;
        super(wVar, dVar);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new v5.h();
        this.J = new c6.i(10, (byte) 0);
        this.L = true;
        p5.b bVar2 = dVar.f11280s;
        if (bVar2 != null) {
            m5.i iVarF = bVar2.f();
            this.D = iVarF;
            d(iVarF);
            this.D.a(this);
        } else {
            this.D = null;
        }
        v.g gVar = new v.g(jVar.f6851j.size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < gVar.i(); i++) {
                    a aVar3 = (a) gVar.d(gVar.g(i));
                    if (aVar3 != null && (aVar = (a) gVar.d(aVar3.f11253p.f)) != null) {
                        aVar3.f11257t = aVar;
                    }
                }
                ad.c cVar = this.f11253p.f11285x;
                if (cVar != null) {
                    this.M = new m5.h(this, this, cVar);
                    return;
                }
                return;
            }
            d dVar2 = (d) list.get(size);
            int iC = y.e.c(dVar2.f11268e);
            if (iC == 0) {
                bVar = new b(wVar, dVar2, (List) jVar.f6846c.get(dVar2.f11269g), jVar);
            } else if (iC == 1) {
                bVar = new g(wVar, dVar2);
            } else if (iC == 2) {
                bVar = new c(wVar, dVar2);
            } else if (iC == 3) {
                bVar = new e(wVar, dVar2);
            } else if (iC == 4) {
                bVar = new f(wVar, dVar2, this, jVar);
            } else if (iC != 5) {
                switch (dVar2.f11268e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        str = "NULL";
                        break;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        str = "SHAPE";
                        break;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "TEXT";
                        break;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                v5.c.b("Unknown layer type ".concat(str));
                bVar = null;
            } else {
                bVar = new i(wVar, dVar2);
            }
            if (bVar != null) {
                gVar.h(bVar.f11253p.f11267d, bVar);
                if (aVar2 != null) {
                    aVar2.f11256s = bVar;
                    aVar2 = null;
                } else {
                    this.E.add(0, bVar);
                    int iC2 = y.e.c(dVar2.f11282u);
                    if (iC2 == 1 || iC2 == 2) {
                        aVar2 = bVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // r5.a, l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        super.a(rectF, matrix, z2);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((a) arrayList.get(size)).a(rectF2, this.f11251n, true);
            rectF.union(rectF2);
        }
    }

    @Override // r5.a, o5.f
    public final void g(Object obj, p2.c cVar) {
        super.g(obj, cVar);
        if (obj == a0.C) {
            s sVar = new s(null, cVar);
            this.D = sVar;
            sVar.a(this);
            d(this.D);
            return;
        }
        m5.h hVar = this.M;
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
        Canvas canvasE;
        m5.h hVar = this.M;
        int i10 = 0;
        boolean z2 = (aVar == null && hVar == null) ? false : true;
        w wVar = this.f11252o;
        boolean z10 = wVar.N;
        ArrayList arrayList = this.E;
        boolean z11 = (z10 && arrayList.size() > 1 && i != 255) || (z2 && wVar.O);
        int i11 = z11 ? 255 : i;
        if (hVar != null) {
            aVar = hVar.a(matrix, i11);
        }
        boolean z12 = this.L;
        d dVar = this.f11253p;
        RectF rectF = this.G;
        if (z12 || !"__container".equals(dVar.f11266c)) {
            rectF.set(0.0f, 0.0f, dVar.f11276o, dVar.f11277p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                RectF rectF2 = this.H;
                ((a) obj).a(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        v5.h hVar2 = this.I;
        if (z11) {
            c6.i iVar = this.J;
            iVar.f2195x = null;
            iVar.f2194w = i;
            if (aVar != null) {
                if (Color.alpha(aVar.f13169d) > 0) {
                    iVar.f2195x = aVar;
                } else {
                    iVar.f2195x = null;
                }
                aVar = null;
            }
            canvasE = hVar2.e(canvas, rectF, iVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((a) arrayList.get(size2)).e(canvasE, matrix, i11, aVar);
            }
        }
        if (z11) {
            hVar2.c();
        }
        canvas.restore();
    }

    @Override // r5.a
    public final void p(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i10 >= arrayList2.size()) {
                return;
            }
            ((a) arrayList2.get(i10)).h(eVar, i, arrayList, eVar2);
            i10++;
        }
    }

    @Override // r5.a
    public final void q(boolean z2) {
        super.q(z2);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((a) obj).q(z2);
        }
    }

    @Override // r5.a
    public final void r(float f) {
        this.K = f;
        super.r(f);
        m5.e eVar = this.D;
        d dVar = this.f11253p;
        if (eVar != null) {
            j jVar = this.f11252o.f6908v;
            f = ((((Float) eVar.e()).floatValue() * dVar.f11265b.f6855n) - dVar.f11265b.f6853l) / ((jVar.f6854m - jVar.f6853l) + 0.01f);
        }
        if (this.D == null) {
            float f4 = dVar.f11275n;
            j jVar2 = dVar.f11265b;
            f -= f4 / (jVar2.f6854m - jVar2.f6853l);
        }
        if (dVar.f11274m != 0.0f && !"__container".equals(dVar.f11266c)) {
            f /= dVar.f11274m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a) arrayList.get(size)).r(f);
        }
    }
}
