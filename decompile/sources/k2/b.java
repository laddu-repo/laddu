package k2;

import a2.e0;
import a2.g;
import a2.k0;
import a2.n0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j4.b0;
import java.util.ArrayList;
import q2.c0;
import r1.g0;
import r1.h0;
import r1.i0;
import r1.j0;
import r1.q;
import u1.a0;
import u1.c;
import u1.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends g implements Handler.Callback {
    public final a P;
    public final k0 Q;
    public final Handler R;
    public final h3.a S;
    public c9.a T;
    public boolean U;
    public boolean V;
    public long W;
    public j0 X;
    public long Y;

    public b(k0 k0Var, Looper looper) {
        super(5);
        Handler handler;
        this.Q = k0Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = a0.f12750a;
            handler = new Handler(looper, this);
        }
        this.R = handler;
        this.P = a.f7584a;
        this.S = new h3.a();
        this.Y = -9223372036854775807L;
    }

    @Override // a2.g
    public final int A(q qVar) {
        int i6;
        if (this.P.b(qVar)) {
            if (qVar.O == 0) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            return r4.a.d(i6, 0, 0, 0);
        }
        return r4.a.d(0, 0, 0, 0);
    }

    public final void C(j0 j0Var, ArrayList arrayList) {
        int i6 = 0;
        while (true) {
            i0[] i0VarArr = j0Var.f11523a;
            if (i6 < i0VarArr.length) {
                q a10 = i0VarArr[i6].a();
                if (a10 != null) {
                    a aVar = this.P;
                    if (aVar.b(a10)) {
                        c9.a a11 = aVar.a(a10);
                        byte[] c10 = i0VarArr[i6].c();
                        c10.getClass();
                        h3.a aVar2 = this.S;
                        aVar2.clear();
                        aVar2.b(c10.length);
                        aVar2.f14812z.put(c10);
                        aVar2.d();
                        j0 d10 = a11.d(aVar2);
                        if (d10 != null) {
                            C(d10, arrayList);
                        }
                        i6++;
                    }
                }
                arrayList.add(i0VarArr[i6]);
                i6++;
            } else {
                return;
            }
        }
    }

    public final long D(long j) {
        boolean z10;
        boolean z11 = false;
        if (j != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.g(z10);
        if (this.Y != -9223372036854775807L) {
            z11 = true;
        }
        c.g(z11);
        return j - this.Y;
    }

    public final void E(j0 j0Var) {
        k0 k0Var = this.Q;
        n0 n0Var = k0Var.f295x;
        h0 h0Var = n0Var.H0;
        o oVar = n0Var.K;
        g0 a10 = h0Var.a();
        int i6 = 0;
        while (true) {
            i0[] i0VarArr = j0Var.f11523a;
            if (i6 >= i0VarArr.length) {
                break;
            }
            i0VarArr[i6].b(a10);
            i6++;
        }
        n0Var.H0 = new h0(a10);
        h0 g12 = n0Var.g1();
        if (!g12.equals(n0Var.f339n0)) {
            n0Var.f339n0 = g12;
            oVar.c(14, new e0(k0Var, 3));
        }
        oVar.c(28, new e0(j0Var, 4));
        oVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            E((j0) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // a2.g
    public final String j() {
        return "MetadataRenderer";
    }

    @Override // a2.g
    public final boolean l() {
        return this.V;
    }

    @Override // a2.g
    public final boolean m() {
        return true;
    }

    @Override // a2.g
    public final void o() {
        this.X = null;
        this.T = null;
        this.Y = -9223372036854775807L;
    }

    @Override // a2.g
    public final void q(boolean z10, long j) {
        this.X = null;
        this.U = false;
        this.V = false;
    }

    @Override // a2.g
    public final void v(q[] qVarArr, long j, long j10, c0 c0Var) {
        this.T = this.P.a(qVarArr[0]);
        j0 j0Var = this.X;
        if (j0Var != null) {
            long j11 = j0Var.f11524b;
            long j12 = (this.Y + j11) - j10;
            if (j11 != j12) {
                j0Var = new j0(j12, j0Var.f11523a);
            }
            this.X = j0Var;
        }
        this.Y = j10;
    }

    @Override // a2.g
    public final void x(long j, long j10) {
        boolean z10 = true;
        while (z10) {
            if (!this.U && this.X == null) {
                h3.a aVar = this.S;
                aVar.clear();
                b0 b0Var = this.f246z;
                b0Var.i();
                int w10 = w(b0Var, aVar, 0);
                if (w10 == -4) {
                    if (aVar.isEndOfStream()) {
                        this.U = true;
                    } else if (aVar.B >= this.I) {
                        aVar.F = this.W;
                        aVar.d();
                        c9.a aVar2 = this.T;
                        String str = a0.f12750a;
                        j0 d10 = aVar2.d(aVar);
                        if (d10 != null) {
                            ArrayList arrayList = new ArrayList(d10.f11523a.length);
                            C(d10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.X = new j0(D(aVar.B), (i0[]) arrayList.toArray(new i0[0]));
                            }
                        }
                    }
                } else if (w10 == -5) {
                    q qVar = (q) b0Var.f7159y;
                    qVar.getClass();
                    this.W = qVar.s;
                }
            }
            j0 j0Var = this.X;
            if (j0Var != null && j0Var.f11524b <= D(j)) {
                j0 j0Var2 = this.X;
                Handler handler = this.R;
                if (handler != null) {
                    handler.obtainMessage(1, j0Var2).sendToTarget();
                } else {
                    E(j0Var2);
                }
                this.X = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.U && this.X == null) {
                this.V = true;
            }
        }
    }
}
