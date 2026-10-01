package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g4 extends x8.a {
    public static final Parcelable.Creator<g4> CREATOR = new kd.g0(11);
    public final Long A;
    public final String B;
    public final String C;
    public final Double D;

    /* renamed from: x, reason: collision with root package name */
    public final int f9331x;

    /* renamed from: y, reason: collision with root package name */
    public final String f9332y;

    /* renamed from: z, reason: collision with root package name */
    public final long f9333z;

    public g4(int i6, String str, long j, Long l10, Float f3, String str2, String str3, Double d10) {
        this.f9331x = i6;
        this.f9332y = str;
        this.f9333z = j;
        this.A = l10;
        this.D = i6 == 1 ? f3 != null ? Double.valueOf(f3.doubleValue()) : null : d10;
        this.B = str2;
        this.C = str3;
    }

    public final Object a() {
        Long l10 = this.A;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.D;
        if (d10 != null) {
            return d10;
        }
        String str = this.B;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        kd.g0.b(this, parcel);
    }

    public g4(long j, Object obj, String str, String str2) {
        w8.x.d(str);
        this.f9331x = 2;
        this.f9332y = str;
        this.f9333z = j;
        this.C = str2;
        if (obj == null) {
            this.A = null;
            this.D = null;
            this.B = null;
            return;
        }
        if (obj instanceof Long) {
            this.A = (Long) obj;
            this.D = null;
            this.B = null;
        } else if (obj instanceof String) {
            this.A = null;
            this.D = null;
            this.B = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.A = null;
                this.D = (Double) obj;
                this.B = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public g4(h4 h4Var) {
        this(h4Var.f9343d, h4Var.f9344e, h4Var.f9342c, h4Var.f9341b);
    }
}
