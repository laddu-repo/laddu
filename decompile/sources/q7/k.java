package q7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.t6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f10919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f10919b = eVar;
        this.f10918a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i10 = f.f10908a;
        e eVar = this.f10919b;
        Context context = this.f10918a;
        int iB = eVar.b(context, i10);
        int i11 = g.f10914e;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = eVar.a(iB, context, "n");
            eVar.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
