package sb;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f11750d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11753c;

    public r(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f11750d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(d0.d.l("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f11751a = strSubstring;
        this.f11752b = str;
        this.f11753c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f11751a.equals(rVar.f11751a) && this.f11752b.equals(rVar.f11752b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11752b, this.f11751a});
    }
}
