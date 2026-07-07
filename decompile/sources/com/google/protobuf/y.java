package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f3111a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3112b;

    /* renamed from: c, reason: collision with root package name */
    public int f3113c;

    /* renamed from: d, reason: collision with root package name */
    public int f3114d;

    /* renamed from: e, reason: collision with root package name */
    public int f3115e;

    /* renamed from: f, reason: collision with root package name */
    public int f3116f;

    /* renamed from: g, reason: collision with root package name */
    public int f3117g;

    /* renamed from: h, reason: collision with root package name */
    public int f3118h;

    public y(InputStream inputStream, int i6) {
        super();
        this.f3118h = Integer.MAX_VALUE;
        Internal.checkNotNull(inputStream, "input");
        this.f3111a = inputStream;
        this.f3112b = new byte[i6];
        this.f3113c = 0;
        this.f3115e = 0;
        this.f3117g = 0;
    }

    public final byte[] a(int i6, boolean z10) {
        byte[] b10 = b(i6);
        if (b10 != null) {
            if (z10) {
                return (byte[]) b10.clone();
            }
            return b10;
        }
        int i10 = this.f3115e;
        int i11 = this.f3113c;
        int i12 = i11 - i10;
        this.f3117g += i11;
        this.f3115e = 0;
        this.f3113c = 0;
        ArrayList c10 = c(i6 - i12);
        byte[] bArr = new byte[i6];
        System.arraycopy(this.f3112b, i10, bArr, 0, i12);
        int size = c10.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = c10.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] b(int i6) {
        if (i6 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        if (i6 >= 0) {
            int i10 = this.f3117g;
            int i11 = this.f3115e;
            int i12 = i10 + i11 + i6;
            if (i12 - this.sizeLimit <= 0) {
                int i13 = this.f3118h;
                if (i12 <= i13) {
                    int i14 = this.f3113c - i11;
                    int i15 = i6 - i14;
                    InputStream inputStream = this.f3111a;
                    if (i15 >= 4096) {
                        try {
                            if (i15 > inputStream.available()) {
                                return null;
                            }
                        } catch (InvalidProtocolBufferException e10) {
                            e10.setThrownFromInputStream();
                            throw e10;
                        }
                    }
                    byte[] bArr = new byte[i6];
                    System.arraycopy(this.f3112b, this.f3115e, bArr, 0, i14);
                    this.f3117g += this.f3113c;
                    this.f3115e = 0;
                    this.f3113c = 0;
                    while (i14 < i6) {
                        try {
                            int read = inputStream.read(bArr, i14, i6 - i14);
                            if (read != -1) {
                                this.f3117g += read;
                                i14 += read;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        } catch (InvalidProtocolBufferException e11) {
                            e11.setThrownFromInputStream();
                            throw e11;
                        }
                    }
                    return bArr;
                }
                skipRawBytes((i13 - i10) - i11);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public final ArrayList c(int i6) {
        ArrayList arrayList = new ArrayList();
        while (i6 > 0) {
            int min = Math.min(i6, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f3111a.read(bArr, i10, min - i10);
                if (read != -1) {
                    this.f3117g += read;
                    i10 += read;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            }
            i6 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i6) {
        if (this.f3116f == i6) {
        } else {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void d() {
        int i6 = this.f3113c + this.f3114d;
        this.f3113c = i6;
        int i10 = this.f3117g + i6;
        int i11 = this.f3118h;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f3114d = i12;
            this.f3113c = i6 - i12;
            return;
        }
        this.f3114d = 0;
    }

    public final void e(int i6) {
        if (!f(i6)) {
            if (i6 > (this.sizeLimit - this.f3117g) - this.f3115e) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final boolean f(int i6) {
        InputStream inputStream = this.f3111a;
        int i10 = this.f3115e;
        int i11 = i10 + i6;
        int i12 = this.f3113c;
        if (i11 > i12) {
            int i13 = this.sizeLimit;
            int i14 = this.f3117g;
            if (i6 <= (i13 - i14) - i10 && i14 + i10 + i6 <= this.f3118h) {
                byte[] bArr = this.f3112b;
                if (i10 > 0) {
                    if (i12 > i10) {
                        System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                    }
                    this.f3117g += i10;
                    this.f3113c -= i10;
                    this.f3115e = 0;
                }
                int i15 = this.f3113c;
                try {
                    int read = inputStream.read(bArr, i15, Math.min(bArr.length - i15, (this.sizeLimit - this.f3117g) - i15));
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.f3113c += read;
                            d();
                            if (this.f3113c >= i6) {
                                return true;
                            }
                            return f(i6);
                        }
                    } else {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                } catch (InvalidProtocolBufferException e10) {
                    e10.setThrownFromInputStream();
                    throw e10;
                }
            }
            return false;
        }
        throw new IllegalStateException(h8.c.j(i6, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i6 = this.f3118h;
        if (i6 == Integer.MAX_VALUE) {
            return -1;
        }
        return i6 - (this.f3117g + this.f3115e);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f3116f;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return this.f3117g + this.f3115e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        if (this.f3115e == this.f3113c && !f(1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i6) {
        this.f3118h = i6;
        d();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i6) {
        if (i6 >= 0) {
            int i10 = this.f3117g + this.f3115e + i6;
            int i11 = this.f3118h;
            if (i10 <= i11) {
                this.f3118h = i10;
                d();
                return i11;
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
        int readRawVarint32 = readRawVarint32();
        int i6 = this.f3113c;
        int i10 = this.f3115e;
        if (readRawVarint32 <= i6 - i10 && readRawVarint32 > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.f3112b, i10, i10 + readRawVarint32);
            this.f3115e += readRawVarint32;
            return copyOfRange;
        }
        if (readRawVarint32 >= 0) {
            return a(readRawVarint32, false);
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteBuffer readByteBuffer() {
        int readRawVarint32 = readRawVarint32();
        int i6 = this.f3113c;
        int i10 = this.f3115e;
        if (readRawVarint32 <= i6 - i10 && readRawVarint32 > 0) {
            ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f3112b, i10, i10 + readRawVarint32));
            this.f3115e += readRawVarint32;
            return wrap;
        }
        if (readRawVarint32 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (readRawVarint32 >= 0) {
            return ByteBuffer.wrap(a(readRawVarint32, true));
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ByteString readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i6 = this.f3113c;
        int i10 = this.f3115e;
        int i11 = i6 - i10;
        byte[] bArr = this.f3112b;
        if (readRawVarint32 <= i11 && readRawVarint32 > 0) {
            ByteString copyFrom = ByteString.copyFrom(bArr, i10, readRawVarint32);
            this.f3115e += readRawVarint32;
            return copyFrom;
        }
        if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        if (readRawVarint32 >= 0) {
            byte[] b10 = b(readRawVarint32);
            if (b10 != null) {
                return ByteString.copyFrom(b10);
            }
            int i12 = this.f3115e;
            int i13 = this.f3113c;
            int i14 = i13 - i12;
            this.f3117g += i13;
            this.f3115e = 0;
            this.f3113c = 0;
            ArrayList c10 = c(readRawVarint32 - i14);
            byte[] bArr2 = new byte[readRawVarint32];
            System.arraycopy(bArr, i12, bArr2, 0, i14);
            int size = c10.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = c10.get(i15);
                i15++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
                i14 += bArr3.length;
            }
            return ByteString.wrap(bArr2);
        }
        throw InvalidProtocolBufferException.negativeSize();
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
        if (this.f3115e == this.f3113c) {
            e(1);
        }
        int i6 = this.f3115e;
        this.f3115e = i6 + 1;
        return this.f3112b[i6];
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i6) {
        int i10 = this.f3115e;
        if (i6 <= this.f3113c - i10 && i6 > 0) {
            int i11 = i6 + i10;
            this.f3115e = i11;
            return Arrays.copyOfRange(this.f3112b, i10, i11);
        }
        return a(i6, false);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawLittleEndian32() {
        int i6 = this.f3115e;
        if (this.f3113c - i6 < 4) {
            e(4);
            i6 = this.f3115e;
        }
        this.f3115e = i6 + 4;
        byte[] bArr = this.f3112b;
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        int i6 = this.f3115e;
        if (this.f3113c - i6 < 8) {
            e(8);
            i6 = this.f3115e;
        }
        this.f3115e = i6 + 8;
        byte[] bArr = this.f3112b;
        return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i6;
        int i10 = this.f3115e;
        int i11 = this.f3113c;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f3112b;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f3115e = i12;
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
                this.f3115e = i13;
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
        int i6 = this.f3115e;
        int i10 = this.f3113c;
        if (i10 != i6) {
            int i11 = i6 + 1;
            byte[] bArr = this.f3112b;
            byte b10 = bArr[i6];
            if (b10 >= 0) {
                this.f3115e = i11;
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
                this.f3115e = i12;
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
        byte[] bArr = this.f3112b;
        if (readRawVarint32 > 0) {
            int i6 = this.f3113c;
            int i10 = this.f3115e;
            if (readRawVarint32 <= i6 - i10) {
                String str = new String(bArr, i10, readRawVarint32, Internal.UTF_8);
                this.f3115e += readRawVarint32;
                return str;
            }
        }
        if (readRawVarint32 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (readRawVarint32 >= 0) {
            if (readRawVarint32 <= this.f3113c) {
                e(readRawVarint32);
                String str2 = new String(bArr, this.f3115e, readRawVarint32, Internal.UTF_8);
                this.f3115e += readRawVarint32;
                return str2;
            }
            return new String(a(readRawVarint32, false), Internal.UTF_8);
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String readStringRequireUtf8() {
        int readRawVarint32 = readRawVarint32();
        int i6 = this.f3115e;
        int i10 = this.f3113c;
        int i11 = i10 - i6;
        byte[] bArr = this.f3112b;
        if (readRawVarint32 <= i11 && readRawVarint32 > 0) {
            this.f3115e = i6 + readRawVarint32;
        } else {
            if (readRawVarint32 == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (readRawVarint32 >= 0) {
                i6 = 0;
                if (readRawVarint32 <= i10) {
                    e(readRawVarint32);
                    this.f3115e = readRawVarint32;
                } else {
                    bArr = a(readRawVarint32, false);
                }
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }
        return t4.f3054a.d(bArr, i6, readRawVarint32);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readTag() {
        if (isAtEnd()) {
            this.f3116f = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.f3116f = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.f3116f;
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
        this.f3117g = -this.f3115e;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i6) {
        int tagWireType = WireFormat.getTagWireType(i6);
        int i10 = 0;
        if (tagWireType == 0) {
            if (this.f3113c - this.f3115e >= 10) {
                while (i10 < 10) {
                    int i11 = this.f3115e;
                    this.f3115e = i11 + 1;
                    if (this.f3112b[i11] < 0) {
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
        int i10 = this.f3113c;
        int i11 = this.f3115e;
        if (i6 <= i10 - i11 && i6 >= 0) {
            this.f3115e = i11 + i6;
            return;
        }
        InputStream inputStream = this.f3111a;
        if (i6 >= 0) {
            int i12 = this.f3117g;
            int i13 = i12 + i11;
            int i14 = i13 + i6;
            int i15 = this.f3118h;
            if (i14 <= i15) {
                this.f3117g = i13;
                int i16 = i10 - i11;
                this.f3113c = 0;
                this.f3115e = 0;
                while (i16 < i6) {
                    long j = i6 - i16;
                    try {
                        try {
                            long skip = inputStream.skip(j);
                            if (skip >= 0 && skip <= j) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i16 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (InvalidProtocolBufferException e10) {
                            e10.setThrownFromInputStream();
                            throw e10;
                        }
                    } catch (Throwable th) {
                        this.f3117g += i16;
                        d();
                        throw th;
                    }
                }
                this.f3117g += i16;
                d();
                if (i16 < i6) {
                    int i17 = this.f3113c;
                    int i18 = i17 - this.f3115e;
                    this.f3115e = i17;
                    e(1);
                    while (true) {
                        int i19 = i6 - i18;
                        int i20 = this.f3113c;
                        if (i19 > i20) {
                            i18 += i20;
                            this.f3115e = i20;
                            e(1);
                        } else {
                            this.f3115e = i19;
                            return;
                        }
                    }
                }
            } else {
                skipRawBytes((i15 - i12) - i11);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
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

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z10) {
    }
}
