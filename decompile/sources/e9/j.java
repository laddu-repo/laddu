package e9;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends x {
    public final d9.a M(d9.b bVar, String str, int i6) {
        Parcel J = J();
        i9.a.c(J, bVar);
        J.writeString(str);
        J.writeInt(i6);
        Parcel a10 = a(J, 2);
        d9.a K = d9.b.K(a10.readStrongBinder());
        a10.recycle();
        return K;
    }

    public final d9.a N(d9.b bVar, String str, int i6, d9.b bVar2) {
        Parcel J = J();
        i9.a.c(J, bVar);
        J.writeString(str);
        J.writeInt(i6);
        i9.a.c(J, bVar2);
        Parcel a10 = a(J, 8);
        d9.a K = d9.b.K(a10.readStrongBinder());
        a10.recycle();
        return K;
    }

    public final d9.a O(d9.b bVar, String str, int i6) {
        Parcel J = J();
        i9.a.c(J, bVar);
        J.writeString(str);
        J.writeInt(i6);
        Parcel a10 = a(J, 4);
        d9.a K = d9.b.K(a10.readStrongBinder());
        a10.recycle();
        return K;
    }

    public final d9.a P(d9.b bVar, String str, boolean z10, long j) {
        Parcel J = J();
        i9.a.c(J, bVar);
        J.writeString(str);
        J.writeInt(z10 ? 1 : 0);
        J.writeLong(j);
        Parcel a10 = a(J, 7);
        d9.a K = d9.b.K(a10.readStrongBinder());
        a10.recycle();
        return K;
    }
}
