package m2;

import android.net.Uri;
import db.c1;
import db.k0;
import db.q1;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f8422a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f8423b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8424c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f8425d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f8426e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f8427f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final String f8428g = new String(new byte[]{10});

    /* renamed from: h, reason: collision with root package name */
    public static final String f8429h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c10 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c10 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c10 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c10 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c10 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c10 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c10 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case '\b':
                return 5;
            case '\t':
                return 10;
            case '\n':
                return 1;
            case 11:
                return 2;
            default:
                return 0;
        }
    }

    public static c1 b(String str) {
        if (str == null) {
            db.i0 i0Var = k0.f4008y;
            return c1.B;
        }
        db.r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String str2 = u1.a0.f12750a;
        int i6 = 0;
        for (String str3 : str.split(",\\s?", -1)) {
            int a10 = a(str3);
            if (a10 != 0) {
                Integer valueOf = Integer.valueOf(a10);
                int i10 = i6 + 1;
                int f3 = db.e0.f(objArr.length, i10);
                if (f3 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, f3);
                }
                objArr[i6] = valueOf;
                i6 = i10;
            }
        }
        return k0.h(i6, objArr);
    }

    public static d2.i c(String str) {
        long parseInt;
        Matcher matcher = f8425d.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            if (matcher.group(2) != null) {
                try {
                    parseInt = Integer.parseInt(r0) * 1000;
                } catch (NumberFormatException e10) {
                    throw l0.b(str, e10);
                }
            } else {
                parseInt = 60000;
            }
            return new d2.i(group, parseInt, 4);
        }
        throw l0.b(str, null);
    }

    public static e2.u d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo != null && userInfo.contains(":")) {
            String str = u1.a0.f12750a;
            String[] split = userInfo.split(":", 2);
            return new e2.u(3, split[0], split[1]);
        }
        return null;
    }

    public static s8.n e(String str) {
        Matcher matcher = f8426e.matcher(str);
        boolean find = matcher.find();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (find) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            if (group3 != null) {
                str2 = group3;
            }
            return new s8.n(2, group, group2, str2);
        }
        Matcher matcher2 = f8427f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new s8.n(1, group4, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        throw l0.b("Invalid WWW-Authenticate header " + str, null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [db.e0, db.h0] */
    public static c1 f(b0 b0Var) {
        boolean z10;
        if (b0Var.f8436c.b("CSeq") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        ?? e0Var = new db.e0(4);
        Object[] objArr = {g(b0Var.f8435b), b0Var.f8434a, "RTSP/1.0"};
        String str = u1.a0.f12750a;
        e0Var.a(String.format(Locale.US, "%s %s %s", objArr));
        db.l0 l0Var = b0Var.f8436c.f8527a;
        q1 it = l0Var.A.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            k0 d10 = l0Var.d(str2);
            for (int i6 = 0; i6 < d10.size(); i6++) {
                e0Var.a(String.format(Locale.US, "%s: %s", str2, d10.get(i6)));
            }
        }
        e0Var.a(HttpUrl.FRAGMENT_ENCODE_SET);
        e0Var.a(b0Var.f8437d);
        return e0Var.g();
    }

    public static String g(int i6) {
        switch (i6) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
