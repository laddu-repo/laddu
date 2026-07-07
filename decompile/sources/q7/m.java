package q7;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import t7.l0;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends f8.g implements l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10922e;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        y.b(bArr.length == 25);
        this.f10922e = Arrays.hashCode(bArr);
    }

    public static byte[] K(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // f8.g
    public final boolean I(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a8.a aVarD = d();
            parcel2.writeNoException();
            f8.h.b(parcel2, aVarD);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f10922e);
        return true;
    }

    public abstract byte[] J();

    @Override // t7.l0
    public final int a() {
        return this.f10922e;
    }

    @Override // t7.l0
    public final a8.a d() {
        return new a8.b(J());
    }

    public final boolean equals(Object obj) {
        a8.a aVarD;
        if (obj instanceof l0) {
            try {
                l0 l0Var = (l0) obj;
                if (l0Var.a() == this.f10922e && (aVarD = l0Var.d()) != null) {
                    return Arrays.equals(J(), (byte[]) a8.b.K(aVarD));
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10922e;
    }
}
