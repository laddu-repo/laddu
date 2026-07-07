package i;

import a2.a2;
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
import android.graphics.drawable.Drawable;
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
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import okhttp3.internal.ws.WebSocketProtocol;
import p.h3;
import p.j1;
import p.k1;
import p.m3;
import p.u3;
import t0.q0;
import t0.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends q implements o.j, LayoutInflater.Factory2 {
    public static final v.l F0 = new v.l(0);
    public static final int[] G0 = {R.attr.windowBackground};
    public static final boolean H0 = !"robolectric".equals(Build.FINGERPRINT);
    public Rect A0;
    public Rect B0;
    public f0 C0;
    public OnBackInvokedDispatcher D0;
    public OnBackInvokedCallback E0;
    public final Object G;
    public final Context H;
    public Window I;
    public w J;
    public final Object K;
    public m0 L;
    public n.h M;
    public CharSequence N;
    public j1 O;
    public k7.d P;
    public lc.c Q;
    public n.a R;
    public ActionBarContextView S;
    public PopupWindow T;
    public r U;
    public boolean X;
    public ViewGroup Y;
    public TextView Z;

    /* renamed from: a0, reason: collision with root package name */
    public View f6130a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6131b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f6132c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f6133d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6134e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f6135f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f6136g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f6137h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f6138i0;

    /* renamed from: j0, reason: collision with root package name */
    public a0[] f6139j0;

    /* renamed from: k0, reason: collision with root package name */
    public a0 f6140k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f6141l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f6142m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f6143n0;
    public boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public Configuration f6144p0;

    /* renamed from: q0, reason: collision with root package name */
    public final int f6145q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f6146r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f6147s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f6148t0;

    /* renamed from: u0, reason: collision with root package name */
    public x f6149u0;

    /* renamed from: v0, reason: collision with root package name */
    public x f6150v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f6151w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f6152x0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f6154z0;
    public u0 V = null;
    public final boolean W = true;

    /* renamed from: y0, reason: collision with root package name */
    public final r f6153y0 = new r(this, 0);

    public b0(Context context, Window window, k kVar, Object obj) {
        j jVar = null;
        this.f6145q0 = -100;
        this.H = context;
        this.K = kVar;
        this.G = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof j) {
                        jVar = (j) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (jVar != null) {
                this.f6145q0 = ((b0) jVar.w()).f6145q0;
            }
        }
        if (this.f6145q0 == -100) {
            String name = this.G.getClass().getName();
            v.l lVar = F0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.f6145q0 = num.intValue();
                lVar.remove(this.G.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        p.t.d();
    }

    public static p0.e m(Context context) {
        p0.e eVar;
        p0.e b10;
        Locale locale;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33 || (eVar = q.f6257z) == null) {
            return null;
        }
        p0.g gVar = eVar.f10445a;
        p0.e x10 = x(context.getApplicationContext().getResources().getConfiguration());
        if (i6 >= 24) {
            if (gVar.isEmpty()) {
                b10 = p0.e.f10444b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i10 = 0; i10 < x10.f10445a.size() + gVar.size(); i10++) {
                    if (i10 < gVar.size()) {
                        locale = gVar.get(i10);
                    } else {
                        locale = x10.f10445a.get(i10 - gVar.size());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                }
                b10 = p0.e.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (gVar.isEmpty()) {
            b10 = p0.e.f10444b;
        } else {
            b10 = p0.e.b(t.b(gVar.get(0)));
        }
        if (b10.f10445a.isEmpty()) {
            return x10;
        }
        return b10;
    }

    public static Configuration r(Context context, int i6, p0.e eVar, Configuration configuration, boolean z10) {
        int i10;
        if (i6 != 1) {
            if (i6 != 2) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i10 = 32;
            }
        } else {
            i10 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            p0.g gVar = eVar.f10445a;
            if (Build.VERSION.SDK_INT >= 24) {
                u.d(configuration2, eVar);
                return configuration2;
            }
            configuration2.setLocale(gVar.get(0));
            configuration2.setLayoutDirection(gVar.get(0));
        }
        return configuration2;
    }

    public static p0.e x(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return u.b(configuration);
        }
        return p0.e.b(t.b(configuration.locale));
    }

    public final void A(int i6) {
        this.f6152x0 = (1 << i6) | this.f6152x0;
        if (!this.f6151w0) {
            View decorView = this.I.getDecorView();
            WeakHashMap weakHashMap = q0.f12397a;
            decorView.postOnAnimation(this.f6153y0);
            this.f6151w0 = true;
        }
    }

    public final int B(Context context, int i6) {
        if (i6 != -100) {
            if (i6 != -1) {
                if (i6 != 0) {
                    if (i6 != 1 && i6 != 2) {
                        if (i6 == 3) {
                            if (this.f6150v0 == null) {
                                this.f6150v0 = new x(this, context);
                            }
                            return this.f6150v0.f();
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return w(context).f();
                }
            }
            return i6;
        }
        return -1;
    }

    public final boolean C() {
        k1 k1Var;
        h3 h3Var;
        boolean z10 = this.f6141l0;
        this.f6141l0 = false;
        a0 y9 = y(0);
        if (y9.f6124m) {
            if (!z10) {
                q(y9, true);
            }
            return true;
        }
        n.a aVar = this.R;
        if (aVar != null) {
            aVar.a();
            return true;
        }
        z();
        m0 m0Var = this.L;
        if (m0Var == null || (k1Var = m0Var.f6232f) == null || (h3Var = ((m3) k1Var).f10301a.f827m0) == null || h3Var.f10267y == null) {
            return false;
        }
        ((m3) k1Var).f10301a.c();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0175, code lost:
    
        if (r2.C.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(i.a0 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b0.D(i.a0, android.view.KeyEvent):void");
    }

    public final boolean E(a0 a0Var, int i6, KeyEvent keyEvent) {
        o.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!a0Var.f6122k && !F(a0Var, keyEvent)) || (lVar = a0Var.f6120h) == null) {
            return false;
        }
        return lVar.performShortcut(i6, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.f6120h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(i.a0 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b0.F(i.a0, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // o.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(o.l r6) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b0.G(o.l):void");
    }

    public final void H() {
        if (!this.X) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.D0 != null && (y(0).f6124m || this.R != null)) {
                z10 = true;
            }
            if (z10 && this.E0 == null) {
                this.E0 = v.b(this.D0, this);
            } else if (!z10 && (onBackInvokedCallback = this.E0) != null) {
                v.c(this.D0, onBackInvokedCallback);
                this.E0 = null;
            }
        }
    }

    @Override // i.q
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.H);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof b0)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // i.q
    public final void c() {
        String str;
        this.f6142m0 = true;
        k(false, true);
        v();
        Object obj = this.G;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = h0.f.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                m0 m0Var = this.L;
                if (m0Var == null) {
                    this.f6154z0 = true;
                } else {
                    m0Var.w(true);
                }
            }
            synchronized (q.E) {
                q.e(this);
                q.D.add(new WeakReference(this));
            }
        }
        this.f6144p0 = new Configuration(this.H.getResources().getConfiguration());
        this.f6143n0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // i.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.G
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = i.q.E
            monitor-enter(r0)
            i.q.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f6151w0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.I
            android.view.View r0 = r0.getDecorView()
            i.r r1 = r3.f6153y0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.o0 = r0
            int r0 = r3.f6145q0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.G
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            v.l r0 = i.b0.F0
            java.lang.Object r1 = r3.G
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f6145q0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            v.l r0 = i.b0.F0
            java.lang.Object r1 = r3.G
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            i.x r0 = r3.f6149u0
            if (r0 == 0) goto L63
            r0.d()
        L63:
            i.x r0 = r3.f6150v0
            if (r0 == 0) goto L6a
            r0.d()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b0.d():void");
    }

    @Override // i.q
    public final boolean f(int i6) {
        if (i6 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i6 = 108;
        } else if (i6 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i6 = 109;
        }
        if (this.f6137h0 && i6 == 108) {
            return false;
        }
        if (this.f6133d0 && i6 == 1) {
            this.f6133d0 = false;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 5) {
                    if (i6 != 10) {
                        if (i6 != 108) {
                            if (i6 != 109) {
                                return this.I.requestFeature(i6);
                            }
                            H();
                            this.f6134e0 = true;
                            return true;
                        }
                        H();
                        this.f6133d0 = true;
                        return true;
                    }
                    H();
                    this.f6135f0 = true;
                    return true;
                }
                H();
                this.f6132c0 = true;
                return true;
            }
            H();
            this.f6131b0 = true;
            return true;
        }
        H();
        this.f6137h0 = true;
        return true;
    }

    @Override // i.q
    public final void g(int i6) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.Y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.H).inflate(i6, viewGroup);
        this.J.a(this.I.getCallback());
    }

    @Override // i.q
    public final void h(View view) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.Y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.J.a(this.I.getCallback());
    }

    @Override // i.q
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.Y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.J.a(this.I.getCallback());
    }

    @Override // i.q
    public final void j(CharSequence charSequence) {
        this.N = charSequence;
        j1 j1Var = this.O;
        if (j1Var != null) {
            j1Var.setWindowTitle(charSequence);
            return;
        }
        m0 m0Var = this.L;
        if (m0Var != null) {
            m3 m3Var = (m3) m0Var.f6232f;
            if (!m3Var.f10307g) {
                Toolbar toolbar = m3Var.f10301a;
                m3Var.f10308h = charSequence;
                if ((m3Var.f10302b & 8) != 0) {
                    toolbar.setTitle(charSequence);
                    if (m3Var.f10307g) {
                        q0.s(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.Z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b0.k(boolean, boolean):boolean");
    }

    public final void l(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.I == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof w)) {
                w wVar = new w(this, callback);
                this.J = wVar;
                window.setCallback(wVar);
                Context context = this.H;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, G0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    p.t a10 = p.t.a();
                    synchronized (a10) {
                        drawable = a10.f10386a.g(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.I = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.D0) == null) {
                    Object obj = this.G;
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.E0) != null) {
                        v.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.E0 = null;
                    }
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.D0 = v.a(activity);
                            I();
                            return;
                        }
                    }
                    this.D0 = null;
                    I();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    @Override // o.j
    public final boolean n(o.l lVar, MenuItem menuItem) {
        int i6;
        a0 a0Var;
        Window.Callback callback = this.I.getCallback();
        if (callback != null && !this.o0) {
            o.l k8 = lVar.k();
            a0[] a0VarArr = this.f6139j0;
            if (a0VarArr != null) {
                i6 = a0VarArr.length;
            } else {
                i6 = 0;
            }
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    a0Var = a0VarArr[i10];
                    if (a0Var != null && a0Var.f6120h == k8) {
                        break;
                    }
                    i10++;
                } else {
                    a0Var = null;
                    break;
                }
            }
            if (a0Var != null) {
                return callback.onMenuItemSelected(a0Var.f6113a, menuItem);
            }
        }
        return false;
    }

    public final void o(int i6, a0 a0Var, o.l lVar) {
        if (lVar == null) {
            if (a0Var == null && i6 >= 0) {
                a0[] a0VarArr = this.f6139j0;
                if (i6 < a0VarArr.length) {
                    a0Var = a0VarArr[i6];
                }
            }
            if (a0Var != null) {
                lVar = a0Var.f6120h;
            }
        }
        if ((a0Var == null || a0Var.f6124m) && !this.o0) {
            w wVar = this.J;
            Window.Callback callback = this.I.getCallback();
            wVar.getClass();
            try {
                wVar.A = true;
                callback.onPanelClosed(i6, lVar);
            } finally {
                wVar.A = false;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01e5
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(o.l lVar) {
        p.j jVar;
        if (this.f6138i0) {
            return;
        }
        this.f6138i0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.O;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.B).f10301a.f832x;
        if (actionMenuView != null && (jVar = actionMenuView.Q) != null) {
            jVar.b();
            p.f fVar = jVar.Q;
            if (fVar != null && fVar.b()) {
                fVar.f9845i.dismiss();
            }
        }
        Window.Callback callback = this.I.getCallback();
        if (callback != null && !this.o0) {
            callback.onPanelClosed(108, lVar);
        }
        this.f6138i0 = false;
    }

    public final void q(a0 a0Var, boolean z10) {
        z zVar;
        j1 j1Var;
        p.j jVar;
        if (z10 && a0Var.f6113a == 0 && (j1Var = this.O) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.B).f10301a.f832x;
            if (actionMenuView != null && (jVar = actionMenuView.Q) != null && jVar.h()) {
                p(a0Var.f6120h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.H.getSystemService("window");
        if (windowManager != null && a0Var.f6124m && (zVar = a0Var.f6117e) != null) {
            windowManager.removeView(zVar);
            if (z10) {
                o(a0Var.f6113a, a0Var, null);
            }
        }
        a0Var.f6122k = false;
        a0Var.f6123l = false;
        a0Var.f6124m = false;
        a0Var.f6118f = null;
        a0Var.f6125n = true;
        if (this.f6140k0 == a0Var) {
            this.f6140k0 = null;
        }
        if (a0Var.f6113a == 0) {
            I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r7.b() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0102, code lost:
    
        if (r7.l() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b0.s(android.view.KeyEvent):boolean");
    }

    public final void t(int i6) {
        a0 y9 = y(i6);
        if (y9.f6120h != null) {
            Bundle bundle = new Bundle();
            y9.f6120h.t(bundle);
            if (bundle.size() > 0) {
                y9.f6127p = bundle;
            }
            y9.f6120h.w();
            y9.f6120h.clear();
        }
        y9.f6126o = true;
        y9.f6125n = true;
        if ((i6 == 108 || i6 == 0) && this.O != null) {
            a0 y10 = y(0);
            y10.f6122k = false;
            F(y10, null);
        }
    }

    public final void u() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.X) {
            Context context2 = this.H;
            int[] iArr = h.a.j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(WebSocketProtocol.PAYLOAD_SHORT, false)) {
                    f(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    f(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    f(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    f(10);
                }
                this.f6136g0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                v();
                this.I.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.f6137h0) {
                    if (this.f6136g0) {
                        viewGroup = (ViewGroup) from.inflate(com.playfy.tv.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f6134e0 = false;
                        this.f6133d0 = false;
                    } else if (this.f6133d0) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(com.playfy.tv.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new n.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.playfy.tv.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        j1 j1Var = (j1) viewGroup.findViewById(com.playfy.tv.R.id.decor_content_parent);
                        this.O = j1Var;
                        j1Var.setWindowCallback(this.I.getCallback());
                        if (this.f6134e0) {
                            ((ActionBarOverlayLayout) this.O).j(109);
                        }
                        if (this.f6131b0) {
                            ((ActionBarOverlayLayout) this.O).j(2);
                        }
                        if (this.f6132c0) {
                            ((ActionBarOverlayLayout) this.O).j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.f6135f0 ? (ViewGroup) from.inflate(com.playfy.tv.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.playfy.tv.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    a2 a2Var = new a2(this, 8);
                    WeakHashMap weakHashMap = q0.f12397a;
                    t0.h0.l(viewGroup, a2Var);
                    if (this.O == null) {
                        this.Z = (TextView) viewGroup.findViewById(com.playfy.tv.R.id.title);
                    }
                    boolean z10 = u3.f10392a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.playfy.tv.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.I.findViewById(R.id.content);
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
                    this.I.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new k7.c(this, 9));
                    this.Y = viewGroup;
                    Object obj = this.G;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.N;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        j1 j1Var2 = this.O;
                        if (j1Var2 != null) {
                            j1Var2.setWindowTitle(charSequence);
                        } else {
                            m0 m0Var = this.L;
                            if (m0Var != null) {
                                m3 m3Var = (m3) m0Var.f6232f;
                                if (!m3Var.f10307g) {
                                    Toolbar toolbar = m3Var.f10301a;
                                    m3Var.f10308h = charSequence;
                                    if ((8 & m3Var.f10302b) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (m3Var.f10307g) {
                                            q0.s(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.Z;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.Y.findViewById(R.id.content);
                    View decorView = this.I.getDecorView();
                    contentFrameLayout2.D.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.X = true;
                    a0 y9 = y(0);
                    if (!this.o0 && y9.f6120h == null) {
                        A(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f6133d0 + ", windowActionBarOverlay: " + this.f6134e0 + ", android:windowIsFloating: " + this.f6136g0 + ", windowActionModeOverlay: " + this.f6135f0 + ", windowNoTitle: " + this.f6137h0 + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void v() {
        if (this.I == null) {
            Object obj = this.G;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.I != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final y w(Context context) {
        if (this.f6149u0 == null) {
            if (androidx.lifecycle.j1.B == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.lifecycle.j1.B = new androidx.lifecycle.j1(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f6149u0 = new x(this, androidx.lifecycle.j1.B);
        }
        return this.f6149u0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [i.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i.a0 y(int r5) {
        /*
            r4 = this;
            i.a0[] r0 = r4.f6139j0
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            i.a0[] r2 = new i.a0[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.f6139j0 = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            i.a0 r2 = new i.a0
            r2.<init>()
            r2.f6113a = r5
            r2.f6125n = r1
            r0[r5] = r2
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b0.y(int):i.a0");
    }

    public final void z() {
        u();
        if (this.f6133d0 && this.L == null) {
            Object obj = this.G;
            if (obj instanceof Activity) {
                this.L = new m0((Activity) obj, this.f6134e0);
            } else if (obj instanceof Dialog) {
                this.L = new m0((Dialog) obj);
            }
            m0 m0Var = this.L;
            if (m0Var != null) {
                m0Var.w(this.f6154z0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
