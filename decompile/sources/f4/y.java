package f4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5000a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.y f5001b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f5002c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5003d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5004e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5005f;

    /* renamed from: g, reason: collision with root package name */
    public long f5006g;

    /* renamed from: h, reason: collision with root package name */
    public long f5007h;

    /* renamed from: i, reason: collision with root package name */
    public long f5008i;

    public y(int i6) {
        this.f5000a = i6;
        switch (i6) {
            case 1:
                this.f5001b = new u1.y(0L);
                this.f5006g = -9223372036854775807L;
                this.f5007h = -9223372036854775807L;
                this.f5008i = -9223372036854775807L;
                this.f5002c = new u1.t();
                return;
            default:
                this.f5001b = new u1.y(0L);
                this.f5006g = -9223372036854775807L;
                this.f5007h = -9223372036854775807L;
                this.f5008i = -9223372036854775807L;
                this.f5002c = new u1.t();
                return;
        }
    }

    public static int b(int i6, byte[] bArr) {
        return (bArr[i6 + 3] & 255) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6 + 2] & 255) << 8);
    }

    public static long c(u1.t tVar) {
        int i6 = tVar.f12812b;
        if (tVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        tVar.i(bArr, 0, 9);
        tVar.K(i6);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b10;
                    long j10 = b11;
                    return ((j10 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j10 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(y2.p pVar) {
        switch (this.f5000a) {
            case 0:
                byte[] bArr = u1.a0.f12751b;
                u1.t tVar = this.f5002c;
                tVar.getClass();
                tVar.I(bArr.length, bArr);
                this.f5003d = true;
                pVar.v();
                return;
            default:
                byte[] bArr2 = u1.a0.f12751b;
                u1.t tVar2 = this.f5002c;
                tVar2.getClass();
                tVar2.I(bArr2.length, bArr2);
                this.f5003d = true;
                pVar.v();
                return;
        }
    }
}
