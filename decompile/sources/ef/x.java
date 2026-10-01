package ef;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public enum x {
    f5093x("http/1.0"),
    f5094y("http/1.1"),
    f5095z("spdy/3.1"),
    A("h2"),
    B("h2_prior_knowledge"),
    C("quic"),
    D("h3");


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f5092w = new b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f5096v;

    x(String str) {
        this.f5096v = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5096v;
    }
}
