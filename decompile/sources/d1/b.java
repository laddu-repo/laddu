package d1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.unity3d.services.UnityAdsConstants;
import i.l;
import java.util.Random;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3654x = 1;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3655y;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Handler handler;
        switch (this.f3654x) {
            case 0:
                ((Runnable) this.f3655y).run();
                return;
            default:
                Context context = (Context) this.f3655y;
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new l(context, 1), new Random().nextInt(Math.max(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 1)) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
                return;
        }
    }

    public /* synthetic */ b(Runnable runnable) {
        this.f3655y = runnable;
    }
}
