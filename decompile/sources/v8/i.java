package v8;

import a2.a2;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.unity3d.services.UnityAdsConstants;
import i4.n1;
import j2.y;
import java.util.WeakHashMap;
import p.t1;
import t0.q0;
import w4.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f13451x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f13452y;

    public /* synthetic */ i(Object obj, int i6) {
        this.f13451x = i6;
        this.f13452y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [sd.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [sd.b, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f13451x;
        Object obj = this.f13452y;
        switch (i6) {
            case 0:
                u8.a aVar = ((j) ((a2) obj).f162y).f13454f;
                aVar.d(aVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 1:
                throw null;
            case 2:
                w0.d dVar = (w0.d) obj;
                t1 t1Var = dVar.f13522z;
                w0.a aVar2 = dVar.f13520x;
                if (dVar.L) {
                    if (dVar.J) {
                        dVar.J = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f13515e = currentAnimationTimeMillis;
                        aVar2.f13517g = -1L;
                        aVar2.f13516f = currentAnimationTimeMillis;
                        aVar2.f13518h = 0.5f;
                    }
                    if ((aVar2.f13517g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f13517g + aVar2.f13519i) || !dVar.e()) {
                        dVar.L = false;
                        return;
                    }
                    if (dVar.K) {
                        dVar.K = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                        t1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f13516f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a10 = aVar2.a(currentAnimationTimeMillis2);
                        long j = currentAnimationTimeMillis2 - aVar2.f13516f;
                        aVar2.f13516f = currentAnimationTimeMillis2;
                        dVar.N.scrollListBy((int) (((float) j) * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * aVar2.f13514d));
                        WeakHashMap weakHashMap = q0.f12397a;
                        t1Var.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 3:
                u uVar = (u) obj;
                ValueAnimator valueAnimator = uVar.f14047z;
                int i10 = uVar.A;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                uVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                valueAnimator.setDuration(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
                valueAnimator.start();
                return;
            case 4:
                ((StaggeredGridLayoutManager) obj).C0();
                return;
            case 5:
                ((ae.e) obj).a(new Object());
                return;
            case 6:
                ((ae.i) obj).a(new Object());
                return;
            case 7:
                ((ae.b) obj).a(null);
                return;
            case 8:
                n1 n1Var = (n1) obj;
                n1Var.f6464c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) n1Var.f6466e;
                a1.f fVar = bottomSheetBehavior.O;
                if (fVar != null && fVar.f()) {
                    n1Var.a(n1Var.f6463b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.D(n1Var.f6463b);
                        return;
                    }
                    return;
                }
            default:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f2796z.D;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
        }
    }

    public i(g gVar, y yVar) {
        this.f13451x = 1;
        this.f13452y = yVar;
    }
}
