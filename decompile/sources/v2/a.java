package v2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Executor f13255x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f13256y;

    public a(ExecutorService executorService, i iVar) {
        this.f13255x = executorService;
        this.f13256y = iVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13255x.execute(runnable);
    }
}
