package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import h8.c;
import java.util.Arrays;
import kd.g0;
import s8.l;
import t8.b;
import w8.x;
import x8.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new g0(20);
    public final b A;

    /* renamed from: x, reason: collision with root package name */
    public final int f2134x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2135y;

    /* renamed from: z, reason: collision with root package name */
    public final PendingIntent f2136z;

    public Status(int i6, String str, PendingIntent pendingIntent, b bVar) {
        this.f2134x = i6;
        this.f2135y = str;
        this.f2136z = pendingIntent;
        this.A = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f2134x != status.f2134x || !x.j(this.f2135y, status.f2135y) || !x.j(this.f2136z, status.f2136z) || !x.j(this.A, status.A)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2134x), this.f2135y, this.f2136z, this.A});
    }

    public final String toString() {
        l lVar = new l(this);
        String str = this.f2135y;
        if (str == null) {
            int i6 = this.f2134x;
            switch (i6) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = c.i(i6, "unknown status code: ");
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        lVar.a(str, "statusCode");
        lVar.a(this.f2136z, "resolution");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 4);
        parcel.writeInt(this.f2134x);
        a.a.w(parcel, 2, this.f2135y);
        a.a.v(parcel, 3, this.f2136z, i6);
        a.a.v(parcel, 4, this.A, i6);
        a.a.C(parcel, A);
    }
}
