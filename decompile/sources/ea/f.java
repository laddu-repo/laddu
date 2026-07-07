package ea;

import a2.r1;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ma.k;
import ma.l;
import ma.n;
import okhttp3.HttpUrl;
import ua.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends ua.i implements Drawable.Callback, k {

    /* renamed from: m1, reason: collision with root package name */
    public static final int[] f4509m1 = {R.attr.state_enabled};

    /* renamed from: n1, reason: collision with root package name */
    public static final ShapeDrawable f4510n1 = new ShapeDrawable(new OvalShape());
    public ColorStateList A0;
    public u9.e B0;
    public u9.e C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public float K0;
    public final Context L0;
    public final Paint M0;
    public final Paint.FontMetrics N0;
    public final RectF O0;
    public final PointF P0;
    public final Path Q0;
    public final l R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public boolean Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f4511a1;

    /* renamed from: b1, reason: collision with root package name */
    public ColorFilter f4512b1;
    public PorterDuffColorFilter c1;

    /* renamed from: d1, reason: collision with root package name */
    public ColorStateList f4513d1;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f4514e0;

    /* renamed from: e1, reason: collision with root package name */
    public PorterDuff.Mode f4515e1;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f4516f0;

    /* renamed from: f1, reason: collision with root package name */
    public int[] f4517f1;

    /* renamed from: g0, reason: collision with root package name */
    public float f4518g0;

    /* renamed from: g1, reason: collision with root package name */
    public ColorStateList f4519g1;

    /* renamed from: h0, reason: collision with root package name */
    public float f4520h0;

    /* renamed from: h1, reason: collision with root package name */
    public WeakReference f4521h1;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f4522i0;

    /* renamed from: i1, reason: collision with root package name */
    public TextUtils.TruncateAt f4523i1;

    /* renamed from: j0, reason: collision with root package name */
    public float f4524j0;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f4525j1;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f4526k0;

    /* renamed from: k1, reason: collision with root package name */
    public int f4527k1;

    /* renamed from: l0, reason: collision with root package name */
    public CharSequence f4528l0;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f4529l1;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f4530m0;

    /* renamed from: n0, reason: collision with root package name */
    public Drawable f4531n0;
    public ColorStateList o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f4532p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f4533q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f4534r0;

    /* renamed from: s0, reason: collision with root package name */
    public Drawable f4535s0;

    /* renamed from: t0, reason: collision with root package name */
    public RippleDrawable f4536t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorStateList f4537u0;

    /* renamed from: v0, reason: collision with root package name */
    public float f4538v0;

    /* renamed from: w0, reason: collision with root package name */
    public SpannableStringBuilder f4539w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f4540x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4541y0;

    /* renamed from: z0, reason: collision with root package name */
    public Drawable f4542z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playfy.tv.R.attr.chipStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Chip_Action);
        this.f4520h0 = -1.0f;
        this.M0 = new Paint(1);
        this.N0 = new Paint.FontMetrics();
        this.O0 = new RectF();
        this.P0 = new PointF();
        this.Q0 = new Path();
        this.f4511a1 = 255;
        this.f4515e1 = PorterDuff.Mode.SRC_IN;
        this.f4521h1 = new WeakReference(null);
        m(context);
        this.L0 = context;
        l lVar = new l(this);
        this.R0 = lVar;
        this.f4528l0 = HttpUrl.FRAGMENT_ENCODE_SET;
        lVar.f8785a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f4509m1;
        setState(iArr);
        W(iArr);
        this.f4525j1 = true;
        f4510n1.setTint(-1);
    }

    public static boolean D(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean E(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static void f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        Drawable drawable;
        if (!d0() && !c0()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f3 = this.E0;
        if (this.Y0) {
            drawable = this.f4542z0;
        } else {
            drawable = this.f4531n0;
        }
        float f10 = this.f4532p0;
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        return f10 + f3 + this.F0;
    }

    public final float B() {
        if (e0()) {
            return this.I0 + this.f4538v0 + this.J0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float C() {
        if (this.f4529l1) {
            return k();
        }
        return this.f4520h0;
    }

    public final void F() {
        e eVar = (e) this.f4521h1.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.N);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.f.G(int[], int[]):boolean");
    }

    public final void H(boolean z10) {
        if (this.f4540x0 != z10) {
            this.f4540x0 = z10;
            float A = A();
            if (!z10 && this.Y0) {
                this.Y0 = false;
            }
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void I(Drawable drawable) {
        if (this.f4542z0 != drawable) {
            float A = A();
            this.f4542z0 = drawable;
            float A2 = A();
            f0(this.f4542z0);
            y(this.f4542z0);
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            if (this.f4541y0 && (drawable = this.f4542z0) != null && this.f4540x0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z10) {
        if (this.f4541y0 != z10) {
            boolean c02 = c0();
            this.f4541y0 = z10;
            boolean c03 = c0();
            if (c02 != c03) {
                if (c03) {
                    y(this.f4542z0);
                } else {
                    f0(this.f4542z0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void L(float f3) {
        if (this.f4520h0 != f3) {
            this.f4520h0 = f3;
            ua.l g10 = this.f13000y.f12978a.g();
            g10.f13007e = new ua.a(f3);
            g10.f13008f = new ua.a(f3);
            g10.f13009g = new ua.a(f3);
            g10.f13010h = new ua.a(f3);
            setShapeAppearanceModel(g10.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4531n0;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof m0.c;
            drawable2 = drawable3;
            if (z10) {
                drawable2 = ((m0.d) ((m0.c) drawable3)).C;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float A = A();
            if (drawable != null) {
                drawable4 = s1.c.A(drawable).mutate();
            }
            this.f4531n0 = drawable4;
            float A2 = A();
            f0(drawable2);
            if (d0()) {
                y(this.f4531n0);
            }
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void N(float f3) {
        if (this.f4532p0 != f3) {
            float A = A();
            this.f4532p0 = f3;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        this.f4533q0 = true;
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            if (d0()) {
                this.f4531n0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(boolean z10) {
        if (this.f4530m0 != z10) {
            boolean d02 = d0();
            this.f4530m0 = z10;
            boolean d03 = d0();
            if (d02 != d03) {
                if (d03) {
                    y(this.f4531n0);
                } else {
                    f0(this.f4531n0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.f4522i0 != colorStateList) {
            this.f4522i0 = colorStateList;
            if (this.f4529l1) {
                ua.g gVar = this.f13000y;
                if (gVar.f12982e != colorStateList) {
                    gVar.f12982e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void R(float f3) {
        if (this.f4524j0 != f3) {
            this.f4524j0 = f3;
            this.M0.setStrokeWidth(f3);
            if (this.f4529l1) {
                this.f13000y.f12987k = f3;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4535s0;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof m0.c;
            drawable2 = drawable3;
            if (z10) {
                drawable2 = ((m0.d) ((m0.c) drawable3)).C;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float B = B();
            if (drawable != null) {
                drawable4 = s1.c.A(drawable).mutate();
            }
            this.f4535s0 = drawable4;
            this.f4536t0 = new RippleDrawable(sa.b.b(this.f4526k0), this.f4535s0, f4510n1);
            float B2 = B();
            f0(drawable2);
            if (e0()) {
                y(this.f4535s0);
            }
            invalidateSelf();
            if (B != B2) {
                F();
            }
        }
    }

    public final void T(float f3) {
        if (this.J0 != f3) {
            this.J0 = f3;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void U(float f3) {
        if (this.f4538v0 != f3) {
            this.f4538v0 = f3;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void V(float f3) {
        if (this.I0 != f3) {
            this.I0 = f3;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final boolean W(int[] iArr) {
        if (!Arrays.equals(this.f4517f1, iArr)) {
            this.f4517f1 = iArr;
            if (e0()) {
                return G(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public final void X(ColorStateList colorStateList) {
        if (this.f4537u0 != colorStateList) {
            this.f4537u0 = colorStateList;
            if (e0()) {
                this.f4535s0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(boolean z10) {
        if (this.f4534r0 != z10) {
            boolean e02 = e0();
            this.f4534r0 = z10;
            boolean e03 = e0();
            if (e02 != e03) {
                if (e03) {
                    y(this.f4535s0);
                } else {
                    f0(this.f4535s0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Z(float f3) {
        if (this.F0 != f3) {
            float A = A();
            this.F0 = f3;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    @Override // ma.k
    public final void a() {
        F();
        invalidateSelf();
    }

    public final void a0(float f3) {
        if (this.E0 != f3) {
            float A = A();
            this.E0 = f3;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void b0(ColorStateList colorStateList) {
        if (this.f4526k0 != colorStateList) {
            this.f4526k0 = colorStateList;
            this.f4519g1 = null;
            onStateChange(getState());
        }
    }

    public final boolean c0() {
        if (this.f4541y0 && this.f4542z0 != null && this.Y0) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        if (this.f4530m0 && this.f4531n0 != null) {
            return true;
        }
        return false;
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i6;
        Canvas canvas2;
        int i10;
        float f3;
        float f10;
        boolean z10;
        int i11;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i6 = this.f4511a1) != 0) {
            if (i6 < 255) {
                float f11 = bounds.left;
                float f12 = bounds.top;
                float f13 = bounds.right;
                float f14 = bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    canvas2 = canvas;
                    saveLayerAlpha = canvas2.saveLayerAlpha(f11, f12, f13, f14, i6);
                } else {
                    canvas2 = canvas;
                    saveLayerAlpha = canvas2.saveLayerAlpha(f11, f12, f13, f14, i6, 31);
                }
                i10 = saveLayerAlpha;
            } else {
                canvas2 = canvas;
                i10 = 0;
            }
            boolean z11 = this.f4529l1;
            Paint paint = this.M0;
            RectF rectF = this.O0;
            if (!z11) {
                paint.setColor(this.S0);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, C(), C(), paint);
            }
            if (!this.f4529l1) {
                paint.setColor(this.T0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f4512b1;
                if (colorFilter == null) {
                    colorFilter = this.c1;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, C(), C(), paint);
            }
            if (this.f4529l1) {
                super.draw(canvas);
            }
            if (this.f4524j0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.f4529l1) {
                paint.setColor(this.V0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f4529l1) {
                    ColorFilter colorFilter2 = this.f4512b1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.c1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f15 = bounds.left;
                float f16 = this.f4524j0 / 2.0f;
                rectF.set(f15 + f16, bounds.top + f16, bounds.right - f16, bounds.bottom - f16);
                float f17 = this.f4520h0 - (this.f4524j0 / 2.0f);
                canvas2.drawRoundRect(rectF, f17, f17, paint);
            }
            paint.setColor(this.W0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.f4529l1) {
                canvas2.drawRoundRect(rectF, C(), C(), paint);
                f3 = 2.0f;
            } else {
                RectF rectF2 = new RectF(bounds);
                ua.g gVar = this.f13000y;
                m mVar = gVar.f12978a;
                float[] fArr = this.Z;
                float f18 = gVar.j;
                k7.c cVar = this.O;
                r1 r1Var = this.P;
                f3 = 2.0f;
                Path path = this.Q0;
                r1Var.b(mVar, fArr, f18, rectF2, cVar, path);
                f(canvas2, paint, path, this.f13000y.f12978a, this.Z, h());
            }
            if (d0()) {
                z(bounds, rectF);
                float f19 = rectF.left;
                float f20 = rectF.top;
                canvas2.translate(f19, f20);
                this.f4531n0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f4531n0.draw(canvas2);
                canvas2.translate(-f19, -f20);
            }
            if (c0()) {
                z(bounds, rectF);
                float f21 = rectF.left;
                float f22 = rectF.top;
                canvas2.translate(f21, f22);
                this.f4542z0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f4542z0.draw(canvas2);
                canvas2.translate(-f21, -f22);
            }
            if (this.f4525j1 && this.f4528l0 != null) {
                PointF pointF = this.P0;
                pointF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f4528l0;
                l lVar = this.R0;
                if (charSequence != null) {
                    float A = A() + this.D0 + this.G0;
                    if (s1.c.o(this) == 0) {
                        pointF.x = bounds.left + A;
                    } else {
                        pointF.x = bounds.right - A;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = lVar.f8785a;
                    Paint.FontMetrics fontMetrics = this.N0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f3);
                }
                rectF.setEmpty();
                if (this.f4528l0 != null) {
                    float A2 = A() + this.D0 + this.G0;
                    float B = B() + this.K0 + this.H0;
                    if (s1.c.o(this) == 0) {
                        rectF.left = bounds.left + A2;
                        rectF.right = bounds.right - B;
                    } else {
                        rectF.left = bounds.left + B;
                        rectF.right = bounds.right - A2;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                ra.d dVar = lVar.f8791g;
                TextPaint textPaint2 = lVar.f8785a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    lVar.f8791g.d(this.L0, textPaint2, lVar.f8786b);
                }
                textPaint2.setTextAlign(align);
                String charSequence2 = this.f4528l0.toString();
                if (!lVar.f8789e) {
                    f10 = lVar.f8787c;
                } else {
                    lVar.a(charSequence2);
                    f10 = lVar.f8787c;
                }
                if (Math.round(f10) > Math.round(rectF.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i11 = save;
                } else {
                    i11 = 0;
                }
                CharSequence charSequence3 = this.f4528l0;
                if (z10 && this.f4523i1 != null) {
                    charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.f4523i1);
                }
                canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
                canvas2 = canvas;
                if (z10) {
                    canvas2.restoreToCount(i11);
                }
            }
            if (e0()) {
                rectF.setEmpty();
                if (e0()) {
                    float f23 = this.K0 + this.J0;
                    if (s1.c.o(this) == 0) {
                        float f24 = bounds.right - f23;
                        rectF.right = f24;
                        rectF.left = f24 - this.f4538v0;
                    } else {
                        float f25 = bounds.left + f23;
                        rectF.left = f25;
                        rectF.right = f25 + this.f4538v0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f26 = this.f4538v0;
                    float f27 = exactCenterY - (f26 / f3);
                    rectF.top = f27;
                    rectF.bottom = f27 + f26;
                }
                float f28 = rectF.left;
                float f29 = rectF.top;
                canvas2.translate(f28, f29);
                this.f4535s0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f4536t0.setBounds(this.f4535s0.getBounds());
                this.f4536t0.jumpToCurrentState();
                this.f4536t0.draw(canvas2);
                canvas2.translate(-f28, -f29);
            }
            if (this.f4511a1 < 255) {
                canvas2.restoreToCount(i10);
            }
        }
    }

    public final boolean e0() {
        if (this.f4534r0 && this.f4535s0 != null) {
            return true;
        }
        return false;
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4511a1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4512b1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f4518g0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f3;
        float A = A() + this.D0 + this.G0;
        String charSequence = this.f4528l0.toString();
        l lVar = this.R0;
        if (!lVar.f8789e) {
            f3 = lVar.f8787c;
        } else {
            lVar.a(charSequence);
            f3 = lVar.f8787c;
        }
        return Math.min(Math.round(B() + f3 + A + this.H0 + this.K0), this.f4527k1);
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f4529l1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f4520h0);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f4518g0, this.f4520h0);
        }
        outline2.setAlpha(this.f4511a1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!D(this.f4514e0) && !D(this.f4516f0) && !D(this.f4522i0)) {
            ra.d dVar = this.R0.f8791g;
            if (dVar == null || (colorStateList = dVar.f11918k) == null || !colorStateList.isStateful()) {
                if ((!this.f4541y0 || this.f4542z0 == null || !this.f4540x0) && !E(this.f4531n0) && !E(this.f4542z0) && !D(this.f4513d1)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i6) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i6);
        if (d0()) {
            onLayoutDirectionChanged |= s1.c.w(this.f4531n0, i6);
        }
        if (c0()) {
            onLayoutDirectionChanged |= s1.c.w(this.f4542z0, i6);
        }
        if (e0()) {
            onLayoutDirectionChanged |= s1.c.w(this.f4535s0, i6);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        boolean onLevelChange = super.onLevelChange(i6);
        if (d0()) {
            onLevelChange |= this.f4531n0.setLevel(i6);
        }
        if (c0()) {
            onLevelChange |= this.f4542z0.setLevel(i6);
        }
        if (e0()) {
            onLevelChange |= this.f4535s0.setLevel(i6);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // ua.i, android.graphics.drawable.Drawable, ma.k
    public final boolean onStateChange(int[] iArr) {
        if (this.f4529l1) {
            super.onStateChange(iArr);
        }
        return G(iArr, this.f4517f1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (this.f4511a1 != i6) {
            this.f4511a1 = i6;
            invalidateSelf();
        }
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4512b1 != colorFilter) {
            this.f4512b1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4513d1 != colorStateList) {
            this.f4513d1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f4515e1 != mode) {
            this.f4515e1 = mode;
            ColorStateList colorStateList = this.f4513d1;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.c1 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (d0()) {
            visible |= this.f4531n0.setVisible(z10, z11);
        }
        if (c0()) {
            visible |= this.f4542z0.setVisible(z10, z11);
        }
        if (e0()) {
            visible |= this.f4535s0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            s1.c.w(drawable, s1.c.o(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f4535s0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f4517f1);
                }
                drawable.setTintList(this.f4537u0);
                return;
            }
            Drawable drawable2 = this.f4531n0;
            if (drawable == drawable2 && this.f4533q0) {
                drawable2.setTintList(this.o0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void z(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (!d0() && !c0()) {
            return;
        }
        float f3 = this.D0 + this.E0;
        if (this.Y0) {
            drawable = this.f4542z0;
        } else {
            drawable = this.f4531n0;
        }
        float f10 = this.f4532p0;
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        if (s1.c.o(this) == 0) {
            float f11 = rect.left + f3;
            rectF.left = f11;
            rectF.right = f11 + f10;
        } else {
            float f12 = rect.right - f3;
            rectF.right = f12;
            rectF.left = f12 - f10;
        }
        if (this.Y0) {
            drawable2 = this.f4542z0;
        } else {
            drawable2 = this.f4531n0;
        }
        float f13 = this.f4532p0;
        if (f13 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && drawable2 != null) {
            f13 = (float) Math.ceil(n.d(this.L0, 24));
            if (drawable2.getIntrinsicHeight() <= f13) {
                f13 = drawable2.getIntrinsicHeight();
            }
        }
        float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + f13;
    }
}
