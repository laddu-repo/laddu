package o9;

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
import c2.k1;
import java.util.BitSet;
import java.util.Objects;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class i extends Drawable implements w {
    public static final Paint Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h[] f10016a0;
    public boolean A;
    public boolean B;
    public final Matrix C;
    public final Path D;
    public final Path E;
    public final RectF F;
    public final RectF G;
    public final Region H;
    public final Region I;
    public final Paint J;
    public final Paint K;
    public final n9.a L;
    public final ka.c M;
    public final k1 N;
    public PorterDuffColorFilter O;
    public PorterDuffColorFilter P;
    public final RectF Q;
    public boolean R;
    public boolean S;
    public m T;
    public i1.g U;
    public final i1.f[] V;
    public float[] W;
    public float[] X;
    public pa.a Y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k4 f10017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f10018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u[] f10019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u[] f10020y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final BitSet f10021z;

    static {
        Paint paint = new Paint(1);
        Z = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f10016a0 = new h[4];
        int i = 0;
        while (true) {
            h[] hVarArr = f10016a0;
            if (i >= hVarArr.length) {
                return;
            }
            hVarArr[i] = new h(i);
            i++;
        }
    }

    public i() {
        this(new m());
    }

    public static float c(RectF rectF, m mVar, float[] fArr) {
        if (fArr == null) {
            if (mVar.f(rectF)) {
                return mVar.f10038e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
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
        g gVar = this.f10018w;
        this.N.b(gVar.f10000a, this.W, gVar.f10007j, rectF, this.M, path);
        if (this.f10018w.i != 1.0f) {
            Matrix matrix = this.C;
            matrix.reset();
            float f = this.f10018w.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.Q, true);
    }

    public final int d(int i) {
        int i10;
        g gVar = this.f10018w;
        float f = gVar.f10011n + 0.0f + gVar.f10010m;
        e9.a aVar = gVar.f10002c;
        if (aVar == null || !aVar.f4861a || l0.b.d(i, 255) != aVar.f4864d) {
            return i;
        }
        float fMin = (aVar.f4865e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iA = com.bumptech.glide.c.A(fMin, l0.b.d(i, 255), aVar.f4862b);
        if (fMin > 0.0f && (i10 = aVar.f4863c) != 0) {
            iA = l0.b.b(l0.b.d(i10, e9.a.f), iA);
        }
        return l0.b.d(iA, iAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.O;
        Paint paint2 = this.J;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f10018w.f10009l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.P;
        Paint paint3 = this.K;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f10018w.f10008k);
        int alpha2 = paint3.getAlpha();
        int i10 = this.f10018w.f10009l;
        paint3.setAlpha(((i10 + (i10 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f10018w.f10014q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.A;
            paint = paint2;
            Path path = this.D;
            if (z2) {
                b(h(), path);
                this.A = false;
            }
            g gVar = this.f10018w;
            gVar.getClass();
            if (gVar.f10012o > 0 && !n() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                double d10 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d10)) * ((double) this.f10018w.f10013p)), (int) (Math.cos(Math.toRadians(d10)) * ((double) this.f10018w.f10013p)));
                if (this.R) {
                    RectF rectF = this.Q;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f10018w.f10012o * 2) + ((int) rectF.width()) + iWidth, (this.f10018w.f10012o * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f = (getBounds().left - this.f10018w.f10012o) - iWidth;
                    float f4 = (getBounds().top - this.f10018w.f10012o) - iHeight;
                    canvas2.translate(-f, -f4);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.f10018w.f10000a, this.W, h());
        } else {
            paint = paint2;
        }
        if (l()) {
            if (this.B) {
                m mVar = this.f10018w.f10000a;
                l lVarG = mVar.g();
                d dVar = mVar.f10038e;
                k4 k4Var = this.f10017v;
                lVarG.f10027e = k4Var.p(dVar);
                lVarG.f = k4Var.p(mVar.f);
                lVarG.f10029h = k4Var.p(mVar.f10040h);
                lVarG.f10028g = k4Var.p(mVar.f10039g);
                this.T = lVarG.a();
                float[] fArr = this.W;
                if (fArr != null) {
                    if (this.X == null) {
                        this.X = new float[fArr.length];
                    }
                    float fJ = j();
                    int i11 = 0;
                    while (true) {
                        float[] fArr2 = this.W;
                        if (i11 >= fArr2.length) {
                            break;
                        }
                        this.X[i11] = Math.max(0.0f, fArr2[i11] - fJ);
                        i11++;
                    }
                } else {
                    this.X = null;
                }
                m mVar2 = this.T;
                float[] fArr3 = this.X;
                float f10 = this.f10018w.f10007j;
                RectF rectFH = h();
                RectF rectF2 = this.G;
                rectF2.set(rectFH);
                float fJ2 = j();
                rectF2.inset(fJ2, fJ2);
                this.N.b(mVar2, fArr3, f10, rectF2, null, this.E);
                this.B = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f10021z.cardinality() > 0) {
            Log.w("i", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f10018w.f10013p;
        Path path = this.D;
        n9.a aVar = this.L;
        if (i != 0) {
            canvas.drawPath(path, aVar.f9033a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            u uVar = this.f10019x[i10];
            int i11 = this.f10018w.f10012o;
            Matrix matrix = u.f10060b;
            uVar.a(matrix, aVar, i11, canvas);
            this.f10020y[i10].a(matrix, aVar, this.f10018w.f10012o, canvas);
        }
        if (this.R) {
            double d10 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d10)) * ((double) this.f10018w.f10013p));
            int iCos = (int) (Math.cos(Math.toRadians(d10)) * ((double) this.f10018w.f10013p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, Z);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, m mVar, float[] fArr, RectF rectF) {
        float fC = c(rectF, mVar, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fC * this.f10018w.f10007j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void g(Canvas canvas) {
        m mVar = this.T;
        float[] fArr = this.X;
        RectF rectFH = h();
        RectF rectF = this.G;
        rectF.set(rectFH);
        float fJ = j();
        rectF.inset(fJ, fJ);
        f(canvas, this.K, this.E, mVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10018w.f10009l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f10018w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f10018w.getClass();
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.f10018w.f10000a, this.W);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.f10018w.f10007j);
            return;
        }
        boolean z2 = this.A;
        Path path = this.D;
        if (z2) {
            b(rectFH, path);
            this.A = false;
        }
        p4.v.M(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f10018w.f10006h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.H;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.D;
        b(rectFH, path);
        Region region2 = this.I;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.F;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.W;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        m mVar = this.f10018w.f10000a;
        k1 k1Var = this.N;
        k1Var.getClass();
        float fA = mVar.f10038e.a(rectFH);
        m mVar2 = this.f10018w.f10000a;
        k1Var.getClass();
        float fA2 = mVar2.f10040h.a(rectFH) + fA;
        m mVar3 = this.f10018w.f10000a;
        k1Var.getClass();
        float fA3 = fA2 - mVar3.f10039g.a(rectFH);
        m mVar4 = this.f10018w.f10000a;
        k1Var.getClass();
        return (fA3 - mVar4.f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.A = true;
        this.B = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f10018w.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f10018w.getClass();
        ColorStateList colorStateList2 = this.f10018w.f10004e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f10018w.f10003d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        y yVar = this.f10018w.f10001b;
        return yVar != null && yVar.d();
    }

    public final float j() {
        if (l()) {
            return this.K.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.W;
        return fArr != null ? fArr[3] : this.f10018w.f10000a.f10038e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.f10018w.f10014q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.K.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.f10018w.f10002c = new e9.a(context);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f10018w = new g(this.f10018w);
        return this;
    }

    public final boolean n() {
        if (!this.f10018w.f10000a.f(h())) {
            float[] fArr = this.W;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f = fArr[0];
                    for (int i = 1; i < fArr.length; i++) {
                        if (fArr[i] != f) {
                            break;
                        }
                    }
                }
                if (this.f10018w.f10000a.e()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void o(i1.g gVar) {
        if (this.U == gVar) {
            return;
        }
        this.U = gVar;
        int i = 0;
        while (true) {
            i1.f[] fVarArr = this.V;
            if (i >= fVarArr.length) {
                v(getState(), true);
                invalidateSelf();
                return;
            }
            if (fVarArr[i] == null) {
                fVarArr[i] = new i1.f(this, f10016a0[i]);
            }
            i1.f fVar = fVarArr[i];
            i1.g gVar2 = new i1.g();
            float f = (float) gVar.f6343b;
            if (f < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            gVar2.f6343b = f;
            gVar2.f6344c = false;
            double d10 = gVar.f6342a;
            float f4 = (float) (d10 * d10);
            if (f4 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            gVar2.f6342a = Math.sqrt(f4);
            gVar2.f6344c = false;
            fVar.f6339j = gVar2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.A = true;
        this.B = true;
        super.onBoundsChange(rect);
        if (this.f10018w.f10001b != null && !rect.isEmpty()) {
            v(getState(), this.S);
        }
        this.S = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, i9.j
    public boolean onStateChange(int[] iArr) {
        if (this.f10018w.f10001b != null) {
            v(iArr, false);
        }
        boolean z2 = u(iArr) || w();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final void p(float f) {
        g gVar = this.f10018w;
        if (gVar.f10011n != f) {
            gVar.f10011n = f;
            x();
        }
    }

    public final void q(ColorStateList colorStateList) {
        g gVar = this.f10018w;
        if (gVar.f10003d != colorStateList) {
            gVar.f10003d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f) {
        g gVar = this.f10018w;
        if (gVar.f10007j != f) {
            gVar.f10007j = f;
            this.A = true;
            this.B = true;
            invalidateSelf();
        }
    }

    public final void s() {
        this.L.a(-12303292);
        this.f10018w.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        g gVar = this.f10018w;
        if (gVar.f10009l != i) {
            gVar.f10009l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10018w.getClass();
        super.invalidateSelf();
    }

    @Override // o9.w
    public final void setShapeAppearanceModel(m mVar) {
        g gVar = this.f10018w;
        gVar.f10000a = mVar;
        gVar.f10001b = null;
        this.W = null;
        this.X = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f10018w.f = colorStateList;
        w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f10018w;
        if (gVar.f10005g != mode) {
            gVar.f10005g = mode;
            w();
            super.invalidateSelf();
        }
    }

    public final void t(y yVar) {
        g gVar = this.f10018w;
        if (gVar.f10001b != yVar) {
            gVar.f10001b = yVar;
            v(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean u(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f10018w.f10003d == null || color2 == (colorForState2 = this.f10018w.f10003d.getColorForState(iArr, (color2 = (paint2 = this.J).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f10018w.f10004e == null || color == (colorForState = this.f10018w.f10004e.getColorForState(iArr, (color = (paint = this.K).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void v(int[] iArr, boolean z2) {
        m mVarA;
        int i;
        RectF rectFH = h();
        if (this.f10018w.f10001b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z10 = z2 | (this.U == null);
        if (this.W == null) {
            this.W = new float[4];
        }
        y yVar = this.f10018w.f10001b;
        m[] mVarArr = yVar.f10075d;
        int i10 = yVar.f10072a;
        int[][] iArr2 = yVar.f10074c;
        x xVar = yVar.f10078h;
        x xVar2 = yVar.f10077g;
        x xVar3 = yVar.f;
        x xVar4 = yVar.f10076e;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i12 = 0;
            while (true) {
                if (i12 >= i10) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i12], iArr3)) {
                        i = i12;
                        break;
                    }
                    i12++;
                }
            }
            i11 = i;
        }
        if (xVar4 == null && xVar3 == null && xVar2 == null && xVar == null) {
            mVarA = mVarArr[i11];
        } else {
            l lVarG = mVarArr[i11].g();
            if (xVar4 != null) {
                lVarG.f10027e = xVar4.c(iArr);
            }
            if (xVar3 != null) {
                lVarG.f = xVar3.c(iArr);
            }
            if (xVar2 != null) {
                lVarG.f10029h = xVar2.c(iArr);
            }
            if (xVar != null) {
                lVarG.f10028g = xVar.c(iArr);
            }
            mVarA = lVarG.a();
        }
        int i13 = 0;
        while (i13 < 4) {
            this.N.getClass();
            float fA = (i13 != 1 ? i13 != 2 ? i13 != 3 ? mVarA.f : mVarA.f10038e : mVarA.f10040h : mVarA.f10039g).a(rectFH);
            if (z10) {
                this.W[i13] = fA;
            }
            i1.f[] fVarArr = this.V;
            i1.f fVar = fVarArr[i13];
            if (fVar != null) {
                fVar.a(fA);
                if (z10) {
                    fVarArr[i13].d();
                }
            }
            i13++;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.O;
        PorterDuffColorFilter porterDuffColorFilter3 = this.P;
        g gVar = this.f10018w;
        ColorStateList colorStateList = gVar.f;
        PorterDuff.Mode mode = gVar.f10005g;
        if (colorStateList == null || mode == null) {
            int color = this.J.getColor();
            int iD = d(color);
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(d(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.O = porterDuffColorFilter;
        this.f10018w.getClass();
        this.P = null;
        this.f10018w.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.O) && Objects.equals(porterDuffColorFilter3, this.P)) ? false : true;
    }

    public final void x() {
        g gVar = this.f10018w;
        float f = gVar.f10011n + 0.0f;
        gVar.f10012o = (int) Math.ceil(0.75f * f);
        this.f10018w.f10013p = (int) Math.ceil(f * 0.25f);
        w();
        super.invalidateSelf();
    }

    public i(Context context, AttributeSet attributeSet, int i, int i10) {
        this(m.c(context, attributeSet, i, i10).a());
    }

    public i(m mVar) {
        this(new g(mVar));
    }

    public i(g gVar) {
        k1 k1Var;
        this.f10017v = new k4(this);
        this.f10019x = new u[4];
        this.f10020y = new u[4];
        this.f10021z = new BitSet(8);
        this.C = new Matrix();
        this.D = new Path();
        this.E = new Path();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Region();
        this.I = new Region();
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint(1);
        this.K = paint2;
        this.L = new n9.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            k1Var = n.f10044a;
        } else {
            k1Var = new k1();
        }
        this.N = k1Var;
        this.Q = new RectF();
        this.R = true;
        this.S = true;
        this.V = new i1.f[4];
        this.f10018w = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        u(getState());
        this.M = new ka.c(this);
    }
}
