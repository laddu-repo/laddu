package kd;

import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class d0 {
    public static final c0 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7845a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7846b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7847c;

    public /* synthetic */ d0(int i6, Integer num, String str, String str2) {
        this.f7845a = (i6 & 1) == 0 ? null : num;
        if ((i6 & 2) == 0) {
            this.f7846b = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            this.f7846b = str;
        }
        if ((i6 & 4) == 0) {
            this.f7847c = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            this.f7847c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (kotlin.jvm.internal.k.a(this.f7845a, d0Var.f7845a) && kotlin.jvm.internal.k.a(this.f7846b, d0Var.f7846b) && kotlin.jvm.internal.k.a(this.f7847c, d0Var.f7847c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f7845a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return this.f7847c.hashCode() + h8.c.g(this.f7846b, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("M3UPlaylist(id=");
        sb2.append(this.f7845a);
        sb2.append(", title=");
        sb2.append(this.f7846b);
        sb2.append(", path=");
        return r4.a.o(sb2, this.f7847c, ")");
    }

    public d0(String title, Integer num, String path) {
        kotlin.jvm.internal.k.e(title, "title");
        kotlin.jvm.internal.k.e(path, "path");
        this.f7845a = num;
        this.f7846b = title;
        this.f7847c = path;
    }

    public /* synthetic */ d0(int i6, String str, String str2) {
        this((i6 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (Integer) null, (i6 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2);
    }
}
