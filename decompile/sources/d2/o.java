package d2;

import android.os.Handler;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import j4.b0;
import q2.v0;
import q2.y0;
import r1.j0;
import r1.l0;
import r1.q;
import u1.a0;
import u1.t;
import y2.e0;
import y2.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f3759a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f3760b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final h3.a f3761c = new h3.a();

    /* renamed from: d, reason: collision with root package name */
    public long f3762d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f3763e;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, j4.b0] */
    public o(p pVar, u2.e eVar) {
        this.f3763e = pVar;
        this.f3759a = new y0(eVar, null, null);
    }

    @Override // y2.f0
    public final void a(int i6, t tVar) {
        b(tVar, i6, 0);
    }

    @Override // y2.f0
    public final void b(t tVar, int i6, int i10) {
        y0 y0Var = this.f3759a;
        y0Var.getClass();
        y0Var.b(tVar, i6, 0);
    }

    @Override // y2.f0
    public final void c(long j, int i6, int i10, int i11, e0 e0Var) {
        long i12;
        long j10;
        this.f3759a.c(j, i6, i10, i11, e0Var);
        while (this.f3759a.x(false)) {
            h3.a aVar = this.f3761c;
            aVar.clear();
            if (this.f3759a.C(this.f3760b, aVar, 0, false) == -4) {
                aVar.d();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.B;
                j0 d10 = this.f3763e.f3766z.d(aVar);
                if (d10 != null) {
                    j3.a aVar2 = (j3.a) d10.f11523a[0];
                    String str = aVar2.f7148a;
                    String str2 = aVar2.f7149b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str2) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str2) || "3".equals(str2))) {
                        try {
                            j10 = a0.T(a0.o(aVar2.f7152e));
                        } catch (l0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            n nVar = new n(j11, j10);
                            Handler handler = this.f3763e.A;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        y0 y0Var = this.f3759a;
        v0 v0Var = y0Var.f10987a;
        synchronized (y0Var) {
            int i13 = y0Var.s;
            if (i13 == 0) {
                i12 = -1;
            } else {
                i12 = y0Var.i(i13);
            }
        }
        v0Var.b(i12);
    }

    @Override // y2.f0
    public final int d(r1.i iVar, int i6, boolean z10) {
        y0 y0Var = this.f3759a;
        y0Var.getClass();
        return y0Var.d(iVar, i6, z10);
    }

    @Override // y2.f0
    public final int e(r1.i iVar, int i6, boolean z10) {
        return d(iVar, i6, z10);
    }

    @Override // y2.f0
    public final void f(q qVar) {
        this.f3759a.f(qVar);
    }
}
