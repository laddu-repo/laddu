package af;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f499e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye.d f500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cf.e f501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f503d;

    public d(ye.d dVar, cf.e eVar) {
        de.i.e(dVar, "descriptor");
        this.f500a = dVar;
        this.f501b = eVar;
        int iD = dVar.d();
        if (iD <= 64) {
            this.f502c = iD != 64 ? (-1) << iD : 0L;
            this.f503d = f499e;
            return;
        }
        this.f502c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.f503d = jArr;
    }
}
