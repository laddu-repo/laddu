package k8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.o6;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements ServiceConnection {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f1 f7459w;

    public e1(f1 f1Var, String str) {
        Objects.requireNonNull(f1Var);
        this.f7459w = f1Var;
        this.f7458v = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f1 f1Var = this.f7459w;
        if (iBinder == null) {
            v0 v0Var = f1Var.f7537v.A;
            p1.l(v0Var);
            v0Var.E.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = n6.f2913d;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            o6 m6Var = iInterfaceQueryLocalInterface instanceof o6 ? (o6) iInterfaceQueryLocalInterface : new m6(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
            p1 p1Var = f1Var.f7537v;
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.J.a("Install Referrer Service connected");
            n1 n1Var = p1Var.B;
            p1.l(n1Var);
            n1Var.M(new da.m0(this, m6Var, this));
        } catch (RuntimeException e7) {
            v0 v0Var3 = f1Var.f7537v.A;
            p1.l(v0Var3);
            v0Var3.E.b(e7, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        v0 v0Var = this.f7459w.f7537v.A;
        p1.l(v0Var);
        v0Var.J.a("Install Referrer Service disconnected");
    }
}
