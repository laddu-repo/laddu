package r1;

import android.net.Uri;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f11355h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f11356i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11357k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11358l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f11359m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f11360n;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f11361a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11363c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11364d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11365e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11366f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11367g;

    static {
        String str = u1.a0.f12750a;
        f11355h = Integer.toString(0, 36);
        f11356i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        f11357k = Integer.toString(3, 36);
        f11358l = Integer.toString(4, 36);
        f11359m = Integer.toString(5, 36);
        f11360n = Integer.toString(6, 36);
    }

    public d0(qb.a aVar) {
        this.f11361a = (Uri) aVar.f11149d;
        this.f11362b = aVar.f11146a;
        this.f11363c = (String) aVar.f11150e;
        this.f11364d = aVar.f11147b;
        this.f11365e = aVar.f11148c;
        this.f11366f = (String) aVar.f11151f;
        this.f11367g = (String) aVar.f11152g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f11361a.equals(d0Var.f11361a) && Objects.equals(this.f11362b, d0Var.f11362b) && Objects.equals(this.f11363c, d0Var.f11363c) && this.f11364d == d0Var.f11364d && this.f11365e == d0Var.f11365e && Objects.equals(this.f11366f, d0Var.f11366f) && Objects.equals(this.f11367g, d0Var.f11367g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f11361a.hashCode() * 31;
        int i6 = 0;
        String str = this.f11362b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f11363c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.f11364d) * 31) + this.f11365e) * 31;
        String str3 = this.f11366f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f11367g;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i12 + i6;
    }
}
