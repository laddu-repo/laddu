package y7;

import a8.j;
import com.drake.net.exception.URLParseException;
import kotlin.jvm.internal.k;
import le.f;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public HttpUrl.Builder f15006a;

    /* renamed from: b, reason: collision with root package name */
    public t7.b f15007b;

    /* renamed from: c, reason: collision with root package name */
    public int f15008c;

    /* renamed from: d, reason: collision with root package name */
    public Request.Builder f15009d;

    /* renamed from: e, reason: collision with root package name */
    public OkHttpClient f15010e;

    public final Request a() {
        String str;
        Request.Builder builder = this.f15009d;
        switch (this.f15008c) {
            case 1:
                str = "GET";
                break;
            case 2:
                str = "HEAD";
                break;
            case 3:
                str = "OPTIONS";
                break;
            case 4:
                str = "TRACE";
                break;
            case 5:
                str = "POST";
                break;
            case 6:
                str = "DELETE";
                break;
            case 7:
                str = "PUT";
                break;
            case 8:
                str = "PATCH";
                break;
            default:
                throw null;
        }
        Request.Builder url = builder.method(str, null).url(this.f15006a.build());
        t7.b converter = this.f15007b;
        k.e(url, "<this>");
        k.e(converter, "converter");
        url.tag(t7.b.class, converter);
        return url.build();
    }

    public final void b(f fVar) {
        Request.Builder builder = this.f15009d;
        k.e(builder, "<this>");
        j jVar = null;
        if (fVar == null) {
            fVar = null;
        }
        if (fVar != null) {
            jVar = new j(fVar);
        }
        builder.tag(j.class, jVar);
    }

    public final void c(String str) {
        HttpUrl httpUrl;
        if (str != null) {
            httpUrl = HttpUrl.Companion.parse(str);
        } else {
            httpUrl = null;
        }
        if (httpUrl == null) {
            try {
                HttpUrl.Builder newBuilder = HttpUrl.Companion.get(p7.a.f10616b + str).newBuilder();
                k.e(newBuilder, "<set-?>");
                this.f15006a = newBuilder;
                return;
            } catch (Throwable th) {
                throw new URLParseException(r4.a.o(new StringBuilder(), p7.a.f10616b, str), th);
            }
        }
        HttpUrl.Builder newBuilder2 = httpUrl.newBuilder();
        k.e(newBuilder2, "<set-?>");
        this.f15006a = newBuilder2;
    }

    public final void d() {
        this.f15009d.tag(null);
    }
}
