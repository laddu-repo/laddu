package j6;

import bf.o;
import j1.e0;
import j1.f0;
import j1.p0;
import j1.r;
import j1.y;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.k;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7232d;

    /* renamed from: e, reason: collision with root package name */
    public f0 f7233e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f7234f;

    public b(boolean z10, l lVar) {
        super(lVar);
        this.f7232d = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        ((java.util.concurrent.CopyOnWriteArrayList) r0.f6908z).remove(r4);
     */
    @Override // j6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r6 = this;
            super.b()
            java.lang.ref.WeakReference r0 = r6.f7234f
            if (r0 == 0) goto L47
            java.lang.Object r0 = r0.get()
            j1.p0 r0 = (j1.p0) r0
            if (r0 == 0) goto L47
            j1.f0 r1 = r6.f7233e
            if (r1 == 0) goto L47
            j1.f0 r0 = r0.f6956o
            r0.getClass()
            java.lang.Object r2 = r0.f6908z
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f6908z     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch: java.lang.Throwable -> L3e
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L3e
            r4 = 0
        L26:
            if (r4 >= r3) goto L43
            java.lang.Object r5 = r0.f6908z     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.CopyOnWriteArrayList r5 = (java.util.concurrent.CopyOnWriteArrayList) r5     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L3e
            j1.e0 r5 = (j1.e0) r5     // Catch: java.lang.Throwable -> L3e
            j1.f0 r5 = r5.f6904a     // Catch: java.lang.Throwable -> L3e
            if (r5 != r1) goto L40
            java.lang.Object r0 = r0.f6908z     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch: java.lang.Throwable -> L3e
            r0.remove(r4)     // Catch: java.lang.Throwable -> L3e
            goto L43
        L3e:
            r0 = move-exception
            goto L45
        L40:
            int r4 = r4 + 1
            goto L26
        L43:
            monitor-exit(r2)
            goto L47
        L45:
            monitor-exit(r2)
            throw r0
        L47:
            r0 = 0
            r6.f7234f = r0
            r6.f7233e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.b.b():void");
    }

    @Override // j6.c
    public final androidx.lifecycle.f0 c(Object obj) {
        try {
            return ((y) obj).j();
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Fragment doesn't have a view associated with it or the view has been destroyed");
        }
    }

    @Override // j6.c
    public final boolean e(Object obj) {
        y yVar = (y) obj;
        if (this.f7232d) {
            if (yVar.m() && !yVar.f7018a0) {
                if ((yVar instanceof r) || yVar.f7024g0 != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // j6.c
    public final String f(Object obj) {
        y yVar = (y) obj;
        if (!yVar.m()) {
            return "Fragment's view can't be accessed. Fragment isn't added";
        }
        if (yVar.f7018a0) {
            return "Fragment's view can't be accessed. Fragment is detached";
        }
        if (!(yVar instanceof r) && yVar.f7024g0 == null) {
            return "Fragment's view can't be accessed. Fragment's view is null. Maybe you try to access view before onViewCreated() or after onDestroyView(). Add check `if (view != null)` before call ViewBinding";
        }
        return "Host view isn't ready. LifecycleViewBindingProperty.isViewInitialized return false";
    }

    @Override // j6.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final r5.a a(y yVar, o property) {
        k.e(property, "property");
        r5.a a10 = super.a(yVar, property);
        if (this.f7233e != null) {
            return a10;
        }
        p0 g10 = yVar.g();
        this.f7234f = new WeakReference(g10);
        f0 f0Var = new f0(this, yVar);
        f0 f0Var2 = g10.f6956o;
        f0Var2.getClass();
        ((CopyOnWriteArrayList) f0Var2.f6908z).add(new e0(f0Var));
        this.f7233e = f0Var;
        return a10;
    }
}
