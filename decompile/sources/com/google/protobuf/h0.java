package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public final OutputStream f2927e;

    public h0(OutputStream outputStream, int i6) {
        super(i6);
        if (outputStream != null) {
            this.f2927e = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void flush() {
        if (this.f2891c > 0) {
            g();
        }
    }

    public final void g() {
        this.f2927e.write(this.f2889a, 0, this.f2891c);
        this.f2891c = 0;
    }

    public final void h(int i6) {
        if (this.f2890b - this.f2891c < i6) {
            g();
        }
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(byte b10) {
        if (this.f2891c == this.f2890b) {
            g();
        }
        a(b10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeBool(int i6, boolean z10) {
        h(11);
        d(i6, 0);
        a(z10 ? (byte) 1 : (byte) 0);
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
        h(14);
        d(i6, 5);
        b(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed32NoTag(int i6) {
        h(4);
        b(i6);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64(int i6, long j) {
        h(18);
        d(i6, 1);
        c(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeFixed64NoTag(long j) {
        h(8);
        c(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32(int i6, int i10) {
        h(20);
        d(i6, 0);
        if (i10 >= 0) {
            e(i10);
        } else {
            f(i10);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeInt32NoTag(int i6) {
        if (i6 >= 0) {
            writeUInt32NoTag(i6);
        } else {
            writeUInt64NoTag(i6);
        }
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
        int e10;
        try {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i6 = computeUInt32SizeNoTag + length;
            int i10 = this.f2890b;
            if (i6 > i10) {
                byte[] bArr = new byte[length];
                int f3 = t4.f3054a.f(str, bArr, 0, length);
                writeUInt32NoTag(f3);
                write(bArr, 0, f3);
                return;
            }
            if (i6 > i10 - this.f2891c) {
                g();
            }
            int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
            int i11 = this.f2891c;
            byte[] bArr2 = this.f2889a;
            try {
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i12 = i11 + computeUInt32SizeNoTag2;
                        this.f2891c = i12;
                        int f10 = t4.f3054a.f(str, bArr2, i12, i10 - i12);
                        this.f2891c = i11;
                        e10 = (f10 - i11) - computeUInt32SizeNoTag2;
                        e(e10);
                        this.f2891c = f10;
                    } else {
                        e10 = t4.e(str);
                        e(e10);
                        this.f2891c = t4.f3054a.f(str, bArr2, this.f2891c, e10);
                    }
                    this.f2892d += e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new CodedOutputStream.OutOfSpaceException(e11);
                }
            } catch (r4 e12) {
                this.f2892d -= this.f2891c - i11;
                this.f2891c = i11;
                throw e12;
            }
        } catch (r4 e13) {
            inefficientWriteStringNoTag(str, e13);
        }
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeTag(int i6, int i10) {
        writeUInt32NoTag(WireFormat.makeTag(i6, i10));
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32(int i6, int i10) {
        h(20);
        d(i6, 0);
        e(i10);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt32NoTag(int i6) {
        h(5);
        e(i6);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64(int i6, long j) {
        h(20);
        d(i6, 0);
        f(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeUInt64NoTag(long j) {
        h(10);
        f(j);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final void writeByteArray(int i6, byte[] bArr, int i10, int i11) {
        writeTag(i6, 2);
        writeByteArrayNoTag(bArr, i10, i11);
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
        int i11 = this.f2891c;
        int i12 = this.f2890b;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f2889a;
        if (i13 >= i10) {
            System.arraycopy(bArr, i6, bArr2, i11, i10);
            this.f2891c += i10;
            this.f2892d += i10;
            return;
        }
        int i14 = i12 - i11;
        System.arraycopy(bArr, i6, bArr2, i11, i14);
        int i15 = i6 + i14;
        int i16 = i10 - i14;
        this.f2891c = i12;
        this.f2892d += i14;
        g();
        if (i16 <= i12) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f2891c = i16;
        } else {
            this.f2927e.write(bArr, i15, i16);
        }
        this.f2892d += i16;
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public final void write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i6 = this.f2891c;
        int i10 = this.f2890b;
        int i11 = i10 - i6;
        byte[] bArr = this.f2889a;
        if (i11 >= remaining) {
            byteBuffer.get(bArr, i6, remaining);
            this.f2891c += remaining;
            this.f2892d += remaining;
            return;
        }
        int i12 = i10 - i6;
        byteBuffer.get(bArr, i6, i12);
        int i13 = remaining - i12;
        this.f2891c = i10;
        this.f2892d += i12;
        g();
        while (i13 > i10) {
            byteBuffer.get(bArr, 0, i10);
            this.f2927e.write(bArr, 0, i10);
            i13 -= i10;
            this.f2892d += i10;
        }
        byteBuffer.get(bArr, 0, i13);
        this.f2891c = i13;
        this.f2892d += i13;
    }
}
