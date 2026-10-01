package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z4 implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public int f2546x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final int f2547y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c5 f2548z;

    public z4(c5 c5Var) {
        this.f2548z = c5Var;
        this.f2547y = c5Var.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2546x < this.f2547y) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i6 = this.f2546x;
        if (i6 < this.f2547y) {
            this.f2546x = i6 + 1;
            return Byte.valueOf(this.f2548z.b(i6));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
