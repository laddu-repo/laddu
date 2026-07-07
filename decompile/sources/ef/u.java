package ef;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ke.g f5042c = new ke.g("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ke.g f5043d = new ke.g(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f5045b;

    public u(String str, String str2, String str3, String[] strArr) {
        de.i.e(str, "mediaType");
        de.i.e(strArr, "parameterNamesAndValues");
        this.f5044a = str;
        this.f5045b = strArr;
    }

    public static Charset a(u uVar) {
        String str;
        String[] strArr = uVar.f5045b;
        int i = 0;
        int iU = android.support.v4.media.session.b.u(0, strArr.length - 1, 2);
        if (iU >= 0) {
            while (true) {
                String str2 = strArr[i];
                if (!(str2 == null ? false : str2.equalsIgnoreCase("charset"))) {
                    if (i == iU) {
                        break;
                    }
                    i += 2;
                } else {
                    str = strArr[i + 1];
                    break;
                }
            }
            str = null;
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && de.i.a(((u) obj).f5044a, this.f5044a);
    }

    public final int hashCode() {
        return this.f5044a.hashCode();
    }

    public final String toString() {
        return this.f5044a;
    }
}
