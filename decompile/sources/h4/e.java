package h4;

import c.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import pe.v;
import pe.x;
import sb.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f6128a = new x(f.f6140a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f6129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f6130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pd.h f6131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pd.h f6132e;
    public c.x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f6134h;
    public final LinkedHashSet i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f6135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f6136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6139n;

    public e() {
        x xVar = new x(new c());
        this.f6129b = xVar;
        this.f6130c = new v(xVar);
        this.f6131d = new pd.h();
        this.f6132e = new pd.h();
        this.i = new LinkedHashSet();
        this.f6135j = new LinkedHashSet();
        this.f6136k = new LinkedHashSet();
    }

    public final void a(p pVar, d dVar, int i) {
        de.i.e(pVar, "dispatcher");
        if (dVar.f6126a == null) {
            (i != 0 ? i != 1 ? this.i : this.f6135j : this.f6136k).add(dVar);
            dVar.f6126a = pVar;
            de.i.e((c) this.f6130c.f10597v.O(), "history");
            dVar.b(i != 0 ? i != 1 ? this.f6139n : this.f6137l : this.f6138m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + dVar + "' is already added to dispatcher " + dVar.f6126a + '.').toString());
    }

    public final void b() {
        boolean z2;
        boolean z10;
        c cVar;
        pd.h hVar = this.f6131d;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                if (((c.x) it.next()).f1673b) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        pd.h hVar2 = this.f6132e;
        if (hVar2 == null || !hVar2.isEmpty()) {
            Iterator it2 = hVar2.iterator();
            while (it2.hasNext()) {
                if (((c.x) it2.next()).f1673b) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        boolean z11 = z2 || z10;
        boolean z12 = this.f6138m != z2;
        boolean z13 = this.f6137l != z10;
        boolean z14 = this.f6139n != z11;
        LinkedHashSet linkedHashSet = this.f6136k;
        if (z12) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f6135j;
        if (z13) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).b(z10);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z14) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).b(z11);
            }
        }
        this.f6138m = z2;
        this.f6137l = z10;
        this.f6139n = z11;
        c.x xVarC = this.f;
        if (xVarC == null) {
            xVarC = c(0);
        }
        c.x xVarC2 = this.f;
        if (xVarC2 == null) {
            xVarC2 = c(0);
        }
        if (de.i.a(xVarC2, xVarC)) {
            if (xVarC2 == null) {
                cVar = new c();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = hVar.iterator();
                while (it6.hasNext()) {
                    ((c.x) it6.next()).getClass();
                }
                Iterator<E> it7 = hVar2.iterator();
                while (it7.hasNext()) {
                    ((c.x) it7.next()).getClass();
                }
                y yVar = xVarC2.f1672a;
                qd.c cVarJ = fa.b.j();
                pd.j.D(arrayList, cVarJ);
                cVarJ.add(yVar);
                pd.j.D(pd.p.f10551v, cVarJ);
                cVar = new c(arrayList.size(), fa.b.b(cVarJ));
            }
            x xVar = this.f6129b;
            if (de.i.a((c) xVar.O(), cVar)) {
                return;
            }
            xVar.P(null, cVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((d) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((d) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((d) it10.next()).getClass();
            }
        }
    }

    public final c.x c(int i) {
        Object next;
        Object next2;
        pd.h hVar = this.f6132e;
        pd.h hVar2 = this.f6131d;
        Object obj = null;
        if (i == -1) {
            Iterator it = hVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((c.x) next).f1673b) {
                    break;
                }
            }
            c.x xVar = (c.x) next;
            if (xVar != null) {
                return xVar;
            }
            Iterator it2 = hVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((c.x) next3).f1673b) {
                    obj = next3;
                    break;
                }
            }
            return (c.x) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = hVar2.iterator();
            while (it3.hasNext()) {
                ((c.x) it3.next()).getClass();
            }
            Iterator it4 = hVar.iterator();
            while (it4.hasNext()) {
                ((c.x) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = hVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((c.x) next2).f1673b) {
                break;
            }
        }
        c.x xVar2 = (c.x) next2;
        if (xVar2 != null) {
            return xVar2;
        }
        Iterator it6 = hVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((c.x) next4).f1673b) {
                obj = next4;
                break;
            }
        }
        return (c.x) obj;
    }
}
