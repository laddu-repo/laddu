package e1;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends a8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a8.e f4170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f4171b;

    public l(a8.e eVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f4170a = eVar;
        this.f4171b = threadPoolExecutor;
    }

    @Override // a8.e
    public final void v(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f4171b;
        try {
            this.f4170a.v(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a8.e
    public final void w(ic.s sVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f4171b;
        try {
            this.f4170a.w(sVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
