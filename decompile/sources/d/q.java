package d;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.d1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.p1;
import androidx.lifecycle.q1;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.playfy.tv.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class q extends h0.i implements q1, androidx.lifecycle.s, e5.g {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final l Companion = new Object();
    private p1 _viewModelStore;
    private final f.h activityResultRegistry;
    private int contentLayoutId;
    private final e.a contextAwareHelper;
    private final he.f defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final he.f fullyDrawnReporter$delegate;
    private final t0.m menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final he.f onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<s0.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<s0.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<s0.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<s0.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<s0.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final n reportFullyDrawnExecutor;
    private final e5.f savedStateRegistryController;

    public q() {
        this.contextAwareHelper = new e.a();
        this.menuHostHelper = new t0.m(new e(this, 0));
        e5.f fVar = new e5.f(new f5.b(this, new androidx.lifecycle.i(this, 3)));
        this.savedStateRegistryController = fVar;
        this.reportFullyDrawnExecutor = new o(this);
        this.fullyDrawnReporter$delegate = he.a.d(new f(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new p(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            final int i6 = 0;
            getLifecycle().a(new androidx.lifecycle.d0(this) { // from class: d.h

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ q f3441y;

                {
                    this.f3441y = this;
                }

                @Override // androidx.lifecycle.d0
                public final void onStateChanged(androidx.lifecycle.f0 f0Var, androidx.lifecycle.w wVar) {
                    Window window;
                    View peekDecorView;
                    switch (i6) {
                        case 0:
                            if (wVar == androidx.lifecycle.w.ON_STOP && (window = this.f3441y.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            q.n(this.f3441y, f0Var, wVar);
                            return;
                    }
                }
            });
            final int i10 = 1;
            getLifecycle().a(new androidx.lifecycle.d0(this) { // from class: d.h

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ q f3441y;

                {
                    this.f3441y = this;
                }

                @Override // androidx.lifecycle.d0
                public final void onStateChanged(androidx.lifecycle.f0 f0Var, androidx.lifecycle.w wVar) {
                    Window window;
                    View peekDecorView;
                    switch (i10) {
                        case 0:
                            if (wVar == androidx.lifecycle.w.ON_STOP && (window = this.f3441y.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            q.n(this.f3441y, f0Var, wVar);
                            return;
                    }
                }
            });
            getLifecycle().a(new e5.b(this, i10));
            fVar.a();
            d1.d(this);
            if (Build.VERSION.SDK_INT <= 23) {
                getLifecycle().a(new e0(this));
            }
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new i(this, 0));
            addOnContextAvailableListener(new j(this, 0));
            this.defaultViewModelProviderFactory$delegate = he.a.d(new f(this, 2));
            this.onBackPressedDispatcher$delegate = he.a.d(new f(this, 3));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static final void access$ensureViewModelStore(q qVar) {
        if (qVar._viewModelStore == null) {
            m mVar = (m) qVar.getLastNonConfigurationInstance();
            if (mVar != null) {
                qVar._viewModelStore = mVar.f3460b;
            }
            if (qVar._viewModelStore == null) {
                qVar._viewModelStore = new p1();
            }
        }
    }

    public static Bundle j(q qVar) {
        Bundle bundle = new Bundle();
        f.h hVar = qVar.activityResultRegistry;
        hVar.getClass();
        LinkedHashMap linkedHashMap = hVar.f4601b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f4603d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(hVar.f4606g));
        return bundle;
    }

    public static void l(q qVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (kotlin.jvm.internal.k.a(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!kotlin.jvm.internal.k.a(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    public static void n(q qVar, androidx.lifecycle.f0 f0Var, androidx.lifecycle.w wVar) {
        if (wVar == androidx.lifecycle.w.ON_DESTROY) {
            qVar.contextAwareHelper.f4146b = null;
            if (!qVar.isChangingConfigurations()) {
                qVar.getViewModelStore().a();
            }
            o oVar = (o) qVar.reportFullyDrawnExecutor;
            q qVar2 = oVar.A;
            qVar2.getWindow().getDecorView().removeCallbacks(oVar);
            qVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(oVar);
        }
    }

    public static z u(q qVar) {
        return new z(qVar.reportFullyDrawnExecutor, new f(qVar, 0));
    }

    public static void v(q qVar, Context it) {
        kotlin.jvm.internal.k.e(it, "it");
        Bundle a10 = qVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a10 != null) {
            f.h hVar = qVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = hVar.f4601b;
            LinkedHashMap linkedHashMap2 = hVar.f4600a;
            Bundle bundle = hVar.f4606g;
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    hVar.f4603d.addAll(stringArrayList2);
                }
                Bundle bundle2 = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    String str = stringArrayList.get(i6);
                    if (linkedHashMap.containsKey(str)) {
                        Integer num = (Integer) linkedHashMap.remove(str);
                        if (!bundle.containsKey(str)) {
                            kotlin.jvm.internal.z.b(linkedHashMap2);
                            linkedHashMap2.remove(num);
                        }
                    }
                    Integer num2 = integerArrayList.get(i6);
                    kotlin.jvm.internal.k.d(num2, "get(...)");
                    int intValue = num2.intValue();
                    String str2 = stringArrayList.get(i6);
                    kotlin.jvm.internal.k.d(str2, "get(...)");
                    String str3 = str2;
                    linkedHashMap2.put(Integer.valueOf(intValue), str3);
                    hVar.f4601b.put(str3, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        n nVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView, "getDecorView(...)");
        ((o) nVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(t0.n provider) {
        kotlin.jvm.internal.k.e(provider, "provider");
        t0.m mVar = this.menuHostHelper;
        mVar.f12372b.add(provider);
        mVar.f12371a.run();
    }

    public final void addOnConfigurationChangedListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(e.b listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        q qVar = aVar.f4146b;
        if (qVar != null) {
            listener.a(qVar);
        }
        aVar.f4145a.add(listener);
    }

    public final void addOnMultiWindowModeChangedListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    public final void addOnPictureInPictureModeChangedListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnTrimMemoryListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    public final f.h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.s
    public o1.c getDefaultViewModelCreationExtras() {
        Bundle bundle;
        o1.e eVar = new o1.e(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = eVar.f9848a;
        if (application != null) {
            linkedHashMap.put(m1.f960e, getApplication());
        }
        linkedHashMap.put(d1.f902a, this);
        linkedHashMap.put(d1.f903b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(d1.f904c, bundle);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.s
    public n1 getDefaultViewModelProviderFactory() {
        return (n1) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public z getFullyDrawnReporter() {
        return (z) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        m mVar = (m) getLastNonConfigurationInstance();
        if (mVar != null) {
            return mVar.f3459a;
        }
        return null;
    }

    @Override // h0.i, androidx.lifecycle.f0
    public androidx.lifecycle.y getLifecycle() {
        return super.getLifecycle();
    }

    public final n0 getOnBackPressedDispatcher() {
        return (n0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // e5.g
    public final e5.e getSavedStateRegistry() {
        return this.savedStateRegistryController.f4357b;
    }

    @Override // androidx.lifecycle.q1
    public p1 getViewModelStore() {
        if (getApplication() != null) {
            if (this._viewModelStore == null) {
                m mVar = (m) getLastNonConfigurationInstance();
                if (mVar != null) {
                    this._viewModelStore = mVar.f3460b;
                }
                if (this._viewModelStore == null) {
                    this._viewModelStore = new p1();
                }
            }
            p1 p1Var = this._viewModelStore;
            kotlin.jvm.internal.k.b(p1Var);
            return p1Var;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i6, int i10, Intent intent) {
        if (!this.activityResultRegistry.a(i6, i10, intent)) {
            super.onActivityResult(i6, i10, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.k.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<s0.a> it = this.onConfigurationChangedListeners.iterator();
        kotlin.jvm.internal.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // h0.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f4146b = this;
        Iterator it = aVar.f4145a.iterator();
        while (it.hasNext()) {
            ((e.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i6 = z0.f998y;
        w0.b(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, Menu menu) {
        kotlin.jvm.internal.k.e(menu, "menu");
        if (i6 == 0) {
            super.onCreatePanelMenu(i6, menu);
            t0.m mVar = this.menuHostHelper;
            getMenuInflater();
            Iterator it = mVar.f12372b.iterator();
            while (it.hasNext()) {
                ((j1.h0) ((t0.n) it.next())).f6917a.k();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem item) {
        kotlin.jvm.internal.k.e(item, "item");
        if (super.onMenuItemSelected(i6, item)) {
            return true;
        }
        if (i6 == 0) {
            return this.menuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<s0.a> it = this.onMultiWindowModeChangedListeners.iterator();
        kotlin.jvm.internal.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new h0.j(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.k.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<s0.a> it = this.onNewIntentListeners.iterator();
        kotlin.jvm.internal.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        kotlin.jvm.internal.k.e(menu, "menu");
        Iterator it = this.menuHostHelper.f12372b.iterator();
        while (it.hasNext()) {
            ((j1.h0) ((t0.n) it.next())).f6917a.q();
        }
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<s0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        kotlin.jvm.internal.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new h0.b0(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i6, View view, Menu menu) {
        kotlin.jvm.internal.k.e(menu, "menu");
        if (i6 == 0) {
            super.onPreparePanel(i6, view, menu);
            Iterator it = this.menuHostHelper.f12372b.iterator();
            while (it.hasNext()) {
                ((j1.h0) ((t0.n) it.next())).f6917a.t();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i6, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.k.e(permissions, "permissions");
        kotlin.jvm.internal.k.e(grantResults, "grantResults");
        if (!this.activityResultRegistry.a(i6, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i6, permissions, grantResults);
        }
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d.m, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        m mVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        p1 p1Var = this._viewModelStore;
        if (p1Var == null && (mVar = (m) getLastNonConfigurationInstance()) != null) {
            p1Var = mVar.f3460b;
        }
        if (p1Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f3459a = onRetainCustomNonConfigurationInstance;
        obj.f3460b = p1Var;
        return obj;
    }

    @Override // h0.i, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.k.e(outState, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.h0) {
            androidx.lifecycle.y lifecycle = getLifecycle();
            kotlin.jvm.internal.k.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.h0) lifecycle).h(androidx.lifecycle.x.f993z);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        super.onTrimMemory(i6);
        Iterator<s0.a> it = this.onTrimMemoryListeners.iterator();
        kotlin.jvm.internal.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i6));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        kotlin.jvm.internal.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f4146b;
    }

    public final <I, O> f.c registerForActivityResult(g.a contract, f.h registry, f.b callback) {
        kotlin.jvm.internal.k.e(contract, "contract");
        kotlin.jvm.internal.k.e(registry, "registry");
        kotlin.jvm.internal.k.e(callback, "callback");
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    public void removeMenuProvider(t0.n provider) {
        kotlin.jvm.internal.k.e(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    public final void removeOnConfigurationChangedListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(e.b listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f4145a.remove(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    public final void removeOnPictureInPictureModeChangedListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnTrimMemoryListener(s0.a listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (a8.f.S()) {
                a8.f.F("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            z fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f3486b) {
                try {
                    fullyDrawnReporter.f3487c = true;
                    ArrayList arrayList = fullyDrawnReporter.f3488d;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        ((ve.a) obj).invoke();
                    }
                    fullyDrawnReporter.f3488d.clear();
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
    public void setContentView(int i6) {
        initializeViewTreeOwners();
        n nVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView, "getDecorView(...)");
        ((o) nVar).a(decorView);
        super.setContentView(i6);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i6) {
        kotlin.jvm.internal.k.e(intent, "intent");
        super.startActivityForResult(intent, i6);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i6, Intent intent2, int i10, int i11, int i12) {
        kotlin.jvm.internal.k.e(intent, "intent");
        super.startIntentSenderForResult(intent, i6, intent2, i10, i11, i12);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i6, Bundle bundle) {
        kotlin.jvm.internal.k.e(intent, "intent");
        super.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i6, Intent intent2, int i10, int i11, int i12, Bundle bundle) {
        kotlin.jvm.internal.k.e(intent, "intent");
        super.startIntentSenderForResult(intent, i6, intent2, i10, i11, i12, bundle);
    }

    public final <I, O> f.c registerForActivityResult(g.a contract, f.b callback) {
        kotlin.jvm.internal.k.e(contract, "contract");
        kotlin.jvm.internal.k.e(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.k.e(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<s0.a> it = this.onMultiWindowModeChangedListeners.iterator();
            kotlin.jvm.internal.k.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new h0.j(z10));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.k.e(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<s0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            kotlin.jvm.internal.k.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new h0.b0(z10));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        n nVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView, "getDecorView(...)");
        ((o) nVar).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(t0.n provider, androidx.lifecycle.f0 owner) {
        kotlin.jvm.internal.k.e(provider, "provider");
        kotlin.jvm.internal.k.e(owner, "owner");
        t0.m mVar = this.menuHostHelper;
        mVar.f12372b.add(provider);
        mVar.f12371a.run();
        androidx.lifecycle.y lifecycle = owner.getLifecycle();
        HashMap hashMap = mVar.f12373c;
        t0.l lVar = (t0.l) hashMap.remove(provider);
        if (lVar != null) {
            lVar.f12367a.c(lVar.f12368b);
            lVar.f12368b = null;
        }
        hashMap.put(provider, new t0.l(lifecycle, new g(2, mVar, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        n nVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.k.d(decorView, "getDecorView(...)");
        ((o) nVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final t0.n provider, androidx.lifecycle.f0 owner, final androidx.lifecycle.x state) {
        kotlin.jvm.internal.k.e(provider, "provider");
        kotlin.jvm.internal.k.e(owner, "owner");
        kotlin.jvm.internal.k.e(state, "state");
        final t0.m mVar = this.menuHostHelper;
        mVar.getClass();
        androidx.lifecycle.y lifecycle = owner.getLifecycle();
        HashMap hashMap = mVar.f12373c;
        t0.l lVar = (t0.l) hashMap.remove(provider);
        if (lVar != null) {
            lVar.f12367a.c(lVar.f12368b);
            lVar.f12368b = null;
        }
        hashMap.put(provider, new t0.l(lifecycle, new androidx.lifecycle.d0() { // from class: t0.k
            @Override // androidx.lifecycle.d0
            public final void onStateChanged(androidx.lifecycle.f0 f0Var, androidx.lifecycle.w wVar) {
                androidx.lifecycle.w wVar2;
                m mVar2 = m.this;
                mVar2.getClass();
                Runnable runnable = mVar2.f12371a;
                CopyOnWriteArrayList copyOnWriteArrayList = mVar2.f12372b;
                androidx.lifecycle.w.Companion.getClass();
                androidx.lifecycle.x xVar = state;
                int ordinal = xVar.ordinal();
                androidx.lifecycle.w wVar3 = null;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            wVar2 = null;
                        } else {
                            wVar2 = androidx.lifecycle.w.ON_RESUME;
                        }
                    } else {
                        wVar2 = androidx.lifecycle.w.ON_START;
                    }
                } else {
                    wVar2 = androidx.lifecycle.w.ON_CREATE;
                }
                n nVar = provider;
                if (wVar == wVar2) {
                    copyOnWriteArrayList.add(nVar);
                    runnable.run();
                    return;
                }
                androidx.lifecycle.w wVar4 = androidx.lifecycle.w.ON_DESTROY;
                if (wVar == wVar4) {
                    mVar2.b(nVar);
                    return;
                }
                int ordinal2 = xVar.ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 4) {
                            wVar3 = androidx.lifecycle.w.ON_PAUSE;
                        }
                    } else {
                        wVar3 = androidx.lifecycle.w.ON_STOP;
                    }
                } else {
                    wVar3 = wVar4;
                }
                if (wVar == wVar3) {
                    copyOnWriteArrayList.remove(nVar);
                    runnable.run();
                }
            }
        }));
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public q(int i6) {
        this();
        this.contentLayoutId = i6;
    }
}
