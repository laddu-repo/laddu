package da;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends ea.a implements ListenableFuture {
    public static final boolean A;
    public static final qf.g B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f4448y = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u0 f4449z = new u0(k.class);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile Object f4450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile h f4451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile s f4452x;

    static {
        boolean z2;
        qf.g mVar;
        Throwable th;
        qf.g rVar;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        A = z2;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e7 = null;
        if (property == null || property.contains("Android")) {
            try {
                rVar = new r();
            } catch (Error | Exception e10) {
                try {
                    mVar = new l();
                } catch (Error | Exception e11) {
                    e7 = e11;
                    mVar = new m();
                }
                qf.g gVar = mVar;
                th = e10;
                rVar = gVar;
            }
        } else {
            try {
                rVar = new l();
            } catch (NoClassDefFoundError unused2) {
                rVar = new m();
            }
        }
        th = null;
        B = rVar;
        if (e7 != null) {
            u0 u0Var = f4449z;
            Logger loggerA = u0Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            u0Var.a().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e7);
        }
    }

    public final void b(s sVar) {
        sVar.f4445a = null;
        while (true) {
            s sVar2 = this.f4452x;
            if (sVar2 == s.f4444c) {
                return;
            }
            s sVar3 = null;
            while (sVar2 != null) {
                s sVar4 = sVar2.f4446b;
                if (sVar2.f4445a != null) {
                    sVar3 = sVar2;
                } else if (sVar3 != null) {
                    sVar3.f4446b = sVar4;
                    if (sVar3.f4445a == null) {
                        break;
                    }
                } else if (!B.h(this, sVar2, sVar4)) {
                    break;
                }
                sVar2 = sVar4;
            }
            return;
        }
    }
}
