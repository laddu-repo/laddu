package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.manager.t;
import com.bumptech.glide.manager.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ComponentCallbacks2, com.bumptech.glide.manager.h {
    public static final r6.g F;
    public final u A;
    public final androidx.fragment.app.m B;
    public final com.bumptech.glide.manager.b C;
    public final CopyOnWriteArrayList D;
    public r6.g E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f2443v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f2444w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.manager.g f2445x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f2446y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.bumptech.glide.manager.l f2447z;

    static {
        r6.g gVar = (r6.g) new r6.g().c(Bitmap.class);
        gVar.H = true;
        F = gVar;
        ((r6.g) new r6.g().c(n6.b.class)).H = true;
    }

    public o(b bVar, com.bumptech.glide.manager.g gVar, com.bumptech.glide.manager.l lVar, Context context) {
        t tVar = new t(2);
        t7.k kVar = bVar.A;
        this.A = new u();
        androidx.fragment.app.m mVar = new androidx.fragment.app.m(5, this);
        this.B = mVar;
        this.f2443v = bVar;
        this.f2445x = gVar;
        this.f2447z = lVar;
        this.f2446y = tVar;
        this.f2444w = context;
        Context applicationContext = context.getApplicationContext();
        n nVar = new n(this, tVar);
        kVar.getClass();
        boolean z2 = i0.d.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z2 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        com.bumptech.glide.manager.b cVar = z2 ? new com.bumptech.glide.manager.c(applicationContext, nVar) : new com.bumptech.glide.manager.j();
        this.C = cVar;
        synchronized (bVar.B) {
            if (bVar.B.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.B.add(this);
        }
        char[] cArr = v6.m.f13232a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar.j(this);
        } else {
            v6.m.f().post(mVar);
        }
        gVar.j(cVar);
        this.D = new CopyOnWriteArrayList(bVar.f2344x.f2357e);
        q(bVar.f2344x.a());
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void c() {
        this.A.c();
        o();
    }

    public final void f(s6.d dVar) {
        if (dVar == null) {
            return;
        }
        boolean zR = r(dVar);
        r6.c cVarG = dVar.g();
        if (zR) {
            return;
        }
        b bVar = this.f2443v;
        synchronized (bVar.B) {
            try {
                ArrayList arrayList = bVar.B;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((o) obj).r(dVar)) {
                        return;
                    }
                }
                if (cVarG != null) {
                    dVar.d(null);
                    cVarG.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        try {
            ArrayList arrayListE = v6.m.e(this.A.f2440v);
            int size = arrayListE.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListE.get(i);
                i++;
                f((s6.d) obj);
            }
            this.A.f2440v.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void k() {
        p();
        this.A.k();
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void l() {
        this.A.l();
        i();
        t tVar = this.f2446y;
        ArrayList arrayListE = v6.m.e((Set) tVar.f2438x);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            tVar.c((r6.c) obj);
        }
        ((HashSet) tVar.f2439y).clear();
        this.f2445x.l(this);
        this.f2445x.l(this.C);
        v6.m.f().removeCallbacks(this.B);
        this.f2443v.d(this);
    }

    public final m n(String str) {
        return new m(this.f2443v, this, Drawable.class, this.f2444w).y(str);
    }

    public final synchronized void o() {
        t tVar = this.f2446y;
        tVar.f2437w = true;
        ArrayList arrayListE = v6.m.e((Set) tVar.f2438x);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            r6.c cVar = (r6.c) obj;
            if (cVar.isRunning()) {
                cVar.f();
                ((HashSet) tVar.f2439y).add(cVar);
            }
        }
    }

    public final synchronized void p() {
        t tVar = this.f2446y;
        int i = 0;
        tVar.f2437w = false;
        ArrayList arrayListE = v6.m.e((Set) tVar.f2438x);
        int size = arrayListE.size();
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            r6.c cVar = (r6.c) obj;
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.g();
            }
        }
        ((HashSet) tVar.f2439y).clear();
    }

    public final synchronized void q(r6.g gVar) {
        r6.g gVar2 = (r6.g) gVar.clone();
        if (gVar2.H && !gVar2.I) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        gVar2.I = true;
        gVar2.H = true;
        this.E = gVar2;
    }

    public final synchronized boolean r(s6.d dVar) {
        r6.c cVarG = dVar.g();
        if (cVarG == null) {
            return true;
        }
        if (!this.f2446y.c(cVarG)) {
            return false;
        }
        this.A.f2440v.remove(dVar);
        dVar.d(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2446y + ", treeNode=" + this.f2447z + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
