package wf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f14308a;

    /* renamed from: b, reason: collision with root package name */
    public int f14309b;

    @Override // wf.x0
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f14308a, this.f14309b);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // wf.x0
    public final void b(int i6) {
        int[] iArr = this.f14308a;
        if (iArr.length < i6) {
            int length = iArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
            this.f14308a = copyOf;
        }
    }

    @Override // wf.x0
    public final int d() {
        return this.f14309b;
    }
}
