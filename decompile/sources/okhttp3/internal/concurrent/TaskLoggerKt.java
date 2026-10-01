package okhttp3.internal.concurrent;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.logging.Level;
import kotlin.jvm.internal.k;
import okhttp3.internal.http2.Http2Connection;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(Task task, TaskQueue taskQueue, String str) {
        log(task, taskQueue, str);
    }

    public static final String formatDuration(long j) {
        String m9;
        if (j <= -999500000) {
            m9 = a.m(new StringBuilder(), (j - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ");
        } else if (j <= -999500) {
            m9 = a.m(new StringBuilder(), (j - 500000) / 1000000, " ms");
        } else if (j <= 0) {
            m9 = a.m(new StringBuilder(), (j - UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, " µs");
        } else if (j < 999500) {
            m9 = a.m(new StringBuilder(), (j + UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, " µs");
        } else if (j < 999500000) {
            m9 = a.m(new StringBuilder(), (j + 500000) / 1000000, " ms");
        } else {
            m9 = a.m(new StringBuilder(), (j + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{m9}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.Companion.getLogger().fine(taskQueue.getName$okhttp() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(Task task, TaskQueue queue, ve.a block) {
        long j;
        k.e(task, "task");
        k.e(queue, "queue");
        k.e(block, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            j = -1;
        }
        try {
            T t10 = (T) block.invoke();
            if (isLoggable) {
                log(task, queue, "finished run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            return t10;
        } catch (Throwable th) {
            if (isLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue queue, ve.a messageBlock) {
        k.e(task, "task");
        k.e(queue, "queue");
        k.e(messageBlock, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, (String) messageBlock.invoke());
        }
    }
}
