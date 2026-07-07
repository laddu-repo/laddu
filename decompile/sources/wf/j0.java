package wf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f14341a;

    /* renamed from: b, reason: collision with root package name */
    public int f14342b;

    @Override // wf.x0
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f14341a, this.f14342b);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // wf.x0
    public final void b(int i6) {
        long[] jArr = this.f14341a;
        if (jArr.length < i6) {
            int length = jArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i6);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
            this.f14341a = copyOf;
        }
    }

    @Override // wf.x0
    public final int d() {
        return this.f14342b;
    }
}
