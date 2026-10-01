package w8;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f14216b = new o(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f14217a;

    public /* synthetic */ o(String str) {
        this.f14217a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return x.j(this.f14217a, ((o) obj).f14217a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14217a});
    }
}
