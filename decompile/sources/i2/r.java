package i2;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6449e;
    public final String f;

    public r(int i, int i10, String str, String str2, String str3, String str4) {
        this.f6445a = i;
        this.f6446b = i10;
        this.f6447c = str;
        this.f6448d = str2;
        this.f6449e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f6445a == rVar.f6445a && this.f6446b == rVar.f6446b && TextUtils.equals(this.f6447c, rVar.f6447c) && TextUtils.equals(this.f6448d, rVar.f6448d) && TextUtils.equals(this.f6449e, rVar.f6449e) && TextUtils.equals(this.f, rVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f6445a * 31) + this.f6446b) * 31;
        String str = this.f6447c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6448d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6449e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
