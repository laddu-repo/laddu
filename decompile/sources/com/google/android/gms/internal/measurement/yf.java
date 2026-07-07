package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd f3261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f3262b;

    public yf(cd cdVar, a1 a1Var) {
        this.f3261a = cdVar;
        if (a1Var == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.f3262b = a1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yf)) {
            return false;
        }
        yf yfVar = (yf) obj;
        return this.f3261a.equals(yfVar.f3261a) && this.f3262b.equals(yfVar.f3262b);
    }

    public final int hashCode() {
        return ((this.f3261a.hashCode() ^ 1000003) * 1000003) ^ this.f3262b.hashCode();
    }

    public final String toString() {
        String string = this.f3261a.toString();
        int length = string.length();
        String string2 = this.f3262b.toString();
        StringBuilder sb2 = new StringBuilder(length + 53 + string2.length() + 1);
        j4.a.s(sb2, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb2.append("}");
        return sb2.toString();
    }
}
