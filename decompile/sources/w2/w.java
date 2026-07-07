package w2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final k f13705a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f13706b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13707c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13708d;

    /* renamed from: g, reason: collision with root package name */
    public long f13711g;
    public boolean j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13716m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13717n;

    /* renamed from: e, reason: collision with root package name */
    public int f13709e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f13710f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f13712h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f13713i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f13714k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public u1.v f13715l = u1.v.f12817a;

    public w(Context context, k kVar, long j) {
        this.f13705a = kVar;
        this.f13707c = j;
        this.f13706b = new a0(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0149, code lost:
    
        if (r4 > 100000) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0155, code lost:
    
        if (r30 >= r34) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x007a, code lost:
    
        if (r7 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r28, long r30, long r32, long r34, boolean r36, boolean r37, cg.d r38) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.w.a(long, long, long, long, boolean, boolean, cg.d):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f13709e == 3 || (!this.f13716m && this.f13717n))) {
            this.f13713i = -9223372036854775807L;
            return true;
        }
        if (this.f13713i == -9223372036854775807L) {
            return false;
        }
        this.f13715l.getClass();
        if (SystemClock.elapsedRealtime() < this.f13713i) {
            return true;
        }
        this.f13713i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z10) {
        long j;
        this.j = z10;
        long j10 = this.f13707c;
        if (j10 > 0) {
            this.f13715l.getClass();
            j = SystemClock.elapsedRealtime() + j10;
        } else {
            j = -9223372036854775807L;
        }
        this.f13713i = j;
    }

    public final void d() {
        this.f13708d = true;
        this.f13715l.getClass();
        this.f13711g = u1.a0.Q(SystemClock.elapsedRealtime());
        a0 a0Var = this.f13706b;
        a0Var.f13584d = true;
        a0Var.f13592m = 0L;
        a0Var.f13595p = -1L;
        a0Var.f13593n = -1L;
        y yVar = a0Var.f13582b;
        if (yVar != null) {
            DisplayManager displayManager = yVar.f13722a;
            z zVar = a0Var.f13583c;
            zVar.getClass();
            zVar.f13725y.sendEmptyMessage(2);
            displayManager.registerDisplayListener(yVar, u1.a0.n(null));
            a0.a(yVar.f13723b, displayManager.getDisplay(0));
        }
        a0Var.d(false);
    }

    public final void e() {
        this.f13708d = false;
        this.f13713i = -9223372036854775807L;
        a0 a0Var = this.f13706b;
        a0Var.f13584d = false;
        y yVar = a0Var.f13582b;
        if (yVar != null) {
            yVar.f13722a.unregisterDisplayListener(yVar);
            z zVar = a0Var.f13583c;
            zVar.getClass();
            zVar.f13725y.sendEmptyMessage(3);
        }
        a0Var.b();
    }

    public final void f(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    this.f13709e = Math.min(this.f13709e, 2);
                    return;
                }
                throw new IllegalStateException();
            }
            this.f13709e = 0;
            return;
        }
        this.f13709e = 1;
    }

    public final void g(float f3) {
        a0 a0Var = this.f13706b;
        a0Var.f13586f = f3;
        f fVar = a0Var.f13581a;
        fVar.f13631a.c();
        fVar.f13632b.c();
        fVar.f13633c = false;
        fVar.f13634d = -9223372036854775807L;
        fVar.f13635e = 0;
        a0Var.c();
    }

    public final void h(Surface surface) {
        boolean z10;
        if (surface != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13716m = z10;
        this.f13717n = false;
        a0 a0Var = this.f13706b;
        if (a0Var.f13585e != surface) {
            a0Var.b();
            a0Var.f13585e = surface;
            a0Var.d(true);
        }
        this.f13709e = Math.min(this.f13709e, 1);
    }

    public final void i(float f3) {
        boolean z10;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        if (f3 == this.f13714k) {
            return;
        }
        this.f13714k = f3;
        a0 a0Var = this.f13706b;
        a0Var.f13589i = f3;
        a0Var.f13592m = 0L;
        a0Var.f13595p = -1L;
        a0Var.f13593n = -1L;
        a0Var.d(false);
    }
}
