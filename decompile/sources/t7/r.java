package t7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends u7.a {
    public static final Parcelable.Creator<r> CREATOR = new m8.c(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12398v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Account f12399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12400x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final GoogleSignInAccount f12401y;

    public r(int i, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f12398v = i;
        this.f12399w = account;
        this.f12400x = i10;
        this.f12401y = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = com.bumptech.glide.d.c0(parcel, 20293);
        com.bumptech.glide.d.b0(parcel, 1, 4);
        parcel.writeInt(this.f12398v);
        com.bumptech.glide.d.X(parcel, 2, this.f12399w, i);
        com.bumptech.glide.d.b0(parcel, 3, 4);
        parcel.writeInt(this.f12400x);
        com.bumptech.glide.d.X(parcel, 4, this.f12401y, i);
        com.bumptech.glide.d.d0(parcel, iC0);
    }
}
