package q0;

import android.os.Process;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: x, reason: collision with root package name */
    public final int f10823x;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f10823x = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f10823x);
        super.run();
    }
}
