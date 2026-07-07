package gd;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.playfy.tv.databinding.PlaylistItemBinding;
import kd.d0;
import nd.b0;
import w4.e0;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends e0 {
    public final df.v B;
    public final b0 C;

    public x(df.v vVar, b0 b0Var) {
        super(new y(5));
        this.B = vVar;
        this.C = b0Var;
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        Object h4 = h(i6);
        kotlin.jvm.internal.k.d(h4, "getItem(...)");
        d0 d0Var = (d0) h4;
        PlaylistItemBinding playlistItemBinding = ((w) i1Var).f5643u;
        playlistItemBinding.f3352e.setText(d0Var.f7846b);
        playlistItemBinding.f3351d.setText(d0Var.f7847c);
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        return new w(this, PlaylistItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
