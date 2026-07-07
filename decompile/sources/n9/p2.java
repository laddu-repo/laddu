package n9;

import android.app.Service;
import android.content.Intent;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Cloneable B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9435x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f9436y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f9437z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p2(x0 x0Var, int i6, Exception exc, byte[] bArr, Map map) {
        this.f9437z = x0Var;
        this.f9436y = i6;
        this.A = exc;
        this.B = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9435x) {
            case 0:
                x0 x0Var = (x0) this.f9437z;
                ((o2) x0Var.C).h(this.f9436y, (Exception) this.A, (byte[]) this.B);
                return;
            default:
                u5.r rVar = (u5.r) this.f9437z;
                u0 u0Var = (u0) this.A;
                Intent intent = (Intent) this.B;
                Service service = (Service) rVar.f12916y;
                k3 k3Var = (k3) service;
                int i6 = this.f9436y;
                if (k3Var.a(i6)) {
                    u0Var.L.b(Integer.valueOf(i6), "Local AppMeasurementService processed last upload request. StartId");
                    u0 u0Var2 = n1.m(service, null, null).C;
                    n1.g(u0Var2);
                    u0Var2.L.a("Completed wakeful intent.");
                    k3Var.b(intent);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ p2(u5.r rVar, int i6, u0 u0Var, Intent intent) {
        this.f9437z = rVar;
        this.f9436y = i6;
        this.A = u0Var;
        this.B = intent;
    }
}
