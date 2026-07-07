package lf;

import kf.d1;
import kf.x0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends x0 implements d1 {
    @Override // kf.d1
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.E;
            kotlin.jvm.internal.k.b(objArr);
            valueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.F + ((int) ((n() + this.H) - this.F))) - 1))]).intValue());
        }
        return valueOf;
    }

    public final void v(int i6) {
        synchronized (this) {
            Object[] objArr = this.E;
            kotlin.jvm.internal.k.b(objArr);
            m(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.F + ((int) ((n() + this.H) - this.F))) - 1))]).intValue() + i6));
        }
    }
}
