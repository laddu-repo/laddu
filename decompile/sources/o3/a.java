package o3;

import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9863a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9864b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9865c;

    public a(int i6, long j, long j10) {
        this.f9863a = i6;
        switch (i6) {
            case 1:
                this.f9864b = j;
                this.f9865c = j10;
                return;
            default:
                this.f9864b = j10;
                this.f9865c = j;
                return;
        }
    }

    public static long d(long j, t tVar) {
        long y9 = tVar.y();
        if ((128 & y9) != 0) {
            return 8589934591L & ((((y9 & 1) << 32) | tVar.A()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // o3.b
    public final String toString() {
        switch (this.f9863a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f9864b);
                sb2.append(", identifier= ");
                return r4.a.m(sb2, this.f9865c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f9864b);
                sb3.append(", playbackPositionUs= ");
                return r4.a.m(sb3, this.f9865c, " }");
        }
    }
}
