package ae;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f703g;

    /* renamed from: h, reason: collision with root package name */
    public final int f704h;

    /* renamed from: i, reason: collision with root package name */
    public final int f705i;
    public final AdView j;

    public b(Context context, RelativeLayout relativeLayout, zd.a aVar, sd.c cVar, int i6, int i10, com.unity3d.scar.adapter.common.c cVar2) {
        super(context, cVar, aVar, cVar2, 0);
        this.f703g = relativeLayout;
        this.f704h = i6;
        this.f705i = i10;
        this.j = new AdView(context);
        this.f702f = new d();
    }

    @Override // ae.a
    public final void c(AdRequest adRequest) {
        AdView adView;
        RelativeLayout relativeLayout = this.f703g;
        if (relativeLayout != null && (adView = this.j) != null) {
            relativeLayout.addView(adView);
            this.j.setAdSize(new AdSize(this.f704h, this.f705i));
            this.j.setAdUnitId(this.f699c.f12289c);
            this.j.setAdListener(((d) ((a8.i) this.f702f)).f706c);
            this.j.loadAd(adRequest);
        }
    }
}
