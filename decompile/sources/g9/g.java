package g9;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import o9.m;
import o9.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f5766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f5767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RippleDrawable f5768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f5769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RippleDrawable f5770e;
    public boolean f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5772h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public StateListAnimator f5775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Animator f5776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q8.d f5777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q8.d f5778o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5780q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f5782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a9.g f5783t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final o1.a f5764y = q8.a.f10946c;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f5765z = p8.b.motionDurationLong2;
    public static final int A = p8.b.motionEasingEmphasizedInterpolator;
    public static final int B = p8.b.motionDurationMedium1;
    public static final int C = p8.b.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] D = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] E = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] F = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] G = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] H = {R.attr.state_enabled};
    public static final int[] I = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5771g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f5779p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5781r = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f5784u = new Rect();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f5785v = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f5786w = new RectF();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Matrix f5787x = new Matrix();

    public g(FloatingActionButton floatingActionButton, a9.g gVar) {
        this.f5782s = floatingActionButton;
        this.f5783t = gVar;
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f5782s.getDrawable();
        if (drawable == null || this.f5780q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f5785v;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f4 = this.f5780q;
        RectF rectF2 = this.f5786w;
        rectF2.set(0.0f, 0.0f, f4, f4);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f10 = this.f5780q / 2.0f;
        matrix.postScale(f, f, f10, f10);
    }

    public final AnimatorSet b(q8.d dVar, float f, float f4, float f10) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.f5782s;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        dVar.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f4);
        dVar.d("scale").a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new f5.g(1));
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f4);
        dVar.d("scale").a(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new f5.g(1));
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f5787x;
        a(f10, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new q8.c(), new e(this), new Matrix(matrix));
        dVar.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        a.a.w(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f, final float f4, final float f10, int i, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f5782s;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f11 = this.f5779p;
        final Matrix matrix = new Matrix(this.f5787x);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g9.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g gVar = this.f5750a;
                gVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButton floatingActionButton2 = gVar.f5782s;
                floatingActionButton2.setAlpha(q8.a.b(alpha, f, 0.0f, 0.2f, fFloatValue));
                float f12 = scaleX;
                float f13 = f4;
                floatingActionButton2.setScaleX(q8.a.a(f12, f13, fFloatValue));
                floatingActionButton2.setScaleY(q8.a.a(scaleY, f13, fFloatValue));
                float f14 = f11;
                float f15 = f10;
                gVar.f5779p = q8.a.a(f14, f15, fFloatValue);
                float fA = q8.a.a(f14, f15, fFloatValue);
                Matrix matrix2 = matrix;
                gVar.a(fA, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        a.a.w(animatorSet, arrayList);
        animatorSet.setDuration(u1.c.D(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(p8.g.material_motion_duration_long_1)));
        animatorSet.setInterpolator(u1.c.E(floatingActionButton.getContext(), i10, q8.a.f10945b));
        return animatorSet;
    }

    public final AnimatorSet d(float f, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.f5782s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f4).setDuration(100L));
        animatorSet.setInterpolator(f5764y);
        return animatorSet;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(float f, float f4, float f10) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f5782s;
        if (floatingActionButton.getStateListAnimator() == this.f5775l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(D, d(f, f10));
            stateListAnimator.addState(E, d(f, f4));
            stateListAnimator.addState(F, d(f, f4));
            stateListAnimator.addState(G, d(f, f4));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f5764y);
            stateListAnimator.addState(H, animatorSet);
            stateListAnimator.addState(I, d(0.0f, 0.0f));
            this.f5775l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.f5783t.f273w).F || (this.f && floatingActionButton.getSizeDimension() < this.f5774k)) {
            h();
        }
    }

    public final void g(m mVar) {
        this.f5766a = mVar;
        f fVar = this.f5767b;
        if (fVar != null) {
            fVar.setShapeAppearanceModel(mVar);
        }
        Drawable.Callback callback = this.f5768c;
        if (callback instanceof w) {
            ((w) callback).setShapeAppearanceModel(mVar);
        }
        a aVar = this.f5769d;
        if (aVar != null) {
            aVar.f5748o = mVar;
            aVar.invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r10 = this;
            a9.g r0 = r10.f5783t
            java.lang.Object r1 = r0.f273w
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            java.lang.Object r2 = r0.f273w
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            boolean r1 = r1.F
            android.graphics.Rect r3 = r10.f5784u
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r10.f5782s
            r5 = 0
            if (r1 == 0) goto L4c
            boolean r1 = r10.f
            if (r1 == 0) goto L24
            int r1 = r10.f5774k
            int r6 = r4.getSizeDimension()
            int r1 = r1 - r6
            int r1 = r1 / 2
            int r5 = java.lang.Math.max(r1, r5)
        L24:
            boolean r1 = r10.f5771g
            if (r1 == 0) goto L30
            float r1 = r4.getElevation()
            float r6 = r10.f5773j
            float r1 = r1 + r6
            goto L31
        L30:
            r1 = 0
        L31:
            double r6 = (double) r1
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r6 = java.lang.Math.max(r5, r6)
            r7 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r7
            double r7 = (double) r1
            double r7 = java.lang.Math.ceil(r7)
            int r1 = (int) r7
            int r1 = java.lang.Math.max(r5, r1)
            r3.set(r6, r1, r6, r1)
            goto L66
        L4c:
            boolean r1 = r10.f
            if (r1 == 0) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r10.f5774k
            if (r1 >= r6) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r6 - r1
            int r6 = r6 / 2
            r3.set(r6, r6, r6, r6)
            goto L66
        L63:
            r3.set(r5, r5, r5, r5)
        L66:
            android.graphics.drawable.RippleDrawable r1 = r10.f5770e
            java.lang.String r5 = "Didn't initialize content background"
            u1.c.g(r1, r5)
            java.lang.Object r0 = r0.f273w
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.F
            if (r0 != 0) goto L8a
            boolean r0 = r10.f
            if (r0 == 0) goto L82
            int r0 = r4.getSizeDimension()
            int r1 = r10.f5774k
            if (r0 >= r1) goto L82
            goto L8a
        L82:
            android.graphics.drawable.RippleDrawable r0 = r10.f5770e
            if (r0 == 0) goto L9c
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r0)
            goto L9c
        L8a:
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.RippleDrawable r5 = r10.f5770e
            int r6 = r3.left
            int r7 = r3.top
            int r8 = r3.right
            int r9 = r3.bottom
            r4.<init>(r5, r6, r7, r8, r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r4)
        L9c:
            int r0 = r3.left
            int r1 = r3.top
            int r4 = r3.right
            int r3 = r3.bottom
            android.graphics.Rect r5 = r2.G
            r5.set(r0, r1, r4, r3)
            int r5 = r2.D
            int r0 = r0 + r5
            int r1 = r1 + r5
            int r4 = r4 + r5
            int r3 = r3 + r5
            r2.setPadding(r0, r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.g.h():void");
    }

    public final void f() {
    }
}
