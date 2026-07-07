package h4;

import java.util.List;
import pd.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6125b;

    public c(int i, List list) {
        this.f6124a = list;
        this.f6125b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder sbO = d0.d.o(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        sbO.append(new he.c(0, list.size() - 1, 1));
        sbO.append("'.");
        throw new IllegalArgumentException(sbO.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6125b == cVar.f6125b && de.i.a(this.f6124a, cVar.f6124a);
    }

    public final int hashCode() {
        return this.f6124a.hashCode() + (this.f6125b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f6125b + ", mergedHistory=" + this.f6124a + ')';
    }

    public c() {
        this(-1, p.f10551v);
    }
}
