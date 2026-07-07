package y9;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends y0 implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x9.f f14593v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0 f14594w;

    public o(x9.f fVar, y0 y0Var) {
        this.f14593v = fVar;
        this.f14594w = y0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        x9.f fVar = this.f14593v;
        return this.f14594w.compare(fVar.apply(obj), fVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f14593v.equals(oVar.f14593v) && this.f14594w.equals(oVar.f14594w);
    }

    public final int hashCode() {
        return Objects.hash(this.f14593v, this.f14594w);
    }

    public final String toString() {
        return this.f14594w + ".onResultOf(" + this.f14593v + ")";
    }
}
