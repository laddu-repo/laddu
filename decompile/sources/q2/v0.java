package q2;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;
import n9.o3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final u2.e f10974a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10975b;

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f10976c;

    /* renamed from: d, reason: collision with root package name */
    public o3 f10977d;

    /* renamed from: e, reason: collision with root package name */
    public o3 f10978e;

    /* renamed from: f, reason: collision with root package name */
    public o3 f10979f;

    /* renamed from: g, reason: collision with root package name */
    public long f10980g;

    public v0(u2.e eVar) {
        this.f10974a = eVar;
        int i6 = eVar.f12834b;
        this.f10975b = i6;
        this.f10976c = new u1.t(32);
        o3 o3Var = new o3(0L, i6);
        this.f10977d = o3Var;
        this.f10978e = o3Var;
        this.f10979f = o3Var;
    }

    public static o3 d(o3 o3Var, long j, ByteBuffer byteBuffer, int i6) {
        while (j >= o3Var.f9422y) {
            o3Var = (o3) o3Var.A;
        }
        while (i6 > 0) {
            int min = Math.min(i6, (int) (o3Var.f9422y - j));
            u2.a aVar = (u2.a) o3Var.f9423z;
            byteBuffer.put(aVar.f12825a, ((int) (j - o3Var.f9421x)) + aVar.f12826b, min);
            i6 -= min;
            j += min;
            if (j == o3Var.f9422y) {
                o3Var = (o3) o3Var.A;
            }
        }
        return o3Var;
    }

    public static o3 e(o3 o3Var, long j, byte[] bArr, int i6) {
        while (j >= o3Var.f9422y) {
            o3Var = (o3) o3Var.A;
        }
        int i10 = i6;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (o3Var.f9422y - j));
            u2.a aVar = (u2.a) o3Var.f9423z;
            System.arraycopy(aVar.f12825a, ((int) (j - o3Var.f9421x)) + aVar.f12826b, bArr, i6 - i10, min);
            i10 -= min;
            j += min;
            if (j == o3Var.f9422y) {
                o3Var = (o3) o3Var.A;
            }
        }
        return o3Var;
    }

    public static o3 f(o3 o3Var, y1.h hVar, e8.b bVar, u1.t tVar) {
        boolean z10;
        if (hVar.getFlag(1073741824)) {
            long j = bVar.f4469b;
            int i6 = 1;
            tVar.H(1);
            o3 e10 = e(o3Var, j, tVar.f12811a, 1);
            long j10 = j + 1;
            byte b10 = tVar.f12811a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = b10 & Byte.MAX_VALUE;
            y1.d dVar = hVar.f14811y;
            byte[] bArr = dVar.f14801a;
            if (bArr == null) {
                dVar.f14801a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            o3Var = e(e10, j10, dVar.f14801a, i10);
            long j11 = j10 + i10;
            if (z10) {
                tVar.H(2);
                o3Var = e(o3Var, j11, tVar.f12811a, 2);
                j11 += 2;
                i6 = tVar.E();
            }
            int[] iArr = dVar.f14804d;
            if (iArr == null || iArr.length < i6) {
                iArr = new int[i6];
            }
            int[] iArr2 = dVar.f14805e;
            if (iArr2 == null || iArr2.length < i6) {
                iArr2 = new int[i6];
            }
            if (z10) {
                int i11 = i6 * 6;
                tVar.H(i11);
                o3Var = e(o3Var, j11, tVar.f12811a, i11);
                j11 += i11;
                tVar.K(0);
                for (int i12 = 0; i12 < i6; i12++) {
                    iArr[i12] = tVar.E();
                    iArr2[i12] = tVar.C();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f4468a - ((int) (j11 - bVar.f4469b));
            }
            y2.e0 e0Var = (y2.e0) bVar.f4470c;
            String str = u1.a0.f12750a;
            byte[] bArr2 = e0Var.f14890b;
            byte[] bArr3 = dVar.f14801a;
            int i13 = e0Var.f14889a;
            int i14 = e0Var.f14891c;
            int i15 = e0Var.f14892d;
            dVar.f14806f = i6;
            dVar.f14804d = iArr;
            dVar.f14805e = iArr2;
            dVar.f14802b = bArr2;
            dVar.f14801a = bArr3;
            dVar.f14803c = i13;
            dVar.f14807g = i14;
            dVar.f14808h = i15;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f14809i;
            cryptoInfo.numSubSamples = i6;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Build.VERSION.SDK_INT >= 24) {
                y1.c cVar = dVar.j;
                cVar.getClass();
                ((MediaCodec.CryptoInfo.Pattern) cVar.f14800b).set(i14, i15);
                ((MediaCodec.CryptoInfo) cVar.f14799a).setPattern((MediaCodec.CryptoInfo.Pattern) cVar.f14800b);
            }
            long j12 = bVar.f4469b;
            int i16 = (int) (j11 - j12);
            bVar.f4469b = j12 + i16;
            bVar.f4468a -= i16;
        }
        if (hVar.hasSupplementalData()) {
            tVar.H(4);
            o3 e11 = e(o3Var, bVar.f4469b, tVar.f12811a, 4);
            int C = tVar.C();
            bVar.f4469b += 4;
            bVar.f4468a -= 4;
            hVar.b(C);
            o3 d10 = d(e11, bVar.f4469b, hVar.f14812z, C);
            bVar.f4469b += C;
            int i17 = bVar.f4468a - C;
            bVar.f4468a = i17;
            ByteBuffer byteBuffer = hVar.C;
            if (byteBuffer != null && byteBuffer.capacity() >= i17) {
                hVar.C.clear();
            } else {
                hVar.C = ByteBuffer.allocate(i17);
            }
            return d(d10, bVar.f4469b, hVar.C, bVar.f4468a);
        }
        hVar.b(bVar.f4468a);
        return d(o3Var, bVar.f4469b, hVar.f14812z, bVar.f4468a);
    }

    public final void a(o3 o3Var) {
        if (((u2.a) o3Var.f9423z) == null) {
            return;
        }
        u2.e eVar = this.f10974a;
        synchronized (eVar) {
            o3 o3Var2 = o3Var;
            while (o3Var2 != null) {
                try {
                    u2.a[] aVarArr = eVar.f12838f;
                    int i6 = eVar.f12837e;
                    eVar.f12837e = i6 + 1;
                    u2.a aVar = (u2.a) o3Var2.f9423z;
                    aVar.getClass();
                    aVarArr[i6] = aVar;
                    eVar.f12836d--;
                    o3Var2 = (o3) o3Var2.A;
                    if (o3Var2 == null || ((u2.a) o3Var2.f9423z) == null) {
                        o3Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar.notifyAll();
        }
        o3Var.f9423z = null;
        o3Var.A = null;
    }

    public final void b(long j) {
        o3 o3Var;
        if (j != -1) {
            while (true) {
                o3Var = this.f10977d;
                if (j < o3Var.f9422y) {
                    break;
                }
                u2.e eVar = this.f10974a;
                u2.a aVar = (u2.a) o3Var.f9423z;
                synchronized (eVar) {
                    u2.a[] aVarArr = eVar.f12838f;
                    int i6 = eVar.f12837e;
                    eVar.f12837e = i6 + 1;
                    aVarArr[i6] = aVar;
                    eVar.f12836d--;
                    eVar.notifyAll();
                }
                o3 o3Var2 = this.f10977d;
                o3Var2.f9423z = null;
                o3 o3Var3 = (o3) o3Var2.A;
                o3Var2.A = null;
                this.f10977d = o3Var3;
            }
            if (this.f10978e.f9421x < o3Var.f9421x) {
                this.f10978e = o3Var;
            }
        }
    }

    public final int c(int i6) {
        u2.a aVar;
        o3 o3Var = this.f10979f;
        if (((u2.a) o3Var.f9423z) == null) {
            u2.e eVar = this.f10974a;
            synchronized (eVar) {
                try {
                    int i10 = eVar.f12836d + 1;
                    eVar.f12836d = i10;
                    int i11 = eVar.f12837e;
                    if (i11 > 0) {
                        u2.a[] aVarArr = eVar.f12838f;
                        int i12 = i11 - 1;
                        eVar.f12837e = i12;
                        aVar = aVarArr[i12];
                        aVar.getClass();
                        eVar.f12838f[eVar.f12837e] = null;
                    } else {
                        u2.a aVar2 = new u2.a(0, new byte[eVar.f12834b]);
                        u2.a[] aVarArr2 = eVar.f12838f;
                        if (i10 > aVarArr2.length) {
                            eVar.f12838f = (u2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            o3 o3Var2 = new o3(this.f10979f.f9422y, this.f10975b);
            o3Var.f9423z = aVar;
            o3Var.A = o3Var2;
        }
        return Math.min(i6, (int) (this.f10979f.f9422y - this.f10980g));
    }
}
