package t8;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;
import kd.g0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends x8.a {
    public static final Parcelable.Creator<d> CREATOR = new g0(17);

    /* renamed from: x, reason: collision with root package name */
    public final String f12634x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12635y;

    /* renamed from: z, reason: collision with root package name */
    public final long f12636z;

    public d() {
        this.f12634x = "CLIENT_TELEMETRY";
        this.f12636z = 1L;
        this.f12635y = -1;
    }

    public final long a() {
        long j = this.f12636z;
        if (j == -1) {
            return this.f12635y;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f12634x;
            String str2 = this.f12634x;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12634x, Long.valueOf(a())});
    }

    public final String toString() {
        s8.l lVar = new s8.l(this);
        lVar.a(this.f12634x, MediationMetaData.KEY_NAME);
        lVar.a(Long.valueOf(a()), "version");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.w(parcel, 1, this.f12634x);
        a.a.D(parcel, 2, 4);
        parcel.writeInt(this.f12635y);
        long a10 = a();
        a.a.D(parcel, 3, 8);
        parcel.writeLong(a10);
        a.a.C(parcel, A);
    }

    public d(int i6, String str, long j) {
        this.f12634x = str;
        this.f12635y = i6;
        this.f12636z = j;
    }
}
