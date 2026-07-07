package kd;

import java.util.List;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final he.f[] f7839e = {null, null, null, he.a.c(he.g.f6074y, new d.a0(7))};

    /* renamed from: a, reason: collision with root package name */
    public final String f7840a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7841b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7842c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7843d;

    public /* synthetic */ c(int i6, String str, boolean z10, int i10, List list) {
        if (15 == (i6 & 15)) {
            this.f7840a = str;
            this.f7841b = z10;
            this.f7842c = i10;
            this.f7843d = list;
            return;
        }
        u0.h(i6, 15, a.f7834a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.k.a(this.f7840a, cVar.f7840a) && this.f7841b == cVar.f7841b && this.f7842c == cVar.f7842c && kotlin.jvm.internal.k.a(this.f7843d, cVar.f7843d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f7840a.hashCode() * 31;
        if (this.f7841b) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return this.f7843d.hashCode() + ((((hashCode + i6) * 31) + this.f7842c) * 31);
    }

    public final String toString() {
        return "Ads(adId=" + this.f7840a + ", enabled=" + this.f7841b + ", adNumber=" + this.f7842c + ", sponsors=" + this.f7843d + ")";
    }
}
