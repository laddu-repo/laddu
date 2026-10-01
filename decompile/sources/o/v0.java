package o;

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
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f9310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ef.i f9311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ef.i f9312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ef.i f9313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ef.i f9314e;
    public ef.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ef.i f9315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ef.i f9316h;
    public final e1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9317j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9318k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f9319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9320m;

    public v0(TextView textView) {
        this.f9310a = textView;
        this.i = new e1(textView);
    }

    public static ef.i c(Context context, s sVar, int i) {
        ColorStateList colorStateListI;
        synchronized (sVar) {
            colorStateListI = sVar.f9293a.i(context, i);
        }
        if (colorStateListI == null) {
            return null;
        }
        ef.i iVar = new ef.i();
        iVar.f4995b = true;
        iVar.f4996c = colorStateListI;
        return iVar;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            v0.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            v0.b.a(editorInfo, text);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = text.length();
        if (i12 < 0 || i10 > length) {
            v0.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            v0.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            v0.c.a(editorInfo, text, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int iMin = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (((double) i16) * 0.8d)));
        int iMin2 = Math.min(i12, i16 - iMin);
        int i17 = i12 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i17))) {
            i17++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i10 + iMin) - 1))) {
            iMin--;
        }
        int i18 = iMin2 + i15;
        v0.c.a(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + iMin2), text.subSequence(i10, iMin + i10)) : text.subSequence(i17, i18 + iMin + i17), iMin2, i18);
    }

    public final void a(Drawable drawable, ef.i iVar) {
        if (drawable == null || iVar == null) {
            return;
        }
        s.e(drawable, iVar, this.f9310a.getDrawableState());
    }

    public final void b() {
        ef.i iVar = this.f9311b;
        TextView textView = this.f9310a;
        if (iVar != null || this.f9312c != null || this.f9313d != null || this.f9314e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f9311b);
            a(compoundDrawables[1], this.f9312c);
            a(compoundDrawables[2], this.f9313d);
            a(compoundDrawables[3], this.f9314e);
        }
        if (this.f == null && this.f9315g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.f9315g);
    }

    public final ColorStateList d() {
        ef.i iVar = this.f9316h;
        if (iVar != null) {
            return (ColorStateList) iVar.f4996c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        ef.i iVar = this.f9316h;
        if (iVar != null) {
            return (PorterDuff.Mode) iVar.f4997d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, g.j.TextAppearance);
        hd.a aVar = new hd.a(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(g.j.TextAppearance_textAllCaps);
        TextView textView = this.f9310a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(g.j.TextAppearance_textAllCaps, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(g.j.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(g.j.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, aVar);
        if (i10 >= 26 && typedArrayObtainStyledAttributes.hasValue(g.j.TextAppearance_fontVariationSettings) && (string = typedArrayObtainStyledAttributes.getString(g.j.TextAppearance_fontVariationSettings)) != null) {
            t0.d(textView, string);
        }
        aVar.K();
        Typeface typeface = this.f9319l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f9317j);
        }
    }

    public final void i(int i, int i10, int i11, int i12) {
        e1 e1Var = this.i;
        if (e1Var.j()) {
            DisplayMetrics displayMetrics = e1Var.f9147j.getResources().getDisplayMetrics();
            e1Var.k(TypedValue.applyDimension(i12, i, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        e1 e1Var = this.i;
        if (e1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e1Var.f9147j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i, iArr[i10], displayMetrics));
                    }
                }
                e1Var.f = e1.b(iArrCopyOf);
                if (!e1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                e1Var.f9145g = false;
            }
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void k(int i) {
        e1 e1Var = this.i;
        if (e1Var.j()) {
            if (i == 0) {
                e1Var.f9140a = 0;
                e1Var.f9143d = -1.0f;
                e1Var.f9144e = -1.0f;
                e1Var.f9142c = -1.0f;
                e1Var.f = new int[0];
                e1Var.f9141b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(d0.d.h(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = e1Var.f9147j.getResources().getDisplayMetrics();
            e1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f9316h == null) {
            this.f9316h = new ef.i();
        }
        ef.i iVar = this.f9316h;
        iVar.f4996c = colorStateList;
        iVar.f4995b = colorStateList != null;
        this.f9311b = iVar;
        this.f9312c = iVar;
        this.f9313d = iVar;
        this.f9314e = iVar;
        this.f = iVar;
        this.f9315g = iVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f9316h == null) {
            this.f9316h = new ef.i();
        }
        ef.i iVar = this.f9316h;
        iVar.f4997d = mode;
        iVar.f4994a = mode != null;
        this.f9311b = iVar;
        this.f9312c = iVar;
        this.f9313d = iVar;
        this.f9314e = iVar;
        this.f = iVar;
        this.f9315g = iVar;
    }

    public final void n(Context context, hd.a aVar) {
        String string;
        int i = g.j.TextAppearance_android_textStyle;
        int i10 = this.f9317j;
        TypedArray typedArray = (TypedArray) aVar.f6280x;
        this.f9317j = typedArray.getInt(i, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(g.j.TextAppearance_android_textFontWeight, -1);
            this.f9318k = i12;
            if (i12 != -1) {
                this.f9317j &= 2;
            }
        }
        if (!typedArray.hasValue(g.j.TextAppearance_android_fontFamily) && !typedArray.hasValue(g.j.TextAppearance_fontFamily)) {
            if (typedArray.hasValue(g.j.TextAppearance_android_typeface)) {
                this.f9320m = false;
                int i13 = typedArray.getInt(g.j.TextAppearance_android_typeface, 1);
                if (i13 == 1) {
                    this.f9319l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f9319l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f9319l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f9319l = null;
        int i14 = typedArray.hasValue(g.j.TextAppearance_fontFamily) ? g.j.TextAppearance_fontFamily : g.j.TextAppearance_android_fontFamily;
        int i15 = this.f9318k;
        int i16 = this.f9317j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceY = aVar.y(i14, this.f9317j, new p0(this, i15, i16, new WeakReference(this.f9310a)));
                if (typefaceY != null) {
                    if (i11 < 28 || this.f9318k == -1) {
                        this.f9319l = typefaceY;
                    } else {
                        this.f9319l = u0.a(Typeface.create(typefaceY, 0), this.f9318k, (this.f9317j & 2) != 0);
                    }
                }
                this.f9320m = this.f9319l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f9319l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f9318k == -1) {
            this.f9319l = Typeface.create(string, this.f9317j);
        } else {
            this.f9319l = u0.a(Typeface.create(string, 0), this.f9318k, (this.f9317j & 2) != 0);
        }
    }
}
