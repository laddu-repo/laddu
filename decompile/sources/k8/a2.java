package k8;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public enum a2 {
    f7373w("uninitialized"),
    f7374x("eu_consent_policy"),
    f7375y("denied"),
    f7376z("granted");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7377v;

    a2(String str) {
        this.f7377v = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7377v;
    }
}
