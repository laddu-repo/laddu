package w5;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.lifecycle.j1;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import g8.p;
import hb.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements b, d6.a {
    public static final String I = o.h("Processor");
    public final j1 A;
    public final WorkDatabase B;
    public final List E;

    /* renamed from: y, reason: collision with root package name */
    public final Context f14088y;

    /* renamed from: z, reason: collision with root package name */
    public final v5.b f14089z;
    public final HashMap D = new HashMap();
    public final HashMap C = new HashMap();
    public final HashSet F = new HashSet();
    public final ArrayList G = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public PowerManager.WakeLock f14087x = null;
    public final Object H = new Object();

    public c(Context context, v5.b bVar, j1 j1Var, WorkDatabase workDatabase, List list) {
        this.f14088y = context;
        this.f14089z = bVar;
        this.A = j1Var;
        this.B = workDatabase;
        this.E = list;
    }

    public static boolean b(String str, m mVar) {
        boolean z10;
        if (mVar != null) {
            mVar.P = true;
            mVar.h();
            x xVar = mVar.O;
            if (xVar != null) {
                z10 = xVar.isDone();
                mVar.O.cancel(true);
            } else {
                z10 = false;
            }
            ListenableWorker listenableWorker = mVar.C;
            if (listenableWorker != null && !z10) {
                listenableWorker.stop();
            } else {
                o.f().b(m.Q, "WorkSpec " + mVar.B + " is already done. Not interrupting.", new Throwable[0]);
            }
            o.f().b(I, r4.a.k("WorkerWrapper interrupted for ", str), new Throwable[0]);
            return true;
        }
        o.f().b(I, r4.a.k("WorkerWrapper could not be found for ", str), new Throwable[0]);
        return false;
    }

    public final void a(b bVar) {
        synchronized (this.H) {
            this.G.add(bVar);
        }
    }

    @Override // w5.b
    public final void c(String str, boolean z10) {
        synchronized (this.H) {
            try {
                this.D.remove(str);
                int i6 = 0;
                o.f().b(I, c.class.getSimpleName() + " " + str + " executed; reschedule = " + z10, new Throwable[0]);
                ArrayList arrayList = this.G;
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((b) obj).c(str, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean contains;
        synchronized (this.H) {
            contains = this.F.contains(str);
        }
        return contains;
    }

    public final boolean e(String str) {
        boolean z10;
        synchronized (this.H) {
            try {
                if (!this.D.containsKey(str) && !this.C.containsKey(str)) {
                    z10 = false;
                }
                z10 = true;
            } finally {
            }
        }
        return z10;
    }

    public final void f(b bVar) {
        synchronized (this.H) {
            this.G.remove(bVar);
        }
    }

    public final void g(String str, v5.h hVar) {
        synchronized (this.H) {
            try {
                o.f().g(I, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.D.remove(str);
                if (mVar != null) {
                    if (this.f14087x == null) {
                        PowerManager.WakeLock a10 = f6.k.a(this.f14088y, "ProcessorForegroundLck");
                        this.f14087x = a10;
                        a10.acquire();
                    }
                    this.C.put(str, mVar);
                    Intent d10 = d6.c.d(this.f14088y, str, hVar);
                    Context context = this.f14088y;
                    if (Build.VERSION.SDK_INT >= 26) {
                        i0.c.c(context, d10);
                    } else {
                        context.startService(d10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, w5.m, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [g6.j, g6.h, java.lang.Object] */
    public final boolean h(String str, n9.j jVar) {
        synchronized (this.H) {
            try {
                if (e(str)) {
                    o.f().b(I, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f14088y;
                v5.b bVar = this.f14089z;
                j1 j1Var = this.A;
                WorkDatabase workDatabase = this.B;
                n9.j jVar2 = new n9.j();
                Context applicationContext = context.getApplicationContext();
                List list = this.E;
                if (jVar == null) {
                    jVar = jVar2;
                }
                ?? obj = new Object();
                obj.E = new v5.k();
                ?? obj2 = new Object();
                obj.N = obj2;
                obj.O = null;
                obj.f14120x = applicationContext;
                obj.D = j1Var;
                obj.G = this;
                obj.f14121y = str;
                obj.f14122z = list;
                obj.A = jVar;
                obj.C = null;
                obj.F = bVar;
                obj.H = workDatabase;
                obj.I = workDatabase.y();
                obj.J = workDatabase.t();
                obj.K = workDatabase.z();
                d6.b bVar2 = new d6.b(15);
                bVar2.f3823z = this;
                bVar2.f3822y = str;
                bVar2.A = obj2;
                obj2.a(bVar2, (p) this.A.A);
                this.D.put(str, obj);
                ((f6.i) this.A.f949y).execute(obj);
                o.f().b(I, c.class.getSimpleName() + ": processing " + str, new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.H) {
            try {
                if (this.C.isEmpty()) {
                    Context context = this.f14088y;
                    String str = d6.c.G;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f14088y.startService(intent);
                    } catch (Throwable th) {
                        o.f().e(I, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f14087x;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f14087x = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean b10;
        synchronized (this.H) {
            o.f().b(I, "Processor stopping foreground work " + str, new Throwable[0]);
            b10 = b(str, (m) this.C.remove(str));
        }
        return b10;
    }

    public final boolean k(String str) {
        boolean b10;
        synchronized (this.H) {
            o.f().b(I, "Processor stopping background work " + str, new Throwable[0]);
            b10 = b(str, (m) this.D.remove(str));
        }
        return b10;
    }
}
