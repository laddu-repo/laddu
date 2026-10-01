package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 extends CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f2932a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f2933b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2934c;

    public i0(ByteBuffer byteBuffer) {
        super();
        this.f2932a = byteBuffer;
        this.f2933b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.f2934c = byteBuffer.position();
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f2932a.position(this.f2933b.position());
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f2933b.position() - this.f2934c;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.f2933b.remaining();
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b10) {
        try {
            this.f2933b.put(b10);
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i6, boolean z10) {
        writeTag(i6, 0);
        write(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i6, byte[] bArr) {
        writeByteArray(i6, bArr, 0, bArr.length);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArrayNoTag(byte[] bArr, int i6, int i10) {
        writeUInt32NoTag(i10);
        write(bArr, i6, i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteBuffer(int i6, ByteBuffer byteBuffer) {
        writeTag(i6, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytes(int i6, ByteString byteString) {
        writeTag(i6, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBytesNoTag(ByteString byteString) {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32(int i6, int i10) {
        writeTag(i6, 5);
        writeFixed32NoTag(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i6) {
        try {
            this.f2933b.putInt(i6);
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i6, long j) {
        writeTag(i6, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) {
        try {
            this.f2933b.putLong(j);
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i6, int i10) {
        writeTag(i6, 0);
        writeInt32NoTag(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i6) {
        if (i6 >= 0) {
            writeUInt32NoTag(i6);
        } else {
            writeUInt64NoTag(i6);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(byte[] bArr, int i6, int i10) {
        write(bArr, i6, i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i6, MessageLite messageLite) {
        writeTag(i6, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite) {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageSetExtension(int i6, MessageLite messageLite) {
        writeTag(1, 3);
        writeUInt32(2, i6);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        write(duplicate);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeRawMessageSetExtension(int i6, ByteString byteString) {
        writeTag(1, 3);
        writeUInt32(2, i6);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeString(int i6, String str) {
        writeTag(i6, 2);
        writeStringNoTag(str);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeStringNoTag(String str) {
        ByteBuffer byteBuffer = this.f2933b;
        int position = byteBuffer.position();
        try {
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int position2 = byteBuffer.position() + computeUInt32SizeNoTag2;
                byteBuffer.position(position2);
                try {
                    t4.d(str, byteBuffer);
                    int position3 = byteBuffer.position();
                    byteBuffer.position(position);
                    writeUInt32NoTag(position3 - position2);
                    byteBuffer.position(position3);
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw new CodedOutputStream.OutOfSpaceException(e10);
                }
            }
            writeUInt32NoTag(t4.e(str));
            try {
                t4.d(str, byteBuffer);
            } catch (IndexOutOfBoundsException e11) {
                throw new CodedOutputStream.OutOfSpaceException(e11);
            }
        } catch (r4 e12) {
            byteBuffer.position(position);
            inefficientWriteStringNoTag(str, e12);
        } catch (IllegalArgumentException e13) {
            throw new CodedOutputStream.OutOfSpaceException(e13);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i6, int i10) {
        writeUInt32NoTag(WireFormat.makeTag(i6, i10));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i6, int i10) {
        writeTag(i6, 0);
        writeUInt32NoTag(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i6) {
        while (true) {
            int i10 = i6 & (-128);
            ByteBuffer byteBuffer = this.f2933b;
            if (i10 == 0) {
                byteBuffer.put((byte) i6);
                return;
            }
            try {
                byteBuffer.put((byte) ((i6 & 127) | 128));
                i6 >>>= 7;
            } catch (BufferOverflowException e10) {
                throw new CodedOutputStream.OutOfSpaceException(e10);
            }
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i6, long j) {
        writeTag(i6, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) {
        while (true) {
            long j10 = (-128) & j;
            ByteBuffer byteBuffer = this.f2933b;
            if (j10 == 0) {
                byteBuffer.put((byte) j);
                return;
            }
            try {
                byteBuffer.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e10) {
                throw new CodedOutputStream.OutOfSpaceException(e10);
            }
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i6, byte[] bArr, int i10, int i11) {
        writeTag(i6, 2);
        writeByteArrayNoTag(bArr, i10, i11);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void writeLazy(ByteBuffer byteBuffer) {
        write(byteBuffer);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i6, int i10) {
        try {
            this.f2933b.put(bArr, i6, i10);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        } catch (BufferOverflowException e11) {
            throw new CodedOutputStream.OutOfSpaceException(e11);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessage(int i6, MessageLite messageLite, q3 q3Var) {
        writeTag(i6, 2);
        writeMessageNoTag(messageLite, q3Var);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, q3 q3Var) {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(q3Var));
        q3Var.e(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) {
        try {
            this.f2933b.put(byteBuffer);
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }
}
