package a2;

import android.os.Looper;
import com.playfy.tv.activities.PlayerActivity;
import com.unity3d.services.core.di.ServiceProvider;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final PlayerActivity f419a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.v f420b;

    /* renamed from: c, reason: collision with root package name */
    public cb.l f421c;

    /* renamed from: d, reason: collision with root package name */
    public final r f422d;

    /* renamed from: e, reason: collision with root package name */
    public cb.l f423e;

    /* renamed from: f, reason: collision with root package name */
    public final r f424f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f425g;

    /* renamed from: h, reason: collision with root package name */
    public final int f426h;

    /* renamed from: i, reason: collision with root package name */
    public final r1.d f427i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f428k;

    /* renamed from: l, reason: collision with root package name */
    public final c2 f429l;

    /* renamed from: m, reason: collision with root package name */
    public final b2 f430m;

    /* renamed from: n, reason: collision with root package name */
    public final long f431n;

    /* renamed from: o, reason: collision with root package name */
    public final long f432o;

    /* renamed from: p, reason: collision with root package name */
    public final long f433p;

    /* renamed from: q, reason: collision with root package name */
    public final j f434q;

    /* renamed from: r, reason: collision with root package name */
    public final long f435r;
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f436t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f437u;

    /* renamed from: v, reason: collision with root package name */
    public final String f438v;

    public u(PlayerActivity playerActivity) {
        r rVar = new r(playerActivity, 0);
        r rVar2 = new r(playerActivity, 1);
        r rVar3 = new r(playerActivity, 2);
        r rVar4 = new r(playerActivity, 3);
        this.f419a = playerActivity;
        this.f421c = rVar;
        this.f422d = rVar2;
        this.f423e = rVar3;
        this.f424f = rVar4;
        String str = u1.a0.f12750a;
        Looper myLooper = Looper.myLooper();
        this.f425g = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f427i = r1.d.f11342h;
        this.j = 1;
        this.f428k = true;
        this.f429l = c2.f191c;
        this.f431n = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
        this.f432o = 15000L;
        this.f433p = 3000L;
        this.f430m = b2.f168b;
        this.f434q = new j(u1.a0.Q(20L), u1.a0.Q(500L));
        this.f420b = u1.v.f12817a;
        this.f435r = 500L;
        this.s = 2000L;
        this.f436t = true;
        this.f438v = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f426h = -1000;
        new ua.f();
    }
}
