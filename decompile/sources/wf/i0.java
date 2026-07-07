package wf;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i0 implements uf.g {

    /* renamed from: a, reason: collision with root package name */
    public final uf.g f14336a;

    public i0(uf.g gVar) {
        this.f14336a = gVar;
    }

    @Override // uf.g
    public final boolean c() {
        return false;
    }

    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        Integer w10 = df.t.w(name);
        if (w10 != null) {
            return w10.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // uf.g
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i0) {
                i0 i0Var = (i0) obj;
                if (kotlin.jvm.internal.k.a(this.f14336a, i0Var.f14336a) && kotlin.jvm.internal.k.a(a(), i0Var.a())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // uf.g
    public final String f(int i6) {
        return String.valueOf(i6);
    }

    @Override // uf.g
    public final List g(int i6) {
        if (i6 >= 0) {
            return ie.r.f6846x;
        }
        StringBuilder n10 = h8.c.n(i6, "Illegal index ", ", ");
        n10.append(a());
        n10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(n10.toString().toString());
    }

    @Override // uf.g
    public final List getAnnotations() {
        return ie.r.f6846x;
    }

    @Override // uf.g
    public final a8.a getKind() {
        return uf.j.f13137g;
    }

    @Override // uf.g
    public final uf.g h(int i6) {
        if (i6 >= 0) {
            return this.f14336a;
        }
        StringBuilder n10 = h8.c.n(i6, "Illegal index ", ", ");
        n10.append(a());
        n10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(n10.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f14336a.hashCode() * 31);
    }

    @Override // uf.g
    public final boolean i(int i6) {
        if (i6 >= 0) {
            return false;
        }
        StringBuilder n10 = h8.c.n(i6, "Illegal index ", ", ");
        n10.append(a());
        n10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(n10.toString().toString());
    }

    @Override // uf.g
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return a() + '(' + this.f14336a + ')';
    }
}
