package k4;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.playfy.tv.R;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends i1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f7646u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f7647v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f7648w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f7649x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, View view) {
        super(view);
        this.f7649x = qVar;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.f7646u = (TextView) view.findViewById(R.id.exo_main_text);
        this.f7647v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f7648w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new com.google.android.material.datepicker.n(this, 3));
    }
}
