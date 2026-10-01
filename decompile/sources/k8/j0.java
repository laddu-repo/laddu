package k8;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.j6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends j6 implements k0 {
    @Override // k8.k0
    public final void B(List list) {
        Parcel parcelF = f();
        parcelF.writeTypedList(list);
        J(parcelF);
    }
}
