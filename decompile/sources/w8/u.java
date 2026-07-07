package w8;

import android.os.Parcel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends com.google.android.gms.internal.measurement.x implements w {
    public final boolean M() {
        boolean z10;
        Parcel a10 = a(J(), 7);
        int i6 = i9.a.f6708a;
        if (a10.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a10.recycle();
        return z10;
    }
}
