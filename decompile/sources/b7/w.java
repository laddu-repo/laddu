package b7;

import android.animation.ValueAnimator;
import androidx.media3.ui.DefaultTimeBar;
import com.playfy.tv.activities.SponsorActivity;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1595b;

    public /* synthetic */ w(Object obj, int i6) {
        this.f1594a = i6;
        this.f1595b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator anim) {
        int i6 = this.f1594a;
        Object obj = this.f1595b;
        switch (i6) {
            case 0:
                y yVar = (y) obj;
                a aVar = yVar.f1607i0;
                if (aVar == null) {
                    aVar = a.f1481x;
                }
                if (aVar == a.f1482y) {
                    yVar.invalidateSelf();
                    return;
                }
                j7.b bVar = yVar.L;
                if (bVar != null) {
                    bVar.r(yVar.f1614y.a());
                    return;
                }
                return;
            case 1:
                ba.c cVar = (ba.c) obj;
                cVar.getClass();
                float floatValue = ((Float) anim.getAnimatedValue()).floatValue();
                cVar.j.setAlpha((int) (255.0f * floatValue));
                cVar.f1647x = floatValue;
                return;
            case 2:
                SponsorActivity sponsorActivity = (SponsorActivity) obj;
                fd.i0 i0Var = SponsorActivity.O;
                kotlin.jvm.internal.k.e(anim, "anim");
                Object animatedValue = anim.getAnimatedValue();
                kotlin.jvm.internal.k.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Float) animatedValue).floatValue() + 16.0f;
                sponsorActivity.V().f3187g.setTranslationY(floatValue2);
                sponsorActivity.V().f3186f.setTranslationY(floatValue2);
                return;
            case 3:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                int i10 = DefaultTimeBar.f1073p0;
                defaultTimeBar.getClass();
                defaultTimeBar.f1079f0 = ((Float) anim.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f1088x);
                return;
            case 4:
                ld.k kVar = (ld.k) obj;
                kotlin.jvm.internal.k.e(anim, "animator");
                Object animatedValue2 = anim.getAnimatedValue();
                kotlin.jvm.internal.k.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) animatedValue2).intValue();
                kVar.f8336d.setColorFilter(intValue);
                kVar.f8337e.setTextColor(intValue);
                return;
            case 5:
                pa.m mVar = (pa.m) obj;
                mVar.N.f10701e = mVar.S.getInterpolation(mVar.R.getAnimatedFraction());
                return;
            default:
                za.i iVar = (za.i) obj;
                iVar.getClass();
                iVar.f15271d.setAlpha(((Float) anim.getAnimatedValue()).floatValue());
                return;
        }
    }
}
