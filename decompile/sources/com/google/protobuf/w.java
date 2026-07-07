package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w extends CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3063a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3064b;

    /* renamed from: c, reason: collision with root package name */
    public int f3065c;

    /* renamed from: d, reason: collision with root package name */
    public int f3066d;

    /* renamed from: e, reason: collision with root package name */
    public int f3067e;

    /* renamed from: f, reason: collision with root package name */
    public int f3068f;

    /* renamed from: g, reason: collision with root package name */
    public int f3069g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3070h;

    /* renamed from: i, reason: collision with root package name */
    public int f3071i;

    public w(byte[] bArr, int i6, int i10, boolean z10) {
        super();
        this.f3071i = Integer.MAX_VALUE;
        this.f3063a = bArr;
        this.f3065c = i10 + i6;
        this.f3067e = i6;
        this.f3068f = i6;
        this.f3064b = z10;
    }

    public final void a() {
        int i6 = this.f3065c + this.f3066d;
        this.f3065c = i6;
        int i10 = i6 - this.f3068f;
        int i11 = this.f3071i;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f3066d = i12;
            this.f3065c = i6 - i12;
            return;
        }
        this.f3066d = 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i6) {
        if (this.f3069g == i6) {
        } else {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z10) {
        this.f3070h = z10;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i6 = this.f3071i;
        if (i6 == Integer.MAX_VALUE) {
            return -1;
        }
        return i6 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f3069g;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.f3067e - this.f3068f;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        if (this.f3067e == this.f3065c) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i6) {
        this.f3071i = i6;
        a();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i6) {
        if (i6 >= 0) {
            int totalBytesRead = getTotalBytesRead() + i6;
            if (totalBytesRead >= 0) {
                int i10 = this.f3071i;
                if (totalBytesRead <= i10) {
                    this.f3071i = totalBytesRead;
                    a();
                    return i10;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.parseFailure();
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
        ByteBuffer wrap;
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            int i6 = this.f3065c;
            int i10 = this.f3067e;
            if (readRawVarint32 <= i6 - i10) {
                boolean z10 = this.f3064b;
                byte[] bArr = this.f3063a;
                if (!z10 && this.f3070h) {
                    wrap = ByteBuffer.wrap(bArr, i10, readRawVarint32).slice();
                } else {
                    wrap = ByteBuffer.wrap(Arrays.copyOfRange(bArr, i10, i10 + readRawVarint32));
                }
                this.f3067e += readRawVarint32;
                return wrap;
            }
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
        ByteString copyFrom;
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > 0) {
            int i6 = this.f3065c;
            int i10 = this.f3067e;
            if (readRawVarint32 <= i6 - i10) {
                boolean z10 = this.f3064b;
                byte[] bArr = this.f3063a;
                if (z10 && this.f3070h) {
                    copyFrom = ByteString.wrap(bArr, i10, readRawVarint32);
                } else {
                    copyFrom = ByteString.copyFrom(bArr, i10, readRawVarint32);
                }
                this.f3067e += readRawVarint32;
                return copyFrom;
            }
        }
        if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        return ByteString.wrap(readRawBytes(readRawVarint32));
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
        int i6 = this.f3067e;
        if (i6 != this.f3065c) {
            this.f3067e = i6 + 1;
            return this.f3063a[i6];
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i6) {
        if (i6 > 0) {
            int i10 = this.f3065c;
            int i11 = this.f3067e;
            if (i6 <= i10 - i11) {
                int i12 = i6 + i11;
                this.f3067e = i12;
                return Arrays.copyOfRange(this.f3063a, i11, i12);
            }
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
        int i6 = this.f3067e;
        if (this.f3065c - i6 >= 4) {
            this.f3067e = i6 + 4;
            byte[] bArr = this.f3063a;
            return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        int i6 = this.f3067e;
        if (this.f3065c - i6 >= 8) {
            this.f3067e = i6 + 8;
            byte[] bArr = this.f3063a;
            return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i6;
        int i10 = this.f3067e;
        int i11 = this.f3065c;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f3063a;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f3067e = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i6 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i6 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i6 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i6 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i6 = i19;
                            }
                            i6 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f3067e = i13;
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
        long j12;
        int i6 = this.f3067e;
        int i10 = this.f3065c;
        if (i10 != i6) {
            int i11 = i6 + 1;
            byte[] bArr = this.f3063a;
            byte b10 = bArr[i6];
            if (b10 >= 0) {
                this.f3067e = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i6 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i6 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i6 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j12 = (-2080896) ^ i17;
                        } else {
                            long j13 = i17;
                            i12 = i6 + 5;
                            long j14 = j13 ^ (bArr[i16] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i16 = i6 + 6;
                                long j15 = j14 ^ (bArr[i12] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i6 + 7;
                                    j14 = j15 ^ (bArr[i16] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i16 = i6 + 8;
                                        j15 = j14 ^ (bArr[i12] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i6 + 9;
                                            long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i18 = i6 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j = j11 ^ j14;
                        }
                        i12 = i16;
                        j = j12;
                    }
                }
                this.f3067e = i12;
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
        if (readRawVarint32 > 0) {
            int i6 = this.f3065c;
            int i10 = this.f3067e;
            if (readRawVarint32 <= i6 - i10) {
                String str = new String(this.f3063a, i10, readRawVarint32, Internal.UTF_8);
                this.f3067e += readRawVarint32;
                return str;
            }
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
        if (readRawVarint32 > 0) {
            int i6 = this.f3065c;
            int i10 = this.f3067e;
            if (readRawVarint32 <= i6 - i10) {
                String d10 = t4.f3054a.d(this.f3063a, i10, readRawVarint32);
                this.f3067e += readRawVarint32;
                return d10;
            }
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
            this.f3069g = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.f3069g = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.f3069g;
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
        this.f3068f = this.f3067e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i6) {
        int tagWireType = WireFormat.getTagWireType(i6);
        int i10 = 0;
        if (tagWireType == 0) {
            if (this.f3065c - this.f3067e >= 10) {
                while (i10 < 10) {
                    int i11 = this.f3067e;
                    this.f3067e = i11 + 1;
                    if (this.f3063a[i11] < 0) {
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
        if (i6 >= 0) {
            int i10 = this.f3065c;
            int i11 = this.f3067e;
            if (i6 <= i10 - i11) {
                this.f3067e = i11 + i6;
                return;
            }
        }
        if (i6 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
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
