package gd;

import android.app.UiModeManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.playfy.tv.databinding.ChannelItemBinding;
import gf.n1;
import kd.h0;
import w4.e0;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends e0 {
    public static final y E = new y(4);
    public final ve.l B;
    public final ve.l C;
    public final boolean D;

    public s(ve.l lVar, n1 n1Var) {
        super(E);
        boolean z10;
        this.B = lVar;
        this.C = n1Var;
        Object systemService = p7.a.a().getSystemService("uimode");
        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        Object h4 = h(i6);
        kotlin.jvm.internal.k.d(h4, "getItem(...)");
        h0 h0Var = (h0) h4;
        ChannelItemBinding channelItemBinding = ((r) i1Var).f5635u;
        channelItemBinding.f3204c.setText(h0Var.f7857x);
        ShapeableImageView shapeableImageView = channelItemBinding.f3203b;
        String str = h0Var.f7859z;
        l6.f a10 = l6.a.a(shapeableImageView.getContext());
        v6.i iVar = new v6.i(shapeableImageView.getContext());
        iVar.f13364c = str;
        iVar.c(shapeableImageView);
        cf.m.J(iVar);
        iVar.b(false);
        Boolean bool = Boolean.TRUE;
        iVar.f13373m = bool;
        iVar.f13372l = bool;
        iVar.f13367f = w6.d.f14126x;
        iVar.f13378r = new w6.e(new w6.h(new w6.a(220), new w6.a(220)));
        iVar.s = null;
        iVar.f13379t = null;
        iVar.f13380u = null;
        ((l6.k) a10).b(iVar.a());
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        return new r(this, ChannelItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
