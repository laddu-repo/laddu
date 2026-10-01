package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.ByteString;
import df.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    public static final ByteString fromBase64(String str, boolean z10) {
        int i6;
        k.e(str, "<this>");
        if (z10) {
            i6 = 10;
        } else {
            i6 = 2;
        }
        ByteString copyFrom = ByteString.copyFrom(Base64.decode(str, i6));
        k.d(copyFrom, "copyFrom(android.util.Base64.decode(this, flag))");
        return copyFrom;
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = false;
        }
        return fromBase64(str, z10);
    }

    public static final String toBase64(ByteString byteString, boolean z10) {
        int i6;
        k.e(byteString, "<this>");
        if (z10) {
            i6 = 10;
        } else {
            i6 = 2;
        }
        String encodeToString = Base64.encodeToString(byteString.toByteArray(), i6);
        k.d(encodeToString, "encodeToString(this.toByteArray(), flag)");
        return encodeToString;
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = false;
        }
        return toBase64(byteString, z10);
    }

    public static final ByteString toByteString(UUID uuid) {
        k.e(uuid, "<this>");
        ByteString copyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        k.d(copyFrom, "copyFrom(bytes.array())");
        return copyFrom;
    }

    public static final ByteString toISO8859ByteString(String str) {
        k.e(str, "<this>");
        byte[] bytes = str.getBytes(a.f4116b);
        k.d(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString copyFrom = ByteString.copyFrom(bytes);
        k.d(copyFrom, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return copyFrom;
    }

    public static final String toISO8859String(ByteString byteString) {
        k.e(byteString, "<this>");
        String byteString2 = byteString.toString(a.f4116b);
        k.d(byteString2, "this.toString(Charsets.ISO_8859_1)");
        return byteString2;
    }

    public static final UUID toUUID(ByteString byteString) {
        k.e(byteString, "<this>");
        ByteBuffer asReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        k.d(asReadOnlyByteBuffer, "this.asReadOnlyByteBuffer()");
        if (asReadOnlyByteBuffer.remaining() == 36) {
            UUID fromString = UUID.fromString(byteString.toStringUtf8());
            k.d(fromString, "fromString(uuidString)");
            return fromString;
        }
        if (asReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(asReadOnlyByteBuffer.getLong(), asReadOnlyByteBuffer.getLong());
        }
        throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
    }
}
