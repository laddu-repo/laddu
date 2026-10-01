package androidx.work.impl.workers;

import a1.e;
import a6.b;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import g6.j;
import h6.a;
import hb.x;
import java.util.List;
import v5.o;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {
    public static final String C = o.h("ConstraintTrkngWrkr");
    public final j A;
    public ListenableWorker B;

    /* renamed from: x, reason: collision with root package name */
    public final WorkerParameters f1209x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1210y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f1211z;

    /* JADX WARN: Type inference failed for: r1v3, types: [g6.j, java.lang.Object] */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1209x = workerParameters;
        this.f1210y = new Object();
        this.f1211z = false;
        this.A = new Object();
    }

    @Override // a6.b
    public final void a(List list) {
        o.f().b(C, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f1210y) {
            this.f1211z = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return l.c(getApplicationContext()).f14114d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.B;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        ListenableWorker listenableWorker = this.B;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.B.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final x startWork() {
        getBackgroundExecutor().execute(new e(this, 4));
        return this.A;
    }

    @Override // a6.b
    public final void e(List list) {
    }
}
