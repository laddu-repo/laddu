package x7;

import java.util.List;
import kotlin.jvm.internal.k;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import u7.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {
    public static final void a(OkHttpClient.Builder builder) {
        k.e(builder, "<this>");
        List<Interceptor> interceptors = builder.interceptors();
        c cVar = c.f12949a;
        if (!interceptors.contains(cVar)) {
            builder.addInterceptor(cVar);
        }
    }
}
