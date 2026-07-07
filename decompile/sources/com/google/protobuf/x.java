package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f3090a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f3091b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f3092c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3093d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3094e;

    /* renamed from: f, reason: collision with root package name */
    public int f3095f;

    /* renamed from: g, reason: collision with root package name */
    public int f3096g;

    /* renamed from: h, reason: collision with root package name */
    public int f3097h;

    /* renamed from: i, reason: collision with root package name */
    public int f3098i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f3099k;

    /* renamed from: l, reason: collision with root package name */
    public long f3100l;

    /* renamed from: m, reason: collision with root package name */
    public long f3101m;

    /* renamed from: n, reason: collision with root package name */
    public long f3102n;

    /* renamed from: o, reason: collision with root package name */
    public long f3103o;

    public x(Iterable iterable, int i6, boolean z10) {
        super();
        this.f3097h = Integer.MAX_VALUE;
        this.f3095f = i6;
        this.f3090a = iterable;
        this.f3091b = iterable.iterator();
        this.f3093d = z10;
        this.j = 0;
        this.f3099k = 0;
        if (i6 == 0) {
            this.f3092c = Internal.EMPTY_BYTE_BUFFER;
            this.f3100l = 0L;
            this.f3101m = 0L;
            this.f3103o = 0L;
            this.f3102n = 0L;
            return;
        }
        g();
    }

    public final long a() {
        return this.f3103o - this.f3100l;
    }

    public final void b() {
        if (this.f3091b.hasNext()) {
            g();
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public final void c(int i6, byte[] bArr) {
        if (i6 >= 0 && i6 <= e()) {
            int i10 = i6;
            while (i10 > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i10, (int) a());
                long j = min;
                q4.g(this.f3100l, bArr, i6 - i10, j);
                i10 -= min;
                this.f3100l += j;
            }
            return;
        }
        if (i6 <= 0) {
            if (i6 == 0) {
                return;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void checkLastTagWas(int i6) {
        if (this.f3098i == i6) {
        } else {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void d() {
        int i6 = this.f3095f + this.f3096g;
        this.f3095f = i6;
        int i10 = i6 - this.f3099k;
        int i11 = this.f3097h;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f3096g = i12;
            this.f3095f = i6 - i12;
            return;
        }
        this.f3096g = 0;
    }

    public final int e() {
        return (int) (((this.f3095f - this.j) - this.f3100l) + this.f3101m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void enableAliasing(boolean z10) {
        this.f3094e = z10;
    }

    public final ByteBuffer f(int i6, int i10) {
        int position = this.f3092c.position();
        int limit = this.f3092c.limit();
        ByteBuffer byteBuffer = this.f3092c;
        try {
            try {
                byteBuffer.position(i6);
                byteBuffer.limit(i10);
                return this.f3092c.slice();
            } catch (IllegalArgumentException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } finally {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
        }
    }

    public final void g() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f3091b.next();
        this.f3092c = byteBuffer;
        this.j += (int) (this.f3100l - this.f3101m);
        long position = byteBuffer.position();
        this.f3100l = position;
        this.f3101m = position;
        this.f3103o = this.f3092c.limit();
        long b10 = q4.b(this.f3092c);
        this.f3102n = b10;
        this.f3100l += b10;
        this.f3101m += b10;
        this.f3103o += b10;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getBytesUntilLimit() {
        int i6 = this.f3097h;
        if (i6 == Integer.MAX_VALUE) {
            return -1;
        }
        return i6 - getTotalBytesRead();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getLastTag() {
        return this.f3098i;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int getTotalBytesRead() {
        return (int) (((this.j - this.f3099k) + this.f3100l) - this.f3101m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean isAtEnd() {
        if ((this.j + this.f3100l) - this.f3101m == this.f3095f) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void popLimit(int i6) {
        this.f3097h = i6;
        d();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int pushLimit(int i6) {
        if (i6 >= 0) {
            int totalBytesRead = getTotalBytesRead() + i6;
            int i10 = this.f3097h;
            if (totalBytesRead <= i10) {
                this.f3097h = totalBytesRead;
                d();
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
        if (readRawVarint32 > 0) {
            long j = readRawVarint32;
            if (j <= a()) {
                if (!this.f3093d && this.f3094e) {
                    long j10 = this.f3100l + j;
                    this.f3100l = j10;
                    long j11 = j10 - this.f3102n;
                    return f((int) (j11 - j), (int) j11);
                }
                byte[] bArr = new byte[readRawVarint32];
                q4.g(this.f3100l, bArr, 0L, j);
                this.f3100l += j;
                return ByteBuffer.wrap(bArr);
            }
        }
        if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
            byte[] bArr2 = new byte[readRawVarint32];
            c(readRawVarint32, bArr2);
            return ByteBuffer.wrap(bArr2);
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
        boolean z10 = this.f3093d;
        if (readRawVarint32 > 0) {
            long j = readRawVarint32;
            long j10 = this.f3103o;
            long j11 = this.f3100l;
            if (j <= j10 - j11) {
                if (z10 && this.f3094e) {
                    int i6 = (int) (j11 - this.f3102n);
                    ByteString wrap = ByteString.wrap(f(i6, readRawVarint32 + i6));
                    this.f3100l += j;
                    return wrap;
                }
                byte[] bArr = new byte[readRawVarint32];
                q4.g(j11, bArr, 0L, j);
                this.f3100l += j;
                return ByteString.wrap(bArr);
            }
        }
        if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
            if (z10 && this.f3094e) {
                ArrayList arrayList = new ArrayList();
                while (readRawVarint32 > 0) {
                    if (a() == 0) {
                        b();
                    }
                    int min = Math.min(readRawVarint32, (int) a());
                    int i10 = (int) (this.f3100l - this.f3102n);
                    arrayList.add(ByteString.wrap(f(i10, i10 + min)));
                    readRawVarint32 -= min;
                    this.f3100l += min;
                }
                return ByteString.copyFrom(arrayList);
            }
            byte[] bArr2 = new byte[readRawVarint32];
            c(readRawVarint32, bArr2);
            return ByteString.wrap(bArr2);
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
        if (a() == 0) {
            b();
        }
        long j = this.f3100l;
        this.f3100l = 1 + j;
        return q4.f3024c.f(j);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final byte[] readRawBytes(int i6) {
        if (i6 >= 0) {
            long j = i6;
            if (j <= a()) {
                byte[] bArr = new byte[i6];
                q4.g(this.f3100l, bArr, 0L, j);
                this.f3100l += j;
                return bArr;
            }
        }
        if (i6 >= 0 && i6 <= e()) {
            byte[] bArr2 = new byte[i6];
            c(i6, bArr2);
            return bArr2;
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
        if (a() >= 4) {
            long j = this.f3100l;
            this.f3100l = 4 + j;
            p4 p4Var = q4.f3024c;
            return ((p4Var.f(j + 3) & 255) << 24) | (p4Var.f(j) & 255) | ((p4Var.f(1 + j) & 255) << 8) | ((p4Var.f(2 + j) & 255) << 16);
        }
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long readRawLittleEndian64() {
        if (a() >= 8) {
            this.f3100l = 8 + this.f3100l;
            p4 p4Var = q4.f3024c;
            return ((p4Var.f(r1 + 7) & 255) << 56) | ((p4Var.f(r1 + 1) & 255) << 8) | (p4Var.f(r1) & 255) | ((p4Var.f(2 + r1) & 255) << 16) | ((p4Var.f(3 + r1) & 255) << 24) | ((p4Var.f(4 + r1) & 255) << 32) | ((p4Var.f(5 + r1) & 255) << 40) | ((p4Var.f(6 + r1) & 255) << 48);
        }
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int readRawVarint32() {
        int i6;
        long j = this.f3100l;
        if (this.f3103o != j) {
            long j10 = j + 1;
            p4 p4Var = q4.f3024c;
            byte f3 = p4Var.f(j);
            if (f3 >= 0) {
                this.f3100l++;
                return f3;
            }
            if (this.f3103o - this.f3100l >= 10) {
                long j11 = 2 + j;
                int f10 = (p4Var.f(j10) << 7) ^ f3;
                if (f10 < 0) {
                    i6 = f10 ^ (-128);
                } else {
                    long j12 = 3 + j;
                    int f11 = (p4Var.f(j11) << 14) ^ f10;
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
                                            j12 = 9 + j;
                                            if (p4Var.f(j13) < 0) {
                                                long j14 = j + 10;
                                                if (p4Var.f(j12) >= 0) {
                                                    i6 = i10;
                                                    j11 = j14;
                                                }
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
                this.f3100l = j11;
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
        long j12 = this.f3100l;
        if (this.f3103o != j12) {
            long j13 = j12 + 1;
            p4 p4Var = q4.f3024c;
            byte f3 = p4Var.f(j12);
            if (f3 >= 0) {
                this.f3100l++;
                return f3;
            }
            if (this.f3103o - this.f3100l >= 10) {
                long j14 = 2 + j12;
                int f10 = (p4Var.f(j13) << 7) ^ f3;
                if (f10 < 0) {
                    j = f10 ^ (-128);
                } else {
                    long j15 = 3 + j12;
                    int f11 = (p4Var.f(j14) << 14) ^ f10;
                    if (f11 >= 0) {
                        j = f11 ^ 16256;
                    } else {
                        long j16 = 4 + j12;
                        int f12 = f11 ^ (p4Var.f(j15) << 21);
                        if (f12 < 0) {
                            j = (-2080896) ^ f12;
                            j14 = j16;
                        } else {
                            long j17 = 5 + j12;
                            long f13 = (p4Var.f(j16) << 28) ^ f12;
                            if (f13 >= 0) {
                                j11 = 266354560;
                            } else {
                                j15 = 6 + j12;
                                long f14 = f13 ^ (p4Var.f(j17) << 35);
                                if (f14 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j17 = 7 + j12;
                                    f13 = f14 ^ (p4Var.f(j15) << 42);
                                    if (f13 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j15 = 8 + j12;
                                        f14 = f13 ^ (p4Var.f(j17) << 49);
                                        if (f14 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j17 = 9 + j12;
                                            long f15 = (f14 ^ (p4Var.f(j15) << 56)) ^ 71499008037633920L;
                                            if (f15 < 0) {
                                                long j18 = j12 + 10;
                                                if (p4Var.f(j17) >= 0) {
                                                    j14 = j18;
                                                    j = f15;
                                                }
                                            } else {
                                                j = f15;
                                                j14 = j17;
                                            }
                                        }
                                    }
                                }
                                j = j10 ^ f14;
                            }
                            j = j11 ^ f13;
                            j14 = j17;
                        }
                    }
                    j14 = j15;
                }
                this.f3100l = j14;
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
            long j = readRawVarint32;
            long j10 = this.f3103o;
            long j11 = this.f3100l;
            if (j <= j10 - j11) {
                byte[] bArr = new byte[readRawVarint32];
                q4.g(j11, bArr, 0L, j);
                String str = new String(bArr, Internal.UTF_8);
                this.f3100l += j;
                return str;
            }
        }
        if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
            byte[] bArr2 = new byte[readRawVarint32];
            c(readRawVarint32, bArr2);
            return new String(bArr2, Internal.UTF_8);
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
            long j = readRawVarint32;
            long j10 = this.f3103o;
            long j11 = this.f3100l;
            if (j <= j10 - j11) {
                String c10 = t4.c(this.f3092c, (int) (j11 - this.f3101m), readRawVarint32);
                this.f3100l += j;
                return c10;
            }
        }
        if (readRawVarint32 >= 0 && readRawVarint32 <= e()) {
            byte[] bArr = new byte[readRawVarint32];
            c(readRawVarint32, bArr);
            return t4.f3054a.d(bArr, 0, readRawVarint32);
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
            this.f3098i = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.f3098i = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.f3098i;
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
        this.f3099k = (int) ((this.j + this.f3100l) - this.f3101m);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean skipField(int i6) {
        int tagWireType = WireFormat.getTagWireType(i6);
        if (tagWireType == 0) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
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
        if (i6 >= 0 && i6 <= ((this.f3095f - this.j) - this.f3100l) + this.f3101m) {
            while (i6 > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i6, (int) a());
                i6 -= min;
                this.f3100l += min;
            }
            return;
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
