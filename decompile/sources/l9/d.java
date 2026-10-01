package l9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.bumptech.glide.e;
import g.j;
import k0.k;
import p8.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f8322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8326e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f8327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f8328h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f8329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorStateList f8330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f8331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8333n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8334o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Typeface f8335p;

    public d(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, j.TextAppearance);
        this.f8331l = typedArrayObtainStyledAttributes.getDimension(j.TextAppearance_android_textSize, 0.0f);
        this.f8330k = com.bumptech.glide.c.p(context, typedArrayObtainStyledAttributes, j.TextAppearance_android_textColor);
        com.bumptech.glide.c.p(context, typedArrayObtainStyledAttributes, j.TextAppearance_android_textColorHint);
        com.bumptech.glide.c.p(context, typedArrayObtainStyledAttributes, j.TextAppearance_android_textColorLink);
        this.f8325d = typedArrayObtainStyledAttributes.getInt(j.TextAppearance_android_textStyle, 0);
        this.f8326e = typedArrayObtainStyledAttributes.getInt(j.TextAppearance_android_typeface, 1);
        int i10 = j.TextAppearance_fontFamily;
        i10 = typedArrayObtainStyledAttributes.hasValue(i10) ? i10 : j.TextAppearance_android_fontFamily;
        this.f8332m = typedArrayObtainStyledAttributes.getResourceId(i10, 0);
        this.f8323b = typedArrayObtainStyledAttributes.getString(i10);
        typedArrayObtainStyledAttributes.getBoolean(j.TextAppearance_textAllCaps, false);
        this.f8322a = com.bumptech.glide.c.p(context, typedArrayObtainStyledAttributes, j.TextAppearance_android_shadowColor);
        this.f = typedArrayObtainStyledAttributes.getFloat(j.TextAppearance_android_shadowDx, 0.0f);
        this.f8327g = typedArrayObtainStyledAttributes.getFloat(j.TextAppearance_android_shadowDy, 0.0f);
        this.f8328h = typedArrayObtainStyledAttributes.getFloat(j.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, l.MaterialTextAppearance);
        this.i = typedArrayObtainStyledAttributes2.hasValue(l.MaterialTextAppearance_android_letterSpacing);
        this.f8329j = typedArrayObtainStyledAttributes2.getFloat(l.MaterialTextAppearance_android_letterSpacing, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            int i11 = l.MaterialTextAppearance_fontVariationSettings;
            this.f8324c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(i11) ? i11 : l.MaterialTextAppearance_android_fontVariationSettings);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f8335p;
        int i = this.f8325d;
        if (typeface == null && (str = this.f8323b) != null) {
            this.f8335p = Typeface.create(str, i);
        }
        if (this.f8335p == null) {
            int i10 = this.f8326e;
            if (i10 == 1) {
                this.f8335p = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f8335p = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f8335p = Typeface.DEFAULT;
            } else {
                this.f8335p = Typeface.MONOSPACE;
            }
            this.f8335p = Typeface.create(this.f8335p, i);
        }
    }

    public final void b(Context context, com.bumptech.glide.d dVar) {
        if (!c(context)) {
            a();
        }
        int i = this.f8332m;
        if (i == 0) {
            this.f8333n = true;
        }
        if (this.f8333n) {
            dVar.E(this.f8335p, true);
            return;
        }
        try {
            b bVar = new b(this, dVar);
            ThreadLocal threadLocal = k.f7244a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                k.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f8333n = true;
            dVar.D(1);
        } catch (Exception e7) {
            Log.d("TextAppearance", "Error loading font " + this.f8323b, e7);
            this.f8333n = true;
            dVar.D(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface typefaceB;
        String string;
        Typeface typefaceCreate;
        XmlResourceParser xml;
        if (this.f8333n) {
            return true;
        }
        int i = this.f8332m;
        if (i != 0) {
            ThreadLocal threadLocal = k.f7244a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceB = null;
            } else {
                context2 = context;
                typefaceB = k.b(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceB != null) {
                this.f8335p = typefaceB;
                this.f8333n = true;
                return true;
            }
            if (!this.f8334o) {
                this.f8334o = true;
                Resources resources = context2.getResources();
                int i10 = this.f8332m;
                if (i10 == 0 || !resources.getResourceTypeName(i10).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f8325d);
                    }
                } else {
                    try {
                        xml = resources.getXml(i10);
                    } catch (Throwable unused) {
                    }
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), g0.d.FontFamily);
                            string = typedArrayObtainAttributes.getString(g0.d.FontFamily_fontProviderSystemFontFamily);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f8325d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f8335p = typefaceCreate2;
                this.f8333n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, com.bumptech.glide.d dVar) {
        e(context, textPaint, dVar);
        ColorStateList colorStateList = this.f8330k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f8322a;
        textPaint.setShadowLayer(this.f8328h, this.f, this.f8327g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, com.bumptech.glide.d dVar) {
        Typeface typeface;
        if (c(context) && this.f8333n && (typeface = this.f8335p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f8335p);
        b(context, new c(this, context, textPaint, dVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceL = e.l(context.getResources().getConfiguration(), typeface);
        if (typefaceL != null) {
            typeface = typefaceL;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f8325d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f8331l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f8324c);
        }
        if (this.i) {
            textPaint.setLetterSpacing(this.f8329j);
        }
    }
}
