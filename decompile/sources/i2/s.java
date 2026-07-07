package i2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t1.b0;
import t1.d0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6452c;

    public s(String str, String str2, List list) {
        this.f6450a = str;
        this.f6451b = str2;
        this.f6452c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // t1.d0
    public final /* synthetic */ t1.o a() {
        return null;
    }

    @Override // t1.d0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f6450a, sVar.f6450a) && TextUtils.equals(this.f6451b, sVar.f6451b) && this.f6452c.equals(sVar.f6452c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6450a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6451b;
        return this.f6452c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strN;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f6450a;
        if (str != null) {
            StringBuilder sb3 = new StringBuilder(" [");
            sb3.append(str);
            sb3.append(", ");
            strN = j4.a.n(sb3, this.f6451b, "]");
        } else {
            strN = "";
        }
        sb2.append(strN);
        return sb2.toString();
    }

    @Override // t1.d0
    public final /* synthetic */ void b(b0 b0Var) {
    }
}
