package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f2992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cd f2993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9.k f2994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y9.f0 f2995d;

    public pf(Uri uri, cd cdVar, x9.k kVar, y9.f0 f0Var) {
        this.f2992a = uri;
        this.f2993b = cdVar;
        this.f2994c = kVar;
        this.f2995d = f0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj;
        if (!this.f2992a.equals(pfVar.f2992a) || !this.f2993b.equals(pfVar.f2993b) || !this.f2994c.equals(pfVar.f2994c) || !this.f2995d.equals(pfVar.f2995d)) {
            return false;
        }
        Object obj2 = f1.f2628x;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((((((this.f2992a.hashCode() ^ 1000003) * 1000003) ^ this.f2993b.hashCode()) * 1000003) ^ this.f2994c.hashCode()) * 1000003) ^ this.f2995d.hashCode()) * 1000003) ^ f1.f2628x.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.f2992a.toString();
        int length = string.length();
        String string2 = this.f2993b.toString();
        int length2 = string2.length();
        f1 f1Var = f1.f2628x;
        String strValueOf = String.valueOf(this.f2994c);
        String strValueOf2 = String.valueOf(this.f2995d);
        String string3 = f1Var.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + string3.length() + 32 + String.valueOf(true).length() + 22);
        j4.a.s(sb2, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        j4.a.s(sb2, ", handler=", strValueOf, ", migrations=", strValueOf2);
        return d0.d.n(sb2, ", variantConfig=", string3, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
