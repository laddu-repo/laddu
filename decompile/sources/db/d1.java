package db;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d1 extends k0 {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e1 f3992z;

    public d1(e1 e1Var) {
        this.f3992z = e1Var;
    }

    @Override // db.f0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        e1 e1Var = this.f3992z;
        jb.b.e(i6, e1Var.D);
        Object[] objArr = e1Var.B;
        int i10 = i6 * 2;
        int i11 = e1Var.C;
        Object obj = objArr[i10 + i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + (i11 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3992z.D;
    }
}
