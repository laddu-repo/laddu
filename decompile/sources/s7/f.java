package s7;

import com.google.android.gms.internal.measurement.f6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6 f11517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11518b;

    public f(f6 f6Var, String str) {
        this.f11517a = f6Var;
        this.f11518b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f11517a == fVar.f11517a && this.f11518b.equals(fVar.f11518b);
    }

    public final int hashCode() {
        return this.f11518b.hashCode() + (System.identityHashCode(this.f11517a) * 31);
    }
}
