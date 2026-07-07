package w4;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14019b;

    public /* synthetic */ t(Object obj, int i6) {
        this.f14018a = i6;
        this.f14019b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14018a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                u uVar = (u) this.f14019b;
                uVar.f14026c.setAlpha(floatValue);
                uVar.f14027d.setAlpha(floatValue);
                uVar.s.invalidate();
                return;
            case 1:
                ((TabLayout) this.f14019b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 2:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ua.i iVar = ((BottomSheetBehavior) this.f14019b).f2621i;
                if (iVar != null) {
                    iVar.r(floatValue2);
                    return;
                }
                return;
            default:
                ((TextInputLayout) this.f14019b).T0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
