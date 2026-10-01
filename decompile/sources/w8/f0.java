package w8;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14181a;

    public static void a(h hVar, Parcel parcel, int i6) {
        int A = a.a.A(parcel, 20293);
        int i10 = hVar.f14189x;
        a.a.D(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = hVar.f14190y;
        a.a.D(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = hVar.f14191z;
        a.a.D(parcel, 3, 4);
        parcel.writeInt(i12);
        a.a.w(parcel, 4, hVar.A);
        a.a.u(parcel, 5, hVar.B);
        a.a.x(parcel, 6, hVar.C, i6);
        a.a.t(parcel, 7, hVar.D);
        a.a.v(parcel, 8, hVar.E, i6);
        a.a.x(parcel, 10, hVar.F, i6);
        a.a.x(parcel, 11, hVar.G, i6);
        boolean z10 = hVar.H;
        a.a.D(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = hVar.I;
        a.a.D(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z11 = hVar.J;
        a.a.D(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        a.a.w(parcel, 15, hVar.K);
        a.a.C(parcel, A);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [w9.b, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14181a) {
            case 0:
                int z10 = s1.c.z(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = h.L;
                String str = null;
                IBinder iBinder = null;
                Account account = null;
                String str2 = null;
                t8.d[] dVarArr = h.M;
                t8.d[] dVarArr2 = dVarArr;
                int i6 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z11 = false;
                int i12 = 0;
                boolean z12 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i6 = s1.c.r(parcel, readInt);
                            break;
                        case 2:
                            i10 = s1.c.r(parcel, readInt);
                            break;
                        case 3:
                            i11 = s1.c.r(parcel, readInt);
                            break;
                        case 4:
                            str = s1.c.h(parcel, readInt);
                            break;
                        case 5:
                            int t10 = s1.c.t(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (t10 == 0) {
                                iBinder = null;
                                break;
                            } else {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition + t10);
                                iBinder = readStrongBinder;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) s1.c.i(parcel, readInt, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = s1.c.f(parcel, readInt);
                            break;
                        case '\b':
                            account = (Account) s1.c.g(parcel, readInt, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            s1.c.y(parcel, readInt);
                            break;
                        case '\n':
                            dVarArr = (t8.d[]) s1.c.i(parcel, readInt, t8.d.CREATOR);
                            break;
                        case 11:
                            dVarArr2 = (t8.d[]) s1.c.i(parcel, readInt, t8.d.CREATOR);
                            break;
                        case '\f':
                            z11 = s1.c.q(parcel, readInt);
                            break;
                        case '\r':
                            i12 = s1.c.r(parcel, readInt);
                            break;
                        case 14:
                            z12 = s1.c.q(parcel, readInt);
                            break;
                        case 15:
                            str2 = s1.c.h(parcel, readInt);
                            break;
                    }
                }
                s1.c.k(parcel, z10);
                return new h(i6, i10, i11, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z11, i12, z12, str2);
            default:
                ?? obj = new Object();
                obj.F = 255;
                obj.H = -2;
                obj.I = -2;
                obj.J = -2;
                obj.Q = Boolean.TRUE;
                obj.f14241x = parcel.readInt();
                obj.f14242y = (Integer) parcel.readSerializable();
                obj.f14243z = (Integer) parcel.readSerializable();
                obj.A = (Integer) parcel.readSerializable();
                obj.B = (Integer) parcel.readSerializable();
                obj.C = (Integer) parcel.readSerializable();
                obj.D = (Integer) parcel.readSerializable();
                obj.E = (Integer) parcel.readSerializable();
                obj.F = parcel.readInt();
                obj.G = parcel.readString();
                obj.H = parcel.readInt();
                obj.I = parcel.readInt();
                obj.J = parcel.readInt();
                obj.L = parcel.readString();
                obj.M = parcel.readString();
                obj.N = parcel.readInt();
                obj.P = (Integer) parcel.readSerializable();
                obj.R = (Integer) parcel.readSerializable();
                obj.S = (Integer) parcel.readSerializable();
                obj.T = (Integer) parcel.readSerializable();
                obj.U = (Integer) parcel.readSerializable();
                obj.V = (Integer) parcel.readSerializable();
                obj.W = (Integer) parcel.readSerializable();
                obj.Z = (Integer) parcel.readSerializable();
                obj.X = (Integer) parcel.readSerializable();
                obj.Y = (Integer) parcel.readSerializable();
                obj.Q = (Boolean) parcel.readSerializable();
                obj.K = (Locale) parcel.readSerializable();
                obj.f14239a0 = (Boolean) parcel.readSerializable();
                obj.f14240b0 = (Integer) parcel.readSerializable();
                return obj;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.f14181a) {
            case 0:
                return new h[i6];
            default:
                return new w9.b[i6];
        }
    }
}
