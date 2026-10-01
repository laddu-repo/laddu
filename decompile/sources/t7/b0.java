package t7;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.t6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e eVar, Looper looper) {
        super(looper, 3);
        this.f12309a = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        t tVar;
        e eVar = this.f12309a;
        if (eVar.f12335x.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (tVar = (t) message.obj) != null) {
                tVar.c();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || i10 == 4 || i10 == 5) && !eVar.r()) {
            t tVar2 = (t) message.obj;
            if (tVar2 != null) {
                tVar2.c();
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            eVar.f12332u = new q7.b(message.arg2, null, null);
            if (!eVar.f12333v && !TextUtils.isEmpty(eVar.n()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(eVar.n());
                    if (!eVar.f12333v) {
                        eVar.u(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            q7.b bVar = eVar.f12332u;
            if (bVar == null) {
                bVar = new q7.b(8, null, null);
            }
            eVar.f12321j.a(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 5) {
            q7.b bVar2 = eVar.f12332u;
            if (bVar2 == null) {
                bVar2 = new q7.b(8, null, null);
            }
            eVar.f12321j.a(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            eVar.f12321j.a(new q7.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i11 == 6) {
            eVar.u(5, null);
            b bVar3 = eVar.f12326o;
            if (bVar3 != null) {
                bVar3.e(message.arg2);
            }
            System.currentTimeMillis();
            eVar.s(5, 1, null);
            return;
        }
        if (i11 == 2 && !eVar.q()) {
            t tVar3 = (t) message.obj;
            if (tVar3 != null) {
                tVar3.c();
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            Log.wtf("GmsClient", u5.a.b(i12, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i12).length() + 34)), new Exception());
            return;
        }
        t tVar4 = (t) message.obj;
        synchronized (tVar4) {
            try {
                bool = tVar4.f12407a;
                if (tVar4.f12408b) {
                    String string = tVar4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            e eVar2 = tVar4.f;
            int i13 = tVar4.f12410d;
            if (i13 != 0) {
                eVar2.u(1, null);
                Bundle bundle = tVar4.f12411e;
                tVar4.b(new q7.b(i13, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!tVar4.a()) {
                eVar2.u(1, null);
                tVar4.b(new q7.b(8, null, null));
            }
        }
        synchronized (tVar4) {
            tVar4.f12408b = true;
        }
        tVar4.c();
    }
}
