package q;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10784x;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f10784x) {
            case 0:
                b.H().f10787f.f10790g.execute(runnable);
                return;
            case 1:
                runnable.run();
                return;
            default:
                return;
        }
    }

    private final void a(Runnable runnable) {
    }
}
