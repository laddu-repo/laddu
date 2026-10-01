package com.google.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d2 implements Map.Entry {

    /* renamed from: x, reason: collision with root package name */
    public Map.Entry f2894x;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2894x.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.f2894x.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return ((LazyField) this.f2894x.getValue()).setValue((MessageLite) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
