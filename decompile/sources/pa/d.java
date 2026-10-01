package pa;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d extends ProgressBar {
    public final int A;
    public a B;
    public boolean C;
    public int D;
    public boolean E;
    public final b F;
    public final b G;
    public final c H;
    public final c I;

    /* renamed from: x, reason: collision with root package name */
    public final e f10630x;

    /* renamed from: y, reason: collision with root package name */
    public int f10631y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10632z;

    /* JADX WARN: Type inference failed for: r9v4, types: [pa.a, java.lang.Object] */
    public d(Context context, AttributeSet attributeSet, int i6, int i10) {
        super(ab.a.a(context, attributeSet, i6, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i6);
        this.C = false;
        this.D = 4;
        this.F = new b(this, 0);
        this.G = new b(this, 1);
        this.H = new c(this, 0);
        this.I = new c(this, 1);
        Context context2 = getContext();
        this.f10630x = a(context2, attributeSet);
        ma.n.a(context2, attributeSet, i6, i10);
        int[] iArr = t9.a.f12676d;
        ma.n.b(context2, attributeSet, iArr, i6, i10, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i6, i10);
        obtainStyledAttributes.getInt(7, -1);
        this.A = Math.min(obtainStyledAttributes.getInt(5, -1), UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        obtainStyledAttributes.recycle();
        this.B = new Object();
        this.f10632z = true;
    }

    private r getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().K;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().K;
    }

    public abstract e a(Context context, AttributeSet attributeSet);

    public final void b() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().L.k(this.H);
        }
    }

    public void c(int i6) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f10631y = i6;
                this.C = true;
                if (getIndeterminateDrawable().isVisible()) {
                    a aVar = this.B;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    aVar.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        getIndeterminateDrawable().L.l();
                        return;
                    }
                }
                this.H.a(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i6);
        if (getProgressDrawable() != null) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    public final boolean d() {
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f10630x.f10640h;
    }

    public int[] getIndicatorColor() {
        return this.f10630x.f10637e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f10630x.f10641i;
    }

    public int getShowAnimationBehavior() {
        return this.f10630x.f10639g;
    }

    public int getTrackColor() {
        return this.f10630x.f10638f;
    }

    public int getTrackCornerRadius() {
        return this.f10630x.f10634b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f10630x.f10635c;
    }

    public int getTrackThickness() {
        return this.f10630x.f10633a;
    }

    public int getWaveAmplitude() {
        return this.f10630x.f10643l;
    }

    public int getWaveSpeed() {
        return this.f10630x.f10644m;
    }

    public int getWavelengthDeterminate() {
        return this.f10630x.j;
    }

    public int getWavelengthIndeterminate() {
        return this.f10630x.f10642k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        m progressDrawable = getProgressDrawable();
        c cVar = this.I;
        if (progressDrawable != null) {
            m progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.D == null) {
                progressDrawable2.D = new ArrayList();
            }
            if (!progressDrawable2.D.contains(cVar)) {
                progressDrawable2.D.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            s indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.D == null) {
                indeterminateDrawable.D = new ArrayList();
            }
            if (!indeterminateDrawable.D.contains(cVar)) {
                indeterminateDrawable.D.add(cVar);
            }
        }
        if (d()) {
            if (this.A > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.G);
        removeCallbacks(this.F);
        ((o) getCurrentDrawable()).d(false, false, false);
        s indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.I;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(cVar);
            getIndeterminateDrawable().L.o();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i6, int i10) {
        int f3;
        int e10;
        try {
            r currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            if (currentDrawingDelegate.f() < 0) {
                f3 = View.getDefaultSize(getSuggestedMinimumWidth(), i6);
            } else {
                f3 = currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight();
            }
            if (currentDrawingDelegate.e() < 0) {
                e10 = View.getDefaultSize(getSuggestedMinimumHeight(), i10);
            } else {
                e10 = currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(f3, e10);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i6) {
        boolean z10;
        super.onVisibilityChanged(view, i6);
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f10632z) {
            return;
        }
        ((o) getCurrentDrawable()).d(d(), false, z10);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        if (!this.f10632z) {
            return;
        }
        ((o) getCurrentDrawable()).d(d(), false, false);
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.B = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f10696z = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f10696z = aVar;
        }
    }

    public void setHideAnimationBehavior(int i6) {
        this.f10630x.f10640h = i6;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            o oVar = (o) getCurrentDrawable();
            if (oVar != null) {
                oVar.d(false, false, false);
            }
            super.setIndeterminate(z10);
            o oVar2 = (o) getCurrentDrawable();
            if (oVar2 != null) {
                oVar2.d(d(), false, false);
            }
            if ((oVar2 instanceof s) && d()) {
                ((s) oVar2).L.n();
            }
            this.C = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f3) {
        e eVar = this.f10630x;
        if (eVar.f10645n != f3) {
            eVar.f10645n = f3;
            getIndeterminateDrawable().L.i();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof s) {
            ((o) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (!this.E) {
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{jb.b.n(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f10630x.f10637e = iArr;
            getIndeterminateDrawable().L.i();
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int i6) {
        e eVar = this.f10630x;
        if (eVar.f10641i != i6) {
            eVar.f10641i = i6;
            eVar.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i6) {
        if (isIndeterminate()) {
            return;
        }
        c(i6);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof m) {
            m mVar = (m) drawable;
            mVar.d(false, false, false);
            super.setProgressDrawable(mVar);
            mVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (!this.E) {
            super.setProgressDrawable(drawable);
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
    }

    public void setShowAnimationBehavior(int i6) {
        this.f10630x.f10639g = i6;
        invalidate();
    }

    public void setTrackColor(int i6) {
        e eVar = this.f10630x;
        if (eVar.f10638f != i6) {
            eVar.f10638f = i6;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i6) {
        e eVar = this.f10630x;
        if (eVar.f10634b != i6) {
            eVar.f10634b = Math.min(i6, eVar.f10633a / 2);
            eVar.f10636d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f3) {
        e eVar = this.f10630x;
        if (eVar.f10635c != f3) {
            eVar.f10635c = Math.min(f3, 0.5f);
            eVar.f10636d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i6) {
        e eVar = this.f10630x;
        if (eVar.f10633a != i6) {
            eVar.f10633a = i6;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i6) {
        if (i6 != 0 && i6 != 4 && i6 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.D = i6;
    }

    public void setWaveAmplitude(int i6) {
        e eVar = this.f10630x;
        if (eVar.f10643l != i6) {
            eVar.f10643l = Math.abs(i6);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i6) {
        boolean z10;
        e eVar = this.f10630x;
        eVar.f10644m = i6;
        m progressDrawable = getProgressDrawable();
        if (eVar.f10644m != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ValueAnimator valueAnimator = progressDrawable.Q;
        if (z10 && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else if (!z10 && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i6) {
        setWavelengthDeterminate(i6);
        setWavelengthIndeterminate(i6);
    }

    public void setWavelengthDeterminate(int i6) {
        e eVar = this.f10630x;
        if (eVar.j != i6) {
            eVar.j = Math.abs(i6);
            if (!isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public void setWavelengthIndeterminate(int i6) {
        e eVar = this.f10630x;
        if (eVar.f10642k != i6) {
            eVar.f10642k = Math.abs(i6);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public s getIndeterminateDrawable() {
        return (s) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public m getProgressDrawable() {
        return (m) super.getProgressDrawable();
    }
}
