package wb;

import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o8.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final long i = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f13977j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb.d f13978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb.b f13979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f13980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f13981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f13982e;
    public final ConfigFetchHttpClient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f13983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f13984h;

    public g(nb.d dVar, mb.b bVar, Executor executor, Random random, c cVar, ConfigFetchHttpClient configFetchHttpClient, l lVar, HashMap map) {
        this.f13978a = dVar;
        this.f13979b = bVar;
        this.f13980c = executor;
        this.f13981d = random;
        this.f13982e = cVar;
        this.f = configFetchHttpClient;
        this.f13983g = lVar;
        this.f13984h = map;
    }

    public final f a(String str, String str2, Date date, HashMap map) throws vb.f, vb.e, vb.c {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f;
            HashMap mapD = d();
            String string = this.f13983g.f14011a.getString("last_fetch_etag", null);
            ja.b bVar = (ja.b) this.f13979b.get();
            f fVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, bVar != null ? (Long) ((ja.c) bVar).f7002a.f3300a.a(null, null, true).get("_fot") : null, date, this.f13983g.b());
            e eVar = fVarFetch.f13975b;
            if (eVar != null) {
                l lVar = this.f13983g;
                long j8 = eVar.f;
                synchronized (lVar.f14012b) {
                    lVar.f14011a.edit().putLong("last_template_version", j8).apply();
                }
            }
            String str4 = fVarFetch.f13976c;
            if (str4 != null) {
                this.f13983g.e(str4);
            }
            this.f13983g.d(0, l.f);
            return fVarFetch;
        } catch (vb.f e7) {
            int i10 = e7.f13576v;
            l lVar2 = this.f13983g;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = lVar2.a().f14008a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f13977j;
                long millis = timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]);
                lVar2.d(i11, new Date(date.getTime() + (millis / 2) + ((long) this.f13981d.nextInt((int) millis))));
            }
            k kVarA = lVar2.a();
            int i12 = e7.f13576v;
            if (kVarA.f14008a > 1 || i12 == 429) {
                kVarA.f14009b.getTime();
                throw new vb.e("Fetch was throttled.");
            }
            if (i12 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i12 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i12 == 429) {
                    throw new vb.c("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new vb.f(e7.f13576v, "Fetch failed: ".concat(str3), e7);
        }
    }

    public final o b(o oVar, long j8, HashMap map) {
        o oVarF;
        Date date = new Date(System.currentTimeMillis());
        boolean zJ = oVar.j();
        l lVar = this.f13983g;
        if (zJ) {
            Date date2 = new Date(lVar.f14011a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(l.f14010e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j8) + date2.getTime()))) {
                return b8.h.o(new f(2, null, null));
            }
        }
        Date date3 = lVar.a().f14009b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f13980c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            oVarF = b8.h.n(new vb.e(str));
        } else {
            nb.c cVar = (nb.c) this.f13978a;
            o oVarD = cVar.d();
            o oVarE = cVar.e();
            oVarF = b8.h.P(oVarD, oVarE).f(executor, new uc.a(this, oVarD, oVarE, date, map));
        }
        return oVarF.f(executor, new androidx.fragment.app.e(20, this, date));
    }

    public final o c(int i10) {
        HashMap map = new HashMap(this.f13984h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i10);
        return this.f13982e.b().f(this.f13980c, new androidx.fragment.app.e(19, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        ja.b bVar = (ja.b) this.f13979b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((ja.c) bVar).f7002a.f3300a.a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
