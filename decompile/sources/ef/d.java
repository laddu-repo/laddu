package ef;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements Comparable, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final long f4574x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4575y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f4573z = new d(-31557014167219200L, 0);
    public static final d A = new d(31556889864403199L, 999999999);

    public d(long j, int i6) {
        this.f4574x = j;
        this.f4575y = i6;
        if (-31557014167219200L <= j && j < 31556889864403200L) {
        } else {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i6;
        d other = (d) obj;
        kotlin.jvm.internal.k.e(other, "other");
        long j = this.f4574x;
        long j10 = other.f4574x;
        if (j < j10) {
            i6 = -1;
        } else if (j == j10) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        if (i6 != 0) {
            return i6;
        }
        return kotlin.jvm.internal.k.g(this.f4575y, other.f4575y);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f4574x != dVar.f4574x || this.f4575y != dVar.f4575y) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f4574x;
        return (this.f4575y * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j;
        long j10;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        long j11 = this.f4574x;
        long j12 = j11 / 86400;
        if ((j11 ^ 86400) < 0 && j12 * 86400 != j11) {
            j12--;
        }
        long j13 = j11 % 86400;
        int i6 = (int) (j13 + (86400 & (((j13 ^ 86400) & ((-j13) | j13)) >> 63)));
        long j14 = (j12 + 719528) - 60;
        if (j14 < 0) {
            long j15 = 146097;
            long j16 = ((j14 + 1) / j15) - 1;
            j = -1;
            j10 = CommonGatewayClient.CODE_400 * j16;
            j14 += (-j16) * j15;
        } else {
            j = -1;
            j10 = 0;
        }
        long j17 = CommonGatewayClient.CODE_400;
        long j18 = ((j17 * j14) + 591) / 146097;
        long j19 = 365;
        long j20 = j19 * j18;
        long j21 = 4;
        long j22 = (j18 / j21) + j20;
        long j23 = 100;
        long j24 = j14 - ((j18 / j17) + (j22 - (j18 / j23)));
        if (j24 < 0) {
            j18 += j;
            j24 = j14 - ((j18 / j17) + (((j18 / j21) + (j19 * j18)) - (j18 / j23)));
        }
        int i10 = (int) j24;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        int i14 = (int) (j18 + j10 + (i11 / 10));
        int i15 = i6 / 3600;
        int i16 = i6 - (i15 * 3600);
        int i17 = i16 / 60;
        int i18 = i16 - (i17 * 60);
        int i19 = 0;
        if (Math.abs(i14) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i14 >= 0) {
                sb3.append(i14 + UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                kotlin.jvm.internal.k.d(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(i14 - UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                kotlin.jvm.internal.k.d(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i14 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i14);
        }
        sb2.append('-');
        f.h(sb2, sb2, i12);
        sb2.append('-');
        f.h(sb2, sb2, i13);
        sb2.append('T');
        f.h(sb2, sb2, i15);
        sb2.append(':');
        f.h(sb2, sb2, i17);
        sb2.append(':');
        f.h(sb2, sb2, i18);
        int i20 = this.f4575y;
        if (i20 != 0) {
            sb2.append('.');
            while (true) {
                int i21 = i19 + 1;
                iArr = f.f4576a;
                if (i20 % iArr[i21] != 0) {
                    break;
                }
                i19 = i21;
            }
            int i22 = i19 - (i19 % 3);
            String valueOf = String.valueOf((i20 / iArr[i22]) + iArr[9 - i22]);
            kotlin.jvm.internal.k.c(valueOf, "null cannot be cast to non-null type java.lang.String");
            String substring = valueOf.substring(1);
            kotlin.jvm.internal.k.d(substring, "substring(...)");
            sb2.append(substring);
        }
        sb2.append('Z');
        return sb2.toString();
    }
}
