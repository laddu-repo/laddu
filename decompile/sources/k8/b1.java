package k8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4 f7396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7398c;

    public b1(n4 n4Var) {
        t7.y.g(n4Var);
        this.f7396a = n4Var;
    }

    public final void a() {
        n4 n4Var = this.f7396a;
        n4Var.l0();
        n4Var.d().D();
        n4Var.d().D();
        if (this.f7397b) {
            n4Var.c().J.a("Unregistering connectivity change receiver");
            this.f7397b = false;
            this.f7398c = false;
            try {
                n4Var.G.f7692v.unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                n4Var.c().B.b(e7, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n4 n4Var = this.f7396a;
        n4Var.l0();
        String action = intent.getAction();
        n4Var.c().J.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            n4Var.c().E.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        z0 z0Var = n4Var.f7657w;
        n4.T(z0Var);
        boolean zH = z0Var.H();
        if (this.f7398c != zH) {
            this.f7398c = zH;
            n4Var.d().M(new androidx.fragment.app.m(this, zH));
        }
    }
}
