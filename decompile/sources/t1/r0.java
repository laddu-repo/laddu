package t1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f12093q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z f12094r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12096b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12099e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12101h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v f12102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f12104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f12105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f12108p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12095a = f12093q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f12097c = f12094r;

    static {
        w wVar;
        r rVar = new r();
        o2.p pVar = new o2.p();
        List list = Collections.EMPTY_LIST;
        y9.z0 z0Var = y9.z0.f14637z;
        g2.t tVar = new g2.t();
        x xVar = x.f12153a;
        Uri uri = Uri.EMPTY;
        w1.a.j(((Uri) pVar.f9504x) == null || ((UUID) pVar.f9503w) != null);
        u uVar = null;
        if (uri != null) {
            if (((UUID) pVar.f9503w) != null) {
                uVar = new u(pVar);
            }
            wVar = new w(uri, null, uVar, list, z0Var, -9223372036854775807L);
        } else {
            wVar = null;
        }
        f12094r = new z("androidx.media3.common.Timeline", new t(rVar), wVar, new v(tVar), c0.B, xVar);
        d0.d.p(1, 2, 3, 4, 5);
        d0.d.p(6, 7, 8, 9, 10);
        w1.b0.H(11);
        w1.b0.H(12);
        w1.b0.H(13);
    }

    public final boolean a() {
        return this.f12102j != null;
    }

    public final void b(z zVar, Object obj, long j8, long j9, long j10, boolean z2, boolean z10, v vVar, long j11, long j12, int i, long j13) {
        this.f12095a = f12093q;
        this.f12097c = zVar != null ? zVar : f12094r;
        if (zVar != null) {
            w wVar = zVar.f12179b;
        }
        this.f12096b = null;
        this.f12098d = obj;
        this.f12099e = j8;
        this.f = j9;
        this.f12100g = j10;
        this.f12101h = z2;
        this.i = z10;
        this.f12102j = vVar;
        this.f12104l = j11;
        this.f12105m = j12;
        this.f12106n = 0;
        this.f12107o = i;
        this.f12108p = j13;
        this.f12103k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r0.class.equals(obj.getClass())) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Objects.equals(this.f12095a, r0Var.f12095a) && Objects.equals(this.f12097c, r0Var.f12097c) && Objects.equals(this.f12098d, r0Var.f12098d) && Objects.equals(this.f12102j, r0Var.f12102j) && this.f12099e == r0Var.f12099e && this.f == r0Var.f && this.f12100g == r0Var.f12100g && this.f12101h == r0Var.f12101h && this.i == r0Var.i && this.f12103k == r0Var.f12103k && this.f12104l == r0Var.f12104l && this.f12105m == r0Var.f12105m && this.f12106n == r0Var.f12106n && this.f12107o == r0Var.f12107o && this.f12108p == r0Var.f12108p;
    }

    public final int hashCode() {
        int iHashCode = (this.f12097c.hashCode() + ((this.f12095a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f12098d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        v vVar = this.f12102j;
        int iHashCode3 = (iHashCode2 + (vVar != null ? vVar.hashCode() : 0)) * 31;
        long j8 = this.f12099e;
        int i = (iHashCode3 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f;
        int i10 = (i + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f12100g;
        int i11 = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f12101h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.f12103k ? 1 : 0)) * 31;
        long j11 = this.f12104l;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f12105m;
        int i13 = (((((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f12106n) * 31) + this.f12107o) * 31;
        long j13 = this.f12108p;
        return i13 + ((int) (j13 ^ (j13 >>> 32)));
    }
}
