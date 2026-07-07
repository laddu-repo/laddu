package f4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final y2.f0 f4909a;

    /* renamed from: b, reason: collision with root package name */
    public long f4910b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4911c;

    /* renamed from: d, reason: collision with root package name */
    public int f4912d;

    /* renamed from: e, reason: collision with root package name */
    public long f4913e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4914f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4915g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4916h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4917i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f4918k;

    /* renamed from: l, reason: collision with root package name */
    public long f4919l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4920m;

    public r(y2.f0 f0Var) {
        this.f4909a = f0Var;
    }

    public final void a(int i6) {
        long j = this.f4919l;
        if (j != -9223372036854775807L) {
            long j10 = this.f4910b;
            long j11 = this.f4918k;
            if (j10 != j11) {
                int i10 = (int) (j10 - j11);
                this.f4909a.c(j, this.f4920m ? 1 : 0, i10, i6, null);
            }
        }
    }
}
