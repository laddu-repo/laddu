package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class wa extends k6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3194d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(ya yaVar, o8.h hVar) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.f3195e = hVar;
    }

    @Override // com.google.android.gms.internal.measurement.k6
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        boolean z2 = false;
        switch (this.f3194d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) l6.a(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                l6.d(parcel);
                o8.h hVar = (o8.h) this.f3195e;
                if (status.f2459v > 0) {
                    z7.b.K(status, null, hVar);
                    return true;
                }
                try {
                    a1 a1Var = a1.f2467a;
                    int i10 = o0.f2941a;
                    z7.b.K(status, xc.w(bArrCreateByteArray, a1.f2468b), hVar);
                    return true;
                } catch (u1 e7) {
                    hVar.f9963a.n(e7);
                    return true;
                }
            case 1:
                o8.h hVar2 = (o8.h) this.f3195e;
                switch (i) {
                    case 1:
                        Status status2 = (Status) l6.a(parcel, Status.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status2, null, hVar2);
                        return true;
                    case 2:
                        Status status3 = (Status) l6.a(parcel, Status.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status3, null, hVar2);
                        return true;
                    case 3:
                        Status status4 = (Status) l6.a(parcel, Status.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status4, null, hVar2);
                        return true;
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        Status status5 = (Status) l6.a(parcel, Status.CREATOR);
                        oa oaVar = (oa) l6.a(parcel, oa.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status5, oaVar, hVar2);
                        return true;
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        Status status6 = (Status) l6.a(parcel, Status.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status6, null, hVar2);
                        return true;
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        Status status7 = (Status) l6.a(parcel, Status.CREATOR);
                        qa qaVar = (qa) l6.a(parcel, qa.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status7, qaVar, hVar2);
                        return true;
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        Status status8 = (Status) l6.a(parcel, Status.CREATOR);
                        pa paVar = (pa) l6.a(parcel, pa.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status8, paVar, hVar2);
                        return true;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        Status status9 = (Status) l6.a(parcel, Status.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status9, null, hVar2);
                        return true;
                    case 9:
                        Status status10 = (Status) l6.a(parcel, Status.CREATOR);
                        ra raVar = (ra) l6.a(parcel, ra.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status10, raVar, hVar2);
                        return true;
                    case 10:
                        Status status11 = (Status) l6.a(parcel, Status.CREATOR);
                        oa oaVar2 = (oa) l6.a(parcel, oa.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status11, oaVar2, hVar2);
                        return true;
                    case 11:
                        Status status12 = (Status) l6.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        l6.d(parcel);
                        z7.b.K(status12, null, hVar2);
                        return true;
                    case 12:
                        Status status13 = (Status) l6.a(parcel, Status.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status13, null, hVar2);
                        return true;
                    case 13:
                        Status status14 = (Status) l6.a(parcel, Status.CREATOR);
                        ta taVar = (ta) l6.a(parcel, ta.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status14, taVar, hVar2);
                        return true;
                    case 14:
                        Status status15 = (Status) l6.a(parcel, Status.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status15, null, hVar2);
                        return true;
                    case 15:
                        Status status16 = (Status) l6.a(parcel, Status.CREATOR);
                        l6.d(parcel);
                        z7.b.K(status16, null, hVar2);
                        return true;
                    case 16:
                        Status status17 = (Status) l6.a(parcel, Status.CREATOR);
                        long j8 = parcel.readLong();
                        l6.d(parcel);
                        z7.b.K(status17, Long.valueOf(j8), hVar2);
                        return true;
                    default:
                        return false;
                }
            default:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                l6.d(parcel);
                p6 p6Var = new p6(this, bArrCreateByteArray2);
                q7.h hVar3 = (q7.h) this.f3195e;
                ((a7.s) hVar3.f10916v).execute(new o8.m(hVar3, p6Var, z2, 8));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(ya yaVar, q7.h hVar) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.f3195e = hVar;
    }

    public wa(o8.h hVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f3195e = hVar;
    }
}
