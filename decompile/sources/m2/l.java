package m2;

import db.h1;
import db.n0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f8516a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8517b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.q f8518c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f8519d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8520e;

    public l(r1.q qVar, int i6, int i10, h1 h1Var, String str) {
        this.f8516a = i6;
        this.f8517b = i10;
        this.f8518c = qVar;
        this.f8519d = n0.a(h1Var);
        this.f8520e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f8516a == lVar.f8516a && this.f8517b == lVar.f8517b && this.f8518c.equals(lVar.f8518c)) {
                n0 n0Var = lVar.f8519d;
                n0 n0Var2 = this.f8519d;
                n0Var2.getClass();
                if (db.r.h(n0Var, n0Var2) && this.f8520e.equals(lVar.f8520e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8520e.hashCode() + ((this.f8519d.hashCode() + ((this.f8518c.hashCode() + ((((217 + this.f8516a) * 31) + this.f8517b) * 31)) * 31)) * 31);
    }
}
