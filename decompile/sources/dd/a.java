package dd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4083a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4084b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4085c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4086d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4087e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4088f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4089g;

    public a(String str, int i6, int i10) {
        this.f4083a = i6;
        this.f4084b = str;
        this.f4085c = i10;
        this.f4086d = 30;
        this.f4087e = -1;
        this.f4088f = true;
        this.f4089g = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class.equals(obj.getClass())) {
                a aVar = (a) obj;
                String str = aVar.f4084b;
                if (this.f4083a == aVar.f4083a && this.f4085c == aVar.f4085c && this.f4086d == aVar.f4086d && this.f4087e == aVar.f4087e && this.f4088f == aVar.f4088f && this.f4089g == aVar.f4089g && this.f4084b.equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((h8.c.g(this.f4084b, this.f4083a * 31, 31) + this.f4085c) * 31) + this.f4086d) * 29791) + this.f4087e) * 31) + (this.f4088f ? 1 : 0)) * 31) + (this.f4089g ? 1 : 0);
    }

    public final String toString() {
        return "Format{itag=" + this.f4083a + ", ext='" + this.f4084b + "', height=" + this.f4085c + ", fps=" + this.f4086d + ", vCodec=null, aCodec=null, audioBitrate=" + this.f4087e + ", isDashContainer=" + this.f4088f + ", isHlsContent=" + this.f4089g + "}";
    }

    public a(int i6, int i10, int i11, String str) {
        this.f4083a = i6;
        this.f4084b = str;
        this.f4085c = -1;
        this.f4086d = 30;
        this.f4087e = i10;
        this.f4088f = true;
        this.f4089g = false;
    }

    public a(String str, int i6, int i10, int i11, int i12) {
        this.f4083a = i6;
        this.f4084b = str;
        this.f4085c = i10;
        this.f4086d = 30;
        this.f4087e = i11;
        this.f4088f = false;
        this.f4089g = false;
    }

    public a(int i6, int i10, int i11) {
        this.f4083a = i6;
        this.f4084b = "mp4";
        this.f4085c = i10;
        this.f4086d = 30;
        this.f4087e = i11;
        this.f4088f = false;
        this.f4089g = true;
    }

    public a(String str, int i6, int i10, Object obj) {
        this.f4083a = i6;
        this.f4084b = str;
        this.f4085c = i10;
        this.f4087e = -1;
        this.f4086d = 60;
        this.f4088f = true;
        this.f4089g = false;
    }
}
