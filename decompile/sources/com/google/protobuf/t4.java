package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class t4 {

    /* renamed from: a, reason: collision with root package name */
    public static final s4 f3054a;

    static {
        s4 s4Var;
        if (q4.f3026e && q4.f3025d && !c.a()) {
            s4Var = new s4(0);
        } else {
            s4Var = new s4(1);
        }
        f3054a = s4Var;
    }

    public static int a(byte[] bArr, int i6, int i10) {
        byte b10 = bArr[i6 - 1];
        int i11 = i10 - i6;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return g(b10, bArr[i6], bArr[i6 + 1]);
                }
                throw new AssertionError();
            }
            return f(b10, bArr[i6]);
        }
        if (b10 > -12) {
            return -1;
        }
        return b10;
    }

    public static int b(int i6, int i10, int i11, ByteBuffer byteBuffer) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return g(i6, byteBuffer.get(i10), byteBuffer.get(i10 + 1));
                }
                throw new AssertionError();
            }
            return f(i6, byteBuffer.get(i10));
        }
        if (i6 > -12) {
            return -1;
        }
        return i6;
    }

    public static String c(ByteBuffer byteBuffer, int i6, int i10) {
        long j;
        byte f3;
        byte f10;
        s4 s4Var = f3054a;
        s4Var.getClass();
        if (byteBuffer.hasArray()) {
            return s4Var.d(byteBuffer.array(), byteBuffer.arrayOffset() + i6, i10);
        }
        if (byteBuffer.isDirect()) {
            switch (s4Var.f3048a) {
                case 0:
                    if ((i6 | i10 | ((byteBuffer.limit() - i6) - i10)) >= 0) {
                        long b10 = q4.b(byteBuffer) + i6;
                        long j10 = i10 + b10;
                        char[] cArr = new char[i10];
                        int i11 = 0;
                        while (true) {
                            j = 1;
                            if (b10 < j10 && (f10 = q4.f3024c.f(b10)) >= 0) {
                                b10++;
                                cArr[i11] = (char) f10;
                                i11++;
                            }
                        }
                        int i12 = i11;
                        while (b10 < j10) {
                            long j11 = b10 + j;
                            p4 p4Var = q4.f3024c;
                            byte f11 = p4Var.f(b10);
                            if (f11 >= 0) {
                                int i13 = i12 + 1;
                                cArr[i12] = (char) f11;
                                while (j11 < j10 && (f3 = q4.f3024c.f(j11)) >= 0) {
                                    j11 += j;
                                    cArr[i13] = (char) f3;
                                    i13++;
                                }
                                i12 = i13;
                                b10 = j11;
                            } else if (f11 < -32) {
                                if (j11 < j10) {
                                    b10 += 2;
                                    s4.b(f11, p4Var.f(j11), cArr, i12);
                                    i12++;
                                } else {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                            } else if (f11 < -16) {
                                if (j11 < j10 - j) {
                                    long j12 = 2 + b10;
                                    b10 += 3;
                                    s4.c(f11, p4Var.f(j11), p4Var.f(j12), cArr, i12);
                                    i12++;
                                } else {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                            } else if (j11 < j10 - 2) {
                                byte f12 = p4Var.f(j11);
                                long j13 = b10 + 3;
                                byte f13 = p4Var.f(2 + b10);
                                b10 += 4;
                                s4.a(f11, f12, f13, p4Var.f(j13), cArr, i12);
                                i12 += 2;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                            j = 1;
                        }
                        return new String(cArr, 0, i12);
                    }
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i6), Integer.valueOf(i10)));
                default:
                    return s4.e(byteBuffer, i6, i10);
            }
        }
        return s4.e(byteBuffer, i6, i10);
    }

    public static void d(String str, ByteBuffer byteBuffer) {
        long j;
        char c10;
        long j10;
        long j11;
        long j12;
        int i6;
        char charAt;
        s4 s4Var = f3054a;
        s4Var.getClass();
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(s4Var.f(str, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            return;
        }
        if (byteBuffer.isDirect()) {
            switch (s4Var.f3048a) {
                case 0:
                    long b10 = q4.b(byteBuffer);
                    long position = byteBuffer.position() + b10;
                    long limit = byteBuffer.limit() + b10;
                    int length = str.length();
                    if (length <= limit - position) {
                        int i10 = 0;
                        while (true) {
                            j = 1;
                            c10 = 128;
                            if (i10 < length && (charAt = str.charAt(i10)) < 128) {
                                q4.m(position, (byte) charAt);
                                i10++;
                                position = 1 + position;
                            }
                        }
                        if (i10 == length) {
                            byteBuffer.position((int) (position - b10));
                            return;
                        }
                        while (i10 < length) {
                            char charAt2 = str.charAt(i10);
                            if (charAt2 < c10 && position < limit) {
                                q4.m(position, (byte) charAt2);
                                j11 = b10;
                                j12 = limit;
                                position += j;
                                j10 = j;
                            } else {
                                j10 = j;
                                if (charAt2 < 2048 && position <= limit - 2) {
                                    long j13 = position + j10;
                                    q4.m(position, (byte) ((charAt2 >>> 6) | 960));
                                    position += 2;
                                    q4.m(j13, (byte) ((charAt2 & '?') | 128));
                                    j11 = b10;
                                    j12 = limit;
                                } else {
                                    if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                                        j11 = b10;
                                        j12 = limit;
                                        if (position <= j12 - 4) {
                                            int i11 = i10 + 1;
                                            if (i11 != length) {
                                                char charAt3 = str.charAt(i11);
                                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                                    q4.m(position, (byte) ((codePoint >>> 18) | 240));
                                                    q4.m(position + j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                                    long j14 = position + 3;
                                                    q4.m(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                                    position += 4;
                                                    q4.m(j14, (byte) ((codePoint & 63) | 128));
                                                    i10 = i11;
                                                } else {
                                                    i10 = i11;
                                                }
                                            }
                                            throw new r4(i10 - 1, length);
                                        }
                                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i6 = i10 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i6)))) {
                                            throw new r4(i10, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                                    }
                                    q4.m(position, (byte) ((charAt2 >>> '\f') | 480));
                                    j11 = b10;
                                    long j15 = position + 2;
                                    j12 = limit;
                                    q4.m(position + j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                                    position += 3;
                                    q4.m(j15, (byte) ((charAt2 & '?') | 128));
                                }
                            }
                            i10++;
                            j = j10;
                            b10 = j11;
                            limit = j12;
                            c10 = 128;
                        }
                        byteBuffer.position((int) (position - b10));
                        return;
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
                default:
                    s4.g(str, byteBuffer);
                    return;
            }
        }
        s4.g(str, byteBuffer);
    }

    public static int e(String str) {
        int length = str.length();
        int i6 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i6 += (127 - charAt2) >>> 31;
                    } else {
                        i6 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new r4(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i6;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int f(int i6, int i10) {
        if (i6 <= -12 && i10 <= -65) {
            return i6 ^ (i10 << 8);
        }
        return -1;
    }

    public static int g(int i6, int i10, int i11) {
        if (i6 <= -12 && i10 <= -65 && i11 <= -65) {
            return (i6 ^ (i10 << 8)) ^ (i11 << 16);
        }
        return -1;
    }
}
