package kd;

import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class r {
    public static final q Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f7896a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7897b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7898c;

    public /* synthetic */ r(int i6, String str, String str2, String str3) {
        if (3 == (i6 & 3)) {
            this.f7896a = str;
            this.f7897b = str2;
            if ((i6 & 4) == 0) {
                this.f7898c = null;
                return;
            } else {
                this.f7898c = str3;
                return;
            }
        }
        u0.h(i6, 3, p.f7888a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (kotlin.jvm.internal.k.a(this.f7896a, rVar.f7896a) && kotlin.jvm.internal.k.a(this.f7897b, rVar.f7897b) && kotlin.jvm.internal.k.a(this.f7898c, rVar.f7898c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g10 = h8.c.g(this.f7897b, this.f7896a.hashCode() * 31, 31);
        String str = this.f7898c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return g10 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Donate(message=");
        sb2.append(this.f7896a);
        sb2.append(", address=");
        sb2.append(this.f7897b);
        sb2.append(", qrImage=");
        return r4.a.o(sb2, this.f7898c, ")");
    }
}
