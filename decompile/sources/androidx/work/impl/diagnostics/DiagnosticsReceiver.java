package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import n9.j;
import v5.o;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1205a = o.h("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f1205a;
        o.f().b(str, "Requesting diagnostics", new Throwable[0]);
        try {
            l.c(context).a(new j(DiagnosticsWorker.class).k());
        } catch (IllegalStateException e10) {
            o.f().e(str, "WorkManager is not initialized", e10);
        }
    }
}
