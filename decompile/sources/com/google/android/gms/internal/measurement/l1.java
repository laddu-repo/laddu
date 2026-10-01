package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: f, reason: collision with root package name */
    public static volatile l1 f2328f;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f2329a;

    /* renamed from: b, reason: collision with root package name */
    public final u5.r f2330b;

    /* renamed from: c, reason: collision with root package name */
    public int f2331c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2332d;

    /* renamed from: e, reason: collision with root package name */
    public volatile l0 f2333e;

    public l1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2329a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f2330b = new u5.r(this, 15);
        new ArrayList();
        try {
            if (n9.a2.b(context, n9.a2.a(context)) != null) {
                try {
                    Class.forName(Constants.FID_CLASS, false, l1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f2332d = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new b1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new k1(this));
        }
    }

    public static l1 e(Context context, Bundle bundle) {
        w8.x.g(context);
        if (f2328f == null) {
            synchronized (l1.class) {
                try {
                    if (f2328f == null) {
                        f2328f = new l1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f2328f;
    }

    public final Map a(String str, String str2, boolean z10) {
        i0 i0Var = new i0();
        c(new g1(this, str, str2, z10, i0Var));
        Bundle d10 = i0Var.d(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        if (d10 != null && d10.size() != 0) {
            HashMap hashMap = new HashMap(d10.size());
            for (String str3 : d10.keySet()) {
                Object obj = d10.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.EMPTY_MAP;
    }

    public final int b(String str) {
        i0 i0Var = new i0();
        c(new b1(this, str, i0Var));
        Integer num = (Integer) i0.J(i0Var.d(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(i1 i1Var) {
        this.f2329a.execute(i1Var);
    }

    public final void d(Exception exc, boolean z10, boolean z11) {
        this.f2332d |= z10;
        if (z10) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            c(new y0(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        i0 i0Var = new i0();
        c(new a1(this, str, str2, i0Var));
        List list = (List) i0.J(i0Var.d(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT), List.class);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }
}
