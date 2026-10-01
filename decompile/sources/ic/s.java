package ic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.d1;
import androidx.lifecycle.g1;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;
import androidx.lifecycle.o1;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.p4;
import com.unity3d.services.UnityAdsConstants;
import db.c1;
import db.i0;
import db.k0;
import db.p0;
import i4.n1;
import i4.p1;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import r1.n0;
import r1.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements v3.m, i8.b {
    public static s B;
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public Object f6781x;

    /* renamed from: y, reason: collision with root package name */
    public Object f6782y;

    /* renamed from: z, reason: collision with root package name */
    public Object f6783z;

    public s(s sVar, com.google.android.gms.internal.measurement.t tVar) {
        this.f6783z = new HashMap();
        this.A = new HashMap();
        this.f6781x = sVar;
        this.f6782y = tVar;
    }

    public static synchronized s k() {
        s sVar;
        synchronized (s.class) {
            try {
                if (B == null) {
                    B = new s(0);
                }
                sVar = B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    public com.google.android.gms.internal.measurement.n A(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVar = com.google.android.gms.internal.measurement.n.f2352a;
        Iterator l10 = dVar.l();
        while (l10.hasNext()) {
            nVar = ((com.google.android.gms.internal.measurement.t) this.f6782y).c(this, dVar.n(((Integer) l10.next()).intValue()));
            if (nVar instanceof com.google.android.gms.internal.measurement.f) {
                break;
            }
        }
        return nVar;
    }

    @Override // v3.m
    public int B() {
        return 2;
    }

    public s C() {
        return new s(this, (com.google.android.gms.internal.measurement.t) this.f6782y);
    }

    public boolean D(String str) {
        if (((HashMap) this.f6783z).containsKey(str)) {
            return true;
        }
        s sVar = (s) this.f6781x;
        if (sVar != null) {
            return sVar.D(str);
        }
        return false;
    }

    public void E(String str, com.google.android.gms.internal.measurement.n nVar) {
        s sVar;
        HashMap hashMap = (HashMap) this.f6783z;
        if (!hashMap.containsKey(str) && (sVar = (s) this.f6781x) != null && sVar.D(str)) {
            sVar.E(str, nVar);
        } else {
            if (((HashMap) this.A).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, nVar);
            }
        }
    }

    public void F(String str, com.google.android.gms.internal.measurement.n nVar) {
        HashMap hashMap = (HashMap) this.f6783z;
        if (((HashMap) this.A).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    public com.google.android.gms.internal.measurement.n G(String str) {
        HashMap hashMap = (HashMap) this.f6783z;
        if (hashMap.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.n) hashMap.get(str);
        }
        s sVar = (s) this.f6781x;
        if (sVar != null) {
            return sVar.G(str);
        }
        throw new IllegalArgumentException(w8.k.c(str, " is not defined"));
    }

    public void a(Object obj, i4.s sVar, p1 p1Var, q0 q0Var) {
        synchronized (this.f6781x) {
            try {
                i4.s j = j(obj);
                if (j == null) {
                    ((v.e) this.f6782y).put(obj, sVar);
                    ((v.e) this.f6783z).put(sVar, new i4.f(obj, new n1(), p1Var, q0Var));
                } else {
                    i4.f fVar = (i4.f) ((v.e) this.f6783z).get(j);
                    u1.c.h(fVar);
                    fVar.f6346d = p1Var;
                    fVar.f6347e = q0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(i4.s sVar, int i6, i4.e eVar) {
        synchronized (this.f6781x) {
            try {
                i4.f fVar = (i4.f) ((v.e) this.f6783z).get(sVar);
                if (fVar != null) {
                    q0 q0Var = fVar.f6349g;
                    q0Var.getClass();
                    p4 p4Var = new p4();
                    p4Var.b(q0Var.f11684a);
                    p4Var.a(i6);
                    fVar.f6349g = new q0(p4Var.c());
                    fVar.f6345c.add(eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((v.l) this.f6782y).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    c(arrayList2.get(i6), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public void d(i4.f fVar) {
        i4.b0 b0Var = (i4.b0) ((WeakReference) this.A).get();
        if (b0Var != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                final i4.e eVar = (i4.e) fVar.f6345c.poll();
                if (eVar == null) {
                    fVar.f6348f = false;
                    return;
                }
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                final i4.f fVar2 = fVar;
                u1.a0.U(b0Var.f6311l, new a2.c0(b0Var, j(fVar.f6343a), new Runnable() { // from class: i4.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        eVar.run().a(new c2.a0(ic.s.this, atomicBoolean2, fVar2, atomicBoolean, 1), hb.q.f6029x);
                    }
                }));
                atomicBoolean2.set(false);
                fVar = fVar2;
            }
        }
    }

    public void e(final i4.s sVar) {
        synchronized (this.f6781x) {
            try {
                i4.f fVar = (i4.f) ((v.e) this.f6783z).get(sVar);
                if (fVar == null) {
                    return;
                }
                final q0 q0Var = fVar.f6349g;
                fVar.f6349g = q0.f11682b;
                fVar.f6345c.add(new i4.e(sVar, q0Var) { // from class: i4.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s f6326b;

                    @Override // i4.e
                    public final hb.x run() {
                        b0 b0Var = (b0) ((WeakReference) ic.s.this.A).get();
                        if (b0Var != null) {
                            b0Var.p(this.f6326b);
                        }
                        return hb.u.f6034y;
                    }
                });
                if (fVar.f6348f) {
                    return;
                }
                fVar.f6348f = true;
                d(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public n.e f(n.a aVar) {
        ArrayList arrayList = (ArrayList) this.f6783z;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            n.e eVar = (n.e) arrayList.get(i6);
            if (eVar != null && eVar.f8900b == aVar) {
                return eVar;
            }
        }
        n.e eVar2 = new n.e((Context) this.f6782y, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    @Override // v3.m
    public /* synthetic */ v3.d g(byte[] bArr, int i6, int i10) {
        return h8.c.a(this, bArr, i10);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [c6.h, java.lang.Object] */
    @Override // ge.a
    public Object get() {
        Executor executor = (Executor) ((ge.a) this.f6781x).get();
        n8.d dVar = (n8.d) ((ge.a) this.f6782y).get();
        j1 j1Var = (j1) ((j1) this.f6783z).get();
        o8.c cVar = (o8.c) ((ge.a) this.A).get();
        ?? obj = new Object();
        obj.f1981x = executor;
        obj.f1982y = dVar;
        obj.f1983z = j1Var;
        obj.A = cVar;
        return obj;
    }

    public q0 h(i4.s sVar) {
        synchronized (this.f6781x) {
            try {
                i4.f fVar = (i4.f) ((v.e) this.f6783z).get(sVar);
                if (fVar != null) {
                    return fVar.f6347e;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k0 i() {
        k0 k8;
        synchronized (this.f6781x) {
            k8 = k0.k(((v.e) this.f6782y).values());
        }
        return k8;
    }

    public i4.s j(Object obj) {
        i4.s sVar;
        synchronized (this.f6781x) {
            sVar = (i4.s) ((v.e) this.f6782y).get(obj);
        }
        return sVar;
    }

    public n0 l(i4.s sVar) {
        synchronized (this.f6781x) {
            try {
                return ((i4.f) ((v.e) this.f6783z).get(sVar)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public i4.j1 m(i4.s sVar) {
        synchronized (this.f6781x) {
            try {
                if (((i4.f) ((v.e) this.f6783z).get(sVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public n1 n(i4.s sVar) {
        i4.f fVar;
        synchronized (this.f6781x) {
            fVar = (i4.f) ((v.e) this.f6783z).get(sVar);
        }
        if (fVar != null) {
            return fVar.f6344b;
        }
        return null;
    }

    @Override // v3.m
    public void o(byte[] bArr, int i6, int i10, v3.l lVar, u1.g gVar) {
        c1 c1Var;
        Rect rect;
        u1.t tVar = (u1.t) this.f6781x;
        tVar.I(i6 + i10, bArr);
        tVar.K(i6);
        u1.t tVar2 = (u1.t) this.f6782y;
        d4.a aVar = (d4.a) this.f6783z;
        if (((Inflater) this.A) == null) {
            this.A = new Inflater();
        }
        Inflater inflater = (Inflater) this.A;
        String str = u1.a0.f12750a;
        if (tVar.a() > 0 && tVar.h() == 120 && u1.a0.J(tVar, tVar2, inflater)) {
            tVar.I(tVar2.f12813c, tVar2.f12811a);
        }
        aVar.f3782c = false;
        t1.b bVar = null;
        aVar.f3786g = null;
        aVar.f3787h = -1;
        aVar.f3788i = -1;
        int a10 = tVar.a();
        if (a10 >= 2 && tVar.E() == a10) {
            int[] iArr = aVar.f3783d;
            if (iArr != null && aVar.f3781b) {
                tVar.L(tVar.E() - 2);
                int E = tVar.E();
                int[] iArr2 = aVar.f3780a;
                while (tVar.f12812b < E && tVar.a() > 0) {
                    switch (tVar.y()) {
                        case 3:
                            if (tVar.a() >= 2) {
                                int y9 = tVar.y();
                                int y10 = tVar.y();
                                iArr2[3] = d4.a.a(iArr, y9 >> 4);
                                iArr2[2] = d4.a.a(iArr, y9 & 15);
                                iArr2[1] = d4.a.a(iArr, y10 >> 4);
                                iArr2[0] = d4.a.a(iArr, y10 & 15);
                                aVar.f3782c = true;
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (tVar.a() >= 2 && aVar.f3782c) {
                                int y11 = tVar.y();
                                int y12 = tVar.y();
                                iArr2[3] = d4.a.c(iArr2[3], y11 >> 4);
                                iArr2[2] = d4.a.c(iArr2[2], y11 & 15);
                                iArr2[1] = d4.a.c(iArr2[1], y12 >> 4);
                                iArr2[0] = d4.a.c(iArr2[0], y12 & 15);
                                break;
                            }
                            break;
                        case 5:
                            if (tVar.a() >= 6) {
                                int y13 = tVar.y();
                                int y14 = tVar.y();
                                int i11 = (y13 << 4) | (y14 >> 4);
                                int y15 = ((y14 & 15) << 8) | tVar.y();
                                int y16 = tVar.y();
                                int y17 = tVar.y();
                                aVar.f3786g = new Rect(i11, (y16 << 4) | (y17 >> 4), y15 + 1, (((y17 & 15) << 8) | tVar.y()) + 1);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (tVar.a() >= 4) {
                                aVar.f3787h = tVar.E();
                                aVar.f3788i = tVar.E();
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            if (aVar.f3783d != null && aVar.f3781b && aVar.f3782c && (rect = aVar.f3786g) != null && aVar.f3787h != -1 && aVar.f3788i != -1 && rect.width() >= 2 && aVar.f3786g.height() >= 2) {
                Rect rect2 = aVar.f3786g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                u1.s sVar = new u1.s();
                tVar.K(aVar.f3787h);
                sVar.p(tVar);
                aVar.b(sVar, true, rect2, iArr3);
                tVar.K(aVar.f3788i);
                sVar.p(tVar);
                aVar.b(sVar, false, rect2, iArr3);
                bVar = new t1.b(null, null, null, Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar.f3785f, 0, 0, rect2.left / aVar.f3784e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / aVar.f3784e, rect2.height() / aVar.f3785f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            }
        }
        if (bVar != null) {
            c1Var = k0.o(bVar);
        } else {
            i0 i0Var = k0.f4008y;
            c1Var = c1.B;
        }
        gVar.accept(new v3.a(-9223372036854775807L, 5000000L, c1Var));
    }

    public k1 p(String key, kotlin.jvm.internal.e eVar) {
        k1 viewModel;
        k1 a10;
        kotlin.jvm.internal.k.e(key, "key");
        synchronized (((o5.e0) this.A)) {
            try {
                androidx.lifecycle.p1 p1Var = (androidx.lifecycle.p1) this.f6781x;
                p1Var.getClass();
                viewModel = (k1) p1Var.f983a.get(key);
                if (eVar.d(viewModel)) {
                    androidx.lifecycle.n1 n1Var = (androidx.lifecycle.n1) this.f6782y;
                    if (n1Var instanceof g1) {
                        g1 g1Var = (g1) n1Var;
                        kotlin.jvm.internal.k.b(viewModel);
                        androidx.lifecycle.y yVar = g1Var.f923d;
                        if (yVar != null) {
                            e5.e eVar2 = g1Var.f924e;
                            kotlin.jvm.internal.k.b(eVar2);
                            d1.b(viewModel, eVar2, yVar);
                        }
                    }
                    kotlin.jvm.internal.k.c(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    o1.e eVar3 = new o1.e((o1.c) this.f6783z);
                    eVar3.f9848a.put(o1.f978b, key);
                    androidx.lifecycle.n1 factory = (androidx.lifecycle.n1) this.f6782y;
                    kotlin.jvm.internal.k.e(factory, "factory");
                    try {
                        try {
                            a10 = factory.b(eVar, eVar3);
                        } catch (AbstractMethodError unused) {
                            a10 = factory.c(cf.m.r(eVar), eVar3);
                        }
                    } catch (AbstractMethodError unused2) {
                        a10 = factory.a(cf.m.r(eVar));
                    }
                    viewModel = a10;
                    androidx.lifecycle.p1 p1Var2 = (androidx.lifecycle.p1) this.f6781x;
                    p1Var2.getClass();
                    kotlin.jvm.internal.k.e(viewModel, "viewModel");
                    k1 k1Var = (k1) p1Var2.f983a.put(key, viewModel);
                    if (k1Var != null) {
                        k1Var.c();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }

    public boolean q(Context context) {
        boolean z10;
        if (((Boolean) this.f6783z) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6783z = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f6782y).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f6783z).booleanValue();
    }

    public boolean r(Context context) {
        boolean z10;
        if (((Boolean) this.f6782y) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6782y = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f6782y).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f6782y).booleanValue();
    }

    public boolean s(i4.s sVar) {
        boolean z10;
        synchronized (this.f6781x) {
            if (((v.e) this.f6783z).get(sVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean t(i4.s sVar, int i6) {
        i4.f fVar;
        synchronized (this.f6781x) {
            fVar = (i4.f) ((v.e) this.f6783z).get(sVar);
        }
        i4.b0 b0Var = (i4.b0) ((WeakReference) this.A).get();
        if (fVar != null && fVar.f6347e.a(i6) && b0Var != null && b0Var.f6318t.l().a(i6)) {
            return true;
        }
        return false;
    }

    public boolean u(i4.s sVar, int i6) {
        i4.f fVar;
        boolean z10;
        synchronized (this.f6781x) {
            fVar = (i4.f) ((v.e) this.f6783z).get(sVar);
        }
        if (fVar != null) {
            p1 p1Var = fVar.f6346d;
            p1Var.getClass();
            if (i6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.a("Use contains(Command) for custom command", z10);
            Iterator<E> it = p1Var.f6501a.iterator();
            while (it.hasNext()) {
                if (((i4.o1) it.next()).f6492a == i6) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean v(i4.s sVar, i4.o1 o1Var) {
        i4.f fVar;
        synchronized (this.f6781x) {
            fVar = (i4.f) ((v.e) this.f6783z).get(sVar);
        }
        if (fVar != null) {
            p0 p0Var = fVar.f6346d.f6501a;
            o1Var.getClass();
            if (p0Var.contains(o1Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean w(n.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f6781x).onActionItemClicked(f(aVar), new o.s((Context) this.f6782y, (n0.a) menuItem));
    }

    public boolean x(n.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f6781x;
        n.e f3 = f(aVar);
        v.l lVar = (v.l) this.A;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new o.a0((Context) this.f6782y, (o.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(f3, menu2);
    }

    public void y(i4.s sVar) {
        synchronized (this.f6781x) {
            try {
                i4.f fVar = (i4.f) ((v.e) this.f6783z).remove(sVar);
                if (fVar == null) {
                    return;
                }
                ((v.e) this.f6782y).remove(fVar.f6343a);
                fVar.f6344b.d();
                i4.b0 b0Var = (i4.b0) ((WeakReference) this.A).get();
                if (b0Var != null && !b0Var.j()) {
                    u1.a0.U(b0Var.f6311l, new i4.b(b0Var, sVar, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.google.android.gms.internal.measurement.n z(com.google.android.gms.internal.measurement.n nVar) {
        return ((com.google.android.gms.internal.measurement.t) this.f6782y).c(this, nVar);
    }

    public s(androidx.lifecycle.p1 store, androidx.lifecycle.n1 factory, o1.c defaultExtras) {
        kotlin.jvm.internal.k.e(store, "store");
        kotlin.jvm.internal.k.e(factory, "factory");
        kotlin.jvm.internal.k.e(defaultExtras, "defaultExtras");
        this.f6781x = store;
        this.f6782y = factory;
        this.f6783z = defaultExtras;
        this.A = new Object();
    }

    public s(i4.b0 b0Var) {
        this.f6782y = new v.l(0);
        this.f6783z = new v.l(0);
        this.f6781x = new Object();
        this.A = new WeakReference(b0Var);
    }

    @Override // v3.m
    public /* synthetic */ void reset() {
    }

    public s(Typeface typeface, f1.b bVar) {
        int i6;
        int i10;
        int i11;
        int i12;
        this.A = typeface;
        this.f6781x = bVar;
        this.f6783z = new e1.t(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f4630x;
            i6 = ((ByteBuffer) bVar.A).getInt(((ByteBuffer) bVar.A).getInt(i13) + i13);
        } else {
            i6 = 0;
        }
        this.f6782y = new char[i6 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f4630x;
            i10 = ((ByteBuffer) bVar.A).getInt(((ByteBuffer) bVar.A).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            e1.w wVar = new e1.w(this, i15);
            f1.a b10 = wVar.b();
            int a12 = b10.a(4);
            Character.toChars(a12 != 0 ? ((ByteBuffer) b10.A).getInt(a12 + b10.f4630x) : 0, (char[]) this.f6782y, i15 * 2);
            f1.a b11 = wVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i16 = a13 + b11.f4630x;
                i11 = ((ByteBuffer) b11.A).getInt(((ByteBuffer) b11.A).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            j5.b("invalid metadata codepoint length", i11 > 0);
            e1.t tVar = (e1.t) this.f6783z;
            f1.a b12 = wVar.b();
            int a14 = b12.a(16);
            if (a14 != 0) {
                int i17 = a14 + b12.f4630x;
                i12 = ((ByteBuffer) b12.A).getInt(((ByteBuffer) b12.A).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            tVar.a(wVar, 0, i12 - 1);
        }
    }

    public s(int i6) {
        switch (i6) {
            case 5:
                this.f6781x = new s0.c(10);
                this.f6782y = new v.l(0);
                this.f6783z = new ArrayList();
                this.A = new HashSet();
                return;
            default:
                this.f6781x = null;
                this.f6782y = null;
                this.f6783z = null;
                this.A = new ArrayDeque();
                return;
        }
    }

    public s(c1 c1Var, v1.i iVar, v1.i iVar2, v1.i iVar3) {
        Object obj;
        if (c1Var != null) {
            obj = k0.k(c1Var);
        } else {
            i0 i0Var = k0.f4008y;
            obj = c1.B;
        }
        this.f6781x = obj;
        this.f6782y = iVar;
        this.f6783z = iVar2;
        this.A = iVar3;
    }
}
