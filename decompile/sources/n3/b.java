package n3;

import java.util.Locale;
import java.util.Objects;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f9032a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9033b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9034c;

    public b(int i6, long j, long j10) {
        boolean z10;
        if (j < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        this.f9032a = j;
        this.f9033b = j10;
        this.f9034c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f9032a == bVar.f9032a && this.f9033b == bVar.f9033b && this.f9034c == bVar.f9034c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9032a), Long.valueOf(this.f9033b), Integer.valueOf(this.f9034c));
    }

    public final String toString() {
        String str = a0.f12750a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f9032a + ", endTimeMs=" + this.f9033b + ", speedDivisor=" + this.f9034c;
    }
}
