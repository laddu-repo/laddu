package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class qe {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f3024j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f3025k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9.m f3027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9.m f3028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x9.m f3029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x9.m f3030e;
    public final x9.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f3031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile tc f3032h;
    public final Uri i;

    public qe(Context context, x9.m mVar, x9.m mVar2, x9.m mVar3) {
        this.f3026a = context;
        this.f3028c = mVar;
        this.f3027b = mVar3;
        this.f3029d = mVar2;
        Pattern pattern = cf.f2544a;
        mb mbVar = new mb(context);
        mbVar.x("phenotype_storage_info");
        mbVar.y("storage-info.pb");
        this.f3031g = mbVar.z();
        mb mbVar2 = new mb(context);
        mbVar2.x("phenotype_storage_info");
        mbVar2.y("device-encrypted-storage-info.pb");
        UserManager userManager = db.f2568a;
        int i = 1;
        if (Build.VERSION.SDK_INT >= 24) {
            Set set = cf.f2547d;
            h.c(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
            mbVar2.f2889c = "directboot-files";
        }
        this.i = mbVar2.z();
        this.f3030e = u1.c.z(new pb(i, this));
        this.f = u1.c.z(new sb(mVar, i));
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (db.c(this.f3026a)) {
            }
            da.r0 r0Var = da.r0.f4441w;
        }
        UserManager userManager = db.f2568a;
        if (TimeUnit.HOURS.toMillis(24L) + c().y() < System.currentTimeMillis()) {
            da.v0 v0Var = (da.v0) this.f3028c.get();
            v0Var.getClass();
            ListenableFuture listenableFutureE = da.o0.e((ListenableFuture) this.f.get());
            int i = da.k0.C;
            da.o0.f(listenableFutureE instanceof da.k0 ? (da.k0) listenableFutureE : new da.l0(listenableFutureE), new od(2, this), v0Var);
            return;
        }
        da.r0 r0Var2 = da.r0.f4441w;
    }

    public final ie b() {
        tc tcVarC = c();
        return new ie(tcVarC.w(), y9.f0.m(tcVarC.B()), tcVarC.v(), tcVarC.x(), (tcVarC.C() && tcVarC.D().v() == ((long) Build.VERSION.SDK_INT)) ? tcVarC.D().u() : "", y9.f0.m(tcVarC.z()), y9.f0.m(tcVarC.A()), tcVarC.u(), tcVarC.F(), tcVarC.E(), tcVarC.G());
    }

    public final tc c() {
        tc tcVarI;
        InputStream inputStreamH;
        tc tcVar = this.f3032h;
        if (tcVar != null) {
            return tcVar;
        }
        synchronized (f3024j) {
            tcVarI = this.f3032h;
            if (tcVarI == null) {
                tcVarI = tc.I();
                if (db.a(this.f3026a)) {
                    h2 h2Var = (h2) tcVarI.t(7);
                    a1 a1Var = a1.f2467a;
                    int i = o0.f2941a;
                    a1 a1Var2 = a1.f2468b;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        inputStreamH = e1.h(((ye) this.f3029d.get()).b(this.f3031g));
                    } catch (IOException unused) {
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    try {
                        i1 i1VarA = ((h1) h2Var).a(inputStreamH, a1Var2);
                        if (inputStreamH != null) {
                            inputStreamH.close();
                        }
                        tcVarI = (tc) i1VarA;
                        this.f3032h = tcVarI;
                    } catch (Throwable th) {
                        if (inputStreamH != null) {
                            try {
                                inputStreamH.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
        }
        return tcVarI;
    }
}
