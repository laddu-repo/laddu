package g2;

import java.util.Map;
import q2.y0;
import r1.i0;
import r1.j0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends y0 {
    public final Map H;
    public r1.m I;

    public p(u2.e eVar, f2.o oVar, f2.l lVar, Map map) {
        super(eVar, oVar, lVar);
        this.H = map;
    }

    @Override // q2.y0
    public final r1.q p(r1.q qVar) {
        r1.m mVar;
        r1.m mVar2 = this.I;
        if (mVar2 == null) {
            mVar2 = qVar.f11674r;
        }
        if (mVar2 != null && (mVar = (r1.m) this.H.get(mVar2.f11585z)) != null) {
            mVar2 = mVar;
        }
        j0 j0Var = qVar.f11668l;
        j0 j0Var2 = null;
        if (j0Var != null) {
            i0[] i0VarArr = j0Var.f11523a;
            int length = i0VarArr.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    i0 i0Var = i0VarArr[i6];
                    if ((i0Var instanceof m3.n) && "com.apple.streaming.transportStreamTimestamp".equals(((m3.n) i0Var).f8593b)) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 != -1) {
                if (length != 1) {
                    i0[] i0VarArr2 = new i0[length - 1];
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 != i6) {
                            i0VarArr2[i10 < i6 ? i10 : i10 - 1] = i0VarArr[i10];
                        }
                    }
                    j0Var2 = new j0(i0VarArr2);
                }
            }
            if (mVar2 == qVar.f11674r || j0Var != qVar.f11668l) {
                r1.p a10 = qVar.a();
                a10.f11615q = mVar2;
                a10.f11609k = j0Var;
                qVar = new r1.q(a10);
            }
            return super.p(qVar);
        }
        j0Var = j0Var2;
        if (mVar2 == qVar.f11674r) {
        }
        r1.p a102 = qVar.a();
        a102.f11615q = mVar2;
        a102.f11609k = j0Var;
        qVar = new r1.q(a102);
        return super.p(qVar);
    }
}
