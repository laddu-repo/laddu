package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public enum n implements hb.f {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("EVENT_TYPE_UNKNOWN"),
    f429w("SESSION_START");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f431v;

    n(String str) {
        this.f431v = i;
    }

    @Override // hb.f
    public final int a() {
        return this.f431v;
    }
}
