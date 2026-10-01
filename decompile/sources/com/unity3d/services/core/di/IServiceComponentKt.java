package com.unity3d.services.core.di;

import he.f;
import he.g;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class IServiceComponentKt {
    public static final <T> T get(IServiceComponent iServiceComponent, String named) {
        k.e(iServiceComponent, "<this>");
        k.e(named, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        k.j();
        throw null;
    }

    public static Object get$default(IServiceComponent iServiceComponent, String named, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        k.e(iServiceComponent, "<this>");
        k.e(named, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        k.j();
        throw null;
    }

    public static final <T> f inject(IServiceComponent iServiceComponent, String named, g mode) {
        k.e(iServiceComponent, "<this>");
        k.e(named, "named");
        k.e(mode, "mode");
        k.j();
        throw null;
    }

    public static f inject$default(IServiceComponent iServiceComponent, String named, g mode, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i6 & 2) != 0) {
            mode = g.f6075z;
        }
        k.e(iServiceComponent, "<this>");
        k.e(named, "named");
        k.e(mode, "mode");
        k.j();
        throw null;
    }
}
