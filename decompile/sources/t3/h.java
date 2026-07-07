package t3;

import java.util.ArrayList;
import java.util.Arrays;
import r1.j0;
import r1.k0;
import r1.p;
import r1.q;
import s8.l;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f12588o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f12589p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f12590n;

    public static boolean e(t tVar, byte[] bArr) {
        if (tVar.a() < bArr.length) {
            return false;
        }
        int i6 = tVar.f12812b;
        byte[] bArr2 = new byte[bArr.length];
        tVar.i(bArr2, 0, bArr.length);
        tVar.K(i6);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // t3.i
    public final long b(t tVar) {
        byte[] bArr = tVar.f12811a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f12599i * y2.a.n(b11, b10)) / 1000000;
    }

    @Override // t3.i
    public final boolean c(t tVar, long j, l lVar) {
        if (e(tVar, f12588o)) {
            byte[] copyOf = Arrays.copyOf(tVar.f12811a, tVar.f12813c);
            int i6 = copyOf[9] & 255;
            ArrayList c10 = y2.a.c(copyOf);
            if (((q) lVar.f12251y) == null) {
                p pVar = new p();
                pVar.f11610l = k0.p("audio/ogg");
                pVar.f11611m = k0.p("audio/opus");
                pVar.E = i6;
                pVar.F = 48000;
                pVar.f11614p = c10;
                lVar.f12251y = new q(pVar);
                return true;
            }
        } else if (e(tVar, f12589p)) {
            u1.c.h((q) lVar.f12251y);
            if (!this.f12590n) {
                this.f12590n = true;
                tVar.L(8);
                j0 v10 = y2.a.v(db.k0.l((String[]) y2.a.z(tVar, false, false).f13479x));
                if (v10 != null) {
                    p a10 = ((q) lVar.f12251y).a();
                    a10.f11609k = v10.b(((q) lVar.f12251y).f11668l);
                    lVar.f12251y = new q(a10);
                    return true;
                }
            }
        } else {
            u1.c.h((q) lVar.f12251y);
            return false;
        }
        return true;
    }

    @Override // t3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f12590n = false;
        }
    }
}
