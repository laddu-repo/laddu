package s7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.t6;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k8.k4;
import t7.j0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback {
    public static final Status J = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status K = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object L = new Object();
    public static d M;
    public final q7.e A;
    public final ob.d B;
    public final AtomicInteger C;
    public final AtomicInteger D;
    public final ConcurrentHashMap E;
    public final v.f F;
    public final v.f G;
    public final t6 H;
    public volatile boolean I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f11512v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11513w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t7.m f11514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public v7.d f11515y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Context f11516z;

    public d(Context context, Looper looper) {
        q7.e eVar = q7.e.f10906e;
        this.f11512v = 10000L;
        this.f11513w = false;
        this.C = new AtomicInteger(1);
        this.D = new AtomicInteger(0);
        this.E = new ConcurrentHashMap(5, 0.75f, 1);
        this.F = new v.f(0);
        this.G = new v.f(0);
        this.I = true;
        this.f11516z = context;
        t6 t6Var = new t6(looper, this);
        Looper.getMainLooper();
        this.H = t6Var;
        this.A = eVar;
        this.B = new ob.d(13);
        PackageManager packageManager = context.getPackageManager();
        if (x7.b.f == null) {
            x7.b.f = Boolean.valueOf(x7.b.d() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (x7.b.f.booleanValue()) {
            this.I = false;
        }
        t6Var.sendMessage(t6Var.obtainMessage(6));
    }

    public static Status b(a aVar, q7.b bVar) {
        String str = (String) aVar.f11504b.f10197x;
        String strValueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb2.append("API: ");
        sb2.append(str);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(strValueOf);
        return new Status(17, sb2.toString(), bVar.f10895x, bVar);
    }

    public static d c(Context context) {
        d dVar;
        synchronized (L) {
            try {
                if (M == null) {
                    Looper looper = j0.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = q7.e.f10905d;
                    M = new d(applicationContext, looper);
                }
                dVar = M;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final j a(r7.f fVar) {
        a aVar = fVar.f;
        ConcurrentHashMap concurrentHashMap = this.E;
        j jVar = (j) concurrentHashMap.get(aVar);
        if (jVar == null) {
            jVar = new j(this, fVar);
            concurrentHashMap.put(aVar, jVar);
        }
        if (jVar.f11521e.b()) {
            this.G.add(aVar);
        }
        jVar.r();
        return jVar;
    }

    public final boolean d() {
        if (this.f11513w) {
            return false;
        }
        t7.k.e().getClass();
        int iM = this.B.m(203400000);
        return iM == -1 || iM == 0;
    }

    public final boolean e(q7.b bVar, int i) {
        q7.e eVar = this.A;
        eVar.getClass();
        Context context = this.f11516z;
        if (!z7.b.F(context)) {
            int i10 = bVar.f10894w;
            PendingIntent activity = bVar.f10895x;
            if (!((i10 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = eVar.a(i10, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i11 = GoogleApiActivity.f2455w;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i10, PendingIntent.getActivity(context, 0, intent, d8.c.f4389a | 134217728));
                eVar.getClass();
                Integer num = bVar.f10897z;
                t7.o oVar = new t7.o(num == null ? -1 : num.intValue(), bVar.f10894w, System.currentTimeMillis(), context.getPackageName(), false);
                if (eVar.f10907c == null) {
                    eVar.f10907c = new v7.d(context, v7.d.f13235k, r7.b.f11341a, r7.e.f11343c);
                }
                v7.d dVar = eVar.f10907c;
                dVar.getClass();
                com.bumptech.glide.manager.t tVarB = com.bumptech.glide.manager.t.b();
                tVarB.f2439y = new q7.d[]{d8.b.f4387b};
                tVarB.f2437w = false;
                tVarB.f2438x = new k4(oVar);
                dVar.b(2, tVarB.a());
                return true;
            }
        }
        return false;
    }

    public final void f(q7.b bVar, int i) {
        if (e(bVar, i)) {
            return;
        }
        t6 t6Var = this.H;
        t6Var.sendMessage(t6Var.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0328  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.d.handleMessage(android.os.Message):boolean");
    }
}
