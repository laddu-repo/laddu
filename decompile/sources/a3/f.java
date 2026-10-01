package a3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f543b;

    /* renamed from: c, reason: collision with root package name */
    public final int f544c;

    /* renamed from: d, reason: collision with root package name */
    public final int f545d;

    /* renamed from: e, reason: collision with root package name */
    public final int f546e;

    /* renamed from: f, reason: collision with root package name */
    public final int f547f;

    public f(int i6, int i10, int i11, int i12, int i13, int i14) {
        this.f542a = i6;
        this.f543b = i10;
        this.f544c = i11;
        this.f545d = i12;
        this.f546e = i13;
        this.f547f = i14;
    }

    public final int a() {
        int i6 = this.f542a;
        if (i6 != 1935960438) {
            if (i6 != 1935963489) {
                if (i6 != 1937012852) {
                    u1.a.p("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i6));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    @Override // a3.a
    public final int getType() {
        return 1752331379;
    }
}
