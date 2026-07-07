package m8;

import a2.a2;
import a2.h;
import a2.j0;
import a2.k0;
import a2.n0;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.telephony.TelephonyManager;
import android.view.Surface;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.unity3d.services.core.device.MimeTypes;
import hb.d0;
import i.o;
import java.util.Iterator;
import java.util.concurrent.Callable;
import o4.j;
import o5.p;
import q2.c0;
import q2.s0;
import qb.m;
import qb.n;
import r1.p1;
import s8.l;
import u1.a0;
import u1.r;
import u1.x;
import w2.e0;
import x2.k;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8708x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8709y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f8710z;

    public /* synthetic */ c(int i6, Object obj, Object obj2) {
        this.f8708x = i6;
        this.f8709y = obj;
        this.f8710z = obj2;
    }

    private final void a() {
        m mVar = (m) this.f8709y;
        bc.a aVar = (bc.a) this.f8710z;
        synchronized (mVar) {
            try {
                if (mVar.f11178b == null) {
                    mVar.f11177a.add(aVar);
                } else {
                    mVar.f11178b.add(aVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        l lVar = (l) this.f8709y;
        h hVar = (h) this.f8710z;
        synchronized (hVar) {
        }
        e0 e0Var = (e0) lVar.f12252z;
        String str = a0.f12750a;
        b2.f fVar = ((k0) e0Var).f295x.Q;
        b2.a S = fVar.S((c0) fVar.A.f900e);
        fVar.W(S, 1020, new a2.e0(S, hVar, 9));
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar;
        int i6 = 1;
        int i10 = 6;
        switch (this.f8708x) {
            case 0:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f8709y;
                JobParameters jobParameters = (JobParameters) this.f8710z;
                int i11 = JobInfoSchedulerService.f2129x;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 1:
                ((u1.g) this.f8709y).accept(this.f8710z);
                return;
            case 2:
                ((s0) this.f8709y).E((z) this.f8710z);
                return;
            case 3:
                n nVar = (n) this.f8709y;
                bc.a aVar = (bc.a) this.f8710z;
                if (nVar.f11182b == n.f11180d) {
                    synchronized (nVar) {
                        pVar = nVar.f11181a;
                        nVar.f11181a = null;
                        nVar.f11182b = aVar;
                    }
                    pVar.getClass();
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 4:
                a();
                return;
            case 5:
                rb.a aVar2 = (rb.a) this.f8709y;
                Runnable runnable = (Runnable) this.f8710z;
                Process.setThreadPriority(aVar2.f11927c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f11928d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 6:
                Callable callable = (Callable) this.f8709y;
                rb.g gVar = (rb.g) ((a2) this.f8710z).f162y;
                try {
                    gVar.j(callable.call());
                    return;
                } catch (Exception e10) {
                    gVar.k(e10);
                    return;
                }
            case 7:
                Context context = (Context) this.f8709y;
                u1.f fVar = (u1.f) this.f8710z;
                s1.c.f11972a = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                fVar.e();
                return;
            case 8:
                j jVar = (j) this.f8709y;
                Object apply = ((a2.a0) this.f8710z).apply(jVar.f9929f);
                jVar.f9929f = apply;
                u1.b bVar = new u1.b(jVar, apply, i6);
                x xVar = (x) jVar.f9926c;
                if (xVar.f12820a.getLooper().getThread().isAlive()) {
                    xVar.c(bVar);
                    return;
                }
                return;
            case 9:
                r rVar = (r) this.f8709y;
                Context context2 = (Context) this.f8710z;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new c2.g(rVar, i10), intentFilter);
                return;
            case 10:
                c2.g gVar2 = (c2.g) this.f8709y;
                Context context3 = (Context) this.f8710z;
                r rVar2 = (r) gVar2.f1800b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i6 = type != 9 ? 8 : 7;
                                        }
                                        i6 = 5;
                                    }
                                }
                                i6 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i6 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i6 = 4;
                                    break;
                                case 13:
                                    i6 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i6 = 6;
                                    break;
                                case 18:
                                    i6 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i6 = 9;
                                        break;
                                    }
                                    break;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT < 31 && i6 == 5) {
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context3.getSystemService("phone");
                            telephonyManager.getClass();
                            u1.p pVar2 = new u1.p(rVar2);
                            telephonyManager.registerTelephonyCallback(rVar2.f12798a, pVar2);
                            telephonyManager.unregisterTelephonyCallback(pVar2);
                            return;
                        } catch (RuntimeException unused2) {
                            rVar2.c(5);
                            return;
                        }
                    }
                    rVar2.c(i6);
                    return;
                }
                i6 = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                rVar2.c(i6);
                return;
            case 11:
                d0 d0Var = (d0) this.f8709y;
                hb.x xVar2 = (hb.x) this.f8710z;
                if (d0Var.f6026x instanceof hb.a) {
                    xVar2.cancel(false);
                    return;
                }
                return;
            case 12:
                ((w2.d) ((l) this.f8709y).f12252z).f13617g.b((p1) this.f8710z);
                return;
            case 13:
                l lVar = (l) this.f8709y;
                p1 p1Var = (p1) this.f8710z;
                e0 e0Var = (e0) lVar.f12252z;
                String str = a0.f12750a;
                n0 n0Var = ((k0) e0Var).f295x;
                n0Var.G0 = p1Var;
                n0Var.K.e(25, new j0(p1Var));
                return;
            case 14:
                b();
                return;
            case 15:
                k kVar = (k) this.f8709y;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f8710z;
                SurfaceTexture surfaceTexture2 = kVar.D;
                Surface surface = kVar.E;
                Surface surface2 = new Surface(surfaceTexture);
                kVar.D = surfaceTexture;
                kVar.E = surface2;
                Iterator it = kVar.f14489x.iterator();
                while (it.hasNext()) {
                    ((k0) it.next()).f295x.z1(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f8709y;
                o oVar = (o) this.f8710z;
                try {
                    runnable2.run();
                    return;
                } finally {
                    oVar.b();
                }
        }
    }
}
