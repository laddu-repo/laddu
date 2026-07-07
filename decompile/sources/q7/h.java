package q7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import c2.w1;
import com.google.android.gms.internal.measurement.ld;
import com.google.android.gms.internal.measurement.md;
import com.google.android.gms.internal.measurement.nb;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.td;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import k8.k2;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements v6.g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static h f10915x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f10916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Object f10917w;

    public /* synthetic */ h(Object obj) {
        this.f10916v = obj;
    }

    public static h b(Context context) {
        y.g(context);
        synchronized (h.class) {
            try {
                if (f10915x == null) {
                    q.a(context);
                    h hVar = new h();
                    hVar.f10916v = context.getApplicationContext();
                    f10915x = hVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10915x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.h.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static m f(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < mVarArr.length; i++) {
                if (mVarArr[i].equals(nVar)) {
                    return mVarArr[i];
                }
            }
        }
        return null;
    }

    public e6.a a() {
        if (((e6.a) this.f10917w) == null) {
            synchronized (this) {
                try {
                    if (((e6.a) this.f10917w) == null) {
                        File cacheDir = ((e6.d) ((a9.g) this.f10916v).f273w).f4851v.getCacheDir();
                        e6.c cVar = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            cVar = new e6.c();
                            cVar.f4849y = new k2(12);
                            cVar.f4848x = file;
                            cVar.f4846v = 262144000L;
                            cVar.f4847w = new sc.b(14);
                        }
                        this.f10917w = cVar;
                    }
                    if (((e6.a) this.f10917w) == null) {
                        this.f10917w = new o9.f(11);
                    }
                } finally {
                }
            }
        }
        return (e6.a) this.f10917w;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(int r18) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.h.c(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.measurement.sd] */
    public td d(final nb nbVar) {
        md mdVar;
        final ld ldVar = (ld) this.f10917w;
        ld ldVar2 = td.f3108j;
        if (ldVar != ldVar2) {
            p6 p6Var = td.i;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) p6Var.f2983w;
            if (Build.VERSION.SDK_INT >= 24) {
                final w1 w1Var = new w1();
                w1Var.f1989w = false;
                Context context = nbVar.f2924b;
                String str = ldVar.f2861d;
                if (str == null) {
                    str = (String) ldVar.f2858a.apply(context);
                    ldVar.f2861d = str;
                }
                mdVar = (md) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: com.google.android.gms.internal.measurement.sd
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        md mdVar2 = new md(new td(nbVar, ldVar));
                        w1Var.f1989w = true;
                        return mdVar2;
                    }
                });
                if (w1Var.f1989w) {
                    p6Var.d(nbVar);
                }
            } else {
                td tdVar = new td(nbVar, ldVar);
                mdVar = new md(tdVar);
                md mdVar2 = (md) concurrentHashMap.putIfAbsent(tdVar.f3111c, mdVar);
                if (mdVar2 == null) {
                    p6Var.d(nbVar);
                } else {
                    mdVar = mdVar2;
                }
            }
            this.f10916v = mdVar.f2898a;
            this.f10917w = ldVar2;
        }
        return (td) this.f10916v;
    }

    @Override // v6.g
    public Object get() {
        if (this.f10917w == null) {
            synchronized (this) {
                try {
                    if (this.f10917w == null) {
                        Object obj = ((v6.g) this.f10916v).get();
                        v6.f.c(obj, "Argument must not be null");
                        this.f10917w = obj;
                    }
                } finally {
                }
            }
        }
        return this.f10917w;
    }
}
