package j1;

import a2.a2;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.p1;
import com.google.android.gms.internal.measurement.k4;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p0 {
    public final i0 A;
    public final zb.d B;
    public f.g C;
    public f.g D;
    public f.g E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public r0 O;
    public final a1.e P;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6944b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f6947e;

    /* renamed from: g, reason: collision with root package name */
    public d.n0 f6949g;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6955n;

    /* renamed from: o, reason: collision with root package name */
    public final f0 f6956o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f6957p;

    /* renamed from: q, reason: collision with root package name */
    public final g0 f6958q;

    /* renamed from: r, reason: collision with root package name */
    public final g0 f6959r;
    public final g0 s;

    /* renamed from: t, reason: collision with root package name */
    public final g0 f6960t;

    /* renamed from: u, reason: collision with root package name */
    public final h0 f6961u;

    /* renamed from: v, reason: collision with root package name */
    public int f6962v;

    /* renamed from: w, reason: collision with root package name */
    public a0 f6963w;

    /* renamed from: x, reason: collision with root package name */
    public k4 f6964x;

    /* renamed from: y, reason: collision with root package name */
    public y f6965y;

    /* renamed from: z, reason: collision with root package name */
    public y f6966z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6943a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final c6.h f6945c = new c6.h(7);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f6946d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final d0 f6948f = new d0(this);

    /* renamed from: h, reason: collision with root package name */
    public a f6950h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6951i = false;
    public final d.o0 j = new d.o0(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f6952k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f6953l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f6954m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [j1.g0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [j1.g0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [j1.g0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [j1.g0] */
    public p0() {
        Collections.synchronizedMap(new HashMap());
        this.f6955n = new ArrayList();
        this.f6956o = new f0(this);
        this.f6957p = new CopyOnWriteArrayList();
        final int i6 = 0;
        this.f6958q = new s0.a(this) { // from class: j1.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f6911b;

            {
                this.f6911b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        p0 p0Var = this.f6911b;
                        if (p0Var.N()) {
                            p0Var.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        p0 p0Var2 = this.f6911b;
                        if (p0Var2.N() && num.intValue() == 80) {
                            p0Var2.m(false);
                            return;
                        }
                        return;
                    case 2:
                        h0.j jVar = (h0.j) obj;
                        p0 p0Var3 = this.f6911b;
                        if (p0Var3.N()) {
                            boolean z10 = jVar.f5776a;
                            p0Var3.n(false);
                            return;
                        }
                        return;
                    default:
                        h0.b0 b0Var = (h0.b0) obj;
                        p0 p0Var4 = this.f6911b;
                        if (p0Var4.N()) {
                            boolean z11 = b0Var.f5762a;
                            p0Var4.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i10 = 1;
        this.f6959r = new s0.a(this) { // from class: j1.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f6911b;

            {
                this.f6911b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        p0 p0Var = this.f6911b;
                        if (p0Var.N()) {
                            p0Var.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        p0 p0Var2 = this.f6911b;
                        if (p0Var2.N() && num.intValue() == 80) {
                            p0Var2.m(false);
                            return;
                        }
                        return;
                    case 2:
                        h0.j jVar = (h0.j) obj;
                        p0 p0Var3 = this.f6911b;
                        if (p0Var3.N()) {
                            boolean z10 = jVar.f5776a;
                            p0Var3.n(false);
                            return;
                        }
                        return;
                    default:
                        h0.b0 b0Var = (h0.b0) obj;
                        p0 p0Var4 = this.f6911b;
                        if (p0Var4.N()) {
                            boolean z11 = b0Var.f5762a;
                            p0Var4.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i11 = 2;
        this.s = new s0.a(this) { // from class: j1.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f6911b;

            {
                this.f6911b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        p0 p0Var = this.f6911b;
                        if (p0Var.N()) {
                            p0Var.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        p0 p0Var2 = this.f6911b;
                        if (p0Var2.N() && num.intValue() == 80) {
                            p0Var2.m(false);
                            return;
                        }
                        return;
                    case 2:
                        h0.j jVar = (h0.j) obj;
                        p0 p0Var3 = this.f6911b;
                        if (p0Var3.N()) {
                            boolean z10 = jVar.f5776a;
                            p0Var3.n(false);
                            return;
                        }
                        return;
                    default:
                        h0.b0 b0Var = (h0.b0) obj;
                        p0 p0Var4 = this.f6911b;
                        if (p0Var4.N()) {
                            boolean z11 = b0Var.f5762a;
                            p0Var4.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i12 = 3;
        this.f6960t = new s0.a(this) { // from class: j1.g0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f6911b;

            {
                this.f6911b = this;
            }

            @Override // s0.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        p0 p0Var = this.f6911b;
                        if (p0Var.N()) {
                            p0Var.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        p0 p0Var2 = this.f6911b;
                        if (p0Var2.N() && num.intValue() == 80) {
                            p0Var2.m(false);
                            return;
                        }
                        return;
                    case 2:
                        h0.j jVar = (h0.j) obj;
                        p0 p0Var3 = this.f6911b;
                        if (p0Var3.N()) {
                            boolean z10 = jVar.f5776a;
                            p0Var3.n(false);
                            return;
                        }
                        return;
                    default:
                        h0.b0 b0Var = (h0.b0) obj;
                        p0 p0Var4 = this.f6911b;
                        if (p0Var4.N()) {
                            boolean z11 = b0Var.f5762a;
                            p0Var4.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f6961u = new h0(this);
        this.f6962v = -1;
        this.A = new i0(this);
        this.B = new zb.d(15);
        this.F = new ArrayDeque();
        this.P = new a1.e(this, 7);
    }

    public static HashSet G(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < aVar.f6855a.size(); i6++) {
            y yVar = ((w0) aVar.f6855a.get(i6)).f7006b;
            if (yVar != null && aVar.f6861g) {
                hashSet.add(yVar);
            }
        }
        return hashSet;
    }

    public static boolean L(int i6) {
        if (Log.isLoggable("FragmentManager", i6)) {
            return true;
        }
        return false;
    }

    public static boolean M(y yVar) {
        yVar.getClass();
        ArrayList l10 = yVar.U.f6945c.l();
        int size = l10.size();
        boolean z10 = false;
        int i6 = 0;
        while (i6 < size) {
            Object obj = l10.get(i6);
            i6++;
            y yVar2 = (y) obj;
            if (yVar2 != null) {
                z10 = M(yVar2);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(y yVar) {
        if (yVar != null) {
            if (yVar.f7021d0) {
                if (yVar.S == null || O(yVar.V)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean P(y yVar) {
        if (yVar != null) {
            p0 p0Var = yVar.S;
            if (yVar.equals(p0Var.f6966z) && P(p0Var.f6965y)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void f0(y yVar) {
        if (L(2)) {
            Log.v("FragmentManager", "show: " + yVar);
        }
        if (yVar.Z) {
            yVar.Z = false;
            yVar.f7028k0 = !yVar.f7028k0;
        }
    }

    public final void A(a aVar, boolean z10) {
        if (z10 && (this.f6963w == null || this.J)) {
            return;
        }
        y(z10);
        a aVar2 = this.f6950h;
        if (aVar2 != null) {
            aVar2.s = false;
            aVar2.d();
            if (L(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f6950h + " as part of execSingleAction for action " + aVar);
            }
            this.f6950h.f(false, false);
            this.f6950h.a(this.L, this.M);
            ArrayList arrayList = this.f6950h.f6855a;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                y yVar = ((w0) obj).f7006b;
                if (yVar != null) {
                    yVar.K = false;
                }
            }
            this.f6950h = null;
        }
        aVar.a(this.L, this.M);
        this.f6944b = true;
        try {
            X(this.L, this.M);
            d();
            h0();
            if (this.K) {
                this.K = false;
                ArrayList k8 = this.f6945c.k();
                int size2 = k8.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = k8.get(i10);
                    i10++;
                    v0 v0Var = (v0) obj2;
                    y yVar2 = v0Var.f6992c;
                    if (yVar2.f7025h0) {
                        if (this.f6944b) {
                            this.K = true;
                        } else {
                            yVar2.f7025h0 = false;
                            v0Var.k();
                        }
                    }
                }
            }
            ((HashMap) this.f6945c.f1982y).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:141:0x0242. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x0322. Please report as an issue. */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i6, int i10) {
        Object obj;
        String str;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        c6.h hVar = this.f6945c;
        ArrayList arrayList3 = this.f6955n;
        boolean z13 = ((a) arrayList.get(i6)).f6869p;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(hVar.m());
        y yVar = this.f6966z;
        int i13 = i6;
        boolean z14 = false;
        while (i13 < i10) {
            a aVar = (a) arrayList.get(i13);
            if (!((Boolean) arrayList2.get(i13)).booleanValue()) {
                ArrayList arrayList5 = this.N;
                ArrayList arrayList6 = aVar.f6855a;
                int i14 = 0;
                while (i14 < arrayList6.size()) {
                    w0 w0Var = (w0) arrayList6.get(i14);
                    boolean z15 = z13;
                    int i15 = w0Var.f7005a;
                    int i16 = i13;
                    int i17 = 1;
                    if (i15 != 1) {
                        z12 = z14;
                        if (i15 != 2) {
                            if (i15 != 3 && i15 != 6) {
                                if (i15 != 7) {
                                    if (i15 == 8) {
                                        arrayList6.add(i14, new w0(9, yVar, 0));
                                        w0Var.f7007c = true;
                                        i14++;
                                        yVar = w0Var.f7006b;
                                    }
                                } else {
                                    i17 = 1;
                                }
                            } else {
                                arrayList5.remove(w0Var.f7006b);
                                y yVar2 = w0Var.f7006b;
                                if (yVar2 == yVar) {
                                    arrayList6.add(i14, new w0(9, yVar2));
                                    i14++;
                                    yVar = null;
                                }
                            }
                            i17 = 1;
                        } else {
                            y yVar3 = w0Var.f7006b;
                            int i18 = yVar3.X;
                            int size = arrayList5.size() - 1;
                            boolean z16 = false;
                            while (size >= 0) {
                                int i19 = size;
                                y yVar4 = (y) arrayList5.get(size);
                                if (yVar4.X == i18) {
                                    if (yVar4 == yVar3) {
                                        i12 = i18;
                                        z16 = true;
                                    } else {
                                        if (yVar4 == yVar) {
                                            i12 = i18;
                                            arrayList6.add(i14, new w0(9, yVar4, 0));
                                            i14++;
                                            yVar = null;
                                        } else {
                                            i12 = i18;
                                        }
                                        w0 w0Var2 = new w0(3, yVar4, 0);
                                        w0Var2.f7008d = w0Var.f7008d;
                                        w0Var2.f7010f = w0Var.f7010f;
                                        w0Var2.f7009e = w0Var.f7009e;
                                        w0Var2.f7011g = w0Var.f7011g;
                                        arrayList6.add(i14, w0Var2);
                                        arrayList5.remove(yVar4);
                                        i14++;
                                        yVar = yVar;
                                    }
                                } else {
                                    i12 = i18;
                                }
                                size = i19 - 1;
                                i18 = i12;
                            }
                            i17 = 1;
                            if (z16) {
                                arrayList6.remove(i14);
                                i14--;
                            } else {
                                w0Var.f7005a = 1;
                                w0Var.f7007c = true;
                                arrayList5.add(yVar3);
                            }
                        }
                        i14 += i17;
                        z13 = z15;
                        i13 = i16;
                        z14 = z12;
                    } else {
                        z12 = z14;
                    }
                    arrayList5.add(w0Var.f7006b);
                    i14 += i17;
                    z13 = z15;
                    i13 = i16;
                    z14 = z12;
                }
                z10 = z13;
                i11 = i13;
                z11 = z14;
            } else {
                z10 = z13;
                i11 = i13;
                z11 = z14;
                int i20 = 1;
                ArrayList arrayList7 = this.N;
                ArrayList arrayList8 = aVar.f6855a;
                int size2 = arrayList8.size() - 1;
                while (size2 >= 0) {
                    w0 w0Var3 = (w0) arrayList8.get(size2);
                    int i21 = w0Var3.f7005a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 8:
                                    yVar = null;
                                    break;
                                case 9:
                                    yVar = w0Var3.f7006b;
                                    break;
                                case 10:
                                    w0Var3.f7013i = w0Var3.f7012h;
                                    break;
                            }
                            size2--;
                            i20 = 1;
                        }
                        arrayList7.add(w0Var3.f7006b);
                        size2--;
                        i20 = 1;
                    }
                    arrayList7.remove(w0Var3.f7006b);
                    size2--;
                    i20 = 1;
                }
            }
            if (!z11 && !aVar.f6861g) {
                z14 = false;
            } else {
                z14 = true;
            }
            i13 = i11 + 1;
            z13 = z10;
        }
        boolean z17 = z13;
        boolean z18 = z14;
        this.N.clear();
        if (!z17 && this.f6962v >= 1) {
            for (int i22 = i6; i22 < i10; i22++) {
                ArrayList arrayList9 = ((a) arrayList.get(i22)).f6855a;
                int size3 = arrayList9.size();
                int i23 = 0;
                while (i23 < size3) {
                    Object obj2 = arrayList9.get(i23);
                    i23++;
                    y yVar5 = ((w0) obj2).f7006b;
                    if (yVar5 != null && yVar5.S != null) {
                        hVar.r(g(yVar5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i24 = i6;
        while (i24 < i10) {
            a aVar2 = (a) arrayList.get(i24);
            if (((Boolean) arrayList2.get(i24)).booleanValue()) {
                aVar2.c(-1);
                p0 p0Var = aVar2.f6871r;
                ArrayList arrayList10 = aVar2.f6855a;
                for (int size4 = arrayList10.size() - 1; size4 >= 0; size4--) {
                    w0 w0Var4 = (w0) arrayList10.get(size4);
                    y yVar6 = w0Var4.f7006b;
                    if (yVar6 != null) {
                        yVar6.L = aVar2.f6873u;
                        if (yVar6.f7027j0 != null) {
                            yVar6.b().f6995a = true;
                        }
                        int i25 = aVar2.f6860f;
                        int i26 = 8194;
                        if (i25 != 4097) {
                            if (i25 != 8194) {
                                i26 = 4100;
                                if (i25 != 8197) {
                                    if (i25 != 4099) {
                                        if (i25 != 4100) {
                                            i26 = 0;
                                        } else {
                                            i26 = 8197;
                                        }
                                    } else {
                                        i26 = 4099;
                                    }
                                }
                            } else {
                                i26 = 4097;
                            }
                        }
                        if (yVar6.f7027j0 != null || i26 != 0) {
                            yVar6.b();
                            yVar6.f7027j0.f7000f = i26;
                        }
                        yVar6.b();
                        yVar6.f7027j0.getClass();
                    }
                    switch (w0Var4.f7005a) {
                        case 1:
                            yVar6.I(w0Var4.f7008d, w0Var4.f7009e, w0Var4.f7010f, w0Var4.f7011g);
                            p0Var.b0(yVar6, true);
                            p0Var.W(yVar6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + w0Var4.f7005a);
                        case 3:
                            yVar6.I(w0Var4.f7008d, w0Var4.f7009e, w0Var4.f7010f, w0Var4.f7011g);
                            p0Var.a(yVar6);
                        case 4:
                            yVar6.I(w0Var4.f7008d, w0Var4.f7009e, w0Var4.f7010f, w0Var4.f7011g);
                            p0Var.getClass();
                            f0(yVar6);
                        case 5:
                            yVar6.I(w0Var4.f7008d, w0Var4.f7009e, w0Var4.f7010f, w0Var4.f7011g);
                            p0Var.b0(yVar6, true);
                            p0Var.K(yVar6);
                        case 6:
                            yVar6.I(w0Var4.f7008d, w0Var4.f7009e, w0Var4.f7010f, w0Var4.f7011g);
                            p0Var.c(yVar6);
                        case 7:
                            yVar6.I(w0Var4.f7008d, w0Var4.f7009e, w0Var4.f7010f, w0Var4.f7011g);
                            p0Var.b0(yVar6, true);
                            p0Var.h(yVar6);
                        case 8:
                            p0Var.d0(null);
                        case 9:
                            p0Var.d0(yVar6);
                        case 10:
                            w0Var4.f7013i = yVar6.o0;
                            p0Var.c0(yVar6, w0Var4.f7012h);
                    }
                }
            } else {
                aVar2.c(1);
                p0 p0Var2 = aVar2.f6871r;
                ArrayList arrayList11 = aVar2.f6855a;
                int size5 = arrayList11.size();
                int i27 = 0;
                while (i27 < size5) {
                    w0 w0Var5 = (w0) arrayList11.get(i27);
                    y yVar7 = w0Var5.f7006b;
                    if (yVar7 != null) {
                        yVar7.L = aVar2.f6873u;
                        if (yVar7.f7027j0 != null) {
                            yVar7.b().f6995a = false;
                        }
                        int i28 = aVar2.f6860f;
                        if (yVar7.f7027j0 != null || i28 != 0) {
                            yVar7.b();
                            yVar7.f7027j0.f7000f = i28;
                        }
                        yVar7.b();
                        yVar7.f7027j0.getClass();
                    }
                    switch (w0Var5.f7005a) {
                        case 1:
                            str = str2;
                            yVar7.I(w0Var5.f7008d, w0Var5.f7009e, w0Var5.f7010f, w0Var5.f7011g);
                            p0Var2.b0(yVar7, false);
                            p0Var2.a(yVar7);
                            i27++;
                            str2 = str;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + w0Var5.f7005a);
                        case 3:
                            str = str2;
                            yVar7.I(w0Var5.f7008d, w0Var5.f7009e, w0Var5.f7010f, w0Var5.f7011g);
                            p0Var2.W(yVar7);
                            i27++;
                            str2 = str;
                        case 4:
                            str = str2;
                            yVar7.I(w0Var5.f7008d, w0Var5.f7009e, w0Var5.f7010f, w0Var5.f7011g);
                            p0Var2.K(yVar7);
                            i27++;
                            str2 = str;
                        case 5:
                            str = str2;
                            yVar7.I(w0Var5.f7008d, w0Var5.f7009e, w0Var5.f7010f, w0Var5.f7011g);
                            p0Var2.b0(yVar7, false);
                            f0(yVar7);
                            i27++;
                            str2 = str;
                        case 6:
                            str = str2;
                            yVar7.I(w0Var5.f7008d, w0Var5.f7009e, w0Var5.f7010f, w0Var5.f7011g);
                            p0Var2.h(yVar7);
                            i27++;
                            str2 = str;
                        case 7:
                            str = str2;
                            yVar7.I(w0Var5.f7008d, w0Var5.f7009e, w0Var5.f7010f, w0Var5.f7011g);
                            p0Var2.b0(yVar7, false);
                            p0Var2.c(yVar7);
                            i27++;
                            str2 = str;
                        case 8:
                            p0Var2.d0(yVar7);
                            str = str2;
                            i27++;
                            str2 = str;
                        case 9:
                            p0Var2.d0(null);
                            str = str2;
                            i27++;
                            str2 = str;
                        case 10:
                            w0Var5.f7012h = yVar7.o0;
                            p0Var2.c0(yVar7, w0Var5.f7013i);
                            str = str2;
                            i27++;
                            str2 = str;
                    }
                }
            }
            i24++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
        if (z18 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i29 = 0;
            while (i29 < size6) {
                Object obj3 = arrayList.get(i29);
                i29++;
                linkedHashSet.addAll(G((a) obj3));
            }
            if (this.f6950h == null) {
                int size7 = arrayList3.size();
                int i30 = 0;
                while (i30 < size7) {
                    Object obj4 = arrayList3.get(i30);
                    i30++;
                    n4.h hVar2 = (n4.h) obj4;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        hVar2.b((y) it.next(), booleanValue);
                    }
                }
                int size8 = arrayList3.size();
                int i31 = 0;
                while (i31 < size8) {
                    Object obj5 = arrayList3.get(i31);
                    i31++;
                    n4.h hVar3 = (n4.h) obj5;
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        hVar3.a((y) it2.next(), booleanValue);
                    }
                }
            }
        }
        for (int i32 = i6; i32 < i10; i32++) {
            a aVar3 = (a) arrayList.get(i32);
            if (booleanValue) {
                for (int size9 = aVar3.f6855a.size() - 1; size9 >= 0; size9--) {
                    y yVar8 = ((w0) aVar3.f6855a.get(size9)).f7006b;
                    if (yVar8 != null) {
                        g(yVar8).k();
                    }
                }
            } else {
                ArrayList arrayList12 = aVar3.f6855a;
                int size10 = arrayList12.size();
                int i33 = 0;
                while (i33 < size10) {
                    Object obj6 = arrayList12.get(i33);
                    i33++;
                    y yVar9 = ((w0) obj6).f7006b;
                    if (yVar9 != null) {
                        g(yVar9).k();
                    }
                }
            }
        }
        R(this.f6962v, true);
        int i34 = i6;
        Iterator it3 = f(arrayList, i34, i10).iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            mVar.f6931e = booleanValue;
            synchronized (mVar.f6928b) {
                try {
                    mVar.l();
                    ArrayList arrayList13 = mVar.f6928b;
                    ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            a1 a1Var = (a1) obj;
                            View view = a1Var.f6876c.f7024g0;
                            kotlin.jvm.internal.k.d(view, "operation.fragment.mView");
                            char c10 = 4;
                            if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                                int visibility = view.getVisibility();
                                if (visibility != 0) {
                                    if (visibility != 4) {
                                        if (visibility == 8) {
                                            c10 = 3;
                                        } else {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                    }
                                } else {
                                    c10 = 2;
                                }
                            }
                            if (a1Var.f6874a != 2 || c10 == 2) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    mVar.f6932f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mVar.e();
        }
        while (i34 < i10) {
            a aVar4 = (a) arrayList.get(i34);
            if (((Boolean) arrayList2.get(i34)).booleanValue() && aVar4.f6872t >= 0) {
                aVar4.f6872t = -1;
            }
            if (aVar4.f6870q != null) {
                for (int i35 = 0; i35 < aVar4.f6870q.size(); i35++) {
                    ((Runnable) aVar4.f6870q.get(i35)).run();
                }
                aVar4.f6870q = null;
            }
            i34++;
        }
        if (z18) {
            for (int i36 = 0; i36 < arrayList3.size(); i36++) {
                ((n4.h) arrayList3.get(i36)).getClass();
            }
        }
    }

    public final int C(String str, boolean z10, int i6) {
        if (this.f6946d.isEmpty()) {
            return -1;
        }
        if (str == null && i6 < 0) {
            if (z10) {
                return 0;
            }
            return this.f6946d.size() - 1;
        }
        int size = this.f6946d.size() - 1;
        while (size >= 0) {
            a aVar = (a) this.f6946d.get(size);
            if ((str != null && str.equals(aVar.f6863i)) || (i6 >= 0 && i6 == aVar.f6872t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z10) {
            while (size > 0) {
                a aVar2 = (a) this.f6946d.get(size - 1);
                if ((str == null || !str.equals(aVar2.f6863i)) && (i6 < 0 || i6 != aVar2.f6872t)) {
                    break;
                }
                size--;
            }
            return size;
        }
        if (size == this.f6946d.size() - 1) {
            return -1;
        }
        return size + 1;
    }

    public final y D(int i6) {
        c6.h hVar = this.f6945c;
        ArrayList arrayList = (ArrayList) hVar.f1981x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y yVar = (y) arrayList.get(size);
            if (yVar != null && yVar.W == i6) {
                return yVar;
            }
        }
        for (v0 v0Var : ((HashMap) hVar.f1982y).values()) {
            if (v0Var != null) {
                y yVar2 = v0Var.f6992c;
                if (yVar2.W == i6) {
                    return yVar2;
                }
            }
        }
        return null;
    }

    public final y E(String str) {
        c6.h hVar = this.f6945c;
        ArrayList arrayList = (ArrayList) hVar.f1981x;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                y yVar = (y) arrayList.get(size);
                if (yVar != null && str.equals(yVar.Y)) {
                    return yVar;
                }
            }
        }
        if (str != null) {
            for (v0 v0Var : ((HashMap) hVar.f1982y).values()) {
                if (v0Var != null) {
                    y yVar2 = v0Var.f6992c;
                    if (str.equals(yVar2.Y)) {
                        return yVar2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final void F() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (mVar.f6932f) {
                if (L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                mVar.f6932f = false;
                mVar.e();
            }
        }
    }

    public final ViewGroup H(y yVar) {
        ViewGroup viewGroup = yVar.f7023f0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (yVar.X > 0 && this.f6964x.n()) {
            View m9 = this.f6964x.m(yVar.X);
            if (m9 instanceof ViewGroup) {
                return (ViewGroup) m9;
            }
            return null;
        }
        return null;
    }

    public final i0 I() {
        y yVar = this.f6965y;
        if (yVar != null) {
            return yVar.S.I();
        }
        return this.A;
    }

    public final zb.d J() {
        y yVar = this.f6965y;
        if (yVar != null) {
            return yVar.S.J();
        }
        return this.B;
    }

    public final void K(y yVar) {
        if (L(2)) {
            Log.v("FragmentManager", "hide: " + yVar);
        }
        if (!yVar.Z) {
            yVar.Z = true;
            yVar.f7028k0 = true ^ yVar.f7028k0;
            e0(yVar);
        }
    }

    public final boolean N() {
        y yVar = this.f6965y;
        if (yVar == null) {
            return true;
        }
        if (yVar.m() && this.f6965y.g().N()) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if (!this.H && !this.I) {
            return false;
        }
        return true;
    }

    public final void R(int i6, boolean z10) {
        a0 a0Var;
        if (this.f6963w == null && i6 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i6 != this.f6962v) {
            this.f6962v = i6;
            c6.h hVar = this.f6945c;
            HashMap hashMap = (HashMap) hVar.f1982y;
            ArrayList arrayList = (ArrayList) hVar.f1981x;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                v0 v0Var = (v0) hashMap.get(((y) obj).C);
                if (v0Var != null) {
                    v0Var.k();
                }
            }
            for (v0 v0Var2 : hashMap.values()) {
                if (v0Var2 != null) {
                    v0Var2.k();
                    y yVar = v0Var2.f6992c;
                    if (yVar.J && !yVar.o()) {
                        if (yVar.L && !((HashMap) hVar.f1983z).containsKey(yVar.C)) {
                            hVar.A(yVar.C, v0Var2.o());
                        }
                        hVar.s(v0Var2);
                    }
                }
            }
            ArrayList k8 = hVar.k();
            int size2 = k8.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = k8.get(i11);
                i11++;
                v0 v0Var3 = (v0) obj2;
                y yVar2 = v0Var3.f6992c;
                if (yVar2.f7025h0) {
                    if (this.f6944b) {
                        this.K = true;
                    } else {
                        yVar2.f7025h0 = false;
                        v0Var3.k();
                    }
                }
            }
            if (this.G && (a0Var = this.f6963w) != null && this.f6962v == 7) {
                a0Var.E.invalidateMenu();
                this.G = false;
            }
        }
    }

    public final void S() {
        if (this.f6963w != null) {
            this.H = false;
            this.I = false;
            this.O.f6977g = false;
            for (y yVar : this.f6945c.m()) {
                if (yVar != null) {
                    yVar.U.S();
                }
            }
        }
    }

    public final boolean T() {
        return U(-1, 0);
    }

    public final boolean U(int i6, int i10) {
        z(false);
        y(true);
        y yVar = this.f6966z;
        if (yVar != null && i6 < 0 && yVar.c().T()) {
            return true;
        }
        boolean V = V(this.L, this.M, null, i6, i10);
        if (V) {
            this.f6944b = true;
            try {
                X(this.L, this.M);
            } finally {
                d();
            }
        }
        h0();
        boolean z10 = this.K;
        c6.h hVar = this.f6945c;
        if (z10) {
            this.K = false;
            ArrayList k8 = hVar.k();
            int size = k8.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = k8.get(i11);
                i11++;
                v0 v0Var = (v0) obj;
                y yVar2 = v0Var.f6992c;
                if (yVar2.f7025h0) {
                    if (this.f6944b) {
                        this.K = true;
                    } else {
                        yVar2.f7025h0 = false;
                        v0Var.k();
                    }
                }
            }
        }
        ((HashMap) hVar.f1982y).values().removeAll(Collections.singleton(null));
        return V;
    }

    public final boolean V(ArrayList arrayList, ArrayList arrayList2, String str, int i6, int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int C = C(str, z10, i6);
        if (C < 0) {
            return false;
        }
        for (int size = this.f6946d.size() - 1; size >= C; size--) {
            arrayList.add((a) this.f6946d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void W(y yVar) {
        if (L(2)) {
            Log.v("FragmentManager", "remove: " + yVar + " nesting=" + yVar.R);
        }
        boolean o10 = yVar.o();
        if (yVar.f7018a0 && o10) {
            return;
        }
        c6.h hVar = this.f6945c;
        synchronized (((ArrayList) hVar.f1981x)) {
            ((ArrayList) hVar.f1981x).remove(yVar);
        }
        yVar.I = false;
        if (M(yVar)) {
            this.G = true;
        }
        yVar.J = true;
        e0(yVar);
    }

    public final void X(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i6 = 0;
                int i10 = 0;
                while (i6 < size) {
                    if (!((a) arrayList.get(i6)).f6869p) {
                        if (i10 != i6) {
                            B(arrayList, arrayList2, i10, i6);
                        }
                        i10 = i6 + 1;
                        if (((Boolean) arrayList2.get(i6)).booleanValue()) {
                            while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).f6869p) {
                                i10++;
                            }
                        }
                        B(arrayList, arrayList2, i6, i10);
                        i6 = i10 - 1;
                    }
                    i6++;
                }
                if (i10 != size) {
                    B(arrayList, arrayList2, i10, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void Y(Bundle bundle) {
        f0 f0Var;
        int i6;
        Bundle bundle2;
        v0 v0Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f6963w.B.getClassLoader());
                this.f6954m.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f6963w.B.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        c6.h hVar = this.f6945c;
        HashMap hashMap2 = (HashMap) hVar.f1983z;
        HashMap hashMap3 = (HashMap) hVar.f1982y;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        q0 q0Var = (q0) bundle.getParcelable("state");
        if (q0Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = q0Var.f6967x;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            f0Var = this.f6956o;
            if (i10 >= size) {
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            Bundle A = hVar.A((String) obj, null);
            if (A != null) {
                y yVar = (y) this.O.f6972b.get(((t0) A.getParcelable("state")).f6981y);
                if (yVar != null) {
                    if (L(2)) {
                        i6 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + yVar);
                    } else {
                        i6 = 2;
                    }
                    v0Var = new v0(f0Var, hVar, yVar, A);
                    bundle2 = A;
                } else {
                    i6 = 2;
                    bundle2 = A;
                    v0Var = new v0(this.f6956o, this.f6945c, this.f6963w.B.getClassLoader(), I(), A);
                }
                y yVar2 = v0Var.f6992c;
                yVar2.f7042y = bundle2;
                yVar2.S = this;
                if (L(i6)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + yVar2.C + "): " + yVar2);
                }
                v0Var.m(this.f6963w.B.getClassLoader());
                hVar.r(v0Var);
                v0Var.f6994e = this.f6962v;
            }
        }
        r0 r0Var = this.O;
        r0Var.getClass();
        ArrayList arrayList2 = new ArrayList(r0Var.f6972b.values());
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            y yVar3 = (y) obj2;
            if (hashMap3.get(yVar3.C) == null) {
                if (L(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + yVar3 + " that was not found in the set of active Fragments " + q0Var.f6967x);
                }
                this.O.j(yVar3);
                yVar3.S = this;
                v0 v0Var2 = new v0(f0Var, hVar, yVar3);
                v0Var2.f6994e = 1;
                v0Var2.k();
                yVar3.J = true;
                v0Var2.k();
            }
        }
        ArrayList arrayList3 = q0Var.f6968y;
        ((ArrayList) hVar.f1981x).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                String str3 = (String) obj3;
                y i13 = hVar.i(str3);
                if (i13 != null) {
                    if (L(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + i13);
                    }
                    hVar.f(i13);
                } else {
                    throw new IllegalStateException(h8.c.m("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (q0Var.f6969z != null) {
            this.f6946d = new ArrayList(q0Var.f6969z.length);
            int i14 = 0;
            while (true) {
                b[] bVarArr = q0Var.f6969z;
                if (i14 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i14];
                ArrayList arrayList4 = bVar.f6886y;
                a aVar = new a(this);
                bVar.a(aVar);
                aVar.f6872t = bVar.D;
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    String str4 = (String) arrayList4.get(i15);
                    if (str4 != null) {
                        ((w0) aVar.f6855a.get(i15)).f7006b = hVar.i(str4);
                    }
                }
                aVar.c(1);
                if (L(2)) {
                    StringBuilder n10 = h8.c.n(i14, "restoreAllState: back stack #", " (index ");
                    n10.append(aVar.f6872t);
                    n10.append("): ");
                    n10.append(aVar);
                    Log.v("FragmentManager", n10.toString());
                    PrintWriter printWriter = new PrintWriter(new y0());
                    aVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f6946d.add(aVar);
                i14++;
            }
        } else {
            this.f6946d = new ArrayList();
        }
        this.f6952k.set(q0Var.A);
        String str5 = q0Var.B;
        if (str5 != null) {
            y i16 = hVar.i(str5);
            this.f6966z = i16;
            r(i16);
        }
        ArrayList arrayList5 = q0Var.C;
        if (arrayList5 != null) {
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                this.f6953l.put((String) arrayList5.get(i17), (c) q0Var.D.get(i17));
            }
        }
        this.F = new ArrayDeque(q0Var.E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.os.Parcelable, java.lang.Object, j1.q0] */
    public final Bundle Z() {
        int i6;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        F();
        w();
        z(true);
        this.H = true;
        this.O.f6977g = true;
        c6.h hVar = this.f6945c;
        hVar.getClass();
        HashMap hashMap = (HashMap) hVar.f1982y;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (v0 v0Var : hashMap.values()) {
            if (v0Var != null) {
                y yVar = v0Var.f6992c;
                hVar.A(yVar.C, v0Var.o());
                arrayList2.add(yVar.C);
                if (L(2)) {
                    Log.v("FragmentManager", "Saved state of " + yVar + ": " + yVar.f7042y);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f6945c.f1983z;
        if (hashMap2.isEmpty()) {
            if (L(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
        } else {
            c6.h hVar2 = this.f6945c;
            synchronized (((ArrayList) hVar2.f1981x)) {
                try {
                    if (((ArrayList) hVar2.f1981x).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) hVar2.f1981x).size());
                        ArrayList arrayList3 = (ArrayList) hVar2.f1981x;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            y yVar2 = (y) obj;
                            arrayList.add(yVar2.C);
                            if (L(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + yVar2.C + "): " + yVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.f6946d.size();
            if (size2 > 0) {
                bVarArr = new b[size2];
                for (i6 = 0; i6 < size2; i6++) {
                    bVarArr[i6] = new b((a) this.f6946d.get(i6));
                    if (L(2)) {
                        StringBuilder n10 = h8.c.n(i6, "saveAllState: adding back stack #", ": ");
                        n10.append(this.f6946d.get(i6));
                        Log.v("FragmentManager", n10.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            ?? obj2 = new Object();
            obj2.B = null;
            ArrayList arrayList4 = new ArrayList();
            obj2.C = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj2.D = arrayList5;
            obj2.f6967x = arrayList2;
            obj2.f6968y = arrayList;
            obj2.f6969z = bVarArr;
            obj2.A = this.f6952k.get();
            y yVar3 = this.f6966z;
            if (yVar3 != null) {
                obj2.B = yVar3.C;
            }
            arrayList4.addAll(this.f6953l.keySet());
            arrayList5.addAll(this.f6953l.values());
            obj2.E = new ArrayList(this.F);
            bundle.putParcelable("state", obj2);
            for (String str : this.f6954m.keySet()) {
                bundle.putBundle(r4.a.k("result_", str), (Bundle) this.f6954m.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(r4.a.k("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final v0 a(y yVar) {
        String str = yVar.f7031n0;
        if (str != null) {
            k1.c.c(yVar, str);
        }
        if (L(2)) {
            Log.v("FragmentManager", "add: " + yVar);
        }
        v0 g10 = g(yVar);
        yVar.S = this;
        c6.h hVar = this.f6945c;
        hVar.r(g10);
        if (!yVar.f7018a0) {
            hVar.f(yVar);
            yVar.J = false;
            if (yVar.f7024g0 == null) {
                yVar.f7028k0 = false;
            }
            if (M(yVar)) {
                this.G = true;
            }
        }
        return g10;
    }

    public final void a0() {
        synchronized (this.f6943a) {
            try {
                if (this.f6943a.size() == 1) {
                    this.f6963w.C.removeCallbacks(this.P);
                    this.f6963w.C.post(this.P);
                    h0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(a0 a0Var, k4 k4Var, y yVar) {
        String str;
        a0 a0Var2;
        if (this.f6963w == null) {
            this.f6963w = a0Var;
            this.f6964x = k4Var;
            this.f6965y = yVar;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6957p;
            if (yVar != 0) {
                copyOnWriteArrayList.add(new j0(yVar));
            } else if (a0Var != null) {
                copyOnWriteArrayList.add(a0Var);
            }
            if (this.f6965y != null) {
                h0();
            }
            if (a0Var != null) {
                d.n0 onBackPressedDispatcher = a0Var.E.getOnBackPressedDispatcher();
                this.f6949g = onBackPressedDispatcher;
                if (yVar != 0) {
                    a0Var2 = yVar;
                } else {
                    a0Var2 = a0Var;
                }
                onBackPressedDispatcher.a(a0Var2, this.j);
            }
            if (yVar != 0) {
                r0 r0Var = yVar.S.O;
                HashMap hashMap = r0Var.f6973c;
                r0 r0Var2 = (r0) hashMap.get(yVar.C);
                if (r0Var2 == null) {
                    r0Var2 = new r0(r0Var.f6975e);
                    hashMap.put(yVar.C, r0Var2);
                }
                this.O = r0Var2;
            } else if (a0Var != null) {
                p1 store = a0Var.E.getViewModelStore();
                kotlin.jvm.internal.k.e(store, "store");
                o1.a defaultCreationExtras = o1.a.f9847b;
                kotlin.jvm.internal.k.e(defaultCreationExtras, "defaultCreationExtras");
                ic.s sVar = new ic.s(store, r0.f6971h, defaultCreationExtras);
                kotlin.jvm.internal.e a10 = kotlin.jvm.internal.x.a(r0.class);
                String b10 = a10.b();
                if (b10 != null) {
                    this.O = (r0) sVar.p("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10);
                } else {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
            } else {
                this.O = new r0(false);
            }
            this.O.f6977g = Q();
            this.f6945c.A = this.O;
            a0 a0Var3 = this.f6963w;
            if (a0Var3 != null && yVar == 0) {
                e5.e savedStateRegistry = a0Var3.E.getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new d.i(this, 2));
                Bundle a11 = savedStateRegistry.a("android:support:fragments");
                if (a11 != null) {
                    Y(a11);
                }
            }
            a0 a0Var4 = this.f6963w;
            if (a0Var4 != null) {
                f.h activityResultRegistry = a0Var4.E.getActivityResultRegistry();
                if (yVar != 0) {
                    str = r4.a.o(new StringBuilder(), yVar.C, ":");
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String k8 = r4.a.k("FragmentManager:", str);
                this.C = activityResultRegistry.d(w8.k.c(k8, "StartActivityForResult"), new g.b(2), new a2(this, 11));
                this.D = activityResultRegistry.d(w8.k.c(k8, "StartIntentSenderForResult"), new g.b(3), new k7.c(this, 12));
                this.E = activityResultRegistry.d(w8.k.c(k8, "RequestPermissions"), new g.b(0), new u5.r(this, 12));
            }
            a0 a0Var5 = this.f6963w;
            if (a0Var5 != null) {
                a0Var5.E.addOnConfigurationChangedListener(this.f6958q);
            }
            a0 a0Var6 = this.f6963w;
            if (a0Var6 != null) {
                a0Var6.E.addOnTrimMemoryListener(this.f6959r);
            }
            a0 a0Var7 = this.f6963w;
            if (a0Var7 != null) {
                a0Var7.E.addOnMultiWindowModeChangedListener(this.s);
            }
            a0 a0Var8 = this.f6963w;
            if (a0Var8 != null) {
                a0Var8.E.addOnPictureInPictureModeChangedListener(this.f6960t);
            }
            a0 a0Var9 = this.f6963w;
            if (a0Var9 != null && yVar == 0) {
                a0Var9.E.addMenuProvider(this.f6961u);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0(y yVar, boolean z10) {
        ViewGroup H = H(yVar);
        if (H != null && (H instanceof FragmentContainerView)) {
            ((FragmentContainerView) H).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final void c(y yVar) {
        if (L(2)) {
            Log.v("FragmentManager", "attach: " + yVar);
        }
        if (yVar.f7018a0) {
            yVar.f7018a0 = false;
            if (!yVar.I) {
                this.f6945c.f(yVar);
                if (L(2)) {
                    Log.v("FragmentManager", "add from attach: " + yVar);
                }
                if (M(yVar)) {
                    this.G = true;
                }
            }
        }
    }

    public final void c0(y yVar, androidx.lifecycle.x xVar) {
        if (yVar.equals(this.f6945c.i(yVar.C)) && (yVar.T == null || yVar.S == this)) {
            yVar.o0 = xVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + yVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void d() {
        this.f6944b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(y yVar) {
        if (yVar != null) {
            if (!yVar.equals(this.f6945c.i(yVar.C)) || (yVar.T != null && yVar.S != this)) {
                throw new IllegalArgumentException("Fragment " + yVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        y yVar2 = this.f6966z;
        this.f6966z = yVar;
        r(yVar2);
        r(this.f6966z);
    }

    public final HashSet e() {
        m mVar;
        HashSet hashSet = new HashSet();
        ArrayList k8 = this.f6945c.k();
        int size = k8.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = k8.get(i6);
            i6++;
            ViewGroup viewGroup = ((v0) obj).f6992c.f7023f0;
            if (viewGroup != null) {
                zb.d factory = J();
                kotlin.jvm.internal.k.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof m) {
                    mVar = (m) tag;
                } else {
                    mVar = new m(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, mVar);
                }
                hashSet.add(mVar);
            }
        }
        return hashSet;
    }

    public final void e0(y yVar) {
        int i6;
        int i10;
        int i11;
        int i12;
        ViewGroup H = H(yVar);
        if (H != null) {
            w wVar = yVar.f7027j0;
            boolean z10 = false;
            if (wVar == null) {
                i6 = 0;
            } else {
                i6 = wVar.f6996b;
            }
            if (wVar == null) {
                i10 = 0;
            } else {
                i10 = wVar.f6997c;
            }
            int i13 = i10 + i6;
            if (wVar == null) {
                i11 = 0;
            } else {
                i11 = wVar.f6998d;
            }
            int i14 = i11 + i13;
            if (wVar == null) {
                i12 = 0;
            } else {
                i12 = wVar.f6999e;
            }
            if (i12 + i14 > 0) {
                if (H.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    H.setTag(R.id.visible_removing_fragment_view_tag, yVar);
                }
                y yVar2 = (y) H.getTag(R.id.visible_removing_fragment_view_tag);
                w wVar2 = yVar.f7027j0;
                if (wVar2 != null) {
                    z10 = wVar2.f6995a;
                }
                if (yVar2.f7027j0 != null) {
                    yVar2.b().f6995a = z10;
                }
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i6, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i6 < i10) {
            ArrayList arrayList2 = ((a) arrayList.get(i6)).f6855a;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                y yVar = ((w0) obj).f7006b;
                if (yVar != null && (viewGroup = yVar.f7023f0) != null) {
                    hashSet.add(m.i(viewGroup, this));
                }
            }
            i6++;
        }
        return hashSet;
    }

    public final v0 g(y yVar) {
        String str = yVar.C;
        c6.h hVar = this.f6945c;
        v0 v0Var = (v0) ((HashMap) hVar.f1982y).get(str);
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0(this.f6956o, hVar, yVar);
        v0Var2.m(this.f6963w.B.getClassLoader());
        v0Var2.f6994e = this.f6962v;
        return v0Var2;
    }

    public final void g0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new y0());
        a0 a0Var = this.f6963w;
        if (a0Var != null) {
            try {
                a0Var.E.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            v("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    public final void h(y yVar) {
        if (L(2)) {
            Log.v("FragmentManager", "detach: " + yVar);
        }
        if (!yVar.f7018a0) {
            yVar.f7018a0 = true;
            if (yVar.I) {
                if (L(2)) {
                    Log.v("FragmentManager", "remove from detach: " + yVar);
                }
                c6.h hVar = this.f6945c;
                synchronized (((ArrayList) hVar.f1981x)) {
                    ((ArrayList) hVar.f1981x).remove(yVar);
                }
                yVar.I = false;
                if (M(yVar)) {
                    this.G = true;
                }
                e0(yVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [ve.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ve.a, kotlin.jvm.internal.j] */
    public final void h0() {
        int i6;
        synchronized (this.f6943a) {
            try {
                boolean z10 = true;
                if (!this.f6943a.isEmpty()) {
                    d.o0 o0Var = this.j;
                    o0Var.f3432a = true;
                    ?? r22 = o0Var.f3434c;
                    if (r22 != 0) {
                        r22.invoke();
                    }
                    if (L(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                int size = this.f6946d.size();
                if (this.f6950h != null) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                if (size + i6 <= 0 || !P(this.f6965y)) {
                    z10 = false;
                }
                if (L(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                d.o0 o0Var2 = this.j;
                o0Var2.f3432a = z10;
                ?? r02 = o0Var2.f3434c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(boolean z10) {
        if (z10 && this.f6963w != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (y yVar : this.f6945c.m()) {
            if (yVar != null) {
                yVar.f7022e0 = true;
                if (z10) {
                    yVar.U.i(true);
                }
            }
        }
    }

    public final boolean j() {
        boolean z10;
        if (this.f6962v >= 1) {
            for (y yVar : this.f6945c.m()) {
                if (yVar != null) {
                    if (!yVar.Z) {
                        z10 = yVar.U.j();
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z10;
        if (this.f6962v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z11 = false;
        for (y yVar : this.f6945c.m()) {
            if (yVar != null && O(yVar)) {
                if (!yVar.Z) {
                    z10 = yVar.U.k();
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(yVar);
                    z11 = true;
                }
            }
        }
        if (this.f6947e != null) {
            for (int i6 = 0; i6 < this.f6947e.size(); i6++) {
                y yVar2 = (y) this.f6947e.get(i6);
                if (arrayList == null || !arrayList.contains(yVar2)) {
                    yVar2.getClass();
                }
            }
        }
        this.f6947e = arrayList;
        return z11;
    }

    public final void l() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        this.J = true;
        z(true);
        w();
        a0 a0Var = this.f6963w;
        c6.h hVar = this.f6945c;
        if (a0Var != null) {
            z10 = ((r0) hVar.A).f6976f;
        } else {
            i.j jVar = a0Var.B;
            if (r4.a.w(jVar)) {
                z10 = !jVar.isChangingConfigurations();
            } else {
                z10 = true;
            }
        }
        if (z10) {
            Iterator it = this.f6953l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((c) it.next()).f6892x;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((r0) hVar.A).h((String) obj, false);
                }
            }
        }
        u(-1);
        a0 a0Var2 = this.f6963w;
        if (a0Var2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            a0Var2.E.removeOnTrimMemoryListener(this.f6959r);
        }
        a0 a0Var3 = this.f6963w;
        if (a0Var3 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            a0Var3.E.removeOnConfigurationChangedListener(this.f6958q);
        }
        a0 a0Var4 = this.f6963w;
        if (a0Var4 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            a0Var4.E.removeOnMultiWindowModeChangedListener(this.s);
        }
        a0 a0Var5 = this.f6963w;
        if (a0Var5 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            a0Var5.E.removeOnPictureInPictureModeChangedListener(this.f6960t);
        }
        a0 a0Var6 = this.f6963w;
        if (a0Var6 == null) {
            z15 = false;
        }
        if (z15 && this.f6965y == null) {
            a0Var6.E.removeMenuProvider(this.f6961u);
        }
        this.f6963w = null;
        this.f6964x = null;
        this.f6965y = null;
        if (this.f6949g != null) {
            Iterator it2 = this.j.f3433b.iterator();
            while (it2.hasNext()) {
                ((d.d) it2.next()).cancel();
            }
            this.f6949g = null;
        }
        f.g gVar = this.C;
        if (gVar != null) {
            gVar.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z10) {
        if (z10 && this.f6963w != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (y yVar : this.f6945c.m()) {
            if (yVar != null) {
                yVar.f7022e0 = true;
                if (z10) {
                    yVar.U.m(true);
                }
            }
        }
    }

    public final void n(boolean z10) {
        if (z10 && this.f6963w != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (y yVar : this.f6945c.m()) {
            if (yVar != null && z10) {
                yVar.U.n(true);
            }
        }
    }

    public final void o() {
        ArrayList l10 = this.f6945c.l();
        int size = l10.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = l10.get(i6);
            i6++;
            y yVar = (y) obj;
            if (yVar != null) {
                yVar.n();
                yVar.U.o();
            }
        }
    }

    public final boolean p() {
        boolean z10;
        if (this.f6962v >= 1) {
            for (y yVar : this.f6945c.m()) {
                if (yVar != null) {
                    if (!yVar.Z) {
                        z10 = yVar.U.p();
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f6962v >= 1) {
            for (y yVar : this.f6945c.m()) {
                if (yVar != null && !yVar.Z) {
                    yVar.U.q();
                }
            }
        }
    }

    public final void r(y yVar) {
        if (yVar != null) {
            if (yVar.equals(this.f6945c.i(yVar.C))) {
                yVar.S.getClass();
                boolean P = P(yVar);
                Boolean bool = yVar.H;
                if (bool == null || bool.booleanValue() != P) {
                    yVar.H = Boolean.valueOf(P);
                    p0 p0Var = yVar.U;
                    p0Var.h0();
                    p0Var.r(p0Var.f6966z);
                }
            }
        }
    }

    public final void s(boolean z10) {
        if (z10 && this.f6963w != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (y yVar : this.f6945c.m()) {
            if (yVar != null && z10) {
                yVar.U.s(true);
            }
        }
    }

    public final boolean t() {
        boolean z10;
        if (this.f6962v < 1) {
            return false;
        }
        boolean z11 = false;
        for (y yVar : this.f6945c.m()) {
            if (yVar != null && O(yVar)) {
                if (!yVar.Z) {
                    z10 = yVar.U.t();
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        y yVar = this.f6965y;
        if (yVar != null) {
            sb2.append(yVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f6965y)));
            sb2.append("}");
        } else {
            a0 a0Var = this.f6963w;
            if (a0Var != null) {
                sb2.append(a0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f6963w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i6) {
        try {
            this.f6944b = true;
            for (v0 v0Var : ((HashMap) this.f6945c.f1982y).values()) {
                if (v0Var != null) {
                    v0Var.f6994e = i6;
                }
            }
            R(i6, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((m) it.next()).h();
            }
            this.f6944b = false;
            z(true);
        } catch (Throwable th) {
            this.f6944b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        boolean z10;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        String c10 = w8.k.c(str, "    ");
        c6.h hVar = this.f6945c;
        ArrayList arrayList = (ArrayList) hVar.f1981x;
        String c11 = w8.k.c(str, "    ");
        HashMap hashMap = (HashMap) hVar.f1982y;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (v0 v0Var : hashMap.values()) {
                printWriter.print(str);
                if (v0Var != null) {
                    y yVar = v0Var.f6992c;
                    printWriter.println(yVar);
                    yVar.getClass();
                    printWriter.print(c11);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(yVar.W));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(yVar.X));
                    printWriter.print(" mTag=");
                    printWriter.println(yVar.Y);
                    printWriter.print(c11);
                    printWriter.print("mState=");
                    printWriter.print(yVar.f7040x);
                    printWriter.print(" mWho=");
                    printWriter.print(yVar.C);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(yVar.R);
                    printWriter.print(c11);
                    printWriter.print("mAdded=");
                    printWriter.print(yVar.I);
                    printWriter.print(" mRemoving=");
                    printWriter.print(yVar.J);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(yVar.M);
                    printWriter.print(" mInLayout=");
                    printWriter.println(yVar.N);
                    printWriter.print(c11);
                    printWriter.print("mHidden=");
                    printWriter.print(yVar.Z);
                    printWriter.print(" mDetached=");
                    printWriter.print(yVar.f7018a0);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(yVar.f7021d0);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(c11);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(yVar.f7019b0);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(yVar.f7026i0);
                    if (yVar.S != null) {
                        printWriter.print(c11);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(yVar.S);
                    }
                    if (yVar.T != null) {
                        printWriter.print(c11);
                        printWriter.print("mHost=");
                        printWriter.println(yVar.T);
                    }
                    if (yVar.V != null) {
                        printWriter.print(c11);
                        printWriter.print("mParentFragment=");
                        printWriter.println(yVar.V);
                    }
                    if (yVar.D != null) {
                        printWriter.print(c11);
                        printWriter.print("mArguments=");
                        printWriter.println(yVar.D);
                    }
                    if (yVar.f7042y != null) {
                        printWriter.print(c11);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(yVar.f7042y);
                    }
                    if (yVar.f7043z != null) {
                        printWriter.print(c11);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(yVar.f7043z);
                    }
                    if (yVar.A != null) {
                        printWriter.print(c11);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(yVar.A);
                    }
                    Object obj = yVar.E;
                    if (obj == null) {
                        p0 p0Var = yVar.S;
                        if (p0Var != null && (str2 = yVar.F) != null) {
                            obj = p0Var.f6945c.i(str2);
                        } else {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        printWriter.print(c11);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(yVar.G);
                    }
                    printWriter.print(c11);
                    printWriter.print("mPopDirection=");
                    w wVar = yVar.f7027j0;
                    if (wVar == null) {
                        z10 = false;
                    } else {
                        z10 = wVar.f6995a;
                    }
                    printWriter.println(z10);
                    w wVar2 = yVar.f7027j0;
                    if (wVar2 == null) {
                        i6 = 0;
                    } else {
                        i6 = wVar2.f6996b;
                    }
                    if (i6 != 0) {
                        printWriter.print(c11);
                        printWriter.print("getEnterAnim=");
                        w wVar3 = yVar.f7027j0;
                        if (wVar3 == null) {
                            i16 = 0;
                        } else {
                            i16 = wVar3.f6996b;
                        }
                        printWriter.println(i16);
                    }
                    w wVar4 = yVar.f7027j0;
                    if (wVar4 == null) {
                        i10 = 0;
                    } else {
                        i10 = wVar4.f6997c;
                    }
                    if (i10 != 0) {
                        printWriter.print(c11);
                        printWriter.print("getExitAnim=");
                        w wVar5 = yVar.f7027j0;
                        if (wVar5 == null) {
                            i15 = 0;
                        } else {
                            i15 = wVar5.f6997c;
                        }
                        printWriter.println(i15);
                    }
                    w wVar6 = yVar.f7027j0;
                    if (wVar6 == null) {
                        i11 = 0;
                    } else {
                        i11 = wVar6.f6998d;
                    }
                    if (i11 != 0) {
                        printWriter.print(c11);
                        printWriter.print("getPopEnterAnim=");
                        w wVar7 = yVar.f7027j0;
                        if (wVar7 == null) {
                            i14 = 0;
                        } else {
                            i14 = wVar7.f6998d;
                        }
                        printWriter.println(i14);
                    }
                    w wVar8 = yVar.f7027j0;
                    if (wVar8 == null) {
                        i12 = 0;
                    } else {
                        i12 = wVar8.f6999e;
                    }
                    if (i12 != 0) {
                        printWriter.print(c11);
                        printWriter.print("getPopExitAnim=");
                        w wVar9 = yVar.f7027j0;
                        if (wVar9 == null) {
                            i13 = 0;
                        } else {
                            i13 = wVar9.f6999e;
                        }
                        printWriter.println(i13);
                    }
                    if (yVar.f7023f0 != null) {
                        printWriter.print(c11);
                        printWriter.print("mContainer=");
                        printWriter.println(yVar.f7023f0);
                    }
                    if (yVar.f7024g0 != null) {
                        printWriter.print(c11);
                        printWriter.print("mView=");
                        printWriter.println(yVar.f7024g0);
                    }
                    if (yVar.d() != null) {
                        p1 store = yVar.getViewModelStore();
                        androidx.lifecycle.c1 c1Var = q1.a.f10826c;
                        kotlin.jvm.internal.k.e(store, "store");
                        o1.a defaultCreationExtras = o1.a.f9847b;
                        kotlin.jvm.internal.k.e(defaultCreationExtras, "defaultCreationExtras");
                        ic.s sVar = new ic.s(store, c1Var, defaultCreationExtras);
                        kotlin.jvm.internal.e a10 = kotlin.jvm.internal.x.a(q1.a.class);
                        String b10 = a10.b();
                        if (b10 != null) {
                            v.m mVar = ((q1.a) sVar.p("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10)).f10827b;
                            if (mVar.f() > 0) {
                                printWriter.print(c11);
                                printWriter.println("Loaders:");
                                if (mVar.f() > 0) {
                                    if (mVar.g(0) == null) {
                                        printWriter.print(c11);
                                        printWriter.print("  #");
                                        printWriter.print(mVar.d(0));
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                    throw new ClassCastException();
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(c11);
                    printWriter.println("Child " + yVar.U + ":");
                    yVar.U.v(w8.k.c(c11, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i17 = 0; i17 < size2; i17++) {
                y yVar2 = (y) arrayList.get(i17);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i17);
                printWriter.print(": ");
                printWriter.println(yVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f6947e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i18 = 0; i18 < size; i18++) {
                y yVar3 = (y) this.f6947e.get(i18);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i18);
                printWriter.print(": ");
                printWriter.println(yVar3.toString());
            }
        }
        int size3 = this.f6946d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i19 = 0; i19 < size3; i19++) {
                a aVar = (a) this.f6946d.get(i19);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i19);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(c10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f6952k.get());
        synchronized (this.f6943a) {
            try {
                int size4 = this.f6943a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i20 = 0; i20 < size4; i20++) {
                        Object obj2 = (l0) this.f6943a.get(i20);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i20);
                        printWriter.print(": ");
                        printWriter.println(obj2);
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
        printWriter.println(this.f6963w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f6964x);
        if (this.f6965y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f6965y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f6962v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((m) it.next()).h();
        }
    }

    public final void x(l0 l0Var, boolean z10) {
        if (!z10) {
            if (this.f6963w == null) {
                if (this.J) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Q()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f6943a) {
            try {
                if (this.f6963w == null) {
                    if (z10) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f6943a.add(l0Var);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z10) {
        if (!this.f6944b) {
            if (this.f6963w == null) {
                if (this.J) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f6963w.C.getLooper()) {
                if (!z10 && Q()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.L == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean z(boolean z10) {
        boolean z11;
        a aVar;
        y(z10);
        if (!this.f6951i && (aVar = this.f6950h) != null) {
            aVar.s = false;
            aVar.d();
            if (L(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f6950h + " as part of execPendingActions for actions " + this.f6943a);
            }
            this.f6950h.f(false, false);
            this.f6943a.add(0, this.f6950h);
            ArrayList arrayList = this.f6950h.f6855a;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                y yVar = ((w0) obj).f7006b;
                if (yVar != null) {
                    yVar.K = false;
                }
            }
            this.f6950h = null;
        }
        boolean z12 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.f6943a) {
                if (this.f6943a.isEmpty()) {
                    z11 = false;
                } else {
                    try {
                        int size2 = this.f6943a.size();
                        z11 = false;
                        for (int i10 = 0; i10 < size2; i10++) {
                            z11 |= ((l0) this.f6943a.get(i10)).a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!z11) {
                break;
            }
            this.f6944b = true;
            try {
                X(this.L, this.M);
                d();
                z12 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        h0();
        if (this.K) {
            this.K = false;
            ArrayList k8 = this.f6945c.k();
            int size3 = k8.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj2 = k8.get(i11);
                i11++;
                v0 v0Var = (v0) obj2;
                y yVar2 = v0Var.f6992c;
                if (yVar2.f7025h0) {
                    if (this.f6944b) {
                        this.K = true;
                    } else {
                        yVar2.f7025h0 = false;
                        v0Var.k();
                    }
                }
            }
        }
        ((HashMap) this.f6945c.f1982y).values().removeAll(Collections.singleton(null));
        return z12;
    }
}
