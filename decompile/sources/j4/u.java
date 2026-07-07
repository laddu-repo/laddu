package j4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final MediaSession f7208a;

    /* renamed from: b, reason: collision with root package name */
    public final t f7209b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f7210c;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f7212e;

    /* renamed from: g, reason: collision with root package name */
    public k0 f7214g;

    /* renamed from: h, reason: collision with root package name */
    public List f7215h;

    /* renamed from: i, reason: collision with root package name */
    public p f7216i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f7217k;

    /* renamed from: l, reason: collision with root package name */
    public int f7218l;

    /* renamed from: m, reason: collision with root package name */
    public s f7219m;

    /* renamed from: n, reason: collision with root package name */
    public d0 f7220n;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7211d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final RemoteCallbackList f7213f = new RemoteCallbackList();

    public u(Context context, String str, Bundle bundle) {
        MediaSession a10 = a(context, str, bundle);
        this.f7208a = a10;
        t tVar = new t(this);
        this.f7209b = tVar;
        this.f7210c = new a0(a10.getSessionToken(), tVar);
        this.f7212e = bundle;
        a10.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final s b() {
        s sVar;
        synchronized (this.f7211d) {
            sVar = this.f7219m;
        }
        return sVar;
    }

    public d0 c() {
        d0 d0Var;
        synchronized (this.f7211d) {
            d0Var = this.f7220n;
        }
        return d0Var;
    }

    public void d(d0 d0Var) {
        synchronized (this.f7211d) {
            this.f7220n = d0Var;
        }
    }

    public void e(int i6) {
        this.j = i6;
    }
}
