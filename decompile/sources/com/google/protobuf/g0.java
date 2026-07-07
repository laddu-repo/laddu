package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 extends e0 {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f2921e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2922f;

    public g0(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.f2921e = byteBuffer;
        this.f2922f = byteBuffer.position();
    }

    @Override // com.google.protobuf.e0, com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f2921e.position(getTotalBytesWritten() + this.f2922f);
    }
}
