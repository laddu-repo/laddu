package com.google.android.gms.internal.measurement;

import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g6 implements n6 {
    public static final int[] j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f2226k = y6.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2227a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2228b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2229c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2230d;

    /* renamed from: e, reason: collision with root package name */
    public final v4 f2231e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2232f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2233g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2234h;

    /* renamed from: i, reason: collision with root package name */
    public final k5 f2235i;

    public g6(int[] iArr, Object[] objArr, int i6, int i10, v4 v4Var, int[] iArr2, int i11, int i12, k5 k5Var, k5 k5Var2) {
        this.f2227a = iArr;
        this.f2228b = objArr;
        this.f2229c = i6;
        this.f2230d = i10;
        this.f2232f = iArr2;
        this.f2233g = i11;
        this.f2234h = i12;
        this.f2235i = k5Var;
        this.f2231e = v4Var;
    }

    public static int F(int i6) {
        return (i6 >>> 20) & 255;
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof m5) {
            return ((m5) obj).e();
        }
        return true;
    }

    public static int k(long j10, Object obj) {
        return ((Integer) y6.j(j10, obj)).intValue();
    }

    public static long l(long j10, Object obj) {
        return ((Long) y6.j(j10, obj)).longValue();
    }

    public static final int s(byte[] bArr, int i6, int i10, b7 b7Var, Class cls, y4 y4Var) {
        boolean z10;
        b7 b7Var2 = b7.f2158z;
        switch (b7Var.ordinal()) {
            case 0:
                int i11 = i6 + 8;
                y4Var.f2528c = Double.valueOf(Double.longBitsToDouble(a8.c.z(i6, bArr)));
                return i11;
            case 1:
                int i12 = i6 + 4;
                y4Var.f2528c = Float.valueOf(Float.intBitsToFloat(a8.c.y(i6, bArr)));
                return i12;
            case 2:
            case 3:
                int x10 = a8.c.x(bArr, i6, y4Var);
                y4Var.f2528c = Long.valueOf(y4Var.f2527b);
                return x10;
            case 4:
            case 12:
            case 13:
                int v10 = a8.c.v(bArr, i6, y4Var);
                y4Var.f2528c = Integer.valueOf(y4Var.f2526a);
                return v10;
            case 5:
            case 15:
                int i13 = i6 + 8;
                y4Var.f2528c = Long.valueOf(a8.c.z(i6, bArr));
                return i13;
            case 6:
            case 14:
                int i14 = i6 + 4;
                y4Var.f2528c = Integer.valueOf(a8.c.y(i6, bArr));
                return i14;
            case 7:
                int x11 = a8.c.x(bArr, i6, y4Var);
                if (y4Var.f2527b != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y4Var.f2528c = Boolean.valueOf(z10);
                return x11;
            case 8:
                return a8.c.A(bArr, i6, y4Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                n6 a10 = k6.f2322c.a(cls);
                m5 b10 = a10.b();
                int C = a8.c.C(b10, a10, bArr, i6, i10, y4Var);
                a10.f(b10);
                y4Var.f2528c = b10;
                return C;
            case 11:
                return a8.c.B(bArr, i6, y4Var);
            case 16:
                int v11 = a8.c.v(bArr, i6, y4Var);
                y4Var.f2528c = Integer.valueOf(a8.e.E(y4Var.f2526a));
                return v11;
            case 17:
                int x12 = a8.c.x(bArr, i6, y4Var);
                y4Var.f2528c = Long.valueOf(a8.e.F(y4Var.f2527b));
                return x12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.g6 u(com.google.android.gms.internal.measurement.m6 r35, com.google.android.gms.internal.measurement.k5 r36, com.google.android.gms.internal.measurement.k5 r37) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g6.u(com.google.android.gms.internal.measurement.m6, com.google.android.gms.internal.measurement.k5, com.google.android.gms.internal.measurement.k5):com.google.android.gms.internal.measurement.g6");
    }

    public static Field v(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            r4.a.u(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(r4.a.o(sb2, " not found. Known fields are ", arrays), e10);
        }
    }

    public final Object A(int i6, Object obj) {
        n6 y9 = y(i6);
        int E = E(i6) & 1048575;
        if (!o(i6, obj)) {
            return y9.b();
        }
        Object object = f2226k.getObject(obj, E);
        if (j(object)) {
            return object;
        }
        m5 b10 = y9.b();
        if (object != null) {
            y9.a(b10, object);
        }
        return b10;
    }

    public final void B(int i6, Object obj, Object obj2) {
        f2226k.putObject(obj, E(i6) & 1048575, obj2);
        p(i6, obj);
    }

    public final Object C(int i6, int i10, Object obj) {
        n6 y9 = y(i10);
        if (!q(i6, i10, obj)) {
            return y9.b();
        }
        Object object = f2226k.getObject(obj, E(i10) & 1048575);
        if (j(object)) {
            return object;
        }
        m5 b10 = y9.b();
        if (object != null) {
            y9.a(b10, object);
        }
        return b10;
    }

    public final void D(Object obj, int i6, Object obj2, int i10) {
        f2226k.putObject(obj, E(i10) & 1048575, obj2);
        y6.g(this.f2227a[i10 + 2] & 1048575, obj, i6);
    }

    public final int E(int i6) {
        return this.f2227a[i6 + 1];
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (j(obj)) {
            obj2.getClass();
            int i6 = 0;
            while (true) {
                int[] iArr = this.f2227a;
                if (i6 < iArr.length) {
                    int E = E(i6);
                    int i10 = E & 1048575;
                    int F = F(E);
                    int i11 = iArr[i6];
                    long j10 = i10;
                    switch (F) {
                        case 0:
                            if (o(i6, obj2)) {
                                x6 x6Var = y6.f2534c;
                                obj3 = obj;
                                x6Var.g(obj3, j10, x6Var.f(j10, obj2));
                                p(i6, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (o(i6, obj2)) {
                                x6 x6Var2 = y6.f2534c;
                                x6Var2.e(obj, j10, x6Var2.d(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (o(i6, obj2)) {
                                y6.i(obj, j10, y6.h(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (o(i6, obj2)) {
                                y6.i(obj, j10, y6.h(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (o(i6, obj2)) {
                                y6.g(j10, obj, y6.f(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (o(i6, obj2)) {
                                y6.i(obj, j10, y6.h(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (o(i6, obj2)) {
                                y6.g(j10, obj, y6.f(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (o(i6, obj2)) {
                                x6 x6Var3 = y6.f2534c;
                                x6Var3.c(obj, j10, x6Var3.b(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (o(i6, obj2)) {
                                y6.k(j10, obj, y6.j(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 9:
                            w(i6, obj, obj2);
                            break;
                        case 10:
                            if (o(i6, obj2)) {
                                y6.k(j10, obj, y6.j(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (o(i6, obj2)) {
                                y6.g(j10, obj, y6.f(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (o(i6, obj2)) {
                                y6.g(j10, obj, y6.f(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (o(i6, obj2)) {
                                y6.g(j10, obj, y6.f(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (o(i6, obj2)) {
                                y6.i(obj, j10, y6.h(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (o(i6, obj2)) {
                                y6.g(j10, obj, y6.f(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (o(i6, obj2)) {
                                y6.i(obj, j10, y6.h(j10, obj2));
                                p(i6, obj);
                                break;
                            }
                            break;
                        case 17:
                            w(i6, obj, obj2);
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
                            s5 s5Var = (s5) y6.j(j10, obj);
                            s5 s5Var2 = (s5) y6.j(j10, obj2);
                            int size = s5Var.size();
                            int size2 = s5Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((w4) s5Var).f2508x) {
                                    s5Var = s5Var.i(size2 + size);
                                }
                                s5Var.addAll(s5Var2);
                            }
                            if (size > 0) {
                                s5Var2 = s5Var;
                            }
                            y6.k(j10, obj, s5Var2);
                            break;
                        case 50:
                            k5 k5Var = o6.f2380a;
                            y6.k(j10, obj, k5.c(y6.j(j10, obj), y6.j(j10, obj2)));
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
                            if (q(i11, i6, obj2)) {
                                y6.k(j10, obj, y6.j(j10, obj2));
                                y6.g(iArr[i6 + 2] & 1048575, obj, i11);
                                break;
                            }
                            break;
                        case 60:
                            x(i6, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        case 65:
                        case 66:
                        case 67:
                            if (q(i11, i6, obj2)) {
                                y6.k(j10, obj, y6.j(j10, obj2));
                                y6.g(iArr[i6 + 2] & 1048575, obj, i11);
                                break;
                            }
                            break;
                        case 68:
                            x(i6, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i6 += 3;
                    obj = obj3;
                } else {
                    o6.b(obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final m5 b() {
        return (m5) ((m5) this.f2231e).o(4);
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final void c(Object obj, a6 a6Var) {
        int i6;
        g6 g6Var = this;
        Unsafe unsafe = f2226k;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (true) {
            int[] iArr = g6Var.f2227a;
            if (i11 < iArr.length) {
                int E = g6Var.E(i11);
                int F = F(E);
                int i14 = iArr[i11];
                if (F <= 17) {
                    int i15 = iArr[i11 + 2];
                    int i16 = i15 & i10;
                    if (i16 != i12) {
                        if (i16 == i10) {
                            i13 = 0;
                        } else {
                            i13 = unsafe.getInt(obj, i16);
                        }
                        i12 = i16;
                    }
                    i6 = 1 << (i15 >>> 20);
                } else {
                    i6 = 0;
                }
                long j10 = E & i10;
                switch (F) {
                    case 0:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).w(i14, Double.doubleToRawLongBits(y6.f2534c.f(j10, obj)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).u(i14, Float.floatToRawIntBits(y6.f2534c.d(j10, obj)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).v(i14, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).v(i14, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).s(i14, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).w(i14, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).u(i14, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            boolean b10 = y6.f2534c.b(j10, obj);
                            d5 d5Var = (d5) a6Var.f2145a;
                            d5Var.A(i14 << 3);
                            d5Var.y(b10 ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            Object object = unsafe.getObject(obj, j10);
                            if (object instanceof String) {
                                d5 d5Var2 = (d5) a6Var.f2145a;
                                d5Var2.A((i14 << 3) | 2);
                                d5Var2.F((String) object);
                                break;
                            } else {
                                d5 d5Var3 = (d5) a6Var.f2145a;
                                d5Var3.A((i14 << 3) | 2);
                                d5Var3.x((c5) object);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            a6Var.d(i14, unsafe.getObject(obj, j10), g6Var.y(i11));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            c5 c5Var = (c5) unsafe.getObject(obj, j10);
                            d5 d5Var4 = (d5) a6Var.f2145a;
                            d5Var4.A((i14 << 3) | 2);
                            d5Var4.x(c5Var);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).t(i14, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).s(i14, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).u(i14, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            ((d5) a6Var.f2145a).w(i14, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            int i17 = unsafe.getInt(obj, j10);
                            ((d5) a6Var.f2145a).t(i14, (i17 >> 31) ^ (i17 + i17));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            long j11 = unsafe.getLong(obj, j10);
                            ((d5) a6Var.f2145a).v(i14, (j11 >> 63) ^ (j11 + j11));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (g6Var.n(obj, i11, i12, i13, i6)) {
                            a6Var.e(i14, unsafe.getObject(obj, j10), g6Var.y(i11));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        o6.c(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 19:
                        o6.d(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 20:
                        o6.e(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 21:
                        o6.f(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                        o6.j(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                        o6.h(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 24:
                        o6.m(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 25:
                        o6.p(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 26:
                        int i18 = iArr[i11];
                        List list = (List) unsafe.getObject(obj, j10);
                        k5 k5Var = o6.f2380a;
                        if (list != null && !list.isEmpty()) {
                            a6Var.getClass();
                            for (int i19 = 0; i19 < list.size(); i19++) {
                                d5 d5Var5 = (d5) a6Var.f2145a;
                                String str = (String) list.get(i19);
                                d5Var5.A((i18 << 3) | 2);
                                d5Var5.F(str);
                            }
                            break;
                        }
                        break;
                    case 27:
                        int i20 = iArr[i11];
                        List list2 = (List) unsafe.getObject(obj, j10);
                        n6 y9 = g6Var.y(i11);
                        k5 k5Var2 = o6.f2380a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i21 = 0; i21 < list2.size(); i21++) {
                                a6Var.d(i20, list2.get(i21), y9);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i22 = iArr[i11];
                        List list3 = (List) unsafe.getObject(obj, j10);
                        k5 k5Var3 = o6.f2380a;
                        if (list3 != null && !list3.isEmpty()) {
                            a6Var.getClass();
                            for (int i23 = 0; i23 < list3.size(); i23++) {
                                d5 d5Var6 = (d5) a6Var.f2145a;
                                c5 c5Var2 = (c5) list3.get(i23);
                                d5Var6.A((i22 << 3) | 2);
                                d5Var6.x(c5Var2);
                            }
                            break;
                        }
                        break;
                    case 29:
                        o6.k(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 30:
                        o6.o(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 31:
                        o6.n(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 32:
                        o6.i(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 33:
                        o6.l(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 34:
                        o6.g(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, false);
                        break;
                    case 35:
                        o6.c(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 36:
                        o6.d(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 37:
                        o6.e(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 38:
                        o6.f(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 39:
                        o6.j(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 40:
                        o6.h(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 41:
                        o6.m(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 42:
                        o6.p(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 43:
                        o6.k(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 44:
                        o6.o(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 45:
                        o6.n(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 46:
                        o6.i(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 47:
                        o6.l(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 48:
                        o6.g(iArr[i11], (List) unsafe.getObject(obj, j10), a6Var, true);
                        break;
                    case 49:
                        int i24 = iArr[i11];
                        List list4 = (List) unsafe.getObject(obj, j10);
                        n6 y10 = g6Var.y(i11);
                        k5 k5Var4 = o6.f2380a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i25 = 0; i25 < list4.size(); i25++) {
                                a6Var.e(i24, list4.get(i25), y10);
                            }
                            break;
                        }
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 != null) {
                            int i26 = i11 / 3;
                            t tVar = ((b6) g6Var.f2228b[i26 + i26]).f2157a;
                            a6Var.getClass();
                            for (Map.Entry entry : ((c6) object2).entrySet()) {
                                d5 d5Var7 = (d5) a6Var.f2145a;
                                d5Var7.r(i14, 2);
                                d5Var7.A(b6.b(tVar, entry.getKey(), entry.getValue()));
                                b6.a(d5Var7, tVar, entry.getKey(), entry.getValue());
                            }
                            break;
                        } else {
                            break;
                        }
                    case 51:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).w(i14, Double.doubleToRawLongBits(((Double) y6.j(j10, obj)).doubleValue()));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).u(i14, Float.floatToRawIntBits(((Float) y6.j(j10, obj)).floatValue()));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).v(i14, l(j10, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).v(i14, l(j10, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).s(i14, k(j10, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).w(i14, l(j10, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).u(i14, k(j10, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (g6Var.q(i14, i11, obj)) {
                            boolean booleanValue = ((Boolean) y6.j(j10, obj)).booleanValue();
                            d5 d5Var8 = (d5) a6Var.f2145a;
                            d5Var8.A(i14 << 3);
                            d5Var8.y(booleanValue ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (g6Var.q(i14, i11, obj)) {
                            Object object3 = unsafe.getObject(obj, j10);
                            if (object3 instanceof String) {
                                d5 d5Var9 = (d5) a6Var.f2145a;
                                d5Var9.A((i14 << 3) | 2);
                                d5Var9.F((String) object3);
                                break;
                            } else {
                                d5 d5Var10 = (d5) a6Var.f2145a;
                                d5Var10.A((i14 << 3) | 2);
                                d5Var10.x((c5) object3);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (g6Var.q(i14, i11, obj)) {
                            a6Var.d(i14, unsafe.getObject(obj, j10), g6Var.y(i11));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (g6Var.q(i14, i11, obj)) {
                            c5 c5Var3 = (c5) unsafe.getObject(obj, j10);
                            d5 d5Var11 = (d5) a6Var.f2145a;
                            d5Var11.A((i14 << 3) | 2);
                            d5Var11.x(c5Var3);
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).t(i14, k(j10, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).s(i14, k(j10, obj));
                            break;
                        } else {
                            break;
                        }
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).u(i14, k(j10, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (g6Var.q(i14, i11, obj)) {
                            ((d5) a6Var.f2145a).w(i14, l(j10, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (g6Var.q(i14, i11, obj)) {
                            int k8 = k(j10, obj);
                            ((d5) a6Var.f2145a).t(i14, (k8 >> 31) ^ (k8 + k8));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (g6Var.q(i14, i11, obj)) {
                            long l10 = l(j10, obj);
                            ((d5) a6Var.f2145a).v(i14, (l10 >> 63) ^ (l10 + l10));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (g6Var.q(i14, i11, obj)) {
                            a6Var.e(i14, unsafe.getObject(obj, j10), g6Var.y(i11));
                            break;
                        } else {
                            break;
                        }
                }
                i11 += 3;
                i10 = 1048575;
                g6Var = this;
            } else {
                ((m5) obj).zzc.b(a6Var);
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004e. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.n6
    public final int d(v4 v4Var) {
        int i6;
        int G;
        int p10;
        int i10;
        int i11;
        int b10;
        int G2;
        int size;
        int r10;
        int G3;
        int G4;
        int G5;
        int i12;
        int G6;
        int p11;
        g6 g6Var = this;
        v4 v4Var2 = v4Var;
        Unsafe unsafe = f2226k;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = g6Var.f2227a;
            if (i14 < iArr.length) {
                int E = g6Var.E(i14);
                int F = F(E);
                int i18 = iArr[i14];
                int i19 = iArr[i14 + 2];
                int i20 = i19 & i13;
                if (F <= 17) {
                    if (i20 != i15) {
                        if (i20 == i13) {
                            i16 = 0;
                        } else {
                            i16 = unsafe.getInt(v4Var2, i20);
                        }
                        i15 = i20;
                    }
                    i6 = 1 << (i19 >>> 20);
                } else {
                    i6 = 0;
                }
                int i21 = E & i13;
                if (F >= i5.f2257y.f2259x) {
                    i5.f2258z.getClass();
                }
                long j10 = i21;
                switch (F) {
                    case 0:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            i17 = r4.a.g(i18 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            i17 = r4.a.g(i18 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            long j11 = unsafe.getLong(v4Var2, j10);
                            G = d5.G(i18 << 3);
                            p10 = d5.p(j11);
                            i10 = p10 + G;
                            i17 += i10;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            long j12 = unsafe.getLong(v4Var2, j10);
                            G = d5.G(i18 << 3);
                            p10 = d5.p(j12);
                            i10 = p10 + G;
                            i17 += i10;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            long j13 = unsafe.getInt(v4Var2, j10);
                            G = d5.G(i18 << 3);
                            p10 = d5.p(j13);
                            i10 = p10 + G;
                            i17 += i10;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            i17 = r4.a.g(i18 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            i17 = r4.a.g(i18 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            i17 = r4.a.g(i18 << 3, 1, i17);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            int i22 = i18 << 3;
                            Object object = unsafe.getObject(v4Var2, j10);
                            if (object instanceof c5) {
                                int G7 = d5.G(i22);
                                int c10 = ((c5) object).c();
                                i17 = r4.a.h(c10, c10, G7, i17);
                                break;
                            } else {
                                G = d5.G(i22);
                                p10 = d5.q((String) object);
                                i10 = p10 + G;
                                i17 += i10;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            Object object2 = unsafe.getObject(v4Var2, j10);
                            n6 y9 = g6Var.y(i14);
                            k5 k5Var = o6.f2380a;
                            int G8 = d5.G(i18 << 3);
                            int b11 = ((v4) object2).b(y9);
                            i17 = r4.a.h(b11, b11, G8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            c5 c5Var = (c5) unsafe.getObject(v4Var2, j10);
                            int G9 = d5.G(i18 << 3);
                            int c11 = c5Var.c();
                            i17 = r4.a.h(c11, c11, G9, i17);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            i17 = r4.a.g(unsafe.getInt(v4Var2, j10), d5.G(i18 << 3), i17);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            long j14 = unsafe.getInt(v4Var2, j10);
                            G = d5.G(i18 << 3);
                            p10 = d5.p(j14);
                            i10 = p10 + G;
                            i17 += i10;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            i17 = r4.a.g(i18 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            i17 = r4.a.g(i18 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            int i23 = unsafe.getInt(v4Var2, j10);
                            i17 = r4.a.g((i23 >> 31) ^ (i23 + i23), d5.G(i18 << 3), i17);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            long j15 = unsafe.getLong(v4Var2, j10);
                            G = d5.G(i18 << 3);
                            p10 = d5.p((j15 >> 63) ^ (j15 + j15));
                            i10 = p10 + G;
                            i17 += i10;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (g6Var.n(v4Var2, i14, i15, i16, i6)) {
                            v4 v4Var3 = (v4) unsafe.getObject(v4Var2, j10);
                            n6 y10 = g6Var.y(i14);
                            int G10 = d5.G(i18 << 3);
                            i11 = G10 + G10;
                            b10 = v4Var3.b(y10);
                            i10 = b10 + i11;
                            i17 += i10;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i10 = o6.y(i18, (List) unsafe.getObject(v4Var2, j10));
                        i17 += i10;
                        break;
                    case 19:
                        i10 = o6.x(i18, (List) unsafe.getObject(v4Var2, j10));
                        i17 += i10;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var2 = o6.f2380a;
                        if (list.size() != 0) {
                            G2 = (d5.G(i18 << 3) * list.size()) + o6.q(list);
                            i17 += G2;
                            break;
                        }
                        G2 = 0;
                        i17 += G2;
                    case 21:
                        List list2 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var3 = o6.f2380a;
                        size = list2.size();
                        if (size != 0) {
                            r10 = o6.r(list2);
                            G3 = d5.G(i18 << 3);
                            G4 = (G3 * size) + r10;
                            i17 += G4;
                            break;
                        }
                        G4 = 0;
                        i17 += G4;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                        List list3 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var4 = o6.f2380a;
                        size = list3.size();
                        if (size != 0) {
                            r10 = o6.u(list3);
                            G3 = d5.G(i18 << 3);
                            G4 = (G3 * size) + r10;
                            i17 += G4;
                            break;
                        }
                        G4 = 0;
                        i17 += G4;
                    case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                        i10 = o6.y(i18, (List) unsafe.getObject(v4Var2, j10));
                        i17 += i10;
                        break;
                    case 24:
                        i10 = o6.x(i18, (List) unsafe.getObject(v4Var2, j10));
                        i17 += i10;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var5 = o6.f2380a;
                        int size2 = list4.size();
                        if (size2 != 0) {
                            G2 = (d5.G(i18 << 3) + 1) * size2;
                            i17 += G2;
                            break;
                        }
                        G2 = 0;
                        i17 += G2;
                    case 26:
                        List list5 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var6 = o6.f2380a;
                        int size3 = list5.size();
                        if (size3 != 0) {
                            G4 = d5.G(i18 << 3) * size3;
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object obj = list5.get(i24);
                                if (obj instanceof c5) {
                                    int c12 = ((c5) obj).c();
                                    G4 = r4.a.g(c12, c12, G4);
                                } else {
                                    G4 = d5.q((String) obj) + G4;
                                }
                            }
                            i17 += G4;
                            break;
                        }
                        G4 = 0;
                        i17 += G4;
                    case 27:
                        List list6 = (List) unsafe.getObject(v4Var2, j10);
                        n6 y11 = g6Var.y(i14);
                        k5 k5Var7 = o6.f2380a;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            G5 = 0;
                        } else {
                            G5 = d5.G(i18 << 3) * size4;
                            for (int i25 = 0; i25 < size4; i25++) {
                                int b12 = ((v4) list6.get(i25)).b(y11);
                                G5 = r4.a.g(b12, b12, G5);
                            }
                        }
                        i17 += G5;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var8 = o6.f2380a;
                        int size5 = list7.size();
                        if (size5 != 0) {
                            G4 = d5.G(i18 << 3) * size5;
                            for (int i26 = 0; i26 < list7.size(); i26++) {
                                int c13 = ((c5) list7.get(i26)).c();
                                G4 = r4.a.g(c13, c13, G4);
                            }
                            i17 += G4;
                            break;
                        }
                        G4 = 0;
                        i17 += G4;
                    case 29:
                        List list8 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var9 = o6.f2380a;
                        size = list8.size();
                        if (size != 0) {
                            r10 = o6.v(list8);
                            G3 = d5.G(i18 << 3);
                            G4 = (G3 * size) + r10;
                            i17 += G4;
                            break;
                        }
                        G4 = 0;
                        i17 += G4;
                    case 30:
                        List list9 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var10 = o6.f2380a;
                        size = list9.size();
                        if (size != 0) {
                            r10 = o6.t(list9);
                            G3 = d5.G(i18 << 3);
                            G4 = (G3 * size) + r10;
                            i17 += G4;
                            break;
                        }
                        G4 = 0;
                        i17 += G4;
                    case 31:
                        i10 = o6.x(i18, (List) unsafe.getObject(v4Var2, j10));
                        i17 += i10;
                        break;
                    case 32:
                        i10 = o6.y(i18, (List) unsafe.getObject(v4Var2, j10));
                        i17 += i10;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var11 = o6.f2380a;
                        size = list10.size();
                        if (size != 0) {
                            r10 = o6.w(list10);
                            G3 = d5.G(i18 << 3);
                            G4 = (G3 * size) + r10;
                            i17 += G4;
                            break;
                        }
                        G4 = 0;
                        i17 += G4;
                    case 34:
                        List list11 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var12 = o6.f2380a;
                        size = list11.size();
                        if (size != 0) {
                            r10 = o6.s(list11);
                            G3 = d5.G(i18 << 3);
                            G4 = (G3 * size) + r10;
                            i17 += G4;
                            break;
                        }
                        G4 = 0;
                        i17 += G4;
                    case 35:
                        List list12 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var13 = o6.f2380a;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            i17 = r4.a.h(size6, d5.G(i18 << 3), size6, i17);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        List list13 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var14 = o6.f2380a;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            i17 = r4.a.h(size7, d5.G(i18 << 3), size7, i17);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int q9 = o6.q((List) unsafe.getObject(v4Var2, j10));
                        if (q9 > 0) {
                            i17 = r4.a.h(q9, d5.G(i18 << 3), q9, i17);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int r11 = o6.r((List) unsafe.getObject(v4Var2, j10));
                        if (r11 > 0) {
                            i17 = r4.a.h(r11, d5.G(i18 << 3), r11, i17);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int u3 = o6.u((List) unsafe.getObject(v4Var2, j10));
                        if (u3 > 0) {
                            i17 = r4.a.h(u3, d5.G(i18 << 3), u3, i17);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        List list14 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var15 = o6.f2380a;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            i17 = r4.a.h(size8, d5.G(i18 << 3), size8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        List list15 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var16 = o6.f2380a;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            i17 = r4.a.h(size9, d5.G(i18 << 3), size9, i17);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list16 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var17 = o6.f2380a;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            i17 = r4.a.h(size10, d5.G(i18 << 3), size10, i17);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int v10 = o6.v((List) unsafe.getObject(v4Var2, j10));
                        if (v10 > 0) {
                            i17 = r4.a.h(v10, d5.G(i18 << 3), v10, i17);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int t10 = o6.t((List) unsafe.getObject(v4Var2, j10));
                        if (t10 > 0) {
                            i17 = r4.a.h(t10, d5.G(i18 << 3), t10, i17);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        List list17 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var18 = o6.f2380a;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            i17 = r4.a.h(size11, d5.G(i18 << 3), size11, i17);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        List list18 = (List) unsafe.getObject(v4Var2, j10);
                        k5 k5Var19 = o6.f2380a;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            i17 = r4.a.h(size12, d5.G(i18 << 3), size12, i17);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int w10 = o6.w((List) unsafe.getObject(v4Var2, j10));
                        if (w10 > 0) {
                            i17 = r4.a.h(w10, d5.G(i18 << 3), w10, i17);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int s = o6.s((List) unsafe.getObject(v4Var2, j10));
                        if (s > 0) {
                            i17 = r4.a.h(s, d5.G(i18 << 3), s, i17);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list19 = (List) unsafe.getObject(v4Var2, j10);
                        n6 y12 = g6Var.y(i14);
                        k5 k5Var20 = o6.f2380a;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            for (int i27 = 0; i27 < size13; i27++) {
                                v4 v4Var4 = (v4) list19.get(i27);
                                int G11 = d5.G(i18 << 3);
                                i12 += v4Var4.b(y12) + G11 + G11;
                            }
                        }
                        i17 += i12;
                        break;
                    case 50:
                        int i28 = i14 / 3;
                        c6 c6Var = (c6) unsafe.getObject(v4Var2, j10);
                        b6 b6Var = (b6) g6Var.f2228b[i28 + i28];
                        if (!c6Var.isEmpty()) {
                            G4 = 0;
                            for (Map.Entry entry : c6Var.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                t tVar = b6Var.f2157a;
                                int G12 = d5.G(i18 << 3);
                                int b13 = b6.b(tVar, key, value);
                                G4 = r4.a.h(b13, b13, G12, G4);
                            }
                            i17 += G4;
                            break;
                        }
                        G4 = 0;
                        i17 += G4;
                    case 51:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            i17 = r4.a.g(i18 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            i17 = r4.a.g(i18 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            long l10 = l(j10, v4Var2);
                            G6 = d5.G(i18 << 3);
                            p11 = d5.p(l10);
                            i17 += p11 + G6;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            long l11 = l(j10, v4Var2);
                            G6 = d5.G(i18 << 3);
                            p11 = d5.p(l11);
                            i17 += p11 + G6;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            long k8 = k(j10, v4Var2);
                            G6 = d5.G(i18 << 3);
                            p11 = d5.p(k8);
                            i17 += p11 + G6;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            i17 = r4.a.g(i18 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            i17 = r4.a.g(i18 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            i17 = r4.a.g(i18 << 3, 1, i17);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            int i29 = i18 << 3;
                            Object object3 = unsafe.getObject(v4Var2, j10);
                            if (object3 instanceof c5) {
                                int G13 = d5.G(i29);
                                int c14 = ((c5) object3).c();
                                i17 = r4.a.h(c14, c14, G13, i17);
                                break;
                            } else {
                                G6 = d5.G(i29);
                                p11 = d5.q((String) object3);
                                i17 += p11 + G6;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            Object object4 = unsafe.getObject(v4Var2, j10);
                            n6 y13 = g6Var.y(i14);
                            k5 k5Var21 = o6.f2380a;
                            int G14 = d5.G(i18 << 3);
                            int b14 = ((v4) object4).b(y13);
                            i17 = r4.a.h(b14, b14, G14, i17);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            c5 c5Var2 = (c5) unsafe.getObject(v4Var2, j10);
                            int G15 = d5.G(i18 << 3);
                            int c15 = c5Var2.c();
                            i17 = r4.a.h(c15, c15, G15, i17);
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            i17 = r4.a.g(k(j10, v4Var2), d5.G(i18 << 3), i17);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            long k9 = k(j10, v4Var2);
                            G6 = d5.G(i18 << 3);
                            p11 = d5.p(k9);
                            i17 += p11 + G6;
                            break;
                        } else {
                            break;
                        }
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            i17 = r4.a.g(i18 << 3, 4, i17);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            i17 = r4.a.g(i18 << 3, 8, i17);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            int k10 = k(j10, v4Var2);
                            i17 = r4.a.g((k10 >> 31) ^ (k10 + k10), d5.G(i18 << 3), i17);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            long l12 = l(j10, v4Var2);
                            G6 = d5.G(i18 << 3);
                            p11 = d5.p((l12 >> 63) ^ (l12 + l12));
                            i17 += p11 + G6;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (g6Var.q(i18, i14, v4Var2)) {
                            v4 v4Var5 = (v4) unsafe.getObject(v4Var2, j10);
                            n6 y14 = g6Var.y(i14);
                            int G16 = d5.G(i18 << 3);
                            i11 = G16 + G16;
                            b10 = v4Var5.b(y14);
                            i10 = b10 + i11;
                            i17 += i10;
                            break;
                        } else {
                            break;
                        }
                }
                i14 += 3;
                g6Var = this;
                v4Var2 = v4Var;
                i13 = 1048575;
            } else {
                return ((m5) v4Var).zzc.c() + i17;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final boolean e(Object obj) {
        int i6;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f2233g) {
            int i15 = this.f2232f[i14];
            int[] iArr = this.f2227a;
            int i16 = iArr[i15];
            int E = E(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f2226k.getInt(obj, i18);
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
            if ((268435456 & E) == 0 || n(obj, i10, i6, i11, i19)) {
                int F = F(E);
                if (F != 9 && F != 17) {
                    if (F != 27) {
                        if (F != 60 && F != 68) {
                            if (F != 49) {
                                if (F != 50) {
                                    continue;
                                } else {
                                    c6 c6Var = (c6) y6.j(E & 1048575, obj);
                                    if (c6Var.isEmpty()) {
                                        continue;
                                    } else {
                                        int i21 = i10 / 3;
                                        if (((b7) ((b6) this.f2228b[i21 + i21]).f2157a.f2426b).f2159x == c7.F) {
                                            n6 n6Var = null;
                                            for (Object obj2 : c6Var.values()) {
                                                if (n6Var == null) {
                                                    n6Var = k6.f2322c.a(obj2.getClass());
                                                }
                                                if (!n6Var.e(obj2)) {
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                i14++;
                                i12 = i6;
                                i13 = i11;
                            }
                        } else {
                            if (q(i16, i10, obj) && !y(i10).e(y6.j(E & 1048575, obj))) {
                            }
                            i14++;
                            i12 = i6;
                            i13 = i11;
                        }
                    }
                    List list = (List) y6.j(E & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        n6 y9 = y(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (y9.e(list.get(i22))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i6;
                    i13 = i11;
                } else {
                    if (n(obj, i10, i6, i11, i19) && !y(i10).e(y6.j(E & 1048575, obj))) {
                    }
                    i14++;
                    i12 = i6;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final void f(Object obj) {
        if (j(obj)) {
            if (obj instanceof m5) {
                m5 m5Var = (m5) obj;
                m5Var.j();
                m5Var.zza = 0;
                m5Var.f();
            }
            int i6 = 0;
            while (true) {
                int[] iArr = this.f2227a;
                if (i6 < iArr.length) {
                    int E = E(i6);
                    int i10 = 1048575 & E;
                    int F = F(E);
                    long j10 = i10;
                    if (F != 9) {
                        if (F != 60 && F != 68) {
                            switch (F) {
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
                                    w4 w4Var = (w4) ((s5) y6.j(j10, obj));
                                    if (!w4Var.f2508x) {
                                        break;
                                    } else {
                                        w4Var.f2508x = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = f2226k;
                                    Object object = unsafe.getObject(obj, j10);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((c6) object).f2170x = false;
                                        unsafe.putObject(obj, j10, object);
                                        break;
                                    }
                            }
                        } else if (q(iArr[i6], i6, obj)) {
                            y(i6).f(f2226k.getObject(obj, j10));
                        }
                        i6 += 3;
                    }
                    if (o(i6, obj)) {
                        y(i6).f(f2226k.getObject(obj, j10));
                    }
                    i6 += 3;
                } else {
                    this.f2235i.getClass();
                    t6 t6Var = ((m5) obj).zzc;
                    if (t6Var.f2451e) {
                        t6Var.f2451e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.n6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(com.google.android.gms.internal.measurement.m5 r8, com.google.android.gms.internal.measurement.m5 r9) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g6.g(com.google.android.gms.internal.measurement.m5, com.google.android.gms.internal.measurement.m5):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final void h(Object obj, byte[] bArr, int i6, int i10, y4 y4Var) {
        t(obj, bArr, i6, i10, 0, y4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01eb, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dd, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.n6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(com.google.android.gms.internal.measurement.m5 r11) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g6.i(com.google.android.gms.internal.measurement.m5):int");
    }

    public final boolean m(m5 m5Var, m5 m5Var2, int i6) {
        if (o(i6, m5Var) == o(i6, m5Var2)) {
            return true;
        }
        return false;
    }

    public final boolean n(Object obj, int i6, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return o(i6, obj);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    public final boolean o(int i6, Object obj) {
        int i10 = this.f2227a[i6 + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int E = E(i6);
            long j11 = E & 1048575;
            switch (F(E)) {
                case 0:
                    if (Double.doubleToRawLongBits(y6.f2534c.f(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(y6.f2534c.d(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (y6.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (y6.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (y6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (y6.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (y6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return y6.f2534c.b(j11, obj);
                case 8:
                    Object j12 = y6.j(j11, obj);
                    if (j12 instanceof String) {
                        if (((String) j12).isEmpty()) {
                            return false;
                        }
                    } else if (j12 instanceof c5) {
                        if (c5.f2166z.equals(j12)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                    break;
                case 9:
                    if (y6.j(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (c5.f2166z.equals(y6.j(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (y6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (y6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (y6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (y6.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (y6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (y6.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (y6.j(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & y6.f(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void p(int i6, Object obj) {
        int i10 = this.f2227a[i6 + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        y6.g(j10, obj, (1 << (i10 >>> 20)) | y6.f(j10, obj));
    }

    public final boolean q(int i6, int i10, Object obj) {
        if (y6.f(this.f2227a[i10 + 2] & 1048575, obj) == i6) {
            return true;
        }
        return false;
    }

    public final int r(int i6, int i10) {
        int[] iArr = this.f2227a;
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

    /* JADX WARN: Code restructure failed: missing block: B:100:0x108a, code lost:
    
        if (r5 > r6) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x108c, code lost:
    
        if (r15 != r11) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x1094, code lost:
    
        throw new java.io.IOException(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0fa4, code lost:
    
        if (r10 == 1048575) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0fa6, code lost:
    
        r0.putInt(r3, r10, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0faa, code lost:
    
        r1 = r39;
        r0 = r1.f2233g;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0fb2, code lost:
    
        if (r0 >= r1.f2234h) goto L735;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0fb4, code lost:
    
        r4 = r1.f2232f[r0];
        r7 = r9[r4];
        r9 = com.google.android.gms.internal.measurement.y6.j(r1.E(r4) & 1048575, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0fc8, code lost:
    
        if (r9 == null) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0fca, code lost:
    
        r10 = r1.z(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0fce, code lost:
    
        if (r10 == null) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0fd0, code lost:
    
        r4 = r4 / 3;
        r4 = ((com.google.android.gms.internal.measurement.b6) r17[r4 + r4]).f2157a;
        r9 = ((com.google.android.gms.internal.measurement.c6) r9).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0fe7, code lost:
    
        if (r9.hasNext() == false) goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0fe9, code lost:
    
        r12 = (java.util.Map.Entry) r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0ffd, code lost:
    
        if (r10.a(((java.lang.Integer) r12.getValue()).intValue()) != false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x00f6, code lost:
    
        r6 = r43;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x00f9, code lost:
    
        r4 = r10;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x00fb, code lost:
    
        r10 = r13;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0fff, code lost:
    
        if (r2 != null) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0177, code lost:
    
        r4 = r3;
        r3 = r2;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x1001, code lost:
    
        r12.getClass();
        r2 = (com.google.android.gms.internal.measurement.m5) r3;
        r13 = r2.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x1009, code lost:
    
        if (r13 != r8) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x100b, code lost:
    
        r13 = com.google.android.gms.internal.measurement.t6.a();
        r2.zzc = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x1011, code lost:
    
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x1012, code lost:
    
        r13 = com.google.android.gms.internal.measurement.b6.b(r4, r12.getKey(), r12.getValue());
        r14 = com.google.android.gms.internal.measurement.c5.f2166z;
        r14 = new byte[r13];
        r18 = r0;
        r0 = new com.google.android.gms.internal.measurement.d5(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x1029, code lost:
    
        com.google.android.gms.internal.measurement.b6.a(r0, r4, r12.getKey(), r12.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x1037, code lost:
    
        if ((r13 - r0.f2186d) != 0) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x1039, code lost:
    
        r2.d((r7 << 3) | 2, new com.google.android.gms.internal.measurement.c5(r14));
        r9.remove();
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x1058, code lost:
    
        throw new java.lang.IllegalStateException("Did not write as much data as expected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x1059, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x105f, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x1068, code lost:
    
        r0 = r0 + 1;
        r1 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x1074, code lost:
    
        if (r2 == null) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x1076, code lost:
    
        ((com.google.android.gms.internal.measurement.m5) r3).zzc = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x107b, code lost:
    
        if (r11 != 0) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x107d, code lost:
    
        if (r5 != r6) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x1087, code lost:
    
        throw new java.io.IOException(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x108e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x1088, code lost:
    
        r10 = r32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:116:0x0cb1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:262:0x04c6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:660:0x00ca. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0f40 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0f55 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0b34 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0b45 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.measurement.y4 r45) {
        /*
            Method dump skipped, instructions count: 4406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g6.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.y4):int");
    }

    public final void w(int i6, Object obj, Object obj2) {
        if (!o(i6, obj2)) {
            return;
        }
        int E = E(i6) & 1048575;
        Unsafe unsafe = f2226k;
        long j10 = E;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            n6 y9 = y(i6);
            if (!o(i6, obj)) {
                if (!j(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    m5 b10 = y9.b();
                    y9.a(b10, object);
                    unsafe.putObject(obj, j10, b10);
                }
                p(i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!j(object2)) {
                m5 b11 = y9.b();
                y9.a(b11, object2);
                unsafe.putObject(obj, j10, b11);
                object2 = b11;
            }
            y9.a(object2, object);
            return;
        }
        int i10 = this.f2227a[i6];
        String obj3 = obj2.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 38 + obj3.length());
        sb2.append("Source subfield ");
        sb2.append(i10);
        sb2.append(" is present but null: ");
        sb2.append(obj3);
        throw new IllegalStateException(sb2.toString());
    }

    public final void x(int i6, Object obj, Object obj2) {
        int[] iArr = this.f2227a;
        int i10 = iArr[i6];
        if (!q(i10, i6, obj2)) {
            return;
        }
        int E = E(i6) & 1048575;
        Unsafe unsafe = f2226k;
        long j10 = E;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            n6 y9 = y(i6);
            if (!q(i10, i6, obj)) {
                if (!j(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    m5 b10 = y9.b();
                    y9.a(b10, object);
                    unsafe.putObject(obj, j10, b10);
                }
                y6.g(iArr[i6 + 2] & 1048575, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!j(object2)) {
                m5 b11 = y9.b();
                y9.a(b11, object2);
                unsafe.putObject(obj, j10, b11);
                object2 = b11;
            }
            y9.a(object2, object);
            return;
        }
        int i11 = iArr[i6];
        String obj3 = obj2.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + obj3.length());
        sb2.append("Source subfield ");
        sb2.append(i11);
        sb2.append(" is present but null: ");
        sb2.append(obj3);
        throw new IllegalStateException(sb2.toString());
    }

    public final n6 y(int i6) {
        int i10 = i6 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f2228b;
        n6 n6Var = (n6) objArr[i11];
        if (n6Var != null) {
            return n6Var;
        }
        n6 a10 = k6.f2322c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final p5 z(int i6) {
        int i10 = i6 / 3;
        return (p5) this.f2228b[i10 + i10 + 1];
    }
}
