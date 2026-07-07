package w4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f13799a;

    /* renamed from: b, reason: collision with root package name */
    public int f13800b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13801c;

    /* renamed from: d, reason: collision with root package name */
    public int f13802d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i6 = this.f13799a;
                if (i6 == aVar.f13799a) {
                    if (i6 != 8 || Math.abs(this.f13802d - this.f13800b) != 1 || this.f13802d != aVar.f13800b || this.f13800b != aVar.f13802d) {
                        if (this.f13802d == aVar.f13802d && this.f13800b == aVar.f13800b) {
                            Object obj2 = this.f13801c;
                            if (obj2 != null) {
                                if (!obj2.equals(aVar.f13801c)) {
                                    return false;
                                }
                            } else if (aVar.f13801c != null) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f13799a * 31) + this.f13800b) * 31) + this.f13802d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i6 = this.f13799a;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 4) {
                    if (i6 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f13800b);
        sb2.append("c:");
        sb2.append(this.f13802d);
        sb2.append(",p:");
        sb2.append(this.f13801c);
        sb2.append("]");
        return sb2.toString();
    }
}
