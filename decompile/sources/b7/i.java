package b7;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1537a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1538b;

    public i(LottieAnimationView lottieAnimationView, int i6) {
        this.f1537a = i6;
        switch (i6) {
            case 1:
                this.f1538b = new WeakReference(lottieAnimationView);
                return;
            default:
                this.f1538b = new WeakReference(lottieAnimationView);
                return;
        }
    }

    @Override // b7.b0
    public final void onResult(Object obj) {
        switch (this.f1537a) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f1538b.get();
                if (lottieAnimationView != null) {
                    int i6 = lottieAnimationView.D;
                    if (i6 != 0) {
                        lottieAnimationView.setImageResource(i6);
                    }
                    b0 b0Var = lottieAnimationView.C;
                    if (b0Var == null) {
                        b0Var = LottieAnimationView.N;
                    }
                    b0Var.onResult(th);
                    return;
                }
                return;
            default:
                j jVar = (j) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f1538b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(jVar);
                    return;
                }
                return;
        }
    }
}
