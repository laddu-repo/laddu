package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public enum b0 implements hb.f {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("LOG_ENVIRONMENT_UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("LOG_ENVIRONMENT_AUTOPUSH"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("LOG_ENVIRONMENT_STAGING"),
    f323w("LOG_ENVIRONMENT_PROD");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f325v;

    b0(String str) {
        this.f325v = i;
    }

    @Override // hb.f
    public final int a() {
        return this.f325v;
    }
}
