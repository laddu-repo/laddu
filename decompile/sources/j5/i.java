package j5;

import androidx.media3.decoder.DecoderInputBuffer;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f6843b;

    public i(LottieAnimationView lottieAnimationView, int i) {
        this.f6842a = i;
        switch (i) {
            case 1:
                this.f6843b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f6843b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // j5.z
    public final void onResult(Object obj) {
        switch (this.f6842a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f6843b.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.B;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    z zVar = lottieAnimationView.A;
                    if (zVar == null) {
                        zVar = LottieAnimationView.L;
                    }
                    zVar.onResult(th);
                    break;
                }
                break;
            default:
                j jVar = (j) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f6843b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(jVar);
                    break;
                }
                break;
        }
    }
}
