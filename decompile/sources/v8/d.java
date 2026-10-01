package v8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.h0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import w8.i0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements Handler.Callback {
    public static final Status L = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status M = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object N = new Object();
    public static d O;
    public y8.c A;
    public final Context B;
    public final t8.e C;
    public final s8.l D;
    public final AtomicInteger E;
    public final AtomicInteger F;
    public final ConcurrentHashMap G;
    public final v.f H;
    public final v.f I;
    public final h0 J;
    public volatile boolean K;

    /* renamed from: x, reason: collision with root package name */
    public long f13447x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13448y;

    /* renamed from: z, reason: collision with root package name */
    public w8.n f13449z;

    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.Handler, com.google.android.gms.internal.measurement.h0] */
    public d(Context context, Looper looper) {
        t8.e eVar = t8.e.f12638d;
        this.f13447x = 10000L;
        this.f13448y = false;
        this.E = new AtomicInteger(1);
        this.F = new AtomicInteger(0);
        this.G = new ConcurrentHashMap(5, 0.75f, 1);
        this.H = new v.f(0);
        this.I = new v.f(0);
        this.K = true;
        this.B = context;
        ?? handler = new Handler(looper, this);
        Looper.getMainLooper();
        this.J = handler;
        this.C = eVar;
        this.D = new s8.l(25);
        PackageManager packageManager = context.getPackageManager();
        if (a9.b.f635f == null) {
            a9.b.f635f = Boolean.valueOf(a9.b.d() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (a9.b.f635f.booleanValue()) {
            this.K = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static Status b(a aVar, t8.b bVar) {
        return new Status(17, "API: " + ((String) aVar.f13441b.f12252z) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f12630z, bVar);
    }

    public static d e(Context context) {
        d dVar;
        synchronized (N) {
            try {
                if (O == null) {
                    Looper looper = i0.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = t8.e.f12637c;
                    O = new d(applicationContext, looper);
                }
                dVar = O;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final boolean a(t8.b bVar, int i6) {
        boolean z10;
        int i10;
        t8.e eVar = this.C;
        eVar.getClass();
        Context context = this.B;
        if (!c9.a.j(context)) {
            int i11 = bVar.f12629y;
            PendingIntent pendingIntent = bVar.f12630z;
            if (i11 != 0 && pendingIntent != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                pendingIntent = null;
                Intent a10 = eVar.a(i11, context, null);
                if (a10 != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        i10 = 201326592;
                    } else {
                        i10 = 134217728;
                    }
                    pendingIntent = PendingIntent.getActivity(context, 0, a10, i10);
                }
            }
            if (pendingIntent != null) {
                int i12 = GoogleApiActivity.f2130y;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i6);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i11, PendingIntent.getActivity(context, 0, intent, g9.d.f5564a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final j c(y8.c cVar) {
        a aVar = cVar.f15018e;
        ConcurrentHashMap concurrentHashMap = this.G;
        j jVar = (j) concurrentHashMap.get(aVar);
        if (jVar == null) {
            jVar = new j(this, cVar);
            concurrentHashMap.put(aVar, jVar);
        }
        if (jVar.f13454f.m()) {
            this.I.add(aVar);
        }
        jVar.l();
        return jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r1 != 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r6 = this;
            w8.n r0 = r6.f13449z
            if (r0 == 0) goto L55
            int r1 = r0.f14214x
            if (r1 > 0) goto L3a
            boolean r1 = r6.f13448y
            if (r1 == 0) goto Ld
            goto L52
        Ld:
            java.lang.Class<w8.l> r1 = w8.l.class
            monitor-enter(r1)
            w8.l r2 = w8.l.f14208y     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1f
            w8.l r2 = new w8.l     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            w8.l.f14208y = r2     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L38
        L1f:
            w8.l r2 = w8.l.f14208y     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            r2.getClass()
            s8.l r1 = r6.D
            java.lang.Object r1 = r1.f12251y
            android.util.SparseIntArray r1 = (android.util.SparseIntArray) r1
            r2 = 203400000(0xc1fa340, float:1.2298041E-31)
            r3 = -1
            int r1 = r1.get(r2, r3)
            if (r1 == r3) goto L3a
            if (r1 != 0) goto L52
            goto L3a
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L3a:
            y8.c r1 = r6.A
            if (r1 != 0) goto L4d
            android.content.Context r1 = r6.B
            w8.o r2 = w8.o.f14216b
            y8.c r3 = new y8.c
            s8.l r4 = y8.c.f15013i
            u8.b r5 = u8.b.f12950b
            r3.<init>(r1, r4, r2, r5)
            r6.A = r3
        L4d:
            y8.c r1 = r6.A
            r1.a(r0)
        L52:
            r0 = 0
            r6.f13449z = r0
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.d.d():void");
    }

    public final void f(t8.b bVar, int i6) {
        if (!a(bVar, i6)) {
            h0 h0Var = this.J;
            h0Var.sendMessage(h0Var.obtainMessage(5, i6, 0, bVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r2 != 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0324  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.d.handleMessage(android.os.Message):boolean");
    }
}
