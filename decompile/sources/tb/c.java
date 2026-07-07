package tb;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public enum c implements ib.c {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("UNKNOWN_OS"),
    f12530w("ANDROID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23("IOS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF31("WEB");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12532v;

    c(String str) {
        this.f12532v = i;
    }

    @Override // ib.c
    public final int a() {
        return this.f12532v;
    }
}
