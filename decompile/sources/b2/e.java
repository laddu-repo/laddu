package b2;

import i4.b0;
import i4.e1;
import i4.g1;
import i4.h1;
import i4.l1;
import i4.s;
import java.util.HashMap;
import java.util.List;
import q2.c0;
import u1.t;
import v3.n;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements u1.l, e1, g1, u1.g {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1358x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f1359y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1360z;

    public /* synthetic */ e(long j, Object obj, int i6) {
        this.f1360z = obj;
        this.f1358x = i6;
        this.f1359y = j;
    }

    @Override // i4.e1
    public void a(l1 l1Var, s sVar) {
        h1 h1Var = (h1) this.f1360z;
        l1Var.k(h1Var.M(sVar, l1Var, this.f1358x), this.f1359y);
    }

    @Override // u1.g
    public void accept(Object obj) {
        boolean z10;
        n nVar = (n) this.f1360z;
        v3.a aVar = (v3.a) obj;
        u1.c.h(nVar.f13292h);
        byte[] g10 = ob.a.g(aVar.f13263c, aVar.f13261a);
        t tVar = nVar.f13287c;
        tVar.getClass();
        tVar.I(g10.length, g10);
        nVar.f13285a.a(g10.length, tVar);
        long j = aVar.f13262b;
        long j10 = this.f1359y;
        if (j == -9223372036854775807L) {
            if (nVar.f13292h.s == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
        } else {
            long j11 = nVar.f13292h.s;
            if (j11 == Long.MAX_VALUE) {
                j10 += j;
            } else {
                j10 = j + j11;
            }
        }
        nVar.f13285a.c(j10, this.f1358x | 1, g10.length, 0, null);
    }

    @Override // i4.g1
    public Object c(b0 b0Var, s sVar, int i6) {
        int i10;
        long j;
        List list = (List) this.f1360z;
        int i11 = this.f1358x;
        if (i11 == -1) {
            i10 = b0Var.f6318t.m0();
        } else {
            i10 = i11;
        }
        if (i11 == -1) {
            j = b0Var.f6318t.getCurrentPosition();
        } else {
            j = this.f1359y;
        }
        return b0Var.q(sVar, list, i10, j);
    }

    @Override // u1.l
    public void invoke(Object obj) {
        long longValue;
        a aVar = (a) this.f1360z;
        l lVar = (l) obj;
        HashMap hashMap = lVar.f1392h;
        HashMap hashMap2 = lVar.f1393i;
        c0 c0Var = aVar.f1347d;
        if (c0Var != null) {
            String d10 = lVar.f1387c.d(aVar.f1345b, c0Var);
            Long l10 = (Long) hashMap2.get(d10);
            Long l11 = (Long) hashMap.get(d10);
            long j = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap2.put(d10, Long.valueOf(longValue + this.f1359y));
            if (l11 != null) {
                j = l11.longValue();
            }
            hashMap.put(d10, Long.valueOf(j + this.f1358x));
        }
    }

    public /* synthetic */ e(a aVar, int i6, long j, long j10) {
        this.f1360z = aVar;
        this.f1358x = i6;
        this.f1359y = j;
    }

    public /* synthetic */ e(n nVar, long j, int i6) {
        this.f1360z = nVar;
        this.f1359y = j;
        this.f1358x = i6;
    }
}
