package ef;

import com.unity3d.services.UnityAdsConstants;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Comparable {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y, reason: collision with root package name */
    public static final long f4566y;

    /* renamed from: z, reason: collision with root package name */
    public static final long f4567z;

    /* renamed from: x, reason: collision with root package name */
    public final long f4568x;

    static {
        int i6 = b.f4569a;
        f4566y = f.e(4611686018427387903L);
        f4567z = f.e(-4611686018427387903L);
    }

    public static final long a(long j, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j + j12;
        if (-4611686018426L <= j13 && j13 < 4611686018427L) {
            return f.g((j13 * j11) + (j10 - (j12 * j11)));
        }
        return f.e(android.support.v4.media.session.b.e(j13, -4611686018427387903L, 4611686018427387903L));
    }

    public static final void b(StringBuilder sb2, int i6, int i10, int i11, String str, boolean z10) {
        sb2.append(i6);
        if (i10 != 0) {
            sb2.append('.');
            String V = df.m.V(i11, String.valueOf(i10));
            int i12 = -1;
            int length = V.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (V.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (!z10 && i14 < 3) {
                sb2.append((CharSequence) V, 0, i14);
            } else {
                sb2.append((CharSequence) V, 0, ((i12 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static int c(long j, long j10) {
        long j11 = j ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i6 = (((int) j) & 1) - (((int) j10) & 1);
            if (j < 0) {
                return -i6;
            }
            return i6;
        }
        if (j < j10) {
            return -1;
        }
        if (j != j10) {
            return 1;
        }
        return 0;
    }

    public static final int d(long j) {
        long j10;
        if (e(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            j10 = ((j >> 1) % UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) * 1000000;
        } else {
            j10 = (j >> 1) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        return (int) j10;
    }

    public static final boolean e(long j) {
        if (j != f4566y && j != f4567z) {
            return false;
        }
        return true;
    }

    public static final long f(long j, long j10) {
        if (e(j)) {
            if (e(j10) && (j10 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        }
        if (e(j10)) {
            return j10;
        }
        int i6 = ((int) j) & 1;
        if (i6 == (((int) j10) & 1)) {
            long j11 = (j >> 1) + (j10 >> 1);
            if (i6 == 0) {
                if (-4611686018426999999L <= j11 && j11 < 4611686018427000000L) {
                    return f.g(j11);
                }
                return f.e(j11 / 1000000);
            }
            return f.f(j11);
        }
        if (i6 == 1) {
            return a(j >> 1, j10 >> 1);
        }
        return a(j10 >> 1, j >> 1);
    }

    public static final double g(long j, c unit) {
        c cVar;
        kotlin.jvm.internal.k.e(unit, "unit");
        if (j == f4566y) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f4567z) {
            return Double.NEGATIVE_INFINITY;
        }
        double d10 = j >> 1;
        if ((((int) j) & 1) == 0) {
            cVar = c.NANOSECONDS;
        } else {
            cVar = c.MILLISECONDS;
        }
        return f.b(d10, cVar, unit);
    }

    public static final long h(long j, c unit) {
        c cVar;
        kotlin.jvm.internal.k.e(unit, "unit");
        if (j == f4566y) {
            return Long.MAX_VALUE;
        }
        if (j == f4567z) {
            return Long.MIN_VALUE;
        }
        long j10 = j >> 1;
        if ((((int) j) & 1) == 0) {
            cVar = c.NANOSECONDS;
        } else {
            cVar = c.MILLISECONDS;
        }
        return f.c(j10, cVar, unit);
    }

    public static final long i(long j) {
        long j10 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i6 = b.f4569a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f4568x, ((a) obj).f4568x);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (this.f4568x != ((a) obj).f4568x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4568x;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        boolean z10;
        int h4;
        long j;
        int h10;
        int h11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10 = this.f4568x;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f4566y) {
            return "Infinity";
        }
        if (j10 == f4567z) {
            return "-Infinity";
        }
        int i6 = 0;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (j10 < 0) {
            j10 = i(j10);
        }
        long h12 = h(j10, c.DAYS);
        if (e(j10)) {
            h4 = 0;
        } else {
            h4 = (int) (h(j10, c.HOURS) % 24);
        }
        if (e(j10)) {
            j = 0;
            h10 = 0;
        } else {
            j = 0;
            h10 = (int) (h(j10, c.MINUTES) % 60);
        }
        if (e(j10)) {
            h11 = 0;
        } else {
            h11 = (int) (h(j10, c.SECONDS) % 60);
        }
        int d10 = d(j10);
        if (h12 != j) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (h4 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (h10 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (h11 == 0 && d10 == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            sb2.append(h12);
            sb2.append('d');
            i6 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i10 = i6 + 1;
            if (i6 > 0) {
                sb2.append(' ');
            }
            sb2.append(h4);
            sb2.append('h');
            i6 = i10;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i11 = i6 + 1;
            if (i6 > 0) {
                sb2.append(' ');
            }
            sb2.append(h10);
            sb2.append('m');
            i6 = i11;
        }
        if (z14) {
            int i12 = i6 + 1;
            if (i6 > 0) {
                sb2.append(' ');
            }
            if (h11 == 0 && !z11 && !z12 && !z13) {
                if (d10 >= 1000000) {
                    b(sb2, d10 / 1000000, d10 % 1000000, 6, "ms", false);
                } else if (d10 >= 1000) {
                    b(sb2, d10 / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, d10 % UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 3, "us", false);
                } else {
                    sb2.append(d10);
                    sb2.append("ns");
                }
            } else {
                b(sb2, h11, d10, 9, "s", false);
            }
            i6 = i12;
        }
        if (z10 && i6 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
