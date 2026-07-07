package a8;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.c5;
import com.google.android.gms.internal.measurement.g6;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.y4;
import ie.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.z;
import okhttp3.HttpUrl;
import ve.p;
import yf.s;
import yf.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {
    public static int A(byte[] bArr, int i6, y4 y4Var) {
        int v10 = v(bArr, i6, y4Var);
        int i10 = y4Var.f2526a;
        if (i10 >= 0) {
            if (i10 == 0) {
                y4Var.f2528c = HttpUrl.FRAGMENT_ENCODE_SET;
                return v10;
            }
            int i11 = a7.f2146a;
            int length = bArr.length;
            if ((((length - v10) - i10) | v10 | i10) >= 0) {
                int i12 = v10 + i10;
                char[] cArr = new char[i10];
                int i13 = 0;
                while (v10 < i12) {
                    byte b10 = bArr[v10];
                    if (b10 < 0) {
                        break;
                    }
                    v10++;
                    cArr[i13] = (char) b10;
                    i13++;
                }
                while (v10 < i12) {
                    int i14 = v10 + 1;
                    byte b11 = bArr[v10];
                    if (b11 >= 0) {
                        cArr[i13] = (char) b11;
                        i13++;
                        v10 = i14;
                        while (v10 < i12) {
                            byte b12 = bArr[v10];
                            if (b12 >= 0) {
                                v10++;
                                cArr[i13] = (char) b12;
                                i13++;
                            }
                        }
                    } else if (b11 < -32) {
                        if (i14 < i12) {
                            int i15 = i13 + 1;
                            v10 += 2;
                            byte b13 = bArr[i14];
                            if (b11 >= -62 && !g.r(b13)) {
                                cArr[i13] = (char) ((b13 & 63) | ((b11 & 31) << 6));
                                i13 = i15;
                            } else {
                                throw new IOException("Protocol message had invalid UTF-8.");
                            }
                        } else {
                            throw new IOException("Protocol message had invalid UTF-8.");
                        }
                    } else {
                        if (b11 < -16) {
                            if (i14 < i12 - 1) {
                                int i16 = i13 + 1;
                                int i17 = v10 + 2;
                                byte b14 = bArr[i14];
                                v10 += 3;
                                byte b15 = bArr[i17];
                                if (!g.r(b14)) {
                                    if (b11 == -32) {
                                        if (b14 >= -96) {
                                            b11 = -32;
                                        }
                                    }
                                    if (b11 == -19) {
                                        if (b14 < -96) {
                                            b11 = -19;
                                        }
                                    }
                                    if (!g.r(b15)) {
                                        cArr[i13] = (char) (((b14 & 63) << 6) | ((b11 & 15) << 12) | (b15 & 63));
                                        i13 = i16;
                                    }
                                }
                                throw new IOException("Protocol message had invalid UTF-8.");
                            }
                            throw new IOException("Protocol message had invalid UTF-8.");
                        }
                        if (i14 < i12 - 2) {
                            byte b16 = bArr[i14];
                            int i18 = v10 + 3;
                            byte b17 = bArr[v10 + 2];
                            v10 += 4;
                            byte b18 = bArr[i18];
                            if (!g.r(b16) && (((b16 + 112) + (b11 << 28)) >> 30) == 0 && !g.r(b17) && !g.r(b18)) {
                                int i19 = ((b16 & 63) << 12) | ((b11 & 7) << 18) | ((b17 & 63) << 6) | (b18 & 63);
                                cArr[i13] = (char) ((i19 >>> 10) + 55232);
                                cArr[i13 + 1] = (char) ((i19 & 1023) + 56320);
                                i13 += 2;
                            } else {
                                throw new IOException("Protocol message had invalid UTF-8.");
                            }
                        } else {
                            throw new IOException("Protocol message had invalid UTF-8.");
                        }
                    }
                }
                y4Var.f2528c = new String(cArr, 0, i13);
                return i12;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(v10), Integer.valueOf(i10)));
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int B(byte[] bArr, int i6, y4 y4Var) {
        int v10 = v(bArr, i6, y4Var);
        int i10 = y4Var.f2526a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - v10) {
                if (i10 == 0) {
                    y4Var.f2528c = c5.f2166z;
                    return v10;
                }
                y4Var.f2528c = c5.d(bArr, v10, i10);
                return v10 + i10;
            }
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int C(Object obj, n6 n6Var, byte[] bArr, int i6, int i10, y4 y4Var) {
        int i11 = i6 + 1;
        int i12 = bArr[i6];
        if (i12 < 0) {
            i11 = w(i12, bArr, i11, y4Var);
            i12 = y4Var.f2526a;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = y4Var.f2529d + 1;
            y4Var.f2529d = i14;
            if (i14 < 100) {
                int i15 = i13 + i12;
                n6Var.h(obj, bArr, i13, i15, y4Var);
                y4Var.f2529d--;
                y4Var.f2528c = obj;
                return i15;
            }
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int D(Object obj, n6 n6Var, byte[] bArr, int i6, int i10, int i11, y4 y4Var) {
        g6 g6Var = (g6) n6Var;
        int i12 = y4Var.f2529d + 1;
        y4Var.f2529d = i12;
        if (i12 < 100) {
            int t10 = g6Var.t(obj, bArr, i6, i10, i11, y4Var);
            y4Var.f2529d--;
            y4Var.f2528c = obj;
            return t10;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int E(int i6, byte[] bArr, int i10, int i11, s5 s5Var, y4 y4Var) {
        n5 n5Var = (n5) s5Var;
        int v10 = v(bArr, i10, y4Var);
        n5Var.d(y4Var.f2526a);
        while (v10 < i11) {
            int v11 = v(bArr, v10, y4Var);
            if (i6 != y4Var.f2526a) {
                break;
            }
            v10 = v(bArr, v11, y4Var);
            n5Var.d(y4Var.f2526a);
        }
        return v10;
    }

    public static int F(byte[] bArr, int i6, s5 s5Var, y4 y4Var) {
        n5 n5Var = (n5) s5Var;
        int v10 = v(bArr, i6, y4Var);
        int i10 = y4Var.f2526a + v10;
        while (v10 < i10) {
            v10 = v(bArr, v10, y4Var);
            n5Var.d(y4Var.f2526a);
        }
        if (v10 == i10) {
            return v10;
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int G(n6 n6Var, int i6, byte[] bArr, int i10, int i11, s5 s5Var, y4 y4Var) {
        m5 b10 = n6Var.b();
        n6 n6Var2 = n6Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        y4 y4Var2 = y4Var;
        int C = C(b10, n6Var2, bArr2, i10, i12, y4Var2);
        n6Var2.f(b10);
        y4Var2.f2528c = b10;
        s5Var.add(b10);
        while (C < i12) {
            y4 y4Var3 = y4Var2;
            int i13 = i12;
            int v10 = v(bArr2, C, y4Var3);
            if (i6 != y4Var3.f2526a) {
                break;
            }
            byte[] bArr3 = bArr2;
            n6 n6Var3 = n6Var2;
            m5 b11 = n6Var3.b();
            C = C(b11, n6Var3, bArr3, v10, i13, y4Var3);
            n6Var2 = n6Var3;
            bArr2 = bArr3;
            i12 = i13;
            y4Var2 = y4Var3;
            n6Var2.f(b11);
            y4Var2.f2528c = b11;
            s5Var.add(b11);
        }
        return C;
    }

    public static int H(int i6, byte[] bArr, int i10, int i11, t6 t6Var, y4 y4Var) {
        if ((i6 >>> 3) != 0) {
            int i12 = i6 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                t6Var.d(i6, Integer.valueOf(y(i10, bArr)));
                                return i10 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int i13 = (i6 & (-8)) | 4;
                        t6 a10 = t6.a();
                        int i14 = y4Var.f2529d + 1;
                        y4Var.f2529d = i14;
                        if (i14 < 100) {
                            int i15 = 0;
                            while (true) {
                                if (i10 >= i11) {
                                    break;
                                }
                                int v10 = v(bArr, i10, y4Var);
                                int i16 = y4Var.f2526a;
                                if (i16 == i13) {
                                    i15 = i16;
                                    i10 = v10;
                                    break;
                                }
                                i10 = H(i16, bArr, v10, i11, a10, y4Var);
                                i15 = i16;
                            }
                            y4Var.f2529d--;
                            if (i10 <= i11 && i15 == i13) {
                                t6Var.d(i6, a10);
                                return i10;
                            }
                            throw new IOException("Failed to parse the message.");
                        }
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int v11 = v(bArr, i10, y4Var);
                    int i17 = y4Var.f2526a;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - v11) {
                            if (i17 == 0) {
                                t6Var.d(i6, c5.f2166z);
                            } else {
                                t6Var.d(i6, c5.d(bArr, v11, i17));
                            }
                            return v11 + i17;
                        }
                        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                t6Var.d(i6, Long.valueOf(z(i10, bArr)));
                return i10 + 8;
            }
            int x10 = x(bArr, i10, y4Var);
            t6Var.d(i6, Long.valueOf(y4Var.f2527b));
            return x10;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int I(int i6, byte[] bArr, int i10, int i11, y4 y4Var) {
        if ((i6 >>> 3) != 0) {
            int i12 = i6 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                return i10 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int i13 = (i6 & (-8)) | 4;
                        int i14 = 0;
                        while (i10 < i11) {
                            i10 = v(bArr, i10, y4Var);
                            i14 = y4Var.f2526a;
                            if (i14 == i13) {
                                break;
                            }
                            i10 = I(i14, bArr, i10, i11, y4Var);
                        }
                        if (i10 <= i11 && i14 == i13) {
                            return i10;
                        }
                        throw new IOException("Failed to parse the message.");
                    }
                    return v(bArr, i10, y4Var) + y4Var.f2526a;
                }
                return i10 + 8;
            }
            return x(bArr, i10, y4Var);
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static final void a(t tVar) {
        t tVar2;
        kotlin.jvm.internal.k.e(tVar, "<this>");
        if (tVar instanceof t) {
            tVar2 = tVar;
        } else {
            tVar2 = null;
        }
        if (tVar2 != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + x.a(tVar.getClass()));
    }

    public static final s b(vf.b bVar) {
        s sVar;
        kotlin.jvm.internal.k.e(bVar, "<this>");
        if (bVar instanceof s) {
            sVar = (s) bVar;
        } else {
            sVar = null;
        }
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + x.a(bVar.getClass()));
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static le.c e(le.c cVar, le.c cVar2, p pVar) {
        if (pVar instanceof ne.a) {
            return ((ne.a) pVar).create(cVar, cVar2);
        }
        le.h context = cVar2.getContext();
        if (context == le.i.f8353x) {
            return new me.b(cVar2, cVar, pVar);
        }
        return new me.c(cVar2, context, pVar, cVar);
    }

    public static int g(int i6) {
        if (i6 != 1) {
            if (i6 == 2) {
                return 1;
            }
            if (i6 == 4) {
                return 2;
            }
            if (i6 != 8) {
                if (i6 == 16) {
                    return 4;
                }
                if (i6 != 32) {
                    if (i6 != 64) {
                        if (i6 != 128) {
                            if (i6 == 256) {
                                return 8;
                            }
                            if (i6 == 512) {
                                return 9;
                            }
                            throw new IllegalArgumentException(h8.c.i(i6, "type needs to be >= FIRST and <= LAST, type="));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(final android.content.Context r4) {
        /*
            android.content.SharedPreferences r0 = a8.d.e(r4)
            java.lang.String r1 = "proxy_notification_initialized"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto Le
            goto L50
        Le:
            java.lang.String r0 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r1 = r4.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 == 0) goto L37
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r1 == 0) goto L37
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 == 0) goto L37
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 == 0) goto L37
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            boolean r0 = r1.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            goto L38
        L37:
            r0 = 1
        L38:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L4c
            s9.h r1 = new s9.h
            r1.<init>()
            ic.q r2 = new ic.q
            r2.<init>()
            r2.run()
            goto L50
        L4c:
            r4 = 0
            dg.b.j(r4)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.c.h(android.content.Context):void");
    }

    public static le.c i(le.c cVar) {
        ne.c cVar2;
        le.c intercepted;
        kotlin.jvm.internal.k.e(cVar, "<this>");
        if (cVar instanceof ne.c) {
            cVar2 = (ne.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }

    public static final List p(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(arrayList));
            }
            return Collections.singletonList(ie.j.G(arrayList));
        }
        return r.f6846x;
    }

    public static final Map q(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) ie.j.F(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return ie.s.f6847x;
    }

    public static final he.r r(String str) {
        int i6;
        a.a.g(10);
        int length = str.length();
        if (length != 0) {
            int i10 = 0;
            char charAt = str.charAt(0);
            if (kotlin.jvm.internal.k.g(charAt, 48) < 0) {
                i6 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i6 = 0;
            }
            int i11 = 119304647;
            while (i6 < length) {
                int digit = Character.digit((int) str.charAt(i6), 10);
                if (digit >= 0) {
                    int i12 = i10 ^ Integer.MIN_VALUE;
                    if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                        if (i11 == 119304647) {
                            i11 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                            if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int i13 = i10 * 10;
                    int i14 = digit + i13;
                    if (Integer.compare(i14 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) < 0) {
                        return null;
                    }
                    i6++;
                    i10 = i14;
                } else {
                    return null;
                }
            }
            return new he.r(i10);
        }
        return null;
    }

    public static final he.t s(String str) {
        int i6;
        long j;
        int i10;
        kotlin.jvm.internal.k.e(str, "<this>");
        int i11 = 10;
        a.a.g(10);
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            char c10 = 1;
            if (kotlin.jvm.internal.k.g(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i6 = 1;
                } else {
                    return null;
                }
            } else {
                i6 = 0;
            }
            long j10 = 10;
            long j11 = 0;
            long j12 = 512409557603043100L;
            while (i6 < length) {
                int digit = Character.digit((int) str.charAt(i6), i11);
                if (digit >= 0) {
                    int i12 = length;
                    long j13 = j11 ^ Long.MIN_VALUE;
                    int i13 = i6;
                    if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                        if (j12 == 512409557603043100L) {
                            if (j10 < 0) {
                                if (Long.MAX_VALUE < (j10 ^ Long.MIN_VALUE)) {
                                    j = j10;
                                    j12 = 0;
                                } else {
                                    j12 = 1;
                                    j = j10;
                                }
                            } else {
                                long j14 = (Long.MAX_VALUE / j10) << c10;
                                if ((((-1) - (j14 * j10)) ^ Long.MIN_VALUE) >= (j10 ^ Long.MIN_VALUE)) {
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                                j = j10;
                                j12 = j14 + i10;
                            }
                            if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    } else {
                        j = j10;
                    }
                    long j15 = j11 * j;
                    long j16 = (digit & 4294967295L) + j15;
                    if (Long.compare(j16 ^ Long.MIN_VALUE, j15 ^ Long.MIN_VALUE) < 0) {
                        return null;
                    }
                    i6 = i13 + 1;
                    j11 = j16;
                    length = i12;
                    j10 = j;
                    i11 = 10;
                    c10 = 1;
                } else {
                    return null;
                }
            }
            return new he.t(j11);
        }
        return null;
    }

    public static Object u(p pVar, Object obj, le.c cVar) {
        Object cVar2;
        kotlin.jvm.internal.k.e(pVar, "<this>");
        le.h context = cVar.getContext();
        if (context == le.i.f8353x) {
            cVar2 = new ne.h(cVar);
        } else {
            cVar2 = new ne.c(cVar, context);
        }
        z.c(2, pVar);
        return pVar.invoke(obj, cVar2);
    }

    public static int v(byte[] bArr, int i6, y4 y4Var) {
        int i10 = i6 + 1;
        byte b10 = bArr[i6];
        if (b10 >= 0) {
            y4Var.f2526a = b10;
            return i10;
        }
        return w(b10, bArr, i10, y4Var);
    }

    public static int w(int i6, byte[] bArr, int i10, y4 y4Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i6 & 127;
        if (b10 >= 0) {
            y4Var.f2526a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            y4Var.f2526a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            y4Var.f2526a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            y4Var.f2526a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                y4Var.f2526a = i19;
                return i20;
            }
        }
    }

    public static int x(byte[] bArr, int i6, y4 y4Var) {
        long j = bArr[i6];
        int i10 = i6 + 1;
        if (j >= 0) {
            y4Var.f2527b = j;
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
        y4Var.f2527b = j10;
        return i11;
    }

    public static int y(int i6, byte[] bArr) {
        int i10 = bArr[i6] & 255;
        int i11 = bArr[i6 + 1] & 255;
        int i12 = bArr[i6 + 2] & 255;
        return ((bArr[i6 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static long z(int i6, byte[] bArr) {
        return (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48) | ((bArr[i6 + 7] & 255) << 56);
    }

    public boolean c() {
        return false;
    }

    public abstract InputFilter[] f(InputFilter[] inputFilterArr);

    public abstract boolean j();

    public abstract void l(boolean z10);

    public abstract void m(boolean z10);

    public abstract void n();

    public abstract void o();

    public abstract TransformationMethod t(TransformationMethod transformationMethod);

    public void k() {
    }
}
