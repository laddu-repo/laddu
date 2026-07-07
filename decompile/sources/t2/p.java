package t2;

import db.z;
import db.z0;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends o {
    public final boolean B;
    public final k C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final boolean M;
    public final int N;
    public final boolean O;
    public final int P;
    public final boolean Q;
    public final boolean R;
    public final int S;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:137:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0118 A[EDGE_INSN: B:142:0x0118->B:80:0x0118 BREAK  A[LOOP:1: B:72:0x00fd->B:140:0x0115], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(int r7, r1.e1 r8, int r9, t2.k r10, int r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.p.<init>(int, r1.e1, int, t2.k, int, java.lang.String, int, boolean):void");
    }

    public static int c(p pVar, p pVar2) {
        z c10 = z.f4060a.c(pVar.E, pVar2.E);
        Integer valueOf = Integer.valueOf(pVar.J);
        Integer valueOf2 = Integer.valueOf(pVar2.J);
        z0 z0Var = z0.f4064z;
        z b10 = c10.b(valueOf, valueOf2, z0Var).a(pVar.K, pVar2.K).a(pVar.L, pVar2.L).c(pVar.M, pVar2.M).a(pVar.N, pVar2.N).c(pVar.F, pVar2.F).c(pVar.B, pVar2.B).c(pVar.D, pVar2.D).b(Integer.valueOf(pVar.I), Integer.valueOf(pVar2.I), z0Var);
        boolean z10 = pVar.Q;
        z c11 = b10.c(z10, pVar2.Q);
        boolean z11 = pVar.R;
        z c12 = c11.c(z11, pVar2.R);
        if (z10 && z11) {
            c12 = c12.a(pVar.S, pVar2.S);
        }
        return c12.e();
    }

    @Override // t2.o
    public final int a() {
        return this.P;
    }

    @Override // t2.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (this.O || Objects.equals(this.A.f11670n, pVar.A.f11670n)) {
            this.C.getClass();
            if (this.Q == pVar.Q && this.R == pVar.R) {
                return true;
            }
            return false;
        }
        return false;
    }
}
