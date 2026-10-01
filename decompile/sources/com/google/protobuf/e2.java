package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e2 implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2904x = 1;

    /* renamed from: y, reason: collision with root package name */
    public Iterator f2905y;

    public /* synthetic */ e2() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2904x) {
            case 0:
                return this.f2905y.hasNext();
            default:
                return this.f2905y.hasNext();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.google.protobuf.d2] */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2904x) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f2905y.next();
                if (entry.getValue() instanceof LazyField) {
                    ?? obj = new Object();
                    obj.f2894x = entry;
                    return obj;
                }
                return entry;
            default:
                return (String) this.f2905y.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2904x) {
            case 0:
                this.f2905y.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public e2(Iterator it) {
        this.f2905y = it;
    }
}
