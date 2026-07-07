package q5;

import j5.w;
import j5.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10837b;

    public g(String str, boolean z2, int i) {
        this.f10836a = i;
        this.f10837b = z2;
    }

    @Override // q5.b
    public final l5.d a(w wVar, j5.j jVar, r5.a aVar) {
        if (wVar.G.f12933a.contains(x.f6913v)) {
            return new l5.m(this);
        }
        v5.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MergePaths{mode=");
        int i = this.f10836a;
        sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb2.append('}');
        return sb2.toString();
    }
}
