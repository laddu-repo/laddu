package l4;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements Comparable {
    public final int A;
    public final boolean B;
    public final int C;

    /* renamed from: x, reason: collision with root package name */
    public final u f8191x;

    /* renamed from: y, reason: collision with root package name */
    public final Bundle f8192y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f8193z;

    public t(u uVar, Bundle bundle, boolean z10, int i6, boolean z11, int i10) {
        this.f8191x = uVar;
        this.f8192y = bundle;
        this.f8193z = z10;
        this.A = i6;
        this.B = z11;
        this.C = i10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(t other) {
        kotlin.jvm.internal.k.e(other, "other");
        boolean z10 = other.B;
        boolean z11 = other.f8193z;
        Bundle bundle = other.f8192y;
        boolean z12 = this.f8193z;
        if (z12 && !z11) {
            return 1;
        }
        if (!z12 && z11) {
            return -1;
        }
        int i6 = this.A - other.A;
        if (i6 > 0) {
            return 1;
        }
        if (i6 < 0) {
            return -1;
        }
        Bundle source = this.f8192y;
        if (source != null && bundle == null) {
            return 1;
        }
        if (source == null && bundle != null) {
            return -1;
        }
        if (source != null) {
            kotlin.jvm.internal.k.e(source, "source");
            int size = source.size();
            kotlin.jvm.internal.k.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z13 = this.B;
        if (z13 && !z10) {
            return 1;
        }
        if (!z13 && z10) {
            return -1;
        }
        return this.C - other.C;
    }
}
