package a2;

import android.os.RemoteException;
import android.util.Pair;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f320x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f321y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f322z;

    public /* synthetic */ m1(o1 o1Var, Pair pair, q2.u uVar, n2.g gVar, int i6) {
        this.f322z = o1Var;
        this.A = pair;
        this.B = uVar;
        this.C = gVar;
        this.f321y = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f320x) {
            case 0:
                o1 o1Var = (o1) this.f322z;
                Pair pair = (Pair) this.A;
                ((b2.f) o1Var.f359y.f385i).u(((Integer) pair.first).intValue(), (q2.c0) pair.second, (q2.u) this.B, (n2.g) this.C, this.f321y);
                return;
            default:
                i4.o0 o0Var = (i4.o0) this.f322z;
                i4.o1 o1Var2 = (i4.o1) this.A;
                j4.d0 d0Var = (j4.d0) this.B;
                i4.n0 n0Var = (i4.n0) this.C;
                ic.s sVar = o0Var.f6472f;
                if (!o0Var.f6473g.j()) {
                    boolean isActive = ((j4.u) o0Var.f6476k.f7158x).f7208a.isActive();
                    int i6 = this.f321y;
                    if (!isActive) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        if (o1Var2 == null) {
                            obj = Integer.valueOf(i6);
                        } else {
                            obj = o1Var2.f6493b;
                        }
                        sb2.append(obj);
                        sb2.append(", pid=");
                        sb2.append(d0Var.f7163a.f7166b);
                        u1.a.p("MediaSessionLegacyStub", sb2.toString());
                        return;
                    }
                    i4.s L = o0Var.L(d0Var);
                    if (o1Var2 != null) {
                        if (!sVar.v(L, o1Var2)) {
                            return;
                        }
                    } else if (!sVar.u(L, i6)) {
                        return;
                    }
                    try {
                        n0Var.f(L);
                        return;
                    } catch (RemoteException e10) {
                        u1.a.q("MediaSessionLegacyStub", "Exception in " + L, e10);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ m1(i4.o0 o0Var, i4.o1 o1Var, int i6, j4.d0 d0Var, i4.n0 n0Var) {
        this.f322z = o0Var;
        this.A = o1Var;
        this.f321y = i6;
        this.B = d0Var;
        this.C = n0Var;
    }
}
