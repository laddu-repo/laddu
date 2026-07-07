package n9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d1 implements ServiceConnection {

    /* renamed from: x, reason: collision with root package name */
    public final String f9214x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ lc.c f9215y;

    public d1(lc.c cVar, String str) {
        Objects.requireNonNull(cVar);
        this.f9215y = cVar;
        this.f9214x = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.measurement.c0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ?? r12;
        lc.c cVar = this.f9215y;
        if (iBinder != null) {
            try {
                int i6 = com.google.android.gms.internal.measurement.b0.f2154e;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof com.google.android.gms.internal.measurement.c0) {
                    r12 = (com.google.android.gms.internal.measurement.c0) queryLocalInterface;
                } else {
                    r12 = new com.google.android.gms.internal.measurement.x(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
                }
                n1 n1Var = (n1) cVar.f8328x;
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.L.a("Install Referrer Service connected");
                l1 l1Var = n1Var.D;
                n1.g(l1Var);
                l1Var.m1(new hb.s(this, (com.google.android.gms.internal.measurement.c0) r12, this));
                return;
            } catch (RuntimeException e10) {
                u0 u0Var2 = ((n1) cVar.f8328x).C;
                n1.g(u0Var2);
                u0Var2.G.b(e10, "Exception occurred while calling Install Referrer API");
                return;
            }
        }
        u0 u0Var3 = ((n1) cVar.f8328x).C;
        n1.g(u0Var3);
        u0Var3.G.a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        u0 u0Var = ((n1) this.f9215y.f8328x).C;
        n1.g(u0Var);
        u0Var.L.a("Install Referrer Service disconnected");
    }
}
