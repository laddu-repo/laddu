package s8;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12243x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f12244y;

    public /* synthetic */ i(k kVar, int i6) {
        this.f12243x = i6;
        this.f12244y = kVar;
    }

    private final void a() {
        k kVar = this.f12244y;
        synchronized (kVar) {
            if (kVar.f12247x == 1) {
                kVar.a("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12243x) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f12244y.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar = this.f12244y;
            synchronized (kVar) {
                try {
                    if (kVar.f12247x == 2) {
                        if (kVar.A.isEmpty()) {
                            kVar.c();
                            return;
                        }
                        m mVar = (m) kVar.A.poll();
                        kVar.B.put(mVar.f12253a, mVar);
                        ((ScheduledExecutorService) kVar.C.f12261c).schedule(new rb.i(2, kVar, mVar), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(mVar)));
                        }
                        n nVar = kVar.C;
                        Messenger messenger = kVar.f12248y;
                        int i6 = mVar.f12255c;
                        Context context = (Context) nVar.f12260b;
                        Message obtain = Message.obtain();
                        obtain.what = i6;
                        obtain.arg1 = mVar.f12253a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", mVar.a());
                        bundle.putString("pkg", context.getPackageName());
                        bundle.putBundle(JsonStorageKeyNames.DATA_KEY, mVar.f12256d);
                        obtain.setData(bundle);
                        try {
                            l lVar = kVar.f12249z;
                            Messenger messenger2 = (Messenger) lVar.f12251y;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                g gVar = (g) lVar.f12252z;
                                if (gVar != null) {
                                    Messenger messenger3 = gVar.f12239x;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e10) {
                            kVar.a(e10.getMessage());
                        }
                    } else {
                        return;
                    }
                } finally {
                }
            }
        }
    }
}
