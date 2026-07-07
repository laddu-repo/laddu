package wd;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends ae.a {

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f14288g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14289h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14290i;
    public final AdView j;

    public a(Context context, RelativeLayout relativeLayout, vd.a aVar, sd.c cVar, int i6, int i10, com.unity3d.scar.adapter.common.c cVar2) {
        super(context, cVar, aVar, cVar2, 1);
        this.f14288g = relativeLayout;
        this.f14289h = i6;
        this.f14290i = i10;
        this.j = new AdView(context);
        this.f702f = new c();
    }

    @Override // ae.a
    public final void c(AdRequest adRequest) {
        AdView adView;
        RelativeLayout relativeLayout = this.f14288g;
        if (relativeLayout != null && (adView = this.j) != null) {
            relativeLayout.addView(adView);
            this.j.setAdSize(new AdSize(this.f14289h, this.f14290i));
            this.j.setAdUnitId(this.f699c.f12289c);
            this.j.setAdListener(((c) ((jb.b) this.f702f)).f14291a);
            this.j.loadAd(adRequest);
        }
    }
}
