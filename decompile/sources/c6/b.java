package c6;

import android.content.Intent;
import android.content.IntentFilter;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f1966i = o.h("BatteryNotLowTracker");

    @Override // c6.d
    public final Object a() {
        Intent registerReceiver = this.f1971b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            o.f().e(f1966i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // c6.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // c6.c
    public final void g(Intent intent) {
        if (intent.getAction() != null) {
            o.f().b(f1966i, r4.a.k("Received ", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                if (!action.equals("android.intent.action.BATTERY_LOW")) {
                    return;
                }
                c(Boolean.FALSE);
                return;
            }
            c(Boolean.TRUE);
        }
    }
}
