package h2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j implements Comparable {
    public final int A;
    public final long B;
    public final r1.m C;
    public final String D;
    public final String E;
    public final long F;
    public final long G;
    public final boolean H;

    /* renamed from: x, reason: collision with root package name */
    public final String f5902x;

    /* renamed from: y, reason: collision with root package name */
    public final i f5903y;

    /* renamed from: z, reason: collision with root package name */
    public final long f5904z;

    public j(String str, i iVar, long j, int i6, long j10, r1.m mVar, String str2, String str3, long j11, long j12, boolean z10) {
        this.f5902x = str;
        this.f5903y = iVar;
        this.f5904z = j;
        this.A = i6;
        this.B = j10;
        this.C = mVar;
        this.D = str2;
        this.E = str3;
        this.F = j11;
        this.G = j12;
        this.H = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j = this.B;
        if (j > longValue) {
            return 1;
        }
        if (j < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
