package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    l0 wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = q4.f3026e;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String str) {
            super(r4.a.k("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super(r4.a.k("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    public static int computeBoolSize(int i6, boolean z10) {
        return computeBoolSizeNoTag(z10) + computeTagSize(i6);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeByteArraySize(int i6, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i6);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i6, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i6);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i6, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i6);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i6, double d10) {
        return computeDoubleSizeNoTag(d10) + computeTagSize(i6);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i6, int i10) {
        return computeEnumSizeNoTag(i10) + computeTagSize(i6);
    }

    public static int computeEnumSizeNoTag(int i6) {
        return computeInt32SizeNoTag(i6);
    }

    public static int computeFixed32Size(int i6, int i10) {
        return computeFixed32SizeNoTag(i10) + computeTagSize(i6);
    }

    public static int computeFixed32SizeNoTag(int i6) {
        return 4;
    }

    public static int computeFixed64Size(int i6, long j) {
        return computeFixed64SizeNoTag(j) + computeTagSize(i6);
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i6, float f3) {
        return computeFloatSizeNoTag(f3) + computeTagSize(i6);
    }

    public static int computeFloatSizeNoTag(float f3) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i6, MessageLite messageLite) {
        return messageLite.getSerializedSize() + (computeTagSize(i6) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i6, int i10) {
        return computeInt32SizeNoTag(i10) + computeTagSize(i6);
    }

    public static int computeInt32SizeNoTag(int i6) {
        if (i6 >= 0) {
            return computeUInt32SizeNoTag(i6);
        }
        return 10;
    }

    public static int computeInt64Size(int i6, long j) {
        return computeInt64SizeNoTag(j) + computeTagSize(i6);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i6, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSize(3, lazyFieldLite) + computeUInt32Size(2, i6) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i6, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSizeNoTag(lazyFieldLite) + computeTagSize(i6);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i6) {
        return computeUInt32SizeNoTag(i6) + i6;
    }

    public static int computeMessageSetExtensionSize(int i6, MessageLite messageLite) {
        return computeMessageSize(3, messageLite) + computeUInt32Size(2, i6) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i6, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i6);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i6) {
        if (i6 > 4096) {
            return DEFAULT_BUFFER_SIZE;
        }
        return i6;
    }

    public static int computeRawMessageSetExtensionSize(int i6, ByteString byteString) {
        return computeBytesSize(3, byteString) + computeUInt32Size(2, i6) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i6) {
        return computeUInt32SizeNoTag(i6);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeSFixed32Size(int i6, int i10) {
        return computeSFixed32SizeNoTag(i10) + computeTagSize(i6);
    }

    public static int computeSFixed32SizeNoTag(int i6) {
        return 4;
    }

    public static int computeSFixed64Size(int i6, long j) {
        return computeSFixed64SizeNoTag(j) + computeTagSize(i6);
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32Size(int i6, int i10) {
        return computeSInt32SizeNoTag(i10) + computeTagSize(i6);
    }

    public static int computeSInt32SizeNoTag(int i6) {
        return computeUInt32SizeNoTag(encodeZigZag32(i6));
    }

    public static int computeSInt64Size(int i6, long j) {
        return computeSInt64SizeNoTag(j) + computeTagSize(i6);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeStringSize(int i6, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i6);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = t4.e(str);
        } catch (r4 unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i6) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i6, 0));
    }

    public static int computeUInt32Size(int i6, int i10) {
        return computeUInt32SizeNoTag(i10) + computeTagSize(i6);
    }

    public static int computeUInt32SizeNoTag(int i6) {
        if ((i6 & (-128)) == 0) {
            return 1;
        }
        if ((i6 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i6) == 0) {
            return 3;
        }
        if ((i6 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int computeUInt64Size(int i6, long j) {
        return computeUInt64SizeNoTag(j) + computeTagSize(i6);
    }

    public static int computeUInt64SizeNoTag(long j) {
        int i6;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i6 = 6;
        } else {
            i6 = 2;
        }
        if (((-2097152) & j) != 0) {
            i6 += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return i6 + 1;
        }
        return i6;
    }

    public static int encodeZigZag32(int i6) {
        return (i6 >> 31) ^ (i6 << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, DEFAULT_BUFFER_SIZE);
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new i0(byteBuffer);
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new j0(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, r4 r4Var) {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) r4Var);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte b10);

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer);

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i6, int i10);

    public abstract void writeBool(int i6, boolean z10);

    public final void writeBoolNoTag(boolean z10) {
        write(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i6, byte[] bArr);

    public abstract void writeByteArray(int i6, byte[] bArr, int i10, int i11);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i6, int i10);

    public abstract void writeByteBuffer(int i6, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i6, ByteString byteString);

    public abstract void writeBytesNoTag(ByteString byteString);

    public final void writeDouble(int i6, double d10) {
        writeFixed64(i6, Double.doubleToRawLongBits(d10));
    }

    public final void writeDoubleNoTag(double d10) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d10));
    }

    public final void writeEnum(int i6, int i10) {
        writeInt32(i6, i10);
    }

    public final void writeEnumNoTag(int i6) {
        writeInt32NoTag(i6);
    }

    public abstract void writeFixed32(int i6, int i10);

    public abstract void writeFixed32NoTag(int i6);

    public abstract void writeFixed64(int i6, long j);

    public abstract void writeFixed64NoTag(long j);

    public final void writeFloat(int i6, float f3) {
        writeFixed32(i6, Float.floatToRawIntBits(f3));
    }

    public final void writeFloatNoTag(float f3) {
        writeFixed32NoTag(Float.floatToRawIntBits(f3));
    }

    @Deprecated
    public final void writeGroup(int i6, MessageLite messageLite) {
        writeTag(i6, 3);
        writeGroupNoTag(messageLite);
        writeTag(i6, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i6, int i10);

    public abstract void writeInt32NoTag(int i6);

    public final void writeInt64(int i6, long j) {
        writeUInt64(i6, j);
    }

    public final void writeInt64NoTag(long j) {
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer);

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i6, int i10);

    public abstract void writeMessage(int i6, MessageLite messageLite);

    public abstract void writeMessage(int i6, MessageLite messageLite, q3 q3Var);

    public abstract void writeMessageNoTag(MessageLite messageLite);

    public abstract void writeMessageNoTag(MessageLite messageLite, q3 q3Var);

    public abstract void writeMessageSetExtension(int i6, MessageLite messageLite);

    public final void writeRawByte(byte b10) {
        write(b10);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i6) {
        writeFixed32NoTag(i6);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j) {
        writeFixed64NoTag(j);
    }

    public abstract void writeRawMessageSetExtension(int i6, ByteString byteString);

    @Deprecated
    public final void writeRawVarint32(int i6) {
        writeUInt32NoTag(i6);
    }

    @Deprecated
    public final void writeRawVarint64(long j) {
        writeUInt64NoTag(j);
    }

    public final void writeSFixed32(int i6, int i10) {
        writeFixed32(i6, i10);
    }

    public final void writeSFixed32NoTag(int i6) {
        writeFixed32NoTag(i6);
    }

    public final void writeSFixed64(int i6, long j) {
        writeFixed64(i6, j);
    }

    public final void writeSFixed64NoTag(long j) {
        writeFixed64NoTag(j);
    }

    public final void writeSInt32(int i6, int i10) {
        writeUInt32(i6, encodeZigZag32(i10));
    }

    public final void writeSInt32NoTag(int i6) {
        writeUInt32NoTag(encodeZigZag32(i6));
    }

    public final void writeSInt64(int i6, long j) {
        writeUInt64(i6, encodeZigZag64(j));
    }

    public final void writeSInt64NoTag(long j) {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public abstract void writeString(int i6, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i6, int i10);

    public abstract void writeUInt32(int i6, int i10);

    public abstract void writeUInt32NoTag(int i6);

    public abstract void writeUInt64(int i6, long j);

    public abstract void writeUInt64NoTag(long j);

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(int i6, MessageLite messageLite, q3 q3Var) {
        return computeGroupSizeNoTag(messageLite, q3Var) + (computeTagSize(i6) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, q3 q3Var) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(q3Var);
    }

    public static int computeMessageSize(int i6, MessageLite messageLite, q3 q3Var) {
        return computeMessageSizeNoTag(messageLite, q3Var) + computeTagSize(i6);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, q3 q3Var) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(q3Var));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i6) {
        return new h0(outputStream, i6);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, q3 q3Var) {
        q3Var.e(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i6) {
        write((byte) i6);
    }

    public final void writeRawBytes(byte[] bArr, int i6, int i10) {
        write(bArr, i6, i10);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i6, int i10) {
        return new e0(bArr, i6, i10);
    }

    @Deprecated
    public final void writeGroup(int i6, MessageLite messageLite, q3 q3Var) {
        writeTag(i6, 3);
        writeGroupNoTag(messageLite, q3Var);
        writeTag(i6, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new g0(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (q4.f3025d) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i6) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i6) {
        if (i6 >= 0) {
            return new f0(byteOutput, i6);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
