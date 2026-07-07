package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d0 extends CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2889a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2890b;

    /* renamed from: c, reason: collision with root package name */
    public int f2891c;

    /* renamed from: d, reason: collision with root package name */
    public int f2892d;

    public d0(int i6) {
        super();
        if (i6 >= 0) {
            byte[] bArr = new byte[Math.max(i6, 20)];
            this.f2889a = bArr;
            this.f2890b = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void a(byte b10) {
        int i6 = this.f2891c;
        this.f2891c = i6 + 1;
        this.f2889a[i6] = b10;
        this.f2892d++;
    }

    public final void b(int i6) {
        int i10 = this.f2891c;
        int i11 = i10 + 1;
        this.f2891c = i11;
        byte[] bArr = this.f2889a;
        bArr[i10] = (byte) (i6 & 255);
        int i12 = i10 + 2;
        this.f2891c = i12;
        bArr[i11] = (byte) ((i6 >> 8) & 255);
        int i13 = i10 + 3;
        this.f2891c = i13;
        bArr[i12] = (byte) ((i6 >> 16) & 255);
        this.f2891c = i10 + 4;
        bArr[i13] = (byte) ((i6 >> 24) & 255);
        this.f2892d += 4;
    }

    public final void c(long j) {
        int i6 = this.f2891c;
        int i10 = i6 + 1;
        this.f2891c = i10;
        byte[] bArr = this.f2889a;
        bArr[i6] = (byte) (j & 255);
        int i11 = i6 + 2;
        this.f2891c = i11;
        bArr[i10] = (byte) ((j >> 8) & 255);
        int i12 = i6 + 3;
        this.f2891c = i12;
        bArr[i11] = (byte) ((j >> 16) & 255);
        int i13 = i6 + 4;
        this.f2891c = i13;
        bArr[i12] = (byte) (255 & (j >> 24));
        int i14 = i6 + 5;
        this.f2891c = i14;
        bArr[i13] = (byte) (((int) (j >> 32)) & 255);
        int i15 = i6 + 6;
        this.f2891c = i15;
        bArr[i14] = (byte) (((int) (j >> 40)) & 255);
        int i16 = i6 + 7;
        this.f2891c = i16;
        bArr[i15] = (byte) (((int) (j >> 48)) & 255);
        this.f2891c = i6 + 8;
        bArr[i16] = (byte) (((int) (j >> 56)) & 255);
        this.f2892d += 8;
    }

    public final void d(int i6, int i10) {
        e(WireFormat.makeTag(i6, i10));
    }

    public final void e(int i6) {
        boolean z10;
        z10 = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f2889a;
        if (z10) {
            long j = this.f2891c;
            while ((i6 & (-128)) != 0) {
                int i10 = this.f2891c;
                this.f2891c = i10 + 1;
                q4.n(bArr, i10, (byte) ((i6 & 127) | 128));
                i6 >>>= 7;
            }
            int i11 = this.f2891c;
            this.f2891c = i11 + 1;
            q4.n(bArr, i11, (byte) i6);
            this.f2892d += (int) (this.f2891c - j);
            return;
        }
        while ((i6 & (-128)) != 0) {
            int i12 = this.f2891c;
            this.f2891c = i12 + 1;
            bArr[i12] = (byte) ((i6 & 127) | 128);
            this.f2892d++;
            i6 >>>= 7;
        }
        int i13 = this.f2891c;
        this.f2891c = i13 + 1;
        bArr[i13] = (byte) i6;
        this.f2892d++;
    }

    public final void f(long j) {
        boolean z10;
        z10 = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f2889a;
        if (z10) {
            long j10 = this.f2891c;
            while ((j & (-128)) != 0) {
                int i6 = this.f2891c;
                this.f2891c = i6 + 1;
                q4.n(bArr, i6, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i10 = this.f2891c;
            this.f2891c = i10 + 1;
            q4.n(bArr, i10, (byte) j);
            this.f2892d += (int) (this.f2891c - j10);
            return;
        }
        while ((j & (-128)) != 0) {
            int i11 = this.f2891c;
            this.f2891c = i11 + 1;
            bArr[i11] = (byte) ((((int) j) & 127) | 128);
            this.f2892d++;
            j >>>= 7;
        }
        int i12 = this.f2891c;
        this.f2891c = i12 + 1;
        bArr[i12] = (byte) j;
        this.f2892d++;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f2892d;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(byte[] bArr, int i6, int i10) {
        write(bArr, i6, i10);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(ByteBuffer byteBuffer) {
        write(byteBuffer);
    }
}
