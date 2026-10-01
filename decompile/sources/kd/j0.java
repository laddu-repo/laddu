package kd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7869a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7870b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f7871c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f7872d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7873e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7874f;

    public /* synthetic */ j0(String str, String str2, Integer num, i0 i0Var, boolean z10, int i6) {
        this(str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : num, i0Var, (i6 & 16) != 0 ? false : z10, (i6 & 32) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (kotlin.jvm.internal.k.a(this.f7869a, j0Var.f7869a) && kotlin.jvm.internal.k.a(this.f7870b, j0Var.f7870b) && kotlin.jvm.internal.k.a(this.f7871c, j0Var.f7871c) && this.f7872d == j0Var.f7872d && this.f7873e == j0Var.f7873e && this.f7874f == j0Var.f7874f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6;
        int hashCode2 = this.f7869a.hashCode() * 31;
        int i10 = 0;
        String str = this.f7870b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        Integer num = this.f7871c;
        if (num != null) {
            i10 = num.hashCode();
        }
        int hashCode3 = (this.f7872d.hashCode() + ((i11 + i10) * 31)) * 31;
        int i12 = 1237;
        if (this.f7873e) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int i13 = (hashCode3 + i6) * 31;
        if (this.f7874f) {
            i12 = 1231;
        }
        return i13 + i12;
    }

    public final String toString() {
        return "SettingItem(title=" + this.f7869a + ", subtitle=" + this.f7870b + ", icon=" + this.f7871c + ", type=" + this.f7872d + ", isChecked=" + this.f7873e + ", hasNewBadge=" + this.f7874f + ")";
    }

    public j0(String title, String str, Integer num, i0 type, boolean z10, boolean z11) {
        kotlin.jvm.internal.k.e(title, "title");
        kotlin.jvm.internal.k.e(type, "type");
        this.f7869a = title;
        this.f7870b = str;
        this.f7871c = num;
        this.f7872d = type;
        this.f7873e = z10;
        this.f7874f = z11;
    }
}
