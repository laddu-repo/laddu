package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t3 implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public int f3051x;

    /* renamed from: y, reason: collision with root package name */
    public Iterator f3052y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ s3 f3053z;

    public t3(s3 s3Var) {
        this.f3053z = s3Var;
        this.f3051x = s3Var.f3044y.size();
    }

    public final Iterator a() {
        if (this.f3052y == null) {
            this.f3052y = this.f3053z.C.entrySet().iterator();
        }
        return this.f3052y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f3051x;
        if ((i6 > 0 && i6 <= this.f3053z.f3044y.size()) || a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.f3053z.f3044y;
        int i6 = this.f3051x - 1;
        this.f3051x = i6;
        return (Map.Entry) list.get(i6);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
