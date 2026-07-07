package vc;

import android.os.CountDownTimer;
import androidx.media3.decoder.DecoderInputBuffer;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oc.a f13590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j8, oc.a aVar, long j9, int i) {
        super(j8, 60000L);
        this.f13589a = i;
        switch (i) {
            case 1:
                this.f13590b = aVar;
                this.f13591c = j9;
                super(j8, 1000L);
                break;
            default:
                this.f13590b = aVar;
                this.f13591c = j9;
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f13589a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j8 = this.f13591c;
                new b(j8 - jCurrentTimeMillis, this.f13590b, j8, 1).start();
                break;
            case 1:
                oc.a aVar = this.f13590b;
                aVar.A.setVisibility(8);
                aVar.B.setVisibility(8);
                LottieAnimationView lottieAnimationView = aVar.F;
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.animate();
                new b(this.f13591c, aVar).start();
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j8) {
        int i = this.f13589a;
        oc.a aVar = this.f13590b;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                a.E(j8, aVar);
                break;
            case 1:
                aVar.D.setText(String.format(Locale.getDefault(), "Starts in %02d:%02d", Long.valueOf((j8 / 60000) % 60), Long.valueOf((j8 / 1000) % 60)));
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f13591c;
                aVar.D.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Long.valueOf((jCurrentTimeMillis / 3600000) % 24), Long.valueOf((jCurrentTimeMillis / 60000) % 60), Long.valueOf((jCurrentTimeMillis / 1000) % 60)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j8, oc.a aVar) {
        super(Long.MAX_VALUE, 1000L);
        this.f13589a = 2;
        this.f13591c = j8;
        this.f13590b = aVar;
    }

    private final void a() {
    }
}
