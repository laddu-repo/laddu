package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class e0 extends CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2899a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2900b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2901c;

    /* renamed from: d, reason: collision with root package name */
    public int f2902d;

    public e0(byte[] bArr, int i6, int i10) {
        super();
        if (bArr != null) {
            int i11 = i6 + i10;
            if ((i6 | i10 | (bArr.length - i11)) >= 0) {
                this.f2899a = bArr;
                this.f2900b = i6;
                this.f2902d = i6;
                this.f2901c = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i6), Integer.valueOf(i10)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.f2902d - this.f2900b;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        return this.f2901c - this.f2902d;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b10) {
        try {
            byte[] bArr = this.f2899a;
            int i6 = this.f2902d;
            this.f2902d = i6 + 1;
            bArr[i6] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2902d), Integer.valueOf(this.f2901c), 1), e10);
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
            byte[] bArr = this.f2899a;
            int i10 = this.f2902d;
            int i11 = i10 + 1;
            this.f2902d = i11;
            bArr[i10] = (byte) (i6 & 255);
            int i12 = i10 + 2;
            this.f2902d = i12;
            bArr[i11] = (byte) ((i6 >> 8) & 255);
            int i13 = i10 + 3;
            this.f2902d = i13;
            bArr[i12] = (byte) ((i6 >> 16) & 255);
            this.f2902d = i10 + 4;
            bArr[i13] = (byte) ((i6 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2902d), Integer.valueOf(this.f2901c), 1), e10);
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
            byte[] bArr = this.f2899a;
            int i6 = this.f2902d;
            int i10 = i6 + 1;
            this.f2902d = i10;
            bArr[i6] = (byte) (((int) j) & 255);
            int i11 = i6 + 2;
            this.f2902d = i11;
            bArr[i10] = (byte) (((int) (j >> 8)) & 255);
            int i12 = i6 + 3;
            this.f2902d = i12;
            bArr[i11] = (byte) (((int) (j >> 16)) & 255);
            int i13 = i6 + 4;
            this.f2902d = i13;
            bArr[i12] = (byte) (((int) (j >> 24)) & 255);
            int i14 = i6 + 5;
            this.f2902d = i14;
            bArr[i13] = (byte) (((int) (j >> 32)) & 255);
            int i15 = i6 + 6;
            this.f2902d = i15;
            bArr[i14] = (byte) (((int) (j >> 40)) & 255);
            int i16 = i6 + 7;
            this.f2902d = i16;
            bArr[i15] = (byte) (((int) (j >> 48)) & 255);
            this.f2902d = i6 + 8;
            bArr[i16] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2902d), Integer.valueOf(this.f2901c), 1), e10);
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
        int i6 = this.f2902d;
        try {
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
            int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            byte[] bArr = this.f2899a;
            if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                int i10 = i6 + computeUInt32SizeNoTag2;
                this.f2902d = i10;
                int f3 = t4.f3054a.f(str, bArr, i10, spaceLeft());
                this.f2902d = i6;
                writeUInt32NoTag((f3 - i6) - computeUInt32SizeNoTag2);
                this.f2902d = f3;
                return;
            }
            writeUInt32NoTag(t4.e(str));
            this.f2902d = t4.f3054a.f(str, bArr, this.f2902d, spaceLeft());
        } catch (r4 e10) {
            this.f2902d = i6;
            inefficientWriteStringNoTag(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new CodedOutputStream.OutOfSpaceException(e11);
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
            byte[] bArr = this.f2899a;
            if (i10 == 0) {
                int i11 = this.f2902d;
                this.f2902d = i11 + 1;
                bArr[i11] = (byte) i6;
                return;
            } else {
                try {
                    int i12 = this.f2902d;
                    this.f2902d = i12 + 1;
                    bArr[i12] = (byte) ((i6 & 127) | 128);
                    i6 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2902d), Integer.valueOf(this.f2901c), 1), e10);
                }
            }
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2902d), Integer.valueOf(this.f2901c), 1), e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i6, long j) {
        writeTag(i6, 0);
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) {
        boolean z10;
        z10 = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.f2899a;
        if (z10 && spaceLeft() >= 10) {
            while ((j & (-128)) != 0) {
                int i6 = this.f2902d;
                this.f2902d = i6 + 1;
                q4.n(bArr, i6, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i10 = this.f2902d;
            this.f2902d = i10 + 1;
            q4.n(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i11 = this.f2902d;
                this.f2902d = i11 + 1;
                bArr[i11] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2902d), Integer.valueOf(this.f2901c), 1), e10);
            }
        }
        int i12 = this.f2902d;
        this.f2902d = i12 + 1;
        bArr[i12] = (byte) j;
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
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(q3Var));
        q3Var.e(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeMessageNoTag(MessageLite messageLite, q3 q3Var) {
        writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(q3Var));
        q3Var.e(messageLite, this.wrapper);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte[] bArr, int i6, int i10) {
        try {
            System.arraycopy(bArr, i6, this.f2899a, this.f2902d, i10);
            this.f2902d += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2902d), Integer.valueOf(this.f2901c), Integer.valueOf(i10)), e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.f2899a, this.f2902d, remaining);
            this.f2902d += remaining;
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2902d), Integer.valueOf(this.f2901c), Integer.valueOf(remaining)), e10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public void flush() {
    }
}
