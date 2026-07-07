package r;

import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends f {
    public final HashMap B = new HashMap();

    @Override // r.f
    public final c a(Object obj) {
        return (c) this.B.get(obj);
    }

    @Override // r.f
    public final Object b(Object obj) {
        Object b10 = super.b(obj);
        this.B.remove(obj);
        return b10;
    }
}
