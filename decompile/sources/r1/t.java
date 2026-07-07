package r1;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final String f11692c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f11693d;

    /* renamed from: a, reason: collision with root package name */
    public final String f11694a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11695b;

    static {
        String str = u1.a0.f12750a;
        f11692c = Integer.toString(0, 36);
        f11693d = Integer.toString(1, 36);
    }

    public t(String str, String str2) {
        this.f11694a = u1.a0.R(str);
        this.f11695b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (Objects.equals(this.f11694a, tVar.f11694a) && Objects.equals(this.f11695b, tVar.f11695b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f11695b.hashCode() * 31;
        String str = this.f11694a;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }
}
