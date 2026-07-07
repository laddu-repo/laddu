package cg;

import bg.g0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2088a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(df.a.f4115a);
        k.d(bytes, "getBytes(...)");
        f2088a = bytes;
    }

    public static final boolean a(g0 g0Var, int i6, byte[] bArr, int i10) {
        int i11 = g0Var.f1712c;
        byte[] bArr2 = g0Var.f1710a;
        for (int i12 = 1; i12 < i10; i12++) {
            if (i6 == i11) {
                g0Var = g0Var.f1715f;
                k.b(g0Var);
                byte[] bArr3 = g0Var.f1710a;
                bArr2 = bArr3;
                i6 = g0Var.f1711b;
                i11 = g0Var.f1712c;
            }
            if (bArr2[i6] != bArr[i12]) {
                return false;
            }
            i6++;
        }
        return true;
    }

    public static final String b(bg.k kVar, long j) {
        if (j > 0) {
            long j10 = j - 1;
            if (kVar.y(j10) == 13) {
                String g02 = kVar.g0(j10, df.a.f4115a);
                kVar.skip(2L);
                return g02;
            }
        }
        String g03 = kVar.g0(j, df.a.f4115a);
        kVar.skip(1L);
        return g03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(bg.k r16, bg.b0 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.a.c(bg.k, bg.b0, boolean):int");
    }
}
