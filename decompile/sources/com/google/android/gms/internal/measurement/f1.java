package com.google.android.gms.internal.measurement;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f1 f2204a = new Object();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        z5 z5Var = new z5("internal.platform", 4);
        z5Var.f2240y.put(MobileAdsBridge.versionMethodName, new z5(MobileAdsBridge.versionMethodName, 3));
        return z5Var;
    }
}
