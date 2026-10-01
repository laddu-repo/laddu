package k8;

import android.os.RemoteException;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n3 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p3 f7649w;

    public /* synthetic */ n3(p3 p3Var, int i) {
        this.f7648v = i;
        this.f7649w = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7648v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f7649w.J();
                break;
            case 1:
                p3 p3Var = this.f7649w;
                p1 p1Var = (p1) p3Var.f2053w;
                i0 i0Var = p3Var.f7701z;
                if (i0Var == null) {
                    v0 v0Var = p1Var.A;
                    p1.l(v0Var);
                    v0Var.B.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        i0Var.z(p3Var.T(false));
                        p3Var.Q();
                    } catch (RemoteException e7) {
                        v0 v0Var2 = p1Var.A;
                        p1.l(v0Var2);
                        v0Var2.B.b(e7, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                p3 p3Var2 = this.f7649w;
                p1 p1Var2 = (p1) p3Var2.f2053w;
                i0 i0Var2 = p3Var2.f7701z;
                if (i0Var2 == null) {
                    v0 v0Var3 = p1Var2.A;
                    p1.l(v0Var3);
                    v0Var3.B.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        i0Var2.E(p3Var2.T(false));
                        p3Var2.Q();
                    } catch (RemoteException e10) {
                        v0 v0Var4 = p1Var2.A;
                        p1.l(v0Var4);
                        v0Var4.B.b(e10, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
