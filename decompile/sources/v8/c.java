package v8;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final c B = new c();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f13444x = new AtomicBoolean();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f13445y = new AtomicBoolean();

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f13446z = new ArrayList();
    public boolean A = false;

    public static void b(Application application) {
        c cVar = B;
        synchronized (cVar) {
            try {
                if (!cVar.A) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.A = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(b bVar) {
        synchronized (B) {
            this.f13446z.add(bVar);
        }
    }

    public final void c(boolean z10) {
        synchronized (B) {
            try {
                ArrayList arrayList = this.f13446z;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((b) obj).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f13444x.compareAndSet(true, false);
        this.f13445y.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f13444x.compareAndSet(true, false);
        this.f13445y.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        if (i6 == 20 && this.f13444x.compareAndSet(false, true)) {
            this.f13445y.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
