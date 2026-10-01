package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class li implements Iterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final sh f2871v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ mi f2874y;

    public /* synthetic */ li(mi miVar, sh shVar, int i) {
        this.f2874y = miVar;
        this.f2871v = shVar;
        int i10 = i & 31;
        this.f2872w = i10;
        this.f2873x = i >>> (i10 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2872w >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2872w;
        mi miVar = this.f2874y;
        jb jbVar = miVar.f2900b;
        int iA = jbVar.a();
        Object objCast = this.f2871v.f3093b.cast(i >= iA ? miVar.f2901c.l(i - iA) : jbVar.l(i));
        int i10 = this.f2873x;
        if (i10 == 0) {
            this.f2872w = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10) + 1;
        this.f2873x >>>= iNumberOfTrailingZeros;
        this.f2872w += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
