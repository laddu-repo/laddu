package y2;

import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements p {
    public long A;
    public int C;
    public int D;

    /* renamed from: y, reason: collision with root package name */
    public final r1.i f14924y;

    /* renamed from: z, reason: collision with root package name */
    public final long f14925z;
    public byte[] B = new byte[65536];

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f14923x = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    static {
        r1.f0.a("media3.extractor");
    }

    public l(r1.i iVar, long j, long j10) {
        this.f14924y = iVar;
        this.A = j;
        this.f14925z = j10;
    }

    @Override // y2.p
    public final void C(byte[] bArr, int i6, int i10) {
        k(bArr, i6, i10, false);
    }

    public final boolean b(int i6, boolean z10) {
        c(i6);
        int i10 = this.D - this.C;
        while (i10 < i6) {
            int i11 = i6;
            boolean z11 = z10;
            i10 = f(this.B, this.C, i11, i10, z11);
            if (i10 == -1) {
                return false;
            }
            this.D = this.C + i10;
            i6 = i11;
            z10 = z11;
        }
        this.C += i6;
        return true;
    }

    public final void c(int i6) {
        int i10 = this.C + i6;
        byte[] bArr = this.B;
        if (i10 > bArr.length) {
            this.B = Arrays.copyOf(this.B, u1.a0.i(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    @Override // y2.p
    public final boolean d(byte[] bArr, int i6, int i10, boolean z10) {
        int min;
        int i11 = this.D;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.B, 0, bArr, i6, min);
            g(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = f(bArr, i6, i10, i12, z10);
        }
        if (i12 != -1) {
            this.A += i12;
        }
        if (i12 == -1) {
            return false;
        }
        return true;
    }

    public final int f(byte[] bArr, int i6, int i10, int i11, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f14924y.read(bArr, i6 + i11, i10 - i11);
            if (read == -1) {
                if (i11 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i11 + read;
        }
        throw new InterruptedIOException();
    }

    public final void g(int i6) {
        byte[] bArr;
        int i10 = this.D - i6;
        this.D = i10;
        this.C = 0;
        byte[] bArr2 = this.B;
        if (i10 < bArr2.length - 524288) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i6, bArr, 0, i10);
        this.B = bArr;
    }

    @Override // y2.p
    public final long getLength() {
        return this.f14925z;
    }

    @Override // y2.p
    public final long getPosition() {
        return this.A;
    }

    @Override // y2.p
    public final boolean j(int i6, boolean z10) {
        int min = Math.min(this.D, i6);
        g(min);
        int i10 = min;
        while (i10 < i6 && i10 != -1) {
            byte[] bArr = this.f14923x;
            i10 = f(bArr, -i10, Math.min(i6, bArr.length + i10), i10, z10);
        }
        if (i10 != -1) {
            this.A += i10;
        }
        if (i10 != -1) {
            return true;
        }
        return false;
    }

    @Override // y2.p
    public final boolean k(byte[] bArr, int i6, int i10, boolean z10) {
        if (!b(i10, z10)) {
            return false;
        }
        System.arraycopy(this.B, this.C - i10, bArr, i6, i10);
        return true;
    }

    @Override // y2.p
    public final long l() {
        return this.A + this.C;
    }

    @Override // y2.p
    public final void o(int i6) {
        b(i6, false);
    }

    @Override // y2.p
    public final int p(int i6) {
        l lVar;
        int min = Math.min(this.D, i6);
        g(min);
        if (min == 0) {
            byte[] bArr = this.f14923x;
            lVar = this;
            min = lVar.f(bArr, 0, Math.min(i6, bArr.length), 0, true);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.A += min;
        }
        return min;
    }

    @Override // y2.p
    public final int r(byte[] bArr, int i6, int i10) {
        l lVar;
        int min;
        c(i10);
        int i11 = this.D;
        int i12 = this.C;
        int i13 = i11 - i12;
        if (i13 == 0) {
            lVar = this;
            min = lVar.f(this.B, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            lVar.D += min;
        } else {
            lVar = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(lVar.B, lVar.C, bArr, i6, min);
        lVar.C += min;
        return min;
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        l lVar;
        int i11 = this.D;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.B, 0, bArr, i6, min);
            g(min);
            i12 = min;
        }
        if (i12 == 0) {
            lVar = this;
            i12 = lVar.f(bArr, i6, i10, 0, true);
        } else {
            lVar = this;
        }
        if (i12 != -1) {
            lVar.A += i12;
        }
        return i12;
    }

    @Override // y2.p
    public final void readFully(byte[] bArr, int i6, int i10) {
        d(bArr, i6, i10, false);
    }

    @Override // y2.p
    public final void v() {
        this.C = 0;
    }

    @Override // y2.p
    public final void w(int i6) {
        j(i6, false);
    }
}
