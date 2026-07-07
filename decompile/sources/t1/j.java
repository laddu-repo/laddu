package t1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new i(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final UUID f12008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f12009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f12010y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final byte[] f12011z;

    public j(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f12008w = uuid;
        this.f12009x = str;
        str2.getClass();
        this.f12010y = f0.p(str2);
        this.f12011z = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = e.f11979a;
        UUID uuid3 = this.f12008w;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        return Objects.equals(this.f12009x, jVar.f12009x) && Objects.equals(this.f12010y, jVar.f12010y) && Objects.equals(this.f12008w, jVar.f12008w) && Arrays.equals(this.f12011z, jVar.f12011z);
    }

    public final int hashCode() {
        if (this.f12007v == 0) {
            int iHashCode = this.f12008w.hashCode() * 31;
            String str = this.f12009x;
            this.f12007v = Arrays.hashCode(this.f12011z) + d0.d.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12010y);
        }
        return this.f12007v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f12008w;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f12009x);
        parcel.writeString(this.f12010y);
        parcel.writeByteArray(this.f12011z);
    }

    public j(Parcel parcel) {
        this.f12008w = new UUID(parcel.readLong(), parcel.readLong());
        this.f12009x = parcel.readString();
        String string = parcel.readString();
        int i = w1.b0.f13686a;
        this.f12010y = string;
        this.f12011z = parcel.createByteArray();
    }
}
