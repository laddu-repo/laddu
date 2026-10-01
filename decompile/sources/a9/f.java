package a9;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ MediaMetricsManager a(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder j(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder l() {
        return new PlaybackStateEvent.Builder();
    }
}
