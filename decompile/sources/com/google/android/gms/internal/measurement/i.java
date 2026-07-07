package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Iterator f2251x;

    public i(Iterator it) {
        this.f2251x = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2251x.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new q((String) this.f2251x.next());
    }
}
