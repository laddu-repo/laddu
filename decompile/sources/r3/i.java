package r3;

import w1.t;
import w2.g0;
import w2.q;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f11159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f11160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f11161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11162e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11164h;
    public int i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f11166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11168m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f11158a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ob.d f11165j = new ob.d(7, false);

    public void a(long j8) {
        this.f11163g = j8;
    }

    public abstract long b(t tVar);

    public abstract boolean c(t tVar, long j8, ob.d dVar);

    public void d(boolean z2) {
        if (z2) {
            this.f11165j = new ob.d(7, false);
            this.f = 0L;
            this.f11164h = 0;
        } else {
            this.f11164h = 1;
        }
        this.f11162e = -1L;
        this.f11163g = 0L;
    }
}
