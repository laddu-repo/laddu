package cg;

import bg.c0;
import bg.f0;
import bg.i0;
import df.m;
import df.u;
import ie.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k;
import okhttp3.internal.ws.WebSocketProtocol;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2089a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = c0.f1692y;
        c0 t10 = zb.d.t("/");
        LinkedHashMap z10 = w.z(new he.i(t10, new g(t10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (g gVar : ie.j.T(arrayList, new h(0))) {
            if (((g) z10.put(gVar.f2104a, gVar)) == null) {
                while (true) {
                    c0 c0Var = gVar.f2104a;
                    c0 b10 = c0Var.b();
                    if (b10 != null) {
                        g gVar2 = (g) z10.get(b10);
                        if (gVar2 != null) {
                            gVar2.f2119q.add(c0Var);
                            break;
                        }
                        g gVar3 = new g(b10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        z10.put(b10, gVar3);
                        gVar3.f2119q.add(c0Var);
                        gVar = gVar3;
                    }
                }
            }
        }
        return z10;
    }

    public static final String c(int i6) {
        a.a.g(16);
        String num = Integer.toString(i6, 16);
        k.d(num, "toString(...)");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.jvm.internal.w] */
    public static final g d(f0 f0Var) {
        long j;
        long j10;
        int l10 = f0Var.l();
        if (l10 == 33639248) {
            f0Var.skip(4L);
            short y9 = f0Var.y();
            int i6 = y9 & 65535;
            if ((y9 & 1) == 0) {
                int y10 = f0Var.y() & 65535;
                int y11 = f0Var.y() & 65535;
                int y12 = f0Var.y() & 65535;
                long l11 = f0Var.l() & 4294967295L;
                ?? obj = new Object();
                obj.f8054x = f0Var.l() & 4294967295L;
                ?? obj2 = new Object();
                obj2.f8054x = f0Var.l() & 4294967295L;
                int y13 = f0Var.y() & 65535;
                int y14 = f0Var.y() & 65535;
                int y15 = 65535 & f0Var.y();
                f0Var.skip(8L);
                ?? obj3 = new Object();
                obj3.f8054x = f0Var.l() & 4294967295L;
                String K = f0Var.K(y13);
                if (!m.J(K, (char) 0)) {
                    if (obj2.f8054x == 4294967295L) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (obj.f8054x == 4294967295L) {
                        j10 = j + 8;
                    } else {
                        j10 = j;
                    }
                    if (obj3.f8054x == 4294967295L) {
                        j10 += 8;
                    }
                    long j11 = j10;
                    ?? obj4 = new Object();
                    ?? obj5 = new Object();
                    ?? obj6 = new Object();
                    ?? obj7 = new Object();
                    e(f0Var, y14, new j(obj7, j11, obj2, f0Var, obj, obj3, obj4, obj5, obj6));
                    if (j11 > 0 && !obj7.f8051x) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String K2 = f0Var.K(y15);
                    String str = c0.f1692y;
                    return new g(zb.d.t("/").d(K), u.z(K, "/", false), K2, l11, obj.f8054x, obj2.f8054x, y10, obj3.f8054x, y12, y11, (Long) obj4.f8055x, (Long) obj5.f8055x, (Long) obj6.f8055x, 57344);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i6));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(l10));
    }

    public static final void e(f0 f0Var, int i6, p pVar) {
        bg.k kVar = f0Var.f1708y;
        long j = i6;
        while (j != 0) {
            if (j >= 4) {
                int y9 = f0Var.y() & 65535;
                long y10 = f0Var.y() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                long j10 = j - 4;
                if (j10 >= y10) {
                    f0Var.Y(y10);
                    long j11 = kVar.f1726y;
                    pVar.invoke(Integer.valueOf(y9), Long.valueOf(y10));
                    long j12 = (kVar.f1726y + y10) - j11;
                    if (j12 >= 0) {
                        if (j12 > 0) {
                            kVar.skip(j12);
                        }
                        j = j10 - y10;
                    } else {
                        throw new IOException(h8.c.i(y9, "unsupported zip: too many bytes processed for "));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    public static final g f(f0 f0Var, g gVar) {
        int l10 = f0Var.l();
        if (l10 == 67324752) {
            f0Var.skip(2L);
            short y9 = f0Var.y();
            int i6 = y9 & 65535;
            if ((y9 & 1) == 0) {
                f0Var.skip(18L);
                long y10 = f0Var.y() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                int y11 = f0Var.y() & 65535;
                f0Var.skip(y10);
                if (gVar == null) {
                    f0Var.skip(y11);
                    return null;
                }
                ?? obj = new Object();
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                e(f0Var, y11, new i(f0Var, (kotlin.jvm.internal.w) obj, (kotlin.jvm.internal.w) obj2, (kotlin.jvm.internal.w) obj3));
                return new g(gVar.f2104a, gVar.f2105b, gVar.f2106c, gVar.f2107d, gVar.f2108e, gVar.f2109f, gVar.f2110g, gVar.f2111h, gVar.f2112i, gVar.j, gVar.f2113k, gVar.f2114l, gVar.f2115m, (Integer) obj.f8055x, (Integer) obj2.f8055x, (Integer) obj3.f8055x);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i6));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(l10));
    }

    public static final int g(i0 i0Var, int i6) {
        int i10;
        int[] iArr = i0Var.C;
        int i11 = i6 + 1;
        int length = i0Var.B.length;
        k.e(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 < i11) {
                    i13 = i10 + 1;
                } else {
                    if (i14 <= i11) {
                        break;
                    }
                    i12 = i10 - 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        return ~i10;
    }
}
