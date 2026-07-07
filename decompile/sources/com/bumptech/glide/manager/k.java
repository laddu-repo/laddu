package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.q0;
import j6.w;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final t7.k f2416y = new t7.k(9);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile com.bumptech.glide.o f2417v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f2418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final sc.b f2419x = new sc.b(f2416y);

    public k() {
        this.f2418w = (w.f && w.f6974e) ? new e(0) : new kb.e(9);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.o b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = v6.m.f13232a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof h.j) {
                return c((h.j) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f2417v == null) {
            synchronized (this) {
                try {
                    if (this.f2417v == null) {
                        this.f2417v = new com.bumptech.glide.o(com.bumptech.glide.b.a(context.getApplicationContext()), new oa.b(8), new o9.f(9), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f2417v;
    }

    public final com.bumptech.glide.o c(h.j jVar) {
        char[] cArr = v6.m.f13232a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return b(jVar.getApplicationContext());
        }
        if (jVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f2418w.b(jVar);
        Activity activityA = a(jVar);
        boolean z2 = activityA == null || !activityA.isFinishing();
        com.bumptech.glide.b bVarA = com.bumptech.glide.b.a(jVar.getApplicationContext());
        androidx.lifecycle.u uVar = jVar.f6012v;
        q0 q0VarO = jVar.o();
        sc.b bVar = this.f2419x;
        bVar.getClass();
        HashMap map = (HashMap) bVar.f11786w;
        v6.m.a();
        v6.m.a();
        com.bumptech.glide.o oVar = (com.bumptech.glide.o) map.get(uVar);
        if (oVar != null) {
            return oVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(uVar);
        t7.k kVar = (t7.k) bVar.f11787x;
        oa.b bVar2 = new oa.b(bVar, q0VarO);
        kVar.getClass();
        com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(bVarA, lifecycleLifecycle, bVar2, jVar);
        map.put(uVar, oVar2);
        lifecycleLifecycle.j(new i(bVar, uVar));
        if (z2) {
            oVar2.k();
        }
        return oVar2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
