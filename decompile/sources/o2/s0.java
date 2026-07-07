package o2;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements c1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f9524w;

    public s0(u0 u0Var, int i) {
        this.f9524w = u0Var;
        this.f9523v = i;
    }

    @Override // o2.c1
    public final boolean a() {
        u0 u0Var = this.f9524w;
        return !u0Var.G() && u0Var.O[this.f9523v].x(u0Var.f9544i0);
    }

    @Override // o2.c1
    public final void b() throws IOException {
        int i = this.f9523v;
        u0 u0Var = this.f9524w;
        u0Var.O[i].z();
        s2.n nVar = u0Var.G;
        int iW = u0Var.f9549y.w(u0Var.Y);
        IOException iOException = nVar.f11469c;
        if (iOException != null) {
            throw iOException;
        }
        s2.j jVar = nVar.f11468b;
        if (jVar != null) {
            if (iW == Integer.MIN_VALUE) {
                iW = jVar.f11460v;
            }
            IOException iOException2 = jVar.f11464z;
            if (iOException2 != null && jVar.A > iW) {
                throw iOException2;
            }
        }
    }

    @Override // o2.c1
    public final int e(sc.b bVar, DecoderInputBuffer decoderInputBuffer, int i) {
        u0 u0Var = this.f9524w;
        if (u0Var.G()) {
            return -3;
        }
        int i10 = this.f9523v;
        u0Var.B(i10);
        int iC = u0Var.O[i10].C(bVar, decoderInputBuffer, i, u0Var.f9544i0);
        if (iC == -3) {
            u0Var.C(i10);
        }
        return iC;
    }

    @Override // o2.c1
    public final int k(long j8) throws Throwable {
        u0 u0Var = this.f9524w;
        if (u0Var.G()) {
            return 0;
        }
        int i = this.f9523v;
        u0Var.B(i);
        b1 b1Var = u0Var.O[i];
        int iV = b1Var.v(u0Var.f9544i0, j8);
        b1Var.H(iV);
        if (iV == 0) {
            u0Var.C(i);
        }
        return iV;
    }
}
