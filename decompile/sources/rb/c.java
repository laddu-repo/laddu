package rb;

import a2.a2;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements f {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ TimeUnit C;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11932x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f11933y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Runnable f11934z;

    public /* synthetic */ c(e eVar, Runnable runnable, long j, long j10, TimeUnit timeUnit, int i6) {
        this.f11932x = i6;
        this.f11933y = eVar;
        this.f11934z = runnable;
        this.A = j;
        this.B = j10;
        this.C = timeUnit;
    }

    @Override // rb.f
    public final ScheduledFuture a(a2 a2Var) {
        switch (this.f11932x) {
            case 0:
                e eVar = this.f11933y;
                return eVar.f11939y.scheduleAtFixedRate(new d(eVar, this.f11934z, a2Var, 0), this.A, this.B, this.C);
            default:
                e eVar2 = this.f11933y;
                return eVar2.f11939y.scheduleWithFixedDelay(new d(eVar2, this.f11934z, a2Var, 2), this.A, this.B, this.C);
        }
    }
}
