package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b2 extends AbstractSet {

    /* renamed from: x, reason: collision with root package name */
    public final Set f2872x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f2873y;

    public b2(Internal.MapAdapter mapAdapter, Set set) {
        this.f2873y = mapAdapter;
        this.f2872x = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a2(this.f2873y, this.f2872x.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2872x.size();
    }
}
