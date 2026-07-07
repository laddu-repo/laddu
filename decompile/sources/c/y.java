package c;

import androidx.fragment.app.i0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f1677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1678b;

    public y(i0 i0Var, androidx.lifecycle.s sVar) {
        de.i.e(i0Var, "callback");
        this.f1677a = i0Var;
        this.f1678b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return de.i.a(this.f1677a, yVar.f1677a) && this.f1678b.equals(yVar.f1678b);
    }

    public final int hashCode() {
        return this.f1678b.hashCode() + (this.f1677a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f1677a + ", owner=" + this.f1678b + ')';
    }
}
