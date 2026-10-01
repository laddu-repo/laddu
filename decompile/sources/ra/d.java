package ra;

import a8.i;
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
import bf.y;
import com.unity3d.services.UnityAdsConstants;
import k0.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f11909a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11910b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11911c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11912d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11913e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11914f;

    /* renamed from: g, reason: collision with root package name */
    public final float f11915g;

    /* renamed from: h, reason: collision with root package name */
    public final float f11916h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11917i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f11918k;

    /* renamed from: l, reason: collision with root package name */
    public float f11919l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11920m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11921n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11922o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f11923p;

    public d(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, h.a.f5754y);
        this.f11919l = obtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f11918k = i.i(context, obtainStyledAttributes, 3);
        i.i(context, obtainStyledAttributes, 4);
        i.i(context, obtainStyledAttributes, 5);
        this.f11912d = obtainStyledAttributes.getInt(2, 0);
        this.f11913e = obtainStyledAttributes.getInt(1, 1);
        int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f11920m = obtainStyledAttributes.getResourceId(i10, 0);
        this.f11910b = obtainStyledAttributes.getString(i10);
        obtainStyledAttributes.getBoolean(14, false);
        this.f11909a = i.i(context, obtainStyledAttributes, 6);
        this.f11914f = obtainStyledAttributes.getFloat(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f11915g = obtainStyledAttributes.getFloat(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f11916h = obtainStyledAttributes.getFloat(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i6, t9.a.E);
        this.f11917i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11911c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f11923p;
        int i6 = this.f11912d;
        if (typeface == null && (str = this.f11910b) != null) {
            this.f11923p = Typeface.create(str, i6);
        }
        if (this.f11923p == null) {
            int i10 = this.f11913e;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.f11923p = Typeface.DEFAULT;
                    } else {
                        this.f11923p = Typeface.MONOSPACE;
                    }
                } else {
                    this.f11923p = Typeface.SERIF;
                }
            } else {
                this.f11923p = Typeface.SANS_SERIF;
            }
            this.f11923p = Typeface.create(this.f11923p, i6);
        }
    }

    public final void b(Context context, android.support.v4.media.session.b bVar) {
        if (!c(context)) {
            a();
        }
        int i6 = this.f11920m;
        if (i6 == 0) {
            this.f11921n = true;
        }
        if (this.f11921n) {
            bVar.o(this.f11923p, true);
            return;
        }
        try {
            b bVar2 = new b(this, bVar);
            ThreadLocal threadLocal = l.f7568a;
            if (context.isRestricted()) {
                bVar2.a(-4);
            } else {
                l.b(context, i6, new TypedValue(), 0, bVar2, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f11921n = true;
            bVar.n(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f11910b, e10);
            this.f11921n = true;
            bVar.n(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface b10;
        String str;
        Typeface create;
        if (this.f11921n) {
            return true;
        }
        int i6 = this.f11920m;
        if (i6 != 0) {
            ThreadLocal threadLocal = l.f7568a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                b10 = null;
            } else {
                context2 = context;
                b10 = l.b(context2, i6, new TypedValue(), 0, null, false, true);
            }
            if (b10 != null) {
                this.f11923p = b10;
                this.f11921n = true;
                return true;
            }
            if (!this.f11922o) {
                this.f11922o = true;
                Resources resources = context2.getResources();
                int i10 = this.f11920m;
                if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i10);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), g0.a.f5275b);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.f11912d);
                }
            }
            if (typeface != null) {
                this.f11923p = typeface;
                this.f11921n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, android.support.v4.media.session.b bVar) {
        int i6;
        int i10;
        e(context, textPaint, bVar);
        ColorStateList colorStateList = this.f11918k;
        if (colorStateList != null) {
            i6 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i6 = -16777216;
        }
        textPaint.setColor(i6);
        ColorStateList colorStateList2 = this.f11909a;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i10 = 0;
        }
        textPaint.setShadowLayer(this.f11916h, this.f11914f, this.f11915g, i10);
    }

    public final void e(Context context, TextPaint textPaint, android.support.v4.media.session.b bVar) {
        Typeface typeface;
        if (c(context) && this.f11921n && (typeface = this.f11923p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f11923p);
        b(context, new c(this, context, textPaint, bVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f3;
        Typeface q9 = y.q(context.getResources().getConfiguration(), typeface);
        if (q9 != null) {
            typeface = q9;
        }
        textPaint.setTypeface(typeface);
        int i6 = (~typeface.getStyle()) & this.f11912d;
        if ((i6 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i6 & 2) != 0) {
            f3 = -0.25f;
        } else {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        textPaint.setTextSkewX(f3);
        textPaint.setTextSize(this.f11919l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f11911c);
        }
        if (this.f11917i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
