package ff;

import java.io.Serializable;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: z, reason: collision with root package name */
    public static final b f5270z = new b(0, 0);

    /* renamed from: x, reason: collision with root package name */
    public final long f5271x;

    /* renamed from: y, reason: collision with root package name */
    public final long f5272y;

    public b(long j, long j10) {
        this.f5271x = j;
        this.f5272y = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        k.e(other, "other");
        long j = other.f5271x;
        long j10 = this.f5271x;
        if (j10 != j) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f5272y ^ Long.MIN_VALUE, other.f5272y ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f5271x == bVar.f5271x && this.f5272y == bVar.f5272y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5271x ^ this.f5272y;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        a8.a.i(this.f5271x, bArr, 0, 0, 4);
        bArr[8] = 45;
        a8.a.i(this.f5271x, bArr, 9, 4, 6);
        bArr[13] = 45;
        a8.a.i(this.f5271x, bArr, 14, 6, 8);
        bArr[18] = 45;
        a8.a.i(this.f5272y, bArr, 19, 0, 2);
        bArr[23] = 45;
        a8.a.i(this.f5272y, bArr, 24, 2, 8);
        return new String(bArr, df.a.f4115a);
    }
}
