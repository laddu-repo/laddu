package a3;

import u1.a0;
import y2.s;
import y2.y;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class b implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f518a;

    /* renamed from: b, reason: collision with root package name */
    public final long f519b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f520c;

    public /* synthetic */ b(Object obj, long j, int i6) {
        this.f518a = i6;
        this.f520c = obj;
        this.f519b = j;
    }

    @Override // y2.z
    public final boolean g() {
        switch (this.f518a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // y2.z
    public final y j(long j) {
        long j10;
        switch (this.f518a) {
            case 0:
                d dVar = (d) this.f520c;
                y b10 = dVar.f532i[0].b(j);
                int i6 = 1;
                while (true) {
                    g[] gVarArr = dVar.f532i;
                    if (i6 < gVarArr.length) {
                        y b11 = gVarArr[i6].b(j);
                        if (b11.f14970a.f14851b < b10.f14970a.f14851b) {
                            b10 = b11;
                        }
                        i6++;
                    } else {
                        return b10;
                    }
                }
            case 1:
                s sVar = (s) this.f520c;
                u1.c.h(sVar.f14940k);
                y1.c cVar = sVar.f14940k;
                long[] jArr = (long[]) cVar.f14799a;
                long[] jArr2 = (long[]) cVar.f14800b;
                int e10 = a0.e(jArr, a0.j((sVar.f14935e * j) / 1000000, 0L, sVar.j - 1), false);
                long j11 = 0;
                if (e10 == -1) {
                    j10 = 0;
                } else {
                    j10 = jArr[e10];
                }
                if (e10 != -1) {
                    j11 = jArr2[e10];
                }
                int i10 = sVar.f14935e;
                long j12 = (j10 * 1000000) / i10;
                long j13 = this.f519b;
                y2.a0 a0Var = new y2.a0(j12, j11 + j13);
                if (j12 != j && e10 != jArr.length - 1) {
                    int i11 = e10 + 1;
                    return new y(a0Var, new y2.a0((jArr[i11] * 1000000) / i10, j13 + jArr2[i11]));
                }
                return new y(a0Var, a0Var);
            default:
                return (y) this.f520c;
        }
    }

    @Override // y2.z
    public final long m() {
        switch (this.f518a) {
            case 0:
                return this.f519b;
            case 1:
                return ((s) this.f520c).b();
            default:
                return this.f519b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(long j) {
        this(j, 0L);
        this.f518a = 2;
    }

    public b(long j, long j10) {
        this.f518a = 2;
        this.f519b = j;
        y2.a0 a0Var = j10 == 0 ? y2.a0.f14849c : new y2.a0(0L, j10);
        this.f520c = new y(a0Var, a0Var);
    }
}
