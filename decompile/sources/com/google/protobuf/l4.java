package com.google.protobuf;

import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l4 implements ListIterator {

    /* renamed from: x, reason: collision with root package name */
    public ListIterator f2983x;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2983x.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2983x.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f2983x.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2983x.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f2983x.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2983x.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
