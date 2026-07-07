package fd;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.lifecycle.d1;
import androidx.media3.ui.PlayerView;
import com.playfy.tv.activities.PlayerActivity;
import com.unity3d.services.UnityAdsConstants;
import gf.a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f5216x;

    public v(PlayerActivity playerActivity) {
        this.f5216x = playerActivity;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        kotlin.jvm.internal.k.e(e10, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f3, float f10) {
        float f11;
        float f12;
        kotlin.jvm.internal.k.e(e22, "e2");
        bf.o[] oVarArr = PlayerActivity.V;
        PlayerActivity playerActivity = this.f5216x;
        if (!playerActivity.b0().isSelected() && playerActivity.a0().isSelected()) {
            float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (motionEvent != null) {
                f11 = motionEvent.getY();
            } else {
                f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (motionEvent != null) {
                f12 = motionEvent.getX();
            } else {
                f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            PlayerView playerView = playerActivity.Y().j;
            if (f11 >= ((int) (64 * playerActivity.getResources().getDisplayMetrics().density)) && f11 <= playerView.getMeasuredHeight() - r4 && Math.abs(f10 / f3) >= 2.0f) {
                float measuredHeight = f10 / (playerView.getMeasuredHeight() * 0.66f);
                if (((int) f12) > playerView.getMeasuredWidth() / 2) {
                    int streamVolume = playerActivity.X().getStreamVolume(3);
                    if (playerActivity.L == -1.0f) {
                        playerActivity.L = streamVolume;
                    }
                    int streamMaxVolume = playerActivity.X().getStreamMaxVolume(3);
                    float f14 = playerActivity.L + (measuredHeight * streamMaxVolume);
                    playerActivity.L = f14;
                    int d10 = android.support.v4.media.session.b.d((int) f14, streamMaxVolume);
                    playerActivity.X().setStreamVolume(3, d10, 0);
                    int i6 = (int) ((d10 / streamMaxVolume) * 100.0d);
                    a2 a2Var = playerActivity.M;
                    if (a2Var != null) {
                        a2Var.d(null);
                    }
                    playerActivity.M = gf.f0.w(d1.e(playerActivity), null, new y(true, playerActivity, i6, null), 3);
                    return true;
                }
                WindowManager.LayoutParams attributes = playerActivity.getWindow().getAttributes();
                float f15 = attributes.screenBrightness + measuredHeight;
                if (f15 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f13 = 1.0f;
                    if (f15 <= 1.0f) {
                        f13 = f15;
                    }
                }
                attributes.screenBrightness = f13;
                playerActivity.getWindow().setAttributes(attributes);
                int l10 = a8.b.l(f13 * 100);
                a2 a2Var2 = playerActivity.M;
                if (a2Var2 != null) {
                    a2Var2.d(null);
                }
                playerActivity.M = gf.f0.w(d1.e(playerActivity), null, new y(false, playerActivity, l10, null), 3);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        kotlin.jvm.internal.k.e(e10, "e");
        bf.o[] oVarArr = PlayerActivity.V;
        PlayerView playerView = this.f5216x.Y().j;
        k4.q qVar = playerView.I;
        if (qVar != null && qVar.j()) {
            playerView.d();
            return true;
        }
        playerView.i(playerView.h());
        return true;
    }
}
