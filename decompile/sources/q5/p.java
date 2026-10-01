package q5;

import j5.w;
import l5.u;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5.b f10877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5.b f10878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p5.b f10879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10880e;

    public p(String str, int i, p5.b bVar, p5.b bVar2, p5.b bVar3, boolean z2) {
        this.f10876a = i;
        this.f10877b = bVar;
        this.f10878c = bVar2;
        this.f10879d = bVar3;
        this.f10880e = z2;
    }

    @Override // q5.b
    public final l5.d a(w wVar, j5.j jVar, r5.a aVar) {
        return new u(aVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f10877b + ", end: " + this.f10878c + ", offset: " + this.f10879d + "}";
    }
}
