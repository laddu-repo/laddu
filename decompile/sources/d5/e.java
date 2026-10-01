package d5;

import df.m;
import df.n;
import java.util.Locale;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3801a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3802b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3803c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3804d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3805e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3806f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3807g;

    public e(int i6, int i10, String name, String type, String str, boolean z10) {
        int i11;
        k.e(name, "name");
        k.e(type, "type");
        this.f3801a = name;
        this.f3802b = type;
        this.f3803c = z10;
        this.f3804d = i6;
        this.f3805e = str;
        this.f3806f = i10;
        String upperCase = type.toUpperCase(Locale.ROOT);
        k.d(upperCase, "toUpperCase(...)");
        if (m.I(upperCase, "INT", false)) {
            i11 = 3;
        } else if (!m.I(upperCase, "CHAR", false) && !m.I(upperCase, "CLOB", false) && !m.I(upperCase, "TEXT", false)) {
            if (m.I(upperCase, "BLOB", false)) {
                i11 = 5;
            } else if (!m.I(upperCase, "REAL", false) && !m.I(upperCase, "FLOA", false) && !m.I(upperCase, "DOUB", false)) {
                i11 = 1;
            } else {
                i11 = 4;
            }
        } else {
            i11 = 2;
        }
        this.f3807g = i11;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f3804d > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e eVar = (e) obj;
                int i6 = eVar.f3806f;
                if (eVar.f3804d > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11 && k.a(this.f3801a, eVar.f3801a) && this.f3803c == eVar.f3803c) {
                    String str = eVar.f3805e;
                    int i10 = this.f3806f;
                    String str2 = this.f3805e;
                    if ((i10 != 1 || i6 != 2 || str2 == null || cf.m.f(str2, str)) && ((i10 != 2 || i6 != 1 || str == null || cf.m.f(str, str2)) && ((i10 == 0 || i10 != i6 || (str2 == null ? str == null : cf.m.f(str2, str))) && this.f3807g == eVar.f3807g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6;
        int hashCode = ((this.f3801a.hashCode() * 31) + this.f3807g) * 31;
        if (this.f3803c) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return ((hashCode + i6) * 31) + this.f3804d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f3801a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f3802b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f3807g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f3803c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f3804d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f3805e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return n.r(n.t(sb2.toString()));
    }
}
