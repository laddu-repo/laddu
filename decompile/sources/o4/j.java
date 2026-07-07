package o4;

import a2.b0;
import a2.n0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import l4.u;
import p.d3;
import p.n1;
import p.t;
import t0.h0;
import t0.q0;
import u1.a0;
import u1.v;
import u1.x;
import v1.r;
import v1.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f9924a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9925b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9926c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9927d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9928e;

    /* renamed from: f, reason: collision with root package name */
    public Object f9929f;

    public j(u uVar) {
        this.f9925b = uVar;
        this.f9928e = new ArrayList();
        this.f9929f = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r9 < r2.f13254y) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r9, u1.t r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f9927d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r8.f9928e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            int r2 = r8.f9924a
            if (r2 == 0) goto L9e
            r3 = -1
            if (r2 == r3) goto L27
            int r2 = r1.size()
            int r4 = r8.f9924a
            if (r2 < r4) goto L27
            java.lang.Object r2 = r1.peek()
            v1.r r2 = (v1.r) r2
            java.lang.String r4 = u1.a0.f12750a
            long r4 = r2.f13254y
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L27
            goto L9e
        L27:
            java.lang.Object r2 = r8.f9926c
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L37
            u1.t r2 = new u1.t
            r2.<init>()
            goto L3d
        L37:
            java.lang.Object r2 = r2.pop()
            u1.t r2 = (u1.t) r2
        L3d:
            int r4 = r11.a()
            r2.H(r4)
            byte[] r4 = r11.f12811a
            int r11 = r11.f12812b
            byte[] r5 = r2.f12811a
            int r6 = r2.a()
            r7 = 0
            java.lang.System.arraycopy(r4, r11, r5, r7, r6)
            java.lang.Object r11 = r8.f9929f
            v1.r r11 = (v1.r) r11
            if (r11 == 0) goto L64
            long r4 = r11.f13254y
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 != 0) goto L64
            java.util.ArrayList r9 = r11.f13253x
            r9.add(r2)
            return
        L64:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L70
            v1.r r11 = new v1.r
            r11.<init>()
            goto L76
        L70:
            java.lang.Object r11 = r0.pop()
            v1.r r11 = (v1.r) r11
        L76:
            java.util.ArrayList r0 = r11.f13253x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L82
            r7 = 1
        L82:
            u1.c.b(r7)
            boolean r4 = r0.isEmpty()
            u1.c.g(r4)
            r11.f13254y = r9
            r0.add(r2)
            r1.add(r11)
            r8.f9929f = r11
            int r9 = r8.f9924a
            if (r9 == r3) goto L9d
            r8.i(r9)
        L9d:
            return
        L9e:
            java.lang.Object r0 = r8.f9925b
            v1.s r0 = (v1.s) r0
            r0.e(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.j.a(long, u1.t):void");
    }

    public void b() {
        View view = (View) this.f9925b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 <= 21 ? i6 == 21 : ((d3) this.f9927d) != null) {
                if (((d3) this.f9929f) == null) {
                    this.f9929f = new Object();
                }
                d3 d3Var = (d3) this.f9929f;
                d3Var.f10230a = null;
                d3Var.f10233d = false;
                d3Var.f10231b = null;
                d3Var.f10232c = false;
                WeakHashMap weakHashMap = q0.f12397a;
                ColorStateList c10 = h0.c(view);
                if (c10 != null) {
                    d3Var.f10233d = true;
                    d3Var.f10230a = c10;
                }
                PorterDuff.Mode d10 = h0.d(view);
                if (d10 != null) {
                    d3Var.f10232c = true;
                    d3Var.f10231b = d10;
                }
                if (d3Var.f10233d || d3Var.f10232c) {
                    t.e(background, d3Var, view.getDrawableState());
                    return;
                }
            }
            d3 d3Var2 = (d3) this.f9928e;
            if (d3Var2 != null) {
                t.e(background, d3Var2, view.getDrawableState());
                return;
            }
            d3 d3Var3 = (d3) this.f9927d;
            if (d3Var3 != null) {
                t.e(background, d3Var3, view.getDrawableState());
            }
        }
    }

    public boolean c(int i6) {
        ArrayList arrayList = (ArrayList) this.f9926c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w4.a aVar = (w4.a) arrayList.get(i10);
            int i11 = aVar.f13799a;
            if (i11 == 8) {
                if (h(aVar.f13802d, i10 + 1) == i6) {
                    return true;
                }
            } else {
                if (i11 == 1) {
                    int i12 = aVar.f13800b;
                    int i13 = aVar.f13802d + i12;
                    while (i12 < i13) {
                        if (h(i12, i10 + 1) == i6) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.f9926c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((v9.b) this.f9927d).f((w4.a) arrayList.get(i6));
        }
        s(arrayList);
        this.f9924a = 0;
    }

    public void e() {
        v9.b bVar = (v9.b) this.f9927d;
        d();
        ArrayList arrayList = (ArrayList) this.f9928e;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            w4.a aVar = (w4.a) arrayList.get(i6);
            int i10 = aVar.f13799a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            bVar.f(aVar);
                            bVar.j(aVar.f13800b, aVar.f13802d);
                        }
                    } else {
                        bVar.f(aVar);
                        bVar.h(aVar.f13800b, aVar.f13802d, aVar.f13801c);
                    }
                } else {
                    bVar.f(aVar);
                    int i11 = aVar.f13800b;
                    int i12 = aVar.f13802d;
                    RecyclerView recyclerView = (RecyclerView) bVar.f13479x;
                    recyclerView.P(true, i11, i12);
                    recyclerView.G0 = true;
                    recyclerView.D0.f13859c += i12;
                }
            } else {
                bVar.f(aVar);
                bVar.i(aVar.f13800b, aVar.f13802d);
            }
        }
        s(arrayList);
        this.f9924a = 0;
    }

    public void f(w4.a aVar) {
        int i6;
        s0.c cVar = (s0.c) this.f9925b;
        int i10 = aVar.f13799a;
        if (i10 != 1 && i10 != 8) {
            int y9 = y(aVar.f13800b, i10);
            int i11 = aVar.f13800b;
            int i12 = aVar.f13799a;
            if (i12 != 2) {
                if (i12 == 4) {
                    i6 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + aVar);
                }
            } else {
                i6 = 0;
            }
            int i13 = 1;
            for (int i14 = 1; i14 < aVar.f13802d; i14++) {
                int y10 = y((i6 * i14) + aVar.f13800b, aVar.f13799a);
                int i15 = aVar.f13799a;
                if (i15 == 2 ? y10 == y9 : !(i15 != 4 || y10 != y9 + 1)) {
                    i13++;
                } else {
                    w4.a n10 = n(aVar.f13801c, i15, y9, i13);
                    g(n10, i11);
                    n10.f13801c = null;
                    cVar.c(n10);
                    if (aVar.f13799a == 4) {
                        i11 += i13;
                    }
                    y9 = y10;
                    i13 = 1;
                }
            }
            Object obj = aVar.f13801c;
            aVar.f13801c = null;
            cVar.c(aVar);
            if (i13 > 0) {
                w4.a n11 = n(obj, aVar.f13799a, y9, i13);
                g(n11, i11);
                n11.f13801c = null;
                cVar.c(n11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void g(w4.a aVar, int i6) {
        v9.b bVar = (v9.b) this.f9927d;
        bVar.f(aVar);
        int i10 = aVar.f13799a;
        if (i10 != 2) {
            if (i10 == 4) {
                bVar.h(i6, aVar.f13802d, aVar.f13801c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = aVar.f13802d;
        RecyclerView recyclerView = (RecyclerView) bVar.f13479x;
        recyclerView.P(true, i6, i11);
        recyclerView.G0 = true;
        recyclerView.D0.f13859c += i11;
    }

    public int h(int i6, int i10) {
        ArrayList arrayList = (ArrayList) this.f9926c;
        int size = arrayList.size();
        while (i10 < size) {
            w4.a aVar = (w4.a) arrayList.get(i10);
            int i11 = aVar.f13799a;
            if (i11 == 8) {
                int i12 = aVar.f13800b;
                if (i12 == i6) {
                    i6 = aVar.f13802d;
                } else {
                    if (i12 < i6) {
                        i6--;
                    }
                    if (aVar.f13802d <= i6) {
                        i6++;
                    }
                }
            } else {
                int i13 = aVar.f13800b;
                if (i13 > i6) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.f13802d;
                    if (i6 < i13 + i14) {
                        return -1;
                    }
                    i6 -= i14;
                } else if (i11 == 1) {
                    i6 += aVar.f13802d;
                }
            }
            i10++;
        }
        return i6;
    }

    public void i(int i6) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f9928e;
        while (priorityQueue.size() > i6) {
            r rVar = (r) priorityQueue.poll();
            String str = a0.f12750a;
            int i10 = 0;
            while (true) {
                arrayList = rVar.f13253x;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((s) this.f9925b).e(rVar.f13254y, (u1.t) arrayList.get(i10));
                ((ArrayDeque) this.f9926c).push((u1.t) arrayList.get(i10));
                i10++;
            }
            arrayList.clear();
            r rVar2 = (r) this.f9929f;
            if (rVar2 != null && rVar2.f13254y == rVar.f13254y) {
                this.f9929f = null;
            }
            ((ArrayDeque) this.f9927d).push(rVar);
        }
    }

    public ColorStateList j() {
        d3 d3Var = (d3) this.f9928e;
        if (d3Var != null) {
            return d3Var.f10230a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        d3 d3Var = (d3) this.f9928e;
        if (d3Var != null) {
            return d3Var.f10231b;
        }
        return null;
    }

    public boolean l() {
        if (((ArrayList) this.f9928e).size() > 0) {
            return true;
        }
        return false;
    }

    public void m(AttributeSet attributeSet, int i6) {
        ColorStateList i10;
        View view = (View) this.f9925b;
        Context context = view.getContext();
        int[] iArr = h.a.B;
        n9.j E = n9.j.E(context, attributeSet, iArr, i6);
        TypedArray typedArray = (TypedArray) E.f9356z;
        View view2 = (View) this.f9925b;
        q0.q(view2, view2.getContext(), iArr, attributeSet, (TypedArray) E.f9356z, i6);
        boolean z10 = false;
        try {
            if (typedArray.hasValue(0)) {
                this.f9924a = typedArray.getResourceId(0, -1);
                t tVar = (t) this.f9926c;
                Context context2 = view.getContext();
                int i11 = this.f9924a;
                synchronized (tVar) {
                    i10 = tVar.f10386a.i(context2, i11);
                }
                if (i10 != null) {
                    u(i10);
                }
            }
            if (typedArray.hasValue(1)) {
                q0.t(view, E.t(1));
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c10 = n1.c(typedArray.getInt(2, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                h0.j(view, c10);
                if (i12 == 21) {
                    Drawable background = view.getBackground();
                    if (h0.c(view) != null || h0.d(view) != null) {
                        z10 = true;
                    }
                    if (background != null && z10) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            E.G();
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [w4.a, java.lang.Object] */
    public w4.a n(Object obj, int i6, int i10, int i11) {
        w4.a aVar = (w4.a) ((s0.c) this.f9925b).a();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f13799a = i6;
            obj2.f13800b = i10;
            obj2.f13802d = i11;
            obj2.f13801c = obj;
            return obj2;
        }
        aVar.f13799a = i6;
        aVar.f13800b = i10;
        aVar.f13802d = i11;
        aVar.f13801c = obj;
        return aVar;
    }

    public void o() {
        this.f9924a = -1;
        u(null);
        b();
    }

    public void p(int i6) {
        ColorStateList colorStateList;
        this.f9924a = i6;
        t tVar = (t) this.f9926c;
        if (tVar != null) {
            Context context = ((View) this.f9925b).getContext();
            synchronized (tVar) {
                colorStateList = tVar.f10386a.i(context, i6);
            }
        } else {
            colorStateList = null;
        }
        u(colorStateList);
        b();
    }

    public void q(w4.a aVar) {
        v9.b bVar = (v9.b) this.f9927d;
        ((ArrayList) this.f9926c).add(aVar);
        int i6 = aVar.f13799a;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 4) {
                    if (i6 == 8) {
                        bVar.j(aVar.f13800b, aVar.f13802d);
                        return;
                    } else {
                        throw new IllegalArgumentException("Unknown update op type for " + aVar);
                    }
                }
                bVar.h(aVar.f13800b, aVar.f13802d, aVar.f13801c);
                return;
            }
            int i10 = aVar.f13800b;
            int i11 = aVar.f13802d;
            RecyclerView recyclerView = (RecyclerView) bVar.f13479x;
            recyclerView.P(false, i10, i11);
            recyclerView.G0 = true;
            return;
        }
        bVar.i(aVar.f13800b, aVar.f13802d);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.j.r():void");
    }

    public void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            w4.a aVar = (w4.a) arrayList.get(i6);
            aVar.f13801c = null;
            ((s0.c) this.f9925b).c(aVar);
        }
        arrayList.clear();
    }

    public void t(Runnable runnable) {
        x xVar = (x) this.f9925b;
        if (!xVar.f12820a.getLooper().getThread().isAlive()) {
            return;
        }
        xVar.c(runnable);
    }

    public void u(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((d3) this.f9927d) == null) {
                this.f9927d = new Object();
            }
            d3 d3Var = (d3) this.f9927d;
            d3Var.f10230a = colorStateList;
            d3Var.f10233d = true;
        } else {
            this.f9927d = null;
        }
        b();
    }

    public void v(int i6) {
        boolean z10;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        this.f9924a = i6;
        i(i6);
    }

    public void w(ColorStateList colorStateList) {
        if (((d3) this.f9928e) == null) {
            this.f9928e = new Object();
        }
        d3 d3Var = (d3) this.f9928e;
        d3Var.f10230a = colorStateList;
        d3Var.f10233d = true;
        b();
    }

    public void x(PorterDuff.Mode mode) {
        if (((d3) this.f9928e) == null) {
            this.f9928e = new Object();
        }
        d3 d3Var = (d3) this.f9928e;
        d3Var.f10231b = mode;
        d3Var.f10232c = true;
        b();
    }

    public int y(int i6, int i10) {
        int i11;
        int i12;
        s0.c cVar = (s0.c) this.f9925b;
        ArrayList arrayList = (ArrayList) this.f9926c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w4.a aVar = (w4.a) arrayList.get(size);
            int i13 = aVar.f13799a;
            if (i13 == 8) {
                int i14 = aVar.f13800b;
                int i15 = aVar.f13802d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i6 >= i12 && i6 <= i11) {
                    if (i12 == i14) {
                        if (i10 == 1) {
                            aVar.f13802d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.f13802d = i15 - 1;
                        }
                        i6++;
                    } else {
                        if (i10 == 1) {
                            aVar.f13800b = i14 + 1;
                        } else if (i10 == 2) {
                            aVar.f13800b = i14 - 1;
                        }
                        i6--;
                    }
                } else if (i6 < i14) {
                    if (i10 == 1) {
                        aVar.f13800b = i14 + 1;
                        aVar.f13802d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f13800b = i14 - 1;
                        aVar.f13802d = i15 - 1;
                    }
                }
            } else {
                int i16 = aVar.f13800b;
                if (i16 <= i6) {
                    if (i13 == 1) {
                        i6 -= aVar.f13802d;
                    } else if (i13 == 2) {
                        i6 += aVar.f13802d;
                    }
                } else if (i10 == 1) {
                    aVar.f13800b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f13800b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            w4.a aVar2 = (w4.a) arrayList.get(size2);
            if (aVar2.f13799a == 8) {
                int i17 = aVar2.f13802d;
                if (i17 == aVar2.f13800b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.f13801c = null;
                    cVar.c(aVar2);
                }
            } else if (aVar2.f13802d <= 0) {
                arrayList.remove(size2);
                aVar2.f13801c = null;
                cVar.c(aVar2);
            }
        }
        return i6;
    }

    public void z(Object obj) {
        Object obj2 = this.f9928e;
        this.f9928e = obj;
        if (!obj2.equals(obj)) {
            n0 n0Var = ((b0) this.f9927d).f167y;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            n0Var.F1();
            n0Var.w1(1, 10, num);
            n0Var.w1(2, 10, num);
            n0Var.K.e(21, new a2.a0(intValue, 1));
        }
    }

    public j(View view) {
        this.f9924a = -1;
        this.f9925b = view;
        this.f9926c = t.a();
    }

    public j(s sVar) {
        this.f9925b = sVar;
        this.f9926c = new ArrayDeque();
        this.f9927d = new ArrayDeque();
        this.f9928e = new PriorityQueue();
        this.f9924a = -1;
    }

    public j(v9.b bVar) {
        this.f9925b = new s0.c(30);
        this.f9928e = new ArrayList();
        this.f9926c = new ArrayList();
        this.f9924a = 0;
        this.f9927d = bVar;
        this.f9929f = new lc.c(this);
    }

    public j(Object obj, Looper looper, Looper looper2, v vVar, b0 b0Var) {
        this.f9925b = vVar.a(looper, null);
        this.f9926c = vVar.a(looper2, null);
        this.f9928e = obj;
        this.f9929f = obj;
        this.f9927d = b0Var;
    }
}
