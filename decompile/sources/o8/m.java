package o8;

import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.tb;
import com.google.android.material.behavior.SwipeDismissBehavior;
import h.p;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import k8.k4;
import me.s;
import me.x;
import s7.r;
import t7.k0;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f9980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9981x;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.f9979v = i;
        this.f9980w = obj2;
        this.f9981x = obj;
    }

    private final void a() {
        p7.k kVar = (p7.k) this.f9980w;
        int i = ((p7.l) this.f9981x).f10423a;
        synchronized (kVar) {
            p7.l lVar = (p7.l) kVar.f10422z.get(i);
            if (lVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                kVar.f10422z.remove(i);
                lVar.b(new tb("Timed out waiting for response", (Throwable) null));
                kVar.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1 A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:33:0x0091, B:35:0x0095, B:37:0x0099, B:42:0x00a6, B:47:0x00b1, B:48:0x00bd), top: B:61:0x0091 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.m.b():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        t7.i iVar;
        t7.i k0Var;
        int i = 0;
        switch (this.f9979v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                l lVar = (l) this.f9981x;
                try {
                    o oVarC = ((g) lVar.f9977x).C(((o) this.f9980w).h());
                    if (oVarC == null) {
                        lVar.z(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    p pVar = i.f9965b;
                    oVarC.d(pVar, lVar);
                    oVarC.c(pVar, lVar);
                    oVarC.a(pVar, lVar);
                    return;
                } catch (CancellationException unused) {
                    lVar.m();
                    return;
                } catch (f e7) {
                    if (e7.getCause() instanceof Exception) {
                        lVar.z((Exception) e7.getCause());
                        return;
                    } else {
                        lVar.z(e7);
                        return;
                    }
                } catch (Exception e10) {
                    lVar.z(e10);
                    return;
                }
            case 1:
                o oVar = (o) this.f9980w;
                try {
                    oVar.l(((Callable) this.f9981x).call());
                    return;
                } catch (Exception e11) {
                    oVar.n(e11);
                    return;
                } catch (Throwable th) {
                    oVar.n(new RuntimeException(th));
                    return;
                }
            case 2:
                p7.k kVar = (p7.k) this.f9980w;
                IBinder iBinder = (IBinder) this.f9981x;
                synchronized (kVar) {
                    if (iBinder == null) {
                        kVar.a("Null service connection");
                    } else {
                        try {
                            kVar.f10420x = new ob.d(iBinder);
                            kVar.f10418v = 2;
                            ((ScheduledExecutorService) kVar.A.f10431x).execute(new p7.j(kVar, i));
                        } catch (RemoteException e12) {
                            kVar.a(e12.getMessage());
                        }
                    }
                }
                return;
            case 3:
                a();
                return;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                k4 k4Var = (k4) this.f9980w;
                Typeface typeface = (Typeface) this.f9981x;
                k0.b bVar = (k0.b) k4Var.f7607v;
                if (bVar != null) {
                    bVar.i(typeface);
                    return;
                }
                return;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                ((q0.f) this.f9980w).accept(this.f9981x);
                return;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                re.g gVar = (re.g) this.f9981x;
                s sVar = gVar.f11382y;
                while (true) {
                    try {
                        ((Runnable) this.f9980w).run();
                    } catch (Throwable th2) {
                        x.i(th2, sd.i.f11797v);
                    }
                    Runnable runnableR0 = gVar.r0();
                    if (runnableR0 == null) {
                        return;
                    }
                    this.f9980w = runnableR0;
                    i++;
                    if (i >= 16 && sVar.p0(gVar)) {
                        sVar.o0(gVar, this);
                        return;
                    }
                    break;
                }
                break;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                q7.b bVar2 = (q7.b) this.f9980w;
                o2.p pVar2 = (o2.p) this.f9981x;
                s7.d dVar = (s7.d) pVar2.A;
                r7.c cVar = (r7.c) pVar2.f9503w;
                s7.j jVar = (s7.j) dVar.E.get((s7.a) pVar2.f9504x);
                if (jVar == null) {
                    return;
                }
                if (bVar2.f10894w != 0) {
                    jVar.o(bVar2, null);
                    return;
                }
                pVar2.f9502v = true;
                if (cVar.b()) {
                    if (!pVar2.f9502v || (iVar = (t7.i) pVar2.f9505y) == null) {
                        return;
                    }
                    ((t7.e) cVar).k(iVar, (Set) pVar2.f9506z);
                    return;
                }
                try {
                    t7.h hVar = (t7.h) cVar;
                    ((t7.e) cVar).k(null, hVar.b() ? hVar.f12353z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e13) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e13);
                    ((t7.e) cVar).f("Failed to get service from broker.");
                    jVar.o(new q7.b(10, null, null), null);
                    return;
                }
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                b();
                return;
            case 9:
                r rVar = (r) this.f9981x;
                m8.f fVar = (m8.f) this.f9980w;
                rVar.getClass();
                q7.b bVar3 = fVar.f8519w;
                if (bVar3.f10894w == 0) {
                    t7.s sVar2 = fVar.f8520x;
                    y.g(sVar2);
                    q7.b bVar4 = sVar2.f12404x;
                    if (bVar4.f10894w != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        rVar.f11546k.e(bVar4);
                        rVar.f11545j.e();
                        return;
                    }
                    o2.p pVar3 = rVar.f11546k;
                    IBinder iBinder2 = sVar2.f12403w;
                    if (iBinder2 == null) {
                        k0Var = null;
                    } else {
                        int i10 = t7.a.f12307e;
                        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        k0Var = iInterfaceQueryLocalInterface instanceof t7.i ? (t7.i) iInterfaceQueryLocalInterface : new k0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                    }
                    Set set = rVar.f11544h;
                    pVar3.getClass();
                    if (k0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        pVar3.e(new q7.b(4, null, null));
                    } else {
                        pVar3.f9505y = k0Var;
                        pVar3.f9506z = set;
                        if (pVar3.f9502v) {
                            ((t7.e) ((r7.c) pVar3.f9503w)).k(k0Var, set);
                        }
                    }
                } else {
                    rVar.f11546k.e(bVar3);
                }
                rVar.f11545j.e();
                return;
            default:
                b1.e eVar = ((SwipeDismissBehavior) this.f9981x).f3339a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                ((View) this.f9980w).postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z2, int i) {
        this.f9979v = i;
        this.f9980w = obj;
        this.f9981x = obj2;
    }

    public m(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f9979v = 10;
        this.f9981x = swipeDismissBehavior;
        this.f9980w = view;
    }
}
