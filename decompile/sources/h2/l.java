package h2;

import db.k0;
import db.n0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: d, reason: collision with root package name */
    public final int f5910d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5911e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5912f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5913g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5914h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5915i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5916k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5917l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5918m;

    /* renamed from: n, reason: collision with root package name */
    public final long f5919n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5920o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5921p;

    /* renamed from: q, reason: collision with root package name */
    public final r1.m f5922q;

    /* renamed from: r, reason: collision with root package name */
    public final k0 f5923r;
    public final k0 s;

    /* renamed from: t, reason: collision with root package name */
    public final n0 f5924t;

    /* renamed from: u, reason: collision with root package name */
    public final long f5925u;

    /* renamed from: v, reason: collision with root package name */
    public final k f5926v;

    /* renamed from: w, reason: collision with root package name */
    public final k0 f5927w;

    public l(int i6, String str, List list, long j, boolean z10, long j10, boolean z11, int i10, long j11, int i11, long j12, long j13, boolean z12, boolean z13, boolean z14, r1.m mVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        this.f5910d = i6;
        this.f5914h = j10;
        this.f5913g = z10;
        this.f5915i = z11;
        this.j = i10;
        this.f5916k = j11;
        this.f5917l = i11;
        this.f5918m = j12;
        this.f5919n = j13;
        this.f5920o = z13;
        this.f5921p = z14;
        this.f5922q = mVar;
        this.f5923r = k0.k(list2);
        this.s = k0.k(list3);
        this.f5924t = n0.a(map);
        this.f5927w = k0.k(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) db.r.l(list3);
            this.f5925u = gVar.B + gVar.f5904z;
        } else if (!list2.isEmpty()) {
            i iVar = (i) db.r.l(list2);
            this.f5925u = iVar.B + iVar.f5904z;
        } else {
            this.f5925u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                j14 = Math.min(this.f5925u, j);
            } else {
                j14 = Math.max(0L, this.f5925u + j);
            }
        }
        this.f5911e = j14;
        this.f5912f = j >= 0;
        this.f5926v = kVar;
    }

    @Override // l2.a
    public final Object a(List list) {
        return this;
    }
}
