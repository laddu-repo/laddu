package u1;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12794a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f12795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f12796c;

    public q(r rVar, u2.f fVar, Executor executor) {
        this.f12796c = rVar;
        this.f12794a = new WeakReference(fVar);
        this.f12795b = executor;
    }
}
