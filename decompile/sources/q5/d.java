package q5;

import android.graphics.Path;
import j5.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f10815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5.a f10816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p5.a f10817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p5.a f10818e;
    public final p5.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10820h;

    public d(String str, int i, Path.FillType fillType, p5.a aVar, p5.a aVar2, p5.a aVar3, p5.a aVar4, boolean z2) {
        this.f10814a = i;
        this.f10815b = fillType;
        this.f10816c = aVar;
        this.f10817d = aVar2;
        this.f10818e = aVar3;
        this.f = aVar4;
        this.f10819g = str;
        this.f10820h = z2;
    }

    @Override // q5.b
    public final l5.d a(w wVar, j5.j jVar, r5.a aVar) {
        return new l5.i(wVar, jVar, aVar, this);
    }
}
