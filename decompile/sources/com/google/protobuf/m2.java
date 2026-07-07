package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m2 implements t2 {

    /* renamed from: a, reason: collision with root package name */
    public t2[] f2988a;

    @Override // com.google.protobuf.t2
    public final s2 a(Class cls) {
        for (t2 t2Var : this.f2988a) {
            if (t2Var.b(cls)) {
                return t2Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.t2
    public final boolean b(Class cls) {
        for (t2 t2Var : this.f2988a) {
            if (t2Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
