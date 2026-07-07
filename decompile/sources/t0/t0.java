package t0;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t0 extends ne.i implements ve.p {
    public final /* synthetic */ View A;

    /* renamed from: y, reason: collision with root package name */
    public int f12407y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f12408z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(View view, le.c cVar) {
        super(2, cVar);
        this.A = view;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        t0 t0Var = new t0(this.A, cVar);
        t0Var.f12408z = obj;
        return t0Var;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((cf.k) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i6 = this.f12407y;
        View view = this.A;
        Object obj3 = me.a.f8833x;
        if (i6 != 0) {
            Object obj4 = he.y.f6101a;
            if (i6 != 1) {
                if (i6 == 2) {
                    he.a.f(obj);
                    return obj4;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cf.k kVar = (cf.k) this.f12408z;
            he.a.f(obj);
            if (view instanceof ViewGroup) {
                this.f12408z = null;
                this.f12407y = 2;
                kVar.getClass();
                cf.u uVar = new cf.u(new he.p((ViewGroup) view, 6));
                if (!uVar.f2086y.hasNext()) {
                    obj2 = obj4;
                } else {
                    kVar.f2069z = uVar;
                    kVar.f2067x = 2;
                    kVar.A = this;
                    obj2 = obj3;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
            return obj4;
        }
        he.a.f(obj);
        cf.k kVar2 = (cf.k) this.f12408z;
        this.f12408z = kVar2;
        this.f12407y = 1;
        kVar2.f2068y = view;
        kVar2.f2067x = 3;
        kVar2.A = this;
        return obj3;
    }
}
