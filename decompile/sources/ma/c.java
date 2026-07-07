package ma;

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
import android.util.Log;
import android.view.Gravity;
import bf.y;
import com.google.android.gms.internal.measurement.p4;
import com.google.android.material.textfield.TextInputLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {
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

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f8729a;

    /* renamed from: a0, reason: collision with root package name */
    public float f8730a0;

    /* renamed from: b, reason: collision with root package name */
    public float f8731b;

    /* renamed from: b0, reason: collision with root package name */
    public float f8732b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f8733c;

    /* renamed from: c0, reason: collision with root package name */
    public float f8734c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f8735d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f8736d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f8737e;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f8748k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f8749k0;

    /* renamed from: l, reason: collision with root package name */
    public int f8750l;

    /* renamed from: m, reason: collision with root package name */
    public float f8751m;

    /* renamed from: n, reason: collision with root package name */
    public float f8752n;

    /* renamed from: o, reason: collision with root package name */
    public float f8753o;

    /* renamed from: p, reason: collision with root package name */
    public float f8754p;

    /* renamed from: q, reason: collision with root package name */
    public float f8755q;

    /* renamed from: r, reason: collision with root package name */
    public float f8756r;
    public Typeface s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f8757t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f8758u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f8759v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f8760w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f8761x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f8762y;

    /* renamed from: z, reason: collision with root package name */
    public ra.a f8763z;

    /* renamed from: f, reason: collision with root package name */
    public int f8739f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f8741g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f8743h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f8745i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f8738e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f8740f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f8742g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f8744h0 = j.f8769n;

    /* renamed from: i0, reason: collision with root package name */
    public int f8746i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f8747j0 = -1;

    public c(TextInputLayout textInputLayout) {
        this.f8729a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f8735d = new Rect();
        this.f8733c = new Rect();
        this.f8737e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f3, int i6, int i10) {
        float f10 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i10) * f3) + (Color.alpha(i6) * f10)), Math.round((Color.red(i10) * f3) + (Color.red(i6) * f10)), Math.round((Color.green(i10) * f3) + (Color.green(i6) * f10)), Math.round((Color.blue(i10) * f3) + (Color.blue(i6) * f10)));
    }

    public static float h(float f3, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return u9.a.a(f3, f10, f11);
    }

    public final void b() {
        float f3 = this.f8731b;
        float f10 = this.f8733c.left;
        Rect rect = this.f8735d;
        float h4 = h(f10, rect.left, f3, this.Q);
        RectF rectF = this.f8737e;
        rectF.left = h4;
        rectF.top = h(this.f8751m, this.f8752n, f3, this.Q);
        rectF.right = h(r1.right, rect.right, f3, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f3, this.Q);
        this.f8755q = h(this.f8753o, this.f8754p, f3, this.Q);
        this.f8756r = h(this.f8751m, this.f8752n, f3, this.Q);
        d(f3, false);
        TextInputLayout textInputLayout = this.f8729a;
        textInputLayout.postInvalidateOnAnimation();
        l1.a aVar = u9.a.f12954b;
        this.f8732b0 = 1.0f - h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f - f3, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f8734c0 = h(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f8748k;
        ColorStateList colorStateList2 = this.j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f3, g(colorStateList2), g(this.f8748k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f11 = this.W;
        float f12 = this.X;
        if (f11 != f12) {
            textPaint.setLetterSpacing(h(f12, f11, f3, aVar));
        } else {
            textPaint.setLetterSpacing(f11);
        }
        this.H = u9.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.S, f3);
        this.I = u9.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.T, f3);
        this.J = u9.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.U, f3);
        int a10 = a(f3, 0, g(this.V));
        this.K = a10;
        textPaint.setShadowLayer(this.H, this.I, this.J, a10);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        p4 p4Var;
        boolean z10 = true;
        if (this.f8729a.getLayoutDirection() != 1) {
            z10 = false;
        }
        if (this.E) {
            if (z10) {
                p4Var = r0.f.f11258d;
            } else {
                p4Var = r0.f.f11257c;
            }
            return p4Var.e(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void d(float f3, boolean z10) {
        float f10;
        Typeface typeface;
        float f11;
        int i6;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float h4;
        if (this.B != null) {
            float width = this.f8735d.width();
            float width2 = this.f8733c.width();
            float f12 = 1.0f;
            if (Math.abs(f3 - 1.0f) < 1.0E-5f) {
                if (o()) {
                    f10 = this.f8745i;
                } else {
                    f10 = this.f8743h;
                }
                if (o()) {
                    f11 = this.W;
                } else {
                    f11 = this.X;
                }
                if (o()) {
                    h4 = 1.0f;
                } else {
                    h4 = h(this.f8743h, this.f8745i, f3, this.R) / this.f8743h;
                }
                this.F = h4;
                if (!o()) {
                    width = width2;
                }
                typeface = this.s;
                width2 = width;
            } else {
                f10 = this.f8743h;
                float f13 = this.X;
                typeface = this.f8759v;
                if (Math.abs(f3 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = h(this.f8743h, this.f8745i, f3, this.R) / this.f8743h;
                }
                float f14 = this.f8745i / this.f8743h;
                float f15 = width2 * f14;
                if (!z10 && f15 > width && o()) {
                    width2 = Math.min(width / f14, width2);
                }
                f11 = f13;
            }
            if (f3 < 0.5f) {
                i6 = this.f8738e0;
            } else {
                i6 = this.f8740f0;
            }
            TextPaint textPaint = this.O;
            boolean z17 = false;
            if (width2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (this.G != f10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Y != f11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.f8762y != typeface) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.Z != null && width2 != r12.getWidth()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.L != i6) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z11 && !z12 && !z14 && !z13 && !z15 && !this.N) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                this.G = f10;
                this.Y = f11;
                this.f8762y = typeface;
                this.N = false;
                this.L = i6;
                if (this.F != 1.0f) {
                    z17 = true;
                }
                textPaint.setLinearText(z17);
                z17 = z16;
            }
            if (this.C != null && !z17) {
                return;
            }
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f8762y);
            textPaint.setLetterSpacing(this.Y);
            boolean c10 = c(this.B);
            this.D = c10;
            if ((this.f8738e0 <= 1 && this.f8740f0 <= 1) || c10) {
                i10 = 1;
            } else {
                i10 = i6;
            }
            CharSequence charSequence = this.B;
            if (!o()) {
                f12 = this.F;
            }
            StaticLayout e10 = e(i10, textPaint, charSequence, width2 * f12, this.D);
            this.Z = e10;
            this.C = e10.getText();
        }
    }

    public final StaticLayout e(int i6, TextPaint textPaint, CharSequence charSequence, float f3, boolean z10) {
        Layout.Alignment alignment;
        StaticLayout staticLayout = null;
        try {
            if (i6 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f8739f, this.D ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        if (this.D) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.D) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            j jVar = new j(charSequence, textPaint, (int) f3);
            jVar.f8783l = this.A;
            jVar.f8782k = z10;
            jVar.f8777e = alignment;
            jVar.j = false;
            jVar.f8778f = i6;
            float f10 = this.f8742g0;
            jVar.f8779g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            jVar.f8780h = f10;
            jVar.f8781i = this.f8744h0;
            jVar.f8784m = null;
            staticLayout = jVar.a();
        } catch (i e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
        }
        staticLayout.getClass();
        return staticLayout;
    }

    public final float f() {
        int i6 = this.f8746i0;
        if (i6 != -1) {
            return i6;
        }
        float f3 = this.f8745i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f3);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f8758u;
            if (typeface != null) {
                this.f8757t = y.q(configuration, typeface);
            }
            Typeface typeface2 = this.f8761x;
            if (typeface2 != null) {
                this.f8760w = y.q(configuration, typeface2);
            }
            Typeface typeface3 = this.f8757t;
            if (typeface3 == null) {
                typeface3 = this.f8758u;
            }
            this.s = typeface3;
            Typeface typeface4 = this.f8760w;
            if (typeface4 == null) {
                typeface4 = this.f8761x;
            }
            this.f8759v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z10) {
        float f3;
        float f10;
        int i6;
        CharSequence charSequence;
        TextInputLayout textInputLayout = this.f8729a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z10) {
            d(1.0f, z10);
            CharSequence charSequence2 = this.C;
            TextPaint textPaint = this.O;
            if (charSequence2 != null && this.Z != null) {
                if (o()) {
                    charSequence = TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A);
                } else {
                    charSequence = this.C;
                }
                this.f8736d0 = charSequence;
            }
            CharSequence charSequence3 = this.f8736d0;
            float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (charSequence3 != null) {
                this.f8730a0 = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.f8730a0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f8741g, this.D ? 1 : 0);
            int i10 = absoluteGravity & 112;
            Rect rect = this.f8735d;
            if (i10 != 48) {
                if (i10 != 80) {
                    this.f8752n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f8752n = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f8752n = rect.top;
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    this.f8754p = rect.left;
                } else {
                    this.f8754p = rect.right - this.f8730a0;
                }
            } else {
                this.f8754p = rect.centerX() - (this.f8730a0 / 2.0f);
            }
            if (this.f8730a0 <= rect.width()) {
                float f12 = this.f8754p;
                float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.left - f12) + f12;
                this.f8754p = max;
                this.f8754p = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.right - (this.f8730a0 + max)) + max;
            }
            float f13 = this.f8745i;
            TextPaint textPaint2 = this.P;
            textPaint2.setTextSize(f13);
            textPaint2.setTypeface(this.s);
            textPaint2.setLetterSpacing(this.W);
            if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
                float f14 = this.f8752n;
                float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.top - f14) + f14;
                this.f8752n = max2;
                this.f8752n = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.bottom - (f() + max2)) + max2;
            }
            d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z10);
            StaticLayout staticLayout = this.Z;
            if (staticLayout != null) {
                f3 = staticLayout.getHeight();
            } else {
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            StaticLayout staticLayout2 = this.Z;
            if (staticLayout2 != null && this.f8738e0 > 1) {
                f10 = staticLayout2.getWidth();
            } else {
                CharSequence charSequence4 = this.C;
                if (charSequence4 != null) {
                    f10 = textPaint.measureText(charSequence4, 0, charSequence4.length());
                } else {
                    f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            StaticLayout staticLayout3 = this.Z;
            if (staticLayout3 != null) {
                i6 = staticLayout3.getLineCount();
            } else {
                i6 = 0;
            }
            this.f8750l = i6;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f8739f, this.D ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            Rect rect2 = this.f8733c;
            if (i12 != 48) {
                if (i12 != 80) {
                    this.f8751m = rect2.centerY() - (f3 / 2.0f);
                } else {
                    float f15 = rect2.bottom - f3;
                    if (this.f8749k0) {
                        f11 = textPaint.descent();
                    }
                    this.f8751m = f15 + f11;
                }
            } else {
                this.f8751m = rect2.top;
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 != 1) {
                if (i13 != 5) {
                    this.f8753o = rect2.left;
                } else {
                    this.f8753o = rect2.right - f10;
                }
            } else {
                this.f8753o = rect2.centerX() - (f10 / 2.0f);
            }
            d(this.f8731b, false);
            textInputLayout.postInvalidateOnAnimation();
            b();
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f8748k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.f8748k = colorStateList;
        this.j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        ra.a aVar = this.f8763z;
        if (aVar != null) {
            aVar.f11902c = true;
        }
        if (this.f8758u != typeface) {
            this.f8758u = typeface;
            Typeface q9 = y.q(this.f8729a.getContext().getResources().getConfiguration(), typeface);
            this.f8757t = q9;
            if (q9 == null) {
                q9 = this.f8758u;
            }
            this.s = q9;
            return true;
        }
        return false;
    }

    public final void m(float f3) {
        float a10 = c9.a.a(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (a10 != this.f8731b) {
            this.f8731b = a10;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z10;
        boolean l10 = l(typeface);
        if (this.f8761x != typeface) {
            this.f8761x = typeface;
            Typeface q9 = y.q(this.f8729a.getContext().getResources().getConfiguration(), typeface);
            this.f8760w = q9;
            if (q9 == null) {
                q9 = this.f8761x;
            }
            this.f8759v = q9;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!l10 && !z10) {
            return;
        }
        j(false);
    }

    public final boolean o() {
        if (this.f8740f0 == 1) {
            return true;
        }
        return false;
    }
}
