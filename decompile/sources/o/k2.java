package o;

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
import com.google.android.gms.internal.measurement.mb;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {
    public static k2 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f9193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v.i f9194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v.j f9195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f9196d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f9197e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mb f9198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f9191h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i2 f9192j = new i2(6);

    public static synchronized k2 d() {
        try {
            if (i == null) {
                k2 k2Var = new k2();
                i = k2Var;
                j(k2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        i2 i2Var = f9192j;
        i2Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) i2Var.h(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(k2 k2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            k2Var.a("vector", new j2(3));
            k2Var.a("animated-vector", new j2(2));
            k2Var.a("animated-selector", new j2(1));
            k2Var.a("drawable", new j2(0));
        }
    }

    public final void a(String str, j2 j2Var) {
        if (this.f9194b == null) {
            this.f9194b = new v.i(0);
        }
        this.f9194b.put(str, j2Var);
    }

    public final synchronized void b(Context context, long j8, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                v.g gVar = (v.g) this.f9196d.get(context);
                if (gVar == null) {
                    gVar = new v.g();
                    this.f9196d.put(context, gVar);
                }
                gVar.h(j8, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.f9197e == null) {
            this.f9197e = new TypedValue();
        }
        TypedValue typedValue = this.f9197e;
        context.getResources().getValue(i10, typedValue, true);
        long j8 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j8);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableK = null;
        if (this.f9198g != null) {
            if (i10 == g.e.abc_cab_background_top_material) {
                layerDrawableK = new LayerDrawable(new Drawable[]{f(context, g.e.abc_cab_background_internal_bg), f(context, g.e.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == g.e.abc_ratingbar_material) {
                layerDrawableK = mb.k(this, context, g.d.abc_star_big);
            } else if (i10 == g.e.abc_ratingbar_indicator_material) {
                layerDrawableK = mb.k(this, context, g.d.abc_star_medium);
            } else if (i10 == g.e.abc_ratingbar_small_material) {
                layerDrawableK = mb.k(this, context, g.d.abc_star_small);
            }
        }
        if (layerDrawableK != null) {
            layerDrawableK.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j8, layerDrawableK);
        }
        return layerDrawableK;
    }

    public final synchronized Drawable e(Context context, long j8) {
        v.g gVar = (v.g) this.f9196d.get(context);
        if (gVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) gVar.d(j8);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = w.a.b(gVar.f13014w, gVar.f13016y, j8);
            if (iB >= 0) {
                Object[] objArr = gVar.f13015x;
                Object obj = objArr[iB];
                Object obj2 = v.h.f13017a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    gVar.f13013v = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    public final synchronized Drawable g(Context context, int i10, boolean z2) {
        Drawable drawableK;
        try {
            if (!this.f) {
                this.f = true;
                Drawable drawableF = f(context, k.b.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof f5.r) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i10);
            if (drawableK == null) {
                drawableK = c(context, i10);
            }
            if (drawableK == null) {
                drawableK = context.getDrawable(i10);
            }
            if (drawableK != null) {
                drawableK = n(context, i10, z2, drawableK);
            }
            if (drawableK != null) {
                l1.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        v.j jVar;
        WeakHashMap weakHashMap = this.f9193a;
        ColorStateList colorStateListM = null;
        colorStateList = (weakHashMap == null || (jVar = (v.j) weakHashMap.get(context)) == null) ? null : (ColorStateList) jVar.c(i10);
        if (colorStateList == null) {
            mb mbVar = this.f9198g;
            if (mbVar != null) {
                colorStateListM = mbVar.m(context, i10);
            }
            if (colorStateListM != null) {
                if (this.f9193a == null) {
                    this.f9193a = new WeakHashMap();
                }
                v.j jVar2 = (v.j) this.f9193a.get(context);
                if (jVar2 == null) {
                    jVar2 = new v.j();
                    this.f9193a.put(context, jVar2);
                }
                jVar2.a(i10, colorStateListM);
            }
            colorStateList = colorStateListM;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        v.i iVar = this.f9194b;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        v.j jVar = this.f9195c;
        if (jVar != null) {
            String str = (String) jVar.c(i10);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f9194b.get(str) == null) {
                return null;
            }
        } else {
            this.f9195c = new v.j();
        }
        if (this.f9197e == null) {
            this.f9197e = new TypedValue();
        }
        TypedValue typedValue = this.f9197e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j8 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j8);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f9195c.a(i10, name);
                j2 j2Var = (j2) this.f9194b.get(name);
                if (j2Var != null) {
                    drawableE = j2Var.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j8, drawableE);
                }
            } catch (Exception e7) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e7);
            }
        }
        if (drawableE == null) {
            this.f9195c.a(i10, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        v.g gVar = (v.g) this.f9196d.get(context);
        if (gVar != null) {
            gVar.b();
        }
    }

    public final synchronized void m(mb mbVar) {
        this.f9198g = mbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.k2.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
