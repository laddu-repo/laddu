package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i6) {
        k.e(byteString, "<this>");
        return byteString.byteAt(i6);
    }

    public static final boolean isNotEmpty(ByteString byteString) {
        k.e(byteString, "<this>");
        return !byteString.isEmpty();
    }

    public static final ByteString plus(ByteString byteString, ByteString other) {
        k.e(byteString, "<this>");
        k.e(other, "other");
        ByteString concat = byteString.concat(other);
        k.d(concat, "concat(other)");
        return concat;
    }

    public static final ByteString toByteString(byte[] bArr) {
        k.e(bArr, "<this>");
        ByteString copyFrom = ByteString.copyFrom(bArr);
        k.d(copyFrom, "copyFrom(this)");
        return copyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        k.e(str, "<this>");
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        k.d(copyFromUtf8, "copyFromUtf8(this)");
        return copyFromUtf8;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        k.e(byteBuffer, "<this>");
        ByteString copyFrom = ByteString.copyFrom(byteBuffer);
        k.d(copyFrom, "copyFrom(this)");
        return copyFrom;
    }
}
