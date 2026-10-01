package k8;

import android.os.RemoteException;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k3 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v4 f7605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p3 f7606x;

    public /* synthetic */ k3(p3 p3Var, v4 v4Var, int i) {
        this.f7604v = i;
        this.f7605w = v4Var;
        this.f7606x = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f7604v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                p3 p3Var = this.f7606x;
                i0 i0Var = p3Var.f7701z;
                p1 p1Var = (p1) p3Var.f2053w;
                if (i0Var != null) {
                    try {
                        i0Var.g(this.f7605w);
                    } catch (RemoteException e7) {
                        v0 v0Var = p1Var.A;
                        p1.l(v0Var);
                        v0Var.B.b(e7, "Failed to reset data on the service: remote exception");
                    }
                    p3Var.Q();
                } else {
                    v0 v0Var2 = p1Var.A;
                    p1.l(v0Var2);
                    v0Var2.B.a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                p3 p3Var2 = this.f7606x;
                i0 i0Var2 = p3Var2.f7701z;
                p1 p1Var2 = (p1) p3Var2.f2053w;
                if (i0Var2 == null) {
                    v0 v0Var3 = p1Var2.A;
                    p1.l(v0Var3);
                    v0Var3.B.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        v4 v4Var = this.f7605w;
                        g gVar = p1Var2.f7695y;
                        e0 e0Var = f0.X0;
                        if (gVar.O(null, e0Var)) {
                            p3Var2.V(i0Var2, null, v4Var);
                        }
                        i0Var2.j(v4Var);
                        p1Var2.n().I();
                        p1Var2.f7695y.O(null, e0Var);
                        p3Var2.V(i0Var2, null, v4Var);
                        p3Var2.Q();
                    } catch (RemoteException e10) {
                        v0 v0Var4 = p1Var2.A;
                        p1.l(v0Var4);
                        v0Var4.B.b(e10, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                p3 p3Var3 = this.f7606x;
                i0 i0Var3 = p3Var3.f7701z;
                p1 p1Var3 = (p1) p3Var3.f2053w;
                if (i0Var3 == null) {
                    v0 v0Var5 = p1Var3.A;
                    p1.l(v0Var5);
                    v0Var5.E.a("Failed to send app backgrounded");
                } else {
                    try {
                        i0Var3.o(this.f7605w);
                        p3Var3.Q();
                    } catch (RemoteException e11) {
                        v0 v0Var6 = p1Var3.A;
                        p1.l(v0Var6);
                        v0Var6.B.b(e11, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case 3:
                p3 p3Var4 = this.f7606x;
                i0 i0Var4 = p3Var4.f7701z;
                p1 p1Var4 = (p1) p3Var4.f2053w;
                if (i0Var4 == null) {
                    v0 v0Var7 = p1Var4.A;
                    p1.l(v0Var7);
                    v0Var7.B.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        i0Var4.y(this.f7605w);
                        p3Var4.Q();
                    } catch (RemoteException e12) {
                        v0 v0Var8 = p1Var4.A;
                        p1.l(v0Var8);
                        v0Var8.B.b(e12, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                p3 p3Var5 = this.f7606x;
                i0 i0Var5 = p3Var5.f7701z;
                p1 p1Var5 = (p1) p3Var5.f2053w;
                if (i0Var5 == null) {
                    v0 v0Var9 = p1Var5.A;
                    p1.l(v0Var9);
                    v0Var9.B.a("Failed to send consent settings to service");
                } else {
                    try {
                        i0Var5.v(this.f7605w);
                        p3Var5.Q();
                    } catch (RemoteException e13) {
                        v0 v0Var10 = p1Var5.A;
                        p1.l(v0Var10);
                        v0Var10.B.b(e13, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public k3(p3 p3Var, v4 v4Var) {
        this.f7604v = 4;
        this.f7605w = v4Var;
        Objects.requireNonNull(p3Var);
        this.f7606x = p3Var;
    }
}
