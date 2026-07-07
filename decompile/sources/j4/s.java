package j4;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: c, reason: collision with root package name */
    public boolean f7203c;

    /* renamed from: e, reason: collision with root package name */
    public f2.c f7205e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7201a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final r f7202b = new r(this);

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f7204d = new WeakReference(null);

    public final void C(u uVar, Handler handler) {
        synchronized (this.f7201a) {
            try {
                this.f7204d = new WeakReference(uVar);
                f2.c cVar = this.f7205e;
                if (cVar != null) {
                    cVar.removeCallbacksAndMessages(null);
                }
                this.f7205e = new f2.c(this, handler.getLooper(), 5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(u uVar, Handler handler) {
        long j;
        boolean z10;
        boolean z11;
        if (this.f7203c) {
            boolean z12 = false;
            this.f7203c = false;
            handler.removeMessages(1);
            k0 k0Var = uVar.f7214g;
            if (k0Var == null) {
                j = 0;
            } else {
                j = k0Var.B;
            }
            if (k0Var != null && k0Var.f7183x == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((516 & j) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((j & 514) != 0) {
                z12 = true;
            }
            if (z10 && z12) {
                h();
            } else if (!z10 && z11) {
                i();
            }
        }
    }

    public boolean g(Intent intent) {
        u uVar;
        f2.c cVar;
        KeyEvent keyEvent;
        long j;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f7201a) {
                uVar = (u) this.f7204d.get();
                cVar = this.f7205e;
            }
            if (uVar != null && cVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                d0 c10 = uVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(uVar, cVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (this.f7203c) {
                        cVar.removeMessages(1);
                        this.f7203c = false;
                        k0 k0Var = uVar.f7214g;
                        if (k0Var == null) {
                            j = 0;
                        } else {
                            j = k0Var.B;
                        }
                        if ((j & 32) != 0) {
                            y();
                        }
                        return true;
                    }
                    this.f7203c = true;
                    cVar.sendMessageDelayed(cVar.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                a(uVar, cVar);
                return true;
            }
        }
        return false;
    }

    public void B() {
    }

    public void f() {
    }

    public void h() {
    }

    public void i() {
    }

    public void m() {
    }

    public void r() {
    }

    public void y() {
    }

    public void z() {
    }

    public void A(long j) {
    }

    public void b(o oVar) {
    }

    public void q(o oVar) {
    }

    public void s(long j) {
    }

    public void t(float f3) {
    }

    public void u(l0 l0Var) {
    }

    public void v(l0 l0Var) {
    }

    public void w(int i6) {
    }

    public void x(int i6) {
    }

    public void c(o oVar, int i6) {
    }

    public void e(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(Uri uri, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
