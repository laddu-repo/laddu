package wf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f14409a;

    /* renamed from: b, reason: collision with root package name */
    public int f14410b;

    @Override // wf.x0
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f14409a, this.f14410b);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // wf.x0
    public final void b(int i6) {
        float[] fArr = this.f14409a;
        if (fArr.length < i6) {
            int length = fArr.length * 2;
            if (i6 < length) {
                i6 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i6);
            kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
            this.f14409a = copyOf;
        }
    }

    @Override // wf.x0
    public final int d() {
        return this.f14410b;
    }
}
