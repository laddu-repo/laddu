package com.unity3d.services.core.di;

import he.f;
import kotlin.jvm.internal.k;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
final class Factory<T> implements f {
    private final a initializer;

    public Factory(a initializer) {
        k.e(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // he.f
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    public boolean isInitialized() {
        return false;
    }
}
