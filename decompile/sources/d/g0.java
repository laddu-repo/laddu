package d;

import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3438x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f3439y;

    public /* synthetic */ g0(n0 n0Var, int i6) {
        this.f3438x = i6;
        this.f3439y = n0Var;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        c backEvent = (c) obj;
        switch (this.f3438x) {
            case 0:
                kotlin.jvm.internal.k.e(backEvent, "backEvent");
                n0 n0Var = this.f3439y;
                ie.h hVar = n0Var.f3463b;
                ListIterator listIterator = hVar.listIterator(hVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((f0) obj2).f3432a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                f0 f0Var = (f0) obj2;
                if (n0Var.f3464c != null) {
                    n0Var.c();
                }
                n0Var.f3464c = f0Var;
                if (f0Var != null) {
                    f0Var.d(backEvent);
                }
                return he.y.f6101a;
            default:
                kotlin.jvm.internal.k.e(backEvent, "backEvent");
                n0 n0Var2 = this.f3439y;
                f0 f0Var2 = n0Var2.f3464c;
                if (f0Var2 == null) {
                    ie.h hVar2 = n0Var2.f3463b;
                    ListIterator listIterator2 = hVar2.listIterator(hVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((f0) obj3).f3432a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    f0Var2 = (f0) obj3;
                }
                if (f0Var2 != null) {
                    f0Var2.c(backEvent);
                }
                return he.y.f6101a;
        }
    }
}
