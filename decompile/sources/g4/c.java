package g4;

import com.google.android.material.datepicker.o;
import java.math.RoundingMode;
import r1.k0;
import r1.l0;
import r1.p;
import u1.a0;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public int f5434a;

    /* renamed from: b, reason: collision with root package name */
    public long f5435b;

    /* renamed from: c, reason: collision with root package name */
    public long f5436c;

    /* renamed from: d, reason: collision with root package name */
    public int f5437d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5438e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5439f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5440g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5441h;

    public c(q qVar, f0 f0Var, o oVar, String str, int i6) {
        this.f5438e = qVar;
        this.f5439f = f0Var;
        this.f5440g = oVar;
        int i10 = oVar.f2673x;
        int i11 = oVar.f2674y;
        int i12 = (oVar.A * i10) / 8;
        int i13 = oVar.f2675z;
        if (i13 == i12) {
            int i14 = i11 * i12;
            int i15 = i14 * 8;
            int max = Math.max(i12, i14 / 10);
            this.f5434a = max;
            p pVar = new p();
            pVar.f11610l = k0.p("audio/wav");
            pVar.f11611m = k0.p(str);
            pVar.f11607h = i15;
            pVar.f11608i = i15;
            pVar.f11612n = max;
            pVar.E = i10;
            pVar.F = i11;
            pVar.G = i6;
            this.f5441h = new r1.q(pVar);
            return;
        }
        throw l0.a(null, "Expected block size: " + i12 + "; got: " + i13);
    }

    @Override // g4.b
    public void a(long j) {
        this.f5435b = j;
        this.f5437d = 0;
        this.f5436c = 0L;
    }

    @Override // g4.b
    public boolean b(y2.p pVar, long j) {
        int i6;
        int i10;
        long j10 = j;
        while (j10 > 0 && (i6 = this.f5437d) < (i10 = this.f5434a)) {
            int e10 = ((f0) this.f5439f).e(pVar, (int) Math.min(i10 - i6, j10), true);
            if (e10 == -1) {
                j10 = 0;
            } else {
                this.f5437d += e10;
                j10 -= e10;
            }
        }
        o oVar = (o) this.f5440g;
        int i11 = oVar.f2675z;
        int i12 = this.f5437d / i11;
        if (i12 > 0) {
            long j11 = this.f5435b;
            long j12 = this.f5436c;
            long j13 = oVar.f2674y;
            String str = a0.f12750a;
            long Y = j11 + a0.Y(j12, 1000000L, j13, RoundingMode.DOWN);
            int i13 = i12 * i11;
            int i14 = this.f5437d - i13;
            ((f0) this.f5439f).c(Y, 1, i13, i14, null);
            this.f5436c += i12;
            this.f5437d = i14;
        }
        if (j10 <= 0) {
            return true;
        }
        return false;
    }

    @Override // g4.b
    public void c(int i6, long j) {
        ((q) this.f5438e).n(new f((o) this.f5440g, 1, i6, j));
        ((f0) this.f5439f).f((r1.q) this.f5441h);
    }
}
