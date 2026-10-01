package gd;

import android.view.View;
import com.playfy.tv.R;
import kd.d0;
import nd.b0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5636x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f5637y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ w f5638z;

    public /* synthetic */ t(w wVar, x xVar) {
        this.f5636x = 2;
        this.f5638z = wVar;
        this.f5637y = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f5636x;
        x xVar = this.f5637y;
        w wVar = this.f5638z;
        switch (i6) {
            case 0:
                b0 b0Var = xVar.C;
                d0 d0Var = (d0) xVar.h(wVar.c());
                kotlin.jvm.internal.k.d(d0Var, "access$getItem(...)");
                b0Var.invoke(d0Var);
                return;
            case 1:
                df.v vVar = xVar.B;
                d0 d0Var2 = (d0) xVar.h(wVar.c());
                kotlin.jvm.internal.k.d(d0Var2, "access$getItem(...)");
                vVar.invoke(d0Var2, Boolean.FALSE);
                return;
            default:
                View view2 = wVar.f13897a;
                ga.b bVar = new ga.b(view2.getContext(), 0);
                i.d dVar = bVar.f6209a;
                dVar.f6161d = dVar.f6158a.getText(R.string.delete);
                dVar.f6163f = view2.getContext().getString(R.string.sure_message, "Delete Playlist");
                bVar.b(R.string.delete, new u(0, xVar, wVar));
                bVar.a(R.string.cancel, new v(0));
                cf.m.G(bVar);
                return;
        }
    }

    public /* synthetic */ t(x xVar, w wVar, int i6) {
        this.f5636x = i6;
        this.f5637y = xVar;
        this.f5638z = wVar;
    }
}
