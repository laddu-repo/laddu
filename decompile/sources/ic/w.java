package ic;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f6794d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f6795a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6796b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6797c;

    public w(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && f6794d.matcher(str3).matches()) {
            this.f6795a = str3;
            this.f6796b = str;
            this.f6797c = str + "!" + str2;
            return;
        }
        throw new IllegalArgumentException(h8.c.m("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f6795a.equals(wVar.f6795a) || !this.f6796b.equals(wVar.f6796b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6796b, this.f6795a});
    }
}
