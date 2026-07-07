package n9;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a3 extends com.google.android.gms.internal.measurement.y implements l0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h3 f9168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(h3 h3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f9167e = atomicReference;
        this.f9168f = h3Var;
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 == 2) {
            y3 y3Var = (y3) com.google.android.gms.internal.measurement.z.a(parcel, y3.CREATOR);
            com.google.android.gms.internal.measurement.z.d(parcel);
            u(y3Var);
            return true;
        }
        return false;
    }

    @Override // n9.l0
    public final void u(y3 y3Var) {
        AtomicReference atomicReference = this.f9167e;
        synchronized (atomicReference) {
            u0 u0Var = ((n1) this.f9168f.f4301y).C;
            n1.g(u0Var);
            u0Var.L.b(Integer.valueOf(y3Var.f9540x.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(y3Var);
            atomicReference.notifyAll();
        }
    }
}
