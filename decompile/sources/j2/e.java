package j2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import android.view.Display;
import android.view.PointerIcon;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ int[] A(Display.HdrCapabilities hdrCapabilities) {
        return hdrCapabilities.getSupportedHdrTypes();
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern f() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* bridge */ /* synthetic */ LocaleList h(Object obj) {
        return (LocaleList) obj;
    }

    public static /* bridge */ /* synthetic */ Display.HdrCapabilities i(Display display) {
        return display.getHdrCapabilities();
    }

    public static /* bridge */ /* synthetic */ PointerIcon j(Object obj) {
        return (PointerIcon) obj;
    }

    public static /* bridge */ /* synthetic */ Locale.Category n() {
        return Locale.Category.DISPLAY;
    }

    public static /* bridge */ /* synthetic */ Locale o() {
        return Locale.getDefault(Locale.Category.DISPLAY);
    }

    public static /* synthetic */ PriorityQueue q(Comparator comparator) {
        return new PriorityQueue(comparator);
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void u(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        executorService.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void v(rb.e eVar) {
        if ((Build.VERSION.SDK_INT > 23 && eVar == ForkJoinPool.commonPool()) || eVar.f11938x.isTerminated()) {
            return;
        }
        eVar.shutdown();
        throw null;
    }
}
