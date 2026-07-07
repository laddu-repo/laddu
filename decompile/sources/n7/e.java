package n7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import b7.j;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends ValueAnimator implements Choreographer.FrameCallback {
    public j I;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet f9095x = new CopyOnWriteArraySet();

    /* renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArraySet f9096y = new CopyOnWriteArraySet();

    /* renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArraySet f9097z = new CopyOnWriteArraySet();
    public float A = 1.0f;
    public boolean B = false;
    public long C = 0;
    public float D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public int F = 0;
    public float G = -2.1474836E9f;
    public float H = 2.1474836E9f;
    public boolean J = false;
    public boolean K = false;

    public final float a() {
        j jVar = this.I;
        if (jVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f3 = this.E;
        float f10 = jVar.f1552l;
        return (f3 - f10) / (jVar.f1553m - f10);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f9096y.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f9097z.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f9095x.add(animatorUpdateListener);
    }

    public final float b() {
        j jVar = this.I;
        if (jVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f3 = this.H;
        if (f3 == 2.1474836E9f) {
            return jVar.f1553m;
        }
        return f3;
    }

    public final float c() {
        j jVar = this.I;
        if (jVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f3 = this.G;
        if (f3 == -2.1474836E9f) {
            return jVar.f1552l;
        }
        return f3;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f9096y.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    public final boolean d() {
        if (this.A < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        return false;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z10;
        float c10;
        float b10;
        if (this.J) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        j jVar = this.I;
        if (jVar != null && this.J) {
            long j10 = this.C;
            long j11 = 0;
            if (j10 != 0) {
                j11 = j - j10;
            }
            float abs = ((float) j11) / ((1.0E9f / jVar.f1554n) / Math.abs(this.A));
            float f3 = this.D;
            if (d()) {
                abs = -abs;
            }
            float f10 = f3 + abs;
            float c11 = c();
            float b11 = b();
            PointF pointF = g.f9099a;
            if (f10 >= c11 && f10 <= b11) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = this.D;
            float b12 = g.b(f10, c(), b());
            this.D = b12;
            if (this.K) {
                b12 = (float) Math.floor(b12);
            }
            this.E = b12;
            this.C = j;
            if (!z10) {
                if (getRepeatCount() != -1 && this.F >= getRepeatCount()) {
                    if (this.A < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b10 = c();
                    } else {
                        b10 = b();
                    }
                    this.D = b10;
                    this.E = b10;
                    g(true);
                    if (!this.K || this.D != f11) {
                        f();
                    }
                    e(d());
                } else {
                    if (getRepeatMode() == 2) {
                        this.B = !this.B;
                        this.A = -this.A;
                    } else {
                        if (d()) {
                            c10 = b();
                        } else {
                            c10 = c();
                        }
                        this.D = c10;
                        this.E = c10;
                    }
                    this.C = j;
                    if (!this.K || this.D != f11) {
                        f();
                    }
                    Iterator it = this.f9096y.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.F++;
                }
            } else if (!this.K || this.D != f11) {
                f();
            }
            if (this.I != null) {
                float f12 = this.E;
                if (f12 < this.G || f12 > this.H) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.G), Float.valueOf(this.H), Float.valueOf(this.E)));
                }
            }
        }
    }

    public final void e(boolean z10) {
        Iterator it = this.f9096y.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void f() {
        Iterator it = this.f9095x.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.J = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float c10;
        float b10;
        float c11;
        if (this.I == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (d()) {
            c10 = b() - this.E;
            b10 = b();
            c11 = c();
        } else {
            c10 = this.E - c();
            b10 = b();
            c11 = c();
        }
        return c10 / (b10 - c11);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.I == null) {
            return 0L;
        }
        return r0.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f3) {
        if (this.D == f3) {
            return;
        }
        float b10 = g.b(f3, c(), b());
        this.D = b10;
        if (this.K) {
            b10 = (float) Math.floor(b10);
        }
        this.E = b10;
        this.C = 0L;
        f();
    }

    public final void i(float f3, float f10) {
        float f11;
        float f12;
        if (f3 <= f10) {
            j jVar = this.I;
            if (jVar == null) {
                f11 = -3.4028235E38f;
            } else {
                f11 = jVar.f1552l;
            }
            if (jVar == null) {
                f12 = Float.MAX_VALUE;
            } else {
                f12 = jVar.f1553m;
            }
            float b10 = g.b(f3, f11, f12);
            float b11 = g.b(f10, f11, f12);
            if (b10 == this.G && b11 == this.H) {
                return;
            }
            this.G = b10;
            this.H = b11;
            h((int) g.b(this.E, b10, b11));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f3 + ") must be <= maxFrame (" + f10 + ")");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.J;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f9096y.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f9095x.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f9096y.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f9097z.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f9095x.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i6) {
        super.setRepeatMode(i6);
        if (i6 != 2 && this.B) {
            this.B = false;
            this.A = -this.A;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
