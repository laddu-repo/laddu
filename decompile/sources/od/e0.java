package od;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;
import okhttp3.Request;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10077x;

    public /* synthetic */ e0(int i6) {
        this.f10077x = i6;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        r7.i iVar;
        g5.c d02;
        String M;
        String M2;
        String M3;
        String M4;
        String M5;
        String M6;
        String M7;
        String M8;
        String M9;
        String M10;
        String M11;
        String M12;
        String M13;
        String M14;
        String M15;
        String M16;
        String M17;
        String M18;
        switch (this.f10077x) {
            case 0:
                return ((kd.h0) obj).A;
            case 1:
                y7.c cVar = (y7.c) obj;
                cVar.f15009d.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0");
                Request.Builder builder = cVar.f15009d;
                builder.header("accept", "*/*");
                OkHttpClient.Builder newBuilder = cVar.f15010e.newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                newBuilder.connectTimeout(20L, timeUnit);
                newBuilder.readTimeout(60L, timeUnit);
                newBuilder.writeTimeout(60L, timeUnit);
                newBuilder.callTimeout(90L, timeUnit);
                newBuilder.retryOnConnectionFailure(true);
                x7.a.a(newBuilder);
                OkHttpClient value = newBuilder.build();
                kotlin.jvm.internal.k.e(value, "value");
                List<Interceptor> interceptors = value.interceptors();
                u7.c cVar2 = u7.c.f12949a;
                if (!interceptors.contains(cVar2)) {
                    value = value.newBuilder().addInterceptor(cVar2).build();
                }
                cVar.f15010e = value;
                Cache cache = value.cache();
                if (cache != null) {
                    DiskLruCache diskLruCache = OkHttpUtils.diskLruCache(cache);
                    kotlin.jvm.internal.k.d(diskLruCache, "diskLruCache(it)");
                    iVar = new r7.i(diskLruCache);
                } else {
                    iVar = null;
                }
                builder.tag(r7.i.class, iVar);
                return he.y.f6101a;
            case 2:
                y7.c cVar3 = (y7.c) obj;
                CacheControl cacheControl = CacheControl.FORCE_NETWORK;
                cVar3.getClass();
                kotlin.jvm.internal.k.e(cacheControl, "cacheControl");
                cVar3.f15009d.cacheControl(cacheControl);
                return he.y.f6101a;
            case 3:
                g5.a _connection = (g5.a) obj;
                kotlin.jvm.internal.k.e(_connection, "_connection");
                d02 = _connection.d0("SELECT * FROM playlistFav ORDER BY id DESC");
                try {
                    int p10 = jb.b.p(d02, MediationMetaData.KEY_NAME);
                    int p11 = jb.b.p(d02, "groupTitle");
                    int p12 = jb.b.p(d02, "logo");
                    int p13 = jb.b.p(d02, "link");
                    int p14 = jb.b.p(d02, "userAgent");
                    int p15 = jb.b.p(d02, "referrer");
                    int p16 = jb.b.p(d02, "origin");
                    int p17 = jb.b.p(d02, "cookie");
                    int p18 = jb.b.p(d02, "drmLicense");
                    int p19 = jb.b.p(d02, "drmScheme");
                    int p20 = jb.b.p(d02, "id");
                    ArrayList arrayList = new ArrayList();
                    while (d02.X()) {
                        Integer num = null;
                        if (d02.isNull(p10)) {
                            M = null;
                        } else {
                            M = d02.M(p10);
                        }
                        if (d02.isNull(p11)) {
                            M2 = null;
                        } else {
                            M2 = d02.M(p11);
                        }
                        if (d02.isNull(p12)) {
                            M3 = null;
                        } else {
                            M3 = d02.M(p12);
                        }
                        String M19 = d02.M(p13);
                        if (d02.isNull(p14)) {
                            M4 = null;
                        } else {
                            M4 = d02.M(p14);
                        }
                        if (d02.isNull(p15)) {
                            M5 = null;
                        } else {
                            M5 = d02.M(p15);
                        }
                        if (d02.isNull(p16)) {
                            M6 = null;
                        } else {
                            M6 = d02.M(p16);
                        }
                        if (d02.isNull(p17)) {
                            M7 = null;
                        } else {
                            M7 = d02.M(p17);
                        }
                        if (d02.isNull(p18)) {
                            M8 = null;
                        } else {
                            M8 = d02.M(p18);
                        }
                        if (d02.isNull(p19)) {
                            M9 = null;
                        } else {
                            M9 = d02.M(p19);
                        }
                        if (!d02.isNull(p20)) {
                            num = Integer.valueOf((int) d02.getLong(p20));
                        }
                        arrayList.add(new kd.h0(M, M2, M3, M19, M4, M5, M6, M7, M8, M9, num));
                    }
                    return arrayList;
                } finally {
                }
            case 4:
                g5.a _connection2 = (g5.a) obj;
                kotlin.jvm.internal.k.e(_connection2, "_connection");
                d02 = _connection2.d0("SELECT * FROM playlistFav ORDER BY id DESC");
                try {
                    int p21 = jb.b.p(d02, MediationMetaData.KEY_NAME);
                    int p22 = jb.b.p(d02, "groupTitle");
                    int p23 = jb.b.p(d02, "logo");
                    int p24 = jb.b.p(d02, "link");
                    int p25 = jb.b.p(d02, "userAgent");
                    int p26 = jb.b.p(d02, "referrer");
                    int p27 = jb.b.p(d02, "origin");
                    int p28 = jb.b.p(d02, "cookie");
                    int p29 = jb.b.p(d02, "drmLicense");
                    int p30 = jb.b.p(d02, "drmScheme");
                    int p31 = jb.b.p(d02, "id");
                    ArrayList arrayList2 = new ArrayList();
                    while (d02.X()) {
                        Integer num2 = null;
                        if (d02.isNull(p21)) {
                            M10 = null;
                        } else {
                            M10 = d02.M(p21);
                        }
                        if (d02.isNull(p22)) {
                            M11 = null;
                        } else {
                            M11 = d02.M(p22);
                        }
                        if (d02.isNull(p23)) {
                            M12 = null;
                        } else {
                            M12 = d02.M(p23);
                        }
                        String M20 = d02.M(p24);
                        if (d02.isNull(p25)) {
                            M13 = null;
                        } else {
                            M13 = d02.M(p25);
                        }
                        if (d02.isNull(p26)) {
                            M14 = null;
                        } else {
                            M14 = d02.M(p26);
                        }
                        if (d02.isNull(p27)) {
                            M15 = null;
                        } else {
                            M15 = d02.M(p27);
                        }
                        if (d02.isNull(p28)) {
                            M16 = null;
                        } else {
                            M16 = d02.M(p28);
                        }
                        if (d02.isNull(p29)) {
                            M17 = null;
                        } else {
                            M17 = d02.M(p29);
                        }
                        if (d02.isNull(p30)) {
                            M18 = null;
                        } else {
                            M18 = d02.M(p30);
                        }
                        if (!d02.isNull(p31)) {
                            num2 = Integer.valueOf((int) d02.getLong(p31));
                        }
                        arrayList2.add(new kd.h0(M10, M11, M12, M20, M13, M14, M15, M16, M17, M18, num2));
                    }
                    return arrayList2;
                } finally {
                }
            case 5:
                g5.c it = (g5.c) obj;
                kotlin.jvm.internal.k.e(it, "it");
                return Boolean.valueOf(it.X());
            case 6:
                g5.c statement = (g5.c) obj;
                kotlin.jvm.internal.k.e(statement, "statement");
                je.i iVar2 = new je.i();
                while (statement.X()) {
                    iVar2.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return android.support.v4.media.session.b.c(iVar2);
            case 7:
                uf.a buildSerialDescriptor = (uf.a) obj;
                kotlin.jvm.internal.k.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                uf.a.a(buildSerialDescriptor, "JsonPrimitive", new xf.n(new d.a0(22)));
                uf.a.a(buildSerialDescriptor, "JsonNull", new xf.n(new d.a0(23)));
                uf.a.a(buildSerialDescriptor, "JsonLiteral", new xf.n(new d.a0(24)));
                uf.a.a(buildSerialDescriptor, "JsonObject", new xf.n(new d.a0(25)));
                uf.a.a(buildSerialDescriptor, "JsonArray", new xf.n(new d.a0(26)));
                return he.y.f6101a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.k.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                xf.k kVar = (xf.k) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                yf.w.a(sb2, str);
                sb2.append(':');
                sb2.append(kVar);
                return sb2.toString();
        }
    }
}
