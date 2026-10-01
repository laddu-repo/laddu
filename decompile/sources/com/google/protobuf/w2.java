package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.WebSocketProtocol;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w2 implements q3 {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f3073q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Unsafe f3074r = q4.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3075a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3076b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3077c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3078d;

    /* renamed from: e, reason: collision with root package name */
    public final MessageLite f3079e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3080f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3081g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3082h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f3083i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3084k;

    /* renamed from: l, reason: collision with root package name */
    public final a3 f3085l;

    /* renamed from: m, reason: collision with root package name */
    public final i2 f3086m;

    /* renamed from: n, reason: collision with root package name */
    public final j4 f3087n;

    /* renamed from: o, reason: collision with root package name */
    public final v0 f3088o;

    /* renamed from: p, reason: collision with root package name */
    public final q2 f3089p;

    public w2(int[] iArr, Object[] objArr, int i6, int i10, MessageLite messageLite, boolean z10, int[] iArr2, int i11, int i12, a3 a3Var, i2 i2Var, j4 j4Var, v0 v0Var, q2 q2Var) {
        boolean z11;
        this.f3075a = iArr;
        this.f3076b = objArr;
        this.f3077c = i6;
        this.f3078d = i10;
        this.f3081g = messageLite instanceof GeneratedMessageLite;
        if (v0Var != null && (messageLite instanceof GeneratedMessageLite.ExtendableMessage)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f3080f = z11;
        this.f3082h = z10;
        this.f3083i = iArr2;
        this.j = i11;
        this.f3084k = i12;
        this.f3085l = a3Var;
        this.f3086m = i2Var;
        this.f3087n = j4Var;
        this.f3088o = v0Var;
        this.f3079e = messageLite;
        this.f3089p = q2Var;
    }

    public static w2 B(s2 s2Var, a3 a3Var, i2 i2Var, j4 j4Var, v0 v0Var, q2 q2Var) {
        int i6;
        int i10;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        int n10;
        int i13;
        int i14;
        int i15;
        Class<?> type;
        int n11;
        if (s2Var instanceof k3) {
            return C((k3) s2Var, a3Var, i2Var, j4Var, v0Var, q2Var);
        }
        c4 c4Var = (c4) s2Var;
        f1[] f1VarArr = c4Var.f2886d;
        if (f1VarArr.length == 0) {
            i6 = 0;
            i10 = 0;
        } else {
            i6 = f1VarArr[0].f2912z;
            i10 = f1VarArr[f1VarArr.length - 1].f2912z;
        }
        int length = f1VarArr.length;
        int[] iArr3 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i16 = 0;
        int i17 = 0;
        for (f1 f1Var : f1VarArr) {
            FieldType fieldType = f1Var.f2911y;
            if (fieldType == FieldType.MAP) {
                i16++;
            } else if (fieldType.id() >= 18 && f1Var.f2911y.id() <= 49) {
                i17++;
            }
        }
        if (i16 > 0) {
            iArr = new int[i16];
        } else {
            iArr = null;
        }
        if (i17 > 0) {
            iArr2 = new int[i17];
        } else {
            iArr2 = null;
        }
        int[] iArr4 = c4Var.f2885c;
        int[] iArr5 = f3073q;
        if (iArr4 == null) {
            iArr4 = iArr5;
        }
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i19 < f1VarArr.length) {
            f1 f1Var2 = f1VarArr[i19];
            int i23 = f1Var2.f2912z;
            java.lang.reflect.Field field = f1Var2.f2910x;
            f1[] f1VarArr2 = f1VarArr;
            FieldType fieldType2 = f1Var2.f2911y;
            int i24 = i6;
            Internal.EnumVerifier enumVerifier = f1Var2.G;
            p4 p4Var = q4.f3024c;
            int i25 = i10;
            Object[] objArr2 = objArr;
            int n12 = (int) p4Var.n(field);
            int id2 = fieldType2.id();
            if (!fieldType2.isList() && !fieldType2.isMap()) {
                i11 = id2;
                java.lang.reflect.Field field2 = f1Var2.A;
                if (field2 == null) {
                    n11 = 1048575;
                    i12 = n12;
                } else {
                    i12 = n12;
                    n11 = (int) p4Var.n(field2);
                }
                i13 = Integer.numberOfTrailingZeros(f1Var2.B);
                n10 = n11;
            } else {
                i11 = id2;
                i12 = n12;
                java.lang.reflect.Field field3 = f1Var2.E;
                if (field3 == null) {
                    i13 = 0;
                    n10 = 0;
                } else {
                    n10 = (int) p4Var.n(field3);
                    i13 = 0;
                }
            }
            iArr3[i20] = f1Var2.f2912z;
            int i26 = i20 + 1;
            if (f1Var2.D) {
                i14 = 536870912;
            } else {
                i14 = 0;
            }
            if (f1Var2.C) {
                i15 = 268435456;
            } else {
                i15 = 0;
            }
            iArr3[i26] = i14 | i15 | (i11 << 20) | i12;
            iArr3[i20 + 2] = (i13 << 20) | n10;
            int i27 = e1.f2903a[fieldType2.ordinal()];
            if ((i27 != 1 && i27 != 2) || field == null) {
                type = null;
            } else {
                type = field.getType();
            }
            Object obj = f1Var2.F;
            if (obj != null) {
                int i28 = (i20 / 3) * 2;
                objArr2[i28] = obj;
                if (type != null) {
                    objArr2[i28 + 1] = type;
                } else if (enumVerifier != null) {
                    objArr2[i28 + 1] = enumVerifier;
                }
            } else if (type != null) {
                objArr2[((i20 / 3) * 2) + 1] = type;
            } else if (enumVerifier != null) {
                objArr2[((i20 / 3) * 2) + 1] = enumVerifier;
            }
            if (i18 < iArr4.length && iArr4[i18] == i23) {
                iArr4[i18] = i20;
                i18++;
            }
            if (fieldType2 == FieldType.MAP) {
                iArr[i21] = i20;
                i21++;
            } else if (fieldType2.id() >= 18 && fieldType2.id() <= 49) {
                iArr2[i22] = (int) p4Var.n(field);
                i22++;
            }
            i19++;
            i20 += 3;
            f1VarArr = f1VarArr2;
            i6 = i24;
            i10 = i25;
            objArr = objArr2;
        }
        int i29 = i6;
        int i30 = i10;
        Object[] objArr3 = objArr;
        if (iArr == null) {
            iArr = iArr5;
        }
        if (iArr2 == null) {
            iArr2 = iArr5;
        }
        int[] iArr6 = new int[iArr4.length + iArr.length + iArr2.length];
        System.arraycopy(iArr4, 0, iArr6, 0, iArr4.length);
        System.arraycopy(iArr, 0, iArr6, iArr4.length, iArr.length);
        System.arraycopy(iArr2, 0, iArr6, iArr4.length + iArr.length, iArr2.length);
        return new w2(iArr3, objArr3, i29, i30, c4Var.f2887e, true, iArr6, iArr4.length, iArr4.length + iArr.length, a3Var, i2Var, j4Var, v0Var, q2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.protobuf.w2 C(com.google.protobuf.k3 r32, com.google.protobuf.a3 r33, com.google.protobuf.i2 r34, com.google.protobuf.j4 r35, com.google.protobuf.v0 r36, com.google.protobuf.q2 r37) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w2.C(com.google.protobuf.k3, com.google.protobuf.a3, com.google.protobuf.i2, com.google.protobuf.j4, com.google.protobuf.v0, com.google.protobuf.q2):com.google.protobuf.w2");
    }

    public static long D(int i6) {
        return i6 & 1048575;
    }

    public static int E(long j, Object obj) {
        return ((Integer) q4.f3024c.m(j, obj)).intValue();
    }

    public static long F(long j, Object obj) {
        return ((Long) q4.f3024c.m(j, obj)).longValue();
    }

    public static java.lang.reflect.Field O(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder q9 = r4.a.q("Field ", str, " for ");
            q9.append(cls.getName());
            q9.append(" not found. Known fields are ");
            q9.append(Arrays.toString(declaredFields));
            throw new RuntimeException(q9.toString());
        }
    }

    public static int U(int i6) {
        return (i6 & 267386880) >>> 20;
    }

    public static void Y(int i6, Object obj, e5 e5Var) {
        if (obj instanceof String) {
            ((l0) e5Var).f2978a.writeString(i6, (String) obj);
        } else {
            ((l0) e5Var).a(i6, (ByteString) obj);
        }
    }

    public static void l(Object obj) {
        if (u(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int m(byte[] bArr, int i6, int i10, WireFormat.FieldType fieldType, Class cls, g gVar) {
        boolean z10;
        switch (v2.f3061a[fieldType.ordinal()]) {
            case 1:
                int t10 = h.t(bArr, i6, gVar);
                if (gVar.f2917b != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gVar.f2918c = Boolean.valueOf(z10);
                return t10;
            case 2:
                return h.a(bArr, i6, gVar);
            case 3:
                gVar.f2918c = Double.valueOf(Double.longBitsToDouble(h.c(i6, bArr)));
                return i6 + 8;
            case 4:
            case 5:
                gVar.f2918c = Integer.valueOf(h.b(i6, bArr));
                return i6 + 4;
            case 6:
            case 7:
                gVar.f2918c = Long.valueOf(h.c(i6, bArr));
                return i6 + 8;
            case 8:
                gVar.f2918c = Float.valueOf(Float.intBitsToFloat(h.b(i6, bArr)));
                return i6 + 4;
            case 9:
            case 10:
            case 11:
                int r10 = h.r(bArr, i6, gVar);
                gVar.f2918c = Integer.valueOf(gVar.f2916a);
                return r10;
            case 12:
            case 13:
                int t11 = h.t(bArr, i6, gVar);
                gVar.f2918c = Long.valueOf(gVar.f2917b);
                return t11;
            case 14:
                return h.e(i3.f2941c.a(cls), bArr, i6, i10, gVar);
            case 15:
                int r11 = h.r(bArr, i6, gVar);
                gVar.f2918c = Integer.valueOf(CodedInputStream.decodeZigZag32(gVar.f2916a));
                return r11;
            case 16:
                int t12 = h.t(bArr, i6, gVar);
                gVar.f2918c = Long.valueOf(CodedInputStream.decodeZigZag64(gVar.f2917b));
                return t12;
            case 17:
                int r12 = h.r(bArr, i6, gVar);
                int i11 = gVar.f2916a;
                if (i11 >= 0) {
                    if (i11 == 0) {
                        gVar.f2918c = HttpUrl.FRAGMENT_ENCODE_SET;
                        return r12;
                    }
                    gVar.f2918c = t4.f3054a.d(bArr, r12, i11);
                    return r12 + i11;
                }
                throw InvalidProtocolBufferException.negativeSize();
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static UnknownFieldSetLite r(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = newInstance;
            return newInstance;
        }
        return unknownFieldSetLite;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public final Object A(int i6, int i10, Object obj) {
        q3 q9 = q(i10);
        if (!v(i6, i10, obj)) {
            return q9.j();
        }
        Object object = f3074r.getObject(obj, V(i10) & 1048575);
        if (u(object)) {
            return object;
        }
        Object j = q9.j();
        if (object != null) {
            q9.a(j, object);
        }
        return j;
    }

    public final int G(Object obj, byte[] bArr, int i6, int i10, int i11, long j, g gVar) {
        int m9;
        Unsafe unsafe = f3074r;
        Object p10 = p(i11);
        Object object = unsafe.getObject(obj, j);
        this.f3089p.getClass();
        if (!((MapFieldLite) object).isMutable()) {
            MapFieldLite mutableCopy = MapFieldLite.emptyMapField().mutableCopy();
            q2.a(mutableCopy, object);
            unsafe.putObject(obj, j, mutableCopy);
            object = mutableCopy;
        }
        p2 metadata = ((MapEntryLite) p10).getMetadata();
        MapFieldLite mapFieldLite = (MapFieldLite) object;
        int r10 = h.r(bArr, i6, gVar);
        int i12 = gVar.f2916a;
        if (i12 >= 0 && i12 <= i10 - r10) {
            int i13 = r10 + i12;
            Object obj2 = metadata.f3013b;
            Object obj3 = metadata.f3015d;
            Object obj4 = obj2;
            Object obj5 = obj3;
            while (r10 < i13) {
                int i14 = r10 + 1;
                int i15 = bArr[r10];
                if (i15 < 0) {
                    i14 = h.q(i15, bArr, i14, gVar);
                    i15 = gVar.f2916a;
                }
                int i16 = i15 >>> 3;
                int i17 = i15 & 7;
                if (i16 != 1) {
                    if (i16 == 2 && i17 == metadata.f3014c.getWireType()) {
                        m9 = m(bArr, i14, i10, metadata.f3014c, obj3.getClass(), gVar);
                        obj5 = gVar.f2918c;
                        r10 = m9;
                    }
                    r10 = h.w(i15, bArr, i14, i10, gVar);
                } else if (i17 == metadata.f3012a.getWireType()) {
                    m9 = m(bArr, i14, i10, metadata.f3012a, null, gVar);
                    obj4 = gVar.f2918c;
                    r10 = m9;
                } else {
                    r10 = h.w(i15, bArr, i14, i10, gVar);
                }
            }
            if (r10 == i13) {
                mapFieldLite.put(obj4, obj5);
                return i13;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0544, code lost:
    
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x088e, code lost:
    
        if (r0 == 1048575) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0890, code lost:
    
        r27.putInt(r10, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0896, code lost:
    
        r3 = null;
        r11 = r8.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x089d, code lost:
    
        if (r11 >= r8.f3084k) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x089f, code lost:
    
        r3 = (com.google.protobuf.UnknownFieldSetLite) r8.n(r10, r8.f3083i[r11], r3, r8.f3087n, r31);
        r11 = r11 + 1;
        r10 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x08b5, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x08b6, code lost:
    
        if (r3 == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x08b8, code lost:
    
        ((com.google.protobuf.k4) r0.f3087n).getClass();
        ((com.google.protobuf.GeneratedMessageLite) r31).unknownFields = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x08c5, code lost:
    
        if (r35 != 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x08c7, code lost:
    
        if (r7 != r6) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x08ce, code lost:
    
        throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x08d3, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x08cf, code lost:
    
        if (r7 > r6) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x08d1, code lost:
    
        if (r9 != r35) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08d8, code lost:
    
        throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:118:0x06f6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:187:0x00b3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x05ab. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:115:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0844  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int H(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.protobuf.g r36) {
        /*
            Method dump skipped, instructions count: 2378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w2.H(java.lang.Object, byte[], int, int, int, com.google.protobuf.g):int");
    }

    public final int I(Object obj, byte[] bArr, int i6, int i10, int i11, int i12, int i13, int i14, int i15, long j, int i16, g gVar) {
        Unsafe unsafe = f3074r;
        long j10 = this.f3075a[i16 + 2] & 1048575;
        boolean z10 = true;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i6;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(h.c(i6, bArr))));
                int i17 = i6 + 8;
                unsafe.putInt(obj, j10, i12);
                return i17;
            case 52:
                if (i13 != 5) {
                    return i6;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(h.b(i6, bArr))));
                int i18 = i6 + 4;
                unsafe.putInt(obj, j10, i12);
                return i18;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i6;
                }
                int t10 = h.t(bArr, i6, gVar);
                unsafe.putObject(obj, j, Long.valueOf(gVar.f2917b));
                unsafe.putInt(obj, j10, i12);
                return t10;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i6;
                }
                int r10 = h.r(bArr, i6, gVar);
                unsafe.putObject(obj, j, Integer.valueOf(gVar.f2916a));
                unsafe.putInt(obj, j10, i12);
                return r10;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i6;
                }
                unsafe.putObject(obj, j, Long.valueOf(h.c(i6, bArr)));
                int i19 = i6 + 8;
                unsafe.putInt(obj, j10, i12);
                return i19;
            case 57:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                if (i13 != 5) {
                    return i6;
                }
                unsafe.putObject(obj, j, Integer.valueOf(h.b(i6, bArr)));
                int i20 = i6 + 4;
                unsafe.putInt(obj, j10, i12);
                return i20;
            case 58:
                if (i13 != 0) {
                    return i6;
                }
                int t11 = h.t(bArr, i6, gVar);
                if (gVar.f2917b == 0) {
                    z10 = false;
                }
                unsafe.putObject(obj, j, Boolean.valueOf(z10));
                unsafe.putInt(obj, j10, i12);
                return t11;
            case 59:
                if (i13 != 2) {
                    return i6;
                }
                int r11 = h.r(bArr, i6, gVar);
                int i21 = gVar.f2916a;
                if (i21 == 0) {
                    unsafe.putObject(obj, j, HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    if ((i14 & 536870912) != 0) {
                        if (!t4.f3054a.j(bArr, r11, r11 + i21)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, r11, i21, Internal.UTF_8));
                    r11 += i21;
                }
                unsafe.putInt(obj, j10, i12);
                return r11;
            case 60:
                if (i13 != 2) {
                    return i6;
                }
                Object A = A(i12, i16, obj);
                int v10 = h.v(A, q(i16), bArr, i6, i10, gVar);
                T(obj, i12, A, i16);
                return v10;
            case 61:
                if (i13 != 2) {
                    return i6;
                }
                int a10 = h.a(bArr, i6, gVar);
                unsafe.putObject(obj, j, gVar.f2918c);
                unsafe.putInt(obj, j10, i12);
                return a10;
            case 63:
                if (i13 != 0) {
                    return i6;
                }
                int r12 = h.r(bArr, i6, gVar);
                int i22 = gVar.f2916a;
                Internal.EnumVerifier o10 = o(i16);
                if (o10 != null && !o10.isInRange(i22)) {
                    r(obj).storeField(i11, Long.valueOf(i22));
                    return r12;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i22));
                unsafe.putInt(obj, j10, i12);
                return r12;
            case 66:
                if (i13 != 0) {
                    return i6;
                }
                int r13 = h.r(bArr, i6, gVar);
                unsafe.putObject(obj, j, Integer.valueOf(CodedInputStream.decodeZigZag32(gVar.f2916a)));
                unsafe.putInt(obj, j10, i12);
                return r13;
            case 67:
                if (i13 != 0) {
                    return i6;
                }
                int t12 = h.t(bArr, i6, gVar);
                unsafe.putObject(obj, j, Long.valueOf(CodedInputStream.decodeZigZag64(gVar.f2917b)));
                unsafe.putInt(obj, j10, i12);
                return t12;
            case 68:
                if (i13 == 3) {
                    Object A2 = A(i12, i16, obj);
                    int u3 = h.u(A2, q(i16), bArr, i6, i10, (i11 & (-8)) | 4, gVar);
                    T(obj, i12, A2, i16);
                    return u3;
                }
                break;
        }
        return i6;
    }

    public final int J(Object obj, byte[] bArr, int i6, int i10, int i11, int i12, int i13, int i14, long j, int i15, long j10, g gVar) {
        int i16;
        int s;
        Unsafe unsafe = f3074r;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(obj, j10);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j10, protobufList);
        }
        Internal.ProtobufList protobufList2 = protobufList;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    return h.h(bArr, i6, protobufList2, gVar);
                }
                if (i13 != 1) {
                    return i6;
                }
                m0 m0Var = (m0) protobufList2;
                m0Var.addDouble(Double.longBitsToDouble(h.c(i6, bArr)));
                int i17 = i6 + 8;
                while (i17 < i10) {
                    int r10 = h.r(bArr, i17, gVar);
                    if (i11 != gVar.f2916a) {
                        return i17;
                    }
                    m0Var.addDouble(Double.longBitsToDouble(h.c(r10, bArr)));
                    i17 = r10 + 8;
                }
                return i17;
            case 19:
            case 36:
                if (i13 == 2) {
                    return h.k(bArr, i6, protobufList2, gVar);
                }
                if (i13 != 5) {
                    return i6;
                }
                l1 l1Var = (l1) protobufList2;
                l1Var.addFloat(Float.intBitsToFloat(h.b(i6, bArr)));
                int i18 = i6 + 4;
                while (i18 < i10) {
                    int r11 = h.r(bArr, i18, gVar);
                    if (i11 != gVar.f2916a) {
                        return i18;
                    }
                    l1Var.addFloat(Float.intBitsToFloat(h.b(r11, bArr)));
                    i18 = r11 + 4;
                }
                return i18;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    k2 k2Var = (k2) protobufList2;
                    int r12 = h.r(bArr, i6, gVar);
                    int i19 = gVar.f2916a + r12;
                    while (r12 < i19) {
                        r12 = h.t(bArr, r12, gVar);
                        k2Var.addLong(gVar.f2917b);
                    }
                    if (r12 == i19) {
                        return r12;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i13 != 0) {
                    return i6;
                }
                k2 k2Var2 = (k2) protobufList2;
                int t10 = h.t(bArr, i6, gVar);
                k2Var2.addLong(gVar.f2917b);
                while (t10 < i10) {
                    int r13 = h.r(bArr, t10, gVar);
                    if (i11 != gVar.f2916a) {
                        return t10;
                    }
                    t10 = h.t(bArr, r13, gVar);
                    k2Var2.addLong(gVar.f2917b);
                }
                return t10;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return h.n(bArr, i6, protobufList2, gVar);
                }
                return i13 == 0 ? h.s(i11, bArr, i6, i10, protobufList2, gVar) : i6;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    return h.j(bArr, i6, protobufList2, gVar);
                }
                if (i13 != 1) {
                    return i6;
                }
                k2 k2Var3 = (k2) protobufList2;
                k2Var3.addLong(h.c(i6, bArr));
                int i20 = i6 + 8;
                while (i20 < i10) {
                    int r14 = h.r(bArr, i20, gVar);
                    if (i11 != gVar.f2916a) {
                        return i20;
                    }
                    k2Var3.addLong(h.c(r14, bArr));
                    i20 = r14 + 8;
                }
                return i20;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    return h.i(bArr, i6, protobufList2, gVar);
                }
                if (i13 != 5) {
                    return i6;
                }
                s1 s1Var = (s1) protobufList2;
                s1Var.addInt(h.b(i6, bArr));
                int i21 = i6 + 4;
                while (i21 < i10) {
                    int r15 = h.r(bArr, i21, gVar);
                    if (i11 != gVar.f2916a) {
                        return i21;
                    }
                    s1Var.addInt(h.b(r15, bArr));
                    i21 = r15 + 4;
                }
                return i21;
            case 25:
            case 42:
                if (i13 == 2) {
                    return h.g(bArr, i6, protobufList2, gVar);
                }
                if (i13 != 0) {
                    return i6;
                }
                j jVar = (j) protobufList2;
                int t11 = h.t(bArr, i6, gVar);
                jVar.addBoolean(gVar.f2917b != 0);
                while (t11 < i10) {
                    int r16 = h.r(bArr, t11, gVar);
                    if (i11 != gVar.f2916a) {
                        return t11;
                    }
                    t11 = h.t(bArr, r16, gVar);
                    jVar.addBoolean(gVar.f2917b != 0);
                }
                return t11;
            case 26:
                if (i13 != 2) {
                    return i6;
                }
                if ((j & 536870912) == 0) {
                    int r17 = h.r(bArr, i6, gVar);
                    int i22 = gVar.f2916a;
                    if (i22 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i22 == 0) {
                        protobufList2.add(HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        protobufList2.add(new String(bArr, r17, i22, Internal.UTF_8));
                        r17 += i22;
                    }
                    while (r17 < i10) {
                        int r18 = h.r(bArr, r17, gVar);
                        if (i11 != gVar.f2916a) {
                            return r17;
                        }
                        r17 = h.r(bArr, r18, gVar);
                        int i23 = gVar.f2916a;
                        if (i23 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i23 == 0) {
                            protobufList2.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            protobufList2.add(new String(bArr, r17, i23, Internal.UTF_8));
                            r17 += i23;
                        }
                    }
                    return r17;
                }
                int r19 = h.r(bArr, i6, gVar);
                int i24 = gVar.f2916a;
                if (i24 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i24 == 0) {
                    protobufList2.add(HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    int i25 = r19 + i24;
                    if (t4.f3054a.j(bArr, r19, i25)) {
                        protobufList2.add(new String(bArr, r19, i24, Internal.UTF_8));
                        r19 = i25;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                while (r19 < i10) {
                    int r20 = h.r(bArr, r19, gVar);
                    if (i11 != gVar.f2916a) {
                        return r19;
                    }
                    r19 = h.r(bArr, r20, gVar);
                    int i26 = gVar.f2916a;
                    if (i26 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i26 == 0) {
                        protobufList2.add(HttpUrl.FRAGMENT_ENCODE_SET);
                    } else {
                        int i27 = r19 + i26;
                        if (t4.f3054a.j(bArr, r19, i27)) {
                            protobufList2.add(new String(bArr, r19, i26, Internal.UTF_8));
                            r19 = i27;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                }
                return r19;
            case 27:
                i16 = i6;
                if (i13 == 2) {
                    return h.f(q(i14), i11, bArr, i16, i10, protobufList2, gVar);
                }
                break;
            case 28:
                i16 = i6;
                if (i13 == 2) {
                    int r21 = h.r(bArr, i6, gVar);
                    int i28 = gVar.f2916a;
                    if (i28 >= 0) {
                        if (i28 > bArr.length - r21) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        if (i28 == 0) {
                            protobufList2.add(ByteString.EMPTY);
                        } else {
                            protobufList2.add(ByteString.copyFrom(bArr, r21, i28));
                            r21 += i28;
                        }
                        while (r21 < i10) {
                            int r22 = h.r(bArr, r21, gVar);
                            if (i11 != gVar.f2916a) {
                                return r21;
                            }
                            r21 = h.r(bArr, r22, gVar);
                            int i29 = gVar.f2916a;
                            if (i29 >= 0) {
                                if (i29 > bArr.length - r21) {
                                    throw InvalidProtocolBufferException.truncatedMessage();
                                }
                                if (i29 == 0) {
                                    protobufList2.add(ByteString.EMPTY);
                                } else {
                                    protobufList2.add(ByteString.copyFrom(bArr, r21, i29));
                                    r21 += i29;
                                }
                            } else {
                                throw InvalidProtocolBufferException.negativeSize();
                            }
                        }
                        return r21;
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                break;
            case 30:
            case 44:
                if (i13 == 2) {
                    s = h.n(bArr, i6, protobufList2, gVar);
                } else {
                    if (i13 != 0) {
                        return i6;
                    }
                    s = h.s(i11, bArr, i6, i10, protobufList2, gVar);
                }
                r3.k(obj, i12, protobufList2, o(i14), null, this.f3087n);
                return s;
            case 33:
            case 47:
                if (i13 == 2) {
                    return h.l(bArr, i6, protobufList2, gVar);
                }
                if (i13 != 0) {
                    return i6;
                }
                s1 s1Var2 = (s1) protobufList2;
                int r23 = h.r(bArr, i6, gVar);
                s1Var2.addInt(CodedInputStream.decodeZigZag32(gVar.f2916a));
                while (r23 < i10) {
                    int r24 = h.r(bArr, r23, gVar);
                    if (i11 != gVar.f2916a) {
                        return r23;
                    }
                    r23 = h.r(bArr, r24, gVar);
                    s1Var2.addInt(CodedInputStream.decodeZigZag32(gVar.f2916a));
                }
                return r23;
            case 34:
            case 48:
                if (i13 == 2) {
                    return h.m(bArr, i6, protobufList2, gVar);
                }
                if (i13 != 0) {
                    return i6;
                }
                k2 k2Var4 = (k2) protobufList2;
                int t12 = h.t(bArr, i6, gVar);
                k2Var4.addLong(CodedInputStream.decodeZigZag64(gVar.f2917b));
                while (t12 < i10) {
                    int r25 = h.r(bArr, t12, gVar);
                    if (i11 != gVar.f2916a) {
                        return t12;
                    }
                    t12 = h.t(bArr, r25, gVar);
                    k2Var4.addLong(CodedInputStream.decodeZigZag64(gVar.f2917b));
                }
                return t12;
            case 49:
                if (i13 == 3) {
                    q3 q9 = q(i14);
                    int i30 = (i11 & (-8)) | 4;
                    int d10 = h.d(q9, bArr, i6, i10, i30, gVar);
                    q3 q3Var = q9;
                    protobufList2.add(gVar.f2918c);
                    while (d10 < i10) {
                        int r26 = h.r(bArr, d10, gVar);
                        if (i11 != gVar.f2916a) {
                            return d10;
                        }
                        q3 q3Var2 = q3Var;
                        d10 = h.d(q3Var2, bArr, r26, i10, i30, gVar);
                        protobufList2.add(gVar.f2918c);
                        q3Var = q3Var2;
                    }
                    return d10;
                }
            default:
                return i6;
        }
        return i16;
    }

    public final void K(Object obj, long j, b0 b0Var, q3 q3Var, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        List c10 = this.f3086m.c(j, obj);
        CodedInputStream codedInputStream = b0Var.f2867a;
        if (WireFormat.getTagWireType(b0Var.f2868b) == 3) {
            int i6 = b0Var.f2868b;
            do {
                Object j10 = q3Var.j();
                b0Var.b(j10, q3Var, extensionRegistryLite);
                q3Var.c(j10);
                c10.add(j10);
                if (!codedInputStream.isAtEnd() && b0Var.f2870d == 0) {
                    readTag = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag == i6);
            b0Var.f2870d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public final void L(Object obj, int i6, b0 b0Var, q3 q3Var, ExtensionRegistryLite extensionRegistryLite) {
        int readTag;
        List c10 = this.f3086m.c(i6 & 1048575, obj);
        CodedInputStream codedInputStream = b0Var.f2867a;
        if (WireFormat.getTagWireType(b0Var.f2868b) == 2) {
            int i10 = b0Var.f2868b;
            do {
                Object j = q3Var.j();
                b0Var.c(j, q3Var, extensionRegistryLite);
                q3Var.c(j);
                c10.add(j);
                if (!codedInputStream.isAtEnd() && b0Var.f2870d == 0) {
                    readTag = codedInputStream.readTag();
                } else {
                    return;
                }
            } while (readTag == i10);
            b0Var.f2870d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public final void M(Object obj, int i6, b0 b0Var) {
        if ((536870912 & i6) != 0) {
            b0Var.x(2);
            q4.s(i6 & 1048575, obj, b0Var.f2867a.readStringRequireUtf8());
        } else if (this.f3081g) {
            b0Var.x(2);
            q4.s(i6 & 1048575, obj, b0Var.f2867a.readString());
        } else {
            q4.s(i6 & 1048575, obj, b0Var.e());
        }
    }

    public final void N(Object obj, int i6, b0 b0Var) {
        int i10 = 536870912 & i6;
        i2 i2Var = this.f3086m;
        if (i10 != 0) {
            b0Var.t(i2Var.c(i6 & 1048575, obj), true);
        } else {
            b0Var.t(i2Var.c(i6 & 1048575, obj), false);
        }
    }

    public final void P(int i6, Object obj) {
        int i10 = this.f3075a[i6 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        q4.q(j, obj, (1 << (i10 >>> 20)) | q4.f3024c.j(j, obj));
    }

    public final void Q(int i6, int i10, Object obj) {
        q4.q(this.f3075a[i10 + 2] & 1048575, obj, i6);
    }

    public final int R(int i6, int i10) {
        int[] iArr = this.f3075a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i6 == i13) {
                return i12;
            }
            if (i6 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final void S(int i6, Object obj, Object obj2) {
        f3074r.putObject(obj, V(i6) & 1048575, obj2);
        P(i6, obj);
    }

    public final void T(Object obj, int i6, Object obj2, int i10) {
        f3074r.putObject(obj, V(i10) & 1048575, obj2);
        Q(i6, i10, obj);
    }

    public final int V(int i6) {
        return this.f3075a[i6 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00b5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:194:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(java.lang.Object r22, com.google.protobuf.e5 r23) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w2.W(java.lang.Object, com.google.protobuf.e5):void");
    }

    public final void X(e5 e5Var, int i6, Object obj, int i10) {
        if (obj != null) {
            Object p10 = p(i10);
            this.f3089p.getClass();
            p2 metadata = ((MapEntryLite) p10).getMetadata();
            MapFieldLite mapFieldLite = (MapFieldLite) obj;
            l0 l0Var = (l0) e5Var;
            CodedOutputStream codedOutputStream = l0Var.f2978a;
            CodedOutputStream codedOutputStream2 = l0Var.f2978a;
            if (codedOutputStream.isSerializationDeterministic()) {
                int i11 = 0;
                switch (k0.f2964a[metadata.f3012a.ordinal()]) {
                    case 1:
                        Boolean bool = Boolean.FALSE;
                        V v10 = mapFieldLite.get(bool);
                        if (v10 != 0) {
                            codedOutputStream2.writeTag(i6, 2);
                            codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool, v10));
                            MapEntryLite.writeTo(codedOutputStream2, metadata, bool, v10);
                        }
                        Boolean bool2 = Boolean.TRUE;
                        V v11 = mapFieldLite.get(bool2);
                        if (v11 != 0) {
                            codedOutputStream2.writeTag(i6, 2);
                            codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool2, v11));
                            MapEntryLite.writeTo(codedOutputStream2, metadata, bool2, v11);
                            return;
                        }
                        return;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        int size = mapFieldLite.size();
                        int[] iArr = new int[size];
                        Iterator it = mapFieldLite.keySet().iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            iArr[i12] = ((Integer) it.next()).intValue();
                            i12++;
                        }
                        Arrays.sort(iArr);
                        while (i11 < size) {
                            int i13 = iArr[i11];
                            V v12 = mapFieldLite.get(Integer.valueOf(i13));
                            codedOutputStream.writeTag(i6, 2);
                            codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i13), v12));
                            MapEntryLite.writeTo(codedOutputStream, metadata, Integer.valueOf(i13), v12);
                            i11++;
                        }
                        return;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        int size2 = mapFieldLite.size();
                        long[] jArr = new long[size2];
                        Iterator it2 = mapFieldLite.keySet().iterator();
                        int i14 = 0;
                        while (it2.hasNext()) {
                            jArr[i14] = ((Long) it2.next()).longValue();
                            i14++;
                        }
                        Arrays.sort(jArr);
                        while (i11 < size2) {
                            long j = jArr[i11];
                            V v13 = mapFieldLite.get(Long.valueOf(j));
                            codedOutputStream.writeTag(i6, 2);
                            codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j), v13));
                            MapEntryLite.writeTo(codedOutputStream, metadata, Long.valueOf(j), v13);
                            i11++;
                        }
                        return;
                    case 12:
                        int size3 = mapFieldLite.size();
                        String[] strArr = new String[size3];
                        Iterator it3 = mapFieldLite.keySet().iterator();
                        int i15 = 0;
                        while (it3.hasNext()) {
                            strArr[i15] = (String) it3.next();
                            i15++;
                        }
                        Arrays.sort(strArr);
                        while (i11 < size3) {
                            String str = strArr[i11];
                            V v14 = mapFieldLite.get(str);
                            codedOutputStream.writeTag(i6, 2);
                            codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v14));
                            MapEntryLite.writeTo(codedOutputStream, metadata, str, v14);
                            i11++;
                        }
                        return;
                    default:
                        throw new IllegalArgumentException("does not support key type: " + metadata.f3012a);
                }
            }
            Iterator it4 = mapFieldLite.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                codedOutputStream.writeTag(i6, 2);
                codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                MapEntryLite.writeTo(codedOutputStream, metadata, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.google.protobuf.q3
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i6 = 0;
        while (true) {
            int[] iArr = this.f3075a;
            if (i6 < iArr.length) {
                int V = V(i6);
                long j = 1048575 & V;
                int i10 = iArr[i6];
                switch (U(V)) {
                    case 0:
                        if (s(i6, obj2)) {
                            p4 p4Var = q4.f3024c;
                            obj3 = obj;
                            p4Var.r(obj3, j, p4Var.h(j, obj2));
                            P(i6, obj3);
                            break;
                        }
                        break;
                    case 1:
                        if (s(i6, obj2)) {
                            p4 p4Var2 = q4.f3024c;
                            p4Var2.s(obj, j, p4Var2.i(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 2:
                        if (s(i6, obj2)) {
                            q4.r(obj, j, q4.f3024c.l(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 3:
                        if (s(i6, obj2)) {
                            q4.r(obj, j, q4.f3024c.l(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 4:
                        if (s(i6, obj2)) {
                            q4.q(j, obj, q4.f3024c.j(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 5:
                        if (s(i6, obj2)) {
                            q4.r(obj, j, q4.f3024c.l(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 6:
                        if (s(i6, obj2)) {
                            q4.q(j, obj, q4.f3024c.j(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 7:
                        if (s(i6, obj2)) {
                            p4 p4Var3 = q4.f3024c;
                            p4Var3.o(obj, j, p4Var3.e(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 8:
                        if (s(i6, obj2)) {
                            q4.s(j, obj, q4.f3024c.m(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 9:
                        x(i6, obj, obj2);
                        break;
                    case 10:
                        if (s(i6, obj2)) {
                            q4.s(j, obj, q4.f3024c.m(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 11:
                        if (s(i6, obj2)) {
                            q4.q(j, obj, q4.f3024c.j(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 12:
                        if (s(i6, obj2)) {
                            q4.q(j, obj, q4.f3024c.j(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 13:
                        if (s(i6, obj2)) {
                            q4.q(j, obj, q4.f3024c.j(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 14:
                        if (s(i6, obj2)) {
                            q4.r(obj, j, q4.f3024c.l(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 15:
                        if (s(i6, obj2)) {
                            q4.q(j, obj, q4.f3024c.j(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 16:
                        if (s(i6, obj2)) {
                            q4.r(obj, j, q4.f3024c.l(j, obj2));
                            P(i6, obj);
                            break;
                        }
                        break;
                    case 17:
                        x(i6, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f3086m.b(j, obj, obj2);
                        break;
                    case 50:
                        Class cls = r3.f3036a;
                        p4 p4Var4 = q4.f3024c;
                        Object m9 = p4Var4.m(j, obj);
                        Object m10 = p4Var4.m(j, obj2);
                        this.f3089p.getClass();
                        q4.s(j, obj, q2.a(m9, m10));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (v(i10, i6, obj2)) {
                            q4.s(j, obj, q4.f3024c.m(j, obj2));
                            Q(i10, i6, obj);
                            break;
                        }
                        break;
                    case 60:
                        y(i6, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                        if (v(i10, i6, obj2)) {
                            q4.s(j, obj, q4.f3024c.m(j, obj2));
                            Q(i10, i6, obj);
                            break;
                        }
                        break;
                    case 68:
                        y(i6, obj, obj2);
                        break;
                }
                obj3 = obj;
                i6 += 3;
                obj = obj3;
            } else {
                Object obj4 = obj;
                r3.l(this.f3087n, obj4, obj2);
                if (this.f3080f) {
                    ((x0) this.f3088o).getClass();
                    i1 i1Var = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
                    if (!i1Var.f2936a.isEmpty()) {
                        ((GeneratedMessageLite.ExtendableMessage) obj4).ensureExtensionsAreMutable().n(i1Var);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.protobuf.q3
    public final void b(java.lang.Object r21, com.google.protobuf.b0 r22, com.google.protobuf.ExtensionRegistryLite r23) {
        /*
            Method dump skipped, instructions count: 2374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w2.b(java.lang.Object, com.google.protobuf.b0, com.google.protobuf.ExtensionRegistryLite):void");
    }

    @Override // com.google.protobuf.q3
    public final void c(Object obj) {
        if (u(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.f3075a;
            int length = iArr.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int V = V(i6);
                long j = 1048575 & V;
                int U = U(V);
                if (U != 9) {
                    if (U != 60 && U != 68) {
                        switch (U) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f3086m.a(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f3074r;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f3089p.getClass();
                                    ((MapFieldLite) object).makeImmutable();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (v(iArr[i6], i6, obj)) {
                        q(i6).c(f3074r.getObject(obj, j));
                    }
                }
                if (s(i6, obj)) {
                    q(i6).c(f3074r.getObject(obj, j));
                }
            }
            ((k4) this.f3087n).getClass();
            ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
            if (this.f3080f) {
                ((x0) this.f3088o).getClass();
                ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
            }
        }
    }

    @Override // com.google.protobuf.q3
    public final boolean d(Object obj) {
        int i6;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            if (i14 < this.j) {
                int i15 = this.f3083i[i14];
                int[] iArr = this.f3075a;
                int i16 = iArr[i15];
                int V = V(i15);
                int i17 = iArr[i15 + 2];
                int i18 = i17 & 1048575;
                int i19 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    if (i18 != 1048575) {
                        i13 = f3074r.getInt(obj, i18);
                    }
                    i10 = i15;
                    i11 = i13;
                    i6 = i18;
                } else {
                    int i20 = i13;
                    i6 = i12;
                    i10 = i15;
                    i11 = i20;
                }
                if ((268435456 & V) != 0 && !t(obj, i10, i6, i11, i19)) {
                    break;
                }
                int U = U(V);
                if (U != 9 && U != 17) {
                    if (U != 27) {
                        if (U != 60 && U != 68) {
                            if (U != 49) {
                                if (U == 50) {
                                    Object m9 = q4.f3024c.m(V & 1048575, obj);
                                    this.f3089p.getClass();
                                    MapFieldLite mapFieldLite = (MapFieldLite) m9;
                                    if (!mapFieldLite.isEmpty() && ((MapEntryLite) p(i10)).getMetadata().f3014c.getJavaType() == WireFormat.JavaType.MESSAGE) {
                                        q3 q3Var = null;
                                        for (Object obj2 : mapFieldLite.values()) {
                                            if (q3Var == null) {
                                                q3Var = i3.f2941c.a(obj2.getClass());
                                            }
                                            if (!q3Var.d(obj2)) {
                                                break loop0;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                i14++;
                                i12 = i6;
                                i13 = i11;
                            }
                        } else {
                            if (v(i16, i10, obj)) {
                                if (!q(i10).d(q4.f3024c.m(V & 1048575, obj))) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i6;
                            i13 = i11;
                        }
                    }
                    List list = (List) q4.f3024c.m(V & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        q3 q9 = q(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (!q9.d(list.get(i21))) {
                                break loop0;
                            }
                        }
                    }
                    i14++;
                    i12 = i6;
                    i13 = i11;
                } else {
                    if (t(obj, i10, i6, i11, i19)) {
                        if (!q(i10).d(q4.f3024c.m(V & 1048575, obj))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i6;
                    i13 = i11;
                }
            } else {
                if (this.f3080f) {
                    ((x0) this.f3088o).getClass();
                    if (!((GeneratedMessageLite.ExtendableMessage) obj).extensions.j()) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b0  */
    @Override // com.google.protobuf.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.protobuf.MessageLite r14, com.google.protobuf.e5 r15) {
        /*
            Method dump skipped, instructions count: 1642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w2.e(com.google.protobuf.MessageLite, com.google.protobuf.e5):void");
    }

    @Override // com.google.protobuf.q3
    public final void f(Object obj, byte[] bArr, int i6, int i10, g gVar) {
        H(obj, bArr, i6, i10, 0, gVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0018. Please report as an issue. */
    @Override // com.google.protobuf.q3
    public final int g(GeneratedMessageLite generatedMessageLite) {
        int i6;
        int hashLong;
        int[] iArr = this.f3075a;
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int V = V(i11);
            int i12 = iArr[i11];
            long j = 1048575 & V;
            int i13 = 37;
            switch (U(V)) {
                case 0:
                    i6 = i10 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(q4.f3024c.h(j, generatedMessageLite)));
                    i10 = hashLong + i6;
                    break;
                case 1:
                    i6 = i10 * 53;
                    hashLong = Float.floatToIntBits(q4.f3024c.i(j, generatedMessageLite));
                    i10 = hashLong + i6;
                    break;
                case 2:
                    i6 = i10 * 53;
                    hashLong = Internal.hashLong(q4.f3024c.l(j, generatedMessageLite));
                    i10 = hashLong + i6;
                    break;
                case 3:
                    i6 = i10 * 53;
                    hashLong = Internal.hashLong(q4.f3024c.l(j, generatedMessageLite));
                    i10 = hashLong + i6;
                    break;
                case 4:
                    i6 = i10 * 53;
                    hashLong = q4.f3024c.j(j, generatedMessageLite);
                    i10 = hashLong + i6;
                    break;
                case 5:
                    i6 = i10 * 53;
                    hashLong = Internal.hashLong(q4.f3024c.l(j, generatedMessageLite));
                    i10 = hashLong + i6;
                    break;
                case 6:
                    i6 = i10 * 53;
                    hashLong = q4.f3024c.j(j, generatedMessageLite);
                    i10 = hashLong + i6;
                    break;
                case 7:
                    i6 = i10 * 53;
                    hashLong = Internal.hashBoolean(q4.f3024c.e(j, generatedMessageLite));
                    i10 = hashLong + i6;
                    break;
                case 8:
                    i6 = i10 * 53;
                    hashLong = ((String) q4.f3024c.m(j, generatedMessageLite)).hashCode();
                    i10 = hashLong + i6;
                    break;
                case 9:
                    Object m9 = q4.f3024c.m(j, generatedMessageLite);
                    if (m9 != null) {
                        i13 = m9.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
                    break;
                case 10:
                    i6 = i10 * 53;
                    hashLong = q4.f3024c.m(j, generatedMessageLite).hashCode();
                    i10 = hashLong + i6;
                    break;
                case 11:
                    i6 = i10 * 53;
                    hashLong = q4.f3024c.j(j, generatedMessageLite);
                    i10 = hashLong + i6;
                    break;
                case 12:
                    i6 = i10 * 53;
                    hashLong = q4.f3024c.j(j, generatedMessageLite);
                    i10 = hashLong + i6;
                    break;
                case 13:
                    i6 = i10 * 53;
                    hashLong = q4.f3024c.j(j, generatedMessageLite);
                    i10 = hashLong + i6;
                    break;
                case 14:
                    i6 = i10 * 53;
                    hashLong = Internal.hashLong(q4.f3024c.l(j, generatedMessageLite));
                    i10 = hashLong + i6;
                    break;
                case 15:
                    i6 = i10 * 53;
                    hashLong = q4.f3024c.j(j, generatedMessageLite);
                    i10 = hashLong + i6;
                    break;
                case 16:
                    i6 = i10 * 53;
                    hashLong = Internal.hashLong(q4.f3024c.l(j, generatedMessageLite));
                    i10 = hashLong + i6;
                    break;
                case 17:
                    Object m10 = q4.f3024c.m(j, generatedMessageLite);
                    if (m10 != null) {
                        i13 = m10.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i6 = i10 * 53;
                    hashLong = q4.f3024c.m(j, generatedMessageLite).hashCode();
                    i10 = hashLong + i6;
                    break;
                case 50:
                    i6 = i10 * 53;
                    hashLong = q4.f3024c.m(j, generatedMessageLite).hashCode();
                    i10 = hashLong + i6;
                    break;
                case 51:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(((Double) q4.f3024c.m(j, generatedMessageLite)).doubleValue()));
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = Float.floatToIntBits(((Float) q4.f3024c.m(j, generatedMessageLite)).floatValue());
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = Internal.hashBoolean(((Boolean) q4.f3024c.m(j, generatedMessageLite)).booleanValue());
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = ((String) q4.f3024c.m(j, generatedMessageLite)).hashCode();
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = q4.f3024c.m(j, generatedMessageLite).hashCode();
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = q4.f3024c.m(j, generatedMessageLite).hashCode();
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = E(j, generatedMessageLite);
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = Internal.hashLong(F(j, generatedMessageLite));
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(i12, i11, generatedMessageLite)) {
                        i6 = i10 * 53;
                        hashLong = q4.f3024c.m(j, generatedMessageLite).hashCode();
                        i10 = hashLong + i6;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((k4) this.f3087n).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode() + (i10 * 53);
        if (this.f3080f) {
            ((x0) this.f3088o).getClass();
            return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.f2936a.hashCode() + (hashCode * 53);
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.protobuf.r3.m(r5.m(r7, r12), r5.m(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.l(r7, r12) == r5.l(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.l(r7, r12) == r5.l(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.protobuf.r3.m(r5.m(r7, r12), r5.m(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.protobuf.r3.m(r5.m(r7, r12), r5.m(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.protobuf.r3.m(r5.m(r7, r12), r5.m(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.e(r7, r12) == r5.e(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.l(r7, r12) == r5.l(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.l(r7, r12) == r5.l(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.l(r7, r12) == r5.l(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.i(r7, r12)) == java.lang.Float.floatToIntBits(r5.i(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.h(r7, r12)) == java.lang.Double.doubleToLongBits(r5.h(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.protobuf.r3.m(r9.m(r7, r12), r9.m(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // com.google.protobuf.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(com.google.protobuf.GeneratedMessageLite r12, com.google.protobuf.GeneratedMessageLite r13) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w2.h(com.google.protobuf.GeneratedMessageLite, com.google.protobuf.GeneratedMessageLite):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0057. Please report as an issue. */
    @Override // com.google.protobuf.q3
    public final int i(AbstractMessageLite abstractMessageLite) {
        int i6;
        int computeFloatSize;
        int computeStringSize;
        int computeMessageSize;
        int computeTagSize;
        int size;
        int i10;
        int computeTagSize2;
        int computeBoolSize;
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int computeTagSize3;
        int computeMessageSizeNoTag;
        int size2;
        int computeTagSize4;
        int computeUInt32SizeNoTag;
        int i11;
        int computeStringSize2;
        w2 w2Var = this;
        AbstractMessageLite abstractMessageLite2 = abstractMessageLite;
        Unsafe unsafe = f3074r;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = w2Var.f3075a;
            if (i13 < iArr.length) {
                int V = w2Var.V(i13);
                int U = U(V);
                int i17 = iArr[i13];
                int i18 = iArr[i13 + 2];
                int i19 = i18 & i12;
                if (U <= 17) {
                    if (i19 != i14) {
                        if (i19 == i12) {
                            i15 = 0;
                        } else {
                            i15 = unsafe.getInt(abstractMessageLite2, i19);
                        }
                        i14 = i19;
                    }
                    i6 = 1 << (i18 >>> 20);
                } else {
                    i6 = 0;
                }
                int i20 = i16;
                long j = V & i12;
                if (U < FieldType.DOUBLE_LIST_PACKED.id() || U > FieldType.SINT64_LIST_PACKED.id()) {
                    i19 = 0;
                }
                boolean z10 = w2Var.f3082h;
                switch (U) {
                    case 0:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            i16 = CodedOutputStream.computeDoubleSize(i17, 0.0d) + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 1:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeFloatSize(i17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 2:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeInt64Size(i17, unsafe.getLong(abstractMessageLite2, j));
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 3:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeUInt64Size(i17, unsafe.getLong(abstractMessageLite2, j));
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 4:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeInt32Size(i17, unsafe.getInt(abstractMessageLite2, j));
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 5:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeFixed64Size(i17, 0L);
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 6:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeFixed32Size(i17, 0);
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 7:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeBoolSize(i17, true);
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 8:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            Object object = unsafe.getObject(abstractMessageLite2, j);
                            if (object instanceof ByteString) {
                                computeStringSize = CodedOutputStream.computeBytesSize(i17, (ByteString) object);
                            } else {
                                computeStringSize = CodedOutputStream.computeStringSize(i17, (String) object);
                            }
                            i16 = computeStringSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 9:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            Object object2 = unsafe.getObject(abstractMessageLite2, j);
                            q3 q9 = w2Var.q(i13);
                            Class cls = r3.f3036a;
                            if (object2 instanceof LazyFieldLite) {
                                computeMessageSize = CodedOutputStream.computeLazyFieldSize(i17, (LazyFieldLite) object2);
                            } else {
                                computeMessageSize = CodedOutputStream.computeMessageSize(i17, (MessageLite) object2, q9);
                            }
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 10:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeBytesSize(i17, (ByteString) unsafe.getObject(abstractMessageLite2, j));
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 11:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeUInt32Size(i17, unsafe.getInt(abstractMessageLite2, j));
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 12:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeEnumSize(i17, unsafe.getInt(abstractMessageLite2, j));
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 13:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeSFixed32Size(i17, 0);
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 14:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeSFixed64Size(i17, 0L);
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 15:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeSInt32Size(i17, unsafe.getInt(abstractMessageLite2, j));
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 16:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeFloatSize = CodedOutputStream.computeSInt64Size(i17, unsafe.getLong(abstractMessageLite2, j));
                            i16 = computeFloatSize + i20;
                            w2Var = this;
                            break;
                        }
                        w2Var = this;
                        i16 = i20;
                        break;
                    case 17:
                        if (w2Var.t(abstractMessageLite2, i13, i14, i15, i6)) {
                            computeMessageSize = CodedOutputStream.computeGroupSize(i17, (MessageLite) unsafe.getObject(abstractMessageLite2, j), w2Var.q(i13));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 18:
                        computeMessageSize = r3.c(i17, (List) unsafe.getObject(abstractMessageLite2, j));
                        i16 = computeMessageSize + i20;
                        break;
                    case 19:
                        computeMessageSize = r3.b(i17, (List) unsafe.getObject(abstractMessageLite2, j));
                        i16 = computeMessageSize + i20;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls2 = r3.f3036a;
                        if (list.size() != 0) {
                            computeTagSize = (CodedOutputStream.computeTagSize(i17) * list.size()) + r3.e(list);
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case 21:
                        List list2 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls3 = r3.f3036a;
                        size = list2.size();
                        if (size != 0) {
                            i10 = r3.i(list2);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i17);
                            computeTagSize = (computeTagSize2 * size) + i10;
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                        List list3 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls4 = r3.f3036a;
                        size = list3.size();
                        if (size != 0) {
                            i10 = r3.d(list3);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i17);
                            computeTagSize = (computeTagSize2 * size) + i10;
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                        computeMessageSize = r3.c(i17, (List) unsafe.getObject(abstractMessageLite2, j));
                        i16 = computeMessageSize + i20;
                        break;
                    case 24:
                        computeMessageSize = r3.b(i17, (List) unsafe.getObject(abstractMessageLite2, j));
                        i16 = computeMessageSize + i20;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls5 = r3.f3036a;
                        int size3 = list4.size();
                        if (size3 == 0) {
                            computeBoolSize = 0;
                        } else {
                            computeBoolSize = CodedOutputStream.computeBoolSize(i17, true) * size3;
                        }
                        i16 = i20 + computeBoolSize;
                        break;
                    case 26:
                        List list5 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls6 = r3.f3036a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            computeTagSize = CodedOutputStream.computeTagSize(i17) * size4;
                            if (list5 instanceof LazyStringList) {
                                LazyStringList lazyStringList = (LazyStringList) list5;
                                for (int i21 = 0; i21 < size4; i21++) {
                                    Object raw = lazyStringList.getRaw(i21);
                                    if (raw instanceof ByteString) {
                                        computeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((ByteString) raw);
                                    } else {
                                        computeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                                    }
                                    computeTagSize = computeStringSizeNoTag2 + computeTagSize;
                                }
                            } else {
                                for (int i22 = 0; i22 < size4; i22++) {
                                    Object obj = list5.get(i22);
                                    if (obj instanceof ByteString) {
                                        computeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                                    } else {
                                        computeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
                                    }
                                    computeTagSize = computeStringSizeNoTag + computeTagSize;
                                }
                            }
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case 27:
                        List list6 = (List) unsafe.getObject(abstractMessageLite2, j);
                        q3 q10 = w2Var.q(i13);
                        Class cls7 = r3.f3036a;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            computeTagSize3 = 0;
                        } else {
                            computeTagSize3 = CodedOutputStream.computeTagSize(i17) * size5;
                            for (int i23 = 0; i23 < size5; i23++) {
                                Object obj2 = list6.get(i23);
                                if (obj2 instanceof LazyFieldLite) {
                                    computeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj2);
                                } else {
                                    computeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj2, q10);
                                }
                                computeTagSize3 = computeMessageSizeNoTag + computeTagSize3;
                            }
                        }
                        i16 = i20 + computeTagSize3;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls8 = r3.f3036a;
                        int size6 = list7.size();
                        if (size6 != 0) {
                            computeTagSize = CodedOutputStream.computeTagSize(i17) * size6;
                            for (int i24 = 0; i24 < list7.size(); i24++) {
                                computeTagSize += CodedOutputStream.computeBytesSizeNoTag((ByteString) list7.get(i24));
                            }
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case 29:
                        List list8 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls9 = r3.f3036a;
                        size = list8.size();
                        if (size != 0) {
                            i10 = r3.h(list8);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i17);
                            computeTagSize = (computeTagSize2 * size) + i10;
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case 30:
                        List list9 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls10 = r3.f3036a;
                        size = list9.size();
                        if (size != 0) {
                            i10 = r3.a(list9);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i17);
                            computeTagSize = (computeTagSize2 * size) + i10;
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case 31:
                        computeMessageSize = r3.b(i17, (List) unsafe.getObject(abstractMessageLite2, j));
                        i16 = computeMessageSize + i20;
                        break;
                    case 32:
                        computeMessageSize = r3.c(i17, (List) unsafe.getObject(abstractMessageLite2, j));
                        i16 = computeMessageSize + i20;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls11 = r3.f3036a;
                        size = list10.size();
                        if (size != 0) {
                            i10 = r3.f(list10);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i17);
                            computeTagSize = (computeTagSize2 * size) + i10;
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case 34:
                        List list11 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls12 = r3.f3036a;
                        size = list11.size();
                        if (size != 0) {
                            i10 = r3.g(list11);
                            computeTagSize2 = CodedOutputStream.computeTagSize(i17);
                            computeTagSize = (computeTagSize2 * size) + i10;
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case 35:
                        List list12 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls13 = r3.f3036a;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 36:
                        List list13 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls14 = r3.f3036a;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 37:
                        size2 = r3.e((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 38:
                        size2 = r3.i((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 39:
                        size2 = r3.d((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 40:
                        List list14 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls15 = r3.f3036a;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 41:
                        List list15 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls16 = r3.f3036a;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 42:
                        List list16 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls17 = r3.f3036a;
                        size2 = list16.size();
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 43:
                        size2 = r3.h((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 44:
                        size2 = r3.a((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 45:
                        List list17 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls18 = r3.f3036a;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 46:
                        List list18 = (List) unsafe.getObject(abstractMessageLite2, j);
                        Class cls19 = r3.f3036a;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 47:
                        size2 = r3.f((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 48:
                        size2 = r3.g((List) unsafe.getObject(abstractMessageLite2, j));
                        if (size2 > 0) {
                            if (z10) {
                                unsafe.putInt(abstractMessageLite2, i19, size2);
                            }
                            computeTagSize4 = CodedOutputStream.computeTagSize(i17);
                            computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                            i16 = computeUInt32SizeNoTag + computeTagSize4 + size2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 49:
                        List list19 = (List) unsafe.getObject(abstractMessageLite2, j);
                        q3 q11 = w2Var.q(i13);
                        Class cls20 = r3.f3036a;
                        int size7 = list19.size();
                        if (size7 == 0) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            for (int i25 = 0; i25 < size7; i25++) {
                                i11 += CodedOutputStream.computeGroupSize(i17, (MessageLite) list19.get(i25), q11);
                            }
                        }
                        i16 = i20 + i11;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(abstractMessageLite2, j);
                        Object p10 = w2Var.p(i13);
                        w2Var.f3089p.getClass();
                        MapFieldLite mapFieldLite = (MapFieldLite) object3;
                        MapEntryLite mapEntryLite = (MapEntryLite) p10;
                        if (!mapFieldLite.isEmpty()) {
                            computeTagSize = 0;
                            for (Map.Entry entry : mapFieldLite.entrySet()) {
                                computeTagSize += mapEntryLite.computeMessageSize(i17, entry.getKey(), entry.getValue());
                            }
                            i16 = i20 + computeTagSize;
                            break;
                        }
                        computeTagSize = 0;
                        i16 = i20 + computeTagSize;
                    case 51:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeDoubleSize(i17, 0.0d);
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 52:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeFloatSize(i17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 53:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeInt64Size(i17, F(j, abstractMessageLite2));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 54:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeUInt64Size(i17, F(j, abstractMessageLite2));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 55:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeInt32Size(i17, E(j, abstractMessageLite2));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 56:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeFixed64Size(i17, 0L);
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 57:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeFixed32Size(i17, 0);
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 58:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeBoolSize(i17, true);
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 59:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            Object object4 = unsafe.getObject(abstractMessageLite2, j);
                            if (object4 instanceof ByteString) {
                                computeStringSize2 = CodedOutputStream.computeBytesSize(i17, (ByteString) object4);
                            } else {
                                computeStringSize2 = CodedOutputStream.computeStringSize(i17, (String) object4);
                            }
                            i16 = computeStringSize2 + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 60:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            Object object5 = unsafe.getObject(abstractMessageLite2, j);
                            q3 q12 = w2Var.q(i13);
                            Class cls21 = r3.f3036a;
                            if (object5 instanceof LazyFieldLite) {
                                computeMessageSize = CodedOutputStream.computeLazyFieldSize(i17, (LazyFieldLite) object5);
                            } else {
                                computeMessageSize = CodedOutputStream.computeMessageSize(i17, (MessageLite) object5, q12);
                            }
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 61:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeBytesSize(i17, (ByteString) unsafe.getObject(abstractMessageLite2, j));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 62:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeUInt32Size(i17, E(j, abstractMessageLite2));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 63:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeEnumSize(i17, E(j, abstractMessageLite2));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeSFixed32Size(i17, 0);
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 65:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeSFixed64Size(i17, 0L);
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 66:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeSInt32Size(i17, E(j, abstractMessageLite2));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 67:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeSInt64Size(i17, F(j, abstractMessageLite2));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    case 68:
                        if (w2Var.v(i17, i13, abstractMessageLite2)) {
                            computeMessageSize = CodedOutputStream.computeGroupSize(i17, (MessageLite) unsafe.getObject(abstractMessageLite2, j), w2Var.q(i13));
                            i16 = computeMessageSize + i20;
                            break;
                        }
                        i16 = i20;
                        break;
                    default:
                        i16 = i20;
                        break;
                }
                i13 += 3;
                abstractMessageLite2 = abstractMessageLite;
                i12 = 1048575;
            } else {
                ((k4) w2Var.f3087n).getClass();
                int serializedSize = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSize() + i16;
                if (w2Var.f3080f) {
                    ((x0) w2Var.f3088o).getClass();
                    return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.i() + serializedSize;
                }
                return serializedSize;
            }
        }
    }

    @Override // com.google.protobuf.q3
    public final Object j() {
        this.f3085l.getClass();
        return ((GeneratedMessageLite) this.f3079e).newMutableInstance();
    }

    public final boolean k(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i6) {
        if (s(i6, generatedMessageLite) == s(i6, generatedMessageLite2)) {
            return true;
        }
        return false;
    }

    public final Object n(Object obj, int i6, Object obj2, j4 j4Var, Object obj3) {
        Internal.EnumVerifier o10;
        int i10 = this.f3075a[i6];
        Object m9 = q4.f3024c.m(V(i6) & 1048575, obj);
        if (m9 == null || (o10 = o(i6)) == null) {
            return obj2;
        }
        this.f3089p.getClass();
        p2 metadata = ((MapEntryLite) p(i6)).getMetadata();
        Iterator it = ((MapFieldLite) m9).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!o10.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = j4Var.a(obj3);
                }
                r newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.f3030a, metadata, entry.getKey(), entry.getValue());
                    newCodedBuilder.f3030a.checkNoSpaceLeft();
                    t tVar = new t(newCodedBuilder.f3031b);
                    ((k4) j4Var).getClass();
                    ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i10, 2), tVar);
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier o(int i6) {
        return (Internal.EnumVerifier) this.f3076b[((i6 / 3) * 2) + 1];
    }

    public final Object p(int i6) {
        return this.f3076b[(i6 / 3) * 2];
    }

    public final q3 q(int i6) {
        int i10 = (i6 / 3) * 2;
        Object[] objArr = this.f3076b;
        q3 q3Var = (q3) objArr[i10];
        if (q3Var != null) {
            return q3Var;
        }
        q3 a10 = i3.f2941c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a10;
        return a10;
    }

    public final boolean s(int i6, Object obj) {
        int i10 = this.f3075a[i6 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int V = V(i6);
            long j10 = V & 1048575;
            switch (U(V)) {
                case 0:
                    if (Double.doubleToRawLongBits(q4.f3024c.h(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(q4.f3024c.i(j10, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (q4.f3024c.l(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (q4.f3024c.l(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (q4.f3024c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (q4.f3024c.l(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (q4.f3024c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return q4.f3024c.e(j10, obj);
                case 8:
                    Object m9 = q4.f3024c.m(j10, obj);
                    if (m9 instanceof String) {
                        return !((String) m9).isEmpty();
                    }
                    if (m9 instanceof ByteString) {
                        return !ByteString.EMPTY.equals(m9);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (q4.f3024c.m(j10, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.EMPTY.equals(q4.f3024c.m(j10, obj));
                case 11:
                    if (q4.f3024c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (q4.f3024c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (q4.f3024c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (q4.f3024c.l(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (q4.f3024c.j(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (q4.f3024c.l(j10, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (q4.f3024c.m(j10, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & q4.f3024c.j(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean t(Object obj, int i6, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return s(i6, obj);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v(int i6, int i10, Object obj) {
        if (q4.f3024c.j(this.f3075a[i10 + 2] & 1048575, obj) == i6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        r0.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.lang.Object r9, int r10, java.lang.Object r11, com.google.protobuf.ExtensionRegistryLite r12, com.google.protobuf.b0 r13) {
        /*
            r8 = this;
            int r10 = r8.V(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            com.google.protobuf.p4 r10 = com.google.protobuf.q4.f3024c
            java.lang.Object r10 = r10.m(r0, r9)
            com.google.protobuf.q2 r2 = r8.f3089p
            if (r10 != 0) goto L22
            r2.getClass()
            com.google.protobuf.MapFieldLite r10 = com.google.protobuf.MapFieldLite.emptyMapField()
            com.google.protobuf.MapFieldLite r10 = r10.mutableCopy()
            com.google.protobuf.q4.s(r0, r9, r10)
            goto L3d
        L22:
            r2.getClass()
            r3 = r10
            com.google.protobuf.MapFieldLite r3 = (com.google.protobuf.MapFieldLite) r3
            boolean r3 = r3.isMutable()
            if (r3 != 0) goto L3d
            com.google.protobuf.MapFieldLite r3 = com.google.protobuf.MapFieldLite.emptyMapField()
            com.google.protobuf.MapFieldLite r3 = r3.mutableCopy()
            com.google.protobuf.q2.a(r3, r10)
            com.google.protobuf.q4.s(r0, r9, r3)
            r10 = r3
        L3d:
            r2.getClass()
            com.google.protobuf.MapFieldLite r10 = (com.google.protobuf.MapFieldLite) r10
            com.google.protobuf.MapEntryLite r11 = (com.google.protobuf.MapEntryLite) r11
            com.google.protobuf.p2 r9 = r11.getMetadata()
            r11 = 2
            r13.x(r11)
            com.google.protobuf.CodedInputStream r0 = r13.f2867a
            int r1 = r0.readUInt32()
            int r1 = r0.pushLimit(r1)
            java.lang.Object r2 = r9.f3013b
            java.lang.Object r3 = r9.f3015d
            r4 = r3
        L5b:
            int r5 = r13.a()     // Catch: java.lang.Throwable -> L7f
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto La1
            boolean r6 = r0.isAtEnd()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L6b
            goto La1
        L6b:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L8c
            if (r5 == r11) goto L81
            boolean r5 = r13.y()     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            if (r5 == 0) goto L79
            goto L5b
        L79:
            com.google.protobuf.InvalidProtocolBufferException r5 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            throw r5     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
        L7f:
            r9 = move-exception
            goto La8
        L81:
            com.google.protobuf.WireFormat$FieldType r5 = r9.f3014c     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            java.lang.Object r4 = r13.i(r5, r6, r12)     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            goto L5b
        L8c:
            com.google.protobuf.WireFormat$FieldType r5 = r9.f3012a     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            r6 = 0
            java.lang.Object r2 = r13.i(r5, r6, r6)     // Catch: java.lang.Throwable -> L7f com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L94
            goto L5b
        L94:
            boolean r5 = r13.y()     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L9b
            goto L5b
        L9b:
            com.google.protobuf.InvalidProtocolBufferException r9 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L7f
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L7f
            throw r9     // Catch: java.lang.Throwable -> L7f
        La1:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L7f
            r0.popLimit(r1)
            return
        La8:
            r0.popLimit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w2.w(java.lang.Object, int, java.lang.Object, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.b0):void");
    }

    public final void x(int i6, Object obj, Object obj2) {
        if (!s(i6, obj2)) {
            return;
        }
        long V = V(i6) & 1048575;
        Unsafe unsafe = f3074r;
        Object object = unsafe.getObject(obj2, V);
        if (object != null) {
            q3 q9 = q(i6);
            if (!s(i6, obj)) {
                if (!u(object)) {
                    unsafe.putObject(obj, V, object);
                } else {
                    Object j = q9.j();
                    q9.a(j, object);
                    unsafe.putObject(obj, V, j);
                }
                P(i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, V);
            if (!u(object2)) {
                Object j10 = q9.j();
                q9.a(j10, object2);
                unsafe.putObject(obj, V, j10);
                object2 = j10;
            }
            q9.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f3075a[i6] + " is present but null: " + obj2);
    }

    public final void y(int i6, Object obj, Object obj2) {
        int[] iArr = this.f3075a;
        int i10 = iArr[i6];
        if (!v(i10, i6, obj2)) {
            return;
        }
        long V = V(i6) & 1048575;
        Unsafe unsafe = f3074r;
        Object object = unsafe.getObject(obj2, V);
        if (object != null) {
            q3 q9 = q(i6);
            if (!v(i10, i6, obj)) {
                if (!u(object)) {
                    unsafe.putObject(obj, V, object);
                } else {
                    Object j = q9.j();
                    q9.a(j, object);
                    unsafe.putObject(obj, V, j);
                }
                Q(i10, i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, V);
            if (!u(object2)) {
                Object j10 = q9.j();
                q9.a(j10, object2);
                unsafe.putObject(obj, V, j10);
                object2 = j10;
            }
            q9.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i6] + " is present but null: " + obj2);
    }

    public final Object z(int i6, Object obj) {
        q3 q9 = q(i6);
        long V = V(i6) & 1048575;
        if (!s(i6, obj)) {
            return q9.j();
        }
        Object object = f3074r.getObject(obj, V);
        if (u(object)) {
            return object;
        }
        Object j = q9.j();
        if (object != null) {
            q9.a(j, object);
        }
        return j;
    }
}
