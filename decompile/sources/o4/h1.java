package o4;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9749e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f9750g;

    public h1(int i) {
        this.f9745a = 1;
        this.f9746b = i;
        if (i <= 0) {
            w.a.c("maxSize <= 0");
            throw null;
        }
        this.f = new k4(25, false);
        this.f9750g = new w.b();
    }

    public static void m(Object obj, Object obj2) {
        de.i.e(obj, "key");
        de.i.e(obj2, "value");
    }

    public void a() {
        View view = (View) ((ArrayList) this.f).get(r0.size() - 1);
        e1 e1Var = (e1) view.getLayoutParams();
        this.f9747c = ((StaggeredGridLayoutManager) this.f9750g).f1404r.d(view);
        e1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.f9746b = Integer.MIN_VALUE;
        this.f9747c = Integer.MIN_VALUE;
        this.f9748d = 0;
    }

    public Object c(Object obj) {
        de.i.e(obj, "key");
        return null;
    }

    public void d(boolean z2, Object obj, Object obj2, Object obj3) {
        de.i.e(obj, "key");
        de.i.e(obj2, "oldValue");
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.f9750g).f1409w ? g(r0.size() - 1, -1) : g(0, ((ArrayList) this.f).size());
    }

    public int f() {
        return ((StaggeredGridLayoutManager) this.f9750g).f1409w ? g(0, ((ArrayList) this.f).size()) : g(r0.size() - 1, -1);
    }

    public int g(int i, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f9750g;
        int iM = staggeredGridLayoutManager.f1404r.m();
        int i11 = staggeredGridLayoutManager.f1404r.i();
        int i12 = i10 > i ? 1 : -1;
        while (i != i10) {
            View view = (View) ((ArrayList) this.f).get(i);
            int iG = staggeredGridLayoutManager.f1404r.g(view);
            int iD = staggeredGridLayoutManager.f1404r.d(view);
            boolean z2 = iG <= i11;
            boolean z10 = iD >= iM;
            if (z2 && z10 && (iG < iM || iD > i11)) {
                return j0.G(view);
            }
            i += i12;
        }
        return -1;
    }

    public Object h(Object obj) {
        Object objPut;
        de.i.e(obj, "key");
        synchronized (((w.b) this.f9750g)) {
            k4 k4Var = (k4) this.f;
            k4Var.getClass();
            Object obj2 = ((LinkedHashMap) k4Var.f7607v).get(obj);
            if (obj2 != null) {
                this.f9748d++;
                return obj2;
            }
            this.f9749e++;
            Object objC = c(obj);
            if (objC == null) {
                return null;
            }
            synchronized (((w.b) this.f9750g)) {
                k4 k4Var2 = (k4) this.f;
                k4Var2.getClass();
                objPut = ((LinkedHashMap) k4Var2.f7607v).put(obj, objC);
                if (objPut != null) {
                    k4 k4Var3 = (k4) this.f;
                    k4Var3.getClass();
                    ((LinkedHashMap) k4Var3.f7607v).put(obj, objPut);
                } else {
                    int i = this.f9747c;
                    m(obj, objC);
                    this.f9747c = i + 1;
                }
            }
            if (objPut != null) {
                d(false, obj, objC, objPut);
                return objPut;
            }
            n(this.f9746b);
            return objC;
        }
    }

    public int i(int i) {
        int i10 = this.f9747c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.f9747c;
    }

    public View j(int i, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f9750g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1409w && j0.G(view2) >= i) || ((!staggeredGridLayoutManager.f1409w && j0.G(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            View view3 = (View) arrayList.get(i11);
            if ((staggeredGridLayoutManager.f1409w && j0.G(view3) <= i) || ((!staggeredGridLayoutManager.f1409w && j0.G(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i11++;
            view = view3;
        }
        return view;
    }

    public int k(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int i10 = this.f9746b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        e1 e1Var = (e1) view.getLayoutParams();
        this.f9746b = ((StaggeredGridLayoutManager) this.f9750g).f1404r.g(view);
        e1Var.getClass();
        return this.f9746b;
    }

    public Object l(Object obj, Object obj2) {
        Object objPut;
        de.i.e(obj, "key");
        de.i.e(obj2, "value");
        synchronized (((w.b) this.f9750g)) {
            int i = this.f9747c;
            m(obj, obj2);
            this.f9747c = i + 1;
            k4 k4Var = (k4) this.f;
            k4Var.getClass();
            objPut = ((LinkedHashMap) k4Var.f7607v).put(obj, obj2);
            if (objPut != null) {
                int i10 = this.f9747c;
                m(obj, objPut);
                this.f9747c = i10 - 1;
            }
        }
        if (objPut != null) {
            d(false, obj, objPut, obj2);
        }
        n(this.f9746b);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(int r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6.f9750g
            w.b r0 = (w.b) r0
            monitor-enter(r0)
            int r1 = r6.f9747c     // Catch: java.lang.Throwable -> L1c
            if (r1 < 0) goto L99
            java.lang.Object r1 = r6.f     // Catch: java.lang.Throwable -> L1c
            k8.k4 r1 = (k8.k4) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f7607v     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1f
            int r1 = r6.f9747c     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L99
            goto L1f
        L1c:
            r7 = move-exception
            goto La1
        L1f:
            int r1 = r6.f9747c     // Catch: java.lang.Throwable -> L1c
            if (r1 <= r7) goto L97
            java.lang.Object r1 = r6.f     // Catch: java.lang.Throwable -> L1c
            k8.k4 r1 = (k8.k4) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f7607v     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L32
            goto L97
        L32:
            java.lang.Object r1 = r6.f     // Catch: java.lang.Throwable -> L1c
            k8.k4 r1 = (k8.k4) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f7607v     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "<get-entries>(...)"
            de.i.d(r1, r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            if (r2 == 0) goto L58
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L52
        L50:
            r1 = r3
            goto L67
        L52:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1c
            goto L67
        L58:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L63
            goto L50
        L63:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L1c
        L67:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L6d
            monitor-exit(r0)
            return
        L6d:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r6.f     // Catch: java.lang.Throwable -> L1c
            k8.k4 r4 = (k8.k4) r4     // Catch: java.lang.Throwable -> L1c
            r4.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "key"
            de.i.e(r2, r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r4.f7607v     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L1c
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1c
            int r4 = r6.f9747c     // Catch: java.lang.Throwable -> L1c
            m(r2, r1)     // Catch: java.lang.Throwable -> L1c
            r5 = 1
            int r4 = r4 - r5
            r6.f9747c = r4     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            r6.d(r5, r2, r1, r3)
            goto L0
        L97:
            monitor-exit(r0)
            return
        L99:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        La1:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.h1.n(int):void");
    }

    public String toString() {
        String str;
        switch (this.f9745a) {
            case 1:
                synchronized (((w.b) this.f9750g)) {
                    try {
                        int i = this.f9748d;
                        int i10 = this.f9749e + i;
                        str = "LruCache[maxSize=" + this.f9746b + ",hits=" + this.f9748d + ",misses=" + this.f9749e + ",hitRate=" + (i10 != 0 ? (i * 100) / i10 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public h1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f9745a = 0;
        this.f9750g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.f9746b = Integer.MIN_VALUE;
        this.f9747c = Integer.MIN_VALUE;
        this.f9748d = 0;
        this.f9749e = i;
    }
}
