package hf;

import android.os.Handler;
import android.os.Looper;
import b1.m;
import gf.f0;
import gf.k;
import gf.k0;
import gf.o0;
import gf.q0;
import gf.x1;
import gf.y;
import hb.s;
import java.util.concurrent.CancellationException;
import le.h;
import mf.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends y implements k0 {
    public final d A;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f6106y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f6107z;

    public d(Handler handler, boolean z10) {
        d dVar;
        this.f6106y = handler;
        this.f6107z = z10;
        if (z10) {
            dVar = this;
        } else {
            dVar = new d(handler, true);
        }
        this.A = dVar;
    }

    @Override // gf.k0
    public final void K(long j, k kVar) {
        s sVar = new s(8, kVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f6106y.postDelayed(sVar, j)) {
            kVar.u(new m(1, this, sVar));
        } else {
            j0(kVar.B, sVar);
        }
    }

    @Override // gf.k0
    public final q0 S(long j, final Runnable runnable, h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f6106y.postDelayed(runnable, j)) {
            return new q0() { // from class: hf.c
                @Override // gf.q0
                public final void d() {
                    d.this.f6106y.removeCallbacks(runnable);
                }
            };
        }
        j0(hVar, runnable);
        return x1.f5725x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f6106y == this.f6106y && dVar.f6107z == this.f6107z) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // gf.y
    public final void f0(h hVar, Runnable runnable) {
        if (!this.f6106y.post(runnable)) {
            j0(hVar, runnable);
        }
    }

    @Override // gf.y
    public final boolean h0() {
        if (this.f6107z && kotlin.jvm.internal.k.a(Looper.myLooper(), this.f6106y.getLooper())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6;
        int identityHashCode = System.identityHashCode(this.f6106y);
        if (this.f6107z) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        return identityHashCode ^ i6;
    }

    @Override // gf.y
    public y i0(int i6) {
        mf.a.a(1);
        return this;
    }

    public final void j0(h hVar, Runnable runnable) {
        f0.h(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        o0.f5694b.f0(hVar, runnable);
    }

    @Override // gf.y
    public final String toString() {
        d dVar;
        String str;
        of.e eVar = o0.f5693a;
        d dVar2 = o.f8875a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.A;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            if (this == dVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.f6106y.toString();
            if (this.f6107z) {
                return w8.k.c(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
