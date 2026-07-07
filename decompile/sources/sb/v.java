package sb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f11771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f11772b;

    public v(w wVar, w wVar2) {
        this.f11772b = wVar;
        this.f11771a = wVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f11772b.f11773v.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            w wVar = this.f11771a;
            if (wVar == null) {
                return;
            }
            if (wVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                w wVar2 = this.f11771a;
                wVar2.f11776y.f.schedule(wVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f11771a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
