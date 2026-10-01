package android.support.v4.media;

import android.os.Parcelable;
import b7.g;
import com.google.android.material.datepicker.r;
import f.i;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import j1.k0;
import j1.q0;
import j1.t0;
import j4.a0;
import j4.h0;
import j4.j0;
import j4.l0;
import j4.o;
import j4.p;
import j4.y;
import j4.z;
import kd.l;
import kd.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f725a;

    public /* synthetic */ a(int i6) {
        this.f725a = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View$BaseSavedState, java.lang.Object, da.a] */
    /* JADX WARN: Type inference failed for: r2v22, types: [j1.k0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, j1.q0] */
    /* JADX WARN: Type inference failed for: r2v35, types: [j4.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [j4.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View$BaseSavedState, b7.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [c.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [c.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createFromParcel(android.os.Parcel r21) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.f725a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i6];
            case 1:
                return new MediaDescriptionCompat[i6];
            case 2:
                return new MediaMetadataCompat[i6];
            case 3:
                return new RatingCompat[i6];
            case 4:
                return new g[i6];
            case 5:
                return new c.d[i6];
            case 6:
                return new com.google.android.material.datepicker.b[i6];
            case 7:
                return new com.google.android.material.datepicker.d[i6];
            case 8:
                return new r[i6];
            case 9:
                return new da.a[i6];
            case 10:
                return new f.a[i6];
            case 11:
                return new i[i6];
            case 12:
                return new ic.r[i6];
            case 13:
                return new j1.b[i6];
            case 14:
                return new j1.c[i6];
            case 15:
                return new k0[i6];
            case 16:
                return new q0[i6];
            case 17:
                return new t0[i6];
            case 18:
                return new o[i6];
            case 19:
                return new p[i6];
            case 20:
                return new y[i6];
            case 21:
                return new z[i6];
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                return new a0[i6];
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                return new h0[i6];
            case 24:
                return new j4.k0[i6];
            case 25:
                return new j0[i6];
            case 26:
                return new l0[i6];
            case 27:
                return new l[i6];
            case 28:
                return new u[i6];
            default:
                return new kd.a0[i6];
        }
    }
}
