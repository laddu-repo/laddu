package q2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {
    public Looper B;
    public r1.d1 C;
    public b2.m D;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f10828x = new ArrayList(1);

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f10829y = new HashSet(1);

    /* renamed from: z, reason: collision with root package name */
    public final b2.k f10830z = new b2.k(new CopyOnWriteArrayList(), 0, (c0) null);
    public final f2.l A = new f2.l(new CopyOnWriteArrayList(), 0, null);

    public boolean a(r1.e0 e0Var) {
        return false;
    }

    public final b2.k b(c0 c0Var) {
        return new b2.k((CopyOnWriteArrayList) this.f10830z.A, 0, c0Var);
    }

    public abstract a0 c(c0 c0Var, u2.e eVar, long j);

    public final void d(d0 d0Var) {
        HashSet hashSet = this.f10829y;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(d0Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(d0 d0Var) {
        this.B.getClass();
        HashSet hashSet = this.f10829y;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(d0Var);
        if (isEmpty) {
            g();
        }
    }

    public r1.d1 h() {
        return null;
    }

    public abstract r1.e0 i();

    public boolean j() {
        return true;
    }

    public abstract void l();

    public final void m(d0 d0Var, w1.a0 a0Var, b2.m mVar) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.B;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.b(z10);
        this.D = mVar;
        r1.d1 d1Var = this.C;
        this.f10828x.add(d0Var);
        if (this.B == null) {
            this.B = myLooper;
            this.f10829y.add(d0Var);
            n(a0Var);
        } else if (d1Var != null) {
            f(d0Var);
            d0Var.a(this, d1Var);
        }
    }

    public abstract void n(w1.a0 a0Var);

    public final void p(r1.d1 d1Var) {
        this.C = d1Var;
        ArrayList arrayList = this.f10828x;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((d0) obj).a(this, d1Var);
        }
    }

    public abstract void q(a0 a0Var);

    public final void r(d0 d0Var) {
        ArrayList arrayList = this.f10828x;
        arrayList.remove(d0Var);
        if (arrayList.isEmpty()) {
            this.B = null;
            this.C = null;
            this.D = null;
            this.f10829y.clear();
            s();
            return;
        }
        d(d0Var);
    }

    public abstract void s();

    public final void t(f2.m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A.f4677c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f2.k kVar = (f2.k) it.next();
            if (kVar.f4674b == mVar) {
                copyOnWriteArrayList.remove(kVar);
            }
        }
    }

    public final void u(i0 i0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f10830z.A;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (h0Var.f10888b == i0Var) {
                copyOnWriteArrayList.remove(h0Var);
            }
        }
    }

    public void e() {
    }

    public void g() {
    }

    public void v(r1.e0 e0Var) {
    }
}
