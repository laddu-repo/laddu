package com.google.protobuf;

import java.io.InputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o3 extends InputStream {
    public int A;
    public int B;
    public int C;
    public final /* synthetic */ p3 D;

    /* renamed from: x, reason: collision with root package name */
    public n3 f3003x;

    /* renamed from: y, reason: collision with root package name */
    public s f3004y;

    /* renamed from: z, reason: collision with root package name */
    public int f3005z;

    public o3(p3 p3Var) {
        this.D = p3Var;
        n3 n3Var = new n3(p3Var);
        this.f3003x = n3Var;
        s next = n3Var.next();
        this.f3004y = next;
        this.f3005z = next.size();
        this.A = 0;
        this.B = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.D.f3016x - (this.B + this.A);
    }

    public final void d() {
        if (this.f3004y != null) {
            int i6 = this.A;
            int i10 = this.f3005z;
            if (i6 == i10) {
                this.B += i10;
                this.A = 0;
                if (this.f3003x.hasNext()) {
                    s next = this.f3003x.next();
                    this.f3004y = next;
                    this.f3005z = next.size();
                } else {
                    this.f3004y = null;
                    this.f3005z = 0;
                }
            }
        }
    }

    public final int f(byte[] bArr, int i6, int i10) {
        int i11 = i10;
        while (i11 > 0) {
            d();
            if (this.f3004y == null) {
                break;
            }
            int min = Math.min(this.f3005z - this.A, i11);
            if (bArr != null) {
                this.f3004y.copyTo(bArr, this.A, i6, min);
                i6 += min;
            }
            this.A += min;
            i11 -= min;
        }
        return i10 - i11;
    }

    @Override // java.io.InputStream
    public final void mark(int i6) {
        this.C = this.B + this.A;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        bArr.getClass();
        if (i6 >= 0 && i10 >= 0 && i10 <= bArr.length - i6) {
            int f3 = f(bArr, i6, i10);
            if (f3 != 0) {
                return f3;
            }
            if (i10 <= 0) {
                if (this.D.f3016x - (this.B + this.A) != 0) {
                    return f3;
                }
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        n3 n3Var = new n3(this.D);
        this.f3003x = n3Var;
        s next = n3Var.next();
        this.f3004y = next;
        this.f3005z = next.size();
        this.A = 0;
        this.B = 0;
        f(null, 0, this.C);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return f(null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final int read() {
        d();
        s sVar = this.f3004y;
        if (sVar == null) {
            return -1;
        }
        int i6 = this.A;
        this.A = i6 + 1;
        return sVar.byteAt(i6) & 255;
    }
}
