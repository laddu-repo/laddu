package p2;

import java.util.List;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f10459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10460b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10461c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10462d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10463e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10464f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10465g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10466h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10467i;
    public final q[] j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10468k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10469l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10470m;

    /* renamed from: n, reason: collision with root package name */
    public final List f10471n;

    /* renamed from: o, reason: collision with root package name */
    public final long[] f10472o;

    /* renamed from: p, reason: collision with root package name */
    public final long f10473p;

    public b(String str, String str2, int i6, String str3, long j, String str4, int i10, int i11, int i12, int i13, String str5, q[] qVarArr, List list, long[] jArr, long j10) {
        this.f10469l = str;
        this.f10470m = str2;
        this.f10459a = i6;
        this.f10460b = str3;
        this.f10461c = j;
        this.f10462d = str4;
        this.f10463e = i10;
        this.f10464f = i11;
        this.f10465g = i12;
        this.f10466h = i13;
        this.f10467i = str5;
        this.j = qVarArr;
        this.f10471n = list;
        this.f10472o = jArr;
        this.f10473p = j10;
        this.f10468k = list.size();
    }

    public final b a(q[] qVarArr) {
        return new b(this.f10469l, this.f10470m, this.f10459a, this.f10460b, this.f10461c, this.f10462d, this.f10463e, this.f10464f, this.f10465g, this.f10466h, this.f10467i, qVarArr, this.f10471n, this.f10472o, this.f10473p);
    }

    public final long b(int i6) {
        if (i6 == this.f10468k - 1) {
            return this.f10473p;
        }
        long[] jArr = this.f10472o;
        return jArr[i6 + 1] - jArr[i6];
    }
}
