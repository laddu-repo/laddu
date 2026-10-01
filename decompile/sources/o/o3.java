package o;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.material.appbar.MaterialToolbar;
import com.livxow.tv.app.App;
import fc.l;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o3 implements cc.b {
    public Object A;
    public Object B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f9253v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f9254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f9255x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f9256y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f9257z;

    public o3(h.j jVar, mb mbVar, int i) {
        ArrayList arrayList = new ArrayList();
        this.f9256y = arrayList;
        this.f9253v = jVar;
        this.f9255x = new nc.d(jVar, this, i);
        LinearLayout linearLayout = (LinearLayout) mbVar.f2889c;
        this.f9257z = linearLayout;
        this.f9254w = (View) mbVar.f2891e;
        arrayList.add(linearLayout);
        arrayList.add((LinearLayout) mbVar.f2888b);
        arrayList.add((LinearLayout) mbVar.f2892g);
        arrayList.add((LinearLayout) mbVar.f2890d);
        arrayList.add((LinearLayout) mbVar.f);
    }

    public void a(LinearLayout linearLayout, final boolean z2) {
        h.j jVar = (h.j) this.f9253v;
        if (((LinearLayout) this.A) == linearLayout) {
            return;
        }
        linearLayout.post(new ed.m(this, linearLayout, z2, 1));
        nc.c cVar = (nc.c) this.B;
        if (cVar != null) {
            cVar.g(linearLayout.getId());
        }
        ((nc.d) this.f9255x).b(linearLayout.getId());
        final int color = jVar.getColor(fc.j.nav_active);
        final int color2 = jVar.getColor(fc.j.nav_inactive);
        ArrayList arrayList = (ArrayList) this.f9256y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i10 = i + 1;
            LinearLayout linearLayout2 = (LinearLayout) arrayList.get(i);
            final boolean z10 = linearLayout2 == linearLayout;
            int id2 = linearLayout2.getId();
            final ImageView imageView = (ImageView) linearLayout2.findViewById(id2 == fc.l.nav_settings ? fc.l.iv_settings : id2 == fc.l.nav_events ? fc.l.iv_events : id2 == fc.l.nav_sports ? fc.l.iv_sports : id2 == fc.l.nav_highlights ? fc.l.iv_highlights : fc.l.iv_cats);
            int id3 = linearLayout2.getId();
            final TextView textView = (TextView) linearLayout2.findViewById(id3 == fc.l.nav_settings ? fc.l.tv_settings : id3 == fc.l.nav_events ? fc.l.tv_events : id3 == fc.l.nav_sports ? fc.l.tv_sports : id3 == fc.l.nav_highlights ? fc.l.tv_highlights : fc.l.tv_cats);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: nc.a
                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = l.tag_color;
                    ImageView imageView2 = imageView;
                    Integer numValueOf = (Integer) imageView2.getTag(i11);
                    int i12 = color2;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i12);
                    }
                    boolean z11 = z10;
                    if (z11) {
                        i12 = color;
                    }
                    ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), numValueOf, Integer.valueOf(i12));
                    valueAnimatorOfObject.setDuration(220L);
                    valueAnimatorOfObject.addUpdateListener(new b(imageView2, textView, 0));
                    valueAnimatorOfObject.start();
                    if (z2 && z11) {
                        imageView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(220L).setInterpolator(new DecelerateInterpolator()).start();
                    }
                }
            }, 50L);
            i = i10;
        }
        this.A = linearLayout;
    }

    public void b(pc.a aVar) {
        pc.a aVar2;
        nc.d dVar = (nc.d) this.f9255x;
        h.j jVar = dVar.f9104c;
        wc.a aVar3 = (wc.a) new a7.j(jVar).p(wc.a.class);
        aVar3.f14019e = aVar.i;
        aVar3.f = aVar.f10475j;
        aVar3.f14020g = aVar.f10476k;
        aVar3.f14021h = aVar.f10477l;
        mc.i iVar = new mc.i();
        HashMap map = dVar.f;
        map.clear();
        map.put(1, new mc.k());
        map.put(Integer.valueOf(fc.l.nav_highlights), new mc.m());
        map.put(Integer.valueOf(fc.l.nav_settings), new mc.w());
        map.put(Integer.valueOf(fc.l.nav_events), iVar);
        Integer numValueOf = Integer.valueOf(fc.l.nav_sports);
        App app = dVar.f9103b;
        String str = (app == null || (aVar2 = app.f3685v) == null) ? null : aVar2.f10468a;
        String str2 = "m3u";
        if (str == null || str.isEmpty()) {
            str = "";
        } else if (!str.startsWith("http")) {
            str = vc.a.h(jVar) + str;
            str2 = "custom";
        }
        map.put(numValueOf, mc.g.X(str, str2));
        Integer numValueOf2 = Integer.valueOf(fc.l.nav_cats);
        mc.c cVar = new mc.c();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSports", false);
        cVar.L(bundle);
        map.put(numValueOf2, cVar);
        androidx.fragment.app.q0 q0VarO = jVar.o();
        q0VarO.getClass();
        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(q0VarO);
        aVar4.f967o = true;
        aVar4.e(dVar.f9106e, iVar, mc.i.class.getSimpleName(), 1);
        aVar4.d(false);
        q0VarO.y(true);
        q0VarO.D();
        dVar.f9107g = iVar;
        dVar.i = fc.l.nav_events;
        ArrayList arrayList = (ArrayList) this.f9256y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            LinearLayout linearLayout = (LinearLayout) obj;
            linearLayout.setOnClickListener(new gc.r(6, this, linearLayout));
        }
        a((LinearLayout) this.f9257z, false);
    }

    @Override // nd.a
    public Object get() {
        return new ac.g1((dc.k) ((cc.d) this.f9253v).get(), (ac.x0) ((cc.d) this.f9254w).get(), (ac.t0) ((cc.d) this.f9255x).get(), (ac.k1) ((cc.d) this.f9256y).get(), (d1.h) ((cc.d) this.f9257z).get(), (ac.h0) ((cc.d) this.A).get(), (sd.h) ((cc.d) this.B).get());
    }

    public o3(LinearLayout linearLayout, FrameLayout frameLayout, mb mbVar, View view, FrameLayout frameLayout2, MaterialToolbar materialToolbar, View view2) {
        this.f9253v = linearLayout;
        this.f9255x = frameLayout;
        this.f9256y = mbVar;
        this.f9254w = view;
        this.f9257z = frameLayout2;
        this.A = materialToolbar;
        this.B = view2;
    }

    public o3(cc.d dVar, cc.d dVar2, cc.d dVar3, cc.d dVar4, cc.d dVar5, cc.d dVar6, cc.d dVar7) {
        this.f9253v = dVar;
        this.f9254w = dVar2;
        this.f9255x = dVar3;
        this.f9256y = dVar4;
        this.f9257z = dVar5;
        this.A = dVar6;
        this.B = dVar7;
    }

    public o3(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f9256y = layoutParams;
        this.f9257z = new Rect();
        this.A = new int[2];
        this.B = new int[2];
        this.f9253v = context;
        View viewInflate = LayoutInflater.from(context).inflate(g.g.abc_tooltip, (ViewGroup) null);
        this.f9254w = viewInflate;
        this.f9255x = (TextView) viewInflate.findViewById(g.f.message);
        layoutParams.setTitle(o3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = g.i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public o3(zc.c cVar, jd.k kVar, ad.g gVar, a9.g gVar2, hd.a aVar, Handler handler, k8.k2 k2Var, ab.f fVar) {
        de.i.e(handler, "uiHandler");
        this.f9253v = cVar;
        this.f9254w = kVar;
        this.f9255x = gVar;
        this.f9256y = handler;
        this.f9257z = fVar;
        s5.d dVar = new s5.d(gVar);
        e2.w wVar = new e2.w(cVar.f14883a, 1);
        this.A = wVar;
        cd.a aVar2 = new cd.a(cVar.f14884b, cVar.f14886d, wVar, dVar, k2Var, fVar, cVar.f14887e, cVar.f, aVar);
        fd.c cVar2 = new fd.c(kVar, gVar2, aVar2, wVar, cVar.f14886d, fVar, cVar.f14888g);
        aVar2.G = cVar2;
        zc.g gVar3 = cVar.f14885c;
        de.i.e(gVar3, "<set-?>");
        cVar2.D = gVar3;
        this.B = new ed.a(gVar, aVar2, cVar2, cVar.f14886d, cVar.f14884b, cVar.f14887e, fVar, handler, cVar.f, aVar, cVar.f14888g);
        s5.d dVar2 = new s5.d(this);
        synchronized (gVar.f494w) {
            gVar.f493v.f492z = dVar2;
        }
    }
}
