package c2;

import a2.a2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.internal.measurement.t8;
import java.util.Objects;
import n9.l1;
import n9.n1;
import n9.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1799a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1800b;

    public /* synthetic */ g(Object obj, int i6) {
        this.f1799a = i6;
        this.f1800b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        switch (this.f1799a) {
            case 0:
                if (!isInitialStickyBroadcast()) {
                    h hVar = (h) this.f1800b;
                    hVar.a(d.b(context, intent, hVar.f1811i, hVar.f1810h));
                    return;
                }
                return;
            case 1:
                if (intent != null) {
                    ((c6.c) this.f1800b).g(intent);
                    return;
                }
                return;
            case 2:
                if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    v5.o.f().b(c6.f.j, "Network broadcast received", new Throwable[0]);
                    c6.f fVar = (c6.f) this.f1800b;
                    fVar.c(fVar.f());
                    return;
                }
                return;
            case 3:
                ((i.y) this.f1800b).j();
                return;
            case 4:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((j4.l) ((a2) ((i4.o0) this.f1800b).f6476k.f7159y).f162y).f7186a.dispatchMediaButtonEvent(keyEvent);
                    return;
                }
                return;
            case 5:
                n1 n1Var = (n1) this.f1800b;
                if (intent == null) {
                    u0 u0Var = n1Var.C;
                    n1.g(u0Var);
                    u0Var.G.a("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    u0 u0Var2 = n1Var.C;
                    n1.g(u0Var2);
                    u0Var2.G.a("App receiver called with null action");
                    return;
                }
                int hashCode = action.hashCode();
                if (hashCode != -1928239649) {
                    if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        u0 u0Var3 = n1Var.C;
                        n1.g(u0Var3);
                        u0Var3.L.a("[sgtm] App Receiver notified batches are available");
                        l1 l1Var = n1Var.D;
                        n1.g(l1Var);
                        l1Var.m1(new a1.e(this, 14));
                        return;
                    }
                } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    t8.a();
                    if (n1Var.A.n1(null, n9.e0.R0)) {
                        u0 u0Var4 = n1Var.C;
                        n1.g(u0Var4);
                        u0Var4.L.a("App receiver notified triggers are available");
                        l1 l1Var2 = n1Var.D;
                        n1.g(l1Var2);
                        l1Var2.m1(new a1.e(n1Var, 15));
                        return;
                    }
                    return;
                }
                u0 u0Var5 = n1Var.C;
                n1.g(u0Var5);
                u0Var5.G.a("App receiver called with unknown action");
                return;
            default:
                ((u1.r) this.f1800b).f12798a.execute(new m8.c(10, this, context));
                return;
        }
    }

    public g(n1 n1Var) {
        this.f1799a = 5;
        this.f1800b = n1Var;
    }
}
