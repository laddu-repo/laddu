package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.lifecycle.j1;
import f6.n;
import f6.o;
import f6.p;
import f6.q;
import h6.a;
import hb.x;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import v5.f;
import v5.h;
import v5.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f1185f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g6.j, hb.x, java.lang.Object] */
    public x getForegroundInfoAsync() {
        ?? obj = new Object();
        obj.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.mWorkerParams.f1180a;
    }

    public final f getInputData() {
        return this.mWorkerParams.f1181b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f1183d.A;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f1184e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f1182c;
    }

    public a getTaskExecutor() {
        return this.mWorkerParams.f1186g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f1183d.f9355y;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f1183d.f9356z;
    }

    public w getWorkerFactory() {
        return this.mWorkerParams.f1187h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [hb.x, java.lang.Object] */
    public final x setForegroundAsync(h hVar) {
        this.mRunInForeground = true;
        o oVar = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        oVar.getClass();
        ?? obj = new Object();
        ((j1) oVar.f5056a).k(new n(oVar, obj, id2, hVar, applicationContext, 0));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [hb.x, java.lang.Object] */
    public x setProgressAsync(f fVar) {
        q qVar = this.mWorkerParams.f1188i;
        getApplicationContext();
        UUID id2 = getId();
        qVar.getClass();
        ?? obj = new Object();
        ((j1) qVar.f5064b).k(new p(qVar, id2, fVar, obj, 0));
        return obj;
    }

    public void setRunInForeground(boolean z10) {
        this.mRunInForeground = z10;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract x startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
