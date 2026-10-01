package r7;

import bg.f0;
import bg.n;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import kotlin.jvm.internal.k;
import okhttp3.Request;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d {
    public static String a(Request request) {
        k.e(request, "request");
        r4.a.t(request.tag(a8.a.class));
        String str = request.method() + request.url();
        n nVar = n.A;
        return l.u(str).c(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).e();
    }

    public static int b(f0 f0Var) {
        try {
            long u3 = f0Var.u();
            String x10 = f0Var.x(Long.MAX_VALUE);
            if (u3 >= 0 && u3 <= 2147483647L && x10.length() <= 0) {
                return (int) u3;
            }
            throw new IOException("expected an int but was \"" + u3 + x10 + '\"');
        } catch (NumberFormatException e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
