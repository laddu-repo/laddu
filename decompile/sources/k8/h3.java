package k8;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.l6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends k6 implements k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f7569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(p3 p3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f7569d = atomicReference;
    }

    @Override // k8.k0
    public final void B(List list) {
        AtomicReference atomicReference = this.f7569d;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.k6
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(b4.CREATOR);
        l6.d(parcel);
        B(arrayListCreateTypedArrayList);
        return true;
    }
}
