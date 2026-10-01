package ib;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements fb.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6598a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6599b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fb.c f6600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f6601d;

    public h(f fVar) {
        this.f6601d = fVar;
    }

    @Override // fb.g
    public final fb.g c(String str) {
        if (this.f6598a) {
            throw new fb.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6598a = true;
        this.f6601d.h(this.f6600c, str, this.f6599b);
        return this;
    }

    @Override // fb.g
    public final fb.g e(boolean z2) {
        if (this.f6598a) {
            throw new fb.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6598a = true;
        this.f6601d.e(this.f6600c, z2 ? 1 : 0, this.f6599b);
        return this;
    }
}
