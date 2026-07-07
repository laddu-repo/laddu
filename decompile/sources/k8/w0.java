package k8;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f7814e;

    public w0(long j8, long j9, Bundle bundle, String str, String str2) {
        this.f7810a = str;
        this.f7811b = str2;
        this.f7814e = bundle;
        this.f7812c = j8;
        this.f7813d = j9;
    }

    public static w0 a(v vVar) {
        String str = vVar.f7791v;
        String str2 = vVar.f7793x;
        return new w0(vVar.f7794y, vVar.f7795z, vVar.f7792w.d(), str, str2);
    }

    public final v b() {
        u uVar = new u(new Bundle(this.f7814e));
        return new v(this.f7810a, uVar, this.f7811b, this.f7812c, this.f7813d);
    }

    public final String toString() {
        String string = this.f7814e.toString();
        String str = this.f7811b;
        int length = String.valueOf(str).length();
        String str2 = this.f7810a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        j4.a.s(sb2, "origin=", str, ",name=", str2);
        return j4.a.n(sb2, ",params=", string);
    }
}
