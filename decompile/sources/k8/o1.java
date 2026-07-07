package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.ag;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z6 f7669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f7670x;

    public /* synthetic */ o1(AppMeasurementDynamiteService appMeasurementDynamiteService, z6 z6Var, int i) {
        this.f7668v = i;
        this.f7669w = z6Var;
        this.f7670x = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7668v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                p3 p3VarO = this.f7670x.f3301d.o();
                z6 z6Var = this.f7669w;
                p3VarO.D();
                p3VarO.E();
                p3VarO.R(new ag(p3VarO, p3VarO.T(false), z6Var, 8, false));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f7670x;
                t4 t4Var = appMeasurementDynamiteService.f3301d.D;
                p1.j(t4Var);
                p1 p1Var = appMeasurementDynamiteService.f3301d;
                t4Var.v0(this.f7669w, p1Var.T != null && p1Var.T.booleanValue());
                break;
        }
    }
}
