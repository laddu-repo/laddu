package ef;

import com.unity3d.services.UnityAdsConstants;
import e2.u;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4576a = {1, 10, 100, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4577b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4578c = {3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4579d = {1, 2, 4, 5, 7, 8};

    public static final long a(String str) {
        int i6;
        boolean z10;
        c cVar;
        long f3;
        char charAt;
        int length = str.length();
        if (length != 0) {
            int i10 = a.A;
            char charAt2 = str.charAt(0);
            if (charAt2 != '+' && charAt2 != '-') {
                i6 = 0;
            } else {
                i6 = 1;
            }
            if (i6 > 0 && df.m.c0(str, '-')) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (length > i6) {
                if (str.charAt(i6) == 'P') {
                    int i11 = i6 + 1;
                    if (i11 != length) {
                        c cVar2 = null;
                        long j = 0;
                        boolean z11 = false;
                        while (i11 < length) {
                            if (str.charAt(i11) == 'T') {
                                if (!z11 && (i11 = i11 + 1) != length) {
                                    z11 = true;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                int i12 = i11;
                                while (i12 < str.length() && (('0' <= (charAt = str.charAt(i12)) && charAt < ':') || df.m.J("+-.", charAt))) {
                                    i12++;
                                }
                                String substring = str.substring(i11, i12);
                                kotlin.jvm.internal.k.d(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = substring.length() + i11;
                                    if (length2 >= 0 && length2 < str.length()) {
                                        char charAt3 = str.charAt(length2);
                                        int i13 = length2 + 1;
                                        if (!z11) {
                                            if (charAt3 == 'D') {
                                                cVar = c.DAYS;
                                            } else {
                                                throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                                            }
                                        } else if (charAt3 != 'H') {
                                            if (charAt3 != 'M') {
                                                if (charAt3 == 'S') {
                                                    cVar = c.SECONDS;
                                                } else {
                                                    throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                                                }
                                            } else {
                                                cVar = c.MINUTES;
                                            }
                                        } else {
                                            cVar = c.HOURS;
                                        }
                                        if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        int P = df.m.P(substring, '.', 0, 6);
                                        if (cVar == c.SECONDS && P > 0) {
                                            String substring2 = substring.substring(0, P);
                                            kotlin.jvm.internal.k.d(substring2, "substring(...)");
                                            long f10 = a.f(j, p(m(substring2), cVar));
                                            String substring3 = substring.substring(P);
                                            kotlin.jvm.internal.k.d(substring3, "substring(...)");
                                            double parseDouble = Double.parseDouble(substring3);
                                            double b10 = b(parseDouble, cVar, c.NANOSECONDS);
                                            if (!Double.isNaN(b10)) {
                                                if (!Double.isNaN(b10)) {
                                                    long round = Math.round(b10);
                                                    if (-4611686018426999999L <= round && round < 4611686018427000000L) {
                                                        f3 = g(round);
                                                    } else {
                                                        double b11 = b(parseDouble, cVar, c.MILLISECONDS);
                                                        if (!Double.isNaN(b11)) {
                                                            f3 = f(Math.round(b11));
                                                        } else {
                                                            throw new IllegalArgumentException("Cannot round NaN value.");
                                                        }
                                                    }
                                                    j = a.f(f10, f3);
                                                } else {
                                                    throw new IllegalArgumentException("Cannot round NaN value.");
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Duration value cannot be NaN.");
                                            }
                                        } else {
                                            j = a.f(j, p(m(substring), cVar));
                                        }
                                        cVar2 = cVar;
                                        i11 = i13;
                                    } else {
                                        throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                        if (z10) {
                            return a.i(j);
                        }
                        return j;
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    public static final double b(double d10, c sourceUnit, c targetUnit) {
        kotlin.jvm.internal.k.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.k.e(targetUnit, "targetUnit");
        long convert = targetUnit.f4572x.convert(1L, sourceUnit.f4572x);
        if (convert > 0) {
            return d10 * convert;
        }
        return d10 / r9.convert(1L, r10);
    }

    public static final long c(long j, c sourceUnit, c targetUnit) {
        kotlin.jvm.internal.k.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.k.e(targetUnit, "targetUnit");
        return targetUnit.f4572x.convert(j, sourceUnit.f4572x);
    }

    public static final long d(long j, c sourceUnit, c targetUnit) {
        kotlin.jvm.internal.k.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.k.e(targetUnit, "targetUnit");
        return targetUnit.f4572x.convert(j, sourceUnit.f4572x);
    }

    public static final long e(long j) {
        long j10 = (j << 1) + 1;
        int i6 = a.A;
        int i10 = b.f4569a;
        return j10;
    }

    public static final long f(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return g(j * 1000000);
        }
        return e(android.support.v4.media.session.b.e(j, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long g(long j) {
        long j10 = j << 1;
        int i6 = a.A;
        int i10 = b.f4569a;
        return j10;
    }

    public static final void h(StringBuilder sb2, StringBuilder sb3, int i6) {
        if (i6 < 10) {
            sb2.append('0');
        }
        sb3.append(i6);
    }

    public static final long i(long j) {
        int i6 = a.A;
        if (j < 0) {
            return a.f4567z;
        }
        return a.f4566y;
    }

    public static final u j(String str, String str2, int i6, ve.l lVar) {
        char charAt = str.charAt(i6);
        if (((Boolean) lVar.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return k(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i6);
    }

    public static final u k(String str, String str2) {
        return new u(str2 + " when parsing an Instant from \"" + q(64, str) + '\"', str);
    }

    public static final int l(int i6, String str) {
        return (str.charAt(i6 + 1) - '0') + ((str.charAt(i6) - '0') * 10);
    }

    public static final long m(String str) {
        int i6;
        char charAt;
        int length = str.length();
        if (length > 0 && df.m.J("+-", str.charAt(0))) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (length - i6 > 16) {
            int i10 = i6;
            while (true) {
                if (i6 < length) {
                    char charAt2 = str.charAt(i6);
                    if (charAt2 == '0') {
                        if (i10 == i6) {
                            i10++;
                        }
                    } else if ('1' > charAt2 || charAt2 >= ':') {
                        break;
                    }
                    i6++;
                } else if (length - i10 > 16) {
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
            }
        }
        if (df.u.H(str, "+", false) && length > 1 && '0' <= (charAt = str.charAt(1)) && charAt < ':') {
            return Long.parseLong(df.m.K(1, str));
        }
        return Long.parseLong(str);
    }

    public static final long n(long j, long j10, c cVar) {
        long j11 = j - j10;
        if (((j11 ^ j) & (~(j11 ^ j10))) < 0) {
            c cVar2 = c.MILLISECONDS;
            if (cVar.compareTo(cVar2) < 0) {
                long c10 = c(1L, cVar2, cVar);
                long j12 = (j / c10) - (j10 / c10);
                long j13 = (j % c10) - (j10 % c10);
                int i6 = a.A;
                return a.f(p(j12, cVar2), p(j13, cVar));
            }
            return a.i(i(j11));
        }
        return p(j11, cVar);
    }

    public static final long o(int i6, c unit) {
        kotlin.jvm.internal.k.e(unit, "unit");
        if (unit.compareTo(c.SECONDS) <= 0) {
            return g(d(i6, unit, c.NANOSECONDS));
        }
        return p(i6, unit);
    }

    public static final long p(long j, c unit) {
        kotlin.jvm.internal.k.e(unit, "unit");
        c cVar = c.NANOSECONDS;
        long d10 = d(4611686018426999999L, cVar, unit);
        if ((-d10) <= j && j <= d10) {
            return g(d(j, unit, cVar));
        }
        return e(android.support.v4.media.session.b.e(c(j, unit, c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    public static final String q(int i6, String str) {
        if (str.length() <= i6) {
            return str.toString();
        }
        return str.subSequence(0, i6).toString() + "...";
    }
}
