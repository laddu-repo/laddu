package f4;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f4766a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4767b;

    public f(int i6, List list) {
        this.f4766a = i6;
        this.f4767b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0036. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f4.i0 a(int r6, s8.n r7) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f.a(int, s8.n):f4.i0");
    }

    public List b(s8.n nVar) {
        boolean z10;
        String str;
        int i6;
        List list;
        boolean z11;
        byte[] bArr;
        boolean c10 = c(32);
        List list2 = this.f4767b;
        if (c10) {
            return list2;
        }
        u1.t tVar = new u1.t((byte[]) nVar.f12262d);
        while (tVar.a() > 0) {
            int y9 = tVar.y();
            int y10 = tVar.f12812b + tVar.y();
            if (y9 == 134) {
                ArrayList arrayList = new ArrayList();
                int y11 = tVar.y() & 31;
                for (int i10 = 0; i10 < y11; i10++) {
                    String w10 = tVar.w(3, StandardCharsets.UTF_8);
                    int y12 = tVar.y();
                    if ((y12 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i6 = y12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i6 = 1;
                    }
                    byte y13 = (byte) tVar.y();
                    tVar.L(1);
                    if (z10) {
                        if ((y13 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        byte[] bArr2 = u1.d.f12764a;
                        if (z11) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    r1.p pVar = new r1.p();
                    pVar.f11611m = k0.p(str);
                    pVar.f11603d = w10;
                    pVar.J = i6;
                    pVar.f11614p = list;
                    arrayList.add(new r1.q(pVar));
                }
                list2 = arrayList;
            }
            tVar.K(y10);
        }
        return list2;
    }

    public boolean c(int i6) {
        if ((i6 & this.f4766a) != 0) {
            return true;
        }
        return false;
    }

    public f() {
        this.f4766a = 1;
        this.f4767b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f4766a = 0;
        this.f4767b = arrayList;
    }
}
