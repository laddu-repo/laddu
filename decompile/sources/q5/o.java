package q5;

import j5.w;
import java.util.ArrayList;
import l5.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5.b f10869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p5.a f10871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p5.a f10872e;
    public final p5.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10874h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f10875j;

    public o(String str, p5.b bVar, ArrayList arrayList, p5.a aVar, p5.a aVar2, p5.b bVar2, int i, int i10, float f, boolean z2) {
        this.f10868a = str;
        this.f10869b = bVar;
        this.f10870c = arrayList;
        this.f10871d = aVar;
        this.f10872e = aVar2;
        this.f = bVar2;
        this.f10873g = i;
        this.f10874h = i10;
        this.i = f;
        this.f10875j = z2;
    }

    @Override // q5.b
    public final l5.d a(w wVar, j5.j jVar, r5.a aVar) {
        return new t(wVar, aVar, this);
    }
}
