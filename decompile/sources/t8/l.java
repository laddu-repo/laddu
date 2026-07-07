package t8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.h0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f12650b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(t8.e r2, android.content.Context r3) {
        /*
            r1 = this;
            r1.f12650b = r2
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto Ld
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r2 = android.os.Looper.myLooper()
        L11:
            r0 = 1
            r1.<init>(r2, r0)
            android.content.Context r2 = r3.getApplicationContext()
            r1.f12649a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.l.<init>(t8.e, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i6;
        PendingIntent activity;
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = f.f12639a;
        e eVar = this.f12650b;
        Context context = this.f12649a;
        int b10 = eVar.b(context, i11);
        AtomicBoolean atomicBoolean = i.f12641a;
        if (b10 != 1 && b10 != 2 && b10 != 3 && b10 != 9) {
            return;
        }
        Intent a10 = eVar.a(b10, context, "n");
        if (a10 == null) {
            activity = null;
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                i6 = 201326592;
            } else {
                i6 = 134217728;
            }
            activity = PendingIntent.getActivity(context, 0, a10, i6);
        }
        eVar.g(context, b10, activity);
    }
}
