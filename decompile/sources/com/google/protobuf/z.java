package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z extends CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f3125a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3126b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3127c;

    /* renamed from: d, reason: collision with root package name */
    public long f3128d;

    /* renamed from: e, reason: collision with root package name */
    public long f3129e;

    /* renamed from: f, reason: collision with root package name */
    public long f3130f;

    /* renamed from: g, reason: collision with root package name */
    public int f3131g;

    /* renamed from: h, reason: collision with root package name */
    public int f3132h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3133i;
    public int j;

    public z(ByteBuffer byteBuffer, boolean z10) {
        super();
        this.j = Integer.MAX_VALUE;
        this.f3125a = byteBuffer;
        long b10 = q4.b(byteBuffer);
        this.f3127c = b10;
        this.f3128d = byteBuffer.limit() + b10;
        long position = b10 + byteBuffer.position();
        this.f3129e = position;
        this.f3130f = position;
        this.f3126b = z10;
    }

    public final void a() {
        long j = this.f3128d + this.f3131g;
        this.f3128d = j;
        int i6 = (int) (j - this.f3130f);
        int i10 = this.j;
        if (i6 > i10) {
            int i11 = i6 - i10;
            this.f3131g = i11;
            this.f3128d = j - i11;
            return;
        }
        this.f3131g = 0;
    }

    public final int b() {
        return (int) (this.f3128d - this.f3129e);
    }

    public final ByteBuffer c(long j, long j10) {
        long j11 = this.f3127c;
        ByteBuffer byteBuffer = this.f3125a;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            try {
                byteBuffer.position((int) (j - j11));
                byteBuffer.limit((int) (j10 - j11));
                return byteBuffer.slice();
            } catch (IllegalArgumentException e10) {
                InvalidProtocolBufferException truncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                truncatedMessage.initCause(e10);
                throw truncatedMessage;
            }
        } finally {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i6) {
        if (this.f3132h == i6) {
        } else {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z10) {
        this.f3133i = z10;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i6 = this.j;
        if (i6 == Integer.MAX_VALUE) {
            return -1;
        }
        return i6 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f3132h;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int) (this.f3129e - this.f3130f);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        if (this.f3129e == this.f3128d) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i6) {
        this.j = i6;
        a();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i6) {
        if (i6 >= 0) {
            int totalBytesRead = getTotalBytesRead() + i6;
            int i10 = this.j;
            if (totalBytesRead <= i10) {
                this.j = totalBytesRead;
                a();
                return i10;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean readBool() {
        if (readRawVarint64() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readByteArray() {
        return readRawBytes(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= b()) {
            if (!this.f3126b && this.f3133i) {
                long j = this.f3129e;
                long j10 = readRawVarint32;
                ByteBuffer c10 = c(j, j + j10);
                this.f3129e += j10;
                return c10;
            }
            byte[] bArr = new byte[readRawVarint32];
            long j11 = readRawVarint32;
            q4.g(this.f3129e, bArr, 0L, j11);
            this.f3129e += j11;
            return ByteBuffer.wrap(bArr);
        }
        if (readRawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (readRawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= b()) {
            if (this.f3126b && this.f3133i) {
                long j = this.f3129e;
                long j10 = readRawVarint32;
                ByteBuffer c10 = c(j, j + j10);
                this.f3129e += j10;
                return ByteString.wrap(c10);
            }
            byte[] bArr = new byte[readRawVarint32];
            long j11 = readRawVarint32;
            q4.g(this.f3129e, bArr, 0L, j11);
            this.f3129e += j11;
            return ByteString.wrap(bArr);
        }
        if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        if (readRawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readEnum() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readGroup(int i6, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        checkRecursionLimit();
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i6, 4));
        this.recursionDepth--;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte readRawByte() {
        long j = this.f3129e;
        if (j != this.f3128d) {
            this.f3129e = 1 + j;
            return q4.f3024c.f(j);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i6) {
        if (i6 >= 0 && i6 <= b()) {
            byte[] bArr = new byte[i6];
            long j = this.f3129e;
            long j10 = i6;
            c(j, j + j10).get(bArr);
            this.f3129e += j10;
            return bArr;
        }
        if (i6 <= 0) {
            if (i6 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() {
        long j = this.f3129e;
        if (this.f3128d - j >= 4) {
            this.f3129e = 4 + j;
            p4 p4Var = q4.f3024c;
            return ((p4Var.f(j + 3) & 255) << 24) | (p4Var.f(j) & 255) | ((p4Var.f(1 + j) & 255) << 8) | ((p4Var.f(2 + j) & 255) << 16);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        long j = this.f3129e;
        if (this.f3128d - j >= 8) {
            this.f3129e = 8 + j;
            p4 p4Var = q4.f3024c;
            return ((p4Var.f(j + 7) & 255) << 56) | (p4Var.f(j) & 255) | ((p4Var.f(1 + j) & 255) << 8) | ((p4Var.f(2 + j) & 255) << 16) | ((p4Var.f(3 + j) & 255) << 24) | ((p4Var.f(4 + j) & 255) << 32) | ((p4Var.f(5 + j) & 255) << 40) | ((p4Var.f(6 + j) & 255) << 48);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i6;
        long j = this.f3129e;
        if (this.f3128d != j) {
            long j10 = 1 + j;
            p4 p4Var = q4.f3024c;
            byte f3 = p4Var.f(j);
            if (f3 >= 0) {
                this.f3129e = j10;
                return f3;
            }
            if (this.f3128d - j10 >= 9) {
                long j11 = 2 + j;
                int f10 = (p4Var.f(j10) << 7) ^ f3;
                if (f10 < 0) {
                    i6 = f10 ^ (-128);
                } else {
                    long j12 = 3 + j;
                    int f11 = f10 ^ (p4Var.f(j11) << 14);
                    if (f11 >= 0) {
                        i6 = f11 ^ 16256;
                    } else {
                        long j13 = 4 + j;
                        int f12 = f11 ^ (p4Var.f(j12) << 21);
                        if (f12 < 0) {
                            i6 = (-2080896) ^ f12;
                        } else {
                            j12 = 5 + j;
                            byte f13 = p4Var.f(j13);
                            int i10 = (f12 ^ (f13 << 28)) ^ 266354560;
                            if (f13 < 0) {
                                j13 = 6 + j;
                                if (p4Var.f(j12) < 0) {
                                    j12 = 7 + j;
                                    if (p4Var.f(j13) < 0) {
                                        j13 = 8 + j;
                                        if (p4Var.f(j12) < 0) {
                                            long j14 = 9 + j;
                                            if (p4Var.f(j13) < 0) {
                                                long j15 = j + 10;
                                                if (p4Var.f(j14) >= 0) {
                                                    j11 = j15;
                                                    i6 = i10;
                                                }
                                            } else {
                                                i6 = i10;
                                                j11 = j14;
                                            }
                                        }
                                    }
                                }
                                i6 = i10;
                            }
                            i6 = i10;
                        }
                        j11 = j13;
                    }
                    j11 = j12;
                }
                this.f3129e = j11;
                return i6;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64() {
        long j;
        long j10;
        long j11;
        long j12 = this.f3129e;
        if (this.f3128d != j12) {
            long j13 = 1 + j12;
            p4 p4Var = q4.f3024c;
            byte f3 = p4Var.f(j12);
            if (f3 >= 0) {
                this.f3129e = j13;
                return f3;
            }
            if (this.f3128d - j13 >= 9) {
                long j14 = 2 + j12;
                int f10 = (p4Var.f(j13) << 7) ^ f3;
                if (f10 < 0) {
                    j = f10 ^ (-128);
                } else {
                    long j15 = 3 + j12;
                    int f11 = f10 ^ (p4Var.f(j14) << 14);
                    if (f11 >= 0) {
                        j = f11 ^ 16256;
                    } else {
                        long j16 = 4 + j12;
                        int f12 = f11 ^ (p4Var.f(j15) << 21);
                        if (f12 < 0) {
                            j = (-2080896) ^ f12;
                            j14 = j16;
                        } else {
                            j15 = 5 + j12;
                            long f13 = f12 ^ (p4Var.f(j16) << 28);
                            if (f13 >= 0) {
                                j11 = 266354560;
                            } else {
                                long j17 = 6 + j12;
                                long f14 = f13 ^ (p4Var.f(j15) << 35);
                                if (f14 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = 7 + j12;
                                    f13 = f14 ^ (p4Var.f(j17) << 42);
                                    if (f13 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j17 = 8 + j12;
                                        f14 = f13 ^ (p4Var.f(j15) << 49);
                                        if (f14 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            long j18 = 9 + j12;
                                            long f15 = (f14 ^ (p4Var.f(j17) << 56)) ^ 71499008037633920L;
                                            if (f15 < 0) {
                                                long j19 = j12 + 10;
                                                if (p4Var.f(j18) >= 0) {
                                                    j14 = j19;
                                                    j = f15;
                                                }
                                            } else {
                                                j = f15;
                                                j14 = j18;
                                            }
                                        }
                                    }
                                }
                                j = j10 ^ f14;
                                j14 = j17;
                            }
                            j = j11 ^ f13;
                        }
                    }
                    j14 = j15;
                }
                this.f3129e = j14;
                return j;
            }
        }
        return readRawVarint64SlowPath();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawVarint64SlowPath() {
        long j = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i6;
            if ((readRawByte() & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSFixed32() {
        return readRawLittleEndian32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSFixed64() {
        return readRawLittleEndian64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readSInt32() {
        return CodedInputStream.decodeZigZag32(readRawVarint32());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readSInt64() {
        return CodedInputStream.decodeZigZag64(readRawVarint64());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readString() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= b()) {
            byte[] bArr = new byte[readRawVarint32];
            long j = readRawVarint32;
            q4.g(this.f3129e, bArr, 0L, j);
            String str = new String(bArr, Internal.UTF_8);
            this.f3129e += j;
            return str;
        }
        if (readRawVarint32 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (readRawVarint32 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0 && readRawVarint32 <= b()) {
            String c10 = t4.c(this.f3125a, (int) (this.f3129e - this.f3127c), readRawVarint32);
            this.f3129e += readRawVarint32;
            return c10;
        }
        if (readRawVarint32 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (readRawVarint32 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readTag() {
        if (isAtEnd()) {
            this.f3132h = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.f3132h = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.f3132h;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readUInt32() {
        return readRawVarint32();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readUInt64() {
        return readRawVarint64();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void readUnknownGroup(int i6, MessageLite.Builder builder) {
        readGroup(i6, builder, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void resetSizeCounter() {
        this.f3130f = this.f3129e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i6) {
        int tagWireType = WireFormat.getTagWireType(i6);
        int i10 = 0;
        if (tagWireType == 0) {
            if (b() >= 10) {
                while (i10 < 10) {
                    long j = this.f3129e;
                    this.f3129e = 1 + j;
                    if (q4.f3024c.f(j) < 0) {
                        i10++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
            }
            while (i10 < 10) {
                if (readRawByte() < 0) {
                    i10++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
            return true;
        }
        if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i6), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            skipRawBytes(4);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void skipRawBytes(int i6) {
        if (i6 >= 0 && i6 <= b()) {
            this.f3129e += i6;
        } else {
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readGroup(int i6, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
        checkRecursionLimit();
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i6, 4));
        this.recursionDepth--;
        return messageLite;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        if (getBytesUntilLimit() == 0) {
            popLimit(pushLimit);
            return messageLite;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i6, CodedOutputStream codedOutputStream) {
        int tagWireType = WireFormat.getTagWireType(i6);
        if (tagWireType == 0) {
            long readRawVarint64 = readRawVarint64();
            codedOutputStream.writeUInt32NoTag(i6);
            codedOutputStream.writeUInt64NoTag(readRawVarint64);
            return true;
        }
        if (tagWireType == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeUInt32NoTag(i6);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString readBytes = readBytes();
            codedOutputStream.writeUInt32NoTag(i6);
            codedOutputStream.writeBytesNoTag(readBytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeUInt32NoTag(i6);
            skipMessage(codedOutputStream);
            int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i6), 4);
            checkLastTagWas(makeTag);
            codedOutputStream.writeUInt32NoTag(makeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            int readRawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeUInt32NoTag(i6);
            codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
