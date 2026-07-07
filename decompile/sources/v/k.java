package v;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import v6.p;
import w4.n1;
import w4.s0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13165a;

    /* renamed from: b, reason: collision with root package name */
    public int f13166b;

    /* renamed from: c, reason: collision with root package name */
    public int f13167c;

    /* renamed from: d, reason: collision with root package name */
    public int f13168d;

    /* renamed from: e, reason: collision with root package name */
    public int f13169e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13170f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13171g;

    public k(int i6) {
        this.f13165a = 0;
        this.f13166b = i6;
        if (i6 > 0) {
            this.f13170f = new p();
            this.f13171g = new Object();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public void a() {
        View view = (View) ((ArrayList) this.f13170f).get(r0.size() - 1);
        n1 n1Var = (n1) view.getLayoutParams();
        this.f13167c = ((StaggeredGridLayoutManager) this.f13171g).f1152r.d(view);
        n1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f13170f).clear();
        this.f13166b = Integer.MIN_VALUE;
        this.f13167c = Integer.MIN_VALUE;
        this.f13168d = 0;
    }

    public Object c(Object key) {
        kotlin.jvm.internal.k.e(key, "key");
        return null;
    }

    public void d(Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.k.e(key, "key");
        kotlin.jvm.internal.k.e(oldValue, "oldValue");
    }

    public int e() {
        ArrayList arrayList = (ArrayList) this.f13170f;
        if (((StaggeredGridLayoutManager) this.f13171g).f1156w) {
            return g(arrayList.size() - 1, -1);
        }
        return g(0, arrayList.size());
    }

    public int f() {
        ArrayList arrayList = (ArrayList) this.f13170f;
        if (((StaggeredGridLayoutManager) this.f13171g).f1156w) {
            return g(0, arrayList.size());
        }
        return g(arrayList.size() - 1, -1);
    }

    public int g(int i6, int i10) {
        int i11;
        boolean z10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f13171g;
        int m9 = staggeredGridLayoutManager.f1152r.m();
        int i12 = staggeredGridLayoutManager.f1152r.i();
        if (i10 > i6) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        while (i6 != i10) {
            View view = (View) ((ArrayList) this.f13170f).get(i6);
            int g10 = staggeredGridLayoutManager.f1152r.g(view);
            int d10 = staggeredGridLayoutManager.f1152r.d(view);
            boolean z11 = false;
            if (g10 <= i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (d10 >= m9) {
                z11 = true;
            }
            if (z10 && z11 && (g10 < m9 || d10 > i12)) {
                return s0.H(view);
            }
            i6 += i11;
        }
        return -1;
    }

    public Object h(Object key) {
        Object put;
        kotlin.jvm.internal.k.e(key, "key");
        synchronized (((ob.a) this.f13171g)) {
            p pVar = (p) this.f13170f;
            pVar.getClass();
            Object obj = pVar.f13421a.get(key);
            if (obj != null) {
                this.f13168d++;
                return obj;
            }
            this.f13169e++;
            Object c10 = c(key);
            if (c10 == null) {
                return null;
            }
            synchronized (((ob.a) this.f13171g)) {
                p pVar2 = (p) this.f13170f;
                pVar2.getClass();
                put = pVar2.f13421a.put(key, c10);
                if (put != null) {
                    p pVar3 = (p) this.f13170f;
                    pVar3.getClass();
                    pVar3.f13421a.put(key, put);
                } else {
                    this.f13167c += n(key, c10);
                }
            }
            if (put != null) {
                d(key, c10, put);
                return put;
            }
            p(this.f13166b);
            return c10;
        }
    }

    public int i(int i6) {
        int i10 = this.f13167c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (((ArrayList) this.f13170f).size() == 0) {
            return i6;
        }
        a();
        return this.f13167c;
    }

    public View j(int i6, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f13171g;
        ArrayList arrayList = (ArrayList) this.f13170f;
        View view = null;
        if (i10 == -1) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                View view2 = (View) arrayList.get(i11);
                if ((staggeredGridLayoutManager.f1156w && s0.H(view2) <= i6) || ((!staggeredGridLayoutManager.f1156w && s0.H(view2) >= i6) || !view2.hasFocusable())) {
                    break;
                }
                i11++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.f1156w && s0.H(view3) >= i6) || ((!staggeredGridLayoutManager.f1156w && s0.H(view3) <= i6) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public int k(int i6) {
        ArrayList arrayList = (ArrayList) this.f13170f;
        int i10 = this.f13166b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (arrayList.size() == 0) {
            return i6;
        }
        View view = (View) arrayList.get(0);
        n1 n1Var = (n1) view.getLayoutParams();
        this.f13166b = ((StaggeredGridLayoutManager) this.f13171g).f1152r.g(view);
        n1Var.getClass();
        return this.f13166b;
    }

    public Object l(Object key, Object value) {
        Object put;
        kotlin.jvm.internal.k.e(key, "key");
        kotlin.jvm.internal.k.e(value, "value");
        synchronized (((ob.a) this.f13171g)) {
            this.f13167c += n(key, value);
            p pVar = (p) this.f13170f;
            pVar.getClass();
            put = pVar.f13421a.put(key, value);
            if (put != null) {
                this.f13167c -= n(key, put);
            }
        }
        if (put != null) {
            d(key, put, value);
        }
        p(this.f13166b);
        return put;
    }

    public void m(Object key) {
        Object remove;
        kotlin.jvm.internal.k.e(key, "key");
        synchronized (((ob.a) this.f13171g)) {
            p pVar = (p) this.f13170f;
            pVar.getClass();
            remove = pVar.f13421a.remove(key);
            if (remove != null) {
                this.f13167c -= n(key, remove);
            }
        }
        if (remove != null) {
            d(key, remove, null);
        }
    }

    public int n(Object obj, Object obj2) {
        int o10 = o(obj, obj2);
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public int o(Object key, Object value) {
        kotlin.jvm.internal.k.e(key, "key");
        kotlin.jvm.internal.k.e(value, "value");
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0015, B:16:0x001d, B:18:0x0021, B:20:0x002e, B:22:0x0042, B:25:0x0061, B:27:0x0067, B:33:0x004c, B:34:0x0052, B:37:0x005d, B:12:0x0091, B:13:0x0098), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(int r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6.f13171g
            ob.a r0 = (ob.a) r0
            monitor-enter(r0)
            int r1 = r6.f13167c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L91
            java.lang.Object r1 = r6.f13170f     // Catch: java.lang.Throwable -> L1a
            v6.p r1 = (v6.p) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f13421a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            int r1 = r6.f13167c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L91
            goto L1d
        L1a:
            r7 = move-exception
            goto L99
        L1d:
            int r1 = r6.f13167c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r7) goto L8f
            java.lang.Object r1 = r6.f13170f     // Catch: java.lang.Throwable -> L1a
            v6.p r1 = (v6.p) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f13421a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2e
            goto L8f
        L2e:
            java.lang.Object r1 = r6.f13170f     // Catch: java.lang.Throwable -> L1a
            v6.p r1 = (v6.p) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f13421a     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "map.entries"
            kotlin.jvm.internal.k.d(r1, r2)     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            if (r2 == 0) goto L52
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L4c
        L4a:
            r1 = r3
            goto L61
        L4c:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            goto L61
        L52:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L5d
            goto L4a
        L5d:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L1a
        L61:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L67
            monitor-exit(r0)
            return
        L67:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r6.f13170f     // Catch: java.lang.Throwable -> L1a
            v6.p r4 = (v6.p) r4     // Catch: java.lang.Throwable -> L1a
            r4.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "key"
            kotlin.jvm.internal.k.e(r2, r5)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r4 = r4.f13421a     // Catch: java.lang.Throwable -> L1a
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r4 = r6.f13167c     // Catch: java.lang.Throwable -> L1a
            int r5 = r6.n(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r4 = r4 - r5
            r6.f13167c = r4     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r6.d(r2, r1, r3)
            goto L0
        L8f:
            monitor-exit(r0)
            return
        L91:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L99:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k.p(int):void");
    }

    public String toString() {
        int i6;
        String str;
        switch (this.f13165a) {
            case 0:
                synchronized (((ob.a) this.f13171g)) {
                    try {
                        int i10 = this.f13168d;
                        int i11 = this.f13169e + i10;
                        if (i11 != 0) {
                            i6 = (i10 * 100) / i11;
                        } else {
                            i6 = 0;
                        }
                        str = "LruCache[maxSize=" + this.f13166b + ",hits=" + this.f13168d + ",misses=" + this.f13169e + ",hitRate=" + i6 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public k(StaggeredGridLayoutManager staggeredGridLayoutManager, int i6) {
        this.f13165a = 1;
        this.f13171g = staggeredGridLayoutManager;
        this.f13170f = new ArrayList();
        this.f13166b = Integer.MIN_VALUE;
        this.f13167c = Integer.MIN_VALUE;
        this.f13168d = 0;
        this.f13169e = i6;
    }
}
