package n9;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ c0 A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9148x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9149y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f9150z;

    public /* synthetic */ a(b0 b0Var, String str, long j, int i6) {
        this.f9148x = i6;
        this.f9149y = str;
        this.f9150z = j;
        this.A = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9148x) {
            case 0:
                b0 b0Var = (b0) this.A;
                String str = (String) this.f9149y;
                b0Var.d1();
                w8.x.d(str);
                v.e eVar = b0Var.A;
                boolean isEmpty = eVar.isEmpty();
                long j = this.f9150z;
                if (isEmpty) {
                    b0Var.B = j;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                }
                if (eVar.f13174z >= 100) {
                    u0 u0Var = ((n1) b0Var.f4301y).C;
                    n1.g(u0Var);
                    u0Var.G.a("Too many ads visible");
                    return;
                } else {
                    eVar.put(str, 1);
                    b0Var.f9182z.put(str, Long.valueOf(j));
                    return;
                }
            case 1:
                b0 b0Var2 = (b0) this.A;
                String str2 = (String) this.f9149y;
                n1 n1Var = (n1) b0Var2.f4301y;
                b0Var2.d1();
                w8.x.d(str2);
                v.e eVar2 = b0Var2.A;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 != null) {
                    x2 x2Var = n1Var.I;
                    u0 u0Var2 = n1Var.C;
                    n1.f(x2Var);
                    u2 j12 = x2Var.j1(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        eVar2.remove(str2);
                        v.e eVar3 = b0Var2.f9182z;
                        Long l10 = (Long) eVar3.get(str2);
                        long j10 = this.f9150z;
                        if (l10 == null) {
                            n1.g(u0Var2);
                            u0Var2.D.a("First ad unit exposure time was never set");
                        } else {
                            long longValue = j10 - l10.longValue();
                            eVar3.remove(str2);
                            b0Var2.i1(str2, longValue, j12);
                        }
                        if (eVar2.isEmpty()) {
                            long j11 = b0Var2.B;
                            if (j11 == 0) {
                                n1.g(u0Var2);
                                u0Var2.D.a("First ad exposure time was never set");
                                return;
                            } else {
                                b0Var2.h1(j10 - j11, j12);
                                b0Var2.B = 0L;
                                return;
                            }
                        }
                        return;
                    }
                    eVar2.put(str2, Integer.valueOf(intValue));
                    return;
                }
                u0 u0Var3 = n1Var.C;
                n1.g(u0Var3);
                u0Var3.D.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                return;
            default:
                x2 x2Var2 = (x2) this.A;
                x2Var2.h1((u2) this.f9149y, false, this.f9150z);
                x2Var2.C = null;
                h3 j13 = ((n1) x2Var2.f4301y).j();
                j13.d1();
                j13.e1();
                j13.r1(new hb.s(j13, (u2) null));
                return;
        }
    }

    public a(x2 x2Var, u2 u2Var, long j) {
        this.f9148x = 2;
        this.f9149y = u2Var;
        this.f9150z = j;
        Objects.requireNonNull(x2Var);
        this.A = x2Var;
    }
}
