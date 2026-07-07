package t3;

import s8.l;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public f0 f12592b;

    /* renamed from: c, reason: collision with root package name */
    public q f12593c;

    /* renamed from: d, reason: collision with root package name */
    public g f12594d;

    /* renamed from: e, reason: collision with root package name */
    public long f12595e;

    /* renamed from: f, reason: collision with root package name */
    public long f12596f;

    /* renamed from: g, reason: collision with root package name */
    public long f12597g;

    /* renamed from: h, reason: collision with root package name */
    public int f12598h;

    /* renamed from: i, reason: collision with root package name */
    public int f12599i;

    /* renamed from: k, reason: collision with root package name */
    public long f12600k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12601l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12602m;

    /* renamed from: a, reason: collision with root package name */
    public final e f12591a = new e();
    public l j = new l(4, false);

    public void a(long j) {
        this.f12597g = j;
    }

    public abstract long b(t tVar);

    public abstract boolean c(t tVar, long j, l lVar);

    public void d(boolean z10) {
        if (z10) {
            this.j = new l(4, false);
            this.f12596f = 0L;
            this.f12598h = 0;
        } else {
            this.f12598h = 1;
        }
        this.f12595e = -1L;
        this.f12597g = 0L;
    }
}
