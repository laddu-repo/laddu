package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f10408a;

    /* renamed from: b, reason: collision with root package name */
    public d3 f10409b;

    /* renamed from: c, reason: collision with root package name */
    public d3 f10410c;

    /* renamed from: d, reason: collision with root package name */
    public d3 f10411d;

    /* renamed from: e, reason: collision with root package name */
    public d3 f10412e;

    /* renamed from: f, reason: collision with root package name */
    public d3 f10413f;

    /* renamed from: g, reason: collision with root package name */
    public d3 f10414g;

    /* renamed from: h, reason: collision with root package name */
    public d3 f10415h;

    /* renamed from: i, reason: collision with root package name */
    public final g1 f10416i;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f10417k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f10418l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10419m;

    public x0(TextView textView) {
        this.f10408a = textView;
        this.f10416i = new g1(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p.d3] */
    public static d3 c(Context context, t tVar, int i6) {
        ColorStateList i10;
        synchronized (tVar) {
            i10 = tVar.f10386a.i(context, i6);
        }
        if (i10 != null) {
            ?? obj = new Object();
            obj.f10233d = true;
            obj.f10230a = i10;
            return obj;
        }
        return null;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i6;
        int i10;
        CharSequence subSequence;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i11 >= 30) {
                v0.b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i11 >= 30) {
                v0.b.a(editorInfo, text);
                return;
            }
            int i12 = editorInfo.initialSelStart;
            int i13 = editorInfo.initialSelEnd;
            if (i12 > i13) {
                i6 = i13;
            } else {
                i6 = i12;
            }
            if (i12 <= i13) {
                i12 = i13;
            }
            int length = text.length();
            if (i6 >= 0 && i12 <= length) {
                int i14 = editorInfo.inputType & 4095;
                if (i14 != 129 && i14 != 225 && i14 != 18) {
                    if (length <= 2048) {
                        v0.c.a(editorInfo, text, i6, i12);
                        return;
                    }
                    int i15 = i12 - i6;
                    if (i15 > 1024) {
                        i10 = 0;
                    } else {
                        i10 = i15;
                    }
                    int i16 = 2048 - i10;
                    int min = Math.min(text.length() - i12, i16 - Math.min(i6, (int) (i16 * 0.8d)));
                    int min2 = Math.min(i6, i16 - min);
                    int i17 = i6 - min2;
                    if (Character.isLowSurrogate(text.charAt(i17))) {
                        i17++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i12 + min) - 1))) {
                        min--;
                    }
                    int i18 = min2 + i10;
                    int i19 = i18 + min;
                    if (i10 != i15) {
                        subSequence = TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i12, min + i12));
                    } else {
                        subSequence = text.subSequence(i17, i19 + i17);
                    }
                    v0.c.a(editorInfo, subSequence, min2, i18);
                    return;
                }
                v0.c.a(editorInfo, null, 0, 0);
                return;
            }
            v0.c.a(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, d3 d3Var) {
        if (drawable != null && d3Var != null) {
            t.e(drawable, d3Var, this.f10408a.getDrawableState());
        }
    }

    public final void b() {
        d3 d3Var = this.f10409b;
        TextView textView = this.f10408a;
        if (d3Var != null || this.f10410c != null || this.f10411d != null || this.f10412e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f10409b);
            a(compoundDrawables[1], this.f10410c);
            a(compoundDrawables[2], this.f10411d);
            a(compoundDrawables[3], this.f10412e);
        }
        if (this.f10413f == null && this.f10414g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f10413f);
        a(compoundDrawablesRelative[2], this.f10414g);
    }

    public final ColorStateList d() {
        d3 d3Var = this.f10415h;
        if (d3Var != null) {
            return d3Var.f10230a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        d3 d3Var = this.f10415h;
        if (d3Var != null) {
            return d3Var.f10231b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r30, int r31) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.x0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i6) {
        String string;
        ColorStateList t10;
        ColorStateList t11;
        ColorStateList t12;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, h.a.f5754y);
        n9.j jVar = new n9.j(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f10408a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (t12 = jVar.t(3)) != null) {
                textView.setTextColor(t12);
            }
            if (obtainStyledAttributes.hasValue(5) && (t11 = jVar.t(5)) != null) {
                textView.setLinkTextColor(t11);
            }
            if (obtainStyledAttributes.hasValue(4) && (t10 = jVar.t(4)) != null) {
                textView.setHintTextColor(t10);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        n(context, jVar);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            v0.d(textView, string);
        }
        jVar.G();
        Typeface typeface = this.f10418l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i6, int i10, int i11, int i12) {
        g1 g1Var = this.f10416i;
        if (g1Var.j()) {
            DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(i12, i6, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i6) {
        g1 g1Var = this.f10416i;
        if (g1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i6 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i6, iArr[i10], displayMetrics));
                    }
                }
                g1Var.f10256f = g1.b(iArr2);
                if (!g1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                g1Var.f10257g = false;
            }
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void k(int i6) {
        g1 g1Var = this.f10416i;
        if (g1Var.j()) {
            if (i6 != 0) {
                if (i6 == 1) {
                    DisplayMetrics displayMetrics = g1Var.j.getResources().getDisplayMetrics();
                    g1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (g1Var.h()) {
                        g1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(h8.c.i(i6, "Unknown auto-size text type: "));
            }
            g1Var.f10251a = 0;
            g1Var.f10254d = -1.0f;
            g1Var.f10255e = -1.0f;
            g1Var.f10253c = -1.0f;
            g1Var.f10256f = new int[0];
            g1Var.f10252b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p.d3] */
    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.f10415h == null) {
            this.f10415h = new Object();
        }
        d3 d3Var = this.f10415h;
        d3Var.f10230a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d3Var.f10233d = z10;
        this.f10409b = d3Var;
        this.f10410c = d3Var;
        this.f10411d = d3Var;
        this.f10412e = d3Var;
        this.f10413f = d3Var;
        this.f10414g = d3Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p.d3] */
    public final void m(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f10415h == null) {
            this.f10415h = new Object();
        }
        d3 d3Var = this.f10415h;
        d3Var.f10231b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d3Var.f10232c = z10;
        this.f10409b = d3Var;
        this.f10410c = d3Var;
        this.f10411d = d3Var;
        this.f10412e = d3Var;
        this.f10413f = d3Var;
        this.f10414g = d3Var;
    }

    public final void n(Context context, n9.j jVar) {
        String string;
        boolean z10;
        boolean z11;
        int i6 = this.j;
        TypedArray typedArray = (TypedArray) jVar.f9356z;
        this.j = typedArray.getInt(2, i6);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f10417k = i11;
            if (i11 != -1) {
                this.j &= 2;
            }
        }
        int i12 = 10;
        boolean z12 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f10419m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            this.f10418l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f10418l = Typeface.SERIF;
                    return;
                }
                this.f10418l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f10418l = null;
        if (typedArray.hasValue(12)) {
            i12 = 12;
        }
        int i14 = this.f10417k;
        int i15 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface x10 = jVar.x(i12, this.j, new s0(this, i14, i15, new WeakReference(this.f10408a)));
                if (x10 != null) {
                    if (i10 >= 28 && this.f10417k != -1) {
                        Typeface create = Typeface.create(x10, 0);
                        int i16 = this.f10417k;
                        if ((this.j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f10418l = w0.a(create, i16, z11);
                    } else {
                        this.f10418l = x10;
                    }
                }
                if (this.f10418l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f10419m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f10418l == null && (string = typedArray.getString(i12)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f10417k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.f10417k;
                if ((this.j & 2) != 0) {
                    z12 = true;
                }
                this.f10418l = w0.a(create2, i17, z12);
                return;
            }
            this.f10418l = Typeface.create(string, this.j);
        }
    }
}
