package db;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 extends m implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Object f3999x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f4000y;

    public g0(Object obj, Object obj2) {
        this.f3999x = obj;
        this.f4000y = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3999x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4000y;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
