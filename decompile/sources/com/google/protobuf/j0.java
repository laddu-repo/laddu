package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 extends CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f2948a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f2949b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2950c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2951d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2952e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2953f;

    /* renamed from: g, reason: collision with root package name */
    public long f2954g;

    public j0(ByteBuffer byteBuffer) {
        super();
        this.f2948a = byteBuffer;
        this.f2949b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long b10 = q4.b(byteBuffer);
        this.f2950c = b10;
        long position = byteBuffer.position() + b10;
        this.f2951d = position;
        long limit = b10 + byteBuffer.limit();
        this.f2952e = limit;
        this.f2953f = limit - 10;
        this.f2954g = position;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f2948a.position((int) (this.f2954g - this.f2950c));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return (int) (this.f2954g - this.f2951d);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return (int) (this.f2952e - this.f2954g);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b10) {
        long j = this.f2954g;
        long j10 = this.f2952e;
        if (j < j10) {
            this.f2954g = 1 + j;
            q4.m(j, b10);
            return;
        }
        throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f2954g), Long.valueOf(j10), 1));
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
        this.f2949b.putInt((int) (this.f2954g - this.f2950c), i6);
        this.f2954g += 4;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i6, long j) {
        writeTag(i6, 1);
        writeFixed64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) {
        this.f2949b.putLong((int) (this.f2954g - this.f2950c), j);
        this.f2954g += 8;
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
        long j = this.f2950c;
        ByteBuffer byteBuffer = this.f2949b;
        long j10 = this.f2954g;
        try {
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int i6 = ((int) (this.f2954g - j)) + computeUInt32SizeNoTag2;
                byteBuffer.position(i6);
                t4.d(str, byteBuffer);
                int position = byteBuffer.position() - i6;
                writeUInt32NoTag(position);
                this.f2954g += position;
                return;
            }
            int e10 = t4.e(str);
            writeUInt32NoTag(e10);
            byteBuffer.position((int) (this.f2954g - j));
            t4.d(str, byteBuffer);
            this.f2954g += e10;
        } catch (r4 e11) {
            this.f2954g = j10;
            byteBuffer.position((int) (j10 - j));
            inefficientWriteStringNoTag(str, e11);
        } catch (IllegalArgumentException e12) {
            throw new CodedOutputStream.OutOfSpaceException(e12);
        } catch (IndexOutOfBoundsException e13) {
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
        if (this.f2954g <= this.f2953f) {
            while ((i6 & (-128)) != 0) {
                long j = this.f2954g;
                this.f2954g = j + 1;
                q4.m(j, (byte) ((i6 & 127) | 128));
                i6 >>>= 7;
            }
            long j10 = this.f2954g;
            this.f2954g = 1 + j10;
            q4.m(j10, (byte) i6);
            return;
        }
        while (true) {
            long j11 = this.f2954g;
            long j12 = this.f2952e;
            if (j11 < j12) {
                if ((i6 & (-128)) == 0) {
                    this.f2954g = 1 + j11;
                    q4.m(j11, (byte) i6);
                    return;
                } else {
                    this.f2954g = j11 + 1;
                    q4.m(j11, (byte) ((i6 & 127) | 128));
                    i6 >>>= 7;
                }
            } else {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f2954g), Long.valueOf(j12), 1));
            }
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i6, long j) {
        writeTag(i6, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) {
        if (this.f2954g <= this.f2953f) {
            while ((j & (-128)) != 0) {
                long j10 = this.f2954g;
                this.f2954g = j10 + 1;
                q4.m(j10, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            long j11 = this.f2954g;
            this.f2954g = 1 + j11;
            q4.m(j11, (byte) j);
            return;
        }
        while (true) {
            long j12 = this.f2954g;
            long j13 = this.f2952e;
            if (j12 < j13) {
                if ((j & (-128)) == 0) {
                    this.f2954g = 1 + j12;
                    q4.m(j12, (byte) j);
                    return;
                } else {
                    this.f2954g = j12 + 1;
                    q4.m(j12, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f2954g), Long.valueOf(j13), 1));
            }
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
    public final void write(byte[] bArr, int i6, int i10) {
        long j = this.f2952e;
        if (bArr != null && i6 >= 0 && i10 >= 0 && bArr.length - i10 >= i6) {
            long j10 = i10;
            long j11 = j - j10;
            long j12 = this.f2954g;
            if (j11 >= j12) {
                q4.f3024c.d(bArr, i6, j12, j10);
                this.f2954g += j10;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException("value");
        }
        throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f2954g), Long.valueOf(j), Integer.valueOf(i10)));
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f2949b;
        try {
            int remaining = byteBuffer.remaining();
            byteBuffer2.position((int) (this.f2954g - this.f2950c));
            byteBuffer2.put(byteBuffer);
            this.f2954g += remaining;
        } catch (BufferOverflowException e10) {
            throw new CodedOutputStream.OutOfSpaceException(e10);
        }
    }
}
