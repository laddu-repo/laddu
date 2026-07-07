package wc;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: x, reason: collision with root package name */
    public boolean f14282x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14283y;

    /* renamed from: z, reason: collision with root package name */
    public d f14284z;

    public boolean b() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f14283y) {
            this.f14283y = true;
            if (this.f14282x) {
                a(true);
                d dVar = this.f14284z;
                if (dVar != null) {
                    dVar.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean z10;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance == 100 || b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f14283y != z10) {
            this.f14283y = z10;
            if (this.f14282x) {
                a(z10);
                d dVar = this.f14284z;
                if (dVar != null) {
                    dVar.a(z10);
                }
            }
        }
    }

    public void a(boolean z10) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
