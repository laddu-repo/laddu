package db;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s0 extends q1 {

    /* renamed from: x, reason: collision with root package name */
    public final Object f4041x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4042y;

    public s0(Object obj) {
        this.f4041x = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f4042y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f4042y) {
            this.f4042y = true;
            return this.f4041x;
        }
        throw new NoSuchElementException();
    }
}
