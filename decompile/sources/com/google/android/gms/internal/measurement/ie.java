package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f2755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2757e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f2758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2759h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final rc f2761k;

    public ie(boolean z2, y9.f0 f0Var, t0 t0Var, String str, String str2, y9.f0 f0Var2, y9.f0 f0Var3, boolean z10, boolean z11, boolean z12, rc rcVar) {
        de.i.e(f0Var, "enabledBackings");
        de.i.e(t0Var, "secret");
        de.i.e(str, "dirPath");
        de.i.e(str2, "gmsCoreDirPath");
        de.i.e(f0Var2, "includeStaticConfigPackages");
        de.i.e(f0Var3, "excludeStaticConfigPackages");
        de.i.e(rcVar, "clientFlags");
        this.f2753a = z2;
        this.f2754b = f0Var;
        this.f2755c = t0Var;
        this.f2756d = str;
        this.f2757e = str2;
        this.f = f0Var2;
        this.f2758g = f0Var3;
        this.f2759h = z10;
        this.i = z11;
        this.f2760j = z12;
        this.f2761k = rcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        return this.f2753a == ieVar.f2753a && de.i.a(this.f2754b, ieVar.f2754b) && de.i.a(this.f2755c, ieVar.f2755c) && de.i.a(this.f2756d, ieVar.f2756d) && de.i.a(this.f2757e, ieVar.f2757e) && de.i.a(this.f, ieVar.f) && de.i.a(this.f2758g, ieVar.f2758g) && this.f2759h == ieVar.f2759h && this.i == ieVar.i && this.f2760j == ieVar.f2760j && de.i.a(this.f2761k, ieVar.f2761k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2753a), this.f2754b, this.f2755c, this.f2756d, this.f2757e, this.f, this.f2758g, Boolean.valueOf(this.f2759h), Boolean.valueOf(this.i), Boolean.valueOf(this.f2760j));
    }

    public final String toString() {
        boolean z2 = this.f2753a;
        int length = String.valueOf(z2).length();
        List list = this.f2754b;
        int length2 = String.valueOf(list).length();
        t0 t0Var = this.f2755c;
        int length3 = String.valueOf(t0Var).length();
        String str = this.f2756d;
        int length4 = String.valueOf(str).length();
        String str2 = this.f2757e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.f2758g;
        int length7 = String.valueOf(list3).length();
        boolean z10 = this.f2759h;
        int length8 = String.valueOf(z10).length();
        boolean z11 = this.i;
        int length9 = String.valueOf(z11).length();
        boolean z12 = this.f2760j;
        int length10 = String.valueOf(z12).length();
        rc rcVar = this.f2761k;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(rcVar).length() + 1);
        sb2.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb2.append(z2);
        sb2.append(", enabledBackings=");
        sb2.append(list);
        sb2.append(", secret=");
        sb2.append(t0Var);
        sb2.append(", dirPath=");
        sb2.append(str);
        sb2.append(", gmsCoreDirPath=");
        sb2.append(str2);
        sb2.append(", includeStaticConfigPackages=");
        sb2.append(list2);
        sb2.append(", excludeStaticConfigPackages=");
        sb2.append(list3);
        sb2.append(", hasStorageInfoFromGms=");
        sb2.append(z10);
        sb2.append(", allowEmptySnapshotToken=");
        sb2.append(z11);
        sb2.append(", enableCommitV2Api=");
        sb2.append(z12);
        sb2.append(", clientFlags=");
        sb2.append(rcVar);
        sb2.append(")");
        return sb2.toString();
    }
}
