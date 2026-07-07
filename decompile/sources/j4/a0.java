package j4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new android.support.v4.media.a(22);

    /* renamed from: y, reason: collision with root package name */
    public final MediaSession.Token f7156y;

    /* renamed from: z, reason: collision with root package name */
    public h f7157z;

    /* renamed from: x, reason: collision with root package name */
    public final Object f7155x = new Object();
    public q5.c A = null;

    public a0(MediaSession.Token token, t tVar) {
        this.f7156y = token;
        this.f7157z = tVar;
    }

    public final h a() {
        h hVar;
        synchronized (this.f7155x) {
            hVar = this.f7157z;
        }
        return hVar;
    }

    public final void b(h hVar) {
        synchronized (this.f7155x) {
            this.f7157z = hVar;
        }
    }

    public final void c(q5.c cVar) {
        synchronized (this.f7155x) {
            this.A = cVar;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        return this.f7156y.equals(((a0) obj).f7156y);
    }

    public final int hashCode() {
        return this.f7156y.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f7156y, i6);
    }
}
