package i2;

import java.util.Map;
import o2.b1;
import t1.d0;
import t1.e0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b1 {
    public final Map H;
    public t1.k I;

    public p(s2.e eVar, h2.n nVar, h2.k kVar, Map map) {
        super(eVar, nVar, kVar);
        this.H = map;
    }

    @Override // o2.b1
    public final t1.o p(t1.o oVar) {
        t1.k kVar;
        t1.k kVar2 = this.I;
        if (kVar2 == null) {
            kVar2 = oVar.f12065r;
        }
        if (kVar2 != null && (kVar = (t1.k) this.H.get(kVar2.f12015x)) != null) {
            kVar2 = kVar;
        }
        e0 e0Var = oVar.f12059l;
        e0 e0Var2 = null;
        if (e0Var == null) {
            e0Var = e0Var2;
        } else {
            d0[] d0VarArr = e0Var.f11984a;
            int length = d0VarArr.length;
            int i = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                d0 d0Var = d0VarArr[i10];
                if ((d0Var instanceof k3.n) && "com.apple.streaming.transportStreamTimestamp".equals(((k3.n) d0Var).f7330b)) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                if (length != 1) {
                    d0[] d0VarArr2 = new d0[length - 1];
                    while (i < length) {
                        if (i != i10) {
                            d0VarArr2[i < i10 ? i : i - 1] = d0VarArr[i];
                        }
                        i++;
                    }
                    e0Var2 = new e0(d0VarArr2);
                }
                e0Var = e0Var2;
            }
        }
        if (kVar2 != oVar.f12065r || e0Var != oVar.f12059l) {
            t1.n nVarA = oVar.a();
            nVarA.f12040q = kVar2;
            nVarA.f12034k = e0Var;
            oVar = new t1.o(nVarA);
        }
        return super.p(oVar);
    }
}
