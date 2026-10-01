package t3;

import java.util.Arrays;
import n9.o3;
import r1.k0;
import r1.p;
import r1.q;
import s8.l;
import u1.t;
import y2.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: n, reason: collision with root package name */
    public s f12571n;

    /* renamed from: o, reason: collision with root package name */
    public o3 f12572o;

    @Override // t3.i
    public final long b(t tVar) {
        byte[] bArr = tVar.f12811a;
        if (bArr[0] == -1) {
            int i6 = (bArr[2] & 255) >> 4;
            if (i6 == 6 || i6 == 7) {
                tVar.L(4);
                tVar.F();
            }
            int x10 = y2.a.x(i6, tVar);
            tVar.K(0);
            return x10;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, n9.o3] */
    @Override // t3.i
    public final boolean c(t tVar, long j, l lVar) {
        byte[] bArr = tVar.f12811a;
        s sVar = this.f12571n;
        if (sVar == null) {
            s sVar2 = new s(17, bArr);
            this.f12571n = sVar2;
            p a10 = sVar2.c(Arrays.copyOfRange(bArr, 9, tVar.f12813c), null).a();
            a10.f11610l = k0.p("audio/ogg");
            lVar.f12251y = new q(a10);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            y1.c y9 = y2.a.y(tVar);
            s sVar3 = new s(sVar.f14931a, sVar.f14932b, sVar.f14933c, sVar.f14934d, sVar.f14935e, sVar.f14937g, sVar.f14938h, sVar.j, y9, sVar.f14941l);
            this.f12571n = sVar3;
            ?? obj = new Object();
            obj.f9423z = sVar3;
            obj.A = y9;
            obj.f9421x = -1L;
            obj.f9422y = -1L;
            this.f12572o = obj;
            return true;
        }
        if (b10 != -1) {
            return true;
        }
        o3 o3Var = this.f12572o;
        if (o3Var != null) {
            o3Var.f9421x = j;
            lVar.f12252z = o3Var;
        }
        ((q) lVar.f12251y).getClass();
        return false;
    }

    @Override // t3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f12571n = null;
            this.f12572o = null;
        }
    }
}
