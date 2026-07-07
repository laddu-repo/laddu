package gd;

import kd.d0;
import kd.h0;
import kd.j0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends w4.b {

    /* renamed from: e, reason: collision with root package name */
    public static final y f5644e = new y(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5645d;

    public /* synthetic */ y(int i6) {
        this.f5645d = i6;
    }

    @Override // w4.b
    public final boolean a(Object obj, Object obj2) {
        switch (this.f5645d) {
            case 0:
                return ((j0) obj).equals((j0) obj2);
            case 1:
                return ((kd.i) obj).equals((kd.i) obj2);
            case 2:
                return ((kd.i) obj).equals((kd.i) obj2);
            case 3:
                if (!(obj instanceof kd.u) ? !(!(obj instanceof kd.l) ? !(obj instanceof h0) || !(obj2 instanceof h0) || !obj.equals(obj2) : !(obj2 instanceof kd.l) || !obj.equals(obj2)) : !(!(obj2 instanceof kd.u) || !obj.equals(obj2))) {
                    return true;
                }
                return false;
            case 4:
                return ((h0) obj).equals((h0) obj2);
            default:
                return ((d0) obj).equals((d0) obj2);
        }
    }

    @Override // w4.b
    public final boolean b(Object obj, Object obj2) {
        switch (this.f5645d) {
            case 0:
                j0 j0Var = (j0) obj;
                j0 j0Var2 = (j0) obj2;
                if (kotlin.jvm.internal.k.a(j0Var.f7869a, j0Var2.f7869a) && j0Var.f7872d == j0Var2.f7872d) {
                    return true;
                }
                return false;
            case 1:
                if (((kd.i) obj).f7860a == ((kd.i) obj2).f7860a) {
                    return true;
                }
                return false;
            case 2:
                if (((kd.i) obj).f7860a == ((kd.i) obj2).f7860a) {
                    return true;
                }
                return false;
            case 3:
                if (!(obj instanceof kd.u) ? !(!(obj instanceof kd.l) ? !(obj instanceof h0) || !(obj2 instanceof h0) || !kotlin.jvm.internal.k.a(((h0) obj).f7857x, ((h0) obj2).f7857x) : !(obj2 instanceof kd.l) || ((kd.l) obj).f7876x != ((kd.l) obj2).f7876x) : !(!(obj2 instanceof kd.u) || ((kd.u) obj).f7900x != ((kd.u) obj2).f7900x)) {
                    return true;
                }
                return false;
            case 4:
                return kotlin.jvm.internal.k.a(((h0) obj).A, ((h0) obj2).A);
            default:
                return kotlin.jvm.internal.k.a(((d0) obj).f7845a, ((d0) obj2).f7845a);
        }
    }

    @Override // w4.b
    public Object f(Object obj, Object obj2) {
        switch (this.f5645d) {
            case 2:
                kd.i iVar = (kd.i) obj2;
                if (((kd.i) obj).f7863d == iVar.f7863d) {
                    return null;
                }
                return iVar;
            default:
                return super.f(obj, obj2);
        }
    }
}
