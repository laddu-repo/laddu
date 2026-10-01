package g2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import r1.g0;
import r1.i0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5390a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5391b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5392c;

    public s(String str, String str2, List list) {
        this.f5390a = str;
        this.f5391b = str2;
        this.f5392c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // r1.i0
    public final /* synthetic */ r1.q a() {
        return null;
    }

    @Override // r1.i0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f5390a, sVar.f5390a) && TextUtils.equals(this.f5391b, sVar.f5391b) && this.f5392c.equals(sVar.f5392c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = 0;
        String str = this.f5390a;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = i6 * 31;
        String str2 = this.f5391b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.f5392c.hashCode() + ((i11 + i10) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f5390a;
        if (str2 != null) {
            str = r4.a.o(r4.a.q(" [", str2, ", "), this.f5391b, "]");
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // r1.i0
    public final /* synthetic */ void b(g0 g0Var) {
    }
}
