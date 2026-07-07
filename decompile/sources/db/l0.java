package db;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class l0 extends p implements Serializable {
    public final transient h1 A;

    public l0(h1 h1Var, int i6) {
        this.A = h1Var;
    }

    @Override // db.o
    public final boolean b(Object obj) {
        if (obj != null && super.b(obj)) {
            return true;
        }
        return false;
    }

    @Override // db.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n0 a() {
        return this.A;
    }

    public final k0 d(String str) {
        k0 k0Var = (k0) this.A.get(str);
        if (k0Var == null) {
            i0 i0Var = k0.f4008y;
            return c1.B;
        }
        return k0Var;
    }
}
