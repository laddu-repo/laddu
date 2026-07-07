package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0.d f939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t7.k f940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f941d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f942e;
    public ThreadPoolExecutor f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p4.v f944h;

    public w(Context context, q0.d dVar) {
        u1.c.g(context, "Context cannot be null");
        this.f938a = context.getApplicationContext();
        this.f939b = dVar;
        this.f940c = x.f945d;
    }

    @Override // androidx.emoji2.text.l
    public final void a(p4.v vVar) {
        synchronized (this.f941d) {
            this.f944h = vVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f941d) {
            try {
                this.f944h = null;
                Handler handler = this.f942e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f942e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f943g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f943g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f941d) {
            try {
                if (this.f944h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a(0, "emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f943g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new v(0, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final q0.i d() {
        try {
            t7.k kVar = this.f940c;
            Context context = this.f938a;
            q0.d dVar = this.f939b;
            kVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            d4.f fVarA = q0.c.a(context, Collections.unmodifiableList(arrayList));
            int i = fVarA.f4118a;
            if (i != 0) {
                throw new RuntimeException(d0.d.i(i, "fetchFonts failed (", ")"));
            }
            q0.i[] iVarArr = (q0.i[]) fVarA.f4119b.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
