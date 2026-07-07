package v5;

import android.os.Build;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final c f13305i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13307b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13308c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13309d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13310e;

    /* renamed from: a, reason: collision with root package name */
    public int f13306a = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f13311f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f13312g = -1;

    /* renamed from: h, reason: collision with root package name */
    public e f13313h = new e();

    /* JADX WARN: Type inference failed for: r1v0, types: [v5.c, java.lang.Object] */
    static {
        e eVar = new e();
        ?? obj = new Object();
        obj.f13306a = 1;
        obj.f13311f = -1L;
        obj.f13312g = -1L;
        obj.f13313h = new e();
        obj.f13307b = false;
        int i6 = Build.VERSION.SDK_INT;
        obj.f13308c = false;
        obj.f13306a = 1;
        obj.f13309d = false;
        obj.f13310e = false;
        if (i6 >= 24) {
            obj.f13313h = eVar;
            obj.f13311f = -1L;
            obj.f13312g = -1L;
        }
        f13305i = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f13307b == cVar.f13307b && this.f13308c == cVar.f13308c && this.f13309d == cVar.f13309d && this.f13310e == cVar.f13310e && this.f13311f == cVar.f13311f && this.f13312g == cVar.f13312g && this.f13306a == cVar.f13306a) {
                return this.f13313h.equals(cVar.f13313h);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int c10 = ((((((((y.e.c(this.f13306a) * 31) + (this.f13307b ? 1 : 0)) * 31) + (this.f13308c ? 1 : 0)) * 31) + (this.f13309d ? 1 : 0)) * 31) + (this.f13310e ? 1 : 0)) * 31;
        long j = this.f13311f;
        int i6 = (c10 + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f13312g;
        return this.f13313h.f13316a.hashCode() + ((i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }
}
