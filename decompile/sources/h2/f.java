package h2;

import android.net.Uri;
import db.c1;
import db.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f5883a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f5884b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f5885c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5886d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5887e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5888f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5889g;

    /* renamed from: h, reason: collision with root package name */
    public final List f5890h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5891i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5892k;

    /* renamed from: l, reason: collision with root package name */
    public final k0 f5893l;

    /* renamed from: m, reason: collision with root package name */
    public final k0 f5894m;

    /* renamed from: n, reason: collision with root package name */
    public final c1 f5895n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5896o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5897p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5898q;

    public f(String str, Uri uri, Uri uri2, long j, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u1.c.b(z12);
        this.f5883a = str;
        this.f5884b = uri;
        this.f5885c = uri2;
        this.f5886d = j;
        this.f5887e = j10;
        this.f5888f = j11;
        this.f5889g = j12;
        this.f5890h = arrayList;
        this.f5891i = z10;
        this.j = j13;
        this.f5892k = j14;
        this.f5893l = k0.k(arrayList2);
        this.f5894m = k0.k(arrayList3);
        this.f5895n = k0.r(new d2.a(3), arrayList4);
        this.f5896o = z11;
        this.f5897p = str2;
        this.f5898q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f5886d == fVar.f5886d && this.f5887e == fVar.f5887e && this.f5888f == fVar.f5888f && this.f5889g == fVar.f5889g && this.f5891i == fVar.f5891i && this.j == fVar.j && this.f5892k == fVar.f5892k && this.f5896o == fVar.f5896o && Objects.equals(this.f5883a, fVar.f5883a) && Objects.equals(this.f5884b, fVar.f5884b) && Objects.equals(this.f5885c, fVar.f5885c) && Objects.equals(this.f5890h, fVar.f5890h) && Objects.equals(this.f5893l, fVar.f5893l) && Objects.equals(this.f5894m, fVar.f5894m) && Objects.equals(this.f5895n, fVar.f5895n) && Objects.equals(this.f5897p, fVar.f5897p) && Objects.equals(this.f5898q, fVar.f5898q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f5883a, this.f5884b, this.f5885c, Long.valueOf(this.f5886d), Long.valueOf(this.f5887e), Long.valueOf(this.f5888f), Long.valueOf(this.f5889g), this.f5890h, Boolean.valueOf(this.f5891i), Long.valueOf(this.j), Long.valueOf(this.f5892k), this.f5893l, this.f5894m, this.f5895n, Boolean.valueOf(this.f5896o), this.f5897p, this.f5898q);
    }
}
