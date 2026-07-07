package fd;

import android.os.Bundle;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f5223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5224b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5225c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5226d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcelable[] f5227e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f5228f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5229g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5230h;

    public z(String slug, int i6, int i10, boolean z10, Parcelable[] parcelableArr, Serializable serializable, String str, String str2) {
        kotlin.jvm.internal.k.e(slug, "slug");
        this.f5223a = slug;
        this.f5224b = i6;
        this.f5225c = i10;
        this.f5226d = z10;
        this.f5227e = parcelableArr;
        this.f5228f = serializable;
        this.f5229g = str;
        this.f5230h = str2;
    }

    public static z a(z zVar, String slug, int i6, int i10) {
        int i11;
        if ((i10 & 4) != 0) {
            i11 = zVar.f5225c;
        } else {
            i11 = 0;
        }
        boolean z10 = zVar.f5226d;
        Parcelable[] parcelableArr = zVar.f5227e;
        Serializable serializable = zVar.f5228f;
        String str = zVar.f5229g;
        String str2 = zVar.f5230h;
        zVar.getClass();
        kotlin.jvm.internal.k.e(slug, "slug");
        return new z(slug, i6, i11, z10, parcelableArr, serializable, str, str2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("slug", this.f5223a);
        bundle.putInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE, this.f5224b);
        bundle.putInt("selected", this.f5225c);
        bundle.putBoolean("isLive", this.f5226d);
        bundle.putParcelableArray("related", this.f5227e);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Serializable.class);
        Serializable serializable = this.f5228f;
        if (isAssignableFrom) {
            bundle.putParcelable("headers", (Parcelable) serializable);
        } else if (Serializable.class.isAssignableFrom(Serializable.class)) {
            bundle.putSerializable("headers", serializable);
        }
        bundle.putString("dt", this.f5229g);
        bundle.putString("dl", this.f5230h);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (kotlin.jvm.internal.k.a(this.f5223a, zVar.f5223a) && this.f5224b == zVar.f5224b && this.f5225c == zVar.f5225c && this.f5226d == zVar.f5226d && kotlin.jvm.internal.k.a(this.f5227e, zVar.f5227e) && kotlin.jvm.internal.k.a(this.f5228f, zVar.f5228f) && kotlin.jvm.internal.k.a(this.f5229g, zVar.f5229g) && kotlin.jvm.internal.k.a(this.f5230h, zVar.f5230h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((this.f5223a.hashCode() * 31) + this.f5224b) * 31) + this.f5225c) * 31;
        if (this.f5226d) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int i10 = (hashCode4 + i6) * 31;
        int i11 = 0;
        Parcelable[] parcelableArr = this.f5227e;
        if (parcelableArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(parcelableArr);
        }
        int i12 = (i10 + hashCode) * 31;
        Serializable serializable = this.f5228f;
        if (serializable == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = serializable.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.f5229g;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.f5230h;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i14 + i11;
    }

    public final String toString() {
        return "PlayerActivityArgs(slug=" + this.f5223a + ", type=" + this.f5224b + ", selected=" + this.f5225c + ", isLive=" + this.f5226d + ", related=" + Arrays.toString(this.f5227e) + ", headers=" + this.f5228f + ", dt=" + this.f5229g + ", dl=" + this.f5230h + ")";
    }

    public /* synthetic */ z(String str, int i6, int i10, boolean z10, Parcelable[] parcelableArr, HashMap hashMap, String str2, String str3, int i11) {
        this((i11 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i11 & 2) != 0 ? 1 : i6, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? null : parcelableArr, (i11 & 32) != 0 ? null : hashMap, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3);
    }
}
