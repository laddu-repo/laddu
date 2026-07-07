package e7;

import j1.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends k {
    @Override // e7.e
    public final Object f(o7.a aVar, float f3) {
        return Float.valueOf(m(aVar, f3));
    }

    public final float l() {
        return m(this.f4406c.e(), c());
    }

    public final float m(o7.a aVar, float f3) {
        float f10;
        Object obj = aVar.f10013b;
        Object obj2 = aVar.f10013b;
        if (obj != null && aVar.f10014c != null) {
            f0 f0Var = this.f4408e;
            if (f0Var != null) {
                f10 = f3;
                Float f11 = (Float) f0Var.U(aVar.f10018g, aVar.f10019h.floatValue(), (Float) obj2, (Float) aVar.f10014c, f10, d(), this.f4407d);
                if (f11 != null) {
                    return f11.floatValue();
                }
            } else {
                f10 = f3;
            }
            if (aVar.f10020i == -3987645.8f) {
                aVar.f10020i = ((Float) obj2).floatValue();
            }
            float f12 = aVar.f10020i;
            if (aVar.j == -3987645.8f) {
                aVar.j = ((Float) aVar.f10014c).floatValue();
            }
            return n7.g.f(f12, aVar.j, f10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
