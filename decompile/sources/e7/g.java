package e7;

import b7.j0;
import j1.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends f0 {
    public final /* synthetic */ f0 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f0 f0Var) {
        super(22);
        this.A = f0Var;
    }

    @Override // j1.f0
    public final Object T(o7.b bVar) {
        Float f3 = (Float) ((j0) this.A.f6908z);
        if (f3 == null) {
            return null;
        }
        return Float.valueOf(f3.floatValue() * 2.55f);
    }
}
