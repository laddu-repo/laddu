package s7;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.ab;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.le;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.va;
import com.google.android.gms.internal.measurement.wa;
import com.google.android.gms.internal.measurement.ya;
import com.google.android.gms.internal.measurement.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import k8.g2;
import t7.g0;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements r7.g, r7.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r7.c f11521e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2.c f11522g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f11525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11526l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f11529o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList f11520d = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f11523h = new HashSet();
    public final HashMap i = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f11527m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q7.b f11528n = null;

    /* JADX WARN: Multi-variable type inference failed */
    public j(d dVar, r7.f fVar) {
        this.f11529o = dVar;
        Looper looper = dVar.H.getLooper();
        hd.a aVarA = fVar.a();
        mb mbVar = new mb((v.f) aVarA.f6279w, (String) aVarA.f6280x, (String) aVarA.f6281y);
        com.bumptech.glide.f fVar2 = (com.bumptech.glide.f) fVar.f11349d.f10196w;
        y.g(fVar2);
        r7.c cVarB = fVar2.b(fVar.f11346a, looper, mbVar, fVar.f11350e, this, this);
        z7.a aVar = fVar.f11348c;
        if (aVar == null || !(cVarB instanceof t7.e)) {
            String str = fVar.f11347b;
            if (str != null && (cVarB instanceof t7.e)) {
                ((t7.e) cVarB).f12330s = str;
            }
        } else {
            ((t7.e) cVarB).f12331t = aVar;
        }
        this.f11521e = cVarB;
        this.f = fVar.f;
        this.f11522g = new p2.c(9);
        this.f11524j = fVar.f11352h;
        if (!cVarB.b()) {
            this.f11525k = null;
            return;
        }
        Context context = dVar.f11516z;
        t6 t6Var = dVar.H;
        hd.a aVarA2 = fVar.a();
        this.f11525k = new r(context, t6Var, new mb((v.f) aVarA2.f6279w, (String) aVarA2.f6280x, (String) aVarA2.f6281y));
    }

    public final void a() {
        Object obj = this.f11521e;
        d dVar = this.f11529o;
        y.c(dVar.H);
        this.f11528n = null;
        l(q7.b.A);
        if (this.f11526l) {
            t6 t6Var = dVar.H;
            a aVar = this.f;
            t6Var.removeMessages(11, aVar);
            dVar.H.removeMessages(9, aVar);
            this.f11526l = false;
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            c2.b bVar = ((q) it.next()).f11539a;
            if (m((q7.d[]) bVar.f1687x) != null) {
                it.remove();
            } else {
                try {
                    new o8.o();
                    a7.j jVar = (a7.j) ((le) bVar.f1688y).f2863b;
                    jVar.getClass();
                    za zaVar = (za) ((ab) obj).m();
                    wa waVar = new wa((ya) jVar.f203x, (q7.h) jVar.f204y);
                    String str = (String) jVar.f202w;
                    Parcel parcelF = zaVar.f();
                    parcelF.writeString(str);
                    l6.c(parcelF, waVar);
                    zaVar.I(parcelF, 28);
                } catch (DeadObjectException unused) {
                    e(3);
                    ((t7.e) obj).f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e7) {
                    e = e7;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e10) {
                    e = e10;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        k();
    }

    public final void b(int i) {
        y.c(this.f11529o.H);
        this.f11528n = null;
        this.f11526l = true;
        String str = ((t7.e) this.f11521e).f12314a;
        p2.c cVar = this.f11522g;
        cVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        cVar.s(true, new Status(20, sb2.toString(), null, null));
        a aVar = this.f;
        d dVar = this.f11529o;
        t6 t6Var = dVar.H;
        t6Var.sendMessageDelayed(Message.obtain(t6Var, 9, aVar), 5000L);
        t6 t6Var2 = dVar.H;
        t6Var2.sendMessageDelayed(Message.obtain(t6Var2, 11, aVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) dVar.B.f10105w;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((q) it.next()).getClass();
        }
    }

    @Override // r7.h
    public final void c(q7.b bVar) {
        o(bVar, null);
    }

    public final boolean d(q7.b bVar) {
        synchronized (d.L) {
            this.f11529o.getClass();
        }
        return false;
    }

    @Override // r7.g
    public final void e(int i) {
        d dVar = this.f11529o;
        if (Looper.myLooper() == dVar.H.getLooper()) {
            b(i);
        } else {
            dVar.H.post(new androidx.emoji2.text.k(i, 3, this));
        }
    }

    @Override // r7.g
    public final void f() {
        d dVar = this.f11529o;
        if (Looper.myLooper() == dVar.H.getLooper()) {
            a();
        } else {
            dVar.H.post(new androidx.fragment.app.m(26, this));
        }
    }

    public final void g() {
        LinkedList linkedList = this.f11520d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList.get(i);
            if (!((t7.e) this.f11521e).q()) {
                return;
            }
            if (h(oVar)) {
                linkedList.remove(oVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(o oVar) {
        if (oVar == null) {
            p2.c cVar = this.f11522g;
            r7.c cVar2 = this.f11521e;
            oVar.f(cVar, cVar2.b());
            try {
                oVar.g(this);
                return true;
            } catch (DeadObjectException unused) {
                e(1);
                ((t7.e) cVar2).f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        q7.d dVarM = m(oVar.a(this));
        if (dVarM == null) {
            p2.c cVar3 = this.f11522g;
            r7.c cVar4 = this.f11521e;
            oVar.f(cVar3, cVar4.b());
            try {
                oVar.g(this);
                return true;
            } catch (DeadObjectException unused2) {
                e(1);
                ((t7.e) cVar4).f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f11521e.getClass().getName();
        String str = dVarM.f10901v;
        long jA = dVarM.a();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jA).length() + 2);
        j4.a.s(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(jA);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        d dVar = this.f11529o;
        if (!dVar.I || !oVar.b(this)) {
            oVar.e(new r7.k(dVarM));
            return true;
        }
        int iC = oVar.c(this);
        k kVar = new k(this.f, dVarM);
        ArrayList arrayList = this.f11527m;
        int iIndexOf = arrayList.indexOf(kVar);
        if (iIndexOf >= 0) {
            k kVar2 = (k) arrayList.get(iIndexOf);
            dVar.H.removeMessages(15, kVar2);
            dVar.H.sendMessageDelayed(Message.obtain(dVar.H, 15, kVar2), 5000L);
            return false;
        }
        arrayList.add(kVar);
        dVar.H.sendMessageDelayed(Message.obtain(dVar.H, 15, kVar), 5000L);
        dVar.H.sendMessageDelayed(Message.obtain(dVar.H, 16, kVar), 120000L);
        q7.b bVar = new q7.b(1, 2, null, null, Integer.valueOf(iC));
        if (d(bVar)) {
            String str2 = dVarM.f10901v;
            long jA2 = dVarM.a();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jA2).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(str2);
            sb3.append(", version: ");
            sb3.append(jA2);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        if (!dVar.e(bVar, this.f11524j)) {
            return false;
        }
        String str3 = dVarM.f10901v;
        long jA3 = dVarM.a();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jA3).length());
        sb4.append("Notification displayed for missing feature: ");
        sb4.append(str3);
        sb4.append(", version: ");
        sb4.append(jA3);
        Log.w("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void i(Status status, Exception exc, boolean z2) {
        y.c(this.f11529o.H);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f11520d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (!z2 || oVar.f11535a == 2) {
                if (status != null) {
                    oVar.d(status);
                } else {
                    oVar.e(exc);
                }
                it.remove();
            }
        }
    }

    public final void j(Status status) {
        y.c(this.f11529o.H);
        i(status, null, false);
    }

    public final void k() {
        d dVar = this.f11529o;
        t6 t6Var = dVar.H;
        a aVar = this.f;
        t6Var.removeMessages(12, aVar);
        t6 t6Var2 = dVar.H;
        t6Var2.sendMessageDelayed(t6Var2.obtainMessage(12, aVar), dVar.f11512v);
    }

    public final void l(q7.b bVar) {
        HashSet hashSet = this.f11523h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (y.j(bVar, q7.b.A)) {
            t7.e eVar = (t7.e) this.f11521e;
            if (!eVar.q() || eVar.f12315b == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final q7.d m(q7.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            g0 g0Var = ((t7.e) this.f11521e).f12334w;
            q7.d[] dVarArr2 = g0Var == null ? null : g0Var.f12350w;
            if (dVarArr2 == null) {
                dVarArr2 = new q7.d[0];
            }
            v.e eVar = new v.e(dVarArr2.length);
            for (q7.d dVar : dVarArr2) {
                eVar.put(dVar.f10901v, Long.valueOf(dVar.a()));
            }
            for (q7.d dVar2 : dVarArr) {
                Long l10 = (Long) eVar.get(dVar2.f10901v);
                if (l10 == null || l10.longValue() < dVar2.a()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void n(q7.b bVar) {
        y.c(this.f11529o.H);
        Object obj = this.f11521e;
        String name = obj.getClass().getName();
        String strValueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(strValueOf);
        ((t7.e) obj).f(sb2.toString());
        o(bVar, null);
    }

    public final void o(q7.b bVar, RuntimeException runtimeException) {
        m8.a aVar;
        d dVar = this.f11529o;
        y.c(dVar.H);
        r rVar = this.f11525k;
        if (rVar != null && (aVar = rVar.f11545j) != null) {
            aVar.e();
        }
        y.c(this.f11529o.H);
        this.f11528n = null;
        SparseIntArray sparseIntArray = (SparseIntArray) dVar.B.f10105w;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(bVar);
        if ((this.f11521e instanceof v7.e) && bVar.f10894w != 24) {
            dVar.f11513w = true;
            t6 t6Var = dVar.H;
            t6Var.sendMessageDelayed(t6Var.obtainMessage(19), 300000L);
        }
        int i = bVar.f10894w;
        if (i == 4) {
            j(d.K);
            return;
        }
        if (i == 25) {
            j(d.b(this.f, bVar));
            return;
        }
        LinkedList linkedList = this.f11520d;
        if (linkedList.isEmpty()) {
            this.f11528n = bVar;
            return;
        }
        if (runtimeException != null) {
            y.c(dVar.H);
            i(null, runtimeException, false);
            return;
        }
        if (!dVar.I) {
            j(d.b(this.f, bVar));
            return;
        }
        a aVar2 = this.f;
        i(d.b(aVar2, bVar), null, true);
        if (linkedList.isEmpty() || d(bVar) || dVar.e(bVar, this.f11524j)) {
            return;
        }
        if (bVar.f10894w == 18) {
            this.f11526l = true;
        }
        if (!this.f11526l) {
            j(d.b(aVar2, bVar));
        } else {
            t6 t6Var2 = dVar.H;
            t6Var2.sendMessageDelayed(Message.obtain(t6Var2, 9, aVar2), 5000L);
        }
    }

    public final void p(o oVar) {
        y.c(this.f11529o.H);
        boolean zQ = ((t7.e) this.f11521e).q();
        LinkedList linkedList = this.f11520d;
        if (zQ) {
            if (h(oVar)) {
                k();
                return;
            } else {
                linkedList.add(oVar);
                return;
            }
        }
        linkedList.add(oVar);
        q7.b bVar = this.f11528n;
        if (bVar == null || bVar.f10894w == 0 || bVar.f10895x == null) {
            r();
        } else {
            o(bVar, null);
        }
    }

    public final void q() {
        d dVar = this.f11529o;
        y.c(dVar.H);
        Status status = d.J;
        j(status);
        this.f11522g.s(false, status);
        for (f fVar : (f[]) this.i.keySet().toArray(new f[0])) {
            p(new s(fVar, new o8.h()));
        }
        l(new q7.b(4, null, null));
        if (((t7.e) this.f11521e).q()) {
            dVar.H.post(new androidx.fragment.app.m(27, new ka.c(this)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        d dVar = this.f11529o;
        y.c(dVar.H);
        r7.c cVar = this.f11521e;
        t7.e eVar = (t7.e) cVar;
        if (eVar.q() || eVar.r()) {
            return;
        }
        try {
            int iL = dVar.B.l(dVar.f11516z, cVar);
            if (iL != 0) {
                q7.b bVar = new q7.b(iL, null, null);
                String name = cVar.getClass().getName();
                String string = bVar.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + string.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(string);
                Log.w("GoogleApiManager", sb2.toString());
                o(bVar, null);
                return;
            }
            o2.p pVar = new o2.p();
            Objects.requireNonNull(dVar);
            pVar.A = dVar;
            pVar.f9505y = null;
            pVar.f9506z = null;
            pVar.f9502v = false;
            pVar.f9503w = cVar;
            pVar.f9504x = this.f;
            if (cVar.b()) {
                r rVar = this.f11525k;
                y.g(rVar);
                m8.a aVar = rVar.f11545j;
                if (aVar != null) {
                    aVar.e();
                }
                mb mbVar = rVar.i;
                mbVar.f2892g = Integer.valueOf(System.identityHashCode(rVar));
                va vaVar = rVar.f11543g;
                Context context = rVar.f11542e;
                Handler handler = rVar.f;
                rVar.f11545j = (m8.a) vaVar.b(context, handler.getLooper(), mbVar, (l8.a) mbVar.f, rVar, rVar);
                rVar.f11546k = pVar;
                Set set = rVar.f11544h;
                if (set == null || set.isEmpty()) {
                    handler.post(new androidx.fragment.app.m(rVar));
                } else {
                    m8.a aVar2 = rVar.f11545j;
                    aVar2.getClass();
                    aVar2.f12321j = new g2(aVar2);
                    aVar2.u(2, null);
                }
            }
            try {
                eVar.f12321j = pVar;
                eVar.u(2, null);
            } catch (SecurityException e7) {
                o(new q7.b(10, null, null), e7);
            }
        } catch (IllegalStateException e10) {
            o(new q7.b(10, null, null), e10);
        }
    }
}
