package a2;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.j5;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f261x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f262y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f263z;

    public /* synthetic */ h0(int i6, Object obj, Object obj2, Object obj3, boolean z10) {
        this.f261x = i6;
        this.f263z = obj;
        this.f262y = z10;
        this.A = obj2;
        this.B = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlaybackSession createPlaybackSession;
        b2.l lVar;
        LogSessionId sessionId;
        boolean equals;
        int i6;
        LogSessionId unused;
        switch (this.f261x) {
            case 0:
                Context context = (Context) this.f263z;
                boolean z10 = this.f262y;
                n0 n0Var = (n0) this.A;
                b2.m mVar = (b2.m) this.B;
                MediaMetricsManager a10 = a9.f.a(context.getSystemService("media_metrics"));
                if (a10 != null) {
                    createPlaybackSession = a10.createPlaybackSession();
                    lVar = new b2.l(context, createPlaybackSession);
                } else {
                    lVar = null;
                }
                if (lVar == null) {
                    u1.a.p("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z10) {
                    b2.f fVar = n0Var.Q;
                    fVar.getClass();
                    fVar.C.a(lVar);
                }
                sessionId = lVar.f1388d.getSessionId();
                synchronized (mVar) {
                    u5.r rVar = mVar.f1410b;
                    rVar.getClass();
                    LogSessionId logSessionId = (LogSessionId) rVar.f12916y;
                    unused = LogSessionId.LOG_SESSION_ID_NONE;
                    equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                    u1.c.g(equals);
                    rVar.f12916y = sessionId;
                }
                return;
            case 1:
                i4.b0 b0Var = (i4.b0) this.f263z;
                boolean z11 = this.f262y;
                i4.s sVar = (i4.s) this.A;
                Runnable runnable = (Runnable) this.B;
                i4.h1 h1Var = b0Var.f6307g;
                if (z11) {
                    i4.o1 o1Var = new i4.o1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        i4.n1 n10 = h1Var.f6393f.n(sVar);
                        if (n10 != null) {
                            i6 = n10.b(i4.b0.B).E;
                        } else if (!b0Var.h(sVar)) {
                            j5.l(new i4.s1(-100));
                        } else {
                            j5.l(new i4.s1(0));
                            i6 = 0;
                        }
                        i4.r rVar2 = sVar.f6542d;
                        if (rVar2 != null) {
                            rVar2.f(i6, o1Var);
                        }
                    } catch (DeadObjectException unused2) {
                        h1Var.f6393f.y(sVar);
                        j5.l(new i4.s1(-100));
                    } catch (RemoteException e10) {
                        u1.a.q("MediaSessionImpl", "Exception in " + sVar, e10);
                        j5.l(new i4.s1(-1));
                    }
                }
                runnable.run();
                h1Var.f6393f.e(sVar);
                return;
            default:
                j4 j4Var = (j4) this.f263z;
                i4.t tVar = (i4.t) this.A;
                boolean z12 = this.f262y;
                i4.s sVar2 = (i4.s) this.B;
                i4.b0 b0Var2 = ((i4.o0) j4Var.A).f6473g;
                i4.l1 l1Var = b0Var2.f6318t;
                lg.c.r(l1Var, tVar);
                int e02 = l1Var.e0();
                if (e02 == 1) {
                    if (l1Var.n0(2)) {
                        l1Var.c();
                    }
                } else if (e02 == 4 && l1Var.n0(4)) {
                    l1Var.B();
                }
                if (z12 && l1Var.n0(1)) {
                    l1Var.j0();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 : new int[]{31, 2}) {
                    u1.c.g(!false);
                    sparseBooleanArray.append(i10, true);
                }
                if (z12) {
                    u1.c.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                u1.c.g(!false);
                b0Var2.p(sVar2);
                return;
        }
    }

    public /* synthetic */ h0(j4 j4Var, i4.t tVar, boolean z10, i4.s sVar) {
        this.f261x = 2;
        this.f263z = j4Var;
        this.A = tVar;
        this.f262y = z10;
        this.B = sVar;
    }
}
