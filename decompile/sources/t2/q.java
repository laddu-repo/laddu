package t2;

import a2.w0;
import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.playfy.tv.activities.PlayerActivity;
import db.a1;
import db.c1;
import db.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import q2.k1;
import r1.e1;
import r1.f1;
import r1.h1;
import r1.j1;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends v {

    /* renamed from: k, reason: collision with root package name */
    public static final a1 f12544k = new db.w(new d2.a(9));

    /* renamed from: c, reason: collision with root package name */
    public final Object f12545c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f12546d;

    /* renamed from: e, reason: collision with root package name */
    public final ob.a f12547e;

    /* renamed from: f, reason: collision with root package name */
    public k f12548f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f12549g;

    /* renamed from: h, reason: collision with root package name */
    public a2.c f12550h;

    /* renamed from: i, reason: collision with root package name */
    public r1.d f12551i;
    public Boolean j;

    /* JADX WARN: Type inference failed for: r0v0, types: [ob.a, java.lang.Object] */
    public q(PlayerActivity playerActivity) {
        ?? obj = new Object();
        k kVar = k.f12529x0;
        this.f12545c = new Object();
        this.f12546d = playerActivity.getApplicationContext();
        this.f12547e = obj;
        if (kVar != null) {
            this.f12548f = kVar;
        } else {
            kVar.getClass();
            j jVar = new j(kVar);
            jVar.e(kVar);
            this.f12548f = new k(jVar);
        }
        this.f12551i = r1.d.f11342h;
        boolean z10 = this.f12548f.f12535s0;
    }

    public static void c(k1 k1Var, k kVar, HashMap hashMap) {
        for (int i6 = 0; i6 < k1Var.f10909a; i6++) {
            f1 f1Var = (f1) kVar.D.get(k1Var.a(i6));
            if (f1Var != null) {
                e1 e1Var = f1Var.f11397a;
                f1 f1Var2 = (f1) hashMap.get(Integer.valueOf(e1Var.f11388c));
                if (f1Var2 == null || (f1Var2.f11398b.isEmpty() && !f1Var.f11398b.isEmpty())) {
                    hashMap.put(Integer.valueOf(e1Var.f11388c), f1Var);
                }
            }
        }
    }

    public static int d(r1.q qVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(qVar.f11661d)) {
            return 4;
        }
        String g10 = g(str);
        String g11 = g(qVar.f11661d);
        if (g11 != null && g10 != null) {
            if (!g11.startsWith(g10) && !g10.startsWith(g11)) {
                String str2 = a0.f12750a;
                if (!g11.split("-", 2)[0].equals(g10.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z10 || g11 != null) {
            return 0;
        }
        return 1;
    }

    public static String g(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static boolean i(k kVar, int i6, r1.q qVar) {
        boolean z10;
        boolean z11;
        if ((i6 & 3584) == 0) {
            return false;
        }
        h1 h1Var = kVar.f11557u;
        if (h1Var.f11493c && (i6 & 2048) == 0) {
            return false;
        }
        if (h1Var.f11492b) {
            if (qVar.I == 0 && qVar.J == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((i6 & 1024) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static Pair j(int i6, u uVar, int[][][] iArr, n nVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccess;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i11 = uVar2.f12554a;
        int i12 = 0;
        while (i12 < i11) {
            if (i6 == uVar2.f12555b[i12]) {
                k1 k1Var = uVar2.f12556c[i12];
                for (int i13 = 0; i13 < k1Var.f10909a; i13++) {
                    e1 a10 = k1Var.a(i13);
                    c1 d10 = nVar.d(i12, a10, iArr[i12][i13]);
                    int i14 = a10.f11386a;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        o oVar = (o) d10.get(i15);
                        int a11 = oVar.a();
                        if (zArr[i15] || a11 == 0) {
                            i10 = i11;
                        } else {
                            if (a11 == 1) {
                                randomAccess = k0.o(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    o oVar2 = (o) d10.get(i16);
                                    int i17 = i11;
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i11 = i17;
                                }
                                randomAccess = arrayList2;
                            }
                            i10 = i11;
                            arrayList.add(randomAccess);
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
            iArr2[i18] = ((o) list.get(i18)).f12543z;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(0, oVar3.f12542y, iArr2), Integer.valueOf(oVar3.f12541x));
    }

    @Override // t2.v
    public final void a() {
        a2.c cVar;
        l lVar;
        boolean z10;
        synchronized (this.f12545c) {
            try {
                Thread thread = this.f12549g;
                if (thread != null) {
                    if (thread == Thread.currentThread()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.f("DefaultTrackSelector is accessed on the wrong thread.", z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (cVar = this.f12550h) != null) {
            Handler handler = (Handler) cVar.f172z;
            Spatializer spatializer = (Spatializer) cVar.f171y;
            if (spatializer != null && (lVar = (l) cVar.A) != null && handler != null) {
                r1.c.h(spatializer, lVar);
                handler.removeCallbacksAndMessages(null);
            }
            this.f12550h = null;
        }
        this.f12560a = null;
        this.f12561b = null;
    }

    @Override // t2.v
    public final void b(j1 j1Var) {
        if (j1Var instanceof k) {
            k((k) j1Var);
        }
        j jVar = new j(e());
        jVar.e(j1Var);
        k(new k(jVar));
    }

    public final k e() {
        k kVar;
        synchronized (this.f12545c) {
            kVar = this.f12548f;
        }
        return kVar;
    }

    public final void f() {
        boolean z10;
        w0 w0Var;
        a2.c cVar;
        synchronized (this.f12545c) {
            try {
                if (this.f12548f.f12535s0 && Build.VERSION.SDK_INT >= 32 && (cVar = this.f12550h) != null && cVar.f170x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10 && (w0Var = this.f12560a) != null) {
            w0Var.E.e(10);
        }
    }

    public final void h() {
        synchronized (this.f12545c) {
            this.f12548f.getClass();
        }
    }

    public final void k(k kVar) {
        boolean equals;
        synchronized (this.f12545c) {
            equals = this.f12548f.equals(kVar);
            this.f12548f = kVar;
        }
        if (!equals) {
            if (kVar.f12535s0 && this.f12546d == null) {
                u1.a.p("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            w0 w0Var = this.f12560a;
            if (w0Var != null) {
                w0Var.E.e(10);
            }
        }
    }
}
