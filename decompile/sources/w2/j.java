package w2;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import r1.p1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements Handler.Callback {

    /* renamed from: x, reason: collision with root package name */
    public final Handler f13648x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f13649y;

    public j(k kVar, j2.n nVar) {
        this.f13649y = kVar;
        Handler n10 = u1.a0.n(this);
        this.f13648x = n10;
        nVar.p(this, n10);
    }

    public final void a(long j) {
        boolean z10;
        Surface surface;
        k kVar = this.f13649y;
        if (this == kVar.O1 && kVar.f7121i0 != null) {
            if (j == Long.MAX_VALUE) {
                kVar.T0 = true;
                return;
            }
            try {
                s8.l lVar = kVar.f13652g1;
                kVar.y0(j);
                p1 p1Var = kVar.J1;
                if (!p1Var.equals(p1.f11626d) && !p1Var.equals(kVar.K1)) {
                    kVar.K1 = p1Var;
                    lVar.A(p1Var);
                }
                kVar.V0.f254e++;
                w wVar = kVar.f13655j1;
                if (wVar.f13709e != 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wVar.f13709e = 3;
                wVar.f13715l.getClass();
                wVar.f13711g = u1.a0.Q(SystemClock.elapsedRealtime());
                if (z10 && (surface = kVar.f13666u1) != null) {
                    lVar.w(surface);
                    kVar.f13669x1 = true;
                }
                kVar.d0(j);
            } catch (a2.q e10) {
                kVar.U0 = e10;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i6 = message.arg1;
        int i10 = message.arg2;
        String str = u1.a0.f12750a;
        a(((i6 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
