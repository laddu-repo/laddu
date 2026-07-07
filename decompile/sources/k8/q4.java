package k8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q4 extends u7.a {
    public static final Parcelable.Creator<q4> CREATOR = new android.support.v4.media.a(27);
    public final String A;
    public final Double B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7720v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f7721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f7722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Long f7723y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f7724z;

    public q4(int i, String str, long j8, Long l10, Float f, String str2, String str3, Double d10) {
        this.f7720v = i;
        this.f7721w = str;
        this.f7722x = j8;
        this.f7723y = l10;
        this.B = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d10;
        this.f7724z = str2;
        this.A = str3;
    }

    public final Object a() {
        Long l10 = this.f7723y;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.B;
        if (d10 != null) {
            return d10;
        }
        String str = this.f7724z;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        android.support.v4.media.a.b(this, parcel);
    }

    public q4(long j8, Object obj, String str, String str2) {
        t7.y.d(str);
        this.f7720v = 2;
        this.f7721w = str;
        this.f7722x = j8;
        this.A = str2;
        if (obj == null) {
            this.f7723y = null;
            this.B = null;
            this.f7724z = null;
            return;
        }
        if (obj instanceof Long) {
            this.f7723y = (Long) obj;
            this.B = null;
            this.f7724z = null;
        } else if (obj instanceof String) {
            this.f7723y = null;
            this.B = null;
            this.f7724z = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f7723y = null;
                this.B = (Double) obj;
                this.f7724z = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public q4(r4 r4Var) {
        this(r4Var.f7740d, r4Var.f7741e, r4Var.f7739c, r4Var.f7738b);
    }
}
