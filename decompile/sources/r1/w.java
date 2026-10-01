package r1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class w {

    /* renamed from: i, reason: collision with root package name */
    public static final w f11720i = new w(new v());
    public static final String j = Integer.toString(0, 36);

    /* renamed from: k, reason: collision with root package name */
    public static final String f11721k = Integer.toString(1, 36);

    /* renamed from: l, reason: collision with root package name */
    public static final String f11722l = Integer.toString(2, 36);

    /* renamed from: m, reason: collision with root package name */
    public static final String f11723m = Integer.toString(3, 36);

    /* renamed from: n, reason: collision with root package name */
    public static final String f11724n = Integer.toString(4, 36);

    /* renamed from: o, reason: collision with root package name */
    public static final String f11725o = Integer.toString(5, 36);

    /* renamed from: p, reason: collision with root package name */
    public static final String f11726p = Integer.toString(6, 36);

    /* renamed from: q, reason: collision with root package name */
    public static final String f11727q = Integer.toString(7, 36);

    /* renamed from: a, reason: collision with root package name */
    public final long f11728a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11729b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11730c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11731d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11732e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11733f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11734g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11735h;

    public w(v vVar) {
        this.f11728a = u1.a0.e0(vVar.f11713a);
        this.f11730c = u1.a0.e0(vVar.f11714b);
        this.f11729b = vVar.f11713a;
        this.f11731d = vVar.f11714b;
        this.f11732e = vVar.f11715c;
        this.f11733f = vVar.f11716d;
        this.f11734g = vVar.f11717e;
        this.f11735h = vVar.f11718f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f11729b == wVar.f11729b && this.f11731d == wVar.f11731d && this.f11732e == wVar.f11732e && this.f11733f == wVar.f11733f && this.f11734g == wVar.f11734g && this.f11735h == wVar.f11735h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f11729b;
        int i6 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f11731d;
        return ((((((((i6 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f11732e ? 1 : 0)) * 31) + (this.f11733f ? 1 : 0)) * 31) + (this.f11734g ? 1 : 0)) * 31) + (this.f11735h ? 1 : 0);
    }
}
