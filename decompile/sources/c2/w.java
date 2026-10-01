package c2;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.UserManager;
import com.playfy.tv.activities.PlayerActivity;
import com.unity3d.services.core.request.CancelableThreadPoolExecutor;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern g(int i6, int i10) {
        return new MediaCodec.CryptoInfo.Pattern(i6, i10);
    }

    public static /* bridge */ /* synthetic */ Spliterator l(db.f0 f0Var) {
        return Spliterators.spliterator(f0Var, 1296);
    }

    public static /* bridge */ /* synthetic */ void r(AudioTrack audioTrack, e0 e0Var, Handler handler) {
        audioTrack.addOnRoutingChangedListener(e0Var, handler);
    }

    public static /* synthetic */ void v(CancelableThreadPoolExecutor cancelableThreadPoolExecutor) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || cancelableThreadPoolExecutor != ForkJoinPool.commonPool()) && !(isTerminated = cancelableThreadPoolExecutor.isTerminated())) {
            cancelableThreadPoolExecutor.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = cancelableThreadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        cancelableThreadPoolExecutor.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void w(hb.z zVar) {
        boolean isTerminated;
        ExecutorService executorService = zVar.f6041x;
        if ((Build.VERSION.SDK_INT <= 23 || zVar != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            zVar.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        zVar.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void x(hb.c0 c0Var) {
        boolean isTerminated;
        ExecutorService executorService = c0Var.f6041x;
        if ((Build.VERSION.SDK_INT <= 23 || c0Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            c0Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        c0Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean y(UserManager userManager) {
        return userManager.isUserUnlocked();
    }

    public static /* bridge */ /* synthetic */ boolean z(PlayerActivity playerActivity) {
        return playerActivity.isInPictureInPictureMode();
    }
}
