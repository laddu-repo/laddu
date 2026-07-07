package gd;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.playfy.tv.databinding.EventCatItemBinding;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends i1 {

    /* renamed from: u, reason: collision with root package name */
    public final EventCatItemBinding f5614u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(gd.f r3, com.playfy.tv.databinding.EventCatItemBinding r4) {
        /*
            r2 = this;
            android.widget.LinearLayout r0 = r4.f3264a
            r2.<init>(r0)
            r2.f5614u = r4
            fd.b r4 = new fd.b
            r1 = 5
            r4.<init>(r1, r3, r2)
            r0.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.e.<init>(gd.f, com.playfy.tv.databinding.EventCatItemBinding):void");
    }

    public final void r(kd.i iVar) {
        int i6;
        EventCatItemBinding eventCatItemBinding = this.f5614u;
        LinearLayout linearLayout = eventCatItemBinding.f3264a;
        boolean z10 = iVar.f7863d;
        linearLayout.setSelected(z10);
        TextView textView = eventCatItemBinding.f3266c;
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        textView.setVisibility(i6);
    }
}
