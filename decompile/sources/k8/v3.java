package k8;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v3 extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7803e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, z1 z1Var, int i) {
        super(z1Var);
        this.f7803e = i;
        this.f = obj;
    }

    @Override // k8.o
    public final void a() {
        switch (this.f7803e) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                w3 w3Var = (w3) this.f;
                x3 x3Var = (x3) w3Var.f7823y;
                x3Var.D();
                p1 p1Var = (p1) x3Var.f2053w;
                p1Var.F.getClass();
                w3Var.a(SystemClock.elapsedRealtime(), false, false);
                y yVar = p1Var.I;
                p1.i(yVar);
                p1Var.F.getClass();
                yVar.G(SystemClock.elapsedRealtime());
                break;
            case 1:
                c4 c4Var = (c4) this.f;
                c4Var.I();
                v0 v0Var = ((p1) c4Var.f2053w).A;
                p1.l(v0Var);
                v0Var.J.a("Starting upload from DelayedRunnable");
                c4Var.f7447x.q();
                break;
            default:
                n4 n4Var = (n4) this.f;
                n4Var.d().D();
                String str = (String) n4Var.L.pollFirst();
                if (str != null) {
                    n4Var.g().getClass();
                    n4Var.f7654d0 = SystemClock.elapsedRealtime();
                    n4Var.c().J.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = n4Var.G.f7692v;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                n4Var.H();
                break;
        }
    }
}
