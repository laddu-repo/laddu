package com.unity3d.ads.core.domain;

import android.app.Application;
import android.content.Context;
import kf.d;
import kf.h;
import kotlin.jvm.internal.k;
import le.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;

    public AndroidGetLifecycleFlow(Context applicationContext) {
        k.e(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final h invoke() {
        if (this.applicationContext instanceof Application) {
            return new d(new AndroidGetLifecycleFlow$invoke$2(this, null), i.f8353x, -2, jf.a.f7436x);
        }
        throw new IllegalArgumentException("Application context is required");
    }
}
