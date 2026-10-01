package l4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f8120a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8121b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8122c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8123d;

    public g(g0 g0Var, boolean z10, Object obj, boolean z11) {
        if (!g0Var.f8139a && z10) {
            throw new IllegalArgumentException(g0Var.b().concat(" does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + g0Var.b() + " has null value but is not nullable.").toString());
        }
        this.f8120a = g0Var;
        this.f8121b = z10;
        this.f8123d = obj;
        this.f8122c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            Object obj2 = gVar.f8123d;
            if (this.f8121b != gVar.f8121b || this.f8122c != gVar.f8122c || !kotlin.jvm.internal.k.a(this.f8120a, gVar.f8120a)) {
                return false;
            }
            Object obj3 = this.f8123d;
            if (obj3 != null) {
                return kotlin.jvm.internal.k.a(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = ((((this.f8120a.hashCode() * 31) + (this.f8121b ? 1 : 0)) * 31) + (this.f8122c ? 1 : 0)) * 31;
        Object obj = this.f8123d;
        if (obj != null) {
            i6 = obj.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kotlin.jvm.internal.x.a(g.class).c());
        sb2.append(" Type: " + this.f8120a);
        sb2.append(" Nullable: " + this.f8121b);
        if (this.f8122c) {
            sb2.append(" DefaultValue: " + this.f8123d);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        return sb3;
    }
}
