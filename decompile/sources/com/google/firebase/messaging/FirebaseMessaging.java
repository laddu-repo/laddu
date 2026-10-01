package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.lifecycle.d;
import bc.a;
import cc.e;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import i4.h0;
import i4.s0;
import ic.h;
import ic.i;
import ic.j;
import ic.l;
import ic.o;
import ic.t;
import ic.v;
import ic.z;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jb.g;
import k7.c;
import okhttp3.HttpUrl;
import s8.b;
import s8.m;
import s9.n;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: l, reason: collision with root package name */
    public static c f2839l;

    /* renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f2841n;

    /* renamed from: a, reason: collision with root package name */
    public final g f2842a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2843b;

    /* renamed from: c, reason: collision with root package name */
    public final d f2844c;

    /* renamed from: d, reason: collision with root package name */
    public final h f2845d;

    /* renamed from: e, reason: collision with root package name */
    public final a2.c f2846e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2847f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f2848g;

    /* renamed from: h, reason: collision with root package name */
    public final n f2849h;

    /* renamed from: i, reason: collision with root package name */
    public final o f2850i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f2838k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m, reason: collision with root package name */
    public static a f2840m = new j(0);

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ic.o] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.lifecycle.d, java.lang.Object] */
    public FirebaseMessaging(g gVar, a aVar, a aVar2, e eVar, a aVar3, yb.c cVar) {
        gVar.a();
        Context context = gVar.f7331a;
        final ?? obj = new Object();
        final int i6 = 0;
        obj.f6771b = 0;
        obj.f6772c = context;
        gVar.a();
        b bVar = new b(gVar.f7331a);
        final ?? obj2 = new Object();
        obj2.f896a = gVar;
        obj2.f897b = obj;
        obj2.f898c = bVar;
        obj2.f899d = aVar;
        obj2.f900e = aVar2;
        obj2.f901f = eVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new b9.a("Firebase-Messaging-Task"));
        final int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new b9.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b9.a("Firebase-Messaging-File-Io"));
        this.j = false;
        f2840m = aVar3;
        this.f2842a = gVar;
        this.f2846e = new a2.c(this, cVar);
        gVar.a();
        final Context context2 = gVar.f7331a;
        this.f2843b = context2;
        i iVar = new i();
        this.f2850i = obj;
        this.f2844c = obj2;
        this.f2845d = new h(newSingleThreadExecutor);
        this.f2847f = scheduledThreadPoolExecutor;
        this.f2848g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(iVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: ic.k

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f6762y;

            {
                this.f6762y = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f6762y;
                if (firebaseMessaging.f2846e.f() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.j) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                s9.n i11;
                int i12;
                switch (i6) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f6762y;
                        Context context3 = firebaseMessaging.f2843b;
                        a8.c.h(context3);
                        androidx.lifecycle.d dVar = firebaseMessaging.f2844c;
                        boolean g10 = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences e10 = a8.d.e(context3);
                            if (!e10.contains("proxy_retention") || e10.getBoolean("proxy_retention", false) != g10) {
                                s8.b bVar2 = (s8.b) dVar.f898c;
                                if (bVar2.f12229c.e() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g10);
                                    s8.n j = s8.n.j(bVar2.f12228b);
                                    synchronized (j) {
                                        i12 = j.f12259a;
                                        j.f12259a = i12 + 1;
                                    }
                                    i11 = j.k(new s8.m(i12, 4, bundle, 0));
                                } else {
                                    i11 = dg.b.i(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                i11.c(new q.a(1), new s0(context3, g10, 3));
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new b9.a("Firebase-Messaging-Topics-Io"));
        int i11 = z.j;
        n c10 = dg.b.c(scheduledThreadPoolExecutor2, new Callable() { // from class: ic.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                x xVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                o oVar = obj;
                androidx.lifecycle.d dVar = obj2;
                synchronized (x.class) {
                    try {
                        WeakReference weakReference = x.f6798d;
                        if (weakReference != null) {
                            xVar = (x) weakReference.get();
                        } else {
                            xVar = null;
                        }
                        if (xVar == null) {
                            x xVar2 = new x(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            xVar2.b();
                            x.f6798d = new WeakReference(xVar2);
                            xVar = xVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new z(firebaseMessaging, oVar, xVar, dVar, context3, scheduledThreadPoolExecutor3);
            }
        });
        this.f2849h = c10;
        c10.c(scheduledThreadPoolExecutor, new l(this, i6));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: ic.k

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f6762y;

            {
                this.f6762y = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f6762y;
                if (firebaseMessaging.f2846e.f() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.j) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                s9.n i112;
                int i12;
                switch (i10) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f6762y;
                        Context context3 = firebaseMessaging.f2843b;
                        a8.c.h(context3);
                        androidx.lifecycle.d dVar = firebaseMessaging.f2844c;
                        boolean g10 = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences e10 = a8.d.e(context3);
                            if (!e10.contains("proxy_retention") || e10.getBoolean("proxy_retention", false) != g10) {
                                s8.b bVar2 = (s8.b) dVar.f898c;
                                if (bVar2.f12229c.e() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", g10);
                                    s8.n j = s8.n.j(bVar2.f12228b);
                                    synchronized (j) {
                                        i12 = j.f12259a;
                                        j.f12259a = i12 + 1;
                                    }
                                    i112 = j.k(new s8.m(i12, 4, bundle, 0));
                                } else {
                                    i112 = dg.b.i(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                i112.c(new q.a(1), new s0(context3, g10, 3));
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f2841n == null) {
                    f2841n = new ScheduledThreadPoolExecutor(1, new b9.a("TAG"));
                }
                f2841n.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized c c(Context context) {
        c cVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f2839l == null) {
                    f2839l = new c(context);
                }
                cVar = f2839l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            x.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        t d10 = d();
        if (!i(d10)) {
            return d10.f6785a;
        }
        String c10 = o.c(this.f2842a);
        h hVar = this.f2845d;
        synchronized (hVar) {
            task = (Task) ((v.e) hVar.f6757b).get(c10);
            if (task != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + c10);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c10);
                }
                d dVar = this.f2844c;
                task = dVar.f(dVar.m(o.c((g) dVar.f896a), "*", new Bundle())).k(this.f2848g, new h0(this, c10, d10, 3)).d((Executor) hVar.f6756a, new b2.b(9, hVar, c10));
                ((v.e) hVar.f6757b).put(c10, task);
            }
        }
        try {
            return (String) dg.b.a(task);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final t d() {
        String d10;
        t b10;
        c c10 = c(this.f2843b);
        g gVar = this.f2842a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f7332b)) {
            d10 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            d10 = gVar.d();
        }
        String c11 = o.c(this.f2842a);
        synchronized (c10) {
            b10 = t.b(((SharedPreferences) c10.f7745y).getString(d10 + "|T|" + c11 + "|*", null));
        }
        return b10;
    }

    public final void e() {
        n i6;
        int i10;
        b bVar = (b) this.f2844c.f898c;
        if (bVar.f12229c.e() >= 241100000) {
            s8.n j = s8.n.j(bVar.f12228b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (j) {
                i10 = j.f12259a;
                j.f12259a = i10 + 1;
            }
            i6 = j.k(new m(i10, 5, bundle, 1)).j(s8.h.f12241z, s8.d.f12236z);
        } else {
            i6 = dg.b.i(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        i6.c(this.f2847f, new l(this, 1));
    }

    public final synchronized void f(boolean z10) {
        this.j = z10;
    }

    public final boolean g() {
        Object systemService;
        String notificationDelegate;
        Context context = this.f2843b;
        a8.c.h(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                systemService = context.getSystemService((Class<Object>) NotificationManager.class);
                notificationDelegate = ((NotificationManager) systemService).getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "GMS core is set for proxying");
                    }
                    if (this.f2842a.b(nb.b.class) == null) {
                        if (a8.b.c() && f2840m != null) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            } else {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void h(long j) {
        b(new v(this, Math.min(Math.max(30L, 2 * j), f2838k)), j);
        this.j = true;
    }

    public final boolean i(t tVar) {
        if (tVar != null) {
            String a10 = this.f2850i.a();
            if (System.currentTimeMillis() <= tVar.f6787c + t.f6784d && a10.equals(tVar.f6786b)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
