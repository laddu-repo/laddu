package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2412a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2413b;

    public s(int i6) {
        this.f2413b = i6;
    }

    public static m c(ic.s sVar, List list) {
        w wVar = w.ADD;
        a8.a.x("FN", 2, list);
        n c10 = ((t) sVar.f6782y).c(sVar, (n) list.get(0));
        n c11 = ((t) sVar.f6782y).c(sVar, (n) list.get(1));
        if (c11 instanceof d) {
            List k8 = ((d) c11).k();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new m(c10.f(), (ArrayList) k8, arrayList, sVar);
        }
        throw new IllegalArgumentException(r4.a.k("FN requires an ArrayValue of parameter names found ", c11.getClass().getCanonicalName()));
    }

    public static boolean d(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.f());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.f());
        }
        if ((nVar instanceof q) && (nVar2 instanceof q)) {
            if (((q) nVar).f2396x.compareTo(((q) nVar2).f2396x) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = nVar.b().doubleValue();
        double doubleValue2 = nVar2.b().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static n e(v vVar, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return g(vVar, ((Iterable) nVar).iterator(), nVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(n nVar, n nVar2) {
        if (nVar.getClass().equals(nVar2.getClass())) {
            if ((nVar instanceof r) || (nVar instanceof l)) {
                return true;
            }
            if (nVar instanceof g) {
                if (Double.isNaN(nVar.b().doubleValue()) || Double.isNaN(nVar2.b().doubleValue()) || nVar.b().doubleValue() != nVar2.b().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (nVar instanceof q) {
                return nVar.f().equals(nVar2.f());
            }
            if (nVar instanceof e) {
                return nVar.e().equals(nVar2.e());
            }
            if (nVar != nVar2) {
                return false;
            }
            return true;
        }
        if (((nVar instanceof r) || (nVar instanceof l)) && ((nVar2 instanceof r) || (nVar2 instanceof l))) {
            return true;
        }
        boolean z10 = nVar instanceof g;
        if (z10 && (nVar2 instanceof q)) {
            return f(nVar, new g(nVar2.b()));
        }
        boolean z11 = nVar instanceof q;
        if (z11 && (nVar2 instanceof g)) {
            return f(new g(nVar.b()), nVar2);
        }
        if (nVar instanceof e) {
            return f(new g(nVar.b()), nVar2);
        }
        if (nVar2 instanceof e) {
            return f(nVar, new g(nVar2.b()));
        }
        if ((!z11 && !z10) || !(nVar2 instanceof j)) {
            if (!(nVar instanceof j) || (!(nVar2 instanceof q) && !(nVar2 instanceof g))) {
                return false;
            }
            return f(new q(nVar.f()), nVar2);
        }
        return f(nVar, new q(nVar2.f()));
    }

    public static n g(v vVar, Iterator it, n nVar) {
        ic.s C;
        if (it != null) {
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                switch (vVar.f2462a) {
                    case 0:
                        C = vVar.f2463b.C();
                        String str = vVar.f2464c;
                        C.F(str, nVar2);
                        ((HashMap) C.A).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        C = vVar.f2463b.C();
                        C.F(vVar.f2464c, nVar2);
                        break;
                    default:
                        C = vVar.f2463b;
                        C.F(vVar.f2464c, nVar2);
                        break;
                }
                n A = C.A((d) nVar);
                if (A instanceof f) {
                    f fVar = (f) A;
                    String str2 = fVar.f2202y;
                    if ("break".equals(str2)) {
                        return n.f2352a;
                    }
                    if ("return".equals(str2)) {
                        return fVar;
                    }
                }
            }
        }
        return n.f2352a;
    }

    public static boolean h(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.f());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.f());
        }
        if (((!(nVar instanceof q) || !(nVar2 instanceof q)) && (Double.isNaN(nVar.b().doubleValue()) || Double.isNaN(nVar2.b().doubleValue()))) || d(nVar2, nVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x0919, code lost:
    
        if ("return".equals(r4) != false) goto L301;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:533:0x0c93. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n a(java.lang.String r12, ic.s r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 3868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s.a(java.lang.String, ic.s, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final void b(String str) {
        if (this.f2412a.contains(a8.a.A(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
