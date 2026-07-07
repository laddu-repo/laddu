package v8;

import a2.a2;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.h0;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements u8.c, u8.d {

    /* renamed from: f, reason: collision with root package name */
    public final u8.a f13454f;

    /* renamed from: g, reason: collision with root package name */
    public final a f13455g;

    /* renamed from: h, reason: collision with root package name */
    public final s8.l f13456h;

    /* renamed from: k, reason: collision with root package name */
    public final int f13458k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13459l;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f13462o;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f13453e = new LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f13457i = new HashSet();
    public final HashMap j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f13460m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public t8.b f13461n = null;

    public j(d dVar, y8.c cVar) {
        this.f13462o = dVar;
        Looper looper = dVar.J.getLooper();
        Context context = cVar.f15014a;
        n9.j jVar = new n9.j(18);
        Set set = Collections.EMPTY_SET;
        if (((v.f) jVar.f9355y) == null) {
            jVar.f9355y = new v.f(0);
        }
        ((v.f) jVar.f9355y).addAll(set);
        jVar.A = context.getClass().getName();
        jVar.f9356z = context.getPackageName();
        n9.j jVar2 = new n9.j((v.f) jVar.f9355y, (String) jVar.f9356z, (String) jVar.A);
        y8.b bVar = (y8.b) cVar.f15016c.f12251y;
        x.g(bVar);
        w8.o oVar = cVar.f15017d;
        Context context2 = cVar.f15014a;
        bVar.getClass();
        y8.d dVar2 = new y8.d(context2, looper, jVar2, oVar, this, this);
        String str = cVar.f15015b;
        if (str != null) {
            dVar2.s = str;
        }
        this.f13454f = dVar2;
        this.f13455g = cVar.f15018e;
        this.f13456h = new s8.l(10);
        this.f13458k = cVar.f15019f;
    }

    @Override // u8.d
    public final void a(t8.b bVar) {
        n(bVar, null);
    }

    public final void b(t8.b bVar) {
        HashSet hashSet = this.f13457i;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (x.j(bVar, t8.b.B)) {
                    this.f13454f.g();
                }
                throw null;
            }
            throw new ClassCastException();
        }
        hashSet.clear();
    }

    public final void c(Status status) {
        x.c(this.f13462o.J);
        e(status, null, false);
    }

    @Override // u8.c
    public final void d(int i6) {
        Looper myLooper = Looper.myLooper();
        h0 h0Var = this.f13462o.J;
        if (myLooper == h0Var.getLooper()) {
            h(i6);
        } else {
            h0Var.post(new com.google.android.material.datepicker.g(i6, 4, this));
        }
    }

    public final void e(Status status, Exception exc, boolean z10) {
        boolean z11;
        x.c(this.f13462o.J);
        boolean z12 = true;
        if (status != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (exc != null) {
            z12 = false;
        }
        if (z11 != z12) {
            Iterator it = this.f13453e.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (!z10 || mVar.f13465a == 2) {
                    if (status != null) {
                        mVar.c(status);
                    } else {
                        mVar.d(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void f() {
        LinkedList linkedList = this.f13453e;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            m mVar = (m) arrayList.get(i6);
            if (this.f13454f.i()) {
                if (j(mVar)) {
                    linkedList.remove(mVar);
                }
            } else {
                return;
            }
        }
    }

    public final void g() {
        d dVar = this.f13462o;
        x.c(dVar.J);
        this.f13461n = null;
        b(t8.b.B);
        h0 h0Var = dVar.J;
        if (this.f13459l) {
            a aVar = this.f13455g;
            h0Var.removeMessages(11, aVar);
            h0Var.removeMessages(9, aVar);
            this.f13459l = false;
        }
        Iterator it = this.j.values().iterator();
        if (!it.hasNext()) {
            f();
            i();
            return;
        }
        throw r4.a.i(it);
    }

    public final void h(int i6) {
        d dVar = this.f13462o;
        h0 h0Var = dVar.J;
        x.c(dVar.J);
        this.f13461n = null;
        this.f13459l = true;
        String l10 = this.f13454f.l();
        s8.l lVar = this.f13456h;
        lVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i6 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i6 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (l10 != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(l10);
        }
        lVar.B(true, new Status(20, sb2.toString(), null, null));
        a aVar = this.f13455g;
        h0Var.sendMessageDelayed(Message.obtain(h0Var, 9, aVar), ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        h0Var.sendMessageDelayed(Message.obtain(h0Var, 11, aVar), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        ((SparseIntArray) dVar.D.f12251y).clear();
        Iterator it = this.j.values().iterator();
        if (!it.hasNext()) {
        } else {
            throw r4.a.i(it);
        }
    }

    public final void i() {
        d dVar = this.f13462o;
        h0 h0Var = dVar.J;
        a aVar = this.f13455g;
        h0Var.removeMessages(12, aVar);
        h0Var.sendMessageDelayed(h0Var.obtainMessage(12, aVar), dVar.f13447x);
    }

    public final boolean j(m mVar) {
        t8.d dVar;
        if (mVar != null) {
            t8.d[] b10 = mVar.b(this);
            if (b10 != null && b10.length != 0) {
                t8.d[] k8 = this.f13454f.k();
                if (k8 == null) {
                    k8 = new t8.d[0];
                }
                v.l lVar = new v.l(k8.length);
                for (t8.d dVar2 : k8) {
                    lVar.put(dVar2.f12634x, Long.valueOf(dVar2.a()));
                }
                int length = b10.length;
                for (int i6 = 0; i6 < length; i6++) {
                    dVar = b10[i6];
                    Long l10 = (Long) lVar.get(dVar.f12634x);
                    if (l10 == null || l10.longValue() < dVar.a()) {
                        break;
                    }
                }
            }
            dVar = null;
            if (dVar == null) {
                s8.l lVar2 = this.f13456h;
                u8.a aVar = this.f13454f;
                mVar.f(lVar2, aVar.m());
                try {
                    mVar.e(this);
                    return true;
                } catch (DeadObjectException unused) {
                    d(1);
                    aVar.d("DeadObjectException thrown while running ApiCallRunner.");
                    return true;
                }
            }
            Log.w("GoogleApiManager", this.f13454f.getClass().getName() + " could not execute call because it requires feature (" + dVar.f12634x + ", " + dVar.a() + ").");
            if (this.f13462o.K && mVar.a(this)) {
                k kVar = new k(this.f13455g, dVar);
                int indexOf = this.f13460m.indexOf(kVar);
                if (indexOf >= 0) {
                    k kVar2 = (k) this.f13460m.get(indexOf);
                    this.f13462o.J.removeMessages(15, kVar2);
                    h0 h0Var = this.f13462o.J;
                    h0Var.sendMessageDelayed(Message.obtain(h0Var, 15, kVar2), ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
                } else {
                    this.f13460m.add(kVar);
                    h0 h0Var2 = this.f13462o.J;
                    h0Var2.sendMessageDelayed(Message.obtain(h0Var2, 15, kVar), ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
                    h0 h0Var3 = this.f13462o.J;
                    h0Var3.sendMessageDelayed(Message.obtain(h0Var3, 16, kVar), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                    t8.b bVar = new t8.b(2, null);
                    if (!k(bVar)) {
                        this.f13462o.a(bVar, this.f13458k);
                    }
                }
                return false;
            }
            mVar.d(new u8.g(dVar));
            return true;
        }
        s8.l lVar3 = this.f13456h;
        u8.a aVar2 = this.f13454f;
        mVar.f(lVar3, aVar2.m());
        try {
            mVar.e(this);
            return true;
        } catch (DeadObjectException unused2) {
            d(1);
            aVar2.d("DeadObjectException thrown while running ApiCallRunner.");
            return true;
        }
    }

    public final boolean k(t8.b bVar) {
        synchronized (d.N) {
        }
        return false;
    }

    public final void l() {
        d dVar = this.f13462o;
        x.c(dVar.J);
        u8.a aVar = this.f13454f;
        if (!aVar.i() && !aVar.f()) {
            try {
                s8.l lVar = dVar.D;
                Context context = dVar.B;
                SparseIntArray sparseIntArray = (SparseIntArray) lVar.f12251y;
                x.g(context);
                int j = aVar.j();
                int i6 = ((SparseIntArray) lVar.f12251y).get(j, -1);
                if (i6 == -1) {
                    i6 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseIntArray.size()) {
                            int keyAt = sparseIntArray.keyAt(i10);
                            if (keyAt > j && sparseIntArray.get(keyAt) == 0) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            i6 = -1;
                            break;
                        }
                    }
                    if (i6 == -1) {
                        i6 = ((t8.e) lVar.f12252z).b(context, j);
                    }
                    sparseIntArray.put(j, i6);
                }
                if (i6 != 0) {
                    t8.b bVar = new t8.b(i6, null);
                    Log.w("GoogleApiManager", "The service for " + aVar.getClass().getName() + " is not available: " + bVar.toString());
                    n(bVar, null);
                    return;
                }
                q2.p pVar = new q2.p(dVar, aVar, this.f13455g);
                if (!aVar.m()) {
                    try {
                        aVar.a(pVar);
                        return;
                    } catch (SecurityException e10) {
                        n(new t8.b(10), e10);
                        return;
                    }
                }
                x.g(null);
                throw null;
            } catch (IllegalStateException e11) {
                n(new t8.b(10), e11);
            }
        }
    }

    public final void m(m mVar) {
        x.c(this.f13462o.J);
        boolean i6 = this.f13454f.i();
        LinkedList linkedList = this.f13453e;
        if (i6) {
            if (j(mVar)) {
                i();
                return;
            } else {
                linkedList.add(mVar);
                return;
            }
        }
        linkedList.add(mVar);
        t8.b bVar = this.f13461n;
        if (bVar != null && bVar.f12629y != 0 && bVar.f12630z != null) {
            n(bVar, null);
        } else {
            l();
        }
    }

    public final void n(t8.b bVar, RuntimeException runtimeException) {
        x.c(this.f13462o.J);
        x.c(this.f13462o.J);
        this.f13461n = null;
        ((SparseIntArray) this.f13462o.D.f12251y).clear();
        b(bVar);
        if ((this.f13454f instanceof y8.d) && bVar.f12629y != 24) {
            d dVar = this.f13462o;
            dVar.f13448y = true;
            h0 h0Var = dVar.J;
            h0Var.sendMessageDelayed(h0Var.obtainMessage(19), 300000L);
        }
        if (bVar.f12629y == 4) {
            c(d.M);
            return;
        }
        if (this.f13453e.isEmpty()) {
            this.f13461n = bVar;
            return;
        }
        if (runtimeException != null) {
            x.c(this.f13462o.J);
            e(null, runtimeException, false);
            return;
        }
        if (this.f13462o.K) {
            e(d.b(this.f13455g, bVar), null, true);
            if (!this.f13453e.isEmpty() && !k(bVar) && !this.f13462o.a(bVar, this.f13458k)) {
                if (bVar.f12629y == 18) {
                    this.f13459l = true;
                }
                if (this.f13459l) {
                    d dVar2 = this.f13462o;
                    a aVar = this.f13455g;
                    h0 h0Var2 = dVar2.J;
                    h0Var2.sendMessageDelayed(Message.obtain(h0Var2, 9, aVar), ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
                    return;
                }
                c(d.b(this.f13455g, bVar));
                return;
            }
            return;
        }
        c(d.b(this.f13455g, bVar));
    }

    public final void o() {
        x.c(this.f13462o.J);
        Status status = d.L;
        c(status);
        this.f13456h.B(false, status);
        for (f fVar : (f[]) this.j.keySet().toArray(new f[0])) {
            m(new r(new s9.h()));
        }
        b(new t8.b(4));
        u8.a aVar = this.f13454f;
        if (aVar.i()) {
            aVar.b(new a2(this, 27));
        }
    }

    @Override // u8.c
    public final void onConnected() {
        Looper myLooper = Looper.myLooper();
        h0 h0Var = this.f13462o.J;
        if (myLooper == h0Var.getLooper()) {
            g();
        } else {
            h0Var.post(new a1.e(this, 29));
        }
    }
}
