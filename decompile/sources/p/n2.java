package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.playfy.tv.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: i, reason: collision with root package name */
    public static n2 f10324i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f10325a;

    /* renamed from: b, reason: collision with root package name */
    public v.l f10326b;

    /* renamed from: c, reason: collision with root package name */
    public v.m f10327c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f10328d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f10329e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10330f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.d f10331g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f10323h = PorterDuff.Mode.SRC_IN;
    public static final l2 j = new v.k(6);

    public static synchronized n2 d() {
        n2 n2Var;
        synchronized (n2.class) {
            try {
                if (f10324i == null) {
                    n2 n2Var2 = new n2();
                    f10324i = n2Var2;
                    j(n2Var2);
                }
                n2Var = f10324i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n2.class) {
            l2 l2Var = j;
            l2Var.getClass();
            int i10 = (31 + i6) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) l2Var.h(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i6, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(n2 n2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            n2Var.a("vector", new m2(3));
            n2Var.a("animated-vector", new m2(2));
            n2Var.a("animated-selector", new m2(1));
            n2Var.a("drawable", new m2(0));
        }
    }

    public final void a(String str, m2 m2Var) {
        if (this.f10326b == null) {
            this.f10326b = new v.l(0);
        }
        this.f10326b.put(str, m2Var);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                v.i iVar = (v.i) this.f10328d.get(context);
                if (iVar == null) {
                    iVar = new v.i();
                    this.f10328d.put(context, iVar);
                }
                iVar.h(j10, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i6) {
        if (this.f10329e == null) {
            this.f10329e = new TypedValue();
        }
        TypedValue typedValue = this.f10329e;
        context.getResources().getValue(i6, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f10331g != null) {
            if (i6 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i6 == R.drawable.abc_ratingbar_material) {
                layerDrawable = androidx.lifecycle.d.h(this, context, R.dimen.abc_star_big);
            } else if (i6 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = androidx.lifecycle.d.h(this, context, R.dimen.abc_star_medium);
            } else if (i6 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = androidx.lifecycle.d.h(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j10) {
        v.i iVar = (v.i) this.f10328d.get(context);
        if (iVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) iVar.d(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b10 = w.a.b(iVar.f13161y, iVar.A, j10);
            if (b10 >= 0) {
                Object[] objArr = iVar.f13162z;
                Object obj = objArr[b10];
                Object obj2 = v.j.f13163a;
                if (obj != obj2) {
                    objArr[b10] = obj2;
                    iVar.f13160x = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i6) {
        return g(context, i6, false);
    }

    public final synchronized Drawable g(Context context, int i6, boolean z10) {
        Drawable k8;
        try {
            if (!this.f10330f) {
                this.f10330f = true;
                Drawable f3 = f(context, R.drawable.abc_vector_test);
                if (f3 == null || (!(f3 instanceof p5.p) && !"android.graphics.drawable.VectorDrawable".equals(f3.getClass().getName()))) {
                    this.f10330f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k8 = k(context, i6);
            if (k8 == null) {
                k8 = c(context, i6);
            }
            if (k8 == null) {
                k8 = context.getDrawable(i6);
            }
            if (k8 != null) {
                k8 = n(context, i6, z10, k8);
            }
            if (k8 != null) {
                n1.a(k8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k8;
    }

    public final synchronized ColorStateList i(Context context, int i6) {
        ColorStateList colorStateList;
        v.m mVar;
        WeakHashMap weakHashMap = this.f10325a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (mVar = (v.m) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) mVar.c(i6);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            androidx.lifecycle.d dVar = this.f10331g;
            if (dVar != null) {
                colorStateList2 = dVar.i(context, i6);
            }
            if (colorStateList2 != null) {
                if (this.f10325a == null) {
                    this.f10325a = new WeakHashMap();
                }
                v.m mVar2 = (v.m) this.f10325a.get(context);
                if (mVar2 == null) {
                    mVar2 = new v.m(0);
                    this.f10325a.put(context, mVar2);
                }
                mVar2.a(i6, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i6) {
        int next;
        v.l lVar = this.f10326b;
        if (lVar != null && !lVar.isEmpty()) {
            v.m mVar = this.f10327c;
            if (mVar != null) {
                String str = (String) mVar.c(i6);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.f10326b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.f10327c = new v.m(0);
            }
            if (this.f10329e == null) {
                this.f10329e = new TypedValue();
            }
            TypedValue typedValue = this.f10329e;
            Resources resources = context.getResources();
            resources.getValue(i6, typedValue, true);
            long j10 = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable e10 = e(context, j10);
            if (e10 != null) {
                return e10;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i6);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        String name = xml.getName();
                        this.f10327c.a(i6, name);
                        m2 m2Var = (m2) this.f10326b.get(name);
                        if (m2Var != null) {
                            e10 = m2Var.a(context, xml, asAttributeSet, context.getTheme());
                        }
                        if (e10 != null) {
                            e10.setChangingConfigurations(typedValue.changingConfigurations);
                            b(context, j10, e10);
                        }
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } catch (Exception e11) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
                }
            }
            if (e10 == null) {
                this.f10327c.a(i6, "appcompat_skip_skip");
            }
            return e10;
        }
        return null;
    }

    public final synchronized void l(Context context) {
        v.i iVar = (v.i) this.f10328d.get(context);
        if (iVar != null) {
            iVar.b();
        }
    }

    public final synchronized void m(androidx.lifecycle.d dVar) {
        this.f10331g = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n2.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
