package k8;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.l6;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends k6 implements m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f7576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3 f7577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(p3 p3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f7576d = atomicReference;
        this.f7577e = p3Var;
    }

    @Override // com.google.android.gms.internal.measurement.k6
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        g4 g4Var = (g4) l6.a(parcel, g4.CREATOR);
        l6.d(parcel);
        i(g4Var);
        return true;
    }

    @Override // k8.m0
    public final void i(g4 g4Var) {
        AtomicReference atomicReference = this.f7576d;
        synchronized (atomicReference) {
            v0 v0Var = ((p1) this.f7577e.f2053w).A;
            p1.l(v0Var);
            v0Var.J.b(Integer.valueOf(g4Var.f7552v.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(g4Var);
            atomicReference.notifyAll();
        }
    }
}
