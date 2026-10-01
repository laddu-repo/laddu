package t2;

import android.text.TextUtils;
import db.a1;
import db.z;
import db.z0;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends o implements Comparable {
    public final int B;
    public final boolean C;
    public final String D;
    public final k E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final int L;
    public final int M;
    public final boolean N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final boolean U;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105 A[LOOP:1: B:39:0x0102->B:41:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(int r14, r1.e1 r15, int r16, t2.k r17, int r18, boolean r19, t2.f r20, int r21) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.g.<init>(int, r1.e1, int, t2.k, int, boolean, t2.f, int):void");
    }

    @Override // t2.o
    public final int a() {
        return this.B;
    }

    @Override // t2.o
    public final boolean b(o oVar) {
        int i6;
        String str;
        g gVar = (g) oVar;
        r1.q qVar = gVar.A;
        this.E.getClass();
        r1.q qVar2 = this.A;
        int i10 = qVar2.F;
        if (i10 != -1 && i10 == qVar.F) {
            if ((this.J || ((str = qVar2.f11670n) != null && TextUtils.equals(str, qVar.f11670n))) && (i6 = qVar2.G) != -1 && i6 == qVar.G && this.S == gVar.S && this.T == gVar.T) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(g gVar) {
        a1 a10;
        boolean z10 = this.F;
        boolean z11 = this.C;
        if (z11 && z10) {
            a10 = q.f12544k;
        } else {
            a10 = q.f12544k.a();
        }
        boolean z12 = gVar.F;
        int i6 = gVar.Q;
        z c10 = z.f4060a.c(z10, z12);
        Integer valueOf = Integer.valueOf(this.H);
        Integer valueOf2 = Integer.valueOf(gVar.H);
        z0 z0Var = z0.f4064z;
        z b10 = c10.b(valueOf, valueOf2, z0Var).a(this.G, gVar.G).a(this.I, gVar.I).c(this.N, gVar.N).c(this.K, gVar.K).b(Integer.valueOf(this.L), Integer.valueOf(gVar.L), z0Var).a(this.M, gVar.M).c(z11, gVar.C).b(Integer.valueOf(this.R), Integer.valueOf(gVar.R), z0Var);
        boolean z13 = this.E.B;
        int i10 = this.Q;
        if (z13) {
            b10 = b10.b(Integer.valueOf(i10), Integer.valueOf(i6), q.f12544k.a());
        }
        z b11 = b10.c(this.S, gVar.S).c(this.T, gVar.T).c(this.U, gVar.U).b(Integer.valueOf(this.O), Integer.valueOf(gVar.O), a10).b(Integer.valueOf(this.P), Integer.valueOf(gVar.P), a10);
        if (Objects.equals(this.D, gVar.D)) {
            b11 = b11.b(Integer.valueOf(i10), Integer.valueOf(i6), a10);
        }
        return b11.e();
    }
}
