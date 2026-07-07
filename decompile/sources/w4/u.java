package w4;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends p0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final v8.i B;

    /* renamed from: a, reason: collision with root package name */
    public final int f14024a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14025b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f14026c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f14027d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14028e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14029f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f14030g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f14031h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14032i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f14033k;

    /* renamed from: l, reason: collision with root package name */
    public int f14034l;

    /* renamed from: m, reason: collision with root package name */
    public float f14035m;

    /* renamed from: n, reason: collision with root package name */
    public int f14036n;

    /* renamed from: o, reason: collision with root package name */
    public int f14037o;

    /* renamed from: p, reason: collision with root package name */
    public float f14038p;
    public final RecyclerView s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f14047z;

    /* renamed from: q, reason: collision with root package name */
    public int f14039q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f14040r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14041t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14042u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f14043v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f14044w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f14045x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f14046y = new int[2];

    public u(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i6, int i10, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.f14047z = ofFloat;
        this.A = 0;
        v8.i iVar = new v8.i(this, 3);
        this.B = iVar;
        s sVar = new s(this);
        this.f14026c = stateListDrawable;
        this.f14027d = drawable;
        this.f14030g = stateListDrawable2;
        this.f14031h = drawable2;
        this.f14028e = Math.max(i6, stateListDrawable.getIntrinsicWidth());
        this.f14029f = Math.max(i6, drawable.getIntrinsicWidth());
        this.f14032i = Math.max(i6, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i6, drawable2.getIntrinsicWidth());
        this.f14024a = i10;
        this.f14025b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new bb.d(this));
        ofFloat.addUpdateListener(new t(this, 0));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.Z(this);
            RecyclerView recyclerView3 = this.s;
            recyclerView3.N.remove(this);
            if (recyclerView3.O == this) {
                recyclerView3.O = null;
            }
            ArrayList arrayList = this.s.F0;
            if (arrayList != null) {
                arrayList.remove(sVar);
            }
            this.s.removeCallbacks(iVar);
        }
        this.s = recyclerView;
        recyclerView.g(this);
        this.s.N.add(this);
        this.s.h(sVar);
    }

    public static int f(float f3, float f10, int[] iArr, int i6, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i6 - i11;
            int i14 = (int) (((f10 - f3) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    @Override // w4.p0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int i6 = this.f14039q;
        RecyclerView recyclerView2 = this.s;
        if (i6 == recyclerView2.getWidth() && this.f14040r == recyclerView2.getHeight()) {
            if (this.A != 0) {
                if (this.f14041t) {
                    int i10 = this.f14039q;
                    int i11 = this.f14028e;
                    int i12 = i10 - i11;
                    int i13 = this.f14034l;
                    int i14 = this.f14033k;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable = this.f14026c;
                    stateListDrawable.setBounds(0, 0, i11, i14);
                    int i16 = this.f14029f;
                    int i17 = this.f14040r;
                    Drawable drawable = this.f14027d;
                    drawable.setBounds(0, 0, i16, i17);
                    WeakHashMap weakHashMap = t0.q0.f12397a;
                    if (recyclerView2.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i11, i15);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i11, -i15);
                    } else {
                        canvas.translate(i12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        drawable.draw(canvas);
                        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i15);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i12, -i15);
                    }
                }
                if (this.f14042u) {
                    int i18 = this.f14040r;
                    int i19 = this.f14032i;
                    int i20 = i18 - i19;
                    int i21 = this.f14037o;
                    int i22 = this.f14036n;
                    int i23 = i21 - (i22 / 2);
                    StateListDrawable stateListDrawable2 = this.f14030g;
                    stateListDrawable2.setBounds(0, 0, i22, i19);
                    int i24 = this.f14039q;
                    int i25 = this.j;
                    Drawable drawable2 = this.f14031h;
                    drawable2.setBounds(0, 0, i24, i25);
                    canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i20);
                    drawable2.draw(canvas);
                    canvas.translate(i23, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i23, -i20);
                    return;
                }
                return;
            }
            return;
        }
        this.f14039q = recyclerView2.getWidth();
        this.f14040r = recyclerView2.getHeight();
        g(0);
    }

    public final boolean d(float f3, float f10) {
        if (f10 >= this.f14040r - this.f14032i) {
            int i6 = this.f14037o;
            int i10 = this.f14036n;
            if (f3 >= i6 - (i10 / 2) && f3 <= (i10 / 2) + i6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e(float f3, float f10) {
        WeakHashMap weakHashMap = t0.q0.f12397a;
        int layoutDirection = this.s.getLayoutDirection();
        int i6 = this.f14028e;
        if (layoutDirection == 1) {
            if (f3 > i6) {
                return false;
            }
        } else if (f3 < this.f14039q - i6) {
            return false;
        }
        int i10 = this.f14034l;
        int i11 = this.f14033k / 2;
        if (f10 >= i10 - i11 && f10 <= i11 + i10) {
            return true;
        }
        return false;
    }

    public final void g(int i6) {
        v8.i iVar = this.B;
        StateListDrawable stateListDrawable = this.f14026c;
        if (i6 == 2 && this.f14043v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(iVar);
        }
        if (i6 == 0) {
            this.s.invalidate();
        } else {
            h();
        }
        if (this.f14043v == 2 && i6 != 2) {
            stateListDrawable.setState(D);
            this.s.removeCallbacks(iVar);
            this.s.postDelayed(iVar, 1200);
        } else if (i6 == 1) {
            this.s.removeCallbacks(iVar);
            this.s.postDelayed(iVar, 1500);
        }
        this.f14043v = i6;
    }

    public final void h() {
        int i6 = this.A;
        ValueAnimator valueAnimator = this.f14047z;
        if (i6 != 0) {
            if (i6 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
