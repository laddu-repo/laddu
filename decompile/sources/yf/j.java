package yf;

import com.google.android.gms.internal.measurement.p4;
import j2.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends p4 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15074c;

    public j(y yVar, boolean z10) {
        super(yVar);
        this.f15074c = z10;
    }

    @Override // com.google.android.gms.internal.measurement.p4
    public final void g(byte b10) {
        if (this.f15074c) {
            m(String.valueOf(b10 & 255));
        } else {
            k(String.valueOf(b10 & 255));
        }
    }

    @Override // com.google.android.gms.internal.measurement.p4
    public final void i(int i6) {
        if (this.f15074c) {
            m(Long.toString(4294967295L & i6, 10));
        } else {
            k(Long.toString(4294967295L & i6, 10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.p4
    public final void j(long j) {
        int i6 = 63;
        String str = "0";
        if (this.f15074c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j >>> 1) / 5;
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i6--;
                        cArr[i6] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i6, 64 - i6);
                }
            }
            m(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j >>> 1) / 5;
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j12 * j13)), 10);
                while (j12 > 0) {
                    i6--;
                    cArr2[i6] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i6, 64 - i6);
            }
        }
        k(str);
    }

    @Override // com.google.android.gms.internal.measurement.p4
    public final void l(short s) {
        if (this.f15074c) {
            m(String.valueOf(s & 65535));
        } else {
            k(String.valueOf(s & 65535));
        }
    }
}
