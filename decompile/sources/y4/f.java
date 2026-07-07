package y4;

import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements v4.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w4.a f14456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f14457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14458x;

    public f(w4.a aVar, String str) {
        this.f14456v = aVar;
        this.f14457w = str;
    }

    @Override // v4.c
    public boolean P() {
        return getLong(0) != 0;
    }

    public final void a() {
        if (this.f14458x) {
            v.P(21, "statement is closed");
            throw null;
        }
    }

    @Override // v4.c
    public void h() {
        a();
    }

    @Override // v4.c
    public void reset() {
        a();
    }
}
