package r9;

import a9.d;
import a9.e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import c9.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f11884n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f11885o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f11886p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f11887a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f11888b;

    /* renamed from: c, reason: collision with root package name */
    public int f11889c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f11890d;

    /* renamed from: e, reason: collision with root package name */
    public long f11891e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f11892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11893g;

    /* renamed from: h, reason: collision with root package name */
    public j9.a f11894h;

    /* renamed from: i, reason: collision with root package name */
    public final a9.a f11895i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f11896k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f11897l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f11898m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f11887a = new Object();
        this.f11889c = 0;
        this.f11892f = new HashSet();
        this.f11893g = true;
        this.f11895i = a9.a.f629a;
        this.f11896k = new HashMap();
        this.f11897l = new AtomicInteger(0);
        x.e("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f11894h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.j = str;
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f11888b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (e.a(context)) {
                int i6 = d.f639a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo a10 = c.a(context).a(0, packageName);
                        if (a10 == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i10 = a10.uid;
                            workSource = new WorkSource();
                            Method method = e.f641b;
                            if (method != null) {
                                try {
                                    method.invoke(workSource, Integer.valueOf(i10), packageName);
                                } catch (Exception e10) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                }
                            } else {
                                Method method2 = e.f640a;
                                if (method2 != null) {
                                    try {
                                        method2.invoke(workSource, Integer.valueOf(i10));
                                    } catch (Exception e11) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f11888b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                        Log.wtf("WakeLock", e12.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f11885o;
            if (scheduledExecutorService == null) {
                synchronized (f11886p) {
                    try {
                        scheduledExecutorService = f11885o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f11885o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f11898m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j) {
        this.f11897l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f11884n), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f11887a) {
            try {
                if (!b()) {
                    this.f11894h = j9.a.f7316x;
                    this.f11888b.acquire();
                    this.f11895i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f11889c++;
                if (this.f11893g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f11896k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f11896k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f11899a++;
                this.f11895i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f11891e) {
                    this.f11891e = j10;
                    ScheduledFuture scheduledFuture = this.f11890d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f11890d = this.f11898m.schedule(new a1.e(this, 19), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f11887a) {
            if (this.f11889c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f11897l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f11887a) {
            try {
                if (this.f11893g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f11896k.containsKey(null)) {
                    b bVar = (b) this.f11896k.get(null);
                    if (bVar != null) {
                        int i6 = bVar.f11899a - 1;
                        bVar.f11899a = i6;
                        if (i6 == 0) {
                            this.f11896k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f11892f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() <= 0) {
            } else {
                throw h8.c.h(0, arrayList);
            }
        }
    }

    public final void e() {
        synchronized (this.f11887a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f11893g) {
                    int i6 = this.f11889c - 1;
                    this.f11889c = i6;
                    if (i6 > 0) {
                        return;
                    }
                } else {
                    this.f11889c = 0;
                }
                d();
                Iterator it = this.f11896k.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).f11899a = 0;
                }
                this.f11896k.clear();
                ScheduledFuture scheduledFuture = this.f11890d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f11890d = null;
                    this.f11891e = 0L;
                }
                if (this.f11888b.isHeld()) {
                    try {
                        try {
                            this.f11888b.release();
                            if (this.f11894h != null) {
                                this.f11894h = null;
                            }
                        } catch (RuntimeException e10) {
                            if (e10.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e10);
                                if (this.f11894h != null) {
                                    this.f11894h = null;
                                }
                            } else {
                                throw e10;
                            }
                        }
                    } catch (Throwable th) {
                        if (this.f11894h != null) {
                            this.f11894h = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
