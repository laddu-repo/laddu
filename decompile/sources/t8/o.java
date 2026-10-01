package t8;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o extends g9.a implements w8.s {

    /* renamed from: f, reason: collision with root package name */
    public final int f12657f;

    public o(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        x.b(z10);
        this.f12657f = Arrays.hashCode(bArr);
    }

    public static byte[] K(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // g9.a
    public final boolean J(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 != 1) {
            if (i6 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f12657f);
            return true;
        }
        d9.a b10 = b();
        parcel2.writeNoException();
        i9.a.c(parcel2, b10);
        return true;
    }

    public abstract byte[] L();

    @Override // w8.s
    public final d9.a b() {
        return new d9.b(L());
    }

    public final boolean equals(Object obj) {
        d9.a b10;
        if (obj != null && (obj instanceof w8.s)) {
            try {
                w8.s sVar = (w8.s) obj;
                if (sVar.f() == this.f12657f && (b10 = sVar.b()) != null) {
                    return Arrays.equals(L(), (byte[]) d9.b.L(b10));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    @Override // w8.s
    public final int f() {
        return this.f12657f;
    }

    public final int hashCode() {
        return this.f12657f;
    }
}
