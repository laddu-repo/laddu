package c6;

import android.content.Intent;
import android.content.IntentFilter;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f1980i = o.h("StorageNotLowTracker");

    @Override // c6.d
    public final Object a() {
        Intent registerReceiver = this.f1971b.registerReceiver(null, f());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // c6.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // c6.c
    public final void g(Intent intent) {
        if (intent.getAction() != null) {
            o.f().b(f1980i, r4.a.k("Received ", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return;
                }
                c(Boolean.TRUE);
                return;
            }
            c(Boolean.FALSE);
        }
    }
}
