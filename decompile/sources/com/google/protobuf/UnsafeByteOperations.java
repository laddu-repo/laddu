package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
    }

    public static ByteString unsafeWrap(byte[] bArr) {
        return ByteString.wrap(bArr);
    }

    public static void unsafeWriteTo(ByteString byteString, ByteOutput byteOutput) {
        byteString.writeTo(byteOutput);
    }

    public static ByteString unsafeWrap(byte[] bArr, int i6, int i10) {
        return ByteString.wrap(bArr, i6, i10);
    }

    public static ByteString unsafeWrap(ByteBuffer byteBuffer) {
        return ByteString.wrap(byteBuffer);
    }
}
