package r1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;

    /* renamed from: q, reason: collision with root package name */
    public static final Object f11318q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final e0 f11319r;
    public static final String s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f11320t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f11321u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f11322v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f11323w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f11324x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f11325y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f11326z;

    /* renamed from: b, reason: collision with root package name */
    public Object f11328b;

    /* renamed from: d, reason: collision with root package name */
    public Object f11330d;

    /* renamed from: e, reason: collision with root package name */
    public long f11331e;

    /* renamed from: f, reason: collision with root package name */
    public long f11332f;

    /* renamed from: g, reason: collision with root package name */
    public long f11333g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11334h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11335i;
    public z j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11336k;

    /* renamed from: l, reason: collision with root package name */
    public long f11337l;

    /* renamed from: m, reason: collision with root package name */
    public long f11338m;

    /* renamed from: n, reason: collision with root package name */
    public int f11339n;

    /* renamed from: o, reason: collision with root package name */
    public int f11340o;

    /* renamed from: p, reason: collision with root package name */
    public long f11341p;

    /* renamed from: a, reason: collision with root package name */
    public Object f11327a = f11318q;

    /* renamed from: c, reason: collision with root package name */
    public e0 f11329c = f11319r;

    /* JADX WARN: Type inference failed for: r15v0, types: [r1.w, r1.x] */
    static {
        boolean z10;
        a0 a0Var;
        v vVar = new v();
        f5.b bVar = new f5.b();
        List list = Collections.EMPTY_LIST;
        db.c1 c1Var = db.c1.B;
        e2.t tVar = new e2.t();
        b0 b0Var = b0.f11307d;
        Uri uri = Uri.EMPTY;
        if (((Uri) bVar.f5022e) != null && ((UUID) bVar.f5021d) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        y yVar = null;
        if (uri != null) {
            if (((UUID) bVar.f5021d) != null) {
                yVar = new y(bVar);
            }
            a0Var = new a0(uri, null, yVar, null, list, null, c1Var, -9223372036854775807L);
        } else {
            a0Var = null;
        }
        f11319r = new e0("androidx.media3.common.Timeline", new w(vVar), a0Var, new z(tVar), h0.K, b0Var);
        s = Integer.toString(1, 36);
        f11320t = Integer.toString(2, 36);
        f11321u = Integer.toString(3, 36);
        f11322v = Integer.toString(4, 36);
        f11323w = Integer.toString(5, 36);
        f11324x = Integer.toString(6, 36);
        f11325y = Integer.toString(7, 36);
        f11326z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, e0 e0Var, Object obj2, long j, long j10, long j11, boolean z10, boolean z11, z zVar, long j12, long j13, int i6, int i10, long j14) {
        e0 e0Var2;
        this.f11327a = obj;
        if (e0Var != null) {
            e0Var2 = e0Var;
        } else {
            e0Var2 = f11319r;
        }
        this.f11329c = e0Var2;
        if (e0Var != null) {
            a0 a0Var = e0Var.f11379b;
        }
        this.f11328b = null;
        this.f11330d = obj2;
        this.f11331e = j;
        this.f11332f = j10;
        this.f11333g = j11;
        this.f11334h = z10;
        this.f11335i = z11;
        this.j = zVar;
        this.f11337l = j12;
        this.f11338m = j13;
        this.f11339n = i6;
        this.f11340o = i10;
        this.f11341p = j14;
        this.f11336k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class.equals(obj.getClass())) {
            c1 c1Var = (c1) obj;
            if (Objects.equals(this.f11327a, c1Var.f11327a) && Objects.equals(this.f11329c, c1Var.f11329c) && Objects.equals(this.f11330d, c1Var.f11330d) && Objects.equals(this.j, c1Var.j) && this.f11331e == c1Var.f11331e && this.f11332f == c1Var.f11332f && this.f11333g == c1Var.f11333g && this.f11334h == c1Var.f11334h && this.f11335i == c1Var.f11335i && this.f11336k == c1Var.f11336k && this.f11337l == c1Var.f11337l && this.f11338m == c1Var.f11338m && this.f11339n == c1Var.f11339n && this.f11340o == c1Var.f11340o && this.f11341p == c1Var.f11341p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f11329c.hashCode() + ((this.f11327a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f11330d;
        int i6 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        z zVar = this.j;
        if (zVar != null) {
            i6 = zVar.hashCode();
        }
        int i11 = (i10 + i6) * 31;
        long j = this.f11331e;
        int i12 = (i11 + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f11332f;
        int i13 = (i12 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f11333g;
        int i14 = (((((((i13 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f11334h ? 1 : 0)) * 31) + (this.f11335i ? 1 : 0)) * 31) + (this.f11336k ? 1 : 0)) * 31;
        long j12 = this.f11337l;
        int i15 = (i14 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f11338m;
        int i16 = (((((i15 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f11339n) * 31) + this.f11340o) * 31;
        long j14 = this.f11341p;
        return i16 + ((int) (j14 ^ (j14 >>> 32)));
    }
}
