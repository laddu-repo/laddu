package db;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e1 extends p0 {
    public final transient n0 A;
    public final transient Object[] B;
    public final transient int C;
    public final transient int D;

    public e1(n0 n0Var, Object[] objArr, int i6, int i10) {
        this.A = n0Var;
        this.B = objArr;
        this.C = i6;
        this.D = i10;
    }

    @Override // db.f0
    public final int b(int i6, Object[] objArr) {
        return a().b(i6, objArr);
    }

    @Override // db.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.A.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // db.f0
    public final boolean f() {
        return true;
    }

    @Override // db.f0
    /* renamed from: g */
    public final q1 iterator() {
        return a().listIterator(0);
    }

    @Override // db.p0
    public final k0 l() {
        return new d1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.D;
    }
}
