package okhttp3;

import bg.n;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.k;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String username, String password) {
        k.e(username, "username");
        k.e(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset ISO_8859_1, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            k.d(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }

    public static final String basic(String username, String password, Charset charset) {
        k.e(username, "username");
        k.e(password, "password");
        k.e(charset, "charset");
        String str = username + ':' + password;
        n nVar = n.A;
        k.e(str, "<this>");
        byte[] bytes = str.getBytes(charset);
        k.d(bytes, "getBytes(...)");
        return a.k("Basic ", new n(bytes).a());
    }
}
