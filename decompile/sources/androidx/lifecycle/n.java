package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements d0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f962x = 2;

    /* renamed from: y, reason: collision with root package name */
    public final Object f963y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f964z;

    public n(l defaultLifecycleObserver, d0 d0Var) {
        kotlin.jvm.internal.k.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f963y = defaultLifecycleObserver;
        this.f964z = d0Var;
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(f0 f0Var, w wVar) {
        switch (this.f962x) {
            case 0:
                l lVar = (l) this.f963y;
                switch (m.f958a[wVar.ordinal()]) {
                    case 1:
                        lVar.f(f0Var);
                        break;
                    case 2:
                        lVar.S(f0Var);
                        break;
                    case 3:
                        lVar.d(f0Var);
                        break;
                    case 4:
                        lVar.l(f0Var);
                        break;
                    case 5:
                        lVar.y(f0Var);
                        break;
                    case 6:
                        lVar.K(f0Var);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new RuntimeException();
                }
                d0 d0Var = (d0) this.f964z;
                if (d0Var != null) {
                    d0Var.onStateChanged(f0Var, wVar);
                    return;
                }
                return;
            case 1:
                if (wVar == w.ON_START) {
                    ((y) this.f963y).c(this);
                    ((e5.e) this.f964z).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((e) this.f964z).f906a;
                List list = (List) hashMap.get(wVar);
                Object obj = this.f963y;
                e.a(list, f0Var, wVar, obj);
                e.a((List) hashMap.get(w.ON_ANY), f0Var, wVar, obj);
                return;
        }
    }

    public n(e0 e0Var) {
        this.f963y = e0Var;
        g gVar = g.f915c;
        Class<?> cls = e0Var.getClass();
        e eVar = (e) gVar.f916a.get(cls);
        this.f964z = eVar == null ? gVar.a(cls, null) : eVar;
    }

    public n(y yVar, e5.e eVar) {
        this.f963y = yVar;
        this.f964z = eVar;
    }
}
