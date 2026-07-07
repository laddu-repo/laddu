package q0;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f10797a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10798b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10799c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10800d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10801e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10802f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10803g;

    public d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f10797a = str;
        str2.getClass();
        this.f10798b = str2;
        this.f10799c = str3;
        list.getClass();
        this.f10800d = list;
        this.f10801e = str4;
        this.f10802f = str5;
        this.f10803g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f10797a + ", mProviderPackage: " + this.f10798b + ", mQuery: " + this.f10799c + ", mSystemFont: " + this.f10801e + ", mVariationSettings: " + this.f10802f + ", mCertificates:");
        int i6 = 0;
        while (true) {
            List list = this.f10800d;
            if (i6 < list.size()) {
                sb2.append(" [");
                List list2 = (List) list.get(i6);
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i6++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
