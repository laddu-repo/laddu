package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a2 implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public final Iterator f2864x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f2865y;

    public a2(Internal.MapAdapter mapAdapter, Iterator it) {
        this.f2865y = mapAdapter;
        this.f2864x = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2864x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new z1(this.f2865y, (Map.Entry) this.f2864x.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2864x.remove();
    }
}
