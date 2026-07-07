package androidx.work;

import a1.e;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import g6.j;
import hb.x;
import v5.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: x, reason: collision with root package name */
    public j f1179x;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract m b();

    /* JADX WARN: Type inference failed for: r0v0, types: [g6.j, java.lang.Object] */
    @Override // androidx.work.ListenableWorker
    public final x startWork() {
        this.f1179x = new Object();
        getBackgroundExecutor().execute(new e(this, 28));
        return this.f1179x;
    }
}
