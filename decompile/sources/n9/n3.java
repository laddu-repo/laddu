package n9;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n3 extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9417f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(Object obj, v1 v1Var, int i6) {
        super(v1Var);
        this.f9416e = i6;
        this.f9417f = obj;
    }

    @Override // n9.p
    public final void a() {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        switch (this.f9416e) {
            case 0:
                o3 o3Var = (o3) this.f9417f;
                p3 p3Var = (p3) o3Var.A;
                p3Var.d1();
                n1 n1Var = (n1) p3Var.f4301y;
                n1Var.H.getClass();
                o3Var.a(false, false, SystemClock.elapsedRealtime());
                b0 b0Var = n1Var.K;
                n1.d(b0Var);
                n1Var.H.getClass();
                b0Var.g1(SystemClock.elapsedRealtime());
                return;
            case 1:
                u3 u3Var = (u3) this.f9417f;
                u3Var.h1();
                u0 u0Var = ((n1) u3Var.f4301y).C;
                n1.g(u0Var);
                u0Var.L.a("Starting upload from DelayedRunnable");
                u3Var.f9511z.l();
                return;
            default:
                e4 e4Var = (e4) this.f9417f;
                e4Var.D().d1();
                String str = (String) e4Var.N.pollFirst();
                if (str != null) {
                    e4Var.D0().getClass();
                    e4Var.f9299f0 = SystemClock.elapsedRealtime();
                    e4Var.r().L.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = e4Var.I.f9413x;
                    if (Build.VERSION.SDK_INT >= 34) {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context.sendBroadcast(intent, null, bundle);
                    } else {
                        context.sendBroadcast(intent);
                    }
                }
                e4Var.B();
                return;
        }
    }
}
