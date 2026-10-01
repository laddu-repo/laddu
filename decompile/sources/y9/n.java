package y9;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient Set f14588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient m f14589w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient Map f14590x;

    public abstract Map a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return ((w0) this).a().equals(((w0) ((n) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
