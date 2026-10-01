package n9;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z2 extends com.google.android.gms.internal.measurement.y implements j0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(h3 h3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f9572e = atomicReference;
    }

    @Override // n9.j0
    public final void E(List list) {
        AtomicReference atomicReference = this.f9572e;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 == 2) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(t3.CREATOR);
            com.google.android.gms.internal.measurement.z.d(parcel);
            E(createTypedArrayList);
            return true;
        }
        return false;
    }
}
