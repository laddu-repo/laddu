package s2;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e4.e f11465d = new e4.e(0, -9223372036854775807L, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e4.e f11466e = new e4.e(2, -9223372036854775807L, false);
    public static final e4.e f = new e4.e(3, -9223372036854775807L, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.a f11467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f11468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f11469c;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i = b0.f13686a;
        this(new t2.a(Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(1, strConcat)), new ma.p(10)));
    }

    public final void a() {
        j jVar = this.f11468b;
        w1.a.k(jVar);
        jVar.a(false);
    }

    @Override // s2.o
    public final void b() throws IOException {
        IOException iOException = this.f11469c;
        if (iOException != null) {
            throw iOException;
        }
        j jVar = this.f11468b;
        if (jVar != null) {
            int i = jVar.f11460v;
            IOException iOException2 = jVar.f11464z;
            if (iOException2 != null && jVar.A > i) {
                throw iOException2;
            }
        }
    }

    public final boolean c() {
        return this.f11469c != null;
    }

    public final boolean d() {
        return this.f11468b != null;
    }

    public final void e(l lVar) {
        j jVar = this.f11468b;
        if (jVar != null) {
            jVar.a(true);
        }
        t2.a aVar = this.f11467a;
        if (lVar != null) {
            aVar.execute(new androidx.fragment.app.m(25, lVar));
        }
        aVar.f12186w.accept(aVar.f12185v);
    }

    public final void f(k kVar, i iVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        w1.a.k(looperMyLooper);
        this.f11469c = null;
        j jVar = new j(this, looperMyLooper, kVar, iVar, i, SystemClock.elapsedRealtime());
        w1.a.j(this.f11468b == null);
        this.f11468b = jVar;
        jVar.b();
    }

    public n(t2.a aVar) {
        this.f11467a = aVar;
    }
}
