package com.google.protobuf.kotlin;

import java.util.Iterator;
import java.util.Map;
import we.a;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnmodifiableMapEntries$iterator$1<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, a {
    private final /* synthetic */ Iterator<Map.Entry<K, V>> $$delegate_0;
    final /* synthetic */ Iterator<Map.Entry<K, V>> $itr;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries$iterator$1(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.$itr = it;
        this.$$delegate_0 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return new UnmodifiableMapEntry(this.$itr.next());
    }
}
