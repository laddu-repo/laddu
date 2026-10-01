package ia;

import a8.g;
import android.content.Context;
import com.playfy.tv.R;
import jb.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f6709f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6711b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6712c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6713d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6714e;

    public a(Context context) {
        boolean p10 = g.p(context, R.attr.elevationOverlayEnabled, false);
        int n10 = b.n(context, R.attr.elevationOverlayColor, 0);
        int n11 = b.n(context, R.attr.elevationOverlayAccentColor, 0);
        int n12 = b.n(context, R.attr.colorSurface, 0);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f6710a = p10;
        this.f6711b = n10;
        this.f6712c = n11;
        this.f6713d = n12;
        this.f6714e = f3;
    }
}
