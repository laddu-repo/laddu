package q5;

import android.graphics.Path;
import j5.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f10857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p5.a f10859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p5.a f10860e;
    public final boolean f;

    public l(String str, boolean z2, Path.FillType fillType, p5.a aVar, p5.a aVar2, boolean z10) {
        this.f10858c = str;
        this.f10856a = z2;
        this.f10857b = fillType;
        this.f10859d = aVar;
        this.f10860e = aVar2;
        this.f = z10;
    }

    @Override // q5.b
    public final l5.d a(w wVar, j5.j jVar, r5.a aVar) {
        return new l5.h(wVar, aVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f10856a + '}';
    }
}
