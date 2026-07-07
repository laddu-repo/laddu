package ef;

import com.google.android.gms.internal.measurement.mb;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Closeable {
    public final q A;
    public final d0 B;
    public final vf.s C;
    public final b0 D;
    public final b0 E;
    public final b0 F;
    public final long G;
    public final long H;
    public final c2.b I;
    public final g0 J;
    public final boolean K;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final mb f4944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f4945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f4946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f4947y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o f4948z;

    public b0(mb mbVar, x xVar, String str, int i, o oVar, q qVar, d0 d0Var, vf.s sVar, b0 b0Var, b0 b0Var2, b0 b0Var3, long j8, long j9, c2.b bVar, g0 g0Var) {
        de.i.e(mbVar, "request");
        de.i.e(xVar, "protocol");
        de.i.e(str, "message");
        de.i.e(d0Var, "body");
        de.i.e(g0Var, "trailersSource");
        this.f4944v = mbVar;
        this.f4945w = xVar;
        this.f4946x = str;
        this.f4947y = i;
        this.f4948z = oVar;
        this.A = qVar;
        this.B = d0Var;
        this.C = sVar;
        this.D = b0Var;
        this.E = b0Var2;
        this.F = b0Var3;
        this.G = j8;
        this.H = j9;
        this.I = bVar;
        this.J = g0Var;
        boolean z2 = false;
        if (200 <= i && i < 300) {
            z2 = true;
        }
        this.K = z2;
    }

    public final a0 a() {
        a0 a0Var = new a0();
        a0Var.f4930c = -1;
        a0Var.f4933g = d0.f4963v;
        a0Var.f4940o = g0.f4975a;
        a0Var.f4928a = this.f4944v;
        a0Var.f4929b = this.f4945w;
        a0Var.f4930c = this.f4947y;
        a0Var.f4931d = this.f4946x;
        a0Var.f4932e = this.f4948z;
        a0Var.f = this.A.c();
        a0Var.f4933g = this.B;
        a0Var.f4934h = this.C;
        a0Var.i = this.D;
        a0Var.f4935j = this.E;
        a0Var.f4936k = this.F;
        a0Var.f4937l = this.G;
        a0Var.f4938m = this.H;
        a0Var.f4939n = this.I;
        a0Var.f4940o = this.J;
        return a0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f4945w + ", code=" + this.f4947y + ", message=" + this.f4946x + ", url=" + ((s) this.f4944v.f2888b) + '}';
    }
}
