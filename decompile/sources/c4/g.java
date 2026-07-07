package c4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f2087v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f2088w;

    public g(int i, b bVar) {
        this.f2087v = i;
        this.f2088w = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f2087v, ((g) obj).f2087v);
    }
}
