package k4;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.playfy.tv.R;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends i1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f7654u;

    /* renamed from: v, reason: collision with root package name */
    public final View f7655v;

    public m(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f7654u = (TextView) view.findViewById(R.id.exo_text);
        this.f7655v = view.findViewById(R.id.exo_check);
    }
}
