package h0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;

    /* renamed from: x, reason: collision with root package name */
    public Object f5765x;

    /* renamed from: y, reason: collision with root package name */
    public Activity f5766y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5767z;

    public d(Activity activity) {
        this.f5766y = activity;
        this.f5767z = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f5766y == activity) {
            this.f5766y = null;
            this.B = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.B && !this.C && !this.A) {
            Object obj = this.f5765x;
            try {
                Object obj2 = e.f5770c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f5767z) {
                    e.f5774g.postAtFrontOfQueue(new hb.s(7, e.f5769b.get(activity), obj2));
                    this.C = true;
                    this.f5765x = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f5766y == activity) {
            this.A = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
