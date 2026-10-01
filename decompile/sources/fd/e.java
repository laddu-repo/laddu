package fd;

import android.os.CountDownTimer;
import com.playfy.tv.R;
import com.playfy.tv.activities.FullBannerActivity;
import com.playfy.tv.activities.SponsorActivity;
import com.unity3d.services.UnityAdsConstants;
import kd.m0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5174a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.j f5175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FullBannerActivity fullBannerActivity, long j) {
        super(j, 1000L);
        this.f5175b = fullBannerActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        int i6 = this.f5174a;
        i.j jVar = this.f5175b;
        switch (i6) {
            case 0:
                FullBannerActivity fullBannerActivity = (FullBannerActivity) jVar;
                bf.o[] oVarArr = FullBannerActivity.H;
                fullBannerActivity.T().f3142b.setText(fullBannerActivity.getString(R.string.x_close_emoji));
                fullBannerActivity.T().f3142b.setClickable(true);
                if (((m0) fullBannerActivity.F.getValue()).f7883d > 4 && fullBannerActivity.getLifecycle().b().compareTo(androidx.lifecycle.x.B) >= 0) {
                    fullBannerActivity.U();
                    return;
                }
                return;
            default:
                SponsorActivity sponsorActivity = (SponsorActivity) jVar;
                sponsorActivity.J = 0L;
                sponsorActivity.I = false;
                sponsorActivity.H = true;
                sponsorActivity.V().f3189i.setText(sponsorActivity.getString(R.string.remaining_countdown, 0));
                if (!sponsorActivity.isFinishing()) {
                    sponsorActivity.onAdTimerComplete();
                    return;
                }
                return;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        int i6 = this.f5174a;
        i.j jVar = this.f5175b;
        switch (i6) {
            case 0:
                int i10 = (int) (j / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
                FullBannerActivity fullBannerActivity = (FullBannerActivity) jVar;
                bf.o[] oVarArr = FullBannerActivity.H;
                fullBannerActivity.T().f3142b.setText(String.valueOf(i10));
                fullBannerActivity.T().f3142b.setClickable(false);
                return;
            default:
                SponsorActivity sponsorActivity = (SponsorActivity) jVar;
                sponsorActivity.J = (j / 1000) + 1;
                sponsorActivity.V().f3189i.setText(sponsorActivity.getString(R.string.remaining_countdown, Long.valueOf(sponsorActivity.J)));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j, SponsorActivity sponsorActivity) {
        super(j, 1000L);
        this.f5175b = sponsorActivity;
    }
}
