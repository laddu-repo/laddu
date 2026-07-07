package s2;

import db.a0;
import db.c1;
import db.h0;
import db.i0;
import db.k0;
import db.q;
import db.z0;
import java.util.ArrayList;
import o5.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: y, reason: collision with root package name */
    public static final a0 f12031y = new a0(new q(new p(20), z0.f4063y), new q(new p(21), z0.f4064z));

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f12032x = new ArrayList();

    @Override // s2.a
    public final long c(long j) {
        int i6 = 0;
        long j10 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f12032x;
            if (i6 >= arrayList.size()) {
                break;
            }
            long j11 = ((v3.a) arrayList.get(i6)).f13262b;
            long j12 = ((v3.a) arrayList.get(i6)).f13264d;
            if (j < j11) {
                if (j10 == -9223372036854775807L) {
                    j10 = j11;
                } else {
                    j10 = Math.min(j10, j11);
                }
            } else {
                if (j < j12) {
                    if (j10 == -9223372036854775807L) {
                        j10 = j12;
                    } else {
                        j10 = Math.min(j10, j12);
                    }
                }
                i6++;
            }
        }
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        return Long.MIN_VALUE;
    }

    @Override // s2.a
    public final void clear() {
        this.f12032x.clear();
    }

    @Override // s2.a
    public final boolean f(v3.a aVar, long j) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10 = aVar.f13262b;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        if (aVar.f13263c != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.b(z11);
        if (j10 <= j && j < aVar.f13264d) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = this.f12032x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((v3.a) arrayList.get(size)).f13262b) {
                arrayList.add(size + 1, aVar);
                return z12;
            }
        }
        arrayList.add(0, aVar);
        return z12;
    }

    @Override // s2.a
    public final k0 i(long j) {
        ArrayList arrayList = this.f12032x;
        if (!arrayList.isEmpty()) {
            if (j >= ((v3.a) arrayList.get(0)).f13262b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    v3.a aVar = (v3.a) arrayList.get(i6);
                    if (j >= aVar.f13262b && j < aVar.f13264d) {
                        arrayList2.add(aVar);
                    }
                    if (j < aVar.f13262b) {
                        break;
                    }
                }
                c1 r10 = k0.r(f12031y, arrayList2);
                h0 j10 = k0.j();
                for (int i10 = 0; i10 < r10.A; i10++) {
                    j10.d(((v3.a) r10.get(i10)).f13261a);
                }
                return j10.g();
            }
        }
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    @Override // s2.a
    public final long o(long j) {
        ArrayList arrayList = this.f12032x;
        if (!arrayList.isEmpty()) {
            if (j >= ((v3.a) arrayList.get(0)).f13262b) {
                long j10 = ((v3.a) arrayList.get(0)).f13262b;
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    long j11 = ((v3.a) arrayList.get(i6)).f13262b;
                    long j12 = ((v3.a) arrayList.get(i6)).f13264d;
                    if (j12 <= j) {
                        j10 = Math.max(j10, j12);
                    } else {
                        if (j11 > j) {
                            break;
                        }
                        j10 = Math.max(j10, j11);
                    }
                }
                return j10;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // s2.a
    public final void p(long j) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f12032x;
            if (i6 < arrayList.size()) {
                long j10 = ((v3.a) arrayList.get(i6)).f13262b;
                if (j > j10 && j > ((v3.a) arrayList.get(i6)).f13264d) {
                    arrayList.remove(i6);
                    i6--;
                } else if (j < j10) {
                    return;
                }
                i6++;
            } else {
                return;
            }
        }
    }
}
