package ka;

import a2.a2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import ua.m;
import ua.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public m f7782a;

    /* renamed from: b, reason: collision with root package name */
    public g f7783b;

    /* renamed from: c, reason: collision with root package name */
    public RippleDrawable f7784c;

    /* renamed from: d, reason: collision with root package name */
    public b f7785d;

    /* renamed from: e, reason: collision with root package name */
    public RippleDrawable f7786e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7787f;

    /* renamed from: h, reason: collision with root package name */
    public float f7789h;

    /* renamed from: i, reason: collision with root package name */
    public float f7790i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public int f7791k;

    /* renamed from: l, reason: collision with root package name */
    public StateListAnimator f7792l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f7793m;

    /* renamed from: n, reason: collision with root package name */
    public u9.e f7794n;

    /* renamed from: o, reason: collision with root package name */
    public u9.e f7795o;

    /* renamed from: q, reason: collision with root package name */
    public int f7797q;
    public final FloatingActionButton s;

    /* renamed from: t, reason: collision with root package name */
    public final a2 f7799t;

    /* renamed from: y, reason: collision with root package name */
    public static final l1.a f7780y = u9.a.f12955c;

    /* renamed from: z, reason: collision with root package name */
    public static final int f7781z = R.attr.motionDurationLong2;
    public static final int A = R.attr.motionEasingEmphasizedInterpolator;
    public static final int B = R.attr.motionDurationMedium1;
    public static final int C = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] D = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_enabled};
    public static final int[] I = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f7788g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f7796p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f7798r = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f7800u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final RectF f7801v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public final RectF f7802w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f7803x = new Matrix();

    public h(FloatingActionButton floatingActionButton, a2 a2Var) {
        this.s = floatingActionButton;
        this.f7799t = a2Var;
    }

    public final void a(float f3, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.s.getDrawable();
        if (drawable != null && this.f7797q != 0) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            RectF rectF = this.f7801v;
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intrinsicWidth, intrinsicHeight);
            float f10 = this.f7797q;
            RectF rectF2 = this.f7802w;
            rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f11 = this.f7797q / 2.0f;
            matrix.postScale(f3, f3, f11, f11);
        }
    }

    public final AnimatorSet b(u9.e eVar, float f3, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f3};
        FloatingActionButton floatingActionButton = this.s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f10);
        eVar.d("scale").a(ofFloat2);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 == 26) {
            ofFloat2.setEvaluator(new f(0));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f10);
        eVar.d("scale").a(ofFloat3);
        if (i6 == 26) {
            ofFloat3.setEvaluator(new f(0));
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f7803x;
        a(f11, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new u9.d(), new e(this), new Matrix(matrix));
        eVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        jb.b.v(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f3, final float f10, final float f11, int i6, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        FloatingActionButton floatingActionButton = this.s;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f12 = this.f7796p;
        final Matrix matrix = new Matrix(this.f7803x);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ka.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h hVar = h.this;
                hVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButton floatingActionButton2 = hVar.s;
                floatingActionButton2.setAlpha(u9.a.b(alpha, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, floatValue));
                float f13 = scaleX;
                float f14 = f10;
                floatingActionButton2.setScaleX(u9.a.a(f13, f14, floatValue));
                floatingActionButton2.setScaleY(u9.a.a(scaleY, f14, floatValue));
                float f15 = f12;
                float f16 = f11;
                hVar.f7796p = u9.a.a(f15, f16, floatValue);
                float a10 = u9.a.a(f15, f16, floatValue);
                Matrix matrix2 = matrix;
                hVar.a(a10, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(ofFloat);
        jb.b.v(animatorSet, arrayList);
        animatorSet.setDuration(j5.t(floatingActionButton.getContext(), i6, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(j5.u(floatingActionButton.getContext(), i10, u9.a.f12954b));
        return animatorSet;
    }

    public final AnimatorSet d(float f3, float f10) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f3};
        FloatingActionButton floatingActionButton = this.s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f10).setDuration(100L));
        animatorSet.setInterpolator(f7780y);
        return animatorSet;
    }

    public final void e(float f3, float f10, float f11) {
        int i6 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.s;
        if (i6 == 21) {
            floatingActionButton.refreshDrawableState();
        } else if (floatingActionButton.getStateListAnimator() == this.f7792l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(D, d(f3, f11));
            stateListAnimator.addState(E, d(f3, f10));
            stateListAnimator.addState(F, d(f3, f10));
            stateListAnimator.addState(G, d(f3, f10));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f3).setDuration(0L));
            if (i6 >= 22 && i6 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f7780y);
            stateListAnimator.addState(H, animatorSet);
            stateListAnimator.addState(I, d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            this.f7792l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (!((FloatingActionButton) this.f7799t.f162y).H && (!this.f7787f || floatingActionButton.getSizeDimension() >= this.f7791k)) {
            return;
        }
        h();
    }

    public final void g(m mVar) {
        this.f7782a = mVar;
        g gVar = this.f7783b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(mVar);
        }
        Drawable.Callback callback = this.f7784c;
        if (callback instanceof v) {
            ((v) callback).setShapeAppearanceModel(mVar);
        }
        b bVar = this.f7785d;
        if (bVar != null) {
            bVar.f7763o = mVar;
            bVar.invalidateSelf();
        }
    }

    public final void h() {
        float f3;
        a2 a2Var = this.f7799t;
        FloatingActionButton floatingActionButton = (FloatingActionButton) a2Var.f162y;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) a2Var.f162y;
        boolean z10 = floatingActionButton.H;
        Rect rect = this.f7800u;
        FloatingActionButton floatingActionButton3 = this.s;
        int i6 = 0;
        if (z10) {
            if (this.f7787f) {
                i6 = Math.max((this.f7791k - floatingActionButton3.getSizeDimension()) / 2, 0);
            }
            if (this.f7788g) {
                f3 = floatingActionButton3.getElevation() + this.j;
            } else {
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int max = Math.max(i6, (int) Math.ceil(f3));
            int max2 = Math.max(i6, (int) Math.ceil(f3 * 1.5f));
            rect.set(max, max2, max, max2);
        } else {
            if (this.f7787f) {
                int sizeDimension = floatingActionButton3.getSizeDimension();
                int i10 = this.f7791k;
                if (sizeDimension < i10) {
                    int sizeDimension2 = (i10 - floatingActionButton3.getSizeDimension()) / 2;
                    rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                }
            }
            rect.set(0, 0, 0, 0);
        }
        j5.e(this.f7786e, "Didn't initialize content background");
        if (!((FloatingActionButton) a2Var.f162y).H && (!this.f7787f || floatingActionButton3.getSizeDimension() >= this.f7791k)) {
            RippleDrawable rippleDrawable = this.f7786e;
            if (rippleDrawable != null) {
                FloatingActionButton.b(floatingActionButton2, rippleDrawable);
            }
        } else {
            FloatingActionButton.b(floatingActionButton2, new InsetDrawable((Drawable) this.f7786e, rect.left, rect.top, rect.right, rect.bottom));
        }
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = rect.right;
        int i14 = rect.bottom;
        floatingActionButton2.I.set(i11, i12, i13, i14);
        int i15 = floatingActionButton2.F;
        floatingActionButton2.setPadding(i11 + i15, i12 + i15, i13 + i15, i14 + i15);
    }

    public final void f() {
    }
}
