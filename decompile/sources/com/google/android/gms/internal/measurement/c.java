package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Iterator f2164x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Iterator f2165y;

    public c(d dVar, Iterator it, Iterator it2) {
        this.f2164x = it;
        this.f2165y = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2164x.hasNext()) {
            return true;
        }
        return this.f2165y.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f2164x;
        if (it.hasNext()) {
            return new q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f2165y;
        if (it2.hasNext()) {
            return new q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
