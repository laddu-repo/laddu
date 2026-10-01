package q5;

import j5.w;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10863c;

    public m(String str, List list, boolean z2) {
        this.f10861a = str;
        this.f10862b = list;
        this.f10863c = z2;
    }

    @Override // q5.b
    public final l5.d a(w wVar, j5.j jVar, r5.a aVar) {
        return new l5.e(wVar, aVar, this, jVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f10861a + "' Shapes: " + Arrays.toString(this.f10862b.toArray()) + '}';
    }
}
