package l4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8209a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8210b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8211c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8212d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8213e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8214f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8215g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8216h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8217i;

    public z(boolean z10, boolean z11, int i6, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this.f8209a = z10;
        this.f8210b = z11;
        this.f8211c = i6;
        this.f8212d = z12;
        this.f8213e = z13;
        this.f8214f = i10;
        this.f8215g = i11;
        this.f8216h = i12;
        this.f8217i = i13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof z)) {
                z zVar = (z) obj;
                if (this.f8209a == zVar.f8209a && this.f8210b == zVar.f8210b && this.f8211c == zVar.f8211c && this.f8212d == zVar.f8212d && this.f8213e == zVar.f8213e && this.f8214f == zVar.f8214f && this.f8215g == zVar.f8215g && this.f8216h == zVar.f8216h && this.f8217i == zVar.f8217i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f8209a ? 1 : 0) * 31) + (this.f8210b ? 1 : 0)) * 31) + this.f8211c) * 923521) + (this.f8212d ? 1 : 0)) * 31) + (this.f8213e ? 1 : 0)) * 31) + this.f8214f) * 31) + this.f8215g) * 31) + this.f8216h) * 31) + this.f8217i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z.class.getSimpleName());
        sb2.append("(");
        if (this.f8209a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f8210b) {
            sb2.append("restoreState ");
        }
        int i6 = this.f8217i;
        int i10 = this.f8216h;
        int i11 = this.f8215g;
        int i12 = this.f8214f;
        if (i12 != -1 || i11 != -1 || i10 != -1 || i6 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i6));
            sb2.append(")");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        return sb3;
    }
}
