package p7;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f10417w;

    public /* synthetic */ j(k kVar, int i) {
        this.f10416v = i;
        this.f10417w = kVar;
    }

    private final void a() {
        k kVar = this.f10417w;
        synchronized (kVar) {
            if (kVar.f10418v == 1) {
                kVar.a("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10416v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            case 1:
                a();
                return;
            default:
                this.f10417w.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar = this.f10417w;
            synchronized (kVar) {
                try {
                    if (kVar.f10418v != 2) {
                        return;
                    }
                    if (kVar.f10421y.isEmpty()) {
                        kVar.c();
                        return;
                    }
                    l lVar = (l) kVar.f10421y.poll();
                    kVar.f10422z.put(lVar.f10423a, lVar);
                    ((ScheduledExecutorService) kVar.A.f10431x).schedule(new o8.m(kVar, lVar, false, 3), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                    }
                    m mVar = kVar.A;
                    Messenger messenger = kVar.f10419w;
                    int i = lVar.f10425c;
                    Context context = (Context) mVar.f10430w;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = lVar.f10423a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", lVar.f10426d);
                    messageObtain.setData(bundle);
                    try {
                        ob.d dVar = kVar.f10420x;
                        Messenger messenger2 = (Messenger) dVar.f10105w;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            g gVar = (g) dVar.f10106x;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.f10411v;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e7) {
                        kVar.a(e7.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
