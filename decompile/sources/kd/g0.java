package kd;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import n9.g4;
import n9.l4;
import n9.t3;
import n9.w3;
import n9.x3;
import n9.y3;
import w4.o1;
import w4.p1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7856a;

    public /* synthetic */ g0(int i6) {
        this.f7856a = i6;
    }

    public static void a(n9.v vVar, Parcel parcel, int i6) {
        String str = vVar.f9500x;
        int A = a.a.A(parcel, 20293);
        a.a.w(parcel, 2, str);
        a.a.v(parcel, 3, vVar.f9501y, i6);
        a.a.w(parcel, 4, vVar.f9502z);
        long j = vVar.A;
        a.a.D(parcel, 5, 8);
        parcel.writeLong(j);
        a.a.C(parcel, A);
    }

    public static void b(g4 g4Var, Parcel parcel) {
        int i6 = g4Var.f9331x;
        int A = a.a.A(parcel, 20293);
        a.a.D(parcel, 1, 4);
        parcel.writeInt(i6);
        a.a.w(parcel, 2, g4Var.f9332y);
        long j = g4Var.f9333z;
        a.a.D(parcel, 3, 8);
        parcel.writeLong(j);
        Long l10 = g4Var.A;
        if (l10 != null) {
            a.a.D(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        a.a.w(parcel, 6, g4Var.B);
        a.a.w(parcel, 7, g4Var.C);
        Double d10 = g4Var.D;
        if (d10 != null) {
            a.a.D(parcel, 8, 8);
            parcel.writeDouble(d10.doubleValue());
        }
        a.a.C(parcel, A);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 725
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r53) {
        /*
            Method dump skipped, instructions count: 2394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.g0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.f7856a) {
            case 0:
                return new h0[i6];
            case 1:
                return new m5.k[i6];
            case 2:
                return new n9.d[i6];
            case 3:
                return new n9.e[i6];
            case 4:
                return new n9.i[i6];
            case 5:
                return new n9.u[i6];
            case 6:
                return new n9.v[i6];
            case 7:
                return new t3[i6];
            case 8:
                return new w3[i6];
            case 9:
                return new x3[i6];
            case 10:
                return new y3[i6];
            case 11:
                return new g4[i6];
            case 12:
                return new l4[i6];
            case 13:
                return new p.o0[i6];
            case 14:
                return new ParcelImpl[i6];
            case 15:
                return new t6.a[i6];
            case 16:
                return new t8.b[i6];
            case 17:
                return new t8.d[i6];
            case 18:
                return new t8.s[i6];
            case 19:
                return new Scope[i6];
            case 20:
                return new Status[i6];
            case 21:
                return new w0.g[i6];
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                return new w4.b0[i6];
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                return new o1[i6];
            case 24:
                return new p1[i6];
            case 25:
                return new w8.n[i6];
            case 26:
                return new w8.j[i6];
            case 27:
                return new w8.m[i6];
            case 28:
                return new w8.e0[i6];
            default:
                return new w8.g[i6];
        }
    }
}
