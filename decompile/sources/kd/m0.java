package kd;

import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class m0 {
    public static final l0 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f7880a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7881b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7882c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7883d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7884e;

    public /* synthetic */ m0(int i6, int i10, String str, String str2, int i11, int i12) {
        if (15 == (i6 & 15)) {
            this.f7880a = i10;
            this.f7881b = str;
            this.f7882c = str2;
            this.f7883d = i11;
            if ((i6 & 16) == 0) {
                this.f7884e = 1;
                return;
            } else {
                this.f7884e = i12;
                return;
            }
        }
        u0.h(i6, 15, k0.f7875a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f7880a == m0Var.f7880a && kotlin.jvm.internal.k.a(this.f7881b, m0Var.f7881b) && kotlin.jvm.internal.k.a(this.f7882c, m0Var.f7882c) && this.f7883d == m0Var.f7883d && this.f7884e == m0Var.f7884e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((h8.c.g(this.f7882c, h8.c.g(this.f7881b, this.f7880a * 31, 31), 31) + this.f7883d) * 31) + this.f7884e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Sponsor(enabled=");
        sb2.append(this.f7880a);
        sb2.append(", image=");
        sb2.append(this.f7881b);
        sb2.append(", link=");
        sb2.append(this.f7882c);
        sb2.append(", showTime=");
        sb2.append(this.f7883d);
        sb2.append(", delayHours=");
        return r4.a.l(sb2, this.f7884e, ")");
    }
}
