package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9.m f2661b;

    public gb(Context context, x9.m mVar) {
        this.f2660a = context;
        this.f2661b = mVar;
    }

    public final boolean equals(Object obj) {
        x9.m mVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gb) {
            gb gbVar = (gb) obj;
            x9.m mVar2 = gbVar.f2661b;
            if (this.f2660a.equals(gbVar.f2660a) && ((mVar = this.f2661b) != null ? mVar.equals(mVar2) : mVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f2660a.hashCode() ^ 1000003;
        x9.m mVar = this.f2661b;
        return (iHashCode * 1000003) ^ (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        String string = this.f2660a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f2661b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        j4.a.s(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
