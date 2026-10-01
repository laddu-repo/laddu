package d;

import android.util.Log;
import j1.a1;
import j1.w0;
import j1.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, int i6) {
        super(false);
        this.f3472d = i6;
        this.f3473e = obj;
    }

    @Override // d.f0
    public void a() {
        switch (this.f3472d) {
            case 1:
                j1.p0 p0Var = (j1.p0) this.f3473e;
                if (j1.p0.L(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + p0Var);
                }
                if (j1.p0.L(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + p0Var.f6950h);
                }
                j1.a aVar = p0Var.f6950h;
                if (aVar != null) {
                    aVar.s = false;
                    aVar.d();
                    j1.a aVar2 = p0Var.f6950h;
                    a2.a aVar3 = new a2.a(p0Var, 29);
                    if (aVar2.f6870q == null) {
                        aVar2.f6870q = new ArrayList();
                    }
                    aVar2.f6870q.add(aVar3);
                    p0Var.f6950h.e();
                    p0Var.f6951i = true;
                    p0Var.z(true);
                    p0Var.F();
                    p0Var.f6951i = false;
                    p0Var.f6950h = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // d.f0
    public final void b() {
        switch (this.f3472d) {
            case 0:
                ((ve.l) this.f3473e).invoke(this);
                return;
            case 1:
                j1.p0 p0Var = (j1.p0) this.f3473e;
                if (j1.p0.L(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + p0Var);
                }
                o0 o0Var = p0Var.j;
                ArrayList arrayList = p0Var.f6955n;
                p0Var.f6951i = true;
                p0Var.z(true);
                int i6 = 0;
                p0Var.f6951i = false;
                if (p0Var.f6950h != null) {
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(j1.p0.G(p0Var.f6950h));
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            n4.h hVar = (n4.h) obj;
                            Iterator it = linkedHashSet.iterator();
                            while (it.hasNext()) {
                                hVar.a((j1.y) it.next(), true);
                            }
                        }
                    }
                    ArrayList arrayList2 = p0Var.f6950h.f6855a;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        j1.y yVar = ((w0) obj2).f7006b;
                        if (yVar != null) {
                            yVar.K = false;
                        }
                    }
                    Iterator it2 = p0Var.f(new ArrayList(Collections.singletonList(p0Var.f6950h)), 0, 1).iterator();
                    while (it2.hasNext()) {
                        j1.m mVar = (j1.m) it2.next();
                        ArrayList arrayList3 = mVar.f6929c;
                        if (j1.p0.L(3)) {
                            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                        }
                        mVar.k(arrayList3);
                        mVar.c(arrayList3);
                    }
                    ArrayList arrayList4 = p0Var.f6950h.f6855a;
                    int size3 = arrayList4.size();
                    while (i6 < size3) {
                        Object obj3 = arrayList4.get(i6);
                        i6++;
                        j1.y yVar2 = ((w0) obj3).f7006b;
                        if (yVar2 != null && yVar2.f7023f0 == null) {
                            p0Var.g(yVar2).k();
                        }
                    }
                    p0Var.f6950h = null;
                    p0Var.h0();
                    if (j1.p0.L(3)) {
                        Log.d("FragmentManager", "Op is being set to null");
                        Log.d("FragmentManager", "OnBackPressedCallback enabled=" + o0Var.f3432a + " for  FragmentManager " + p0Var);
                        return;
                    }
                    return;
                }
                if (o0Var.f3432a) {
                    if (j1.p0.L(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    p0Var.T();
                    return;
                } else {
                    if (j1.p0.L(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    p0Var.f6949g.d();
                    return;
                }
            default:
                o4.h hVar2 = ((l4.x) this.f3473e).f8199b;
                if (!hVar2.f9904f.isEmpty()) {
                    l4.u f3 = hVar2.f();
                    kotlin.jvm.internal.k.b(f3);
                    hVar2.l(f3.f8195y.f9924a, true);
                    return;
                }
                return;
        }
    }

    @Override // d.f0
    public void c(c backEvent) {
        switch (this.f3472d) {
            case 1:
                j1.p0 p0Var = (j1.p0) this.f3473e;
                if (j1.p0.L(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + p0Var);
                }
                if (p0Var.f6950h != null) {
                    int i6 = 0;
                    Iterator it = p0Var.f(new ArrayList(Collections.singletonList(p0Var.f6950h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        j1.m mVar = (j1.m) it.next();
                        mVar.getClass();
                        kotlin.jvm.internal.k.e(backEvent, "backEvent");
                        if (j1.p0.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f3419c);
                        }
                        ArrayList arrayList = mVar.f6929c;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            ie.p.z(((a1) obj).f6883k, arrayList2);
                        }
                        List Z = ie.j.Z(ie.j.c0(arrayList2));
                        int size2 = Z.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((z0) Z.get(i11)).c(backEvent, mVar.f6927a);
                        }
                    }
                    ArrayList arrayList3 = p0Var.f6955n;
                    int size3 = arrayList3.size();
                    while (i6 < size3) {
                        Object obj2 = arrayList3.get(i6);
                        i6++;
                        ((n4.h) obj2).getClass();
                    }
                    return;
                }
                return;
            default:
                super.c(backEvent);
                return;
        }
    }

    @Override // d.f0
    public void d(c cVar) {
        switch (this.f3472d) {
            case 1:
                j1.p0 p0Var = (j1.p0) this.f3473e;
                if (j1.p0.L(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + p0Var);
                }
                p0Var.w();
                p0Var.x(new j1.n0(p0Var), false);
                return;
            default:
                super.d(cVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ve.l lVar) {
        super(true);
        this.f3472d = 0;
        this.f3473e = lVar;
    }
}
