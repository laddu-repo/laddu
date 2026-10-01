package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f740a;

    public /* synthetic */ a(int i6) {
        this.f740a = i6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f740a) {
            case 0:
                ?? obj = new Object();
                obj.f728x = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

                    /* renamed from: x, reason: collision with root package name */
                    public final MediaDescriptionCompat f726x;

                    /* renamed from: y, reason: collision with root package name */
                    public final long f727y;

                    {
                        this.f726x = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f727y = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f726x);
                        sb2.append(", Id=");
                        return r4.a.m(sb2, this.f727y, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i6) {
                        this.f726x.writeToParcel(parcel2, i6);
                        parcel2.writeLong(this.f727y);
                    }
                };
            case 2:
                final Parcelable readParcelable = parcel.readParcelable(null);
                return new Parcelable(readParcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

                    /* renamed from: x, reason: collision with root package name */
                    public final Object f729x = new Object();

                    /* renamed from: y, reason: collision with root package name */
                    public final Object f730y;

                    {
                        this.f730y = readParcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj3 = ((MediaSessionCompat$Token) obj2).f730y;
                        Object obj4 = this.f730y;
                        if (obj4 == null) {
                            if (obj3 == null) {
                                return true;
                            }
                            return false;
                        }
                        if (obj3 == null) {
                            return false;
                        }
                        return obj4.equals(obj3);
                    }

                    public final int hashCode() {
                        Object obj2 = this.f730y;
                        if (obj2 == null) {
                            return 0;
                        }
                        return obj2.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i6) {
                        parcel2.writeParcelable((Parcelable) this.f730y, i6);
                    }
                };
            case 3:
                ?? obj2 = new Object();
                obj2.f731x = parcel.readInt();
                obj2.f733z = parcel.readInt();
                obj2.A = parcel.readInt();
                obj2.B = parcel.readInt();
                obj2.f732y = parcel.readInt();
                return obj2;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.f740a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i6];
            case 1:
                return new MediaSessionCompat$QueueItem[i6];
            case 2:
                return new MediaSessionCompat$Token[i6];
            case 3:
                return new ParcelableVolumeInfo[i6];
            default:
                return new PlaybackStateCompat[i6];
        }
    }
}
