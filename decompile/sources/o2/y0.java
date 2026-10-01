package o2;

import android.media.MediaCodec;
import android.os.Build;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k8.k2;
import k8.w3;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s2.e f9584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f9586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w3 f9587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w3 f9588e;
    public w3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9589g;

    public y0(s2.e eVar) {
        this.f9584a = eVar;
        int i = eVar.f11431b;
        this.f9585b = i;
        this.f9586c = new w1.t(32);
        w3 w3Var = new w3(i, 0L);
        this.f9587d = w3Var;
        this.f9588e = w3Var;
        this.f = w3Var;
    }

    public static w3 d(w3 w3Var, long j8, ByteBuffer byteBuffer, int i) {
        while (j8 >= w3Var.f7821w) {
            w3Var = (w3) w3Var.f7823y;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (w3Var.f7821w - j8));
            s2.a aVar = (s2.a) w3Var.f7822x;
            byteBuffer.put(aVar.f11421a, ((int) (j8 - w3Var.f7820v)) + aVar.f11422b, iMin);
            i -= iMin;
            j8 += (long) iMin;
            if (j8 == w3Var.f7821w) {
                w3Var = (w3) w3Var.f7823y;
            }
        }
        return w3Var;
    }

    public static w3 e(w3 w3Var, long j8, byte[] bArr, int i) {
        while (j8 >= w3Var.f7821w) {
            w3Var = (w3) w3Var.f7823y;
        }
        int i10 = i;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (w3Var.f7821w - j8));
            s2.a aVar = (s2.a) w3Var.f7822x;
            System.arraycopy(aVar.f11421a, ((int) (j8 - w3Var.f7820v)) + aVar.f11422b, bArr, i - i10, iMin);
            i10 -= iMin;
            j8 += (long) iMin;
            if (j8 == w3Var.f7821w) {
                w3Var = (w3) w3Var.f7823y;
            }
        }
        return w3Var;
    }

    public static w3 f(w3 w3Var, DecoderInputBuffer decoderInputBuffer, k2.f fVar, w1.t tVar) {
        if (decoderInputBuffer.isEncrypted()) {
            long j8 = fVar.f7286b;
            int iD = 1;
            tVar.G(1);
            w3 w3VarE = e(w3Var, j8, tVar.f13738a, 1);
            long j9 = j8 + 1;
            byte b9 = tVar.f13738a[0];
            boolean z2 = (b9 & 128) != 0;
            int i = b9 & 127;
            a2.d dVar = decoderInputBuffer.cryptoInfo;
            byte[] bArr = dVar.f115a;
            if (bArr == null) {
                dVar.f115a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            w3Var = e(w3VarE, j9, dVar.f115a, i);
            long j10 = j9 + ((long) i);
            if (z2) {
                tVar.G(2);
                w3Var = e(w3Var, j10, tVar.f13738a, 2);
                j10 += 2;
                iD = tVar.D();
            }
            int[] iArr = dVar.f118d;
            if (iArr == null || iArr.length < iD) {
                iArr = new int[iD];
            }
            int[] iArr2 = dVar.f119e;
            if (iArr2 == null || iArr2.length < iD) {
                iArr2 = new int[iD];
            }
            if (z2) {
                int i10 = iD * 6;
                tVar.G(i10);
                w3Var = e(w3Var, j10, tVar.f13738a, i10);
                j10 += (long) i10;
                tVar.J(0);
                for (int i11 = 0; i11 < iD; i11++) {
                    iArr[i11] = tVar.D();
                    iArr2[i11] = tVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = fVar.f7285a - ((int) (j10 - fVar.f7286b));
            }
            w2.f0 f0Var = (w2.f0) fVar.f7287c;
            int i12 = w1.b0.f13686a;
            byte[] bArr2 = f0Var.f13809b;
            byte[] bArr3 = dVar.f115a;
            int i13 = f0Var.f13808a;
            int i14 = f0Var.f13810c;
            int i15 = f0Var.f13811d;
            dVar.f = iD;
            dVar.f118d = iArr;
            dVar.f119e = iArr2;
            dVar.f116b = bArr2;
            dVar.f115a = bArr3;
            dVar.f117c = i13;
            dVar.f120g = i14;
            dVar.f121h = i15;
            MediaCodec.CryptoInfo cryptoInfo = dVar.i;
            cryptoInfo.numSubSamples = iD;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Build.VERSION.SDK_INT >= 24) {
                k2 k2Var = dVar.f122j;
                k2Var.getClass();
                ((MediaCodec.CryptoInfo.Pattern) k2Var.f7603x).set(i14, i15);
                ((MediaCodec.CryptoInfo) k2Var.f7602w).setPattern((MediaCodec.CryptoInfo.Pattern) k2Var.f7603x);
            }
            long j11 = fVar.f7286b;
            int i16 = (int) (j10 - j11);
            fVar.f7286b = j11 + ((long) i16);
            fVar.f7285a -= i16;
        }
        if (!decoderInputBuffer.hasSupplementalData()) {
            decoderInputBuffer.ensureSpaceForWrite(fVar.f7285a);
            return d(w3Var, fVar.f7286b, decoderInputBuffer.data, fVar.f7285a);
        }
        tVar.G(4);
        w3 w3VarE2 = e(w3Var, fVar.f7286b, tVar.f13738a, 4);
        int iB = tVar.B();
        fVar.f7286b += 4;
        fVar.f7285a -= 4;
        decoderInputBuffer.ensureSpaceForWrite(iB);
        w3 w3VarD = d(w3VarE2, fVar.f7286b, decoderInputBuffer.data, iB);
        fVar.f7286b += (long) iB;
        int i17 = fVar.f7285a - iB;
        fVar.f7285a = i17;
        decoderInputBuffer.resetSupplementalData(i17);
        return d(w3VarD, fVar.f7286b, decoderInputBuffer.supplementalData, fVar.f7285a);
    }

    public final void a(w3 w3Var) {
        if (((s2.a) w3Var.f7822x) == null) {
            return;
        }
        s2.e eVar = this.f9584a;
        synchronized (eVar) {
            w3 w3Var2 = w3Var;
            while (w3Var2 != null) {
                try {
                    s2.a[] aVarArr = eVar.f;
                    int i = eVar.f11434e;
                    eVar.f11434e = i + 1;
                    s2.a aVar = (s2.a) w3Var2.f7822x;
                    aVar.getClass();
                    aVarArr[i] = aVar;
                    eVar.f11433d--;
                    w3Var2 = (w3) w3Var2.f7823y;
                    if (w3Var2 == null || ((s2.a) w3Var2.f7822x) == null) {
                        w3Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar.notifyAll();
        }
        w3Var.f7822x = null;
        w3Var.f7823y = null;
    }

    public final void b(long j8) {
        w3 w3Var;
        if (j8 == -1) {
            return;
        }
        while (true) {
            w3Var = this.f9587d;
            if (j8 < w3Var.f7821w) {
                break;
            }
            s2.e eVar = this.f9584a;
            s2.a aVar = (s2.a) w3Var.f7822x;
            synchronized (eVar) {
                s2.a[] aVarArr = eVar.f;
                int i = eVar.f11434e;
                eVar.f11434e = i + 1;
                aVarArr[i] = aVar;
                eVar.f11433d--;
                eVar.notifyAll();
            }
            w3 w3Var2 = this.f9587d;
            w3Var2.f7822x = null;
            w3 w3Var3 = (w3) w3Var2.f7823y;
            w3Var2.f7823y = null;
            this.f9587d = w3Var3;
        }
        if (this.f9588e.f7820v < w3Var.f7820v) {
            this.f9588e = w3Var;
        }
    }

    public final int c(int i) {
        s2.a aVar;
        w3 w3Var = this.f;
        if (((s2.a) w3Var.f7822x) == null) {
            s2.e eVar = this.f9584a;
            synchronized (eVar) {
                try {
                    int i10 = eVar.f11433d + 1;
                    eVar.f11433d = i10;
                    int i11 = eVar.f11434e;
                    if (i11 > 0) {
                        s2.a[] aVarArr = eVar.f;
                        int i12 = i11 - 1;
                        eVar.f11434e = i12;
                        aVar = aVarArr[i12];
                        aVar.getClass();
                        eVar.f[eVar.f11434e] = null;
                    } else {
                        s2.a aVar2 = new s2.a(0, new byte[eVar.f11431b]);
                        s2.a[] aVarArr2 = eVar.f;
                        if (i10 > aVarArr2.length) {
                            eVar.f = (s2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            w3 w3Var2 = new w3(this.f9585b, this.f.f7821w);
            w3Var.f7822x = aVar;
            w3Var.f7823y = w3Var2;
        }
        return Math.min(i, (int) (this.f.f7821w - this.f9589g));
    }
}
