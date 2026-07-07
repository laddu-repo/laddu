package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements s0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f8699v;

    public i0(boolean z2) {
        this.f8699v = z2;
    }

    @Override // me.s0
    public final boolean a() {
        return this.f8699v;
    }

    @Override // me.s0
    public final e1 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Empty{");
        sb2.append(this.f8699v ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
