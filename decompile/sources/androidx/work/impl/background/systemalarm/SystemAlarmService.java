package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.i0;
import f6.k;
import java.util.HashMap;
import java.util.WeakHashMap;
import v5.o;
import y5.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SystemAlarmService extends i0 {
    public static final String A = o.h("SystemAlarmService");

    /* renamed from: y, reason: collision with root package name */
    public g f1200y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1201z;

    public final void a() {
        this.f1201z = true;
        o.f().b(A, "All commands completed in dispatcher", new Throwable[0]);
        String str = k.f5045a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = k.f5046b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                o.f().i(k.f5045a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g gVar = new g(this);
        this.f1200y = gVar;
        if (gVar.G != null) {
            o.f().e(g.H, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            gVar.G = this;
        }
        this.f1201z = false;
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1201z = true;
        this.f1200y.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i10) {
        super.onStartCommand(intent, i6, i10);
        if (this.f1201z) {
            o.f().g(A, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1200y.e();
            g gVar = new g(this);
            this.f1200y = gVar;
            if (gVar.G != null) {
                o.f().e(g.H, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                gVar.G = this;
            }
            this.f1201z = false;
        }
        if (intent != null) {
            this.f1200y.a(i10, intent);
            return 3;
        }
        return 3;
    }
}
