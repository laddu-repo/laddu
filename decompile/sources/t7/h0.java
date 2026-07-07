package t7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12356c;

    public h0(String str, boolean z2) {
        y.d(str);
        this.f12354a = str;
        y.d("com.google.android.gms");
        this.f12355b = "com.google.android.gms";
        this.f12356c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return y.j(this.f12354a, h0Var.f12354a) && y.j(this.f12355b, h0Var.f12355b) && y.j(null, null) && this.f12356c == h0Var.f12356c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12354a, this.f12355b, null, 4225, Boolean.valueOf(this.f12356c)});
    }

    public final String toString() {
        String str = this.f12354a;
        if (str != null) {
            return str;
        }
        y.g(null);
        throw null;
    }
}
