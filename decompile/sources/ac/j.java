package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public enum j implements hb.f {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("COLLECTION_UNKNOWN"),
    f407w("COLLECTION_SDK_NOT_INSTALLED"),
    f408x("COLLECTION_ENABLED"),
    f409y("COLLECTION_DISABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF43("COLLECTION_DISABLED_REMOTE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF51("COLLECTION_SAMPLED");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f411v;

    j(String str) {
        this.f411v = i;
    }

    @Override // hb.f
    public final int a() {
        return this.f411v;
    }
}
