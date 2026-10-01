package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import j4.b0;
import java.util.ArrayList;
import jb.b;
import p.l;
import u9.a;
import u9.c;
import u9.e;
import u9.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2821c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f2822d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f2823e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2824f;

    /* renamed from: g, reason: collision with root package name */
    public float f2825g;

    /* renamed from: h, reason: collision with root package name */
    public float f2826h;

    public FabTransformationBehavior() {
        this.f2821c = new Rect();
        this.f2822d = new RectF();
        this.f2823e = new RectF();
        this.f2824f = new int[2];
    }

    public static Pair u(float f3, float f10, boolean z10, b0 b0Var) {
        f d10;
        f d11;
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if ((z10 && f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || (!z10 && f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                d10 = ((e) b0Var.f7158x).d("translationXCurveUpwards");
                d11 = ((e) b0Var.f7158x).d("translationYCurveUpwards");
            } else {
                d10 = ((e) b0Var.f7158x).d("translationXCurveDownwards");
                d11 = ((e) b0Var.f7158x).d("translationYCurveDownwards");
            }
        } else {
            d10 = ((e) b0Var.f7158x).d("translationXLinear");
            d11 = ((e) b0Var.f7158x).d("translationYLinear");
        }
        return new Pair(d10, d11);
    }

    public static float x(b0 b0Var, f fVar, float f3) {
        long j = fVar.f12962a;
        long j10 = fVar.f12963b;
        f d10 = ((e) b0Var.f7158x).d("expansion");
        return a.a(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fVar.b().getInterpolation(((float) (((d10.f12962a + d10.f12963b) + 17) - j)) / ((float) j10)));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, f0.b
    public final boolean b(View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // f0.b
    public final void c(f0.e eVar) {
        if (eVar.f4618h == 0) {
            eVar.f4618h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet t(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator ofFloat;
        char c10;
        float f3;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ViewGroup viewGroup;
        ObjectAnimator ofFloat4;
        b0 z12 = z(view2.getContext(), z10);
        if (z10) {
            this.f2825g = view.getTranslationX();
            this.f2826h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((e) z12.f7158x).d("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float v10 = v(view, view2, (l) z12.f7159y);
        float w10 = w(view, view2, (l) z12.f7159y);
        Pair u3 = u(v10, w10, z10, z12);
        f fVar = (f) u3.first;
        f fVar2 = (f) u3.second;
        RectF rectF = this.f2822d;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-v10);
                view2.setTranslationY(-w10);
            }
            c10 = 0;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Property property = View.TRANSLATION_Y;
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float x10 = x(z12, fVar, -v10);
            float x11 = x(z12, fVar2, -w10);
            Rect rect = this.f2821c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f2823e;
            y(view2, rectF2);
            rectF2.offset(x10, x11);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            c10 = 0;
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -v10);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -w10);
        }
        fVar.a(ofFloat2);
        fVar2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float v11 = v(view, view2, (l) z12.f7159y);
        float w11 = w(view, view2, (l) z12.f7159y);
        Pair u10 = u(v11, w11, z10, z12);
        f fVar3 = (f) u10.first;
        f fVar4 = (f) u10.second;
        Property property2 = View.TRANSLATION_X;
        if (!z10) {
            v11 = this.f2825g;
        }
        float[] fArr = new float[1];
        fArr[c10] = v11;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr);
        Property property3 = View.TRANSLATION_Y;
        if (!z10) {
            w11 = this.f2826h;
        }
        float[] fArr2 = new float[1];
        fArr2[c10] = w11;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, fArr2);
        fVar3.a(ofFloat5);
        fVar4.a(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            if (findViewById != null) {
                if (findViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) findViewById;
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup != null) {
                if (z10) {
                    if (!z11) {
                        c.f12958a.set(viewGroup, Float.valueOf(f3));
                    }
                    c cVar = c.f12958a;
                    float[] fArr3 = new float[1];
                    fArr3[c10] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar, fArr3);
                } else {
                    c cVar2 = c.f12958a;
                    float[] fArr4 = new float[1];
                    fArr4[c10] = f3;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar2, fArr4);
                }
                ((e) z12.f7158x).d("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        b.v(animatorSet, arrayList);
        animatorSet.addListener(new bb.c(z10, view2, view));
        int size = arrayList2.size();
        for (int i6 = 0; i6 < size; i6++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i6));
        }
        return animatorSet;
    }

    public final float v(View view, View view2, l lVar) {
        RectF rectF = this.f2822d;
        y(view, rectF);
        rectF.offset(this.f2825g, this.f2826h);
        RectF rectF2 = this.f2823e;
        y(view2, rectF2);
        lVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float w(View view, View view2, l lVar) {
        RectF rectF = this.f2822d;
        y(view, rectF);
        rectF.offset(this.f2825g, this.f2826h);
        RectF rectF2 = this.f2823e;
        y(view2, rectF2);
        lVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f2824f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b0 z(Context context, boolean z10);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2821c = new Rect();
        this.f2822d = new RectF();
        this.f2823e = new RectF();
        this.f2824f = new int[2];
    }
}
