package nc;

import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import j2.u;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name */
    public static final long f9630i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final cc.e f9631a;

    /* renamed from: b, reason: collision with root package name */
    public final bc.a f9632b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9633c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f9634d;

    /* renamed from: e, reason: collision with root package name */
    public final e f9635e;

    /* renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f9636f;

    /* renamed from: g, reason: collision with root package name */
    public final o f9637g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f9638h;

    public j(cc.e eVar, bc.a aVar, Executor executor, Random random, e eVar2, ConfigFetchHttpClient configFetchHttpClient, o oVar, HashMap hashMap) {
        this.f9631a = eVar;
        this.f9632b = aVar;
        this.f9633c = executor;
        this.f9634d = random;
        this.f9635e = eVar2;
        this.f9636f = configFetchHttpClient;
        this.f9637g = oVar;
        this.f9638h = hashMap;
    }

    public final i a(String str, String str2, Date date, HashMap hashMap) {
        String str3;
        try {
            HttpURLConnection b10 = this.f9636f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f9636f;
            HashMap d10 = d();
            Long l10 = null;
            String string = this.f9637g.f9666a.getString("last_fetch_etag", null);
            nb.b bVar = (nb.b) this.f9632b.get();
            if (bVar != null) {
                l10 = (Long) ((l1) ((nb.c) bVar).f9588a.f12916y).a(null, null, true).get("_fot");
            }
            i fetch = configFetchHttpClient.fetch(b10, str, str2, d10, string, hashMap, l10, date, this.f9637g.b());
            g gVar = fetch.f9628b;
            if (gVar != null) {
                o oVar = this.f9637g;
                long j10 = gVar.f9622f;
                synchronized (oVar.f9667b) {
                    oVar.f9666a.edit().putLong("last_template_version", j10).apply();
                }
            }
            String str4 = fetch.f9629c;
            if (str4 != null) {
                this.f9637g.e(str4);
            }
            this.f9637g.d(0, o.f9665f);
            return fetch;
        } catch (mc.h e10) {
            int i6 = e10.f8811x;
            o oVar2 = this.f9637g;
            if (i6 == 429 || i6 == 502 || i6 == 503 || i6 == 504) {
                int i10 = oVar2.a().f9662a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                oVar2.d(i10, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f9634d.nextInt((int) r3)));
            }
            n a10 = oVar2.a();
            int i11 = e10.f8811x;
            if (a10.f9662a <= 1 && i11 != 429) {
                if (i11 != 401) {
                    if (i11 != 403) {
                        if (i11 != 429) {
                            if (i11 != 500) {
                                switch (i11) {
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
                        } else {
                            throw new jb.i("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new mc.h(e10.f8811x, "Fetch failed: ".concat(str3), e10);
            }
            a10.f9663b.getTime();
            throw new jb.i("Fetch was throttled.");
        }
    }

    public final s9.n b(Task task, long j10, final HashMap hashMap) {
        s9.n d10;
        boolean before;
        final Date date = new Date(System.currentTimeMillis());
        boolean h4 = task.h();
        Date date2 = null;
        o oVar = this.f9637g;
        if (h4) {
            Date date3 = new Date(oVar.f9666a.getLong("last_fetch_time_in_millis", -1L));
            if (date3.equals(o.f9664e)) {
                before = false;
            } else {
                before = date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date3.getTime()));
            }
            if (before) {
                return dg.b.j(new i(2, null, null));
            }
        }
        Date date4 = oVar.a().f9663b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = this.f9633c;
        if (date2 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()));
            date2.getTime();
            d10 = dg.b.i(new jb.i(str));
        } else {
            cc.d dVar = (cc.d) this.f9631a;
            final s9.n d11 = dVar.d();
            final s9.n e10 = dVar.e();
            d10 = dg.b.r(d11, e10).d(executor, new s9.a() { // from class: nc.h
                @Override // s9.a
                public final Object e(Task task2) {
                    s9.n k8;
                    j jVar = j.this;
                    Date date5 = date;
                    HashMap hashMap2 = hashMap;
                    Task task3 = d11;
                    if (!task3.h()) {
                        return dg.b.i(new jb.i("Firebase Installations failed to get installation ID for fetch.", task3.e()));
                    }
                    Task task4 = e10;
                    if (!task4.h()) {
                        return dg.b.i(new jb.i("Firebase Installations failed to get installation auth token for fetch.", task4.e()));
                    }
                    try {
                        i a10 = jVar.a((String) task3.f(), ((cc.a) task4.f()).f2019a, date5, hashMap2);
                        if (a10.f9627a != 0) {
                            k8 = dg.b.j(a10);
                        } else {
                            k8 = jVar.f9635e.e(a10.f9628b).k(jVar.f9633c, new u(a10, 8));
                        }
                        return k8;
                    } catch (mc.f e11) {
                        return dg.b.i(e11);
                    }
                }
            });
        }
        return d10.d(executor, new b2.b(16, this, date));
    }

    public final s9.n c(int i6) {
        HashMap hashMap = new HashMap(this.f9638h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i6);
        return this.f9635e.b().d(this.f9633c, new b2.b(15, this, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        nb.b bVar = (nb.b) this.f9632b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((l1) ((nb.c) bVar).f9588a.f12916y).a(null, null, false).entrySet()) {
                hashMap.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }
}
