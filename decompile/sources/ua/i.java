package ua;

import a2.a2;
import a2.e0;
import a2.r1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import com.google.android.gms.internal.measurement.a4;
import com.unity3d.services.UnityAdsConstants;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class i extends Drawable implements m0.b, v {

    /* renamed from: c0, reason: collision with root package name */
    public static final Paint f12995c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final h[] f12996d0;
    public final u[] A;
    public final BitSet B;
    public boolean C;
    public boolean D;
    public final Matrix E;
    public final Path F;
    public final Path G;
    public final RectF H;
    public final RectF I;
    public final Region J;
    public final Region K;
    public final Paint L;
    public final Paint M;
    public final ta.a N;
    public final k7.c O;
    public final r1 P;
    public PorterDuffColorFilter Q;
    public PorterDuffColorFilter R;
    public int S;
    public final RectF T;
    public boolean U;
    public boolean V;
    public m W;
    public d1.f X;
    public final d1.e[] Y;
    public float[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public float[] f12997a0;

    /* renamed from: b0, reason: collision with root package name */
    public e0 f12998b0;

    /* renamed from: x, reason: collision with root package name */
    public final a2 f12999x;

    /* renamed from: y, reason: collision with root package name */
    public g f13000y;

    /* renamed from: z, reason: collision with root package name */
    public final u[] f13001z;

    static {
        Paint paint = new Paint(1);
        f12995c0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f12996d0 = new h[4];
        int i6 = 0;
        while (true) {
            h[] hVarArr = f12996d0;
            if (i6 < hVarArr.length) {
                hVarArr[i6] = new h(i6);
                i6++;
            } else {
                return;
            }
        }
    }

    public i() {
        this(new m());
    }

    public static float c(RectF rectF, m mVar, float[] fArr) {
        if (fArr == null) {
            if (mVar.f(rectF)) {
                return mVar.f13019e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f3 = fArr[0];
            for (int i6 = 1; i6 < fArr.length; i6++) {
                if (fArr[i6] != f3) {
                    return -1.0f;
                }
            }
        }
        if (mVar.e()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void b(RectF rectF, Path path) {
        g gVar = this.f13000y;
        this.P.b(gVar.f12978a, this.Z, gVar.j, rectF, this.O, path);
        if (this.f13000y.f12986i != 1.0f) {
            Matrix matrix = this.E;
            matrix.reset();
            float f3 = this.f13000y.f12986i;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.T, true);
    }

    public final int d(int i6) {
        float f3;
        int i10;
        g gVar = this.f13000y;
        float f10 = gVar.f12990n + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + gVar.f12989m;
        ia.a aVar = gVar.f12980c;
        if (aVar != null && aVar.f6710a && l0.b.d(i6, 255) == aVar.f6713d) {
            if (aVar.f6714e > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int alpha = Color.alpha(i6);
            int u3 = jb.b.u(f3, l0.b.d(i6, 255), aVar.f6711b);
            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i10 = aVar.f6712c) != 0) {
                u3 = l0.b.b(l0.b.d(i10, ia.a.f6709f), u3);
            }
            return l0.b.d(u3, alpha);
        }
        return i6;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.Q;
        Paint paint2 = this.L;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i6 = this.f13000y.f12988l;
        paint2.setAlpha(((i6 + (i6 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.R;
        Paint paint3 = this.M;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f13000y.f12987k);
        int alpha2 = paint3.getAlpha();
        int i10 = this.f13000y.f12988l;
        paint3.setAlpha(((i10 + (i10 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f13000y.f12993q;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            paint = paint2;
        } else {
            boolean z10 = this.C;
            paint = paint2;
            Path path = this.F;
            if (z10) {
                b(h(), path);
                this.C = false;
            }
            g gVar = this.f13000y;
            gVar.getClass();
            if (gVar.f12991o > 0 && !n() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                double d10 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d10)) * this.f13000y.f12992p), (int) (Math.cos(Math.toRadians(d10)) * this.f13000y.f12992p));
                if (!this.U) {
                    e(canvas);
                    canvas.restore();
                } else {
                    RectF rectF = this.T;
                    int width = (int) (rectF.width() - getBounds().width());
                    int height = (int) (rectF.height() - getBounds().height());
                    if (width >= 0 && height >= 0) {
                        Bitmap createBitmap = Bitmap.createBitmap((this.f13000y.f12991o * 2) + ((int) rectF.width()) + width, (this.f13000y.f12991o * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        float f3 = (getBounds().left - this.f13000y.f12991o) - width;
                        float f10 = (getBounds().top - this.f13000y.f12991o) - height;
                        canvas2.translate(-f3, -f10);
                        e(canvas2);
                        canvas.drawBitmap(createBitmap, f3, f10, (Paint) null);
                        createBitmap.recycle();
                        canvas.restore();
                    } else {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                }
            }
            f(canvas, paint, path, this.f13000y.f12978a, this.Z, h());
        }
        if (l()) {
            if (this.D) {
                m mVar = this.f13000y.f12978a;
                l g10 = mVar.g();
                d dVar = mVar.f13019e;
                a2 a2Var = this.f12999x;
                g10.f13007e = a2Var.b(dVar);
                g10.f13008f = a2Var.b(mVar.f13020f);
                g10.f13010h = a2Var.b(mVar.f13022h);
                g10.f13009g = a2Var.b(mVar.f13021g);
                this.W = g10.a();
                float[] fArr = this.Z;
                if (fArr == null) {
                    this.f12997a0 = null;
                } else {
                    if (this.f12997a0 == null) {
                        this.f12997a0 = new float[fArr.length];
                    }
                    float j = j();
                    int i11 = 0;
                    while (true) {
                        float[] fArr2 = this.Z;
                        if (i11 >= fArr2.length) {
                            break;
                        }
                        this.f12997a0[i11] = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr2[i11] - j);
                        i11++;
                    }
                }
                m mVar2 = this.W;
                float[] fArr3 = this.f12997a0;
                float f11 = this.f13000y.j;
                RectF h4 = h();
                RectF rectF2 = this.I;
                rectF2.set(h4);
                float j10 = j();
                rectF2.inset(j10, j10);
                this.P.b(mVar2, fArr3, f11, rectF2, null, this.G);
                this.D = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.B.cardinality() > 0) {
            Log.w("i", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i6 = this.f13000y.f12992p;
        Path path = this.F;
        ta.a aVar = this.N;
        if (i6 != 0) {
            canvas.drawPath(path, aVar.f12700a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            u uVar = this.f13001z[i10];
            int i11 = this.f13000y.f12991o;
            Matrix matrix = u.f13043b;
            uVar.a(matrix, aVar, i11, canvas);
            this.A[i10].a(matrix, aVar, this.f13000y.f12991o, canvas);
        }
        if (this.U) {
            double d10 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d10)) * this.f13000y.f12992p);
            int cos = (int) (Math.cos(Math.toRadians(d10)) * this.f13000y.f12992p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f12995c0);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, m mVar, float[] fArr, RectF rectF) {
        float c10 = c(rectF, mVar, fArr);
        if (c10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f3 = c10 * this.f13000y.j;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void g(Canvas canvas) {
        m mVar = this.W;
        float[] fArr = this.f12997a0;
        RectF h4 = h();
        RectF rectF = this.I;
        rectF.set(h4);
        float j = j();
        rectF.inset(j, j);
        f(canvas, this.M, this.G, mVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f13000y.f12988l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f13000y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f13000y.getClass();
        RectF h4 = h();
        if (h4.isEmpty()) {
            return;
        }
        float c10 = c(h4, this.f13000y.f12978a, this.Z);
        if (c10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            outline.setRoundRect(getBounds(), c10 * this.f13000y.j);
            return;
        }
        boolean z10 = this.C;
        Path path = this.F;
        if (z10) {
            b(h4, path);
            this.C = false;
        }
        a4.o(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f13000y.f12985h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.J;
        region.set(bounds);
        RectF h4 = h();
        Path path = this.F;
        b(h4, path);
        Region region2 = this.K;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.H;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.Z;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF h4 = h();
        m mVar = this.f13000y.f12978a;
        r1 r1Var = this.P;
        r1Var.getClass();
        float a10 = mVar.f13019e.a(h4);
        m mVar2 = this.f13000y.f12978a;
        r1Var.getClass();
        float a11 = mVar2.f13022h.a(h4) + a10;
        m mVar3 = this.f13000y.f12978a;
        r1Var.getClass();
        float a12 = a11 - mVar3.f13021g.a(h4);
        m mVar4 = this.f13000y.f12978a;
        r1Var.getClass();
        return (a12 - mVar4.f13020f.a(h4)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.C = true;
        this.D = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f13000y.f12983f;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.f13000y.getClass();
                ColorStateList colorStateList2 = this.f13000y.f12982e;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f13000y.f12981d;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        y yVar = this.f13000y.f12979b;
                        if (yVar == null || !yVar.d()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final float j() {
        if (l()) {
            return this.M.getStrokeWidth() / 2.0f;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float k() {
        float[] fArr = this.Z;
        if (fArr != null) {
            return fArr[3];
        }
        return this.f13000y.f12978a.f13019e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.f13000y.f12993q;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.M.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        return false;
    }

    public final void m(Context context) {
        this.f13000y.f12980c = new ia.a(context);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f13000y = new g(this.f13000y);
        return this;
    }

    public final boolean n() {
        if (!this.f13000y.f12978a.f(h())) {
            float[] fArr = this.Z;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f3 = fArr[0];
                    for (int i6 = 1; i6 < fArr.length; i6++) {
                        if (fArr[i6] != f3) {
                            break;
                        }
                    }
                }
                if (this.f13000y.f12978a.e()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void o(d1.f fVar) {
        if (this.X != fVar) {
            this.X = fVar;
            int i6 = 0;
            while (true) {
                d1.e[] eVarArr = this.Y;
                if (i6 < eVarArr.length) {
                    if (eVarArr[i6] == null) {
                        eVarArr[i6] = new d1.e(this, f12996d0[i6]);
                    }
                    d1.e eVar = eVarArr[i6];
                    d1.f fVar2 = new d1.f();
                    fVar2.a((float) fVar.f3686b);
                    double d10 = fVar.f3685a;
                    fVar2.b((float) (d10 * d10));
                    eVar.f3682m = fVar2;
                    i6++;
                } else {
                    v(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.C = true;
        this.D = true;
        super.onBoundsChange(rect);
        if (this.f13000y.f12979b != null && !rect.isEmpty()) {
            v(getState(), this.V);
        }
        this.V = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, ma.k
    public boolean onStateChange(int[] iArr) {
        boolean z10 = false;
        if (this.f13000y.f12979b != null) {
            v(iArr, false);
        }
        boolean u3 = u(iArr);
        boolean w10 = w();
        if (u3 || w10) {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(float f3) {
        g gVar = this.f13000y;
        if (gVar.f12990n != f3) {
            gVar.f12990n = f3;
            x();
        }
    }

    public final void q(ColorStateList colorStateList) {
        g gVar = this.f13000y;
        if (gVar.f12981d != colorStateList) {
            gVar.f12981d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f3) {
        g gVar = this.f13000y;
        if (gVar.j != f3) {
            gVar.j = f3;
            this.C = true;
            this.D = true;
            invalidateSelf();
        }
    }

    public final void s() {
        this.N.a(-12303292);
        this.f13000y.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        g gVar = this.f13000y;
        if (gVar.f12988l != i6) {
            gVar.f12988l = i6;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13000y.getClass();
        super.invalidateSelf();
    }

    @Override // ua.v
    public final void setShapeAppearanceModel(m mVar) {
        g gVar = this.f13000y;
        gVar.f12978a = mVar;
        gVar.f12979b = null;
        this.Z = null;
        this.f12997a0 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f13000y.f12983f = colorStateList;
        w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f13000y;
        if (gVar.f12984g != mode) {
            gVar.f12984g = mode;
            w();
            super.invalidateSelf();
        }
    }

    public final void t(y yVar) {
        g gVar = this.f13000y;
        if (gVar.f12979b != yVar) {
            gVar.f12979b = yVar;
            v(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean u(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f13000y.f12981d != null && color2 != (colorForState2 = this.f13000y.f12981d.getColorForState(iArr, (color2 = (paint2 = this.L).getColor())))) {
            paint2.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f13000y.f12982e != null && color != (colorForState = this.f13000y.f12982e.getColorForState(iArr, (color = (paint = this.M).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z10;
    }

    public final void v(int[] iArr, boolean z10) {
        boolean z11;
        m a10;
        d dVar;
        int i6;
        RectF h4 = h();
        if (this.f13000y.f12979b != null && !h4.isEmpty()) {
            if (this.X == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            if (this.Z == null) {
                this.Z = new float[4];
            }
            y yVar = this.f13000y.f12979b;
            m[] mVarArr = yVar.f13060d;
            int i10 = yVar.f13057a;
            int[][] iArr2 = yVar.f13059c;
            w wVar = yVar.f13064h;
            w wVar2 = yVar.f13063g;
            w wVar3 = yVar.f13062f;
            w wVar4 = yVar.f13061e;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 < 0) {
                int[] iArr3 = StateSet.WILD_CARD;
                int i12 = 0;
                while (true) {
                    if (i12 < i10) {
                        if (StateSet.stateSetMatches(iArr2[i12], iArr3)) {
                            i6 = i12;
                            break;
                        }
                        i12++;
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                i11 = i6;
            }
            if (wVar4 == null && wVar3 == null && wVar2 == null && wVar == null) {
                a10 = mVarArr[i11];
            } else {
                l g10 = mVarArr[i11].g();
                if (wVar4 != null) {
                    g10.f13007e = wVar4.c(iArr);
                }
                if (wVar3 != null) {
                    g10.f13008f = wVar3.c(iArr);
                }
                if (wVar2 != null) {
                    g10.f13010h = wVar2.c(iArr);
                }
                if (wVar != null) {
                    g10.f13009g = wVar.c(iArr);
                }
                a10 = g10.a();
            }
            for (int i13 = 0; i13 < 4; i13++) {
                this.P.getClass();
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            dVar = a10.f13020f;
                        } else {
                            dVar = a10.f13019e;
                        }
                    } else {
                        dVar = a10.f13022h;
                    }
                } else {
                    dVar = a10.f13021g;
                }
                float a11 = dVar.a(h4);
                if (z12) {
                    this.Z[i13] = a11;
                }
                d1.e[] eVarArr = this.Y;
                d1.e eVar = eVarArr[i13];
                if (eVar != null) {
                    eVar.a(a11);
                    if (z12) {
                        eVarArr[i13].d();
                    }
                }
            }
            if (z12) {
                invalidateSelf();
            }
        }
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.Q;
        PorterDuffColorFilter porterDuffColorFilter3 = this.R;
        g gVar = this.f13000y;
        ColorStateList colorStateList = gVar.f12983f;
        PorterDuff.Mode mode = gVar.f12984g;
        if (colorStateList != null && mode != null) {
            int d10 = d(colorStateList.getColorForState(getState(), 0));
            this.S = d10;
            porterDuffColorFilter = new PorterDuffColorFilter(d10, mode);
        } else {
            int color = this.L.getColor();
            int d11 = d(color);
            this.S = d11;
            if (d11 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(d11, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.Q = porterDuffColorFilter;
        this.f13000y.getClass();
        this.R = null;
        this.f13000y.getClass();
        if (!Objects.equals(porterDuffColorFilter2, this.Q) || !Objects.equals(porterDuffColorFilter3, this.R)) {
            return true;
        }
        return false;
    }

    public final void x() {
        g gVar = this.f13000y;
        float f3 = gVar.f12990n + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        gVar.f12991o = (int) Math.ceil(0.75f * f3);
        this.f13000y.f12992p = (int) Math.ceil(f3 * 0.25f);
        w();
        super.invalidateSelf();
    }

    public i(Context context, AttributeSet attributeSet, int i6, int i10) {
        this(m.c(context, attributeSet, i6, i10).a());
    }

    public i(m mVar) {
        this(new g(mVar));
    }

    public i(g gVar) {
        r1 r1Var;
        this.f12999x = new a2(this, 25);
        this.f13001z = new u[4];
        this.A = new u[4];
        this.B = new BitSet(8);
        this.E = new Matrix();
        this.F = new Path();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new Region();
        this.K = new Region();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.N = new ta.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            r1Var = n.f13026a;
        } else {
            r1Var = new r1();
        }
        this.P = r1Var;
        this.T = new RectF();
        this.U = true;
        this.V = true;
        this.Y = new d1.e[4];
        this.f13000y = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        u(getState());
        this.O = new k7.c(this, 28);
    }
}
