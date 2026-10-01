package b2;

import java.util.Objects;
import q2.c0;
import r1.d1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1344a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f1345b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1346c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f1347d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1348e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f1349f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1350g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f1351h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1352i;
    public final long j;

    public a(long j, d1 d1Var, int i6, c0 c0Var, long j10, d1 d1Var2, int i10, c0 c0Var2, long j11, long j12) {
        this.f1344a = j;
        this.f1345b = d1Var;
        this.f1346c = i6;
        this.f1347d = c0Var;
        this.f1348e = j10;
        this.f1349f = d1Var2;
        this.f1350g = i10;
        this.f1351h = c0Var2;
        this.f1352i = j11;
        this.j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f1344a == aVar.f1344a && this.f1346c == aVar.f1346c && this.f1348e == aVar.f1348e && this.f1350g == aVar.f1350g && this.f1352i == aVar.f1352i && this.j == aVar.j && Objects.equals(this.f1345b, aVar.f1345b) && Objects.equals(this.f1347d, aVar.f1347d) && Objects.equals(this.f1349f, aVar.f1349f) && Objects.equals(this.f1351h, aVar.f1351h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f1344a), this.f1345b, Integer.valueOf(this.f1346c), this.f1347d, Long.valueOf(this.f1348e), this.f1349f, Integer.valueOf(this.f1350g), this.f1351h, Long.valueOf(this.f1352i), Long.valueOf(this.j));
    }
}
