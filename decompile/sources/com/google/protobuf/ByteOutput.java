package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class ByteOutput {
    public abstract void write(byte b10);

    public abstract void write(ByteBuffer byteBuffer);

    public abstract void write(byte[] bArr, int i6, int i10);

    public abstract void writeLazy(ByteBuffer byteBuffer);

    public abstract void writeLazy(byte[] bArr, int i6, int i10);
}
