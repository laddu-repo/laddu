package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements k5.b {
    @Override // k5.b
    public final Object create(Context context) {
        kotlin.jvm.internal.k.e(context, "context");
        k5.a c10 = k5.a.c(context);
        kotlin.jvm.internal.k.d(c10, "getInstance(...)");
        if (c10.f7733b.contains(ProcessLifecycleInitializer.class)) {
            if (!c0.f893a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.k.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new b0());
            }
            v0 v0Var = v0.F;
            v0Var.getClass();
            v0Var.B = new Handler();
            v0Var.C.f(w.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.k.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new u0(v0Var));
            return v0Var;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }

    @Override // k5.b
    public final List dependencies() {
        return ie.r.f6846x;
    }
}
