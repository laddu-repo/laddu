package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.y;
import u7.a;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new android.support.v4.media.a(29);
    public String A;
    public final long B;
    public final String C;
    public final List D;
    public final String E;
    public final String F;
    public final HashSet G = new HashSet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f2451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f2452x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f2453y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Uri f2454z;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2450v = str;
        this.f2451w = str2;
        this.f2452x = str3;
        this.f2453y = str4;
        this.f2454z = uri;
        this.A = str5;
        this.B = j8;
        this.C = str6;
        this.D = arrayList;
        this.E = str7;
        this.F = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j8 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        y.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j8, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.A = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.C.equals(this.C)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.D);
        hashSet.addAll(googleSignInAccount.G);
        HashSet hashSet2 = new HashSet(this.D);
        hashSet2.addAll(this.G);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.C.hashCode() + 527;
        HashSet hashSet = new HashSet(this.D);
        hashSet.addAll(this.G);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC0 = d.c0(parcel, 20293);
        d.Y(parcel, 2, this.f2450v);
        d.Y(parcel, 3, this.f2451w);
        d.Y(parcel, 4, this.f2452x);
        d.Y(parcel, 5, this.f2453y);
        d.X(parcel, 6, this.f2454z, i);
        d.Y(parcel, 7, this.A);
        d.b0(parcel, 8, 8);
        parcel.writeLong(this.B);
        d.Y(parcel, 9, this.C);
        d.a0(parcel, 10, this.D);
        d.Y(parcel, 11, this.E);
        d.Y(parcel, 12, this.F);
        d.d0(parcel, iC0);
    }
}
