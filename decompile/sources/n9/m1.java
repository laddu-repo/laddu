package n9;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m1 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9392x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.n0 f9393y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9394z;

    public /* synthetic */ m1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.n0 n0Var, int i6) {
        this.f9392x = i6;
        this.f9393y = n0Var;
        this.f9394z = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.f9392x) {
            case 0:
                h3 j = this.f9394z.f2557e.j();
                com.google.android.gms.internal.measurement.n0 n0Var = this.f9393y;
                j.d1();
                j.e1();
                j.r1(new d6.b(j, j.t1(false), n0Var, 8));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f9394z;
                j4 j4Var = appMeasurementDynamiteService.f2557e.F;
                n1.e(j4Var);
                n1 n1Var = appMeasurementDynamiteService.f2557e;
                if (n1Var.V != null && n1Var.V.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.Q1(this.f9393y, z10);
                return;
        }
    }
}
