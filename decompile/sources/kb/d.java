package kb;

import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;
import ma.n;
import o8.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f7879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.b f7881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f7882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f7883e;

    public d(Context context, String str, Set set, mb.b bVar, Executor executor) {
        this.f7879a = new n(new fa.c(context, str));
        this.f7882d = set;
        this.f7883e = executor;
        this.f7881c = bVar;
        this.f7880b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        l lVar = (l) this.f7879a.get();
        if (!lVar.i(jCurrentTimeMillis)) {
            return 1;
        }
        lVar.g();
        return 3;
    }

    public final o b() {
        if (Build.VERSION.SDK_INT >= 24 ? p0.d.f(this.f7880b) : true) {
            return b8.h.d(this.f7883e, new c(this, 0));
        }
        return b8.h.o("");
    }

    public final void c() {
        if (this.f7882d.size() <= 0) {
            b8.h.o(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? p0.d.f(this.f7880b) : true) {
            b8.h.d(this.f7883e, new c(this, 1));
        } else {
            b8.h.o(null);
        }
    }
}
