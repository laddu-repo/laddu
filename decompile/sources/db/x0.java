package db;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x0 implements cb.l, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final int f4058x;

    public x0() {
        r.e(2, "expectedValuesPerKey");
        this.f4058x = 2;
    }

    @Override // cb.l
    public final Object get() {
        return new ArrayList(this.f4058x);
    }
}
