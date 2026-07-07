package androidx.fragment.app;

import android.content.ContentProviderClient;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public e.g A;
    public e.g B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public t0 L;
    public final m M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1069b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f1071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f1072e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.a0 f1073g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sc.b f1077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g0 f1079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g0 f1080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f1081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f1082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0 f1083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c0 f1085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z7.b f1086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y f1087v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y f1088w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k0 f1089x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o9.f f1090y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e.g f1091z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1068a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sb.p f1070c = new sb.p(3);
    public final f0 f = new f0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f1074h = new i0(this);
    public final AtomicInteger i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f1075j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f1076k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.g0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.g0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.g0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.g0] */
    public q0() {
        Collections.synchronizedMap(new HashMap());
        this.f1077l = new sc.b(this);
        this.f1078m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f1079n = new s0.a(this) { // from class: androidx.fragment.app.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f1022b;

            {
                this.f1022b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        q0 q0Var = this.f1022b;
                        if (q0Var.K()) {
                            q0Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        q0 q0Var2 = this.f1022b;
                        if (q0Var2.K() && num.intValue() == 80) {
                            q0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        h0.f fVar = (h0.f) obj;
                        q0 q0Var3 = this.f1022b;
                        if (q0Var3.K()) {
                            boolean z2 = fVar.f6013a;
                            q0Var3.m(false);
                        }
                        break;
                    default:
                        h0.s sVar = (h0.s) obj;
                        q0 q0Var4 = this.f1022b;
                        if (q0Var4.K()) {
                            boolean z10 = sVar.f6043a;
                            q0Var4.r(false);
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f1080o = new s0.a(this) { // from class: androidx.fragment.app.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f1022b;

            {
                this.f1022b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        q0 q0Var = this.f1022b;
                        if (q0Var.K()) {
                            q0Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        q0 q0Var2 = this.f1022b;
                        if (q0Var2.K() && num.intValue() == 80) {
                            q0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        h0.f fVar = (h0.f) obj;
                        q0 q0Var3 = this.f1022b;
                        if (q0Var3.K()) {
                            boolean z2 = fVar.f6013a;
                            q0Var3.m(false);
                        }
                        break;
                    default:
                        h0.s sVar = (h0.s) obj;
                        q0 q0Var4 = this.f1022b;
                        if (q0Var4.K()) {
                            boolean z10 = sVar.f6043a;
                            q0Var4.r(false);
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f1081p = new s0.a(this) { // from class: androidx.fragment.app.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f1022b;

            {
                this.f1022b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        q0 q0Var = this.f1022b;
                        if (q0Var.K()) {
                            q0Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        q0 q0Var2 = this.f1022b;
                        if (q0Var2.K() && num.intValue() == 80) {
                            q0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        h0.f fVar = (h0.f) obj;
                        q0 q0Var3 = this.f1022b;
                        if (q0Var3.K()) {
                            boolean z2 = fVar.f6013a;
                            q0Var3.m(false);
                        }
                        break;
                    default:
                        h0.s sVar = (h0.s) obj;
                        q0 q0Var4 = this.f1022b;
                        if (q0Var4.K()) {
                            boolean z10 = sVar.f6043a;
                            q0Var4.r(false);
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f1082q = new s0.a(this) { // from class: androidx.fragment.app.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f1022b;

            {
                this.f1022b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i12) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        q0 q0Var = this.f1022b;
                        if (q0Var.K()) {
                            q0Var.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        q0 q0Var2 = this.f1022b;
                        if (q0Var2.K() && num.intValue() == 80) {
                            q0Var2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        h0.f fVar = (h0.f) obj;
                        q0 q0Var3 = this.f1022b;
                        if (q0Var3.K()) {
                            boolean z2 = fVar.f6013a;
                            q0Var3.m(false);
                        }
                        break;
                    default:
                        h0.s sVar = (h0.s) obj;
                        q0 q0Var4 = this.f1022b;
                        if (q0Var4.K()) {
                            boolean z10 = sVar.f6043a;
                            q0Var4.r(false);
                        }
                        break;
                }
            }
        };
        this.f1083r = new j0(this);
        this.f1084s = -1;
        this.f1089x = new k0(this);
        this.f1090y = new o9.f(i12);
        this.C = new ArrayDeque();
        this.M = new m(2, this);
    }

    public static boolean I(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean J(y yVar) {
        yVar.getClass();
        ArrayList arrayListQ = yVar.P.f1070c.q();
        int size = arrayListQ.size();
        boolean zJ = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            y yVar2 = (y) obj;
            if (yVar2 != null) {
                zJ = J(yVar2);
            }
            if (zJ) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(y yVar) {
        if (yVar == null) {
            return true;
        }
        if (yVar.Y) {
            return yVar.N == null || L(yVar.Q);
        }
        return false;
    }

    public static boolean M(y yVar) {
        if (yVar == null) {
            return true;
        }
        q0 q0Var = yVar.N;
        return yVar.equals(q0Var.f1088w) && M(q0Var.f1087v);
    }

    public static void c0(y yVar) {
        if (I(2)) {
            Log.v("FragmentManager", "show: " + yVar);
        }
        if (yVar.U) {
            yVar.U = false;
            yVar.f1139f0 = !yVar.f1139f0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x022b A[PHI: r14
  0x022b: PHI (r14v24 int) = (r14v23 int), (r14v25 int) binds: [B:103:0x021b, B:108:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q0.A(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final y B(int i) {
        sb.p pVar = this.f1070c;
        ArrayList arrayList = (ArrayList) pVar.f11742w;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y yVar = (y) arrayList.get(size);
            if (yVar != null && yVar.R == i) {
                return yVar;
            }
        }
        for (x0 x0Var : ((HashMap) pVar.f11743x).values()) {
            if (x0Var != null) {
                y yVar2 = x0Var.f1130c;
                if (yVar2.R == i) {
                    return yVar2;
                }
            }
        }
        return null;
    }

    public final y C(String str) {
        sb.p pVar = this.f1070c;
        ArrayList arrayList = (ArrayList) pVar.f11742w;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                y yVar = (y) arrayList.get(size);
                if (yVar != null && str.equals(yVar.T)) {
                    return yVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (x0 x0Var : ((HashMap) pVar.f11743x).values()) {
            if (x0Var != null) {
                y yVar2 = x0Var.f1130c;
                if (str.equals(yVar2.T)) {
                    return yVar2;
                }
            }
        }
        return null;
    }

    public final void D() {
        for (l lVar : e()) {
            if (lVar.f1048e) {
                if (I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                lVar.f1048e = false;
                lVar.c();
            }
        }
    }

    public final ViewGroup E(y yVar) {
        ViewGroup viewGroup = yVar.f1134a0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (yVar.S <= 0 || !this.f1086u.I()) {
            return null;
        }
        View viewH = this.f1086u.H(yVar.S);
        if (viewH instanceof ViewGroup) {
            return (ViewGroup) viewH;
        }
        return null;
    }

    public final k0 F() {
        y yVar = this.f1087v;
        return yVar != null ? yVar.N.F() : this.f1089x;
    }

    public final o9.f G() {
        y yVar = this.f1087v;
        return yVar != null ? yVar.N.G() : this.f1090y;
    }

    public final void H(y yVar) {
        if (I(2)) {
            Log.v("FragmentManager", "hide: " + yVar);
        }
        if (yVar.U) {
            return;
        }
        yVar.U = true;
        yVar.f1139f0 = true ^ yVar.f1139f0;
        b0(yVar);
    }

    public final boolean K() {
        y yVar = this.f1087v;
        if (yVar == null) {
            return true;
        }
        return yVar.p() && this.f1087v.l().K();
    }

    public final boolean N() {
        return this.E || this.F;
    }

    public final void O(int i, boolean z2) {
        c0 c0Var;
        if (this.f1085t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1084s) {
            this.f1084s = i;
            sb.p pVar = this.f1070c;
            HashMap map = (HashMap) pVar.f11743x;
            ArrayList arrayList = (ArrayList) pVar.f11742w;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x0 x0Var = (x0) map.get(((y) obj).A);
                if (x0Var != null) {
                    x0Var.k();
                }
            }
            for (x0 x0Var2 : map.values()) {
                if (x0Var2 != null) {
                    x0Var2.k();
                    y yVar = x0Var2.f1130c;
                    if (yVar.H && !yVar.r()) {
                        pVar.y(x0Var2);
                    }
                }
            }
            d0();
            if (this.D && (c0Var = this.f1085t) != null && this.f1084s == 7) {
                c0Var.B.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void P() {
        if (this.f1085t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.i = false;
        for (y yVar : this.f1070c.r()) {
            if (yVar != null) {
                yVar.P.P();
            }
        }
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int i, int i10) {
        y(false);
        x(true);
        y yVar = this.f1088w;
        if (yVar != null && i < 0 && yVar.i().Q()) {
            return true;
        }
        boolean zS = S(this.I, this.J, i, i10);
        if (zS) {
            this.f1069b = true;
            try {
                U(this.I, this.J);
            } finally {
                d();
            }
        }
        f0();
        u();
        ((HashMap) this.f1070c.f11743x).values().removeAll(Collections.singleton(null));
        return zS;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, int i, int i10) {
        boolean z2 = (i10 & 1) != 0;
        ArrayList arrayList3 = this.f1071d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z2 ? 0 : this.f1071d.size() - 1;
            } else {
                int size2 = this.f1071d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f1071d.get(size2);
                    if (i >= 0 && i == aVar.f970r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z2) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.f1071d.get(size - 1);
                        if (i < 0 || i != aVar2.f970r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f1071d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f1071d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f1071d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(y yVar) {
        if (I(2)) {
            Log.v("FragmentManager", "remove: " + yVar + " nesting=" + yVar.M);
        }
        boolean zR = yVar.r();
        if (yVar.V && zR) {
            return;
        }
        sb.p pVar = this.f1070c;
        synchronized (((ArrayList) pVar.f11742w)) {
            ((ArrayList) pVar.f11742w).remove(yVar);
        }
        yVar.G = false;
        if (J(yVar)) {
            this.D = true;
        }
        yVar.H = true;
        b0(yVar);
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i < size) {
            if (!((a) arrayList.get(i)).f967o) {
                if (i10 != i) {
                    A(arrayList, arrayList2, i10, i);
                }
                i10 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).f967o) {
                        i10++;
                    }
                }
                A(arrayList, arrayList2, i, i10);
                i = i10 - 1;
            }
            i++;
        }
        if (i10 != size) {
            A(arrayList, arrayList2, i10, size);
        }
    }

    public final void V(Bundle bundle) {
        sc.b bVar;
        int i;
        int i10;
        Bundle bundle2;
        x0 x0Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f1085t.f988y.getClassLoader());
                this.f1076k.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f1085t.f988y.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        sb.p pVar = this.f1070c;
        HashMap map2 = (HashMap) pVar.f11744y;
        HashMap map3 = (HashMap) pVar.f11743x;
        map2.clear();
        map2.putAll(map);
        r0 r0Var = (r0) bundle.getParcelable("state");
        if (r0Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = r0Var.f1093v;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            bVar = this.f1077l;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            Bundle bundleH = pVar.H((String) obj, null);
            if (bundleH != null) {
                y yVar = (y) this.L.f1102d.get(((v0) bundleH.getParcelable("state")).f1113w);
                if (yVar != null) {
                    if (I(2)) {
                        i10 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + yVar);
                    } else {
                        i10 = 2;
                    }
                    x0Var = new x0(bVar, pVar, yVar, bundleH);
                    bundle2 = bundleH;
                } else {
                    i10 = 2;
                    bundle2 = bundleH;
                    x0Var = new x0(this.f1077l, this.f1070c, this.f1085t.f988y.getClassLoader(), F(), bundleH);
                }
                y yVar2 = x0Var.f1130c;
                yVar2.f1152w = bundle2;
                yVar2.N = this;
                if (I(i10)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + yVar2.A + "): " + yVar2);
                }
                x0Var.m(this.f1085t.f988y.getClassLoader());
                pVar.w(x0Var);
                x0Var.f1132e = this.f1084s;
            }
        }
        t0 t0Var = this.L;
        t0Var.getClass();
        ArrayList arrayList2 = new ArrayList(t0Var.f1102d.values());
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            y yVar3 = (y) obj2;
            if (map3.get(yVar3.A) == null) {
                if (I(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + yVar3 + " that was not found in the set of active Fragments " + r0Var.f1093v);
                }
                this.L.f(yVar3);
                yVar3.N = this;
                x0 x0Var2 = new x0(bVar, pVar, yVar3);
                x0Var2.f1132e = 1;
                x0Var2.k();
                yVar3.H = true;
                x0Var2.k();
            }
        }
        ArrayList arrayList3 = r0Var.f1094w;
        ((ArrayList) pVar.f11742w).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                String str3 = (String) obj3;
                y yVarK = pVar.k(str3);
                if (yVarK == null) {
                    throw new IllegalStateException(d0.d.l("No instantiated fragment for (", str3, ")"));
                }
                if (I(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + yVarK);
                }
                pVar.a(yVarK);
            }
        }
        if (r0Var.f1095x != null) {
            this.f1071d = new ArrayList(r0Var.f1095x.length);
            int i14 = 0;
            while (true) {
                b[] bVarArr = r0Var.f1095x;
                if (i14 >= bVarArr.length) {
                    break;
                }
                b bVar2 = bVarArr[i14];
                ArrayList arrayList4 = bVar2.f976w;
                a aVar = new a(this);
                int[] iArr = bVar2.f975v;
                int i15 = 0;
                int i16 = 0;
                while (i15 < iArr.length) {
                    y0 y0Var = new y0();
                    int i17 = i15 + 1;
                    y0Var.f1156a = iArr[i15];
                    if (I(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i16 + " base fragment #" + iArr[i17]);
                    }
                    y0Var.f1162h = androidx.lifecycle.n.values()[bVar2.f977x[i16]];
                    y0Var.i = androidx.lifecycle.n.values()[bVar2.f978y[i16]];
                    int i18 = i15 + 2;
                    y0Var.f1158c = iArr[i17] != 0;
                    int i19 = iArr[i18];
                    y0Var.f1159d = i19;
                    int i20 = iArr[i15 + 3];
                    y0Var.f1160e = i20;
                    int i21 = i15 + 5;
                    int i22 = iArr[i15 + 4];
                    y0Var.f = i22;
                    i15 += 6;
                    int[] iArr2 = iArr;
                    int i23 = iArr2[i21];
                    y0Var.f1161g = i23;
                    aVar.f956b = i19;
                    aVar.f957c = i20;
                    aVar.f958d = i22;
                    aVar.f959e = i23;
                    aVar.b(y0Var);
                    i16++;
                    iArr = iArr2;
                }
                aVar.f = bVar2.f979z;
                aVar.f961h = bVar2.A;
                aVar.f960g = true;
                aVar.i = bVar2.C;
                aVar.f962j = bVar2.D;
                aVar.f963k = bVar2.E;
                aVar.f964l = bVar2.F;
                aVar.f965m = bVar2.G;
                aVar.f966n = bVar2.H;
                aVar.f967o = bVar2.I;
                aVar.f970r = bVar2.B;
                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                    String str4 = (String) arrayList4.get(i24);
                    if (str4 != null) {
                        ((y0) aVar.f955a.get(i24)).f1157b = pVar.k(str4);
                    }
                }
                aVar.c(1);
                if (I(2)) {
                    StringBuilder sbO = d0.d.o(i14, "restoreAllState: back stack #", " (index ");
                    sbO.append(aVar.f970r);
                    sbO.append("): ");
                    sbO.append(aVar);
                    Log.v("FragmentManager", sbO.toString());
                    PrintWriter printWriter = new PrintWriter(new a1());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1071d.add(aVar);
                i14++;
            }
            i = 0;
        } else {
            i = 0;
            this.f1071d = null;
        }
        this.i.set(r0Var.f1096y);
        String str5 = r0Var.f1097z;
        if (str5 != null) {
            y yVarK2 = pVar.k(str5);
            this.f1088w = yVarK2;
            q(yVarK2);
        }
        ArrayList arrayList5 = r0Var.A;
        if (arrayList5 != null) {
            for (int i25 = i; i25 < arrayList5.size(); i25++) {
                this.f1075j.put((String) arrayList5.get(i25), (c) r0Var.B.get(i25));
            }
        }
        this.C = new ArrayDeque(r0Var.C);
    }

    public final Bundle W() {
        int i;
        ArrayList arrayList;
        b[] bVarArr;
        int size;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((l) it.next()).e();
        }
        y(true);
        this.E = true;
        this.L.i = true;
        sb.p pVar = this.f1070c;
        pVar.getClass();
        HashMap map = (HashMap) pVar.f11743x;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it2 = map.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            x0 x0Var = (x0) it2.next();
            if (x0Var != null) {
                y yVar = x0Var.f1130c;
                String str = yVar.A;
                Bundle bundle3 = new Bundle();
                y yVar2 = x0Var.f1130c;
                if (yVar2.f1151v == -1 && (bundle = yVar2.f1152w) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new v0(yVar2));
                if (yVar2.f1151v > -1) {
                    Bundle bundle4 = new Bundle();
                    yVar2.B(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    x0Var.f1128a.Q(false);
                    Bundle bundle5 = new Bundle();
                    yVar2.o0.g(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleW = yVar2.P.W();
                    if (!bundleW.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleW);
                    }
                    if (yVar2.f1135b0 != null) {
                        x0Var.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = yVar2.f1153x;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = yVar2.f1154y;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = yVar2.B;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                pVar.H(str, bundle3);
                arrayList2.add(yVar.A);
                if (I(2)) {
                    Log.v("FragmentManager", "Saved state of " + yVar + ": " + yVar.f1152w);
                }
            }
        }
        HashMap map2 = (HashMap) this.f1070c.f11744y;
        if (!map2.isEmpty()) {
            sb.p pVar2 = this.f1070c;
            synchronized (((ArrayList) pVar2.f11742w)) {
                try {
                    if (((ArrayList) pVar2.f11742w).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) pVar2.f11742w).size());
                        ArrayList arrayList3 = (ArrayList) pVar2.f11742w;
                        int size2 = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            y yVar3 = (y) obj;
                            arrayList.add(yVar3.A);
                            if (I(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + yVar3.A + "): " + yVar3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.f1071d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new b[size];
                for (i = 0; i < size; i++) {
                    bVarArr[i] = new b((a) this.f1071d.get(i));
                    if (I(2)) {
                        StringBuilder sbO = d0.d.o(i, "saveAllState: adding back stack #", ": ");
                        sbO.append(this.f1071d.get(i));
                        Log.v("FragmentManager", sbO.toString());
                    }
                }
            }
            r0 r0Var = new r0();
            r0Var.f1097z = null;
            ArrayList arrayList5 = new ArrayList();
            r0Var.A = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            r0Var.B = arrayList6;
            r0Var.f1093v = arrayList2;
            r0Var.f1094w = arrayList;
            r0Var.f1095x = bVarArr;
            r0Var.f1096y = this.i.get();
            y yVar4 = this.f1088w;
            if (yVar4 != null) {
                r0Var.f1097z = yVar4.A;
            }
            arrayList5.addAll(this.f1075j.keySet());
            arrayList6.addAll(this.f1075j.values());
            r0Var.C = new ArrayList(this.C);
            bundle2.putParcelable("state", r0Var);
            for (String str2 : this.f1076k.keySet()) {
                bundle2.putBundle(d0.d.k("result_", str2), (Bundle) this.f1076k.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(d0.d.k("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (I(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void X() {
        synchronized (this.f1068a) {
            try {
                if (this.f1068a.size() == 1) {
                    this.f1085t.f989z.removeCallbacks(this.M);
                    this.f1085t.f989z.post(this.M);
                    f0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y(y yVar, boolean z2) {
        ViewGroup viewGroupE = E(yVar);
        if (viewGroupE == null || !(viewGroupE instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupE).setDrawDisappearingViewsLast(!z2);
    }

    public final void Z(y yVar, androidx.lifecycle.n nVar) {
        if (yVar.equals(this.f1070c.k(yVar.A)) && (yVar.O == null || yVar.N == this)) {
            yVar.f1143j0 = nVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + yVar + " is not an active fragment of FragmentManager " + this);
    }

    public final x0 a(y yVar) {
        String str = yVar.f1142i0;
        if (str != null) {
            n1.c.c(yVar, str);
        }
        if (I(2)) {
            Log.v("FragmentManager", "add: " + yVar);
        }
        x0 x0VarF = f(yVar);
        yVar.N = this;
        sb.p pVar = this.f1070c;
        pVar.w(x0VarF);
        if (!yVar.V) {
            pVar.a(yVar);
            yVar.H = false;
            if (yVar.f1135b0 == null) {
                yVar.f1139f0 = false;
            }
            if (J(yVar)) {
                this.D = true;
            }
        }
        return x0VarF;
    }

    public final void a0(y yVar) {
        if (yVar != null) {
            if (!yVar.equals(this.f1070c.k(yVar.A)) || (yVar.O != null && yVar.N != this)) {
                throw new IllegalArgumentException("Fragment " + yVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        y yVar2 = this.f1088w;
        this.f1088w = yVar;
        q(yVar2);
        q(this.f1088w);
    }

    public final void b(c0 c0Var, z7.b bVar, y yVar) {
        if (this.f1085t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1085t = c0Var;
        this.f1086u = bVar;
        this.f1087v = yVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1078m;
        if (yVar != null) {
            copyOnWriteArrayList.add(new l0(yVar));
        } else if (c0Var != null) {
            copyOnWriteArrayList.add(c0Var);
        }
        if (this.f1087v != null) {
            f0();
        }
        if (c0Var != null) {
            c.a0 a0VarJ = c0Var.B.j();
            this.f1073g = a0VarJ;
            a0VarJ.a(this.f1074h, yVar != null ? yVar : c0Var);
        }
        if (yVar != null) {
            t0 t0Var = yVar.N.L;
            HashMap map = t0Var.f1103e;
            t0 t0Var2 = (t0) map.get(yVar.A);
            if (t0Var2 == null) {
                t0Var2 = new t0(t0Var.f1104g);
                map.put(yVar.A, t0Var2);
            }
            this.L = t0Var2;
        } else if (c0Var != null) {
            this.L = (t0) new a7.j(c0Var.B.e(), t0.f1101j).p(t0.class);
        } else {
            this.L = new t0(false);
        }
        this.L.i = N();
        this.f1070c.f11745z = this.L;
        c0 c0Var2 = this.f1085t;
        if (c0Var2 != null && yVar == null) {
            o.r rVarA = c0Var2.a();
            rVarA.f("android:support:fragments", new h0(0, this));
            Bundle bundleC = rVarA.c("android:support:fragments");
            if (bundleC != null) {
                V(bundleC);
            }
        }
        c0 c0Var3 = this.f1085t;
        if (c0Var3 != null) {
            c.i iVar = c0Var3.B.D;
            String strK = d0.d.k("FragmentManager:", yVar != null ? j4.a.n(new StringBuilder(), yVar.A, ":") : "");
            this.f1091z = iVar.d(u5.a.c(strK, "StartActivityForResult"), new m0(3), new a9.g(3, this));
            this.A = iVar.d(u5.a.c(strK, "StartIntentSenderForResult"), new m0(0), new s5.c(4, this));
            this.B = iVar.d(u5.a.c(strK, "RequestPermissions"), new m0(1), new s5.d(this));
        }
        c0 c0Var4 = this.f1085t;
        if (c0Var4 != null) {
            c0Var4.B.h(this.f1079n);
        }
        c0 c0Var5 = this.f1085t;
        if (c0Var5 != null) {
            h.j jVar = c0Var5.B;
            jVar.getClass();
            g0 g0Var = this.f1080o;
            de.i.e(g0Var, "listener");
            jVar.F.add(g0Var);
        }
        c0 c0Var6 = this.f1085t;
        if (c0Var6 != null) {
            h.j jVar2 = c0Var6.B;
            jVar2.getClass();
            g0 g0Var2 = this.f1081p;
            de.i.e(g0Var2, "listener");
            jVar2.H.add(g0Var2);
        }
        c0 c0Var7 = this.f1085t;
        if (c0Var7 != null) {
            h.j jVar3 = c0Var7.B;
            jVar3.getClass();
            g0 g0Var3 = this.f1082q;
            de.i.e(g0Var3, "listener");
            jVar3.I.add(g0Var3);
        }
        c0 c0Var8 = this.f1085t;
        if (c0Var8 == null || yVar != null) {
            return;
        }
        h.j jVar4 = c0Var8.B;
        jVar4.getClass();
        j0 j0Var = this.f1083r;
        de.i.e(j0Var, "provider");
        hd.a aVar = jVar4.f1653x;
        ((CopyOnWriteArrayList) aVar.f6280x).add(j0Var);
        ((Runnable) aVar.f6279w).run();
    }

    public final void b0(y yVar) {
        ViewGroup viewGroupE = E(yVar);
        if (viewGroupE != null) {
            w wVar = yVar.f1138e0;
            if ((wVar == null ? 0 : wVar.f1121e) + (wVar == null ? 0 : wVar.f1120d) + (wVar == null ? 0 : wVar.f1119c) + (wVar == null ? 0 : wVar.f1118b) > 0) {
                if (viewGroupE.getTag(m1.b.visible_removing_fragment_view_tag) == null) {
                    viewGroupE.setTag(m1.b.visible_removing_fragment_view_tag, yVar);
                }
                y yVar2 = (y) viewGroupE.getTag(m1.b.visible_removing_fragment_view_tag);
                w wVar2 = yVar.f1138e0;
                boolean z2 = wVar2 != null ? wVar2.f1117a : false;
                if (yVar2.f1138e0 == null) {
                    return;
                }
                yVar2.g().f1117a = z2;
            }
        }
    }

    public final void c(y yVar) {
        if (I(2)) {
            Log.v("FragmentManager", "attach: " + yVar);
        }
        if (yVar.V) {
            yVar.V = false;
            if (yVar.G) {
                return;
            }
            this.f1070c.a(yVar);
            if (I(2)) {
                Log.v("FragmentManager", "add from attach: " + yVar);
            }
            if (J(yVar)) {
                this.D = true;
            }
        }
    }

    public final void d() {
        this.f1069b = false;
        this.J.clear();
        this.I.clear();
    }

    public final void d0() {
        ArrayList arrayListP = this.f1070c.p();
        int size = arrayListP.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListP.get(i);
            i++;
            x0 x0Var = (x0) obj;
            y yVar = x0Var.f1130c;
            if (yVar.f1136c0) {
                if (this.f1069b) {
                    this.H = true;
                } else {
                    yVar.f1136c0 = false;
                    x0Var.k();
                }
            }
        }
    }

    public final HashSet e() {
        l lVar;
        HashSet hashSet = new HashSet();
        ArrayList arrayListP = this.f1070c.p();
        int size = arrayListP.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListP.get(i);
            i++;
            ViewGroup viewGroup = ((x0) obj).f1130c.f1134a0;
            if (viewGroup != null) {
                de.i.e(G(), "factory");
                Object tag = viewGroup.getTag(m1.b.special_effects_controller_view_tag);
                if (tag instanceof l) {
                    lVar = (l) tag;
                } else {
                    lVar = new l(viewGroup);
                    viewGroup.setTag(m1.b.special_effects_controller_view_tag, lVar);
                }
                hashSet.add(lVar);
            }
        }
        return hashSet;
    }

    public final void e0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a1());
        c0 c0Var = this.f1085t;
        if (c0Var == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw illegalStateException;
            }
        }
        try {
            c0Var.B.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    public final x0 f(y yVar) {
        String str = yVar.A;
        sb.p pVar = this.f1070c;
        x0 x0Var = (x0) ((HashMap) pVar.f11743x).get(str);
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0(this.f1077l, pVar, yVar);
        x0Var2.m(this.f1085t.f988y.getClassLoader());
        x0Var2.f1132e = this.f1084s;
        return x0Var2;
    }

    public final void f0() {
        synchronized (this.f1068a) {
            try {
                if (!this.f1068a.isEmpty()) {
                    this.f1074h.a(true);
                    return;
                }
                i0 i0Var = this.f1074h;
                ArrayList arrayList = this.f1071d;
                i0Var.a((arrayList != null ? arrayList.size() : 0) > 0 && M(this.f1087v));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(y yVar) {
        if (I(2)) {
            Log.v("FragmentManager", "detach: " + yVar);
        }
        if (yVar.V) {
            return;
        }
        yVar.V = true;
        if (yVar.G) {
            if (I(2)) {
                Log.v("FragmentManager", "remove from detach: " + yVar);
            }
            sb.p pVar = this.f1070c;
            synchronized (((ArrayList) pVar.f11742w)) {
                ((ArrayList) pVar.f11742w).remove(yVar);
            }
            yVar.G = false;
            if (J(yVar)) {
                this.D = true;
            }
            b0(yVar);
        }
    }

    public final void h(boolean z2, Configuration configuration) {
        if (z2 && this.f1085t != null) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (y yVar : this.f1070c.r()) {
            if (yVar != null) {
                yVar.onConfigurationChanged(configuration);
                if (z2) {
                    yVar.P.h(true, configuration);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f1084s >= 1) {
            for (y yVar : this.f1070c.r()) {
                if (yVar != null) {
                    if (!yVar.U ? yVar.P.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1084s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (y yVar : this.f1070c.r()) {
            if (yVar != null && L(yVar)) {
                if (!yVar.U ? yVar.P.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(yVar);
                    z2 = true;
                }
            }
        }
        if (this.f1072e != null) {
            for (int i = 0; i < this.f1072e.size(); i++) {
                y yVar2 = (y) this.f1072e.get(i);
                if (arrayList == null || !arrayList.contains(yVar2)) {
                    yVar2.getClass();
                }
            }
        }
        this.f1072e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((l) it.next()).e();
        }
        c0 c0Var = this.f1085t;
        sb.p pVar = this.f1070c;
        if (c0Var != null) {
            z2 = ((t0) pVar.f11745z).f1105h;
        } else {
            z2 = d0.d.s(c0Var.f988y) ? !r1.isChangingConfigurations() : true;
        }
        int i = 0;
        if (z2) {
            Iterator it2 = this.f1075j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((c) it2.next()).f985v;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str = (String) obj;
                    t0 t0Var = (t0) pVar.f11745z;
                    t0Var.getClass();
                    if (I(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    t0Var.e(str);
                }
            }
        }
        t(-1);
        c0 c0Var2 = this.f1085t;
        if (c0Var2 != null) {
            h.j jVar = c0Var2.B;
            jVar.getClass();
            g0 g0Var = this.f1080o;
            de.i.e(g0Var, "listener");
            jVar.F.remove(g0Var);
        }
        c0 c0Var3 = this.f1085t;
        if (c0Var3 != null) {
            h.j jVar2 = c0Var3.B;
            jVar2.getClass();
            g0 g0Var2 = this.f1079n;
            de.i.e(g0Var2, "listener");
            jVar2.E.remove(g0Var2);
        }
        c0 c0Var4 = this.f1085t;
        if (c0Var4 != null) {
            h.j jVar3 = c0Var4.B;
            jVar3.getClass();
            g0 g0Var3 = this.f1081p;
            de.i.e(g0Var3, "listener");
            jVar3.H.remove(g0Var3);
        }
        c0 c0Var5 = this.f1085t;
        if (c0Var5 != null) {
            h.j jVar4 = c0Var5.B;
            jVar4.getClass();
            g0 g0Var4 = this.f1082q;
            de.i.e(g0Var4, "listener");
            jVar4.I.remove(g0Var4);
        }
        c0 c0Var6 = this.f1085t;
        if ((c0Var6 != null) && this.f1087v == null) {
            h.j jVar5 = c0Var6.B;
            jVar5.getClass();
            j0 j0Var = this.f1083r;
            de.i.e(j0Var, "provider");
            hd.a aVar = jVar5.f1653x;
            ((CopyOnWriteArrayList) aVar.f6280x).remove(j0Var);
            if (((HashMap) aVar.f6281y).remove(j0Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) aVar.f6279w).run();
        }
        this.f1085t = null;
        this.f1086u = null;
        this.f1087v = null;
        if (this.f1073g != null) {
            i0 i0Var = this.f1074h;
            ArrayList arrayList2 = i0Var.f1027a;
            CopyOnWriteArrayList copyOnWriteArrayList = i0Var.f1029c;
            Iterator it3 = copyOnWriteArrayList.iterator();
            de.i.d(it3, "iterator(...)");
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    a2.c.z((ExecutorService) autoCloseable);
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                } else if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof ContentProviderClient)) {
                        throw new IllegalArgumentException();
                    }
                    ((ContentProviderClient) autoCloseable).release();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((c.x) obj2).a();
            }
            arrayList2.clear();
            this.f1073g = null;
        }
        e.g gVar = this.f1091z;
        if (gVar != null) {
            gVar.b();
            this.A.b();
            this.B.b();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f1085t != null) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (y yVar : this.f1070c.r()) {
            if (yVar != null) {
                yVar.Z = true;
                if (z2) {
                    yVar.P.l(true);
                }
            }
        }
    }

    public final void m(boolean z2) {
        if (z2 && this.f1085t != null) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (y yVar : this.f1070c.r()) {
            if (yVar != null && z2) {
                yVar.P.m(true);
            }
        }
    }

    public final void n() {
        ArrayList arrayListQ = this.f1070c.q();
        int size = arrayListQ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            y yVar = (y) obj;
            if (yVar != null) {
                yVar.q();
                yVar.P.n();
            }
        }
    }

    public final boolean o() {
        if (this.f1084s >= 1) {
            for (y yVar : this.f1070c.r()) {
                if (yVar != null) {
                    if (!yVar.U ? yVar.P.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1084s < 1) {
            return;
        }
        for (y yVar : this.f1070c.r()) {
            if (yVar != null && !yVar.U) {
                yVar.P.p();
            }
        }
    }

    public final void q(y yVar) {
        if (yVar != null) {
            if (yVar.equals(this.f1070c.k(yVar.A))) {
                yVar.N.getClass();
                boolean zM = M(yVar);
                Boolean bool = yVar.F;
                if (bool == null || bool.booleanValue() != zM) {
                    yVar.F = Boolean.valueOf(zM);
                    q0 q0Var = yVar.P;
                    q0Var.f0();
                    q0Var.q(q0Var.f1088w);
                }
            }
        }
    }

    public final void r(boolean z2) {
        if (z2 && this.f1085t != null) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (y yVar : this.f1070c.r()) {
            if (yVar != null && z2) {
                yVar.P.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f1084s < 1) {
            return false;
        }
        boolean z2 = false;
        for (y yVar : this.f1070c.r()) {
            if (yVar != null && L(yVar)) {
                if (!yVar.U ? yVar.P.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f1069b = true;
            for (x0 x0Var : ((HashMap) this.f1070c.f11743x).values()) {
                if (x0Var != null) {
                    x0Var.f1132e = i;
                }
            }
            O(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((l) it.next()).e();
            }
            this.f1069b = false;
            y(true);
        } catch (Throwable th) {
            this.f1069b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        y yVar = this.f1087v;
        if (yVar != null) {
            sb2.append(yVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1087v)));
            sb2.append("}");
        } else {
            c0 c0Var = this.f1085t;
            if (c0Var != null) {
                sb2.append(c0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1085t)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            d0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strC = u5.a.c(str, "    ");
        sb.p pVar = this.f1070c;
        ArrayList arrayList = (ArrayList) pVar.f11742w;
        String strC2 = u5.a.c(str, "    ");
        HashMap map = (HashMap) pVar.f11743x;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (x0 x0Var : map.values()) {
                printWriter.print(str);
                if (x0Var != null) {
                    y yVar = x0Var.f1130c;
                    printWriter.println(yVar);
                    yVar.getClass();
                    printWriter.print(strC2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(yVar.R));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(yVar.S));
                    printWriter.print(" mTag=");
                    printWriter.println(yVar.T);
                    printWriter.print(strC2);
                    printWriter.print("mState=");
                    printWriter.print(yVar.f1151v);
                    printWriter.print(" mWho=");
                    printWriter.print(yVar.A);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(yVar.M);
                    printWriter.print(strC2);
                    printWriter.print("mAdded=");
                    printWriter.print(yVar.G);
                    printWriter.print(" mRemoving=");
                    printWriter.print(yVar.H);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(yVar.I);
                    printWriter.print(" mInLayout=");
                    printWriter.println(yVar.J);
                    printWriter.print(strC2);
                    printWriter.print("mHidden=");
                    printWriter.print(yVar.U);
                    printWriter.print(" mDetached=");
                    printWriter.print(yVar.V);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(yVar.Y);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strC2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(yVar.W);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(yVar.f1137d0);
                    if (yVar.N != null) {
                        printWriter.print(strC2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(yVar.N);
                    }
                    if (yVar.O != null) {
                        printWriter.print(strC2);
                        printWriter.print("mHost=");
                        printWriter.println(yVar.O);
                    }
                    if (yVar.Q != null) {
                        printWriter.print(strC2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(yVar.Q);
                    }
                    if (yVar.B != null) {
                        printWriter.print(strC2);
                        printWriter.print("mArguments=");
                        printWriter.println(yVar.B);
                    }
                    if (yVar.f1152w != null) {
                        printWriter.print(strC2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(yVar.f1152w);
                    }
                    if (yVar.f1153x != null) {
                        printWriter.print(strC2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(yVar.f1153x);
                    }
                    if (yVar.f1154y != null) {
                        printWriter.print(strC2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(yVar.f1154y);
                    }
                    Object objK = yVar.C;
                    if (objK == null) {
                        q0 q0Var = yVar.N;
                        objK = (q0Var == null || (str2 = yVar.D) == null) ? null : q0Var.f1070c.k(str2);
                    }
                    if (objK != null) {
                        printWriter.print(strC2);
                        printWriter.print("mTarget=");
                        printWriter.print(objK);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(yVar.E);
                    }
                    printWriter.print(strC2);
                    printWriter.print("mPopDirection=");
                    w wVar = yVar.f1138e0;
                    printWriter.println(wVar == null ? false : wVar.f1117a);
                    w wVar2 = yVar.f1138e0;
                    if ((wVar2 == null ? 0 : wVar2.f1118b) != 0) {
                        printWriter.print(strC2);
                        printWriter.print("getEnterAnim=");
                        w wVar3 = yVar.f1138e0;
                        printWriter.println(wVar3 == null ? 0 : wVar3.f1118b);
                    }
                    w wVar4 = yVar.f1138e0;
                    if ((wVar4 == null ? 0 : wVar4.f1119c) != 0) {
                        printWriter.print(strC2);
                        printWriter.print("getExitAnim=");
                        w wVar5 = yVar.f1138e0;
                        printWriter.println(wVar5 == null ? 0 : wVar5.f1119c);
                    }
                    w wVar6 = yVar.f1138e0;
                    if ((wVar6 == null ? 0 : wVar6.f1120d) != 0) {
                        printWriter.print(strC2);
                        printWriter.print("getPopEnterAnim=");
                        w wVar7 = yVar.f1138e0;
                        printWriter.println(wVar7 == null ? 0 : wVar7.f1120d);
                    }
                    w wVar8 = yVar.f1138e0;
                    if ((wVar8 == null ? 0 : wVar8.f1121e) != 0) {
                        printWriter.print(strC2);
                        printWriter.print("getPopExitAnim=");
                        w wVar9 = yVar.f1138e0;
                        printWriter.println(wVar9 == null ? 0 : wVar9.f1121e);
                    }
                    if (yVar.f1134a0 != null) {
                        printWriter.print(strC2);
                        printWriter.print("mContainer=");
                        printWriter.println(yVar.f1134a0);
                    }
                    if (yVar.f1135b0 != null) {
                        printWriter.print(strC2);
                        printWriter.print("mView=");
                        printWriter.println(yVar.f1135b0);
                    }
                    if (yVar.j() != null) {
                        v.j jVar = ((s1.a) new a7.j(yVar.e(), s1.a.f11419e).p(s1.a.class)).f11420d;
                        if (jVar.f13024x > 0) {
                            printWriter.print(strC2);
                            printWriter.println("Loaders:");
                            if (jVar.f13024x > 0) {
                                if (jVar.e(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strC2);
                                printWriter.print("  #");
                                printWriter.print(jVar.f13022v[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strC2);
                    printWriter.println("Child " + yVar.P + ":");
                    yVar.P.v(u5.a.c(strC2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                y yVar2 = (y) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(yVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f1072e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                y yVar3 = (y) this.f1072e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(yVar3.toString());
            }
        }
        ArrayList arrayList3 = this.f1071d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f1071d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(strC, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1068a) {
            try {
                int size4 = this.f1068a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (o0) this.f1068a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1085t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1086u);
        if (this.f1087v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1087v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1084s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(o0 o0Var, boolean z2) {
        if (!z2) {
            if (this.f1085t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (N()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1068a) {
            try {
                if (this.f1085t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1068a.add(o0Var);
                    X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f1069b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1085t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1085t.f989z.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && N()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean zA;
        x(z2);
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f1068a) {
                if (this.f1068a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f1068a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((o0) this.f1068a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                f0();
                u();
                ((HashMap) this.f1070c.f11743x).values().removeAll(Collections.singleton(null));
                return z10;
            }
            z10 = true;
            this.f1069b = true;
            try {
                U(this.I, this.J);
            } finally {
                d();
            }
        }
    }

    public final void z(a aVar, boolean z2) {
        if (z2 && (this.f1085t == null || this.G)) {
            return;
        }
        x(z2);
        aVar.a(this.I, this.J);
        this.f1069b = true;
        try {
            U(this.I, this.J);
            d();
            f0();
            u();
            ((HashMap) this.f1070c.f11743x).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }
}
