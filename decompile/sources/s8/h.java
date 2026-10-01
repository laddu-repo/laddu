package s8;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ h f12240y = new h(0);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ h f12241z = new h(1);

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12242x;

    public /* synthetic */ h(int i6) {
        this.f12242x = i6;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12242x) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
