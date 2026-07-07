package y9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f14567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0() {
        super(4);
        x0 x0Var = x0.f14630w;
        this.f14567d = x0Var;
    }

    @Override // y9.h0, y9.z
    public final z c(Object obj) {
        super.c(obj);
        return this;
    }

    @Override // y9.h0
    /* JADX INFO: renamed from: g */
    public final h0 c(Object obj) {
        super.c(obj);
        return this;
    }

    @Override // y9.h0
    public final /* bridge */ /* synthetic */ i0 h() {
        throw null;
    }

    public final g1 i() {
        g1 g1Var;
        Object[] objArrCopyOf = this.f14634a;
        int i = this.f14635b;
        x0 x0Var = this.f14567d;
        if (i == 0) {
            g1Var = k0.m(x0Var);
        } else {
            p.b(i, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i, x0Var);
            int i10 = 1;
            for (int i11 = 1; i11 < i; i11++) {
                Object obj = objArrCopyOf[i11];
                if (x0Var.compare(obj, objArrCopyOf[i10 - 1]) != 0) {
                    objArrCopyOf[i10] = obj;
                    i10++;
                }
            }
            Arrays.fill(objArrCopyOf, i10, i, (Object) null);
            if (i10 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
            }
            g1Var = new g1(f0.i(i10, objArrCopyOf), x0Var);
        }
        this.f14635b = g1Var.B.size();
        this.f14636c = true;
        return g1Var;
    }
}
