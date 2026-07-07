package d5;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements Comparable {
    public final String A;

    /* renamed from: x, reason: collision with root package name */
    public final int f3798x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3799y;

    /* renamed from: z, reason: collision with root package name */
    public final String f3800z;

    public d(String from, String to, int i6, int i10) {
        k.e(from, "from");
        k.e(to, "to");
        this.f3798x = i6;
        this.f3799y = i10;
        this.f3800z = from;
        this.A = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d other = (d) obj;
        k.e(other, "other");
        int i6 = this.f3798x - other.f3798x;
        if (i6 == 0) {
            return this.f3799y - other.f3799y;
        }
        return i6;
    }
}
