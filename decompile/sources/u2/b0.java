package u2;

import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.NoSuchElementException;
import o2.i0;
import t1.d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.d f12687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f12688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.a f12689c = new q3.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q3.d f12690d = new q3.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q3.d f12691e = new q3.d();
    public final com.google.android.material.datepicker.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12693h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d1 f12694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12695k;

    public b0(ob.d dVar, w wVar) {
        this.f12687a = dVar;
        this.f12688b = wVar;
        com.google.android.material.datepicker.o oVar = new com.google.android.material.datepicker.o();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        oVar.f3431v = 0;
        oVar.f3432w = -1;
        oVar.f3433x = 0;
        oVar.f3435z = new long[iHighestOneBit];
        oVar.f3434y = iHighestOneBit - 1;
        this.f = oVar;
        this.f12692g = -9223372036854775807L;
        this.f12694j = d1.f11975d;
        this.f12693h = -9223372036854775807L;
        this.i = -9223372036854775807L;
    }

    public final void a(long j8, long j9) {
        final ob.d dVar = this.f12687a;
        c cVar = (c) dVar.f10106x;
        while (true) {
            com.google.android.material.datepicker.o oVar = this.f;
            int i = oVar.f3433x;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j10 = ((long[]) oVar.f3435z)[oVar.f3431v];
            Long l10 = (Long) this.f12691e.f(j10);
            w wVar = this.f12688b;
            if (l10 != null && l10.longValue() != this.f12695k) {
                this.f12695k = l10.longValue();
                wVar.f(2);
            }
            long j11 = this.f12695k;
            w wVar2 = this.f12688b;
            q3.a aVar = this.f12689c;
            int iA = wVar2.a(j10, j8, j9, j11, false, false, aVar);
            if (iA == 0 || iA == 1) {
                this.f12693h = j10;
                boolean z2 = iA == 0;
                long jC = oVar.c();
                d1 d1Var = (d1) this.f12690d.f(jC);
                if (d1Var != null && !d1Var.equals(d1.f11975d) && !d1Var.equals(this.f12694j)) {
                    this.f12694j = d1Var;
                    t1.n nVar = new t1.n();
                    nVar.f12043t = d1Var.f11976a;
                    nVar.f12044u = d1Var.f11977b;
                    nVar.f12036m = t1.f0.p("video/raw");
                    dVar.f10105w = new t1.o(nVar);
                    cVar.f12702h.execute(new i0(8, dVar, d1Var));
                }
                long jNanoTime = z2 ? System.nanoTime() : aVar.f10670b;
                boolean z10 = wVar.f12793e != 3;
                wVar.f12793e = 3;
                wVar.f12798l.getClass();
                wVar.f12794g = w1.b0.M(SystemClock.elapsedRealtime());
                if (z10 && cVar.f12699d != null) {
                    final int i10 = 0;
                    cVar.f12702h.execute(new Runnable() { // from class: u2.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                    ((c) dVar.f10106x).f12701g.h();
                                    break;
                                default:
                                    ((c) dVar.f10106x).f12701g.j();
                                    break;
                            }
                        }
                    });
                }
                t1.o oVar2 = (t1.o) dVar.f10105w;
                cVar.i.b(jC, jNanoTime, oVar2 == null ? new t1.o(new t1.n()) : oVar2, null);
                g gVar = (g) cVar.f12698c.remove();
                gVar.f12721c.I0(gVar.f12719a, gVar.f12720b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.f12693h = j10;
                oVar.c();
                final int i11 = 1;
                cVar.f12702h.execute(new Runnable() { // from class: u2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                ((c) dVar.f10106x).f12701g.h();
                                break;
                            default:
                                ((c) dVar.f10106x).f12701g.j();
                                break;
                        }
                    }
                });
                g gVar2 = (g) cVar.f12698c.remove();
                gVar2.f12721c.M0(gVar2.f12719a, gVar2.f12720b);
            } else {
                if (iA != 4) {
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                    return;
                }
                this.f12693h = j10;
            }
        }
    }
}
