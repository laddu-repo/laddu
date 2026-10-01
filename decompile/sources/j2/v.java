package j2;

import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f7140a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7141b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7142c;

    public v(String str, boolean z10, boolean z11) {
        this.f7140a = str;
        this.f7141b = z10;
        this.f7142c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == v.class) {
            v vVar = (v) obj;
            if (TextUtils.equals(this.f7140a, vVar.f7140a) && this.f7141b == vVar.f7141b && this.f7142c == vVar.f7142c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int g10 = h8.c.g(this.f7140a, 31, 31);
        int i10 = 1237;
        if (this.f7141b) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int i11 = (g10 + i6) * 31;
        if (this.f7142c) {
            i10 = 1231;
        }
        return i11 + i10;
    }
}
