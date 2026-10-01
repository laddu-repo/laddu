package c2;

import android.media.AudioTrack;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import i4.d1;
import i4.f1;
import i4.h1;
import i4.j1;
import i4.l1;
import i4.n1;
import i4.p1;
import i4.u1;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import r1.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1757x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1758y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1759z;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f1757x = i6;
        this.f1758y = obj;
        this.f1759z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    private final void a() {
        ic.s sVar = (ic.s) this.f1758y;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1759z;
        i4.f fVar = (i4.f) this.A;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.B;
        synchronized (sVar.f6781x) {
            try {
                if (!atomicBoolean.get()) {
                    sVar.d(fVar);
                } else {
                    atomicBoolean2.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x015b, code lost:
    
        if (r8.equals("android.media.metadata.DISPLAY_SUBTITLE") == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a0.b():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1757x) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.f1758y;
                q qVar = (q) this.f1759z;
                Handler handler = (Handler) this.A;
                n nVar = (n) this.B;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (qVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new a2.c0(7, qVar, nVar));
                    }
                    synchronized (i0.o0) {
                        try {
                            int i6 = i0.f1817q0 - 1;
                            i0.f1817q0 = i6;
                            if (i6 == 0) {
                                i0.f1816p0.shutdown();
                                i0.f1816p0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (qVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new a2.c0(7, qVar, nVar));
                    }
                    synchronized (i0.o0) {
                        try {
                            int i10 = i0.f1817q0 - 1;
                            i0.f1817q0 = i10;
                            if (i10 == 0) {
                                i0.f1816p0.shutdown();
                                i0.f1816p0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                h1 h1Var = (h1) this.f1758y;
                i4.s sVar = (i4.s) this.f1759z;
                i4.b0 b0Var = (i4.b0) this.A;
                i4.j jVar = (i4.j) this.B;
                h1Var.getClass();
                ic.s sVar2 = h1Var.f6393f;
                boolean z10 = false;
                try {
                    h1Var.f6394g.remove(sVar);
                    if (!b0Var.j()) {
                        d1 d1Var = (d1) sVar.f6542d;
                        u1.c.h(d1Var);
                        IBinder asBinder = ((i4.i) d1Var.f6339x).asBinder();
                        i4.q m9 = b0Var.m(sVar);
                        if (sVar2.s(sVar)) {
                            u1.a.p("MediaSessionStub", "Controller " + sVar + " has sent connection request multiple times");
                        }
                        sVar2.a(asBinder, sVar, m9.f6504a, m9.f6505b);
                        n1 n10 = sVar2.n(sVar);
                        if (n10 == null) {
                            u1.a.p("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            l1 l1Var = b0Var.f6318t;
                            j1 j1Var = b0Var.s;
                            q0 q0Var = m9.f6505b;
                            j1 J = h1Var.J(j1Var);
                            MediaSession.Token token = ((j4.u) b0Var.f6308h.f6476k.f7158x).f7210c.f7156y;
                            db.k0 k0Var = m9.f6506c;
                            if (k0Var == null) {
                                k0Var = b0Var.f6323y;
                            }
                            db.k0 k0Var2 = m9.f6507d;
                            if (k0Var2 == null) {
                                k0Var2 = b0Var.f6324z;
                            }
                            db.k0 k0Var3 = b0Var.f6317r;
                            p1 p1Var = m9.f6504a;
                            q0 l10 = l1Var.l();
                            u1 u1Var = b0Var.j.f6563a;
                            u1Var.getClass();
                            i4.h hVar = new i4.h(h1Var, k0Var, k0Var2, k0Var3, p1Var, q0Var, l10, new Bundle(u1Var.f6580d), b0Var.A, J, token);
                            if (!b0Var.j()) {
                                try {
                                    ((i4.i) jVar).a(n10.c(), hVar.a(sVar.f6541c));
                                    z10 = true;
                                } catch (RemoteException unused) {
                                }
                                if (z10 && (!b0Var.f6322x || !i4.b0.k(sVar))) {
                                    b0Var.f6305e.getClass();
                                    break;
                                }
                                return;
                            }
                        }
                    }
                    return;
                } finally {
                    if (0 == 0) {
                        cf.m.g(jVar);
                    }
                }
            case 4:
                i4.b0 b0Var2 = (i4.b0) this.f1758y;
                hb.d0 d0Var = (hb.d0) this.f1759z;
                u1.g gVar = (u1.g) this.A;
                hb.x xVar = (hb.x) this.B;
                if (b0Var2.j()) {
                    d0Var.k(null);
                    return;
                }
                try {
                    gVar.accept(xVar);
                    d0Var.k(null);
                    return;
                } catch (Throwable th2) {
                    d0Var.l(th2);
                    return;
                }
            default:
                i4.b0 b0Var3 = (i4.b0) this.f1758y;
                f1 f1Var = (f1) this.f1759z;
                i4.s sVar3 = (i4.s) this.A;
                List list = (List) this.B;
                if (!b0Var3.j()) {
                    f1Var.b(b0Var3.f6318t, sVar3, list);
                    return;
                }
                return;
        }
    }
}
