package m2;

import a2.e1;
import android.os.Handler;
import com.google.android.gms.internal.measurement.k4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements u2.l {
    public final j1.f0 A;
    public final d C;
    public e D;
    public g E;
    public y2.l F;
    public volatile boolean G;
    public volatile long I;

    /* renamed from: x, reason: collision with root package name */
    public final int f8465x;

    /* renamed from: y, reason: collision with root package name */
    public final w f8466y;

    /* renamed from: z, reason: collision with root package name */
    public final j2.u f8467z;
    public final Handler B = u1.a0.n(null);
    public volatile long H = -9223372036854775807L;

    public f(int i6, w wVar, j2.u uVar, j1.f0 f0Var, d dVar) {
        this.f8465x = i6;
        this.f8466y = wVar;
        this.f8467z = uVar;
        this.A = f0Var;
        this.C = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [mc.i, java.lang.Object] */
    @Override // u2.l
    public final void h() {
        if (this.G) {
            this.G = false;
        }
        try {
            if (this.D == null) {
                e e10 = this.C.e(this.f8465x);
                this.D = e10;
                this.B.post(new e1(this, e10.a(), this.D, 15));
                e eVar = this.D;
                eVar.getClass();
                this.F = new y2.l(eVar, 0L, -1L);
                g gVar = new g(this.f8466y.f8544a, this.f8465x);
                this.E = gVar;
                gVar.l(this.A);
            }
            while (!this.G) {
                if (this.H != -9223372036854775807L) {
                    g gVar2 = this.E;
                    gVar2.getClass();
                    gVar2.c(this.I, this.H);
                    this.H = -9223372036854775807L;
                }
                g gVar3 = this.E;
                gVar3.getClass();
                y2.l lVar = this.F;
                lVar.getClass();
                if (gVar3.i(lVar, new Object()) == -1) {
                    break;
                }
            }
            this.G = false;
            e eVar2 = this.D;
            eVar2.getClass();
            if (eVar2.i()) {
                k4.f(this.D);
                this.D = null;
            }
        } catch (Throwable th) {
            e eVar3 = this.D;
            eVar3.getClass();
            if (eVar3.i()) {
                k4.f(this.D);
                this.D = null;
            }
            throw th;
        }
    }

    @Override // u2.l
    public final void p() {
        this.G = true;
    }
}
