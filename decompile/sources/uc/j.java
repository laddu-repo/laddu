package uc;

import android.app.ActivityManager;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.k4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends b {

    /* renamed from: a, reason: collision with root package name */
    public final d f13094a;

    /* renamed from: b, reason: collision with root package name */
    public final c f13095b;

    /* renamed from: d, reason: collision with root package name */
    public cd.a f13097d;

    /* renamed from: e, reason: collision with root package name */
    public yc.a f13098e;

    /* renamed from: h, reason: collision with root package name */
    public final String f13101h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13102i;
    public boolean j;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13096c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f13099f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13100g = false;

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cd.a, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r2v0, types: [cd.a, java.lang.ref.WeakReference] */
    public j(c cVar, d dVar) {
        yc.a aVar;
        this.f13095b = cVar;
        this.f13094a = dVar;
        String uuid = UUID.randomUUID().toString();
        this.f13101h = uuid;
        this.f13097d = new WeakReference(null);
        e eVar = dVar.f13081g;
        if (eVar != e.HTML && eVar != e.JAVASCRIPT) {
            aVar = new yc.d(uuid, Collections.unmodifiableMap(dVar.f13078d));
        } else {
            WebView webView = dVar.f13076b;
            aVar = new yc.a(uuid);
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            aVar.f15048b = new WeakReference(webView);
        }
        this.f13098e = aVar;
        this.f13098e.f();
        wc.c.f14279c.f14280a.add(this);
        yc.a aVar2 = this.f13098e;
        WebView e10 = aVar2.e();
        String str = aVar2.f15047a;
        JSONObject jSONObject = new JSONObject();
        zc.b.b(jSONObject, "impressionOwner", cVar.f13070a);
        zc.b.b(jSONObject, "mediaEventsOwner", cVar.f13071b);
        zc.b.b(jSONObject, "creativeType", cVar.f13073d);
        zc.b.b(jSONObject, "impressionType", cVar.f13074e);
        zc.b.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(cVar.f13072c));
        wc.g.f14287a.a(e10, "init", jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [cd.a, java.lang.ref.WeakReference] */
    @Override // uc.b
    public final void a(View view) {
        if (!this.f13100g) {
            k4.b(view, "AdView is null");
            if (((View) this.f13097d.get()) != view) {
                this.f13097d = new WeakReference(view);
                yc.a aVar = this.f13098e;
                aVar.getClass();
                aVar.f15051e = System.nanoTime();
                aVar.f15050d = 1;
                Collection<j> unmodifiableCollection = Collections.unmodifiableCollection(wc.c.f14279c.f14280a);
                if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                    for (j jVar : unmodifiableCollection) {
                        if (jVar != this && ((View) jVar.f13097d.get()) == view) {
                            jVar.f13097d.clear();
                        }
                    }
                }
            }
        }
    }

    @Override // uc.b
    public final void b() {
        boolean z10;
        Date date;
        boolean z11;
        if (this.f13099f) {
            return;
        }
        this.f13099f = true;
        wc.c cVar = wc.c.f14279c;
        if (cVar.f14281b.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.f14281b.add(this);
        if (!z10) {
            e7.c b10 = e7.c.b();
            b10.getClass();
            wc.b bVar = wc.b.A;
            bVar.f14284z = b10;
            bVar.f14282x = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100 || bVar.b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar.f14283y = z11;
            bVar.a(z11);
            ad.b.f678g.getClass();
            ad.b.b();
            vc.a aVar = (vc.a) b10.f4401z;
            aVar.f13506e = aVar.a();
            aVar.b();
            aVar.f13502a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, aVar);
        }
        float f3 = e7.c.b().f4399x;
        yc.a aVar2 = this.f13098e;
        wc.g.f14287a.a(aVar2.e(), "setDeviceVolume", Float.valueOf(f3), aVar2.f15047a);
        yc.a aVar3 = this.f13098e;
        Date date2 = wc.a.C.f14277y;
        if (date2 != null) {
            date = (Date) date2.clone();
        } else {
            date = null;
        }
        aVar3.a(date);
        this.f13098e.b(this, this.f13094a);
    }
}
