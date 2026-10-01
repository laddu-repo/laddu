package kd;

import java.util.Map;
import okhttp3.HttpUrl;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class p0 {
    public static final o0 Companion = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final he.f[] f7889g = {null, null, null, null, null, he.a.c(he.g.f6074y, new d.a0(14))};

    /* renamed from: a, reason: collision with root package name */
    public final String f7890a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7891b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7892c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7893d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7894e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f7895f;

    public /* synthetic */ p0(int i6, String str, String str2, int i10, String str3, String str4, Map map) {
        if (2 != (i6 & 2)) {
            u0.h(i6, 2, n0.f7885a.d());
            throw null;
        }
        if ((i6 & 1) == 0) {
            this.f7890a = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            this.f7890a = str;
        }
        this.f7891b = str2;
        if ((i6 & 4) == 0) {
            this.f7892c = 0;
        } else {
            this.f7892c = i10;
        }
        if ((i6 & 8) == 0) {
            this.f7893d = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            this.f7893d = str3;
        }
        if ((i6 & 16) == 0) {
            this.f7894e = null;
        } else {
            this.f7894e = str4;
        }
        if ((i6 & 32) == 0) {
            this.f7895f = null;
        } else {
            this.f7895f = map;
        }
    }

    public static p0 a(p0 p0Var, String str, int i6, Map map, int i10) {
        String title = p0Var.f7890a;
        if ((i10 & 2) != 0) {
            str = p0Var.f7891b;
        }
        String link = str;
        String api = p0Var.f7893d;
        String str2 = p0Var.f7894e;
        if ((i10 & 32) != 0) {
            map = p0Var.f7895f;
        }
        p0Var.getClass();
        kotlin.jvm.internal.k.e(title, "title");
        kotlin.jvm.internal.k.e(link, "link");
        kotlin.jvm.internal.k.e(api, "api");
        return new p0(title, link, i6, api, str2, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (kotlin.jvm.internal.k.a(this.f7890a, p0Var.f7890a) && kotlin.jvm.internal.k.a(this.f7891b, p0Var.f7891b) && this.f7892c == p0Var.f7892c && kotlin.jvm.internal.k.a(this.f7893d, p0Var.f7893d) && kotlin.jvm.internal.k.a(this.f7894e, p0Var.f7894e) && kotlin.jvm.internal.k.a(this.f7895f, p0Var.f7895f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g10 = h8.c.g(this.f7893d, (h8.c.g(this.f7891b, this.f7890a.hashCode() * 31, 31) + this.f7892c) * 31, 31);
        int i6 = 0;
        String str = this.f7894e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (g10 + hashCode) * 31;
        Map map = this.f7895f;
        if (map != null) {
            i6 = map.hashCode();
        }
        return i10 + i6;
    }

    public final String toString() {
        return "StreamUrl(title=" + this.f7890a + ", link=" + this.f7891b + ", type=" + this.f7892c + ", api=" + this.f7893d + ", drmType=" + this.f7894e + ", headers=" + this.f7895f + ")";
    }

    public p0(String str, String link, int i6, String api, String str2, Map map) {
        kotlin.jvm.internal.k.e(link, "link");
        kotlin.jvm.internal.k.e(api, "api");
        this.f7890a = str;
        this.f7891b = link;
        this.f7892c = i6;
        this.f7893d = api;
        this.f7894e = str2;
        this.f7895f = map;
    }

    public /* synthetic */ p0(String str, String str2, Map map, String str3, int i6, int i10) {
        this(HttpUrl.FRAGMENT_ENCODE_SET, str, (i10 & 4) != 0 ? 0 : i6, (i10 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2, (i10 & 16) != 0 ? null : str3, map);
    }
}
