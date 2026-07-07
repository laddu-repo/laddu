package s8;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import w8.g0;
import w8.h0;
import w8.i0;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Handler.Callback {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12245x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f12246y;

    public /* synthetic */ j(Object obj, int i6) {
        this.f12245x = i6;
        this.f12246y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Exception, c2.r] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Exception, c2.r] */
    private final boolean a(Message message) {
        int i6 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + i6);
        }
        k kVar = (k) this.f12246y;
        synchronized (kVar) {
            try {
                m mVar = (m) kVar.B.get(i6);
                if (mVar == 0) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i6);
                    return true;
                }
                kVar.B.remove(i6);
                kVar.c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    mVar.b(new Exception("Not supported by GmsCore", null));
                    return true;
                }
                switch (mVar.f12257e) {
                    case 0:
                        if (data.getBoolean("ack", false)) {
                            mVar.c(null);
                            return true;
                        }
                        mVar.b(new Exception("Invalid response to one way request", null));
                        return true;
                    default:
                        Bundle bundle = data.getBundle(JsonStorageKeyNames.DATA_KEY);
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        mVar.c(bundle);
                        return true;
                }
            } finally {
            }
        }
    }

    private final boolean b(Message message) {
        int i6 = message.what;
        if (i6 != 0) {
            if (i6 != 1) {
                return false;
            }
            synchronized (((i0) this.f12246y).f14198a) {
                try {
                    g0 g0Var = (g0) message.obj;
                    h0 h0Var = (h0) ((i0) this.f12246y).f14198a.get(g0Var);
                    if (h0Var != null && h0Var.f14193y == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g0Var)), new Exception());
                        ComponentName componentName = h0Var.C;
                        if (componentName == null) {
                            g0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = g0Var.f14187b;
                            x.g(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        h0Var.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (((i0) this.f12246y).f14198a) {
            try {
                g0 g0Var2 = (g0) message.obj;
                h0 h0Var2 = (h0) ((i0) this.f12246y).f14198a.get(g0Var2);
                if (h0Var2 != null && h0Var2.f14192x.isEmpty()) {
                    if (h0Var2.f14194z) {
                        h0Var2.D.f14200c.removeMessages(1, h0Var2.B);
                        i0 i0Var = h0Var2.D;
                        i0Var.f14201d.c(i0Var.f14199b, h0Var2);
                        h0Var2.f14194z = false;
                        h0Var2.f14193y = 2;
                    }
                    ((i0) this.f12246y).f14198a.remove(g0Var2);
                }
            } finally {
            }
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f12245x) {
            case 0:
                return a(message);
            case 1:
                return b(message);
            default:
                if (message.what != 0) {
                    return false;
                }
                v9.b bVar = (v9.b) this.f12246y;
                if (message.obj == null) {
                    synchronized (bVar.f13479x) {
                        throw null;
                    }
                }
                throw new ClassCastException();
        }
    }
}
