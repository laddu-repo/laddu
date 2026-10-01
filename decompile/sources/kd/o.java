package kd;

import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class o {
    public static final n Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f7886a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7887b;

    public /* synthetic */ o(int i6, String str, String str2) {
        if (3 == (i6 & 3)) {
            this.f7886a = str;
            this.f7887b = str2;
        } else {
            u0.h(i6, 3, m.f7879a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (kotlin.jvm.internal.k.a(this.f7886a, oVar.f7886a) && kotlin.jvm.internal.k.a(this.f7887b, oVar.f7887b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7887b.hashCode() + (this.f7886a.hashCode() * 31);
    }

    public final String toString() {
        return "DataRow(name=" + this.f7886a + ", value=" + this.f7887b + ")";
    }
}
