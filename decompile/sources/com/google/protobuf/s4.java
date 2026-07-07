package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: b, reason: collision with root package name */
    public static final v3 f3046b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final w3 f3047c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3048a;

    public /* synthetic */ s4(int i6) {
        this.f3048a = i6;
    }

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i6) {
        if (!i(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !i(b12) && !i(b13)) {
                int i10 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i6] = (char) ((i10 >>> 10) + 55232);
                cArr[i6 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void b(byte b10, byte b11, char[] cArr, int i6) {
        if (b10 >= -62 && !i(b11)) {
            cArr[i6] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void c(byte b10, byte b11, byte b12, char[] cArr, int i6) {
        if (!i(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !i(b12)))) {
            cArr[i6] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
            return;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static String e(ByteBuffer byteBuffer, int i6, int i10) {
        if ((i6 | i10 | ((byteBuffer.limit() - i6) - i10)) >= 0) {
            int i11 = i6 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i6 < i11) {
                byte b10 = byteBuffer.get(i6);
                if (b10 < 0) {
                    break;
                }
                i6++;
                cArr[i12] = (char) b10;
                i12++;
            }
            int i13 = i12;
            while (i6 < i11) {
                int i14 = i6 + 1;
                byte b11 = byteBuffer.get(i6);
                if (b11 >= 0) {
                    int i15 = i13 + 1;
                    cArr[i13] = (char) b11;
                    while (i14 < i11) {
                        byte b12 = byteBuffer.get(i14);
                        if (b12 < 0) {
                            break;
                        }
                        i14++;
                        cArr[i15] = (char) b12;
                        i15++;
                    }
                    i13 = i15;
                    i6 = i14;
                } else if (b11 < -32) {
                    if (i14 < i11) {
                        i6 += 2;
                        b(b11, byteBuffer.get(i14), cArr, i13);
                        i13++;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                } else if (b11 < -16) {
                    if (i14 < i11 - 1) {
                        int i16 = i6 + 2;
                        i6 += 3;
                        c(b11, byteBuffer.get(i14), byteBuffer.get(i16), cArr, i13);
                        i13++;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                } else if (i14 < i11 - 2) {
                    byte b13 = byteBuffer.get(i14);
                    int i17 = i6 + 3;
                    byte b14 = byteBuffer.get(i6 + 2);
                    i6 += 4;
                    a(b11, b13, b14, byteBuffer.get(i17), cArr, i13);
                    i13 += 2;
                } else {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            return new String(cArr, 0, i13);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i6), Integer.valueOf(i10)));
    }

    public static void g(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i6 = 0;
        while (i6 < length) {
            try {
                char charAt = charSequence.charAt(i6);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i6, (byte) charAt);
                i6++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i6) + " at index " + (Math.max(i6, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i6 == length) {
            byteBuffer.position(position + i6);
            return;
        }
        position += i6;
        while (i6 < length) {
            char charAt2 = charSequence.charAt(i6);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i10 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i10, (byte) ((charAt2 & '?') | 128));
                    position = i10;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i10;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i6) + " at index " + (Math.max(i6, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i11 = i6 + 1;
                    if (i11 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i12 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    int i13 = position + 2;
                                    try {
                                        byteBuffer.put(i12, (byte) (((codePoint >>> 12) & 63) | 128));
                                        position += 3;
                                        byteBuffer.put(i13, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                        i6 = i11;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i6 = i11;
                                        position = i13;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i6) + " at index " + (Math.max(i6, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    position = i12;
                                    i6 = i11;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i6) + " at index " + (Math.max(i6, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i6 = i11;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new r4(i6, length);
                }
                int i14 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i14, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i6++;
            position++;
        }
        byteBuffer.position(position);
    }

    public static String h(ByteString byteString) {
        StringBuilder sb2 = new StringBuilder(byteString.size());
        for (int i6 = 0; i6 < byteString.size(); i6++) {
            byte byteAt = byteString.byteAt(i6);
            if (byteAt != 34) {
                if (byteAt != 39) {
                    if (byteAt != 92) {
                        switch (byteAt) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (byteAt >= 32 && byteAt <= 126) {
                                    sb2.append((char) byteAt);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((byteAt >>> 6) & 3) + 48));
                                    sb2.append((char) (((byteAt >>> 3) & 7) + 48));
                                    sb2.append((char) ((byteAt & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static boolean i(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }

    public static int m(int i6, int i10, int i11, ByteBuffer byteBuffer) {
        byte b10;
        int i12;
        byte b11;
        int i13;
        int i14 = i10;
        if (i6 != 0) {
            if (i14 >= i11) {
                return i6;
            }
            byte b12 = (byte) i6;
            if (b12 < -32) {
                if (b12 >= -62) {
                    int i15 = i14 + 1;
                    if (byteBuffer.get(i14) <= -65) {
                        i14 = i15;
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            } else if (b12 < -16) {
                byte b13 = (byte) (~(i6 >> 8));
                if (b13 == 0) {
                    i13 = i14 + 1;
                    b11 = byteBuffer.get(i14);
                    if (i13 >= i11) {
                        return t4.f(b12, b11);
                    }
                } else {
                    b11 = b13;
                    i13 = i14;
                }
                if (b11 <= -65) {
                    if (b12 != -32 || b11 >= -96) {
                        if (b12 != -19 || b11 < -96) {
                            i14 = i13 + 1;
                            if (byteBuffer.get(i13) > -65) {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            } else {
                byte b14 = (byte) (~(i6 >> 8));
                if (b14 == 0) {
                    i12 = i14 + 1;
                    b14 = byteBuffer.get(i14);
                    if (i12 >= i11) {
                        return t4.f(b12, b14);
                    }
                    b10 = 0;
                } else {
                    b10 = (byte) (i6 >> 16);
                    i12 = i14;
                }
                if (b10 == 0) {
                    int i16 = i12 + 1;
                    byte b15 = byteBuffer.get(i12);
                    if (i16 >= i11) {
                        return t4.g(b12, b14, b15);
                    }
                    b10 = b15;
                    i12 = i16;
                }
                if (b14 <= -65) {
                    if ((((b14 + 112) + (b12 << 28)) >> 30) == 0 && b10 <= -65) {
                        i14 = i12 + 1;
                        if (byteBuffer.get(i12) > -65) {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            }
        }
        s4 s4Var = t4.f3054a;
        int i17 = i11 - 7;
        int i18 = i14;
        while (i18 < i17 && (byteBuffer.getLong(i18) & (-9187201950435737472L)) == 0) {
            i18 += 8;
        }
        int i19 = (i18 - i14) + i14;
        while (i19 < i11) {
            int i20 = i19 + 1;
            byte b16 = byteBuffer.get(i19);
            if (b16 < 0) {
                if (b16 < -32) {
                    if (i20 >= i11) {
                        return b16;
                    }
                    if (b16 >= -62 && byteBuffer.get(i20) <= -65) {
                        i19 += 2;
                    } else {
                        return -1;
                    }
                } else if (b16 < -16) {
                    if (i20 >= i11 - 1) {
                        return t4.b(b16, i20, i11 - i20, byteBuffer);
                    }
                    int i21 = i19 + 2;
                    byte b17 = byteBuffer.get(i20);
                    if (b17 <= -65) {
                        if (b16 != -32 || b17 >= -96) {
                            if ((b16 != -19 || b17 < -96) && byteBuffer.get(i21) <= -65) {
                                i19 += 3;
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    if (i20 >= i11 - 2) {
                        return t4.b(b16, i20, i11 - i20, byteBuffer);
                    }
                    int i22 = i19 + 2;
                    byte b18 = byteBuffer.get(i20);
                    if (b18 <= -65) {
                        if ((((b18 + 112) + (b16 << 28)) >> 30) == 0) {
                            int i23 = i19 + 3;
                            if (byteBuffer.get(i22) <= -65) {
                                i19 += 4;
                                if (byteBuffer.get(i23) > -65) {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                }
            } else {
                i19 = i20;
            }
        }
        return 0;
    }

    public static int n(int i6, long j, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    p4 p4Var = q4.f3024c;
                    return t4.g(i6, p4Var.f(j), p4Var.f(j + 1));
                }
                throw new AssertionError();
            }
            return t4.f(i6, q4.f3024c.f(j));
        }
        s4 s4Var = t4.f3054a;
        if (i6 > -12) {
            return -1;
        }
        return i6;
    }

    public static int o(long j, byte[] bArr, int i6, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return t4.g(i6, q4.i(j, bArr), q4.i(j + 1, bArr));
                }
                throw new AssertionError();
            }
            return t4.f(i6, q4.i(j, bArr));
        }
        s4 s4Var = t4.f3054a;
        if (i6 > -12) {
            return -1;
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s4.d(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return r27 + r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.lang.CharSequence r25, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s4.f(java.lang.CharSequence, byte[], int, int):int");
    }

    public boolean j(byte[] bArr, int i6, int i10) {
        if (l(0, bArr, i6, i10) != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x009f, code lost:
    
        if (com.google.protobuf.q4.f3024c.f(r7) > (-65)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (com.google.protobuf.q4.f3024c.f(r7) > (-65)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        r24 = 1;
        r7 = r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int k(int r23, int r24, int r25, java.nio.ByteBuffer r26) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s4.k(int, int, int, java.nio.ByteBuffer):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x012e, code lost:
    
        if (com.google.protobuf.q4.i(r13, r27) > (-65)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0131, code lost:
    
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0166, code lost:
    
        if (com.google.protobuf.q4.i(r13, r27) > (-65)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01ad, code lost:
    
        if (com.google.protobuf.q4.i(r13, r27) > (-65)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r27[r0] > (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if (r27[r0] > (-65)) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x021c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(int r26, byte[] r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s4.l(int, byte[], int, int):int");
    }
}
