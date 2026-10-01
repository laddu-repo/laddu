package l4;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f8116a;

    /* renamed from: b, reason: collision with root package name */
    public z f8117b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f8118c = null;

    public f(int i6) {
        this.f8116a = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f8116a != fVar.f8116a || !kotlin.jvm.internal.k.a(this.f8117b, fVar.f8117b)) {
            return false;
        }
        Bundle bundle = this.f8118c;
        Bundle bundle2 = fVar.f8118c;
        if (kotlin.jvm.internal.k.a(bundle, bundle2)) {
            return true;
        }
        if (bundle != null && bundle2 != null && bf.y.f(bundle, bundle2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = this.f8116a * 31;
        z zVar = this.f8117b;
        if (zVar != null) {
            i6 = zVar.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = i10 + i6;
        Bundle bundle = this.f8118c;
        if (bundle != null) {
            return bf.y.g(bundle) + (i11 * 31);
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f8116a));
        sb2.append(")");
        if (this.f8117b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f8117b);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        return sb3;
    }
}
