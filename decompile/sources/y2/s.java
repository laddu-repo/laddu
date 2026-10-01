package y2;

import java.nio.ByteOrder;
import java.util.Collections;
import r1.j0;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f14931a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14933c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14934d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14935e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14936f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14937g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14938h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14939i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final y1.c f14940k;

    /* renamed from: l, reason: collision with root package name */
    public final j0 f14941l;

    public s(int i6, byte[] bArr) {
        u1.s sVar = new u1.s(bArr.length, bArr);
        sVar.q(i6 * 8);
        this.f14931a = sVar.i(16);
        this.f14932b = sVar.i(16);
        this.f14933c = sVar.i(24);
        this.f14934d = sVar.i(24);
        int i10 = sVar.i(20);
        this.f14935e = i10;
        this.f14936f = d(i10);
        this.f14937g = sVar.i(3) + 1;
        int i11 = sVar.i(5) + 1;
        this.f14938h = i11;
        this.f14939i = a(i11);
        this.j = sVar.k(36);
        this.f14940k = null;
        this.f14941l = null;
    }

    public static int a(int i6) {
        if (i6 != 8) {
            if (i6 != 12) {
                if (i6 != 16) {
                    if (i6 != 20) {
                        if (i6 != 24) {
                            if (i6 != 32) {
                                return -1;
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i6) {
        switch (i6) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f14935e;
    }

    public final r1.q c(byte[] bArr, j0 j0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i6 = this.f14934d;
        if (i6 <= 0) {
            i6 = -1;
        }
        j0 j0Var2 = this.f14941l;
        if (j0Var2 != null) {
            j0Var = j0Var2.b(j0Var);
        }
        r1.p pVar = new r1.p();
        pVar.f11611m = k0.p("audio/flac");
        pVar.f11612n = i6;
        pVar.E = this.f14937g;
        pVar.F = this.f14935e;
        String str = u1.a0.f12750a;
        pVar.G = u1.a0.B(this.f14938h, ByteOrder.LITTLE_ENDIAN);
        pVar.f11614p = Collections.singletonList(bArr);
        pVar.f11609k = j0Var;
        return new r1.q(pVar);
    }

    public s(int i6, int i10, int i11, int i12, int i13, int i14, int i15, long j, y1.c cVar, j0 j0Var) {
        this.f14931a = i6;
        this.f14932b = i10;
        this.f14933c = i11;
        this.f14934d = i12;
        this.f14935e = i13;
        this.f14936f = d(i13);
        this.f14937g = i14;
        this.f14938h = i15;
        this.f14939i = a(i15);
        this.j = j;
        this.f14940k = cVar;
        this.f14941l = j0Var;
    }
}
