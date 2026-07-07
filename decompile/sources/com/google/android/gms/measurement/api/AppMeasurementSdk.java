package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.y7;
import java.util.ArrayList;
import ka.b;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7 f3300a;

    public AppMeasurementSdk(y7 y7Var) {
        this.f3300a = y7Var;
    }

    @Keep
    public static AppMeasurementSdk getInstance(Context context) {
        return y7.e(context, null).f3249b;
    }

    public final void a(b bVar) {
        y7 y7Var = this.f3300a;
        ArrayList arrayList = y7Var.f3250c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            v7 v7Var = new v7(bVar);
            arrayList.add(new Pair(bVar, v7Var));
            if (y7Var.f != null) {
                try {
                    y7Var.f.registerOnMeasurementEventListener(v7Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            y7Var.c(new k7(y7Var, v7Var, 4));
        }
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        y7 y7Var = this.f3300a;
        y7Var.c(new o7(y7Var, str, 0));
    }

    @Keep
    public void endAdUnitExposure(String str) {
        y7 y7Var = this.f3300a;
        y7Var.c(new o7(y7Var, str, 1));
    }

    @Keep
    public long generateEventId() {
        return this.f3300a.g();
    }

    @Keep
    public String getAppInstanceId() {
        u6 u6Var = new u6();
        y7 y7Var = this.f3300a;
        y7Var.c(new q7(y7Var, u6Var, 1));
        return (String) u6.f(u6Var.e(50L), String.class);
    }

    @Keep
    public String getGmpAppId() {
        u6 u6Var = new u6();
        y7 y7Var = this.f3300a;
        y7Var.c(new q7(y7Var, u6Var, 0));
        return (String) u6.f(u6Var.e(500L), String.class);
    }

    @Keep
    public void logEvent(String str, String str2, Bundle bundle) {
        y7 y7Var = this.f3300a;
        y7Var.c(new l7(y7Var, str, str2, bundle, 1));
    }
}
