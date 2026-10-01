package n;

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
import jd.u;
import o.n;
import o.o;
import o.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f8904a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8911h;

    /* renamed from: i, reason: collision with root package name */
    public int f8912i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f8913k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f8914l;

    /* renamed from: m, reason: collision with root package name */
    public int f8915m;

    /* renamed from: n, reason: collision with root package name */
    public char f8916n;

    /* renamed from: o, reason: collision with root package name */
    public int f8917o;

    /* renamed from: p, reason: collision with root package name */
    public char f8918p;

    /* renamed from: q, reason: collision with root package name */
    public int f8919q;

    /* renamed from: r, reason: collision with root package name */
    public int f8920r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8921t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8922u;

    /* renamed from: v, reason: collision with root package name */
    public int f8923v;

    /* renamed from: w, reason: collision with root package name */
    public int f8924w;

    /* renamed from: x, reason: collision with root package name */
    public String f8925x;

    /* renamed from: y, reason: collision with root package name */
    public String f8926y;

    /* renamed from: z, reason: collision with root package name */
    public o f8927z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f8905b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f8906c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8907d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f8908e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8909f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8910g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f8904a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f8932c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.MenuItem$OnMenuItemClickListener, n.f, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z10;
        h hVar = this.E;
        Context context = hVar.f8932c;
        MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.f8921t).setEnabled(this.f8922u);
        boolean z11 = false;
        if (this.f8920r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f8914l).setIcon(this.f8915m);
        int i6 = this.f8923v;
        if (i6 >= 0) {
            menuItem.setShowAsAction(i6);
        }
        if (this.f8926y != null) {
            if (!context.isRestricted()) {
                if (hVar.f8933d == null) {
                    hVar.f8933d = h.a(context);
                }
                Object obj = hVar.f8933d;
                String str = this.f8926y;
                ?? obj2 = new Object();
                obj2.f8902a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f8903b = cls.getMethod(str, f.f8901c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e10) {
                    StringBuilder q9 = r4.a.q("Couldn't resolve menu item onClick handler ", str, " in class ");
                    q9.append(cls.getName());
                    InflateException inflateException = new InflateException(q9.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f8920r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f9822x = (nVar.f9822x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                n0.a aVar = sVar.f9832c;
                try {
                    if (sVar.f9833d == null) {
                        sVar.f9833d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f9833d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str2 = this.f8925x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f8928e, hVar.f8930a));
            z11 = true;
        }
        int i10 = this.f8924w;
        if (i10 > 0) {
            if (!z11) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        o oVar = this.f8927z;
        if (oVar != null) {
            if (menuItem instanceof n0.a) {
                ((n0.a) menuItem).b(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z12 = menuItem instanceof n0.a;
        if (z12) {
            ((n0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            u.g(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((n0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            u.k(menuItem, charSequence2);
        }
        char c10 = this.f8916n;
        int i11 = this.f8917o;
        if (z12) {
            ((n0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            u.f(menuItem, c10, i11);
        }
        char c11 = this.f8918p;
        int i12 = this.f8919q;
        if (z12) {
            ((n0.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            u.j(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((n0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                u.i(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((n0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                u.h(menuItem, colorStateList);
            }
        }
    }
}
