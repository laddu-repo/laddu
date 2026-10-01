package v6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final w6.i f13352a;

    /* renamed from: b, reason: collision with root package name */
    public final z6.d f13353b;

    /* renamed from: c, reason: collision with root package name */
    public final w6.d f13354c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f13355d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f13356e;

    public d(w6.i iVar, z6.d dVar, w6.d dVar2, Boolean bool, Boolean bool2) {
        this.f13352a = iVar;
        this.f13353b = dVar;
        this.f13354c = dVar2;
        this.f13355d = bool;
        this.f13356e = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (kotlin.jvm.internal.k.a(this.f13352a, dVar.f13352a) && kotlin.jvm.internal.k.a(this.f13353b, dVar.f13353b) && this.f13354c == dVar.f13354c && kotlin.jvm.internal.k.a(this.f13355d, dVar.f13355d) && kotlin.jvm.internal.k.a(this.f13356e, dVar.f13356e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        w6.i iVar = this.f13352a;
        if (iVar != null) {
            i6 = iVar.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = i6 * 887503681;
        z6.d dVar = this.f13353b;
        if (dVar != null) {
            i10 = dVar.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        w6.d dVar2 = this.f13354c;
        if (dVar2 != null) {
            i11 = dVar2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 961;
        Boolean bool = this.f13355d;
        if (bool != null) {
            i12 = bool.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        Boolean bool2 = this.f13356e;
        if (bool2 != null) {
            i13 = bool2.hashCode();
        }
        return (i17 + i13) * 29791;
    }
}
