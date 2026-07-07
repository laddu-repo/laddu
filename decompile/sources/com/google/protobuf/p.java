package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: y, reason: collision with root package name */
    public final int f3006y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3007z;

    public p(byte[] bArr, int i6, int i10) {
        super(bArr);
        ByteString.checkRange(i6, i6 + i10, bArr.length);
        this.f3006y = i6;
        this.f3007z = i10;
    }

    @Override // com.google.protobuf.t
    public final int b() {
        return this.f3006y;
    }

    @Override // com.google.protobuf.t, com.google.protobuf.ByteString
    public final byte byteAt(int i6) {
        ByteString.checkIndex(i6, this.f3007z);
        return this.f3049x[this.f3006y + i6];
    }

    @Override // com.google.protobuf.t, com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i6, int i10, int i11) {
        System.arraycopy(this.f3049x, this.f3006y + i6, bArr, i10, i11);
    }

    @Override // com.google.protobuf.t, com.google.protobuf.s, com.google.protobuf.ByteString
    public final byte internalByteAt(int i6) {
        return this.f3049x[this.f3006y + i6];
    }

    @Override // com.google.protobuf.t, com.google.protobuf.ByteString
    public final int size() {
        return this.f3007z;
    }
}
