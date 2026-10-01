package s7;

import java.util.Arrays;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2.c f11504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.b f11505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11506d;

    public a(p2.c cVar, r7.b bVar, String str) {
        this.f11504b = cVar;
        this.f11505c = bVar;
        this.f11506d = str;
        this.f11503a = Arrays.hashCode(new Object[]{cVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y.j(this.f11504b, aVar.f11504b) && y.j(this.f11505c, aVar.f11505c) && y.j(this.f11506d, aVar.f11506d);
    }

    public final int hashCode() {
        return this.f11503a;
    }
}
