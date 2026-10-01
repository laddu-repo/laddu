package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u0 extends o {
    final /* synthetic */ v0 this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class a extends o {
        final /* synthetic */ v0 this$0;

        public a(v0 v0Var) {
            this.this$0 = v0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.k.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.k.e(activity, "activity");
            v0 v0Var = this.this$0;
            int i6 = v0Var.f988x + 1;
            v0Var.f988x = i6;
            if (i6 == 1 && v0Var.A) {
                v0Var.C.f(w.ON_START);
                v0Var.A = false;
            }
        }
    }

    public u0(v0 v0Var) {
        this.this$0 = v0Var;
    }

    @Override // androidx.lifecycle.o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.k.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i6 = z0.f998y;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.k.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((z0) findFragmentByTag).f999x = this.this$0.E;
        }
    }

    @Override // androidx.lifecycle.o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.k.e(activity, "activity");
        v0 v0Var = this.this$0;
        int i6 = v0Var.f989y - 1;
        v0Var.f989y = i6;
        if (i6 == 0) {
            Handler handler = v0Var.B;
            kotlin.jvm.internal.k.b(handler);
            handler.postDelayed(v0Var.D, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.k.e(activity, "activity");
        t0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.k.e(activity, "activity");
        v0 v0Var = this.this$0;
        int i6 = v0Var.f988x - 1;
        v0Var.f988x = i6;
        if (i6 == 0 && v0Var.f990z) {
            v0Var.C.f(w.ON_STOP);
            v0Var.A = true;
        }
    }
}
