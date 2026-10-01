package nd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import com.playfy.tv.R;
import java.util.ArrayList;
import java.util.List;
import w4.i1;
import w4.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends k0 implements Filterable {
    public final l A;
    public final List B;
    public final ArrayList C;
    public androidx.lifecycle.i D;

    public r(List list, l lVar) {
        this.A = lVar;
        this.B = ie.j.Z(list);
        this.C = ie.j.a0(list);
    }

    @Override // w4.k0
    public final int a() {
        return this.C.size();
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        p pVar = (p) i1Var;
        String title = (String) this.C.get(i6);
        kotlin.jvm.internal.k.e(title, "title");
        pVar.f9713u.setText(title);
        pVar.f13897a.setOnClickListener(new fd.b(14, this, title));
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category_option, viewGroup, false);
        kotlin.jvm.internal.k.b(inflate);
        return new p(inflate);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new q(this);
    }
}
