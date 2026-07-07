package bf;

import kotlin.jvm.internal.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1668c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final s f1669a;

    /* renamed from: b, reason: collision with root package name */
    public final p f1670b;

    static {
        new r(null, null);
    }

    public r(s sVar, a0 a0Var) {
        boolean z10;
        String str;
        this.f1669a = sVar;
        this.f1670b = a0Var;
        if (sVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == (a0Var == null)) {
            return;
        }
        if (sVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + sVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f1669a == rVar.f1669a && kotlin.jvm.internal.k.a(this.f1670b, rVar.f1670b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        s sVar = this.f1669a;
        if (sVar == null) {
            hashCode = 0;
        } else {
            hashCode = sVar.hashCode();
        }
        int i10 = hashCode * 31;
        p pVar = this.f1670b;
        if (pVar != null) {
            i6 = pVar.hashCode();
        }
        return i10 + i6;
    }

    public final String toString() {
        int i6;
        s sVar = this.f1669a;
        if (sVar == null) {
            i6 = -1;
        } else {
            i6 = q.f1667a[sVar.ordinal()];
        }
        if (i6 != -1) {
            p pVar = this.f1670b;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        return "out " + pVar;
                    }
                    throw new RuntimeException();
                }
                return "in " + pVar;
            }
            return String.valueOf(pVar);
        }
        return "*";
    }
}
