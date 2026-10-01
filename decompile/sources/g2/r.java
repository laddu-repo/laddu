package g2;

import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f5384a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5385b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5386c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5387d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5388e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5389f;

    public r(int i6, int i10, String str, String str2, String str3, String str4) {
        this.f5384a = i6;
        this.f5385b = i10;
        this.f5386c = str;
        this.f5387d = str2;
        this.f5388e = str3;
        this.f5389f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f5384a == rVar.f5384a && this.f5385b == rVar.f5385b && TextUtils.equals(this.f5386c, rVar.f5386c) && TextUtils.equals(this.f5387d, rVar.f5387d) && TextUtils.equals(this.f5388e, rVar.f5388e) && TextUtils.equals(this.f5389f, rVar.f5389f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11;
        int i12 = ((this.f5384a * 31) + this.f5385b) * 31;
        int i13 = 0;
        String str = this.f5386c;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i12 + i6) * 31;
        String str2 = this.f5387d;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f5388e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f5389f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
