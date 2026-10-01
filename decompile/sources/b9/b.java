package b9;

import a8.f;
import android.os.Process;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1622x;

    /* renamed from: y, reason: collision with root package name */
    public final Runnable f1623y;

    public /* synthetic */ b(Runnable runnable, int i6) {
        this.f1622x = i6;
        this.f1623y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1622x) {
            case 0:
                Process.setThreadPriority(0);
                this.f1623y.run();
                return;
            case 1:
                try {
                    this.f1623y.run();
                    return;
                } catch (Exception e10) {
                    f.M("Executor", "Background execution failure.", e10);
                    return;
                }
            default:
                this.f1623y.run();
                return;
        }
    }

    public String toString() {
        switch (this.f1622x) {
            case 2:
                return this.f1623y.toString();
            default:
                return super.toString();
        }
    }
}
