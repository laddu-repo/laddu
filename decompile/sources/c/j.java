package c;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ImmLeaksCleaner;
import androidx.fragment.app.j0;
import androidx.lifecycle.d0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import c.f;
import c.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends h0.e implements u0, androidx.lifecycle.i, u4.d {
    public static final /* synthetic */ int P = 0;
    public final g A;
    public final od.j B;
    public final AtomicInteger C;
    public final i D;
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public final CopyOnWriteArrayList I;
    public final CopyOnWriteArrayList J;
    public boolean K;
    public boolean L;
    public final od.j M;
    public final od.j N;
    public final od.j O;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q7.h f1652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final hd.a f1653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.bumptech.glide.manager.t f1654y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public t0 f1655z;

    public j() {
        q7.h hVar = new q7.h();
        hVar.f10916v = new CopyOnWriteArraySet();
        this.f1652w = hVar;
        final h.j jVar = (h.j) this;
        int i = 1;
        this.f1653x = new hd.a(new b(jVar, i));
        com.bumptech.glide.manager.t tVar = new com.bumptech.glide.manager.t((u4.d) this);
        this.f1654y = tVar;
        this.A = new g(jVar);
        this.B = new od.j(new c(jVar, i));
        this.C = new AtomicInteger();
        this.D = new i(jVar);
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = new CopyOnWriteArrayList();
        this.J = new CopyOnWriteArrayList();
        this.M = new od.j(new c(jVar, 2));
        androidx.lifecycle.u uVar = this.f6012v;
        if (uVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        uVar.a(new e(0, jVar));
        this.f6012v.a(new e(1, jVar));
        this.f6012v.a(new androidx.lifecycle.q() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.q
            public final void a(s sVar, m mVar) {
                int i10 = j.P;
                h.j jVar2 = jVar;
                if (jVar2.f1655z == null) {
                    f fVar = (f) jVar2.getLastNonConfigurationInstance();
                    if (fVar != null) {
                        jVar2.f1655z = fVar.f1636a;
                    }
                    if (jVar2.f1655z == null) {
                        jVar2.f1655z = new t0();
                    }
                }
                jVar2.f6012v.f(this);
            }
        });
        tVar.e();
        i0.d(this);
        if (Build.VERSION.SDK_INT == 23) {
            this.f6012v.a(new ImmLeaksCleaner(jVar));
        }
        ((o.r) tVar.f2439y).f("android:support:activity-result", new androidx.fragment.app.z(jVar, 1));
        i(new androidx.fragment.app.b0(jVar, 1));
        this.N = new od.j(new c(jVar, 3));
        this.O = new od.j(new c(jVar, 4));
    }

    public static void g(h.j jVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e7) {
            if (!de.i.a(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e7;
            }
        } catch (NullPointerException e10) {
            if (!de.i.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e10;
            }
        }
    }

    @Override // u4.d
    public final o.r a() {
        return (o.r) this.f1654y.f2439y;
    }

    @Override // androidx.lifecycle.i
    public final r0 c() {
        return (r0) this.N.getValue();
    }

    @Override // androidx.lifecycle.i
    public final r1.c d() {
        r1.c cVar = new r1.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f2053w;
        if (getApplication() != null) {
            linkedHashMap.put(p0.f1228a, getApplication());
        }
        linkedHashMap.put(i0.f1201a, this);
        linkedHashMap.put(i0.f1202b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(i0.f1203c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.u0
    public final t0 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1655z == null) {
            f fVar = (f) getLastNonConfigurationInstance();
            if (fVar != null) {
                this.f1655z = fVar.f1636a;
            }
            if (this.f1655z == null) {
                this.f1655z = new t0();
            }
        }
        t0 t0Var = this.f1655z;
        de.i.b(t0Var);
        return t0Var;
    }

    @Override // androidx.lifecycle.s
    public final androidx.lifecycle.u f() {
        return this.f6012v;
    }

    public final void h(s0.a aVar) {
        de.i.e(aVar, "listener");
        this.E.add(aVar);
    }

    public final void i(d.a aVar) {
        q7.h hVar = this.f1652w;
        hVar.getClass();
        j jVar = (j) hVar.f10917w;
        if (jVar != null) {
            aVar.a(jVar);
        }
        ((CopyOnWriteArraySet) hVar.f10916v).add(aVar);
    }

    public final a0 j() {
        return (a0) this.O.getValue();
    }

    public final void k() {
        View decorView = getWindow().getDecorView();
        de.i.d(decorView, "getDecorView(...)");
        decorView.setTag(q1.a.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        de.i.d(decorView2, "getDecorView(...)");
        decorView2.setTag(r1.d.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        de.i.d(decorView3, "getDecorView(...)");
        decorView3.setTag(u4.a.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        de.i.d(decorView4, "getDecorView(...)");
        decorView4.setTag(b0.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        de.i.d(decorView5, "getDecorView(...)");
        decorView5.setTag(b0.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        de.i.d(decorView6, "getDecorView(...)");
        decorView6.setTag(h4.j.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final e.g l(e.b bVar, p4.v vVar) {
        i iVar = this.D;
        de.i.e(iVar, "registry");
        return iVar.c("activity_rq#" + this.C.getAndIncrement(), this, vVar, bVar);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i10, Intent intent) {
        if (this.D.a(i, i10, intent)) {
            return;
        }
        super.onActivityResult(i, i10, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ((h4.a) this.M.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        de.i.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.E.iterator();
        de.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((s0.a) it.next()).accept(configuration);
        }
    }

    @Override // h0.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1654y.f(bundle);
        q7.h hVar = this.f1652w;
        hVar.getClass();
        hVar.f10917w = this;
        Iterator it = ((CopyOnWriteArraySet) hVar.f10916v).iterator();
        while (it.hasNext()) {
            ((d.a) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = g0.f1194w;
        d0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        de.i.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1653x.f6280x).iterator();
        while (it.hasNext()) {
            ((j0) it.next()).f1037a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        de.i.e(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f1653x.f6280x).iterator();
            while (it.hasNext()) {
                if (((j0) it.next()).f1037a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.K) {
            return;
        }
        Iterator it = this.H.iterator();
        de.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((s0.a) it.next()).accept(new h0.f(z2));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        de.i.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.G.iterator();
        de.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((s0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        de.i.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1653x.f6280x).iterator();
        while (it.hasNext()) {
            ((j0) it.next()).f1037a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.L) {
            return;
        }
        Iterator it = this.I.iterator();
        de.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((s0.a) it.next()).accept(new h0.s(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        de.i.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1653x.f6280x).iterator();
        while (it.hasNext()) {
            ((j0) it.next()).f1037a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        de.i.e(strArr, "permissions");
        de.i.e(iArr, "grantResults");
        if (this.D.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        f fVar;
        t0 t0Var = this.f1655z;
        if (t0Var == null && (fVar = (f) getLastNonConfigurationInstance()) != null) {
            t0Var = fVar.f1636a;
        }
        if (t0Var == null) {
            return null;
        }
        f fVar2 = new f();
        fVar2.f1636a = t0Var;
        return fVar2;
    }

    @Override // h0.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        de.i.e(bundle, "outState");
        androidx.lifecycle.u uVar = this.f6012v;
        if (uVar != null) {
            de.i.c(uVar, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            uVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.f1654y.g(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.F.iterator();
        de.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((s0.a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.J.iterator();
        de.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (fa.b.o()) {
                fa.b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            t tVar = (t) this.B.getValue();
            synchronized (tVar.f1665a) {
                try {
                    tVar.f1666b = true;
                    ArrayList arrayList = tVar.f1667c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ce.a) obj).b();
                    }
                    tVar.f1667c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        k();
        View decorView = getWindow().getDecorView();
        de.i.d(decorView, "getDecorView(...)");
        g gVar = this.A;
        gVar.getClass();
        if (!gVar.f1639x) {
            gVar.f1639x = true;
            decorView.getViewTreeObserver().addOnDrawListener(gVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        de.i.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        de.i.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        de.i.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        de.i.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        de.i.e(configuration, "newConfig");
        this.K = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.K = false;
            Iterator it = this.H.iterator();
            de.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((s0.a) it.next()).accept(new h0.f(z2));
            }
        } catch (Throwable th) {
            this.K = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        de.i.e(configuration, "newConfig");
        this.L = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.L = false;
            Iterator it = this.I.iterator();
            de.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((s0.a) it.next()).accept(new h0.s(z2));
            }
        } catch (Throwable th) {
            this.L = false;
            throw th;
        }
    }
}
