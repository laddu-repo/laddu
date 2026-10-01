package ac;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f322b;

    public b(String str, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        de.i.e(str, "appId");
        de.i.e(str2, "deviceModel");
        de.i.e(str3, "osVersion");
        this.f321a = str;
        this.f322b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!de.i.a(this.f321a, bVar.f321a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!de.i.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return de.i.a(str2, str2) && this.f322b.equals(bVar.f322b);
    }

    public final int hashCode() {
        return this.f322b.hashCode() + ((b0.f323w.hashCode() + d0.d.e((((Build.MODEL.hashCode() + (this.f321a.hashCode() * 31)) * 31) + 48517565) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f321a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.6, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + b0.f323w + ", androidAppInfo=" + this.f322b + ')';
    }
}
