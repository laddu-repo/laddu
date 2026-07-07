package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2205a;

    /* renamed from: b, reason: collision with root package name */
    public final cb.l f2206b;

    public f4(Context context, cb.l lVar) {
        this.f2205a = context;
        this.f2206b = lVar;
    }

    public final boolean equals(Object obj) {
        cb.l lVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f4) {
            f4 f4Var = (f4) obj;
            cb.l lVar2 = f4Var.f2206b;
            if (this.f2205a.equals(f4Var.f2205a) && ((lVar = this.f2206b) != null ? lVar.equals(lVar2) : lVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f2205a.hashCode() ^ 1000003;
        cb.l lVar = this.f2206b;
        if (lVar == null) {
            hashCode = 0;
        } else {
            hashCode = lVar.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        String obj = this.f2205a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f2206b);
        StringBuilder sb2 = new StringBuilder(length + 45 + valueOf.length() + 1);
        r4.a.u(sb2, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
