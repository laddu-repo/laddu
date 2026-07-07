package i4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6594a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f6596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, Looper looper) {
        super(looper);
        this.f6596c = b0Var;
        this.f6594a = true;
        this.f6595b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f6594a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f6594a = z12;
        if (this.f6595b && z11) {
            z13 = true;
        }
        this.f6595b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        s sVar;
        int i6;
        r rVar;
        j1 j1Var;
        b0 b0Var = this.f6596c;
        h1 h1Var = b0Var.f6307g;
        if (message.what == 1) {
            j1 c10 = b0Var.s.c(b0Var.f6318t.h1(), b0Var.f6318t.f1(), b0Var.s.f6426k);
            b0Var.s = c10;
            boolean z10 = this.f6594a;
            boolean z11 = this.f6595b;
            j1 J = h1Var.J(c10);
            ic.s sVar2 = h1Var.f6393f;
            db.k0 i10 = sVar2.i();
            for (int i11 = 0; i11 < i10.size(); i11++) {
                s sVar3 = (s) i10.get(i11);
                try {
                    n1 n10 = sVar2.n(sVar3);
                    if (n10 != null) {
                        i6 = n10.c();
                    } else if (!b0Var.h(sVar3)) {
                        break;
                    } else {
                        i6 = 0;
                    }
                    j1 m9 = sVar2.m(sVar3);
                    if (m9 == null) {
                        sVar2.l(sVar3);
                        r1.q0 k8 = lg.c.k(sVar2.h(sVar3), b0Var.f6318t.l());
                        try {
                            rVar = sVar3.f6542d;
                            u1.c.h(rVar);
                            if (m9 == null) {
                                sVar = sVar3;
                                j1Var = J;
                            } else {
                                sVar = sVar3;
                                j1Var = m9;
                            }
                        } catch (DeadObjectException unused) {
                            sVar = sVar3;
                        } catch (RemoteException e10) {
                            e = e10;
                            sVar = sVar3;
                        }
                        try {
                            rVar.g(i6, j1Var, k8, z10, z11);
                        } catch (DeadObjectException unused2) {
                            h1Var.f6393f.y(sVar);
                        } catch (RemoteException e11) {
                            e = e11;
                            u1.a.q("MediaSessionImpl", "Exception in " + sVar, e);
                        }
                    }
                } catch (DeadObjectException unused3) {
                    sVar = sVar3;
                } catch (RemoteException e12) {
                    e = e12;
                    sVar = sVar3;
                }
            }
            this.f6594a = true;
            this.f6595b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
