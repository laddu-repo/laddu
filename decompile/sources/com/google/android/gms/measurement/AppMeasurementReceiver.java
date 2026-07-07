package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import m1.a;
import n9.n1;
import n9.u0;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {

    /* renamed from: c, reason: collision with root package name */
    public r f2555c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f2555c == null) {
            this.f2555c = new r(this, 17);
        }
        r rVar = this.f2555c;
        rVar.getClass();
        u0 u0Var = n1.m(context, null, null).C;
        n1.g(u0Var);
        if (intent == null) {
            u0Var.G.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        u0Var.L.b(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            u0Var.L.a("Starting wakeful intent.");
            ((AppMeasurementReceiver) rVar.f12916y).getClass();
            SparseArray sparseArray = a.f8411a;
            synchronized (sparseArray) {
                try {
                    int i6 = a.f8412b;
                    int i10 = i6 + 1;
                    a.f8412b = i10;
                    if (i10 <= 0) {
                        a.f8412b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i6);
                    ComponentName startService = context.startService(className);
                    if (startService == null) {
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000L);
                    sparseArray.put(i6, newWakeLock);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            u0Var.G.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
