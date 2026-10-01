package db;

import java.util.Collection;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d0 extends n0 {
    @Override // db.n0
    public final f0 d() {
        throw new AssertionError("should never be called");
    }

    @Override // db.n0
    /* renamed from: f */
    public final f0 values() {
        return ((b1) this).E.keySet();
    }

    @Override // db.n0, java.util.Map
    public final Collection values() {
        return ((b1) this).E.keySet();
    }
}
