package y9;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14559c;

    public g0(Object obj, Object obj2, Object obj3) {
        this.f14557a = obj;
        this.f14558b = obj2;
        this.f14559c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f14557a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14558b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f14559c);
        return new IllegalArgumentException(sb2.toString());
    }
}
