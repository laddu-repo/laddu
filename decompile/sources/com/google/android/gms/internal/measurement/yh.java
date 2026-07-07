package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class yh implements ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ph f3263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3264b;

    public yh(ph phVar, Object obj) {
        this.f3263a = phVar;
        eh.c(obj, "log site qualifier");
        this.f3264b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yh)) {
            return false;
        }
        yh yhVar = (yh) obj;
        return this.f3263a.equals(yhVar.f3263a) && this.f3264b.equals(yhVar.f3264b);
    }

    public final int hashCode() {
        return this.f3263a.hashCode() ^ this.f3264b.hashCode();
    }

    public final String toString() {
        String string = this.f3263a.toString();
        int length = string.length();
        String string2 = this.f3264b.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 3);
        j4.a.s(sb2, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb2.append("' }");
        return sb2.toString();
    }
}
