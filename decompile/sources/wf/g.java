package wf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14322a;

    /* renamed from: b, reason: collision with root package name */
    public int f14323b;

    @Override // wf.x0
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f14322a, this.f14323b);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // wf.x0
    public final void b(int i6) {
        byte[] bArr = this.f14322a;
        if (bArr.length < i6) {
            int length = bArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i6);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
            this.f14322a = copyOf;
        }
    }

    @Override // wf.x0
    public final int d() {
        return this.f14323b;
    }
}
