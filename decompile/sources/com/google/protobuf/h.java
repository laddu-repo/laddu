package com.google.protobuf;

import com.google.protobuf.Internal;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h {
    public static int a(byte[] bArr, int i6, g gVar) {
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - r10) {
                if (i10 == 0) {
                    gVar.f2918c = ByteString.EMPTY;
                    return r10;
                }
                gVar.f2918c = ByteString.copyFrom(bArr, r10, i10);
                return r10 + i10;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public static int b(int i6, byte[] bArr) {
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    public static long c(int i6, byte[] bArr) {
        return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }

    public static int d(q3 q3Var, byte[] bArr, int i6, int i10, int i11, g gVar) {
        Object j = q3Var.j();
        int u3 = u(j, q3Var, bArr, i6, i10, i11, gVar);
        q3Var.c(j);
        gVar.f2918c = j;
        return u3;
    }

    public static int e(q3 q3Var, byte[] bArr, int i6, int i10, g gVar) {
        Object j = q3Var.j();
        int v10 = v(j, q3Var, bArr, i6, i10, gVar);
        q3Var.c(j);
        gVar.f2918c = j;
        return v10;
    }

    public static int f(q3 q3Var, int i6, byte[] bArr, int i10, int i11, Internal.ProtobufList protobufList, g gVar) {
        int e10 = e(q3Var, bArr, i10, i11, gVar);
        protobufList.add(gVar.f2918c);
        while (e10 < i11) {
            int r10 = r(bArr, e10, gVar);
            if (i6 != gVar.f2916a) {
                break;
            }
            e10 = e(q3Var, bArr, r10, i11, gVar);
            protobufList.add(gVar.f2918c);
        }
        return e10;
    }

    public static int g(byte[] bArr, int i6, Internal.ProtobufList protobufList, g gVar) {
        boolean z10;
        j jVar = (j) protobufList;
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a + r10;
        while (r10 < i10) {
            r10 = t(bArr, r10, gVar);
            if (gVar.f2917b != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            jVar.addBoolean(z10);
        }
        if (r10 == i10) {
            return r10;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int h(byte[] bArr, int i6, Internal.ProtobufList protobufList, g gVar) {
        m0 m0Var = (m0) protobufList;
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a + r10;
        while (r10 < i10) {
            m0Var.addDouble(Double.longBitsToDouble(c(r10, bArr)));
            r10 += 8;
        }
        if (r10 == i10) {
            return r10;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int i(byte[] bArr, int i6, Internal.ProtobufList protobufList, g gVar) {
        s1 s1Var = (s1) protobufList;
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a + r10;
        while (r10 < i10) {
            s1Var.addInt(b(r10, bArr));
            r10 += 4;
        }
        if (r10 == i10) {
            return r10;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int j(byte[] bArr, int i6, Internal.ProtobufList protobufList, g gVar) {
        k2 k2Var = (k2) protobufList;
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a + r10;
        while (r10 < i10) {
            k2Var.addLong(c(r10, bArr));
            r10 += 8;
        }
        if (r10 == i10) {
            return r10;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int k(byte[] bArr, int i6, Internal.ProtobufList protobufList, g gVar) {
        l1 l1Var = (l1) protobufList;
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a + r10;
        while (r10 < i10) {
            l1Var.addFloat(Float.intBitsToFloat(b(r10, bArr)));
            r10 += 4;
        }
        if (r10 == i10) {
            return r10;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int l(byte[] bArr, int i6, Internal.ProtobufList protobufList, g gVar) {
        s1 s1Var = (s1) protobufList;
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a + r10;
        while (r10 < i10) {
            r10 = r(bArr, r10, gVar);
            s1Var.addInt(CodedInputStream.decodeZigZag32(gVar.f2916a));
        }
        if (r10 == i10) {
            return r10;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int m(byte[] bArr, int i6, Internal.ProtobufList protobufList, g gVar) {
        k2 k2Var = (k2) protobufList;
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a + r10;
        while (r10 < i10) {
            r10 = t(bArr, r10, gVar);
            k2Var.addLong(CodedInputStream.decodeZigZag64(gVar.f2917b));
        }
        if (r10 == i10) {
            return r10;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int n(byte[] bArr, int i6, Internal.ProtobufList protobufList, g gVar) {
        s1 s1Var = (s1) protobufList;
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a + r10;
        while (r10 < i10) {
            r10 = r(bArr, r10, gVar);
            s1Var.addInt(gVar.f2916a);
        }
        if (r10 == i10) {
            return r10;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int o(byte[] bArr, int i6, g gVar) {
        int r10 = r(bArr, i6, gVar);
        int i10 = gVar.f2916a;
        if (i10 >= 0) {
            if (i10 == 0) {
                gVar.f2918c = HttpUrl.FRAGMENT_ENCODE_SET;
                return r10;
            }
            gVar.f2918c = new String(bArr, r10, i10, Internal.UTF_8);
            return r10 + i10;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public static int p(int i6, byte[] bArr, int i10, int i11, UnknownFieldSetLite unknownFieldSetLite, g gVar) {
        if (WireFormat.getTagFieldNumber(i6) != 0) {
            int tagWireType = WireFormat.getTagWireType(i6);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                unknownFieldSetLite.storeField(i6, Integer.valueOf(b(i10, bArr)));
                                return i10 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
                        int i12 = (i6 & (-8)) | 4;
                        int i13 = gVar.f2920e + 1;
                        gVar.f2920e = i13;
                        if (i13 < 100) {
                            int i14 = 0;
                            while (true) {
                                if (i10 >= i11) {
                                    break;
                                }
                                int r10 = r(bArr, i10, gVar);
                                i14 = gVar.f2916a;
                                if (i14 == i12) {
                                    i10 = r10;
                                    break;
                                }
                                i10 = p(i14, bArr, r10, i11, newInstance, gVar);
                            }
                            gVar.f2920e--;
                            if (i10 <= i11 && i14 == i12) {
                                unknownFieldSetLite.storeField(i6, newInstance);
                                return i10;
                            }
                            throw InvalidProtocolBufferException.parseFailure();
                        }
                        throw InvalidProtocolBufferException.recursionLimitExceeded();
                    }
                    int r11 = r(bArr, i10, gVar);
                    int i15 = gVar.f2916a;
                    if (i15 >= 0) {
                        if (i15 <= bArr.length - r11) {
                            if (i15 == 0) {
                                unknownFieldSetLite.storeField(i6, ByteString.EMPTY);
                            } else {
                                unknownFieldSetLite.storeField(i6, ByteString.copyFrom(bArr, r11, i15));
                            }
                            return r11 + i15;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                unknownFieldSetLite.storeField(i6, Long.valueOf(c(i10, bArr)));
                return i10 + 8;
            }
            int t10 = t(bArr, i10, gVar);
            unknownFieldSetLite.storeField(i6, Long.valueOf(gVar.f2917b));
            return t10;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public static int q(int i6, byte[] bArr, int i10, g gVar) {
        int i11 = i6 & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            gVar.f2916a = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            gVar.f2916a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            gVar.f2916a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            gVar.f2916a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                gVar.f2916a = i19;
                return i20;
            }
        }
    }

    public static int r(byte[] bArr, int i6, g gVar) {
        int i10 = i6 + 1;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            gVar.f2916a = b10;
            return i10;
        }
        return q(b10, bArr, i10, gVar);
    }

    public static int s(int i6, byte[] bArr, int i10, int i11, Internal.ProtobufList protobufList, g gVar) {
        s1 s1Var = (s1) protobufList;
        int r10 = r(bArr, i10, gVar);
        s1Var.addInt(gVar.f2916a);
        while (r10 < i11) {
            int r11 = r(bArr, r10, gVar);
            if (i6 != gVar.f2916a) {
                break;
            }
            r10 = r(bArr, r11, gVar);
            s1Var.addInt(gVar.f2916a);
        }
        return r10;
    }

    public static int t(byte[] bArr, int i6, g gVar) {
        int i10 = i6 + 1;
        long j = bArr[i6];
        if (j >= 0) {
            gVar.f2917b = j;
            return i10;
        }
        int i11 = i6 + 2;
        byte b10 = bArr[i10];
        long j10 = (j & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j10 |= (r10 & Byte.MAX_VALUE) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        gVar.f2917b = j10;
        return i11;
    }

    public static int u(Object obj, q3 q3Var, byte[] bArr, int i6, int i10, int i11, g gVar) {
        w2 w2Var = (w2) q3Var;
        int i12 = gVar.f2920e + 1;
        gVar.f2920e = i12;
        if (i12 < 100) {
            int H = w2Var.H(obj, bArr, i6, i10, i11, gVar);
            gVar.f2920e--;
            gVar.f2918c = obj;
            return H;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public static int v(Object obj, q3 q3Var, byte[] bArr, int i6, int i10, g gVar) {
        int i11 = i6 + 1;
        int i12 = bArr[i6];
        if (i12 < 0) {
            i11 = q(i12, bArr, i11, gVar);
            i12 = gVar.f2916a;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = gVar.f2920e + 1;
            gVar.f2920e = i14;
            if (i14 < 100) {
                int i15 = i13 + i12;
                q3Var.f(obj, bArr, i13, i15, gVar);
                gVar.f2920e--;
                gVar.f2918c = obj;
                return i15;
            }
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int w(int i6, byte[] bArr, int i10, int i11, g gVar) {
        if (WireFormat.getTagFieldNumber(i6) != 0) {
            int tagWireType = WireFormat.getTagWireType(i6);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i10 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        int i12 = (i6 & (-8)) | 4;
                        int i13 = 0;
                        while (i10 < i11) {
                            i10 = r(bArr, i10, gVar);
                            i13 = gVar.f2916a;
                            if (i13 == i12) {
                                break;
                            }
                            i10 = w(i13, bArr, i10, i11, gVar);
                        }
                        if (i10 <= i11 && i13 == i12) {
                            return i10;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    return r(bArr, i10, gVar) + gVar.f2916a;
                }
                return i10 + 8;
            }
            return t(bArr, i10, gVar);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }
}
