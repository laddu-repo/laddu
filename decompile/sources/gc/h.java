package gc;

import android.widget.TextView;
import androidx.media3.decoder.DecoderInputBuffer;
import com.airbnb.lottie.LottieAnimationView;
import com.livxow.tv.activities.PlayerActivity;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5807v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f5808w;

    public /* synthetic */ h(PlayerActivity playerActivity, int i) {
        this.f5807v = i;
        this.f5808w = playerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5807v;
        PlayerActivity playerActivity = this.f5808w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i10 = PlayerActivity.J0;
                jc.a aVar = playerActivity.X;
                if (aVar != null) {
                    ((TextView) aVar.f7011j).setVisibility(8);
                    ((LottieAnimationView) playerActivity.X.f7009g).setVisibility(0);
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) playerActivity.X.f7009g;
                    lottieAnimationView.I.add(j5.h.A);
                    lottieAnimationView.C.l();
                }
                break;
            case 1:
                playerActivity.f3663y0 = true;
                break;
            case 2:
                playerActivity.Z.g0(playerActivity.f3658t0);
                break;
            case 3:
                playerActivity.Z.g0(playerActivity.f3640a0.f6248g);
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                if (playerActivity.A0) {
                    playerActivity.A();
                }
                break;
            default:
                if (!playerActivity.f3655q0) {
                    vc.a.B(playerActivity);
                } else {
                    vc.a.o(playerActivity);
                }
                break;
        }
    }
}
