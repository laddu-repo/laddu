package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z1 implements Map.Entry {

    /* renamed from: x, reason: collision with root package name */
    public final Map.Entry f3135x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f3136y;

    public z1(Internal.MapAdapter mapAdapter, Map.Entry entry) {
        this.f3136y = mapAdapter;
        this.f3135x = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Map.Entry) && this.f3135x.getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3135x.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Internal.MapAdapter.Converter converter;
        converter = this.f3136y.valueConverter;
        return converter.doForward(this.f3135x.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3135x.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Internal.MapAdapter.Converter converter;
        Internal.MapAdapter.Converter converter2;
        Internal.MapAdapter mapAdapter = this.f3136y;
        converter = mapAdapter.valueConverter;
        Object value = this.f3135x.setValue(converter.doBackward(obj));
        if (value != null) {
            converter2 = mapAdapter.valueConverter;
            return converter2.doForward(value);
        }
        return null;
    }
}
