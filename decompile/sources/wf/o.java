package wf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f14365a;

    /* renamed from: b, reason: collision with root package name */
    public int f14366b;

    @Override // wf.x0
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f14365a, this.f14366b);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // wf.x0
    public final void b(int i6) {
        double[] dArr = this.f14365a;
        if (dArr.length < i6) {
            int length = dArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i6);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
            this.f14365a = copyOf;
        }
    }

    @Override // wf.x0
    public final int d() {
        return this.f14366b;
    }
}
