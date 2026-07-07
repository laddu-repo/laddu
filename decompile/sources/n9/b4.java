package n9;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b4 extends v3 {
    public static final boolean g1(String str) {
        String str2 = (String) e0.f9271t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.E().p()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.a4 e1(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b4.e1(java.lang.String):n9.a4");
    }

    public final String f1(String str) {
        h1 h1Var = this.f9511z.f9301x;
        e4.P(h1Var);
        String q12 = h1Var.q1(str);
        if (!TextUtils.isEmpty(q12)) {
            Uri parse = Uri.parse((String) e0.f9268r.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            String authority = parse.getAuthority();
            StringBuilder sb2 = new StringBuilder(String.valueOf(q12).length() + 1 + String.valueOf(authority).length());
            sb2.append(q12);
            sb2.append(".");
            sb2.append(authority);
            buildUpon.authority(sb2.toString());
            return buildUpon.build().toString();
        }
        return (String) e0.f9268r.a(null);
    }
}
