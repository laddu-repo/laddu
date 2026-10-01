package r1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new k(1);
    public final String A;
    public final byte[] B;

    /* renamed from: x, reason: collision with root package name */
    public int f11575x;

    /* renamed from: y, reason: collision with root package name */
    public final UUID f11576y;

    /* renamed from: z, reason: collision with root package name */
    public final String f11577z;

    public l(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f11576y = uuid;
        this.f11577z = str;
        str2.getClass();
        this.A = k0.p(str2);
        this.B = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = g.f11399a;
        UUID uuid3 = this.f11576y;
        if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        if (!Objects.equals(this.f11577z, lVar.f11577z) || !Objects.equals(this.A, lVar.A) || !Objects.equals(this.f11576y, lVar.f11576y) || !Arrays.equals(this.B, lVar.B)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f11575x == 0) {
            int hashCode2 = this.f11576y.hashCode() * 31;
            String str = this.f11577z;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f11575x = Arrays.hashCode(this.B) + h8.c.g(this.A, (hashCode2 + hashCode) * 31, 31);
        }
        return this.f11575x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        UUID uuid = this.f11576y;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f11577z);
        parcel.writeString(this.A);
        parcel.writeByteArray(this.B);
    }

    public l(Parcel parcel) {
        this.f11576y = new UUID(parcel.readLong(), parcel.readLong());
        this.f11577z = parcel.readString();
        String readString = parcel.readString();
        String str = u1.a0.f12750a;
        this.A = readString;
        this.B = parcel.createByteArray();
    }
}
