package r2;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import c2.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import k8.z;
import o2.j1;
import t1.t0;
import t1.u0;
import t1.x0;
import w1.b0;
import y9.f0;
import y9.y0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q extends v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y0 f11112k = new y9.u(new c4.d(9));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f11114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f11115e;
    public j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f11116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c2.b f11117h;
    public t1.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f11118j;

    public q(Context context, z zVar) {
        j jVar = j.F;
        this.f11113c = new Object();
        this.f11114d = context != null ? context.getApplicationContext() : null;
        this.f11115e = zVar;
        if (jVar != null) {
            this.f = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.c(jVar);
            this.f = new j(iVar);
        }
        this.i = t1.c.f11948b;
        if (this.f.A && context == null) {
            w1.a.C("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(j1 j1Var, j jVar, HashMap map) {
        for (int i = 0; i < j1Var.f9468a; i++) {
            u0 u0Var = (u0) jVar.f12171t.get(j1Var.a(i));
            if (u0Var != null) {
                t0 t0Var = u0Var.f12121a;
                u0 u0Var2 = (u0) map.get(Integer.valueOf(t0Var.f12113c));
                if (u0Var2 == null || (u0Var2.f12122b.isEmpty() && !u0Var.f12122b.isEmpty())) {
                    map.put(Integer.valueOf(t0Var.f12113c), u0Var);
                }
            }
        }
    }

    public static int d(t1.o oVar, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(oVar.f12053d)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(oVar.f12053d);
        if (strG2 == null || strG == null) {
            return (z2 && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        int i = b0.f13686a;
        return strG2.split("-", 2)[0].equals(strG.split("-", 2)[0]) ? 2 : 0;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair i(int i, u uVar, int[][][] iArr, n nVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccessQ;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i11 = uVar2.f11121a;
        int i12 = 0;
        while (i12 < i11) {
            if (i == uVar2.f11122b[i12]) {
                j1 j1Var = uVar2.f11123c[i12];
                for (int i13 = 0; i13 < j1Var.f9468a; i13++) {
                    t0 t0VarA = j1Var.a(i13);
                    z0 z0VarA = nVar.a(i12, t0VarA, iArr[i12][i13]);
                    int i14 = t0VarA.f12111a;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        o oVar = (o) z0VarA.get(i15);
                        int iA = oVar.a();
                        if (zArr[i15] || iA == 0) {
                            i10 = i11;
                        } else {
                            if (iA == 1) {
                                randomAccessQ = f0.q(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    o oVar2 = (o) z0VarA.get(i16);
                                    int i17 = i11;
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i11 = i17;
                                }
                                randomAccessQ = arrayList2;
                            }
                            i10 = i11;
                            arrayList.add(randomAccessQ);
                        }
                        i15++;
                        i11 = i10;
                    }
                }
            }
            i12++;
            uVar2 = uVar;
            i11 = i11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((o) list.get(i18)).f11109x;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(0, oVar3.f11108w, iArr2), Integer.valueOf(oVar3.f11107v));
    }

    @Override // r2.v
    public final void a() {
        c2.b bVar;
        l lVar;
        synchronized (this.f11113c) {
            try {
                Thread thread = this.f11116g;
                if (thread != null) {
                    w1.a.i("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (bVar = this.f11117h) != null) {
            Handler handler = (Handler) bVar.f1687x;
            Spatializer spatializer = (Spatializer) bVar.f1686w;
            if (spatializer != null && (lVar = (l) bVar.f1688y) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(lVar);
                handler.removeCallbacksAndMessages(null);
            }
            this.f11117h = null;
        }
        this.f11126a = null;
        this.f11127b = null;
    }

    @Override // r2.v
    public final void b(x0 x0Var) {
        if (x0Var instanceof j) {
            j((j) x0Var);
        }
        i iVar = new i(e());
        iVar.c(x0Var);
        j(new j(iVar));
    }

    public final j e() {
        j jVar;
        synchronized (this.f11113c) {
            jVar = this.f;
        }
        return jVar;
    }

    public final void f() {
        boolean z2;
        r0 r0Var;
        c2.b bVar;
        synchronized (this.f11113c) {
            try {
                z2 = this.f.A && Build.VERSION.SDK_INT >= 32 && (bVar = this.f11117h) != null && bVar.f1685v;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2 || (r0Var = this.f11126a) == null) {
            return;
        }
        r0Var.C.e(10);
    }

    public final void h() {
        synchronized (this.f11113c) {
            this.f.getClass();
        }
    }

    public final void j(j jVar) {
        boolean zEquals;
        jVar.getClass();
        synchronized (this.f11113c) {
            zEquals = this.f.equals(jVar);
            this.f = jVar;
        }
        if (zEquals) {
            return;
        }
        if (jVar.A && this.f11114d == null) {
            w1.a.C("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        r0 r0Var = this.f11126a;
        if (r0Var != null) {
            r0Var.C.e(10);
        }
    }
}
