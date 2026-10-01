package nd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.playfy.tv.R;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends w4.e0 {
    public static final s C = new Object();
    public final l B;

    public v(l lVar) {
        super(C);
        this.B = lVar;
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        u uVar = (u) i1Var;
        Object h4 = h(i6);
        kotlin.jvm.internal.k.d(h4, "getItem(...)");
        final w wVar = (w) h4;
        final l onClick = this.B;
        kotlin.jvm.internal.k.e(onClick, "onClick");
        TextView textView = uVar.f9719u;
        textView.setText(wVar.f9720a);
        boolean z10 = wVar.f9721b;
        textView.setSelected(z10);
        View view = uVar.f13897a;
        view.setSelected(z10);
        final int i10 = 0;
        view.setOnClickListener(new View.OnClickListener() { // from class: nd.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        onClick.invoke(wVar.f9720a);
                        return;
                    default:
                        onClick.invoke(wVar.f9720a);
                        return;
                }
            }
        });
        final int i11 = 1;
        textView.setOnClickListener(new View.OnClickListener() { // from class: nd.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        onClick.invoke(wVar.f9720a);
                        return;
                    default:
                        onClick.invoke(wVar.f9720a);
                        return;
                }
            }
        });
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_inline_category, viewGroup, false);
        kotlin.jvm.internal.k.b(inflate);
        return new u(inflate);
    }
}
