package w1;

import android.os.SystemClock;
import db.c1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c implements h {
    public l A;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f13530x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f13531y = new ArrayList(1);

    /* renamed from: z, reason: collision with root package name */
    public int f13532z;

    public c(boolean z10) {
        this.f13530x = z10;
    }

    public final void b(int i6) {
        boolean z10;
        l lVar = this.A;
        String str = u1.a0.f12750a;
        for (int i10 = 0; i10 < this.f13532z; i10++) {
            a0 a0Var = (a0) this.f13531y.get(i10);
            boolean z11 = this.f13530x;
            u2.g gVar = (u2.g) a0Var;
            synchronized (gVar) {
                c1 c1Var = u2.g.f12840p;
                if (z11 && (lVar.f13549h & 8) != 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    gVar.f12854i += i6;
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        l lVar = this.A;
        String str = u1.a0.f12750a;
        for (int i6 = 0; i6 < this.f13532z; i6++) {
            a0 a0Var = (a0) this.f13531y.get(i6);
            boolean z12 = this.f13530x;
            u2.g gVar = (u2.g) a0Var;
            synchronized (gVar) {
                try {
                    c1 c1Var = u2.g.f12840p;
                    if (z12 && (lVar.f13549h & 8) != 8) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (gVar.f12852g > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        u1.c.g(z11);
                        gVar.f12849d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i10 = (int) (elapsedRealtime - gVar.f12853h);
                        gVar.j += i10;
                        long j = gVar.f12855k;
                        long j10 = gVar.f12854i;
                        gVar.f12855k = j + j10;
                        if (i10 > 0) {
                            gVar.f12851f.a((int) Math.sqrt(j10), (((float) j10) * 8000.0f) / i10);
                            if (gVar.j < 2000) {
                                if (gVar.f12855k >= 524288) {
                                }
                                gVar.b(i10, gVar.f12854i, gVar.f12856l);
                                gVar.f12853h = elapsedRealtime;
                                gVar.f12854i = 0L;
                            }
                            gVar.f12856l = gVar.f12851f.b();
                            gVar.b(i10, gVar.f12854i, gVar.f12856l);
                            gVar.f12853h = elapsedRealtime;
                            gVar.f12854i = 0L;
                        }
                        gVar.f12852g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.A = null;
    }

    public final void f() {
        for (int i6 = 0; i6 < this.f13532z; i6++) {
            ((a0) this.f13531y.get(i6)).getClass();
        }
    }

    public final void g(l lVar) {
        boolean z10;
        this.A = lVar;
        for (int i6 = 0; i6 < this.f13532z; i6++) {
            a0 a0Var = (a0) this.f13531y.get(i6);
            boolean z11 = this.f13530x;
            u2.g gVar = (u2.g) a0Var;
            synchronized (gVar) {
                try {
                    c1 c1Var = u2.g.f12840p;
                    if (z11 && (lVar.f13549h & 8) != 8) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (gVar.f12852g == 0) {
                            gVar.f12849d.getClass();
                            gVar.f12853h = SystemClock.elapsedRealtime();
                        }
                        gVar.f12852g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // w1.h
    public final void q(a0 a0Var) {
        a0Var.getClass();
        ArrayList arrayList = this.f13531y;
        if (!arrayList.contains(a0Var)) {
            arrayList.add(a0Var);
            this.f13532z++;
        }
    }

    @Override // w1.h
    public Map u() {
        return Collections.EMPTY_MAP;
    }
}
