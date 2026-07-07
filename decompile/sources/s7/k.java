package s7;

import java.util.Arrays;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7.d f11531b;

    public /* synthetic */ k(a aVar, q7.d dVar) {
        this.f11530a = aVar;
        this.f11531b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (y.j(this.f11530a, kVar.f11530a) && y.j(this.f11531b, kVar.f11531b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11530a, this.f11531b});
    }

    public final String toString() {
        ob.d dVar = new ob.d(this);
        dVar.a(this.f11530a, "key");
        dVar.a(this.f11531b, "feature");
        return dVar.toString();
    }
}
