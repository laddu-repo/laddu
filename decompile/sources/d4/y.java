package d4;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1.y f4323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f4324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4326e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4328h;
    public long i;

    public y(int i) {
        this.f4322a = i;
        switch (i) {
            case 1:
                this.f4323b = new w1.y(0L);
                this.f4327g = -9223372036854775807L;
                this.f4328h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.f4324c = new w1.t();
                break;
            default:
                this.f4323b = new w1.y(0L);
                this.f4327g = -9223372036854775807L;
                this.f4328h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.f4324c = new w1.t();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(w1.t tVar) {
        int i = tVar.f13739b;
        if (tVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        tVar.h(bArr, 0, 9);
        tVar.J(i);
        byte b9 = bArr[0];
        if ((b9 & 196) == 68) {
            byte b10 = bArr[2];
            if ((b10 & 4) == 4) {
                byte b11 = bArr[4];
                if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j8 = b9;
                    long j9 = b10;
                    return ((j9 & 3) << 13) | ((j8 & 3) << 28) | (((56 & j8) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j9 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b11) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(w2.p pVar) {
        switch (this.f4322a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                byte[] bArr = w1.b0.f13688c;
                w1.t tVar = this.f4324c;
                tVar.getClass();
                tVar.H(bArr.length, bArr);
                this.f4325d = true;
                pVar.l();
                break;
            default:
                byte[] bArr2 = w1.b0.f13688c;
                w1.t tVar2 = this.f4324c;
                tVar2.getClass();
                tVar2.H(bArr2.length, bArr2);
                this.f4325d = true;
                pVar.l();
                break;
        }
    }
}
