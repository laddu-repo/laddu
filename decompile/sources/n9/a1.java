package n9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final e4 f9154a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9155b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9156c;

    public a1(e4 e4Var) {
        w8.x.g(e4Var);
        this.f9154a = e4Var;
    }

    public final void a() {
        e4 e4Var = this.f9154a;
        e4Var.i0();
        e4Var.D().d1();
        e4Var.D().d1();
        if (!this.f9155b) {
            return;
        }
        e4Var.r().L.a("Unregistering connectivity change receiver");
        this.f9155b = false;
        this.f9156c = false;
        try {
            e4Var.I.f9413x.unregisterReceiver(this);
        } catch (IllegalArgumentException e10) {
            e4Var.r().D.b(e10, "Failed to unregister the network broadcast receiver");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e4 e4Var = this.f9154a;
        e4Var.i0();
        String action = intent.getAction();
        e4Var.r().L.b(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            y0 y0Var = e4Var.f9302y;
            e4.P(y0Var);
            boolean x12 = y0Var.x1();
            if (this.f9156c != x12) {
                this.f9156c = x12;
                e4Var.D().m1(new a1.e(this, x12));
                return;
            }
            return;
        }
        e4Var.r().G.b(action, "NetworkBroadcastReceiver received unknown action");
    }
}
