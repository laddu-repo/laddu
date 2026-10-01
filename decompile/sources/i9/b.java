package i9;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f6521a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f6522a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f6523b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f6524b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f6525c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f6526c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f6527d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CharSequence f6528d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f6529e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f6537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f6539k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f6540k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f6542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f6544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f6545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f6546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f6547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f6548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f6549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f6550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f6551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f6552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f6553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f6554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l9.a f6555z;
    public int f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6532g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6534h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f6530e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f6531f0 = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final float f6533g0 = 1.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f6535h0 = 1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f6536i0 = -1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f6538j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f6521a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f6527d = new Rect();
        this.f6525c = new Rect();
        this.f6529e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f, int i, int i10) {
        float f4 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i10) * f) + (Color.alpha(i) * f4)), Math.round((Color.red(i10) * f) + (Color.red(i) * f4)), Math.round((Color.green(i10) * f) + (Color.green(i) * f4)), Math.round((Color.blue(i10) * f) + (Color.blue(i) * f4)));
    }

    public static float h(float f, float f4, float f10, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f10 = timeInterpolator.getInterpolation(f10);
        }
        return q8.a.a(f, f4, f10);
    }

    public final void b() {
        float f = this.f6523b;
        float f4 = this.f6525c.left;
        Rect rect = this.f6527d;
        float fH = h(f4, rect.left, f, this.Q);
        RectF rectF = this.f6529e;
        rectF.left = fH;
        rectF.top = h(this.f6542m, this.f6543n, f, this.Q);
        rectF.right = h(r1.right, rect.right, f, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f, this.Q);
        this.f6546q = h(this.f6544o, this.f6545p, f, this.Q);
        this.f6547r = h(this.f6542m, this.f6543n, f, this.Q);
        d(f, false);
        TextInputLayout textInputLayout = this.f6521a;
        textInputLayout.postInvalidateOnAnimation();
        o1.a aVar = q8.a.f10945b;
        this.f6524b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f6526c0 = h(1.0f, 0.0f, f, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f6539k;
        ColorStateList colorStateList2 = this.f6537j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f, g(colorStateList2), g(this.f6539k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f10 = this.W;
        float f11 = this.X;
        if (f10 != f11) {
            textPaint.setLetterSpacing(h(f11, f10, f, aVar));
        } else {
            textPaint.setLetterSpacing(f10);
        }
        this.H = q8.a.a(0.0f, this.S, f);
        this.I = q8.a.a(0.0f, this.T, f);
        this.J = q8.a.a(0.0f, this.U, f);
        int iA = a(f, 0, g(this.V));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z2 = this.f6521a.getLayoutDirection() == 1;
        if (this.E) {
            return (z2 ? r0.g.f11060d : r0.g.f11059c).g(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void d(float f, boolean z2) {
        float f4;
        Typeface typeface;
        float f10;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f6527d.width();
        float fWidth2 = this.f6525c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f4 = o() ? this.i : this.f6534h;
            f10 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f6534h, this.i, f, this.R) / this.f6534h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.f6548s;
            fWidth2 = fWidth;
        } else {
            f4 = this.f6534h;
            float f11 = this.X;
            typeface = this.f6551v;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f6534h, this.i, f, this.R) / this.f6534h;
            }
            float f12 = this.i / this.f6534h;
            float f13 = fWidth2 * f12;
            if (!z2 && f13 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f12, fWidth2);
            }
            f10 = f11;
        }
        int i = f < 0.5f ? this.f6530e0 : this.f6531f0;
        TextPaint textPaint = this.O;
        if (fWidth2 > 0.0f) {
            boolean z10 = this.G != f4;
            boolean z11 = this.Y != f10;
            boolean z12 = this.f6554y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z13 = z10 || z11 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z12 || (this.L != i) || this.N;
            this.G = f4;
            this.Y = f10;
            this.f6554y = typeface;
            this.N = false;
            this.L = i;
            textPaint.setLinearText(this.F != 1.0f);
            z = z13;
        }
        if (this.C == null || z) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f6554y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f6530e0 > 1 || this.f6531f0 > 1) && !zC) ? i : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z2) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        i iVar = new i(charSequence, textPaint, (int) f);
        iVar.f6571l = this.A;
        iVar.f6570k = z2;
        iVar.f6566e = alignment;
        iVar.f6569j = false;
        iVar.f = i;
        float f4 = this.f6533g0;
        iVar.f6567g = 0.0f;
        iVar.f6568h = f4;
        iVar.i = this.f6535h0;
        iVar.f6572m = null;
        StaticLayout staticLayoutA = iVar.a();
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i = this.f6536i0;
        if (i != -1) {
            return i;
        }
        float f = this.i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f6548s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f6550u;
            if (typeface != null) {
                this.f6549t = com.bumptech.glide.e.l(configuration, typeface);
            }
            Typeface typeface2 = this.f6553x;
            if (typeface2 != null) {
                this.f6552w = com.bumptech.glide.e.l(configuration, typeface2);
            }
            Typeface typeface3 = this.f6549t;
            if (typeface3 == null) {
                typeface3 = this.f6550u;
            }
            this.f6548s = typeface3;
            Typeface typeface4 = this.f6552w;
            if (typeface4 == null) {
                typeface4 = this.f6553x;
            }
            this.f6551v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z2) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f6521a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        d(1.0f, z2);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f6528d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f6528d0;
        if (charSequence2 != null) {
            this.f6522a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f6522a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f6532g, this.D ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f6527d;
        if (i == 48) {
            this.f6543n = rect.top;
        } else if (i != 80) {
            this.f6543n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f6543n = textPaint.ascent() + rect.bottom;
        }
        int i10 = absoluteGravity & 8388615;
        if (i10 == 1) {
            this.f6545p = rect.centerX() - (this.f6522a0 / 2.0f);
        } else if (i10 != 5) {
            this.f6545p = rect.left;
        } else {
            this.f6545p = rect.right - this.f6522a0;
        }
        if (this.f6522a0 <= rect.width()) {
            float f = this.f6545p;
            float fMax = Math.max(0.0f, rect.left - f) + f;
            this.f6545p = fMax;
            this.f6545p = Math.min(0.0f, rect.right - (this.f6522a0 + fMax)) + fMax;
        }
        float f4 = this.i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f4);
        textPaint2.setTypeface(this.f6548s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f10 = this.f6543n;
            float fMax2 = Math.max(0.0f, rect.top - f10) + f10;
            this.f6543n = fMax2;
            this.f6543n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z2);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f6530e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f6541l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.D ? 1 : 0);
        int i11 = absoluteGravity2 & 112;
        Rect rect2 = this.f6525c;
        if (i11 == 48) {
            this.f6542m = rect2.top;
        } else if (i11 != 80) {
            this.f6542m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f6542m = (rect2.bottom - height) + (this.f6540k0 ? textPaint.descent() : 0.0f);
        }
        int i12 = absoluteGravity2 & 8388615;
        if (i12 == 1) {
            this.f6544o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i12 != 5) {
            this.f6544o = rect2.left;
        } else {
            this.f6544o = rect2.right - fMeasureText;
        }
        d(this.f6523b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f6539k == colorStateList && this.f6537j == colorStateList) {
            return;
        }
        this.f6539k = colorStateList;
        this.f6537j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        l9.a aVar = this.f6555z;
        if (aVar != null) {
            aVar.f8316c = true;
        }
        if (this.f6550u == typeface) {
            return false;
        }
        this.f6550u = typeface;
        Typeface typefaceL = com.bumptech.glide.e.l(this.f6521a.getContext().getResources().getConfiguration(), typeface);
        this.f6549t = typefaceL;
        if (typefaceL == null) {
            typefaceL = this.f6550u;
        }
        this.f6548s = typefaceL;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.f6523b
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.f6523b = r3
            r2.b()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.b.m(float):void");
    }

    public final void n(Typeface typeface) {
        boolean z2;
        boolean zL = l(typeface);
        if (this.f6553x != typeface) {
            this.f6553x = typeface;
            Typeface typefaceL = com.bumptech.glide.e.l(this.f6521a.getContext().getResources().getConfiguration(), typeface);
            this.f6552w = typefaceL;
            if (typefaceL == null) {
                typefaceL = this.f6553x;
            }
            this.f6551v = typefaceL;
            z2 = true;
        } else {
            z2 = false;
        }
        if (zL || z2) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f6531f0 == 1;
    }
}
