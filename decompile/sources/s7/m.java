package s7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.ee;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11532a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f11533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11534c;

    public /* synthetic */ m() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        ee eeVar = (ee) this.f11534c;
        if (eeVar != null) {
            Context context = ((FirebaseMessaging) eeVar.f2614y).f3614b;
            this.f11533b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f11532a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((androidx.fragment.app.m) ((ob.d) this.f11534c).f10106x).getClass();
                    throw null;
                }
                return;
            default:
                ee eeVar = (ee) this.f11534c;
                if (eeVar != null && eeVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    ee eeVar2 = (ee) this.f11534c;
                    ((FirebaseMessaging) eeVar2.f2614y).getClass();
                    FirebaseMessaging.b(eeVar2, 0L);
                    Context context2 = this.f11533b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f11534c = null;
                    return;
                }
                return;
        }
    }

    public m(ob.d dVar) {
        this.f11534c = dVar;
    }
}
