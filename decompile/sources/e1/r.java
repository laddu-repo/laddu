package e1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.google.android.gms.internal.measurement.j5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4180a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.d f4181b;

    /* renamed from: c, reason: collision with root package name */
    public final w8.l f4182c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4183d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f4184e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f4185f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f4186g;

    /* renamed from: h, reason: collision with root package name */
    public a8.e f4187h;

    public r(Context context, q0.d dVar) {
        j5.e(context, "Context cannot be null");
        this.f4180a = context.getApplicationContext();
        this.f4181b = dVar;
        this.f4182c = s.f4188d;
    }

    @Override // e1.j
    public final void a(a8.e eVar) {
        synchronized (this.f4183d) {
            this.f4187h = eVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f4183d) {
            try {
                this.f4187h = null;
                Handler handler = this.f4184e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f4184e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4186g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4185f = null;
                this.f4186g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f4183d) {
            try {
                if (this.f4187h == null) {
                    return;
                }
                if (this.f4185f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f4186g = threadPoolExecutor;
                    this.f4185f = threadPoolExecutor;
                }
                this.f4185f.execute(new a2.a(this, 19));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final q0.i d() {
        try {
            w8.l lVar = this.f4182c;
            Context context = this.f4180a;
            q0.d dVar = this.f4181b;
            lVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            f4.f a10 = q0.c.a(context, Collections.unmodifiableList(arrayList));
            int i6 = a10.f4766a;
            if (i6 == 0) {
                q0.i[] iVarArr = (q0.i[]) a10.f4767b.get(0);
                if (iVarArr != null && iVarArr.length != 0) {
                    return iVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(h8.c.j(i6, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
