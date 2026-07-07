package r1;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final String f11276i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11277k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11278l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f11279m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f11280n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f11281o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f11282p;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f11283a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11284b;

    /* renamed from: c, reason: collision with root package name */
    public final y f11285c;

    /* renamed from: d, reason: collision with root package name */
    public final u f11286d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11287e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11288f;

    /* renamed from: g, reason: collision with root package name */
    public final db.k0 f11289g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11290h;

    static {
        String str = u1.a0.f12750a;
        f11276i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        f11277k = Integer.toString(2, 36);
        f11278l = Integer.toString(3, 36);
        f11279m = Integer.toString(4, 36);
        f11280n = Integer.toString(5, 36);
        f11281o = Integer.toString(6, 36);
        f11282p = Integer.toString(7, 36);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [qb.a, java.lang.Object] */
    public a0(Uri uri, String str, y yVar, u uVar, List list, String str2, db.k0 k0Var, long j10) {
        this.f11283a = uri;
        this.f11284b = k0.p(str);
        this.f11285c = yVar;
        this.f11286d = uVar;
        this.f11287e = list;
        this.f11288f = str2;
        this.f11289g = k0Var;
        db.h0 j11 = db.k0.j();
        for (int i6 = 0; i6 < k0Var.size(); i6++) {
            d0 d0Var = (d0) k0Var.get(i6);
            ?? obj = new Object();
            obj.f11149d = d0Var.f11361a;
            obj.f11146a = d0Var.f11362b;
            obj.f11150e = d0Var.f11363c;
            obj.f11147b = d0Var.f11364d;
            obj.f11148c = d0Var.f11365e;
            obj.f11151f = d0Var.f11366f;
            obj.f11152g = d0Var.f11367g;
            j11.a(new d0(obj));
        }
        j11.g();
        this.f11290h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (this.f11283a.equals(a0Var.f11283a) && Objects.equals(this.f11284b, a0Var.f11284b) && Objects.equals(this.f11285c, a0Var.f11285c) && Objects.equals(this.f11286d, a0Var.f11286d) && this.f11287e.equals(a0Var.f11287e) && Objects.equals(this.f11288f, a0Var.f11288f) && this.f11289g.equals(a0Var.f11289g) && this.f11290h == a0Var.f11290h) {
                    return true;
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
        int hashCode4 = this.f11283a.hashCode() * 31;
        int i6 = 0;
        String str = this.f11284b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        y yVar = this.f11285c;
        if (yVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = yVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        u uVar = this.f11286d;
        if (uVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uVar.hashCode();
        }
        int hashCode5 = (this.f11287e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f11288f;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return (int) (((this.f11289g.hashCode() + ((hashCode5 + i6) * 31)) * 31 * 31) + this.f11290h);
    }
}
