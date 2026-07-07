package ef;

import com.google.android.gms.internal.measurement.mb;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mb f4928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f4929b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f4932e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vf.s f4934h;
    public b0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b0 f4935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b0 f4936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c2.b f4939n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4930c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f4933g = d0.f4963v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g0 f4940o = g0.f4975a;
    public p f = new p(0);

    public static void b(String str, b0 b0Var) {
        if (b0Var != null) {
            if (b0Var.D != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (b0Var.E != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (b0Var.F != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final b0 a() {
        int i = this.f4930c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f4930c).toString());
        }
        mb mbVar = this.f4928a;
        if (mbVar == null) {
            throw new IllegalStateException("request == null");
        }
        x xVar = this.f4929b;
        if (xVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f4931d;
        if (str != null) {
            return new b0(mbVar, xVar, str, i, this.f4932e, this.f.b(), this.f4933g, this.f4934h, this.i, this.f4935j, this.f4936k, this.f4937l, this.f4938m, this.f4939n, this.f4940o);
        }
        throw new IllegalStateException("message == null");
    }
}
