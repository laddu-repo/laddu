package p6;

import m6.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f10612a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10613b;

    /* renamed from: c, reason: collision with root package name */
    public final m6.h f10614c;

    public m(a0 a0Var, String str, m6.h hVar) {
        this.f10612a = a0Var;
        this.f10613b = str;
        this.f10614c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (kotlin.jvm.internal.k.a(this.f10612a, mVar.f10612a) && kotlin.jvm.internal.k.a(this.f10613b, mVar.f10613b) && this.f10614c == mVar.f10614c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f10612a.hashCode() * 31;
        String str = this.f10613b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return this.f10614c.hashCode() + ((hashCode + i6) * 31);
    }
}
