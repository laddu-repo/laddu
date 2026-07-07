package a2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Pair;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.window.SurfaceSyncGroup;
import com.google.android.gms.internal.measurement.j5;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.core.webview.WebView;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f213x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f214y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f215z;

    public /* synthetic */ e1(dc.a aVar, LinearLayout linearLayout, FrameLayout frameLayout, View view) {
        this.f213x = 14;
        this.f214y = linearLayout;
        this.f215z = frameLayout;
        this.A = view;
    }

    private final void a() {
        JSONObject optJSONObject;
        mc.j jVar = (mc.j) this.f214y;
        String str = (String) this.f215z;
        nc.g gVar = (nc.g) this.A;
        j1.f0 f0Var = jVar.f8813a;
        nb.b bVar = (nb.b) ((bc.a) f0Var.f6907y).get();
        if (bVar != null) {
            JSONObject jSONObject = gVar.f9621e;
            if (jSONObject.length() >= 1) {
                JSONObject jSONObject2 = gVar.f9618b;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (optString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) f0Var.f6908z)) {
                        try {
                            if (optString.equals(((Map) f0Var.f6908z).get(str))) {
                                return;
                            }
                            ((Map) f0Var.f6908z).put(str, optString);
                            Bundle bundle = new Bundle();
                            bundle.putString("arm_key", str);
                            bundle.putString("arm_value", jSONObject2.optString(str));
                            bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                            bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                            bundle.putString("group", optJSONObject.optString("group"));
                            nb.c cVar = (nb.c) bVar;
                            cVar.a("fp", "personalization_assignment", bundle);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("_fpid", optString);
                            cVar.a("fp", "_fpc", bundle2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [f2.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, ic.s] */
    @Override // java.lang.Runnable
    public final void run() {
        AttachedSurfaceControl rootSurfaceControl;
        boolean add;
        switch (this.f213x) {
            case 0:
                f1 f1Var = (f1) this.f214y;
                db.h0 h0Var = (db.h0) this.f215z;
                q2.c0 c0Var = (q2.c0) this.A;
                b2.f fVar = f1Var.f230c;
                db.c1 g10 = h0Var.g();
                androidx.lifecycle.d dVar = fVar.A;
                r1.u0 u0Var = fVar.D;
                u0Var.getClass();
                dVar.getClass();
                dVar.f897b = db.k0.k(g10);
                if (!g10.isEmpty()) {
                    dVar.f900e = (q2.c0) g10.get(0);
                    c0Var.getClass();
                    dVar.f901f = c0Var;
                }
                if (((q2.c0) dVar.f899d) == null) {
                    dVar.f899d = androidx.lifecycle.d.g(u0Var, (db.k0) dVar.f897b, (q2.c0) dVar.f900e, (r1.a1) dVar.f896a);
                }
                dVar.n(u0Var.y0());
                return;
            case 1:
                o1 o1Var = (o1) this.f214y;
                Pair pair = (Pair) this.f215z;
                ((b2.f) o1Var.f359y.f385i).K(((Integer) pair.first).intValue(), (q2.c0) pair.second, (Exception) this.A);
                return;
            case 2:
                ((LoadOperationState) this.f214y).lambda$onUnityAdsFailedToLoad$0((UnityAds.UnityAdsLoadError) this.f215z, (String) this.A);
                return;
            case 3:
                ((IUnityAdsInitializationListener) this.f214y).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.f215z, (String) this.A);
                return;
            case 4:
                WebView.b((WebView) this.f214y, (String) this.f215z, (ValueCallback) this.A);
                return;
            case 5:
                Context context = (Context) this.f214y;
                StringBuilder sb2 = (StringBuilder) this.f215z;
                dd.d dVar2 = (dd.d) this.A;
                ?? obj = new Object();
                obj.f6783z = new AtomicReference(null);
                obj.A = new k7.c(3);
                obj.f6782y = context;
                String sb3 = sb2.toString();
                dd.b bVar = new dd.b(dVar2);
                String m9 = h8.c.m("evgeniiJsEvaluator.returnResultToJava(eval('try{", sb3.replace("\\", "\\\\").replace("'", "\\'").replace("</", "<\\/").replace("\n", "\\n").replace("\r", "\\r"), "}catch(e){\"evgeniiJsEvaluatorException\"+e}'));");
                ((AtomicReference) obj.f6783z).set(bVar);
                if (((k7.d) obj.f6781x) == null) {
                    Context context2 = (Context) obj.f6782y;
                    k7.d dVar3 = new k7.d(3);
                    android.webkit.WebView webView = new android.webkit.WebView(context2);
                    dVar3.f7747y = webView;
                    webView.setWillNotDraw(true);
                    WebSettings settings = webView.getSettings();
                    settings.setJavaScriptEnabled(true);
                    settings.setDefaultTextEncodingName("utf-8");
                    webView.addJavascriptInterface(new c8.a(obj), "evgeniiJsEvaluator");
                    obj.f6781x = dVar3;
                }
                k7.d dVar4 = (k7.d) obj.f6781x;
                dVar4.getClass();
                try {
                    String encodeToString = Base64.encodeToString(("<script>" + m9 + "</script>").getBytes("UTF-8"), 0);
                    ((android.webkit.WebView) dVar4.f7747y).loadUrl("data:text/html;charset=utf-8;base64," + encodeToString);
                    return;
                } catch (UnsupportedEncodingException e10) {
                    e10.printStackTrace();
                    return;
                }
            case 6:
                e1.m mVar = (e1.m) this.f214y;
                a8.e eVar = (a8.e) this.f215z;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.A;
                try {
                    e1.s a10 = a8.d.a(mVar.f4172a);
                    if (a10 != null) {
                        e1.r rVar = (e1.r) ((e1.j) a10.f4158b);
                        synchronized (rVar.f4183d) {
                            rVar.f4185f = threadPoolExecutor;
                        }
                        ((e1.j) a10.f4158b).a(new e1.l(eVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    eVar.v(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 7:
                f2.l lVar = (f2.l) this.f214y;
                this.f215z.K(lVar.f4675a, lVar.f4676b, (Exception) this.A);
                return;
            case 8:
                i4.x xVar = (i4.x) this.f214y;
                i4.s sVar = (i4.s) this.f215z;
                KeyEvent keyEvent = (KeyEvent) this.A;
                i4.b0 b0Var = xVar.f6592b;
                if (b0Var.i(sVar)) {
                    b0Var.b(keyEvent, false, false);
                } else {
                    i4.o0 o0Var = b0Var.f6308h;
                    j4.d0 d0Var = sVar.f6539a;
                    d0Var.getClass();
                    o0Var.getClass();
                    o0Var.H(1, new i4.e0(o0Var, 7), d0Var, true);
                }
                xVar.f6591a = null;
                return;
            case 9:
                i4.b0 b0Var2 = (i4.b0) this.f214y;
                i4.u0 u0Var2 = (i4.u0) this.f215z;
                i4.t tVar = (i4.t) this.A;
                if (!b0Var2.j()) {
                    i4.l1 l1Var = b0Var2.f6318t;
                    u0Var2.getClass();
                    lg.c.r(l1Var, tVar);
                    return;
                }
                return;
            case 10:
                ic.g gVar = (ic.g) this.f214y;
                Intent intent = (Intent) this.f215z;
                s9.h hVar = (s9.h) this.A;
                try {
                    gVar.b(intent);
                    return;
                } finally {
                    hVar.a(null);
                }
            case 11:
                ViewGroup container = (ViewGroup) this.f214y;
                View view = (View) this.f215z;
                j1.f this$0 = (j1.f) this.A;
                kotlin.jvm.internal.k.e(container, "$container");
                kotlin.jvm.internal.k.e(this$0, "this$0");
                container.endViewTransition(view);
                ((j1.a1) this$0.f6905c.f4301y).c(this$0);
                return;
            case 12:
                lc.c cVar = (lc.c) this.f214y;
                SurfaceView surfaceView = (SurfaceView) this.f215z;
                j2.h hVar2 = (j2.h) this.A;
                cVar.getClass();
                rootSurfaceControl = surfaceView.getRootSurfaceControl();
                if (rootSurfaceControl != null) {
                    SurfaceSyncGroup p10 = c2.z.p();
                    cVar.f8328x = p10;
                    add = p10.add(rootSurfaceControl, new k4.z(0));
                    u1.c.g(add);
                    hVar2.run();
                    rootSurfaceControl.applyTransactionOnDraw(k4.e.j());
                    return;
                }
                return;
            case 13:
                l8.a aVar = (l8.a) this.f214y;
                g8.i iVar = (g8.i) this.f215z;
                String str = iVar.f5539a;
                g8.h hVar3 = (g8.h) this.A;
                aVar.getClass();
                Logger logger = l8.a.f8310f;
                try {
                    h8.f a11 = aVar.f8313c.a(str);
                    if (a11 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((n8.g) aVar.f8315e).K(new i4.h0(aVar, iVar, ((e8.c) a11).a(hVar3), 4));
                    }
                    return;
                } catch (Exception e11) {
                    logger.warning("Error scheduling event " + e11.getMessage());
                    return;
                }
            case 14:
                LinearLayout linearLayout = (LinearLayout) this.f214y;
                FrameLayout frameLayout = (FrameLayout) this.f215z;
                View view2 = (View) this.A;
                int[] iArr = new int[2];
                linearLayout.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                frameLayout.getLocationOnScreen(iArr2);
                float f3 = iArr[0] - iArr2[0];
                float width = linearLayout.getWidth();
                if (view2.getWidth() == 0) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.width = linearLayout.getWidth();
                    view2.setLayoutParams(layoutParams);
                    view2.setTranslationX(f3);
                    return;
                }
                view2.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view2.animate().translationX(f3).scaleX(width / view2.getWidth()).setDuration(400L).setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)).withLayer().start();
                return;
            case 15:
                m2.f fVar2 = (m2.f) this.f214y;
                String str3 = (String) this.f215z;
                m2.e eVar2 = (m2.e) this.A;
                m2.q qVar = (m2.q) fVar2.f8467z.f7139y;
                m2.s sVar2 = qVar.f8533d;
                qVar.f8532c = str3;
                m2.h0 m10 = eVar2.m();
                if (m10 != null) {
                    sVar2.A.F.f8554z.put(Integer.valueOf(eVar2.e()), m10);
                    sVar2.S = true;
                }
                sVar2.n();
                return;
            case 16:
                m2.y yVar = (m2.y) this.f214y;
                byte[] bArr = (byte[]) this.f215z;
                yVar.getClass();
                try {
                    yVar.f8549x.write(bArr);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
                a();
                return;
            case 18:
                UnityAds.show$lambda$16$lambda$15$lambda$14((IUnityAdsShowListener) this.f214y, (String) this.f215z, (Throwable) this.A);
                return;
            case 19:
                hb.x xVar2 = (hb.x) this.f214y;
                hb.d0 d0Var2 = (hb.d0) this.f215z;
                try {
                    try {
                        d0Var2.m(((hb.p) this.A).apply(j5.j(xVar2)));
                        return;
                    } catch (Throwable th2) {
                        d0Var2.l(th2);
                        return;
                    }
                } catch (Error e12) {
                    e = e12;
                    d0Var2.l(e);
                    return;
                } catch (CancellationException unused2) {
                    d0Var2.cancel(false);
                    return;
                } catch (RuntimeException e13) {
                    e = e13;
                    d0Var2.l(e);
                    return;
                } catch (ExecutionException e14) {
                    e = e14;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    d0Var2.l(e);
                    return;
                }
            default:
                hb.d0 d0Var3 = (hb.d0) this.f214y;
                c0 c0Var2 = (c0) this.f215z;
                i4.s1 s1Var = (i4.s1) this.A;
                try {
                    if (!(d0Var3.f6026x instanceof hb.a)) {
                        c0Var2.run();
                        d0Var3.k(s1Var);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    d0Var3.l(th3);
                    return;
                }
        }
    }

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, int i6) {
        this.f213x = i6;
        this.f214y = obj;
        this.f215z = obj2;
        this.A = obj3;
    }

    public /* synthetic */ e1(l8.a aVar, g8.i iVar, com.unity3d.ads.adplayer.b bVar, g8.h hVar) {
        this.f213x = 13;
        this.f214y = aVar;
        this.f215z = iVar;
        this.A = hVar;
    }
}
