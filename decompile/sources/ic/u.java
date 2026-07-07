package ic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6788a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Context f6789b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6790c;

    public /* synthetic */ u() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        v vVar = (v) this.f6790c;
        if (vVar != null) {
            Context context = vVar.f6793z.f2843b;
            this.f6789b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        switch (this.f6788a) {
            case 0:
                v vVar = (v) this.f6790c;
                if (vVar != null && vVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    v vVar2 = (v) this.f6790c;
                    vVar2.f6793z.getClass();
                    FirebaseMessaging.b(vVar2, 0L);
                    Context context2 = this.f6789b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f6790c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = null;
                }
                if (!"com.google.android.gms".equals(str)) {
                    return;
                }
                Object obj = ((s8.l) this.f6790c).f12252z;
                throw null;
        }
    }

    public u(s8.l lVar) {
        this.f6790c = lVar;
    }
}
