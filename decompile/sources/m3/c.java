package m3;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f8560b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8561c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8562d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8563e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8564f;

    /* renamed from: g, reason: collision with root package name */
    public final j[] f8565g;

    public c(String str, int i6, int i10, long j, long j10, j[] jVarArr) {
        super("CHAP");
        this.f8560b = str;
        this.f8561c = i6;
        this.f8562d = i10;
        this.f8563e = j;
        this.f8564f = j10;
        this.f8565g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f8561c == cVar.f8561c && this.f8562d == cVar.f8562d && this.f8563e == cVar.f8563e && this.f8564f == cVar.f8564f && Objects.equals(this.f8560b, cVar.f8560b) && Arrays.equals(this.f8565g, cVar.f8565g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = (((((((527 + this.f8561c) * 31) + this.f8562d) * 31) + ((int) this.f8563e)) * 31) + ((int) this.f8564f)) * 31;
        String str = this.f8560b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return i10 + i6;
    }
}
