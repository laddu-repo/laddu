package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import n.n;
import n.o;
import n.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f8379a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8385h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f8387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f8388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f8390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f8392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8396t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8397u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8398v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f8400x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f8401y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f8402z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8380b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8381c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8382d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8383e = 0;
    public boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8384g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f8379a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f8406c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f8406c;
        boolean z2 = false;
        menuItem.setChecked(this.f8395s).setVisible(this.f8396t).setEnabled(this.f8397u).setCheckable(this.f8394r >= 1).setTitleCondensed(this.f8388l).setIcon(this.f8389m);
        int i = this.f8398v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f8401y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f8407d == null) {
                hVar.f8407d = h.a(context);
            }
            Object obj = hVar.f8407d;
            String str = this.f8401y;
            f fVar = new f();
            fVar.f8377a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f8378b = cls.getMethod(str, f.f8376c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }
        if (this.f8394r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f8940x = (nVar.f8940x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                n0.a aVar = sVar.f8950c;
                try {
                    if (sVar.f8951d == null) {
                        sVar.f8951d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f8951d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f8400x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f8403e, hVar.f8404a));
            z2 = true;
        }
        int i10 = this.f8399w;
        if (i10 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        o oVar = this.f8402z;
        if (oVar != null) {
            if (menuItem instanceof n0.a) {
                ((n0.a) menuItem).b(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z10 = menuItem instanceof n0.a;
        if (z10) {
            ((n0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            d1.a.f(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z10) {
            ((n0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            d1.a.j(menuItem, charSequence2);
        }
        char c10 = this.f8390n;
        int i11 = this.f8391o;
        if (z10) {
            ((n0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            d1.a.e(menuItem, c10, i11);
        }
        char c11 = this.f8392p;
        int i12 = this.f8393q;
        if (z10) {
            ((n0.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            d1.a.i(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z10) {
                ((n0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                d1.a.h(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z10) {
                ((n0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                d1.a.g(menuItem, colorStateList);
            }
        }
    }
}
