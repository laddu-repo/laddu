package q5;

import j5.w;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5.a f10823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p5.a f10824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p5.a f10825e;
    public final p5.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p5.b f10826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10827h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f10828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f10829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p5.b f10830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f10831m;

    public e(String str, int i, p5.a aVar, p5.a aVar2, p5.a aVar3, p5.a aVar4, p5.b bVar, int i10, int i11, float f, ArrayList arrayList, p5.b bVar2, boolean z2) {
        this.f10821a = str;
        this.f10822b = i;
        this.f10823c = aVar;
        this.f10824d = aVar2;
        this.f10825e = aVar3;
        this.f = aVar4;
        this.f10826g = bVar;
        this.f10827h = i10;
        this.i = i11;
        this.f10828j = f;
        this.f10829k = arrayList;
        this.f10830l = bVar2;
        this.f10831m = z2;
    }

    @Override // q5.b
    public final l5.d a(w wVar, j5.j jVar, r5.a aVar) {
        return new l5.j(wVar, aVar, this);
    }
}
