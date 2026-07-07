package hc;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.d1;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinearLayout f6219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f6220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WebView f6221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f6222x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, View view) {
        super(view);
        this.f6222x = hVar;
        this.f6219u = (LinearLayout) view.findViewById(fc.l.banner_layout);
        this.f6220v = (ImageView) view.findViewById(fc.l.banner_img);
        this.f6221w = (WebView) view.findViewById(fc.l.banner_web);
    }

    public final void q() {
        h hVar = this.f6222x;
        h.j jVar = hVar.f;
        String str = hVar.f6226h;
        d1 d1Var = new d1(23, this);
        com.bumptech.glide.o oVarE = com.bumptech.glide.b.e(jVar.getApplicationContext());
        oVarE.getClass();
        com.bumptech.glide.m mVarX = new com.bumptech.glide.m(oVarE.f2443v, oVarE, Drawable.class, oVarE.f2444w).y(str).x(new qc.i(d1Var, jVar));
        r6.e eVar = new r6.e();
        mVarX.w(eVar, eVar, mVarX, v6.f.f13222b);
        this.f6220v.setOnClickListener(new com.google.android.material.datepicker.n(7, this));
    }
}
