package g4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f5512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f5513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f5514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f5515x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, View view) {
        super(view);
        this.f5515x = rVar;
        if (w1.b0.f13686a < 26) {
            view.setFocusable(true);
        }
        this.f5512u = (TextView) view.findViewById(g0.exo_main_text);
        this.f5513v = (TextView) view.findViewById(g0.exo_sub_text);
        this.f5514w = (ImageView) view.findViewById(g0.exo_icon);
        view.setOnClickListener(new com.google.android.material.datepicker.n(3, this));
    }
}
