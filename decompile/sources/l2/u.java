package l2;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8149c;

    public u(String str, boolean z2, boolean z10) {
        this.f8147a = str;
        this.f8148b = z2;
        this.f8149c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == u.class) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f8147a, uVar.f8147a) && this.f8148b == uVar.f8148b && this.f8149c == uVar.f8149c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((d0.d.e(31, 31, this.f8147a) + (this.f8148b ? 1231 : 1237)) * 31) + (this.f8149c ? 1231 : 1237);
    }
}
