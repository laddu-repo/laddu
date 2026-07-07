package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gf.f0;
import gf.o0;
import gf.z;
import he.y;
import ie.r;
import java.util.List;
import k5.b;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AdsSdkInitializer implements b {
    @Override // k5.b
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m69create(context);
        return y.f6101a;
    }

    @Override // k5.b
    public List<Class<? extends b>> dependencies() {
        return r.f6846x;
    }

    /* renamed from: create, reason: collision with other method in class */
    public void m69create(Context context) {
        k.e(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            k.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        f0.w(f0.y(f0.b(o0.f5693a), new AdsSdkInitializer$create$$inlined$CoroutineExceptionHandler$1(z.f5729x)), null, new AdsSdkInitializer$create$1(context, null), 3);
    }
}
