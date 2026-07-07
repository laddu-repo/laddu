package com.unity3d.ads.core.data.manager;

import a2.e2;
import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.k4;
import e7.c;
import kotlin.jvm.internal.k;
import uc.d;
import uc.g;
import uc.h;
import uc.i;
import uc.j;
import wc.b;
import wc.e;
import wc.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidOmidManager implements OmidManager {
    /* JADX WARN: Type inference failed for: r2v1, types: [ob.a, java.lang.Object] */
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(Context context) {
        boolean z10;
        k.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        k4.b(applicationContext, "Application Context cannot be null");
        e2 e2Var = tc.a.f12708a;
        if (!e2Var.f217b) {
            e2Var.f217b = true;
            c b10 = c.b();
            Object obj = b10.f4400y;
            b10.f4401z = new vc.a(new Handler(), applicationContext, new Object(), b10);
            boolean z11 = applicationContext instanceof Application;
            if (z11) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(b.A);
            }
            c9.a.f1988c = (UiModeManager) applicationContext.getSystemService("uimode");
            WindowManager windowManager = zc.b.f15329a;
            zc.b.f15331c = applicationContext.getResources().getDisplayMetrics().density;
            zc.b.f15329a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new BroadcastReceiver(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            f.f14285b.f14286a = applicationContext.getApplicationContext();
            wc.a aVar = wc.a.C;
            e eVar = aVar.A;
            if (!aVar.f14278z) {
                eVar.getClass();
                if (z11) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(eVar);
                }
                eVar.f14284z = aVar;
                eVar.f14282x = true;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (runningAppProcessInfo.importance == 100) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar.f14283y = z10;
                aVar.B = eVar.f14283y;
                aVar.f14278z = true;
            }
        }
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public uc.a createAdEvents(uc.b adSession) {
        k.e(adSession, "adSession");
        j jVar = (j) adSession;
        yc.a aVar = jVar.f13098e;
        if (aVar.f15049c == null) {
            if (!jVar.f13100g) {
                uc.a aVar2 = new uc.a(jVar);
                aVar.f15049c = aVar2;
                return aVar2;
            }
            throw new IllegalStateException("AdSession is finished");
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public uc.b createAdSession(uc.c adSessionConfiguration, d context) {
        k.e(adSessionConfiguration, "adSessionConfiguration");
        k.e(context, "context");
        if (tc.a.f12708a.f217b) {
            return new j(adSessionConfiguration, context);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public uc.c createAdSessionConfiguration(uc.f creativeType, g impressionType, h owner, h mediaEventsOwner, boolean z10) {
        k.e(creativeType, "creativeType");
        k.e(impressionType, "impressionType");
        k.e(owner, "owner");
        k.e(mediaEventsOwner, "mediaEventsOwner");
        if (owner != h.NONE) {
            uc.f fVar = uc.f.DEFINED_BY_JAVASCRIPT;
            h hVar = h.NATIVE;
            if (creativeType == fVar && owner == hVar) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (impressionType == g.DEFINED_BY_JAVASCRIPT && owner == hVar) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new uc.c(creativeType, impressionType, owner, mediaEventsOwner, z10);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public d createHtmlAdSessionContext(i iVar, WebView webView, String str, String str2) {
        k4.b(iVar, "Partner is null");
        k4.b(webView, "WebView is null");
        if (str2 != null && str2.length() > 256) {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
        return new d(iVar, webView, str, str2, uc.e.HTML);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public d createJavaScriptAdSessionContext(i iVar, WebView webView, String str, String str2) {
        k4.b(iVar, "Partner is null");
        k4.b(webView, "WebView is null");
        if (str2 != null && str2.length() > 256) {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
        return new d(iVar, webView, str, str2, uc.e.JAVASCRIPT);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public String getVersion() {
        return "1.4.9-Unity3d";
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return tc.a.f12708a.f217b;
    }
}
