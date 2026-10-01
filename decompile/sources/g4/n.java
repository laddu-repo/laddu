package g4;

import android.view.View;
import android.widget.TextView;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f5520u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f5521v;

    public n(View view) {
        super(view);
        if (w1.b0.f13686a < 26) {
            view.setFocusable(true);
        }
        this.f5520u = (TextView) view.findViewById(g0.exo_text);
        this.f5521v = view.findViewById(g0.exo_check);
    }
}
