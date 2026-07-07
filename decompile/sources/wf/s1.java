package wf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s1 extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f14389a;

    /* renamed from: b, reason: collision with root package name */
    public int f14390b;

    @Override // wf.x0
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f14389a, this.f14390b);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
        return new he.x(copyOf);
    }

    @Override // wf.x0
    public final void b(int i6) {
        short[] sArr = this.f14389a;
        if (sArr.length < i6) {
            int length = sArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i6);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
            this.f14389a = copyOf;
        }
    }

    @Override // wf.x0
    public final int d() {
        return this.f14390b;
    }
}
