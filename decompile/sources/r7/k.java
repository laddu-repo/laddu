package r7;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends UnsupportedOperationException {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q7.d f11354v;

    public k(q7.d dVar) {
        this.f11354v = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f11354v));
    }
}
