package d8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3971a;

    public b(Integer num) {
        this.f3971a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        Integer num = ((b) obj).f3971a;
        Integer num2 = this.f3971a;
        if (num2 == null) {
            if (num == null) {
                return true;
            }
            return false;
        }
        return num2.equals(num);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f3971a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f3971a + "}";
    }
}
