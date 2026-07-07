package i;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.p1;
import com.unity3d.services.UnityAdsConstants;
import j1.p0;
import j1.x0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import p.m3;
import p.r3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j extends d.q implements k, h0.b, h0.c {
    public boolean A;
    public boolean B;
    public b0 C;

    /* renamed from: x, reason: collision with root package name */
    public final lc.c f6217x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.h0 f6218y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6219z;

    public j(int i6) {
        super(i6);
        this.f6217x = new lc.c(new j1.a0(this));
        this.f6218y = new androidx.lifecycle.h0(this);
        this.B = true;
        getSavedStateRegistry().c("android:support:lifecycle", new d.i(this, 1));
        final int i10 = 0;
        addOnConfigurationChangedListener(new s0.a(this) { // from class: j1.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i.j f7047b;

            {
                this.f7047b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f7047b.f6217x.I();
                        return;
                    default:
                        this.f7047b.f6217x.I();
                        return;
                }
            }
        });
        final int i11 = 1;
        addOnNewIntentListener(new s0.a(this) { // from class: j1.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i.j f7047b;

            {
                this.f7047b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f7047b.f6217x.I();
                        return;
                    default:
                        this.f7047b.f6217x.I();
                        return;
                }
            }
        });
        addOnContextAvailableListener(new d.j(this, i11));
        getSavedStateRegistry().c("androidx:appcompat", new e5.a(this));
        addOnContextAvailableListener(new i(this));
    }

    public static boolean B(p0 p0Var) {
        j jVar;
        boolean z10 = false;
        for (j1.y yVar : p0Var.f6945c.m()) {
            if (yVar != null) {
                j1.a0 a0Var = yVar.T;
                if (a0Var == null) {
                    jVar = null;
                } else {
                    jVar = a0Var.E;
                }
                if (jVar != null) {
                    z10 |= B(yVar.c());
                }
                x0 x0Var = yVar.f7033q0;
                androidx.lifecycle.x xVar = androidx.lifecycle.x.A;
                androidx.lifecycle.x xVar2 = androidx.lifecycle.x.f993z;
                if (x0Var != null) {
                    x0Var.b();
                    if (x0Var.B.f929d.compareTo(xVar) >= 0) {
                        yVar.f7033q0.B.h(xVar2);
                        z10 = true;
                    }
                }
                if (yVar.f7032p0.f929d.compareTo(xVar) >= 0) {
                    yVar.f7032p0.h(xVar2);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void K() {
        super.onDestroy();
        ((j1.a0) this.f6217x.f8328x).D.l();
        this.f6218y.f(androidx.lifecycle.w.ON_DESTROY);
    }

    public final boolean L(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 6) {
            return ((j1.a0) this.f6217x.f8328x).D.j();
        }
        return false;
    }

    public final void M() {
        super.onPostResume();
        this.f6218y.f(androidx.lifecycle.w.ON_RESUME);
        p0 p0Var = ((j1.a0) this.f6217x.f8328x).D;
        p0Var.H = false;
        p0Var.I = false;
        p0Var.O.f6977g = false;
        p0Var.u(7);
    }

    public final void R() {
        lc.c cVar = this.f6217x;
        cVar.I();
        j1.a0 a0Var = (j1.a0) cVar.f8328x;
        super.onStart();
        this.B = false;
        if (!this.f6219z) {
            this.f6219z = true;
            p0 p0Var = a0Var.D;
            p0Var.H = false;
            p0Var.I = false;
            p0Var.O.f6977g = false;
            p0Var.u(4);
        }
        a0Var.D.z(true);
        this.f6218y.f(androidx.lifecycle.w.ON_START);
        p0 p0Var2 = a0Var.D;
        p0Var2.H = false;
        p0Var2.I = false;
        p0Var2.O.f6977g = false;
        p0Var2.u(5);
    }

    public final void S() {
        super.onStop();
        this.B = true;
        do {
        } while (B(z()));
        p0 p0Var = ((j1.a0) this.f6217x.f8328x).D;
        p0Var.I = true;
        p0Var.O.f6977g = true;
        p0Var.u(4);
        this.f6218y.f(androidx.lifecycle.w.ON_STOP);
    }

    @Override // d.q, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        b0 b0Var = (b0) w();
        b0Var.u();
        ((ViewGroup) b0Var.Y.findViewById(R.id.content)).addView(view, layoutParams);
        b0Var.J.a(b0Var.I.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        b0 b0Var = (b0) w();
        b0Var.f6142m0 = true;
        int i6 = b0Var.f6145q0;
        if (i6 == -100) {
            i6 = q.f6256y;
        }
        int B = b0Var.B(context, i6);
        if (q.b(context) && q.b(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!q.C) {
                    q.f6255x.execute(new l(context, 0));
                }
            } else {
                synchronized (q.F) {
                    try {
                        p0.e eVar = q.f6257z;
                        if (eVar == null) {
                            if (q.A == null) {
                                q.A = p0.e.b(h0.f.e(context));
                            }
                            if (!q.A.f10445a.isEmpty()) {
                                q.f6257z = q.A;
                            }
                        } else if (!eVar.equals(q.A)) {
                            p0.e eVar2 = q.f6257z;
                            q.A = eVar2;
                            h0.f.d(context, eVar2.f10445a.a());
                        }
                    } finally {
                    }
                }
            }
        }
        p0.e m9 = b0.m(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(b0.r(context, B, m9, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof n.c) {
            try {
                ((n.c) context).a(b0.r(context, B, m9, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (b0.H0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (configuration3.diff(configuration4) != 0) {
                    float f3 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f3 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 24) {
                        u.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        if ((bg.y.a(configuration3) & 3) != (bg.y.a(configuration4) & 3)) {
                            bg.y.r(configuration, bg.y.a(configuration) | (bg.y.a(configuration4) & 3));
                        }
                        if ((bg.y.a(configuration3) & 12) != (bg.y.a(configuration4) & 12)) {
                            bg.y.r(configuration, bg.y.a(configuration) | (bg.y.a(configuration4) & 12));
                        }
                    }
                    int i35 = configuration3.uiMode & 15;
                    int i36 = configuration4.uiMode & 15;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration3.uiMode & 48;
                    int i38 = configuration4.uiMode & 48;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.screenWidthDp;
                    int i40 = configuration4.screenWidthDp;
                    if (i39 != i40) {
                        configuration.screenWidthDp = i40;
                    }
                    int i41 = configuration3.screenHeightDp;
                    int i42 = configuration4.screenHeightDp;
                    if (i41 != i42) {
                        configuration.screenHeightDp = i42;
                    }
                    int i43 = configuration3.smallestScreenWidthDp;
                    int i44 = configuration4.smallestScreenWidthDp;
                    if (i43 != i44) {
                        configuration.smallestScreenWidthDp = i44;
                    }
                    int i45 = configuration3.densityDpi;
                    int i46 = configuration4.densityDpi;
                    if (i45 != i46) {
                        configuration.densityDpi = i46;
                    }
                }
            }
            Configuration r10 = b0.r(context, B, m9, configuration, true);
            n.c cVar = new n.c(context, com.playfy.tv.R.style.Theme_AppCompat_Empty);
            cVar.a(r10);
            try {
                if (context.getTheme() != null) {
                    k0.b.l(cVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((b0) w()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // h0.i, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((b0) w()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f6219z);
        printWriter.print(" mResumed=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        if (getApplication() != null) {
            p1 store = getViewModelStore();
            kotlin.jvm.internal.k.e(store, "store");
            o1.a defaultCreationExtras = o1.a.f9847b;
            kotlin.jvm.internal.k.e(defaultCreationExtras, "defaultCreationExtras");
            ic.s sVar = new ic.s(store, q1.a.f10826c, defaultCreationExtras);
            kotlin.jvm.internal.e a10 = kotlin.jvm.internal.x.a(q1.a.class);
            String b10 = a10.b();
            if (b10 != null) {
                v.m mVar = ((q1.a) sVar.p("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10)).f10827b;
                if (mVar.f() > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (mVar.f() > 0) {
                        if (mVar.g(0) == null) {
                            printWriter.print(str2);
                            printWriter.print("  #");
                            printWriter.print(mVar.d(0));
                            printWriter.print(": ");
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
        }
        ((j1.a0) this.f6217x.f8328x).D.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i6) {
        b0 b0Var = (b0) w();
        b0Var.u();
        return b0Var.I.findViewById(i6);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        b0 b0Var = (b0) w();
        if (b0Var.M == null) {
            b0Var.z();
            m0 m0Var = b0Var.L;
            if (m0Var != null) {
                context = m0Var.u();
            } else {
                context = b0Var.H;
            }
            b0Var.M = new n.h(context);
        }
        return b0Var.M;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i6 = r3.f10372a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        b0 b0Var = (b0) w();
        if (b0Var.L != null) {
            b0Var.z();
            b0Var.L.getClass();
            b0Var.A(0);
        }
    }

    @Override // d.q, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        this.f6217x.I();
        super.onActivityResult(i6, i10, intent);
    }

    @Override // d.q, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b0 b0Var = (b0) w();
        if (b0Var.f6133d0 && b0Var.X) {
            b0Var.z();
            m0 m0Var = b0Var.L;
            if (m0Var != null) {
                m0Var.x(m0Var.f6228b.getResources().getBoolean(com.playfy.tv.R.bool.abc_action_bar_embed_tabs));
            }
        }
        p.t a10 = p.t.a();
        Context context = b0Var.H;
        synchronized (a10) {
            a10.f10386a.l(context);
        }
        b0Var.f6144p0 = new Configuration(b0Var.H.getResources().getConfiguration());
        b0Var.k(false, false);
    }

    @Override // d.q, h0.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6218y.f(androidx.lifecycle.w.ON_CREATE);
        p0 p0Var = ((j1.a0) this.f6217x.f8328x).D;
        p0Var.H = false;
        p0Var.I = false;
        p0Var.O.f6977g = false;
        p0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((j1.a0) this.f6217x.f8328x).D.f6948f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        K();
        w().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // d.q, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        Intent b10;
        if (!L(i6, menuItem)) {
            b0 b0Var = (b0) w();
            b0Var.z();
            m0 m0Var = b0Var.L;
            if (menuItem.getItemId() == 16908332 && m0Var != null && (((m3) m0Var.f6232f).f10302b & 4) != 0 && (b10 = h0.f.b(this)) != null) {
                if (shouldUpRecreateTask(b10)) {
                    h0.c0 c0Var = new h0.c0(this);
                    Intent b11 = h0.f.b(this);
                    if (b11 == null) {
                        b11 = h0.f.b(this);
                    }
                    if (b11 != null) {
                        ComponentName component = b11.getComponent();
                        if (component == null) {
                            component = b11.resolveActivity(c0Var.f5764y.getPackageManager());
                        }
                        c0Var.a(component);
                        c0Var.f5763x.add(b11);
                    }
                    c0Var.b();
                    try {
                        finishAffinity();
                    } catch (IllegalStateException unused) {
                        finish();
                    }
                } else {
                    navigateUpTo(b10);
                    return true;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.A = false;
        ((j1.a0) this.f6217x.f8328x).D.u(5);
        this.f6218y.f(androidx.lifecycle.w.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((b0) w()).u();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        M();
        b0 b0Var = (b0) w();
        b0Var.z();
        m0 m0Var = b0Var.L;
        if (m0Var != null) {
            m0Var.f6245u = true;
        }
    }

    @Override // d.q, android.app.Activity
    public final void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        this.f6217x.I();
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        lc.c cVar = this.f6217x;
        cVar.I();
        super.onResume();
        this.A = true;
        ((j1.a0) cVar.f8328x).D.z(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        R();
        ((b0) w()).k(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f6217x.I();
    }

    @Override // android.app.Activity
    public final void onStop() {
        S();
        b0 b0Var = (b0) w();
        b0Var.z();
        m0 m0Var = b0Var.L;
        if (m0Var != null) {
            m0Var.f6245u = false;
            n.j jVar = m0Var.f6244t;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i6) {
        super.onTitleChanged(charSequence, i6);
        w().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((b0) w()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // d.q, android.app.Activity
    public final void setContentView(int i6) {
        initializeViewTreeOwners();
        w().g(i6);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        super.setTheme(i6);
        ((b0) w()).f6146r0 = i6;
    }

    public final q w() {
        if (this.C == null) {
            o oVar = q.f6255x;
            this.C = new b0(this, null, this, this);
        }
        return this.C;
    }

    public final p0 z() {
        return ((j1.a0) this.f6217x.f8328x).D;
    }

    @Override // d.q, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        w().h(view);
    }

    @Override // d.q, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        w().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((j1.a0) this.f6217x.f8328x).D.f6948f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
