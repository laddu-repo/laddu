package l4;

import android.os.Bundle;
import androidx.lifecycle.n1;
import androidx.lifecycle.p1;
import androidx.lifecycle.q1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.f0, q1, androidx.lifecycle.s, e5.g {
    public androidx.lifecycle.x A;
    public final m B;
    public final String C;
    public final Bundle D;
    public final o4.c E = new o4.c(this);

    /* renamed from: x, reason: collision with root package name */
    public final e1.m f8140x;

    /* renamed from: y, reason: collision with root package name */
    public u f8141y;

    /* renamed from: z, reason: collision with root package name */
    public final Bundle f8142z;

    public h(e1.m mVar, u uVar, Bundle bundle, androidx.lifecycle.x xVar, m mVar2, String str, Bundle bundle2) {
        this.f8140x = mVar;
        this.f8141y = uVar;
        this.f8142z = bundle;
        this.A = xVar;
        this.B = mVar2;
        this.C = str;
        this.D = bundle2;
        he.a.d(new androidx.lifecycle.i(this, 9));
    }

    public final void a(androidx.lifecycle.x xVar) {
        o4.c cVar = this.E;
        cVar.getClass();
        cVar.f9885k = xVar;
        cVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            Bundle bundle = hVar.f8142z;
            if (kotlin.jvm.internal.k.a(this.C, hVar.C) && kotlin.jvm.internal.k.a(this.f8141y, hVar.f8141y) && kotlin.jvm.internal.k.a(this.E.j, hVar.E.j) && kotlin.jvm.internal.k.a(getSavedStateRegistry(), hVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.f8142z;
                if (!kotlin.jvm.internal.k.a(bundle2, bundle)) {
                    if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                        if (!keySet.isEmpty()) {
                            for (String str : keySet) {
                                Object obj3 = bundle2.get(str);
                                if (bundle != null) {
                                    obj2 = bundle.get(str);
                                } else {
                                    obj2 = null;
                                }
                                if (!kotlin.jvm.internal.k.a(obj3, obj2)) {
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // androidx.lifecycle.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o1.c getDefaultViewModelCreationExtras() {
        /*
            r5 = this;
            o4.c r0 = r5.E
            r0.getClass()
            o1.e r1 = new o1.e
            r2 = 0
            r1.<init>(r2)
            ua.f r2 = androidx.lifecycle.d1.f902a
            l4.h r3 = r0.f9876a
            java.util.LinkedHashMap r4 = r1.f9848a
            r4.put(r2, r3)
            w8.l r2 = androidx.lifecycle.d1.f903b
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L24
            zb.d r2 = androidx.lifecycle.d1.f904c
            r4.put(r2, r0)
        L24:
            r0 = 0
            e1.m r2 = r5.f8140x
            if (r2 == 0) goto L36
            android.content.Context r2 = r2.f4172a
            android.content.Context r2 = r2.getApplicationContext()
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L36
            android.app.Application r2 = (android.app.Application) r2
            goto L37
        L36:
            r2 = r0
        L37:
            if (r2 == 0) goto L3a
            r0 = r2
        L3a:
            if (r0 == 0) goto L41
            ua.f r2 = androidx.lifecycle.m1.f960e
            r4.put(r2, r0)
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.h.getDefaultViewModelCreationExtras():o1.c");
    }

    @Override // androidx.lifecycle.s
    public final n1 getDefaultViewModelProviderFactory() {
        return this.E.f9886l;
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.y getLifecycle() {
        return this.E.j;
    }

    @Override // e5.g
    public final e5.e getSavedStateRegistry() {
        return this.E.f9883h.f4357b;
    }

    @Override // androidx.lifecycle.q1
    public final p1 getViewModelStore() {
        o4.c cVar = this.E;
        if (cVar.f9884i) {
            if (cVar.j.f929d != androidx.lifecycle.x.f991x) {
                m mVar = cVar.f9880e;
                if (mVar != null) {
                    String backStackEntryId = cVar.f9881f;
                    kotlin.jvm.internal.k.e(backStackEntryId, "backStackEntryId");
                    LinkedHashMap linkedHashMap = mVar.f8161b;
                    p1 p1Var = (p1) linkedHashMap.get(backStackEntryId);
                    if (p1Var == null) {
                        p1 p1Var2 = new p1();
                        linkedHashMap.put(backStackEntryId, p1Var2);
                        return p1Var2;
                    }
                    return p1Var;
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
    }

    public final int hashCode() {
        Set<String> keySet;
        int i6;
        int hashCode = this.f8141y.hashCode() + (this.C.hashCode() * 31);
        Bundle bundle = this.f8142z;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i10 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                if (obj != null) {
                    i6 = obj.hashCode();
                } else {
                    i6 = 0;
                }
                hashCode = i10 + i6;
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.E.j.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.E.toString();
    }
}
