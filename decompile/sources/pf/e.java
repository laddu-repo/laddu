package pf;

import gf.l2;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
import mf.u;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements gf.i, f, l2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* renamed from: x, reason: collision with root package name */
    public final le.h f10770x;

    /* renamed from: z, reason: collision with root package name */
    public Object f10772z;
    private volatile /* synthetic */ Object state$volatile = h.f10774a;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f10771y = new ArrayList(2);
    public int A = -1;
    public Object B = h.f10777d;

    public e(le.h hVar) {
        this.f10770x = hVar;
    }

    @Override // gf.i
    public final void a(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f10775b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h.f10776c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f10771y;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj2 = arrayList.get(i6);
                i6++;
                ((c) obj2).b();
            }
            this.B = h.f10777d;
            this.f10771y = null;
            return;
        }
    }

    @Override // gf.l2
    public final void b(u uVar, int i6) {
        this.f10772z = uVar;
        this.A = i6;
    }

    public final Object c(ne.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
        Object obj = atomicReferenceFieldUpdater.get(this);
        k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar2 = (c) obj;
        Object obj2 = this.B;
        ArrayList arrayList = this.f10771y;
        if (arrayList != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList.get(i6);
                i6++;
                c cVar3 = (c) obj3;
                if (cVar3 != cVar2) {
                    cVar3.b();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.f10775b);
            this.B = h.f10777d;
            this.f10771y = null;
        }
        Object invoke = cVar2.f10760c.invoke(cVar2.f10758a, cVar2.f10761d, obj2);
        he.c cVar4 = cVar2.f10762e;
        if (cVar2.f10761d == h.f10778e) {
            return ((l) cVar4).invoke(cVar);
        }
        return ((p) cVar4).invoke(invoke, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ne.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof pf.d
            if (r0 == 0) goto L13
            r0 = r11
            pf.d r0 = (pf.d) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            pf.d r0 = new pf.d
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f10768y
            int r1 = r0.A
            me.a r2 = me.a.f8833x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2b
            he.a.f(r11)
            return r11
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            pf.e r1 = r0.f10767x
            he.a.f(r11)
            goto Lb5
        L3a:
            he.a.f(r11)
            r0.f10767x = r10
            r0.A = r5
            gf.k r11 = new gf.k
            le.c r1 = a8.c.i(r0)
            r11.<init>(r5, r1)
            r11.s()
        L4d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = pf.e.C
            java.lang.Object r6 = r1.get(r10)
            he.y r7 = he.y.f6101a
            h5.a r8 = pf.h.f10774a
            if (r6 != r8) goto L6a
        L59:
            boolean r8 = r1.compareAndSet(r10, r6, r11)
            if (r8 == 0) goto L63
            r11.v(r10)
            goto Laa
        L63:
            java.lang.Object r8 = r1.get(r10)
            if (r8 == r6) goto L59
            goto L4d
        L6a:
            boolean r9 = r6 instanceof java.util.List
            if (r9 == 0) goto L9b
        L6e:
            boolean r7 = r1.compareAndSet(r10, r6, r8)
            if (r7 == 0) goto L94
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r1 = r6.iterator()
        L7a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r1.next()
            pf.c r6 = r10.e(r6)
            kotlin.jvm.internal.k.b(r6)
            r6.f10764g = r3
            r7 = -1
            r6.f10765h = r7
            r10.f(r6, r5)
            goto L7a
        L94:
            java.lang.Object r7 = r1.get(r10)
            if (r7 == r6) goto L6e
            goto L4d
        L9b:
            boolean r1 = r6 instanceof pf.c
            if (r1 == 0) goto Lc1
            pf.c r6 = (pf.c) r6
            java.lang.Object r1 = r10.B
            ve.l r1 = r6.a(r10, r1)
            r11.e(r1, r7)
        Laa:
            java.lang.Object r11 = r11.r()
            if (r11 != r2) goto Lb1
            r7 = r11
        Lb1:
            if (r7 != r2) goto Lb4
            goto Lbf
        Lb4:
            r1 = r10
        Lb5:
            r0.f10767x = r3
            r0.A = r4
            java.lang.Object r11 = r1.c(r0)
            if (r11 != r2) goto Lc0
        Lbf:
            return r2
        Lc0:
            return r11
        Lc1:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.e.d(ne.c):java.lang.Object");
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.f10771y;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            Object obj3 = arrayList.get(i6);
            i6++;
            if (((c) obj3).f10758a == obj) {
                obj2 = obj3;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z10) {
        Object obj = cVar.f10758a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z10) {
            ArrayList arrayList = this.f10771y;
            k.b(arrayList);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    if (((c) obj2).f10758a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        cVar.f10759b.invoke(obj, this, cVar.f10761d);
        if (this.B == h.f10777d) {
            if (!z10) {
                ArrayList arrayList2 = this.f10771y;
                k.b(arrayList2);
                arrayList2.add(cVar);
            }
            cVar.f10764g = this.f10772z;
            cVar.f10765h = this.A;
            this.f10772z = null;
            this.A = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, cVar);
    }

    public final boolean g(Object obj, Object obj2) {
        if (h(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = pf.e.C
            java.lang.Object r1 = r0.get(r7)
            boolean r2 = r1 instanceof gf.j
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L39
            pf.c r2 = r7.e(r8)
            if (r2 != 0) goto L13
            goto L0
        L13:
            ve.l r5 = r2.a(r7, r9)
        L17:
            boolean r6 = r0.compareAndSet(r7, r1, r2)
            if (r6 == 0) goto L32
            gf.j r1 = (gf.j) r1
            r7.B = r9
            he.y r8 = he.y.f6101a
            h5.a r8 = r1.a(r5, r8)
            if (r8 != 0) goto L2e
            h5.a r8 = pf.h.f10777d
            r7.B = r8
            return r3
        L2e:
            r1.j(r8)
            return r4
        L32:
            java.lang.Object r6 = r0.get(r7)
            if (r6 == r1) goto L17
            goto L0
        L39:
            h5.a r2 = pf.h.f10775b
            boolean r2 = kotlin.jvm.internal.k.a(r1, r2)
            r5 = 1
            if (r2 == 0) goto L44
            r2 = 1
            goto L46
        L44:
            boolean r2 = r1 instanceof pf.c
        L46:
            if (r2 == 0) goto L4a
            r8 = 3
            return r8
        L4a:
            h5.a r2 = pf.h.f10776c
            boolean r2 = kotlin.jvm.internal.k.a(r1, r2)
            if (r2 == 0) goto L53
            return r3
        L53:
            h5.a r2 = pf.h.f10774a
            boolean r2 = kotlin.jvm.internal.k.a(r1, r2)
            if (r2 == 0) goto L70
            java.util.List r2 = a8.g.m(r8)
        L5f:
            boolean r3 = r0.compareAndSet(r7, r1, r2)
            if (r3 == 0) goto L67
            r4 = 1
            goto L6d
        L67:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r1) goto L5f
        L6d:
            if (r4 == 0) goto L0
            goto L8b
        L70:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L8c
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.ArrayList r2 = ie.j.Q(r2, r8)
        L7b:
            boolean r3 = r0.compareAndSet(r7, r1, r2)
            if (r3 == 0) goto L83
            r4 = 1
            goto L89
        L83:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r1) goto L7b
        L89:
            if (r4 == 0) goto L0
        L8b:
            return r5
        L8c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected state: "
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.e.h(java.lang.Object, java.lang.Object):int");
    }
}
