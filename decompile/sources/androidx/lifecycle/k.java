package androidx.lifecycle;

import gf.a2;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends q0 {

    /* renamed from: l, reason: collision with root package name */
    public r.f f951l;

    /* renamed from: m, reason: collision with root package name */
    public d f952m;

    @Override // androidx.lifecycle.o0
    public final void e() {
        r.b bVar = (r.b) this.f951l.iterator();
        if (!bVar.hasNext()) {
            d dVar = this.f952m;
            if (dVar != null) {
                a2 a2Var = (a2) dVar.f901f;
                le.c cVar = null;
                if (a2Var != null) {
                    a2Var.d(null);
                }
                dVar.f901f = null;
                if (((a2) dVar.f900e) == null) {
                    dVar.f900e = gf.f0.w((mf.e) dVar.f898c, null, new c(dVar, cVar, 0), 3);
                    return;
                }
                return;
            }
            return;
        }
        ((Map.Entry) bVar.next()).getValue().getClass();
        throw new ClassCastException();
    }

    @Override // androidx.lifecycle.o0
    public final void f() {
        r.b bVar = (r.b) this.f951l.iterator();
        if (!bVar.hasNext()) {
            d dVar = this.f952m;
            if (dVar != null) {
                if (((a2) dVar.f901f) == null) {
                    mf.e eVar = (mf.e) dVar.f898c;
                    of.e eVar2 = gf.o0.f5693a;
                    dVar.f901f = gf.f0.w(eVar, mf.o.f8875a.A, new b(dVar, null, 0), 2);
                    return;
                }
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            return;
        }
        ((Map.Entry) bVar.next()).getValue().getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(ne.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.j
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.j r0 = (androidx.lifecycle.j) r0
            int r1 = r0.f945z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f945z = r1
            goto L18
        L13:
            androidx.lifecycle.j r0 = new androidx.lifecycle.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f943x
            int r0 = r0.f945z
            if (r0 == 0) goto L2d
            r1 = 1
            if (r0 != r1) goto L25
            he.a.f(r5)
            return
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            he.a.f(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.k.i(ne.c):void");
    }
}
