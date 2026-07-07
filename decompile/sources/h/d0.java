package h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import o.h1;
import o.k3;
import o.s3;
import t0.q0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends q implements n.j, LayoutInflater.Factory2 {
    public static final v.i D0 = new v.i(0);
    public static final int[] E0 = {R.attr.windowBackground};
    public static final boolean F0 = !"robolectric".equals(Build.FINGERPRINT);
    public h0 A0;
    public OnBackInvokedDispatcher B0;
    public OnBackInvokedCallback C0;
    public final Object E;
    public final Context F;
    public Window G;
    public z H;
    public final Object I;
    public com.bumptech.glide.f J;
    public m.h K;
    public CharSequence L;
    public h1 M;
    public s5.d N;
    public s O;
    public m.a P;
    public ActionBarContextView Q;
    public PopupWindow R;
    public r S;
    public boolean V;
    public ViewGroup W;
    public TextView X;
    public View Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f5868a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f5869b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f5870c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f5871d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f5872e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f5873f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f5874g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public c0[] f5875h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public c0 f5876i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f5877j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f5878k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f5879l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f5880m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Configuration f5881n0;
    public final int o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f5882p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f5883q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f5884r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a0 f5885s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public a0 f5886t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f5887u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f5888v0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f5890x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Rect f5891y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Rect f5892z0;
    public q0 T = null;
    public final boolean U = true;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final r f5889w0 = new r(this, 0);

    public d0(Context context, Window window, k kVar, Object obj) {
        j jVar = null;
        this.o0 = -100;
        this.F = context;
        this.I = kVar;
        this.E = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof j)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        jVar = (j) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (jVar != null) {
                this.o0 = ((d0) jVar.m()).o0;
            }
        }
        if (this.o0 == -100) {
            String name = this.E.getClass().getName();
            v.i iVar = D0;
            Integer num = (Integer) iVar.get(name);
            if (num != null) {
                this.o0 = num.intValue();
                iVar.remove(this.E.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        o.s.d();
    }

    public static p0.g A(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? w.b(configuration) : p0.g.b(u.b(configuration.locale));
    }

    public static p0.g o(Context context) {
        p0.g gVar;
        p0.g gVarB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (gVar = q.f5985x) == null) {
            return null;
        }
        p0.i iVar = gVar.f10183a;
        p0.g gVarA = A(context.getApplicationContext().getResources().getConfiguration());
        int i10 = 0;
        if (i < 24) {
            gVarB = iVar.isEmpty() ? p0.g.f10182b : p0.g.b(u.b(iVar.get(0)));
        } else if (iVar.isEmpty()) {
            gVarB = p0.g.f10182b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i10 < gVarA.f10183a.size() + iVar.size()) {
                Locale locale = i10 < iVar.size() ? iVar.get(i10) : gVarA.f10183a.get(i10 - iVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            gVarB = p0.g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return gVarB.f10183a.isEmpty() ? gVarA : gVarB;
    }

    public static Configuration u(Context context, int i, p0.g gVar, Configuration configuration, boolean z2) {
        int i10 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            p0.i iVar = gVar.f10183a;
            if (Build.VERSION.SDK_INT >= 24) {
                w.d(configuration2, gVar);
                return configuration2;
            }
            configuration2.setLocale(iVar.get(0));
            configuration2.setLayoutDirection(iVar.get(0));
        }
        return configuration2;
    }

    public final c0 B(int i) {
        c0[] c0VarArr = this.f5875h0;
        if (c0VarArr == null || c0VarArr.length <= i) {
            c0[] c0VarArr2 = new c0[i + 1];
            if (c0VarArr != null) {
                System.arraycopy(c0VarArr, 0, c0VarArr2, 0, c0VarArr.length);
            }
            this.f5875h0 = c0VarArr2;
            c0VarArr = c0VarArr2;
        }
        c0 c0Var = c0VarArr[i];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0();
        c0Var2.f5854a = i;
        c0Var2.f5865n = false;
        c0VarArr[i] = c0Var2;
        return c0Var2;
    }

    public final void C() {
        x();
        if (this.f5869b0 && this.J == null) {
            Object obj = this.E;
            if (obj instanceof Activity) {
                this.J = new p0((Activity) obj, this.f5870c0);
            } else if (obj instanceof Dialog) {
                this.J = new p0((Dialog) obj);
            }
            com.bumptech.glide.f fVar = this.J;
            if (fVar != null) {
                fVar.N(this.f5890x0);
            }
        }
    }

    public final void D(int i) {
        this.f5888v0 = (1 << i) | this.f5888v0;
        if (this.f5887u0) {
            return;
        }
        View decorView = this.G.getDecorView();
        WeakHashMap weakHashMap = t0.m0.f11853a;
        decorView.postOnAnimation(this.f5889w0);
        this.f5887u0 = true;
    }

    public final int E(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f5886t0 == null) {
                            this.f5886t0 = new a0(this, context);
                        }
                        return this.f5886t0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return z(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean F() {
        boolean z2 = this.f5877j0;
        this.f5877j0 = false;
        c0 c0VarB = B(0);
        if (!c0VarB.f5864m) {
            m.a aVar = this.P;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            C();
            com.bumptech.glide.f fVar = this.J;
            if (fVar == null || !fVar.f()) {
                return false;
            }
        } else if (!z2) {
            t(c0VarB, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.B.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(h.c0 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d0.G(h.c0, android.view.KeyEvent):void");
    }

    public final boolean H(c0 c0Var, int i, KeyEvent keyEvent) {
        n.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0Var.f5862k || I(c0Var, keyEvent)) && (lVar = c0Var.f5860h) != null) {
            return lVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(h.c0 r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d0.I(h.c0, android.view.KeyEvent):boolean");
    }

    public final void J() {
        if (this.V) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.B0 != null && (B(0).f5864m || this.P != null)) {
                z2 = true;
            }
            if (z2 && this.C0 == null) {
                this.C0 = y.b(this.B0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.C0) == null) {
                    return;
                }
                y.c(this.B0, onBackInvokedCallback);
                this.C0 = null;
            }
        }
    }

    @Override // h.q
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.F);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof d0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.q
    public final void b() {
        if (this.J != null) {
            C();
            if (this.J.A()) {
                return;
            }
            D(0);
        }
    }

    @Override // h.q
    public final void d() throws IllegalAccessException {
        String strC;
        this.f5878k0 = true;
        m(false, true);
        y();
        Object obj = this.E;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = h0.c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                com.bumptech.glide.f fVar = this.J;
                if (fVar == null) {
                    this.f5890x0 = true;
                } else {
                    fVar.N(true);
                }
            }
            synchronized (q.C) {
                q.f(this);
                q.B.add(new WeakReference(this));
            }
        }
        this.f5881n0 = new Configuration(this.F.getResources().getConfiguration());
        this.f5879l0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // h.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.E
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = h.q.C
            monitor-enter(r0)
            h.q.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f5887u0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.G
            android.view.View r0 = r0.getDecorView()
            h.r r1 = r3.f5889w0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f5880m0 = r0
            int r0 = r3.o0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.E
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            v.i r0 = h.d0.D0
            java.lang.Object r1 = r3.E
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.o0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            v.i r0 = h.d0.D0
            java.lang.Object r1 = r3.E
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            com.bumptech.glide.f r0 = r3.J
            if (r0 == 0) goto L63
            r0.D()
        L63:
            h.a0 r0 = r3.f5885s0
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            h.a0 r0 = r3.f5886t0
            if (r0 == 0) goto L71
            r0.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d0.e():void");
    }

    @Override // h.q
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f5873f0 && i == 108) {
            return false;
        }
        if (this.f5869b0 && i == 1) {
            this.f5869b0 = false;
        }
        if (i == 1) {
            J();
            this.f5873f0 = true;
            return true;
        }
        if (i == 2) {
            J();
            this.Z = true;
            return true;
        }
        if (i == 5) {
            J();
            this.f5868a0 = true;
            return true;
        }
        if (i == 10) {
            J();
            this.f5871d0 = true;
            return true;
        }
        if (i == 108) {
            J();
            this.f5869b0 = true;
            return true;
        }
        if (i != 109) {
            return this.G.requestFeature(i);
        }
        J();
        this.f5870c0 = true;
        return true;
    }

    @Override // h.q
    public final void h(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.W.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.F).inflate(i, viewGroup);
        this.H.a(this.G.getCallback());
    }

    @Override // h.q
    public final void i(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.W.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.H.a(this.G.getCallback());
    }

    @Override // h.q
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.W.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.H.a(this.G.getCallback());
    }

    @Override // h.q
    public final void l(CharSequence charSequence) {
        this.L = charSequence;
        h1 h1Var = this.M;
        if (h1Var != null) {
            h1Var.setWindowTitle(charSequence);
            return;
        }
        com.bumptech.glide.f fVar = this.J;
        if (fVar != null) {
            fVar.Q(charSequence);
            return;
        }
        TextView textView = this.X;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(boolean r17, boolean r18) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d0.m(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.G
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof h.z
            if (r2 != 0) goto L7a
            h.z r0 = new h.z
            r0.<init>(r7, r1)
            r7.H = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.F
            int[] r1 = h.d0.E0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            o.s r4 = o.s.a()
            monitor-enter(r4)
            o.k2 r5 = r4.f9293a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.g(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.G = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.B0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.E
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.C0
            if (r1 == 0) goto L61
            h.y.c(r8, r1)
            r7.C0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = h.y.a(r0)
            r7.B0 = r8
            goto L76
        L74:
            r7.B0 = r2
        L76:
            r7.K()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d0.n(android.view.Window):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:118:0x01e5
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i, c0 c0Var, n.l lVar) {
        if (lVar == null) {
            if (c0Var == null && i >= 0) {
                c0[] c0VarArr = this.f5875h0;
                if (i < c0VarArr.length) {
                    c0Var = c0VarArr[i];
                }
            }
            if (c0Var != null) {
                lVar = c0Var.f5860h;
            }
        }
        if ((c0Var == null || c0Var.f5864m) && !this.f5880m0) {
            z zVar = this.H;
            Window.Callback callback = this.G.getCallback();
            zVar.getClass();
            try {
                zVar.f5999z = true;
                callback.onPanelClosed(i, lVar);
            } finally {
                zVar.f5999z = false;
            }
        }
    }

    @Override // n.j
    public final boolean q(n.l lVar, MenuItem menuItem) {
        c0 c0Var;
        Window.Callback callback = this.G.getCallback();
        if (callback != null && !this.f5880m0) {
            n.l lVarK = lVar.k();
            c0[] c0VarArr = this.f5875h0;
            int length = c0VarArr != null ? c0VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0Var = c0VarArr[i];
                    if (c0Var != null && c0Var.f5860h == lVarK) {
                        break;
                    }
                    i++;
                } else {
                    c0Var = null;
                    break;
                }
            }
            if (c0Var != null) {
                return callback.onMenuItemSelected(c0Var.f5854a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.e() != false) goto L20;
     */
    @Override // n.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(n.l r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d0.r(n.l):void");
    }

    public final void s(n.l lVar) {
        o.j jVar;
        if (this.f5874g0) {
            return;
        }
        this.f5874g0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.M;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.f599z).f9199a.f681v;
        if (actionMenuView != null && (jVar = actionMenuView.O) != null) {
            jVar.c();
            o.f fVar = jVar.O;
            if (fVar != null && fVar.b()) {
                fVar.i.dismiss();
            }
        }
        Window.Callback callback = this.G.getCallback();
        if (callback != null && !this.f5880m0) {
            callback.onPanelClosed(108, lVar);
        }
        this.f5874g0 = false;
    }

    public final void t(c0 c0Var, boolean z2) {
        b0 b0Var;
        h1 h1Var;
        if (z2 && c0Var.f5854a == 0 && (h1Var = this.M) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var;
            actionBarOverlayLayout.k();
            if (((k3) actionBarOverlayLayout.f599z).f9199a.o()) {
                s(c0Var.f5860h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.F.getSystemService("window");
        if (windowManager != null && c0Var.f5864m && (b0Var = c0Var.f5858e) != null) {
            windowManager.removeView(b0Var);
            if (z2) {
                p(c0Var.f5854a, c0Var, null);
            }
        }
        c0Var.f5862k = false;
        c0Var.f5863l = false;
        c0Var.f5864m = false;
        c0Var.f = null;
        c0Var.f5865n = true;
        if (this.f5876i0 == c0Var) {
            this.f5876i0 = null;
        }
        if (c0Var.f5854a == 0) {
            K();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d0.v(android.view.KeyEvent):boolean");
    }

    public final void w(int i) {
        c0 c0VarB = B(i);
        if (c0VarB.f5860h != null) {
            Bundle bundle = new Bundle();
            c0VarB.f5860h.t(bundle);
            if (bundle.size() > 0) {
                c0VarB.f5867p = bundle;
            }
            c0VarB.f5860h.w();
            c0VarB.f5860h.clear();
        }
        c0VarB.f5866o = true;
        c0VarB.f5865n = true;
        if ((i == 108 || i == 0) && this.M != null) {
            c0 c0VarB2 = B(0);
            c0VarB2.f5862k = false;
            I(c0VarB2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.V) {
            return;
        }
        int[] iArr = g.j.AppCompatTheme;
        Context context = this.F;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(g.j.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g.j.AppCompatTheme_windowNoTitle, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(g.j.AppCompatTheme_windowActionBar, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g.j.AppCompatTheme_windowActionBarOverlay, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g.j.AppCompatTheme_windowActionModeOverlay, false)) {
            g(10);
        }
        this.f5872e0 = typedArrayObtainStyledAttributes.getBoolean(g.j.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.G.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f5873f0) {
            viewGroup = this.f5871d0 ? (ViewGroup) layoutInflaterFrom.inflate(g.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(g.g.abc_screen_simple, (ViewGroup) null);
        } else if (this.f5872e0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(g.g.abc_dialog_title_material, (ViewGroup) null);
            this.f5870c0 = false;
            this.f5869b0 = false;
        } else if (this.f5869b0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(g.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new m.c(context, typedValue.resourceId) : context).inflate(g.g.abc_screen_toolbar, (ViewGroup) null);
            h1 h1Var = (h1) viewGroup.findViewById(g.f.decor_content_parent);
            this.M = h1Var;
            h1Var.setWindowCallback(this.G.getCallback());
            if (this.f5870c0) {
                ((ActionBarOverlayLayout) this.M).j(109);
            }
            if (this.Z) {
                ((ActionBarOverlayLayout) this.M).j(2);
            }
            if (this.f5868a0) {
                ((ActionBarOverlayLayout) this.M).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f5869b0 + ", windowActionBarOverlay: " + this.f5870c0 + ", android:windowIsFloating: " + this.f5872e0 + ", windowActionModeOverlay: " + this.f5871d0 + ", windowNoTitle: " + this.f5873f0 + " }");
        }
        s sVar = new s(this);
        WeakHashMap weakHashMap = t0.m0.f11853a;
        t0.d0.k(viewGroup, sVar);
        if (this.M == null) {
            this.X = (TextView) viewGroup.findViewById(g.f.title);
        }
        boolean z2 = s3.f9294a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(g.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.G.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.G.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new s5.c(18, this));
        this.W = viewGroup;
        Object obj = this.E;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.L;
        if (!TextUtils.isEmpty(title)) {
            h1 h1Var2 = this.M;
            if (h1Var2 != null) {
                h1Var2.setWindowTitle(title);
            } else {
                com.bumptech.glide.f fVar = this.J;
                if (fVar != null) {
                    fVar.Q(title);
                } else {
                    TextView textView = this.X;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.W.findViewById(R.id.content);
        View decorView = this.G.getDecorView();
        contentFrameLayout2.B.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(g.j.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(g.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(g.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(g.j.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(g.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(g.j.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(g.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(g.j.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(g.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(g.j.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(g.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.V = true;
        c0 c0VarB = B(0);
        if (this.f5880m0 || c0VarB.f5860h != null) {
            return;
        }
        D(108);
    }

    public final void y() {
        if (this.G == null) {
            Object obj = this.E;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.G == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final androidx.fragment.app.h z(Context context) {
        if (this.f5885s0 == null) {
            if (a7.j.A == null) {
                Context applicationContext = context.getApplicationContext();
                a7.j.A = new a7.j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f5885s0 = new a0(this, a7.j.A);
        }
        return this.f5885s0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
