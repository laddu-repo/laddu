package com.bumptech.glide.manager;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.savedstate.Recreator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements v6.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static volatile t f2435z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2436v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f2438x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f2439y;

    public /* synthetic */ t(int i, boolean z2) {
        this.f2436v = i;
    }

    public static t b() {
        t tVar = new t(5, false);
        tVar.f2437w = true;
        return tVar;
    }

    public static t d(Context context) {
        if (f2435z == null) {
            synchronized (t.class) {
                try {
                    if (f2435z == null) {
                        f2435z = new t(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f2435z;
    }

    public t a() {
        y.a("execute parameter required", ((s7.g) this.f2438x) != null);
        return new t(this, (q7.d[]) this.f2439y, this.f2437w);
    }

    public boolean c(r6.c cVar) {
        boolean z2 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f2438x).remove(cVar);
        if (!((HashSet) this.f2439y).remove(cVar) && !zRemove) {
            z2 = false;
        }
        if (z2) {
            cVar.clear();
        }
        return z2;
    }

    public void e() {
        u4.d dVar = (u4.d) this.f2438x;
        androidx.lifecycle.u uVarF = dVar.f();
        if (uVarF.f1238c != androidx.lifecycle.n.f1218w) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        uVarF.a(new Recreator(dVar));
        o.r rVar = (o.r) this.f2439y;
        rVar.getClass();
        if (rVar.f9282c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        uVarF.a(new c.e(2, rVar));
        rVar.f9282c = true;
        this.f2437w = true;
    }

    public void f(Bundle bundle) {
        if (!this.f2437w) {
            e();
        }
        androidx.lifecycle.u uVarF = ((u4.d) this.f2438x).f();
        if (uVarF.f1238c.compareTo(androidx.lifecycle.n.f1220y) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + uVarF.f1238c).toString());
        }
        o.r rVar = (o.r) this.f2439y;
        if (!rVar.f9282c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (rVar.f9283d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        rVar.f9280a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        rVar.f9283d = true;
    }

    public void g(Bundle bundle) {
        o.r rVar = (o.r) this.f2439y;
        rVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) rVar.f9280a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        q.f fVar = (q.f) rVar.f;
        fVar.getClass();
        q.d dVar = new q.d(fVar);
        fVar.f10628x.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((u4.c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    @Override // v6.g
    public Object get() {
        if (this.f2437w) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        fa.b.a("Glide registry");
        this.f2437w = true;
        try {
            return com.bumptech.glide.c.b((com.bumptech.glide.b) this.f2438x, (ArrayList) this.f2439y);
        } finally {
            this.f2437w = false;
            Trace.endSection();
        }
    }

    public void h(o8.n nVar) {
        synchronized (this.f2438x) {
            try {
                if (((ArrayDeque) this.f2439y) == null) {
                    this.f2439y = new ArrayDeque();
                }
                ((ArrayDeque) this.f2439y).add(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(o8.o oVar) {
        o8.n nVar;
        synchronized (this.f2438x) {
            if (((ArrayDeque) this.f2439y) != null && !this.f2437w) {
                this.f2437w = true;
                while (true) {
                    synchronized (this.f2438x) {
                        try {
                            nVar = (o8.n) ((ArrayDeque) this.f2439y).poll();
                            if (nVar == null) {
                                this.f2437w = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    nVar.a(oVar);
                }
            }
        }
    }

    public String toString() {
        switch (this.f2436v) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f2438x).size() + ", isPaused=" + this.f2437w + "}";
            default:
                return super.toString();
        }
    }

    public t(t tVar, q7.d[] dVarArr, boolean z2) {
        this.f2436v = 6;
        this.f2439y = tVar;
        this.f2438x = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z2) {
            z10 = true;
        }
        this.f2437w = z10;
    }

    public t(int i) {
        this.f2436v = i;
        switch (i) {
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                this.f2438x = new Object();
                break;
            default:
                this.f2438x = Collections.newSetFromMap(new WeakHashMap());
                this.f2439y = new HashSet();
                break;
        }
    }

    public t(u4.d dVar) {
        this.f2436v = 7;
        this.f2438x = dVar;
        this.f2439y = new o.r();
    }

    public t(Context context) {
        Object sVar;
        this.f2436v = 0;
        this.f2439y = new HashSet();
        q7.h hVar = new q7.h(new a7.l(context));
        m mVar = new m(this);
        if (Build.VERSION.SDK_INT >= 24) {
            sVar = new c2.b(hVar, mVar);
        } else {
            sVar = new s(context, hVar, mVar);
        }
        this.f2438x = sVar;
    }

    public t(com.bumptech.glide.b bVar, ArrayList arrayList, b8.h hVar) {
        this.f2436v = 1;
        this.f2438x = bVar;
        this.f2439y = arrayList;
    }
}
