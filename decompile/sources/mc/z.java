package mc;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import k8.k2;
import o.o3;
import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class z extends androidx.fragment.app.y {
    public int A0;
    public int B0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public a7.h f8629t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f8630u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f8631v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f8632w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ka.c f8633x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public y f8634y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f8635z0;

    @Override // androidx.fragment.app.y
    public final void E() {
        final int i = 0;
        if (this.B0 == 0) {
            ((Button) this.f8629t0.f186c).setVisibility(0);
            ((Button) this.f8629t0.f186c).setOnClickListener(new View.OnClickListener(this) { // from class: mc.x

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ z f8628w;

                {
                    this.f8628w = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o3 o3Var;
                    switch (i) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            z zVar = this.f8628w;
                            if (!zVar.f8635z0) {
                                ((Button) zVar.f8629t0.f191j).setVisibility(8);
                                ((Button) zVar.f8629t0.i).setVisibility(8);
                                ((Button) zVar.f8629t0.f186c).setVisibility(8);
                                zVar.f8634y0.b();
                                return;
                            }
                            ka.c cVar = zVar.f8633x0;
                            Context contextJ = zVar.j();
                            ka.c cVar2 = zVar.f8633x0;
                            Context contextI = zVar.I();
                            String str = zVar.f8631v0;
                            cVar2.getClass();
                            File fileA = ka.c.A(contextI, str);
                            cVar.getClass();
                            ka.c.B(contextJ, fileA);
                            return;
                        case 1:
                            z zVar2 = this.f8628w;
                            try {
                                zVar2.O(new Intent("android.intent.action.VIEW", Uri.parse(zVar2.f8630u0)));
                                return;
                            } catch (ActivityNotFoundException e7) {
                                Toast.makeText(zVar2.j(), e7.getMessage(), 1).show();
                                return;
                            }
                        case 2:
                            z zVar3 = this.f8628w;
                            try {
                                zVar3.O(new Intent("android.intent.action.VIEW", Uri.parse(zVar3.f8632w0)));
                                return;
                            } catch (ActivityNotFoundException e10) {
                                Toast.makeText(zVar3.j(), e10.getMessage(), 1).show();
                                return;
                            }
                        default:
                            z zVar4 = this.f8628w;
                            if (zVar4.f8633x0 == null) {
                                ka.c cVar3 = new ka.c();
                                zVar4.f8633x0 = cVar3;
                                Context contextJ2 = zVar4.j();
                                de.i.e(contextJ2, "context");
                                Context applicationContext = contextJ2.getApplicationContext();
                                zc.f fVar = id.a.f6608h;
                                zc.g gVar = id.a.f6603b;
                                ab.a aVar = id.a.f6609j;
                                zc.d dVar = id.a.i;
                                de.i.d(applicationContext, "appContext");
                                k2 k2Var = new k2(applicationContext, applicationContext.getFilesDir().getAbsoluteFile() + "/_fetchData/temp");
                                zc.i iVar = id.a.f;
                                if (aVar != null) {
                                    aVar.getClass();
                                    if (aVar.f286v.equals("fetch2")) {
                                        aVar.f286v = "LibGlobalFetchLib";
                                    }
                                } else {
                                    aVar.getClass();
                                }
                                zc.c cVar4 = new zc.c(applicationContext, fVar, gVar, aVar, dVar, k2Var, iVar);
                                synchronized (ed.i.f4898a) {
                                    try {
                                        LinkedHashMap linkedHashMap = ed.i.f4899b;
                                        ed.h hVar = (ed.h) linkedHashMap.get("LibGlobalFetchLib");
                                        if (hVar != null) {
                                            o3Var = new o3(cVar4, hVar.f4891a, hVar.f4892b, hVar.f4893c, hVar.f4894d, hVar.f4895e, hVar.f, hVar.f4896g);
                                        } else {
                                            jd.k kVar = new jd.k();
                                            com.bumptech.glide.manager.e eVar = new com.bumptech.glide.manager.e(1);
                                            ad.g gVar2 = new ad.g(new ad.f(applicationContext, aVar, new bd.a[]{new bd.a(1, 2, 2), new bd.a(2, 3, 5), new bd.a(3, 4, 4), new bd.a(4, 5, 1), new bd.a(5, 6, 0), new bd.a(6, 7, 3)}, eVar, new k2(applicationContext, applicationContext.getFilesDir().getAbsoluteFile() + "/_fetchData/temp")));
                                            a9.g gVar3 = new a9.g(22, gVar2);
                                            k2 k2Var2 = new k2(7);
                                            hd.a aVar2 = new hd.a(gVar3);
                                            Handler handler = ed.i.f4900c;
                                            ab.f fVar2 = new ab.f(aVar2, gVar3, handler);
                                            o3Var = new o3(cVar4, kVar, gVar2, gVar3, aVar2, handler, k2Var2, fVar2);
                                            linkedHashMap.put("LibGlobalFetchLib", new ed.h(kVar, gVar2, gVar3, aVar2, handler, k2Var2, fVar2, (e2.w) o3Var.A));
                                        }
                                        ((jd.k) o3Var.f9254w).c();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                zc.c cVar5 = (zc.c) o3Var.f9253v;
                                cVar3.f7872v = new ed.g(cVar5, (jd.k) o3Var.f9254w, (Handler) o3Var.f9256y, (ed.a) o3Var.B, cVar5.f14886d, (ab.f) o3Var.f9257z, (ad.g) o3Var.f9255x);
                                zVar4.f8633x0.H(new ka.c(zVar4));
                                zVar4.P();
                            } else {
                                zVar4.P();
                            }
                            ((LinearLayout) zVar4.f8629t0.f184a).setVisibility(0);
                            return;
                    }
                }
            });
        } else {
            ((Button) this.f8629t0.f186c).setVisibility(8);
        }
        final int i10 = 1;
        String string = m().getString(fc.q.update_txt_message, this.f8632w0);
        if (Build.VERSION.SDK_INT >= 24) {
            ((TextView) this.f8629t0.f187d).setText(Html.fromHtml(string, 0));
        } else {
            ((TextView) this.f8629t0.f187d).setText(Html.fromHtml(string));
        }
        ((TextView) this.f8629t0.f187d).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) this.f8629t0.f187d).setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) this.f8629t0.f191j).setOnClickListener(new View.OnClickListener(this) { // from class: mc.x

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ z f8628w;

            {
                this.f8628w = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o3 o3Var;
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        z zVar = this.f8628w;
                        if (!zVar.f8635z0) {
                            ((Button) zVar.f8629t0.f191j).setVisibility(8);
                            ((Button) zVar.f8629t0.i).setVisibility(8);
                            ((Button) zVar.f8629t0.f186c).setVisibility(8);
                            zVar.f8634y0.b();
                            return;
                        }
                        ka.c cVar = zVar.f8633x0;
                        Context contextJ = zVar.j();
                        ka.c cVar2 = zVar.f8633x0;
                        Context contextI = zVar.I();
                        String str = zVar.f8631v0;
                        cVar2.getClass();
                        File fileA = ka.c.A(contextI, str);
                        cVar.getClass();
                        ka.c.B(contextJ, fileA);
                        return;
                    case 1:
                        z zVar2 = this.f8628w;
                        try {
                            zVar2.O(new Intent("android.intent.action.VIEW", Uri.parse(zVar2.f8630u0)));
                            return;
                        } catch (ActivityNotFoundException e7) {
                            Toast.makeText(zVar2.j(), e7.getMessage(), 1).show();
                            return;
                        }
                    case 2:
                        z zVar3 = this.f8628w;
                        try {
                            zVar3.O(new Intent("android.intent.action.VIEW", Uri.parse(zVar3.f8632w0)));
                            return;
                        } catch (ActivityNotFoundException e10) {
                            Toast.makeText(zVar3.j(), e10.getMessage(), 1).show();
                            return;
                        }
                    default:
                        z zVar4 = this.f8628w;
                        if (zVar4.f8633x0 == null) {
                            ka.c cVar3 = new ka.c();
                            zVar4.f8633x0 = cVar3;
                            Context contextJ2 = zVar4.j();
                            de.i.e(contextJ2, "context");
                            Context applicationContext = contextJ2.getApplicationContext();
                            zc.f fVar = id.a.f6608h;
                            zc.g gVar = id.a.f6603b;
                            ab.a aVar = id.a.f6609j;
                            zc.d dVar = id.a.i;
                            de.i.d(applicationContext, "appContext");
                            k2 k2Var = new k2(applicationContext, applicationContext.getFilesDir().getAbsoluteFile() + "/_fetchData/temp");
                            zc.i iVar = id.a.f;
                            if (aVar != null) {
                                aVar.getClass();
                                if (aVar.f286v.equals("fetch2")) {
                                    aVar.f286v = "LibGlobalFetchLib";
                                }
                            } else {
                                aVar.getClass();
                            }
                            zc.c cVar4 = new zc.c(applicationContext, fVar, gVar, aVar, dVar, k2Var, iVar);
                            synchronized (ed.i.f4898a) {
                                try {
                                    LinkedHashMap linkedHashMap = ed.i.f4899b;
                                    ed.h hVar = (ed.h) linkedHashMap.get("LibGlobalFetchLib");
                                    if (hVar != null) {
                                        o3Var = new o3(cVar4, hVar.f4891a, hVar.f4892b, hVar.f4893c, hVar.f4894d, hVar.f4895e, hVar.f, hVar.f4896g);
                                    } else {
                                        jd.k kVar = new jd.k();
                                        com.bumptech.glide.manager.e eVar = new com.bumptech.glide.manager.e(1);
                                        ad.g gVar2 = new ad.g(new ad.f(applicationContext, aVar, new bd.a[]{new bd.a(1, 2, 2), new bd.a(2, 3, 5), new bd.a(3, 4, 4), new bd.a(4, 5, 1), new bd.a(5, 6, 0), new bd.a(6, 7, 3)}, eVar, new k2(applicationContext, applicationContext.getFilesDir().getAbsoluteFile() + "/_fetchData/temp")));
                                        a9.g gVar3 = new a9.g(22, gVar2);
                                        k2 k2Var2 = new k2(7);
                                        hd.a aVar2 = new hd.a(gVar3);
                                        Handler handler = ed.i.f4900c;
                                        ab.f fVar2 = new ab.f(aVar2, gVar3, handler);
                                        o3Var = new o3(cVar4, kVar, gVar2, gVar3, aVar2, handler, k2Var2, fVar2);
                                        linkedHashMap.put("LibGlobalFetchLib", new ed.h(kVar, gVar2, gVar3, aVar2, handler, k2Var2, fVar2, (e2.w) o3Var.A));
                                    }
                                    ((jd.k) o3Var.f9254w).c();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            zc.c cVar5 = (zc.c) o3Var.f9253v;
                            cVar3.f7872v = new ed.g(cVar5, (jd.k) o3Var.f9254w, (Handler) o3Var.f9256y, (ed.a) o3Var.B, cVar5.f14886d, (ab.f) o3Var.f9257z, (ad.g) o3Var.f9255x);
                            zVar4.f8633x0.H(new ka.c(zVar4));
                            zVar4.P();
                        } else {
                            zVar4.P();
                        }
                        ((LinearLayout) zVar4.f8629t0.f184a).setVisibility(0);
                        return;
                }
            }
        });
        final int i11 = 2;
        ((Button) this.f8629t0.f190h).setOnClickListener(new View.OnClickListener(this) { // from class: mc.x

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ z f8628w;

            {
                this.f8628w = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o3 o3Var;
                switch (i11) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        z zVar = this.f8628w;
                        if (!zVar.f8635z0) {
                            ((Button) zVar.f8629t0.f191j).setVisibility(8);
                            ((Button) zVar.f8629t0.i).setVisibility(8);
                            ((Button) zVar.f8629t0.f186c).setVisibility(8);
                            zVar.f8634y0.b();
                            return;
                        }
                        ka.c cVar = zVar.f8633x0;
                        Context contextJ = zVar.j();
                        ka.c cVar2 = zVar.f8633x0;
                        Context contextI = zVar.I();
                        String str = zVar.f8631v0;
                        cVar2.getClass();
                        File fileA = ka.c.A(contextI, str);
                        cVar.getClass();
                        ka.c.B(contextJ, fileA);
                        return;
                    case 1:
                        z zVar2 = this.f8628w;
                        try {
                            zVar2.O(new Intent("android.intent.action.VIEW", Uri.parse(zVar2.f8630u0)));
                            return;
                        } catch (ActivityNotFoundException e7) {
                            Toast.makeText(zVar2.j(), e7.getMessage(), 1).show();
                            return;
                        }
                    case 2:
                        z zVar3 = this.f8628w;
                        try {
                            zVar3.O(new Intent("android.intent.action.VIEW", Uri.parse(zVar3.f8632w0)));
                            return;
                        } catch (ActivityNotFoundException e10) {
                            Toast.makeText(zVar3.j(), e10.getMessage(), 1).show();
                            return;
                        }
                    default:
                        z zVar4 = this.f8628w;
                        if (zVar4.f8633x0 == null) {
                            ka.c cVar3 = new ka.c();
                            zVar4.f8633x0 = cVar3;
                            Context contextJ2 = zVar4.j();
                            de.i.e(contextJ2, "context");
                            Context applicationContext = contextJ2.getApplicationContext();
                            zc.f fVar = id.a.f6608h;
                            zc.g gVar = id.a.f6603b;
                            ab.a aVar = id.a.f6609j;
                            zc.d dVar = id.a.i;
                            de.i.d(applicationContext, "appContext");
                            k2 k2Var = new k2(applicationContext, applicationContext.getFilesDir().getAbsoluteFile() + "/_fetchData/temp");
                            zc.i iVar = id.a.f;
                            if (aVar != null) {
                                aVar.getClass();
                                if (aVar.f286v.equals("fetch2")) {
                                    aVar.f286v = "LibGlobalFetchLib";
                                }
                            } else {
                                aVar.getClass();
                            }
                            zc.c cVar4 = new zc.c(applicationContext, fVar, gVar, aVar, dVar, k2Var, iVar);
                            synchronized (ed.i.f4898a) {
                                try {
                                    LinkedHashMap linkedHashMap = ed.i.f4899b;
                                    ed.h hVar = (ed.h) linkedHashMap.get("LibGlobalFetchLib");
                                    if (hVar != null) {
                                        o3Var = new o3(cVar4, hVar.f4891a, hVar.f4892b, hVar.f4893c, hVar.f4894d, hVar.f4895e, hVar.f, hVar.f4896g);
                                    } else {
                                        jd.k kVar = new jd.k();
                                        com.bumptech.glide.manager.e eVar = new com.bumptech.glide.manager.e(1);
                                        ad.g gVar2 = new ad.g(new ad.f(applicationContext, aVar, new bd.a[]{new bd.a(1, 2, 2), new bd.a(2, 3, 5), new bd.a(3, 4, 4), new bd.a(4, 5, 1), new bd.a(5, 6, 0), new bd.a(6, 7, 3)}, eVar, new k2(applicationContext, applicationContext.getFilesDir().getAbsoluteFile() + "/_fetchData/temp")));
                                        a9.g gVar3 = new a9.g(22, gVar2);
                                        k2 k2Var2 = new k2(7);
                                        hd.a aVar2 = new hd.a(gVar3);
                                        Handler handler = ed.i.f4900c;
                                        ab.f fVar2 = new ab.f(aVar2, gVar3, handler);
                                        o3Var = new o3(cVar4, kVar, gVar2, gVar3, aVar2, handler, k2Var2, fVar2);
                                        linkedHashMap.put("LibGlobalFetchLib", new ed.h(kVar, gVar2, gVar3, aVar2, handler, k2Var2, fVar2, (e2.w) o3Var.A));
                                    }
                                    ((jd.k) o3Var.f9254w).c();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            zc.c cVar5 = (zc.c) o3Var.f9253v;
                            cVar3.f7872v = new ed.g(cVar5, (jd.k) o3Var.f9254w, (Handler) o3Var.f9256y, (ed.a) o3Var.B, cVar5.f14886d, (ab.f) o3Var.f9257z, (ad.g) o3Var.f9255x);
                            zVar4.f8633x0.H(new ka.c(zVar4));
                            zVar4.P();
                        } else {
                            zVar4.P();
                        }
                        ((LinearLayout) zVar4.f8629t0.f184a).setVisibility(0);
                        return;
                }
            }
        });
        final int i12 = 3;
        ((Button) this.f8629t0.i).setOnClickListener(new View.OnClickListener(this) { // from class: mc.x

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ z f8628w;

            {
                this.f8628w = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o3 o3Var;
                switch (i12) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        z zVar = this.f8628w;
                        if (!zVar.f8635z0) {
                            ((Button) zVar.f8629t0.f191j).setVisibility(8);
                            ((Button) zVar.f8629t0.i).setVisibility(8);
                            ((Button) zVar.f8629t0.f186c).setVisibility(8);
                            zVar.f8634y0.b();
                            return;
                        }
                        ka.c cVar = zVar.f8633x0;
                        Context contextJ = zVar.j();
                        ka.c cVar2 = zVar.f8633x0;
                        Context contextI = zVar.I();
                        String str = zVar.f8631v0;
                        cVar2.getClass();
                        File fileA = ka.c.A(contextI, str);
                        cVar.getClass();
                        ka.c.B(contextJ, fileA);
                        return;
                    case 1:
                        z zVar2 = this.f8628w;
                        try {
                            zVar2.O(new Intent("android.intent.action.VIEW", Uri.parse(zVar2.f8630u0)));
                            return;
                        } catch (ActivityNotFoundException e7) {
                            Toast.makeText(zVar2.j(), e7.getMessage(), 1).show();
                            return;
                        }
                    case 2:
                        z zVar3 = this.f8628w;
                        try {
                            zVar3.O(new Intent("android.intent.action.VIEW", Uri.parse(zVar3.f8632w0)));
                            return;
                        } catch (ActivityNotFoundException e10) {
                            Toast.makeText(zVar3.j(), e10.getMessage(), 1).show();
                            return;
                        }
                    default:
                        z zVar4 = this.f8628w;
                        if (zVar4.f8633x0 == null) {
                            ka.c cVar3 = new ka.c();
                            zVar4.f8633x0 = cVar3;
                            Context contextJ2 = zVar4.j();
                            de.i.e(contextJ2, "context");
                            Context applicationContext = contextJ2.getApplicationContext();
                            zc.f fVar = id.a.f6608h;
                            zc.g gVar = id.a.f6603b;
                            ab.a aVar = id.a.f6609j;
                            zc.d dVar = id.a.i;
                            de.i.d(applicationContext, "appContext");
                            k2 k2Var = new k2(applicationContext, applicationContext.getFilesDir().getAbsoluteFile() + "/_fetchData/temp");
                            zc.i iVar = id.a.f;
                            if (aVar != null) {
                                aVar.getClass();
                                if (aVar.f286v.equals("fetch2")) {
                                    aVar.f286v = "LibGlobalFetchLib";
                                }
                            } else {
                                aVar.getClass();
                            }
                            zc.c cVar4 = new zc.c(applicationContext, fVar, gVar, aVar, dVar, k2Var, iVar);
                            synchronized (ed.i.f4898a) {
                                try {
                                    LinkedHashMap linkedHashMap = ed.i.f4899b;
                                    ed.h hVar = (ed.h) linkedHashMap.get("LibGlobalFetchLib");
                                    if (hVar != null) {
                                        o3Var = new o3(cVar4, hVar.f4891a, hVar.f4892b, hVar.f4893c, hVar.f4894d, hVar.f4895e, hVar.f, hVar.f4896g);
                                    } else {
                                        jd.k kVar = new jd.k();
                                        com.bumptech.glide.manager.e eVar = new com.bumptech.glide.manager.e(1);
                                        ad.g gVar2 = new ad.g(new ad.f(applicationContext, aVar, new bd.a[]{new bd.a(1, 2, 2), new bd.a(2, 3, 5), new bd.a(3, 4, 4), new bd.a(4, 5, 1), new bd.a(5, 6, 0), new bd.a(6, 7, 3)}, eVar, new k2(applicationContext, applicationContext.getFilesDir().getAbsoluteFile() + "/_fetchData/temp")));
                                        a9.g gVar3 = new a9.g(22, gVar2);
                                        k2 k2Var2 = new k2(7);
                                        hd.a aVar2 = new hd.a(gVar3);
                                        Handler handler = ed.i.f4900c;
                                        ab.f fVar2 = new ab.f(aVar2, gVar3, handler);
                                        o3Var = new o3(cVar4, kVar, gVar2, gVar3, aVar2, handler, k2Var2, fVar2);
                                        linkedHashMap.put("LibGlobalFetchLib", new ed.h(kVar, gVar2, gVar3, aVar2, handler, k2Var2, fVar2, (e2.w) o3Var.A));
                                    }
                                    ((jd.k) o3Var.f9254w).c();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            zc.c cVar5 = (zc.c) o3Var.f9253v;
                            cVar3.f7872v = new ed.g(cVar5, (jd.k) o3Var.f9254w, (Handler) o3Var.f9256y, (ed.a) o3Var.B, cVar5.f14886d, (ab.f) o3Var.f9257z, (ad.g) o3Var.f9255x);
                            zVar4.f8633x0.H(new ka.c(zVar4));
                            zVar4.P();
                        } else {
                            zVar4.P();
                        }
                        ((LinearLayout) zVar4.f8629t0.f184a).setVisibility(0);
                        return;
                }
            }
        });
        ((LinearLayout) this.f8629t0.f184a).setVisibility(8);
    }

    public final void P() {
        ka.c cVar = this.f8633x0;
        Context contextJ = j();
        String str = this.f8631v0;
        cVar.getClass();
        zc.k kVar = new zc.k(str, ka.c.A(contextJ, str).getAbsolutePath());
        kVar.f14911y = zc.h.f14901x;
        kVar.f14912z = zc.g.f14897y;
        final ed.g gVar = (ed.g) cVar.f7872v;
        ma.p pVar = new ma.p(9);
        final ma.p pVar2 = new ma.p(9);
        gVar.getClass();
        final List listS = fa.b.s(kVar);
        final ed.d dVar = new ed.d(gVar, pVar2, pVar, 0);
        synchronized (gVar.f) {
            ((jd.k) gVar.f4884a).d(new ce.a() { // from class: ed.e
                @Override // ce.a
                public final Object b() {
                    ArrayList arrayList;
                    List list = listS;
                    g gVar2 = gVar;
                    d dVar2 = dVar;
                    try {
                        HashSet hashSet = new HashSet();
                        arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (hashSet.add(((zc.k) obj).G)) {
                                arrayList.add(obj);
                            }
                        }
                    } catch (Exception e7) {
                        ((ab.a) gVar2.f4887d).getClass();
                        de.i.e("Failed to enqueue list " + list, "message");
                        ((Handler) gVar2.f4885b).post(new b(pVar2, v.A(e7.getMessage())));
                    }
                    if (arrayList.size() != list.size()) {
                        throw new a5.d("request_list_not_distinct", false);
                    }
                    a aVar = (a) gVar2.f4886c;
                    ab.a aVar2 = (ab.a) gVar2.f4887d;
                    o oVar = (o) ((ab.f) gVar2.f4888e).i;
                    ArrayList arrayListL = aVar.l(list);
                    int size = arrayListL.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayListL.get(i);
                        i++;
                        ad.e eVar = (ad.e) ((od.f) obj2).f10116v;
                        int iOrdinal = eVar.E.ordinal();
                        if (iOrdinal == 1) {
                            ad.e eVar2 = new ad.e();
                            com.bumptech.glide.e.u(eVar, eVar2);
                            eVar2.E = zc.l.G;
                            oVar.b(eVar2);
                            aVar2.b("Added " + eVar);
                            oVar.c(eVar, false);
                            aVar2.b("Queued " + eVar + " for download");
                        } else if (iOrdinal == 4) {
                            oVar.f(eVar);
                            aVar2.b("Completed download " + eVar);
                        } else if (iOrdinal == 9) {
                            oVar.b(eVar);
                            aVar2.b("Added " + eVar);
                        }
                    }
                    ((Handler) gVar2.f4885b).post(new androidx.fragment.app.d(dVar2, arrayListL));
                    return od.l.f10126a;
                }
            });
        }
    }

    @Override // androidx.fragment.app.y
    public final void v(Bundle bundle) {
        super.v(bundle);
        wc.b bVar = (wc.b) new a7.j(H()).p(wc.b.class);
        this.f8630u0 = bVar.f;
        this.f8631v0 = bVar.f14023e;
        this.f8632w0 = bVar.f14024g;
        this.A0 = bVar.i;
        this.f8634y0 = bVar.f14022d;
        String str = bVar.f14025h;
        if (str == null) {
            return;
        }
        try {
            for (String str2 : str.split(",")) {
                if (Integer.parseInt(str2.trim()) == this.A0) {
                    this.B0 = 0;
                    return;
                }
            }
        } catch (IllegalArgumentException unused) {
            this.B0 = 1;
        }
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(fc.m.fragment_update, (ViewGroup) null, false);
        int i = fc.l.close_btn;
        if (((ImageButton) a.a.k(viewInflate, i)) != null) {
            i = fc.l.download_layout;
            LinearLayout linearLayout = (LinearLayout) a.a.k(viewInflate, i);
            if (linearLayout != null) {
                i = fc.l.download_progress;
                ProgressBar progressBar = (ProgressBar) a.a.k(viewInflate, i);
                if (progressBar != null) {
                    i = fc.l.later_btn;
                    Button button = (Button) a.a.k(viewInflate, i);
                    if (button != null) {
                        i = fc.l.message_txt_update;
                        TextView textView = (TextView) a.a.k(viewInflate, i);
                        if (textView != null) {
                            i = fc.l.progress_percent;
                            TextView textView2 = (TextView) a.a.k(viewInflate, i);
                            if (textView2 != null) {
                                i = fc.l.progress_txt;
                                TextView textView3 = (TextView) a.a.k(viewInflate, i);
                                if (textView3 != null) {
                                    i = fc.l.size_txt;
                                    TextView textView4 = (TextView) a.a.k(viewInflate, i);
                                    if (textView4 != null) {
                                        i = fc.l.tg_btn;
                                        Button button2 = (Button) a.a.k(viewInflate, i);
                                        if (button2 != null) {
                                            i = fc.l.updateBtn;
                                            Button button3 = (Button) a.a.k(viewInflate, i);
                                            if (button3 != null) {
                                                i = fc.l.update_ly;
                                                if (((LinearLayout) a.a.k(viewInflate, i)) != null) {
                                                    i = fc.l.web_btn;
                                                    Button button4 = (Button) a.a.k(viewInflate, i);
                                                    if (button4 != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                        a7.h hVar = new a7.h();
                                                        hVar.f184a = linearLayout;
                                                        hVar.f185b = progressBar;
                                                        hVar.f186c = button;
                                                        hVar.f187d = textView;
                                                        hVar.f188e = textView2;
                                                        hVar.f = textView3;
                                                        hVar.f189g = textView4;
                                                        hVar.f190h = button2;
                                                        hVar.i = button3;
                                                        hVar.f191j = button4;
                                                        this.f8629t0 = hVar;
                                                        return constraintLayout;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
