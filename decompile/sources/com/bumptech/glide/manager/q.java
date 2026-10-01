package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.t4;
import e2.w;
import k8.f0;
import k8.n1;
import k8.p1;
import k8.v0;
import o2.i0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2427b;

    public /* synthetic */ q(int i, Object obj) {
        this.f2426a = i;
        this.f2427b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2426a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                s.B.execute(new r((s) this.f2427b, 2));
                break;
            case 1:
                if (!isInitialStickyBroadcast()) {
                    e2.e eVar = (e2.e) this.f2427b;
                    eVar.d(e2.b.b(context, intent, (t1.c) eVar.f4607j, (a9.g) eVar.i));
                }
                break;
            case 2:
                ((androidx.fragment.app.h) this.f2427b).m();
                break;
            case 3:
                w.a((w) this.f2427b);
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                p1 p1Var = (p1) this.f2427b;
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode != -1928239649) {
                            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                v0 v0Var = p1Var.A;
                                p1.l(v0Var);
                                v0Var.J.a("[sgtm] App Receiver notified batches are available");
                                n1 n1Var = p1Var.B;
                                p1.l(n1Var);
                                n1Var.M(new androidx.fragment.app.m(16, this));
                            }
                            break;
                        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            t4.a();
                            if (p1Var.f7695y.O(null, f0.Q0)) {
                                v0 v0Var2 = p1Var.A;
                                p1.l(v0Var2);
                                v0Var2.J.a("App receiver notified triggers are available");
                                n1 n1Var2 = p1Var.B;
                                p1.l(n1Var2);
                                n1Var2.M(new androidx.fragment.app.m(17, p1Var));
                                break;
                            }
                        }
                        v0 v0Var3 = p1Var.A;
                        p1.l(v0Var3);
                        v0Var3.E.a("App receiver called with unknown action");
                    } else {
                        v0 v0Var4 = p1Var.A;
                        p1.l(v0Var4);
                        v0Var4.E.a("App receiver called with null action");
                    }
                } else {
                    v0 v0Var5 = p1Var.A;
                    p1.l(v0Var5);
                    v0Var5.E.a("App receiver called with null intent");
                }
                break;
            default:
                ((w1.s) this.f2427b).f13731a.execute(new i0(15, this, context));
                break;
        }
    }

    public q(p1 p1Var) {
        this.f2426a = 4;
        this.f2427b = p1Var;
    }
}
