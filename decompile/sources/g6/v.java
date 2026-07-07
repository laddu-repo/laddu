package g6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f5698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5.c f5699b;

    public v(hd.a aVar) {
        y yVar = new y(aVar);
        this.f5699b = new s5.c(16);
        this.f5698a = yVar;
    }

    public final synchronized ArrayList a(Class cls) {
        return this.f5698a.d(cls);
    }
}
