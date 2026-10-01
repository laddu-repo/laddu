package ef;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5100a = 0;

    static {
        de.i.e(vf.f.f13604y, "<this>");
    }

    public static final y c(byte[] bArr) {
        de.i.e(bArr, "<this>");
        int length = bArr.length;
        ff.d.a(bArr.length, 0, length);
        return new y(null, length, bArr);
    }

    public abstract long a();

    public abstract u b();

    public abstract void d(vf.m mVar);
}
