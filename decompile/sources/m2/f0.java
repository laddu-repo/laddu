package m2;

import android.net.Uri;
import db.c1;
import db.n0;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f8468a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f8469b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8470c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8471d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8472e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8473f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f8474g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8475h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8476i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8477k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8478l;

    public f0(e0 e0Var) {
        this.f8468a = n0.a(e0Var.f8454a);
        this.f8469b = e0Var.f8455b.g();
        String str = e0Var.f8457d;
        String str2 = u1.a0.f12750a;
        this.f8470c = str;
        this.f8471d = e0Var.f8458e;
        this.f8472e = e0Var.f8459f;
        this.f8474g = e0Var.f8460g;
        this.f8475h = e0Var.f8461h;
        this.f8473f = e0Var.f8456c;
        this.f8476i = e0Var.f8462i;
        this.j = e0Var.f8463k;
        this.f8477k = e0Var.f8464l;
        this.f8478l = e0Var.j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f0.class == obj.getClass()) {
                f0 f0Var = (f0) obj;
                if (this.f8473f == f0Var.f8473f) {
                    n0 n0Var = f0Var.f8468a;
                    n0 n0Var2 = this.f8468a;
                    n0Var2.getClass();
                    if (db.r.h(n0Var, n0Var2) && this.f8469b.equals(f0Var.f8469b) && Objects.equals(this.f8471d, f0Var.f8471d) && Objects.equals(this.f8470c, f0Var.f8470c) && Objects.equals(this.f8472e, f0Var.f8472e) && Objects.equals(this.f8478l, f0Var.f8478l) && Objects.equals(this.f8474g, f0Var.f8474g) && Objects.equals(this.j, f0Var.j) && Objects.equals(this.f8477k, f0Var.f8477k) && Objects.equals(this.f8475h, f0Var.f8475h) && Objects.equals(this.f8476i, f0Var.f8476i)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = (this.f8469b.hashCode() + ((this.f8468a.hashCode() + 217) * 31)) * 31;
        int i6 = 0;
        String str = this.f8471d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode9 + hashCode) * 31;
        String str2 = this.f8470c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f8472e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (((i11 + hashCode3) * 31) + this.f8473f) * 31;
        String str4 = this.f8478l;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Uri uri = this.f8474g;
        if (uri == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uri.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str5 = this.j;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str6 = this.f8477k;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str7 = this.f8475h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str8 = this.f8476i;
        if (str8 != null) {
            i6 = str8.hashCode();
        }
        return i17 + i6;
    }
}
