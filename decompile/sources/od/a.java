package od;

import java.util.Date;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10046a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10047b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f10048c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f10049d;

    public a(Integer num, Integer num2, Long l10, Date date) {
        this.f10046a = num;
        this.f10047b = num2;
        this.f10048c = l10;
        this.f10049d = date;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f10046a.equals(aVar.f10046a) || !this.f10047b.equals(aVar.f10047b) || !this.f10048c.equals(aVar.f10048c) || !this.f10049d.equals(aVar.f10049d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10049d.hashCode() + ((this.f10048c.hashCode() + ((this.f10047b.hashCode() + (this.f10046a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Quadruple(first=" + this.f10046a + ", second=" + this.f10047b + ", third=" + this.f10048c + ", fourth=" + this.f10049d + ")";
    }
}
