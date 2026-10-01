package m8;

import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final p8.a f8703a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8704b;

    public a(p8.a aVar, HashMap hashMap) {
        this.f8703a = aVar;
        this.f8704b = hashMap;
    }

    public final long a(d8.d dVar, long j, int i6) {
        long j10;
        long f3 = j - this.f8703a.f();
        b bVar = (b) this.f8704b.get(dVar);
        long j11 = bVar.f8705a;
        int i10 = i6 - 1;
        if (j11 > 1) {
            j10 = j11;
        } else {
            j10 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j10 * i10))), f3), bVar.f8706b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f8703a.equals(aVar.f8703a) && this.f8704b.equals(aVar.f8704b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f8703a.hashCode() ^ 1000003) * 1000003) ^ this.f8704b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f8703a + ", values=" + this.f8704b + "}";
    }
}
