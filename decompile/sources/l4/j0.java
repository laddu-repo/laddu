package l4;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
import kf.f1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public k f8146a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8147b;

    public abstract u a();

    public final k b() {
        k kVar = this.f8146a;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, z zVar) {
        cf.f fVar = new cf.f(new cf.g(new cf.t(ie.j.C(list), new hd.b(2, this, zVar), 1), false, new cf.p(0)));
        while (fVar.hasNext()) {
            b().g((h) fVar.next());
        }
    }

    public void e(k kVar) {
        this.f8146a = kVar;
        this.f8147b = true;
    }

    public void f(h hVar) {
        u uVar = hVar.f8141y;
        if (uVar == null) {
            uVar = null;
        }
        if (uVar == null) {
            return;
        }
        a0 a0Var = new a0();
        a0Var.f8105b = true;
        boolean z10 = a0Var.f8105b;
        boolean z11 = a0Var.f8106c;
        int i6 = a0Var.f8107d;
        boolean z12 = a0Var.f8108e;
        b2.j jVar = a0Var.f8104a;
        c(uVar, null, new z(z10, z11, i6, false, z12, jVar.f1380a, jVar.f1381b, -1, -1));
        b().d(hVar);
    }

    public Bundle h() {
        return null;
    }

    public void i(h hVar, boolean z10) {
        List list = (List) ((f1) b().f8152e.f8014x).getValue();
        if (list.contains(hVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            h hVar2 = null;
            while (j()) {
                hVar2 = (h) listIterator.previous();
                if (kotlin.jvm.internal.k.a(hVar2, hVar)) {
                    break;
                }
            }
            if (hVar2 != null) {
                b().e(hVar2, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + hVar + " which does not exist in back stack " + list).toString());
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public u c(u uVar, Bundle bundle, z zVar) {
        return uVar;
    }
}
