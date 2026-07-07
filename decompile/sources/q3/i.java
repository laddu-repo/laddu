package q3;

import w1.b0;
import w2.g0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f10691a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f10694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f10695e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10697h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t1.o f10698j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10701m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f10692b = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f10693c = new w1.t();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w1.t f10699k = new w1.t(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w1.t f10700l = new w1.t();

    public i(g0 g0Var, t tVar, f fVar, t1.o oVar) {
        this.f10691a = g0Var;
        this.f10694d = tVar;
        this.f10695e = fVar;
        this.f10698j = oVar;
        this.f10694d = tVar;
        this.f10695e = fVar;
        g0Var.c(oVar);
        e();
    }

    public final int a() {
        int i = !this.f10701m ? this.f10694d.f10801g[this.f] : this.f10692b.f10788j[this.f] ? 1 : 0;
        return b() != null ? i | 1073741824 : i;
    }

    public final r b() {
        if (!this.f10701m) {
            return null;
        }
        s sVar = this.f10692b;
        f fVar = sVar.f10781a;
        int i = b0.f13686a;
        int i10 = fVar.f10683a;
        r rVar = sVar.f10791m;
        if (rVar == null) {
            rVar = this.f10694d.f10796a.f10775l[i10];
        }
        if (rVar == null || !rVar.f10776a) {
            return null;
        }
        return rVar;
    }

    public final boolean c() {
        this.f++;
        if (!this.f10701m) {
            return false;
        }
        int i = this.f10696g + 1;
        this.f10696g = i;
        int[] iArr = this.f10692b.f10786g;
        int i10 = this.f10697h;
        if (i != iArr[i10]) {
            return true;
        }
        this.f10697h = i10 + 1;
        this.f10696g = 0;
        return false;
    }

    public final int d(int i, int i10) {
        w1.t tVar;
        r rVarB = b();
        if (rVarB == null) {
            return 0;
        }
        int length = rVarB.f10779d;
        s sVar = this.f10692b;
        if (length != 0) {
            tVar = sVar.f10792n;
        } else {
            byte[] bArr = rVarB.f10780e;
            int i11 = b0.f13686a;
            int length2 = bArr.length;
            w1.t tVar2 = this.f10700l;
            tVar2.H(length2, bArr);
            length = bArr.length;
            tVar = tVar2;
        }
        boolean z2 = sVar.f10789k && sVar.f10790l[this.f];
        boolean z10 = z2 || i10 != 0;
        w1.t tVar3 = this.f10699k;
        tVar3.f13738a[0] = (byte) ((z10 ? 128 : 0) | length);
        tVar3.J(0);
        g0 g0Var = this.f10691a;
        g0Var.f(tVar3, 1, 1);
        g0Var.f(tVar, length, 1);
        if (!z10) {
            return length + 1;
        }
        w1.t tVar4 = this.f10693c;
        if (!z2) {
            tVar4.G(8);
            byte[] bArr2 = tVar4.f13738a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            g0Var.f(tVar4, 8, 1);
            return length + 9;
        }
        w1.t tVar5 = sVar.f10792n;
        int iD = tVar5.D();
        tVar5.K(-2);
        int i12 = (iD * 6) + 2;
        if (i10 != 0) {
            tVar4.G(i12);
            byte[] bArr3 = tVar4.f13738a;
            tVar5.h(bArr3, 0, i12);
            int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i10;
            bArr3[2] = (byte) ((i13 >> 8) & 255);
            bArr3[3] = (byte) (i13 & 255);
        } else {
            tVar4 = tVar5;
        }
        g0Var.f(tVar4, i12, 1);
        return length + 1 + i12;
    }

    public final void e() {
        s sVar = this.f10692b;
        sVar.f10784d = 0;
        sVar.f10794p = 0L;
        sVar.f10795q = false;
        sVar.f10789k = false;
        sVar.f10793o = false;
        sVar.f10791m = null;
        this.f = 0;
        this.f10697h = 0;
        this.f10696g = 0;
        this.i = 0;
        this.f10701m = false;
    }
}
