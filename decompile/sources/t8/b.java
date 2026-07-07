package t8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.util.Arrays;
import kd.g0;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends x8.a {
    public static final b B = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new g0(16);
    public final String A;

    /* renamed from: x, reason: collision with root package name */
    public final int f12628x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12629y;

    /* renamed from: z, reason: collision with root package name */
    public final PendingIntent f12630z;

    public b(int i6, int i10, PendingIntent pendingIntent, String str) {
        this.f12628x = i6;
        this.f12629y = i10;
        this.f12630z = pendingIntent;
        this.A = str;
    }

    public static String a(int i6) {
        if (i6 != 99) {
            if (i6 != 1500) {
                switch (i6) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i6) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            case 25:
                                return "API_INSTALL_REQUIRED";
                            default:
                                return h8.c.j(i6, "UNKNOWN_ERROR_CODE(", ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12629y == bVar.f12629y && x.j(this.f12630z, bVar.f12630z) && x.j(this.A, bVar.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12629y), this.f12630z, this.A});
    }

    public final String toString() {
        s8.l lVar = new s8.l(this);
        lVar.a(a(this.f12629y), "statusCode");
        lVar.a(this.f12630z, "resolution");
        lVar.a(this.A, "message");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 4);
        parcel.writeInt(this.f12628x);
        a.a.D(parcel, 2, 4);
        parcel.writeInt(this.f12629y);
        a.a.v(parcel, 3, this.f12630z, i6);
        a.a.w(parcel, 4, this.A);
        a.a.C(parcel, A);
    }

    public b(int i6) {
        this(1, i6, null, null);
    }

    public b(int i6, PendingIntent pendingIntent) {
        this(1, i6, pendingIntent, null);
    }
}
