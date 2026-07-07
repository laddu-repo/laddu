package gd;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.playfy.tv.databinding.EventCatItemBinding;
import java.util.List;
import w4.e0;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends e0 {
    public final nd.b B;

    public f(nd.b bVar) {
        super(new y(2));
        this.B = bVar;
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        e eVar = (e) i1Var;
        Object h4 = h(i6);
        kotlin.jvm.internal.k.d(h4, "getItem(...)");
        kd.i iVar = (kd.i) h4;
        EventCatItemBinding eventCatItemBinding = eVar.f5614u;
        eVar.r(iVar);
        eventCatItemBinding.f3266c.setText(iVar.f7861b);
        ShapeableImageView shapeableImageView = eventCatItemBinding.f3265b;
        String str = iVar.f7862c;
        l6.f a10 = l6.a.a(shapeableImageView.getContext());
        v6.i iVar2 = new v6.i(shapeableImageView.getContext());
        iVar2.f13364c = str;
        iVar2.c(shapeableImageView);
        cf.m.J(iVar2);
        ((l6.k) a10).b(iVar2.a());
    }

    @Override // w4.k0
    public final void e(i1 i1Var, int i6, List payloads) {
        e eVar = (e) i1Var;
        kotlin.jvm.internal.k.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            d(eVar, i6);
            return;
        }
        Object obj = payloads.get(0);
        kotlin.jvm.internal.k.c(obj, "null cannot be cast to non-null type com.playfy.tv.models.Cat");
        eVar.r((kd.i) obj);
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        return new e(this, EventCatItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
