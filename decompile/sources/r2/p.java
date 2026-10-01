package r2;

import java.util.Objects;
import y9.x;
import y9.x0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o {
    public final j A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final boolean K;
    public final int L;
    public final boolean M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final int Q;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f11111z;

    /* JADX WARN: Removed duplicated region for block: B:130:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(int r7, t1.t0 r8, int r9, r2.j r10, int r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.p.<init>(int, t1.t0, int, r2.j, int, java.lang.String, int, boolean):void");
    }

    public static int c(p pVar, p pVar2) {
        x xVarC = x.f14627a.c(pVar.C, pVar2.C);
        Integer numValueOf = Integer.valueOf(pVar.H);
        Integer numValueOf2 = Integer.valueOf(pVar2.H);
        x0 x0Var = x0.f14631x;
        x xVarB = xVarC.b(numValueOf, numValueOf2, x0Var).a(pVar.I, pVar2.I).a(pVar.J, pVar2.J).c(pVar.K, pVar2.K).a(pVar.L, pVar2.L).c(pVar.D, pVar2.D).c(pVar.f11111z, pVar2.f11111z).c(pVar.B, pVar2.B).b(Integer.valueOf(pVar.G), Integer.valueOf(pVar2.G), x0Var);
        boolean z2 = pVar.O;
        x xVarC2 = xVarB.c(z2, pVar2.O);
        boolean z10 = pVar.P;
        x xVarC3 = xVarC2.c(z10, pVar2.P);
        if (z2 && z10) {
            xVarC3 = xVarC3.a(pVar.Q, pVar2.Q);
        }
        return xVarC3.e();
    }

    @Override // r2.o
    public final int a() {
        return this.N;
    }

    @Override // r2.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (!this.M && !Objects.equals(this.f11110y.f12061n, pVar.f11110y.f12061n)) {
            return false;
        }
        this.A.getClass();
        return this.O == pVar.O && this.P == pVar.P;
    }
}
