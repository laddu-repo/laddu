package aa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import b7.w;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.material.button.MaterialButton;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import pa.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends c9.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f643d;

    public /* synthetic */ a(int i6) {
        this.f643d = i6;
    }

    @Override // c9.a
    public final float i(Object obj) {
        float displayedWidthIncrease;
        switch (this.f643d) {
            case 0:
                displayedWidthIncrease = ((MaterialButton) obj).getDisplayedWidthIncrease();
                return displayedWidthIncrease;
            default:
                return ((m) obj).N.f10698b * 10000.0f;
        }
    }

    @Override // c9.a
    public final void u(Object obj, float f3) {
        float f10;
        switch (this.f643d) {
            case 0:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f3);
                return;
            default:
                m mVar = (m) obj;
                mVar.N.f10698b = f3 / 10000.0f;
                mVar.invalidateSelf();
                int i6 = (int) f3;
                if (mVar.f10695y.b(true)) {
                    Context context = mVar.f10694x;
                    if (mVar.R == null) {
                        LinearInterpolator linearInterpolator = u9.a.f12953a;
                        mVar.T = j5.u(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        mVar.U = j5.u(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        mVar.R = valueAnimator;
                        valueAnimator.setDuration(500L);
                        mVar.R.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        mVar.R.setInterpolator(null);
                        mVar.R.addUpdateListener(new w(mVar, 5));
                    }
                    float f11 = i6;
                    if (f11 >= 1000.0f && f11 <= 9000.0f) {
                        f10 = 1.0f;
                    } else {
                        f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    if (f10 != mVar.O) {
                        if (mVar.R.isRunning()) {
                            mVar.R.cancel();
                        }
                        mVar.O = f10;
                        if (f10 == 1.0f) {
                            mVar.S = mVar.T;
                            mVar.R.start();
                            return;
                        } else {
                            mVar.S = mVar.U;
                            mVar.R.reverse();
                            return;
                        }
                    }
                    if (!mVar.R.isRunning()) {
                        mVar.N.f10701e = f10;
                        mVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
