package i;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ p f6253y = new p(1);

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6254x;

    public /* synthetic */ p(int i6) {
        this.f6254x = i6;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6254x) {
            case 0:
                new Thread(runnable).start();
                return;
            case 1:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
