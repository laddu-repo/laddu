package wf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f14345a;

    /* renamed from: b, reason: collision with root package name */
    public int f14346b;

    @Override // wf.x0
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f14345a, this.f14346b);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // wf.x0
    public final void b(int i6) {
        char[] cArr = this.f14345a;
        if (cArr.length < i6) {
            int length = cArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i6);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
            this.f14345a = copyOf;
        }
    }

    @Override // wf.x0
    public final int d() {
        return this.f14346b;
    }
}
