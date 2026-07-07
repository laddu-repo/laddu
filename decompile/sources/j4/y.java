package j4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new android.support.v4.media.a(20);

    /* renamed from: x, reason: collision with root package name */
    public final o f7221x;

    /* renamed from: y, reason: collision with root package name */
    public final long f7222y;

    /* renamed from: z, reason: collision with root package name */
    public MediaSession.QueueItem f7223z;

    public y(o oVar, long j) {
        if (j != -1) {
            this.f7221x = oVar;
            this.f7222y = j;
            this.f7223z = null;
            return;
        }
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem { Description=");
        sb2.append(this.f7221x);
        sb2.append(", Id=");
        return r4.a.m(sb2, this.f7222y, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        this.f7221x.writeToParcel(parcel, i6);
        parcel.writeLong(this.f7222y);
    }

    public y(Parcel parcel) {
        this.f7221x = o.CREATOR.createFromParcel(parcel);
        this.f7222y = parcel.readLong();
    }
}
