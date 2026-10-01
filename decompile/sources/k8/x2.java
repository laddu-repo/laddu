package k8;

import android.app.Service;
import android.content.Intent;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x2 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7836v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7839y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Cloneable f7840z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x2(y0 y0Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f7838x = y0Var;
        this.f7837w = i;
        this.f7839y = exc;
        this.f7840z = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7836v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                y0 y0Var = (y0) this.f7838x;
                ((w2) y0Var.A).j(this.f7837w, (Exception) this.f7839y, (byte[]) this.f7840z);
                break;
            default:
                s5.d dVar = (s5.d) this.f7838x;
                v0 v0Var = (v0) this.f7839y;
                Intent intent = (Intent) this.f7840z;
                Service service = (Service) dVar.f11493v;
                s3 s3Var = (s3) service;
                int i = this.f7837w;
                if (s3Var.a(i)) {
                    v0Var.J.b(Integer.valueOf(i), "Local AppMeasurementService processed last upload request. StartId");
                    v0 v0Var2 = p1.r(service, null, null, null).A;
                    p1.l(v0Var2);
                    v0Var2.J.a("Completed wakeful intent.");
                    s3Var.b(intent);
                }
                break;
        }
    }

    public /* synthetic */ x2(s5.d dVar, int i, v0 v0Var, Intent intent) {
        this.f7838x = dVar;
        this.f7837w = i;
        this.f7839y = v0Var;
        this.f7840z = intent;
    }
}
