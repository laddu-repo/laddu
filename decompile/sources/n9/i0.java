package n9;

import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 extends com.google.android.gms.internal.measurement.x implements j0 {
    @Override // n9.j0
    public final void E(List list) {
        Parcel J = J();
        J.writeTypedList(list);
        L(J);
    }
}
