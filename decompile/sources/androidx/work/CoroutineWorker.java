package androidx.work;

import a1.e;
import android.content.Context;
import androidx.lifecycle.b;
import androidx.lifecycle.j1;
import f6.i;
import g6.j;
import gf.f0;
import gf.m1;
import gf.o0;
import gf.r;
import gf.y;
import hb.x;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.k;
import le.c;
import me.a;
import v5.f;
import v5.g;
import v5.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final y coroutineContext;
    private final j future;
    private final r job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [g6.j, g6.h, java.lang.Object] */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        k.e(appContext, "appContext");
        k.e(params, "params");
        this.job = f0.c();
        ?? obj = new Object();
        this.future = obj;
        obj.a(new e(this, 27), (i) ((j1) getTaskExecutor()).f949y);
        this.coroutineContext = o0.f5693a;
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, c cVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(c cVar);

    public y getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(c cVar) {
        return getForegroundInfo$suspendImpl(this, cVar);
    }

    @Override // androidx.work.ListenableWorker
    public final x getForegroundInfoAsync() {
        m1 c10 = f0.c();
        mf.e b10 = f0.b(getCoroutineContext().plus(c10));
        v5.j jVar = new v5.j(c10);
        f0.w(b10, null, new dd.c(jVar, this, (c) null, 12), 3);
        return jVar;
    }

    public final j getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final r getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(h hVar, c cVar) {
        Object obj;
        x foregroundAsync = setForegroundAsync(hVar);
        k.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                obj = foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            gf.k kVar = new gf.k(1, a8.c.i(cVar));
            kVar.s();
            foregroundAsync.a(new rb.i(11, kVar, foregroundAsync), g.f13320x);
            obj = kVar.r();
        }
        if (obj == a.f8833x) {
            return obj;
        }
        return he.y.f6101a;
    }

    public final Object setProgress(f fVar, c cVar) {
        Object obj;
        x progressAsync = setProgressAsync(fVar);
        k.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                obj = progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            gf.k kVar = new gf.k(1, a8.c.i(cVar));
            kVar.s();
            progressAsync.a(new rb.i(11, kVar, progressAsync), g.f13320x);
            obj = kVar.r();
        }
        if (obj == a.f8833x) {
            return obj;
        }
        return he.y.f6101a;
    }

    @Override // androidx.work.ListenableWorker
    public final x startWork() {
        f0.w(f0.b(getCoroutineContext().plus(this.job)), null, new b(this, null, 4), 3);
        return this.future;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
