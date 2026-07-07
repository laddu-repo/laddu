package p;

import android.content.Context;
import android.view.View;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends o.v {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10235l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f10236m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, o.l lVar, View view) {
        super(context, lVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f10236m = jVar;
        this.f9842f = 8388613;
        u5.r rVar = jVar.T;
        this.f9844h = rVar;
        o.t tVar = this.f9845i;
        if (tVar != null) {
            tVar.j(rVar);
        }
    }

    @Override // o.v
    public final void c() {
        switch (this.f10235l) {
            case 0:
                j jVar = this.f10236m;
                jVar.Q = null;
                jVar.getClass();
                super.c();
                return;
            default:
                j jVar2 = this.f10236m;
                o.l lVar = jVar2.f10273z;
                if (lVar != null) {
                    lVar.c(true);
                }
                jVar2.P = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, o.d0 d0Var, View view) {
        super(context, d0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f10236m = jVar;
        if ((d0Var.A.f9822x & 32) != 32) {
            View view2 = jVar.F;
            this.f9841e = view2 == null ? (View) jVar.E : view2;
        }
        u5.r rVar = jVar.T;
        this.f9844h = rVar;
        o.t tVar = this.f9845i;
        if (tVar != null) {
            tVar.j(rVar);
        }
    }
}
