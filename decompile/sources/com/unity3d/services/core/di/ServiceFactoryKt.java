package com.unity3d.services.core.di;

import he.f;
import kotlin.jvm.internal.k;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ServiceFactoryKt {
    public static final <T> f factoryOf(a initializer) {
        k.e(initializer, "initializer");
        return new Factory(initializer);
    }
}
