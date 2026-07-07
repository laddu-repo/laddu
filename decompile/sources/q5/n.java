package q5;

import j5.w;
import l5.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5.a f10866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10867d;

    public n(String str, int i, p5.a aVar, boolean z2) {
        this.f10864a = str;
        this.f10865b = i;
        this.f10866c = aVar;
        this.f10867d = z2;
    }

    @Override // q5.b
    public final l5.d a(w wVar, j5.j jVar, r5.a aVar) {
        return new s(wVar, aVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f10864a + ", index=" + this.f10865b + '}';
    }
}
