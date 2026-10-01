package j7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import b7.c0;
import b7.j;
import com.unity3d.services.UnityAdsConstants;
import e7.s;
import j1.f0;
import j2.y;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends a {
    public e7.e D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final n7.h I;
    public final y J;
    public float K;
    public boolean L;
    public final e7.h M;

    public b(b7.y yVar, d dVar, List list, j jVar) {
        super(yVar, dVar);
        a aVar;
        a bVar;
        String str;
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new n7.h();
        this.J = new y((byte) 0, 2);
        this.L = true;
        h7.b bVar2 = dVar.s;
        if (bVar2 != null) {
            e7.i G0 = bVar2.G0();
            this.D = G0;
            f(G0);
            this.D.a(this);
        } else {
            this.D = null;
        }
        v.i iVar = new v.i(jVar.j.size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size >= 0) {
                d dVar2 = (d) list.get(size);
                int c10 = y.e.c(dVar2.f7270e);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 != 5) {
                                        switch (dVar2.f7270e) {
                                            case 1:
                                                str = "PRE_COMP";
                                                break;
                                            case 2:
                                                str = "SOLID";
                                                break;
                                            case 3:
                                                str = "IMAGE";
                                                break;
                                            case 4:
                                                str = "NULL";
                                                break;
                                            case 5:
                                                str = "SHAPE";
                                                break;
                                            case 6:
                                                str = "TEXT";
                                                break;
                                            case 7:
                                                str = "UNKNOWN";
                                                break;
                                            default:
                                                str = "null";
                                                break;
                                        }
                                        n7.c.b("Unknown layer type ".concat(str));
                                        bVar = null;
                                    } else {
                                        bVar = new i(yVar, dVar2);
                                    }
                                } else {
                                    bVar = new f(yVar, dVar2, this, jVar);
                                }
                            } else {
                                bVar = new a(yVar, dVar2);
                            }
                        } else {
                            bVar = new c(yVar, dVar2);
                        }
                    } else {
                        bVar = new g(yVar, dVar2);
                    }
                } else {
                    bVar = new b(yVar, dVar2, (List) jVar.f1544c.get(dVar2.f7272g), jVar);
                }
                if (bVar != null) {
                    iVar.h(bVar.f7256p.f7269d, bVar);
                    if (aVar2 != null) {
                        aVar2.s = bVar;
                        aVar2 = null;
                    } else {
                        this.E.add(0, bVar);
                        int c11 = y.e.c(dVar2.f7284u);
                        if (c11 == 1 || c11 == 2) {
                            aVar2 = bVar;
                        }
                    }
                }
                size--;
            } else {
                for (int i6 = 0; i6 < iVar.i(); i6++) {
                    a aVar3 = (a) iVar.d(iVar.g(i6));
                    if (aVar3 != null && (aVar = (a) iVar.d(aVar3.f7256p.f7271f)) != null) {
                        aVar3.f7259t = aVar;
                    }
                }
                b4.h hVar = this.f7256p.f7287x;
                if (hVar != null) {
                    this.M = new e7.h(this, this, hVar);
                    return;
                }
                return;
            }
        }
    }

    @Override // j7.a, g7.f
    public final void d(f0 f0Var, Object obj) {
        super.d(f0Var, obj);
        if (obj == c0.C) {
            s sVar = new s(f0Var, null);
            this.D = sVar;
            sVar.a(this);
            f(this.D);
            return;
        }
        e7.h hVar = this.M;
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
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ((a) arrayList.get(size)).e(rectF2, this.f7254n, true);
            rectF.union(rectF2);
        }
    }

    @Override // j7.a
    public final void k(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        e7.h hVar = this.M;
        int i10 = 0;
        if (aVar == null && hVar == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        b7.y yVar = this.f7255o;
        boolean z12 = yVar.P;
        int i11 = 255;
        ArrayList arrayList = this.E;
        if ((z12 && arrayList.size() > 1 && i6 != 255) || (z10 && yVar.Q)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i11 = i6;
        }
        if (hVar != null) {
            aVar = hVar.b(matrix, i11);
        }
        boolean z13 = this.L;
        d dVar = this.f7256p;
        RectF rectF = this.G;
        if (!z13 && "__container".equals(dVar.f7268c)) {
            rectF.setEmpty();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                RectF rectF2 = this.H;
                ((a) obj).e(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        } else {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dVar.f7279o, dVar.f7280p);
            matrix.mapRect(rectF);
        }
        n7.h hVar2 = this.I;
        if (z11) {
            y yVar2 = this.J;
            yVar2.f7145z = null;
            yVar2.f7144y = i6;
            if (aVar != null) {
                if (Color.alpha(aVar.f9087d) > 0) {
                    yVar2.f7145z = aVar;
                } else {
                    yVar2.f7145z = null;
                }
                aVar = null;
            }
            canvas2 = hVar2.e(canvas, rectF, yVar2);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((a) arrayList.get(size2)).c(canvas2, matrix, i11, aVar);
            }
        }
        if (z11) {
            hVar2.c();
        }
        canvas.restore();
    }

    @Override // j7.a
    public final void p(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i10 < arrayList2.size()) {
                ((a) arrayList2.get(i10)).h(eVar, i6, arrayList, eVar2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // j7.a
    public final void q(boolean z10) {
        super.q(z10);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((a) obj).q(z10);
        }
    }

    @Override // j7.a
    public final void r(float f3) {
        this.K = f3;
        super.r(f3);
        e7.e eVar = this.D;
        d dVar = this.f7256p;
        if (eVar != null) {
            j jVar = this.f7255o.f1613x;
            f3 = ((((Float) eVar.e()).floatValue() * dVar.f7267b.f1554n) - dVar.f7267b.f1552l) / ((jVar.f1553m - jVar.f1552l) + 0.01f);
        }
        if (this.D == null) {
            float f10 = dVar.f7278n;
            j jVar2 = dVar.f7267b;
            f3 -= f10 / (jVar2.f1553m - jVar2.f1552l);
        }
        if (dVar.f7277m != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !"__container".equals(dVar.f7268c)) {
            f3 /= dVar.f7277m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a) arrayList.get(size)).r(f3);
        }
    }
}
