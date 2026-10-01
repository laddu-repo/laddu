package com.unity3d.services.ads.offerwall;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.core.log.DeviceLog;
import gf.c0;
import gf.f0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import kf.q0;
import kf.s0;
import kf.u0;
import kf.x0;
import kf.y0;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OfferwallAdapterBridge {
    private final q0 _offerwallEventFlow;
    private final u0 offerwallEventFlow;
    private final HashMap<String, Object> placementsMap;
    private final c0 scope;

    public OfferwallAdapterBridge(c0 scope) {
        k.e(scope, "scope");
        this.scope = scope;
        x0 b10 = y0.b(0, 7);
        this._offerwallEventFlow = b10;
        this.offerwallEventFlow = new s0(b10);
        this.placementsMap = new HashMap<>();
    }

    private final Object getPlacement(String str) {
        return Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("getPlacement", String.class, Class.forName("com.tapjoy.TJPlacementListener")).invoke(null, str, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener()));
    }

    private final String getPlacementName(Object obj) {
        return (String) obj.getClass().getDeclaredMethod("getName", null).invoke(obj, null);
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return new a(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object tapjoyPlacementListener$lambda$0(OfferwallAdapterBridge this$0, Object obj, Method method, Object[] objArr) {
        String str;
        k.e(this$0, "this$0");
        String name = method.getName();
        if (name != null) {
            boolean z10 = false;
            switch (name.hashCode()) {
                case -1508301783:
                    if (name.equals("onContentReady")) {
                        Object obj2 = objArr[0];
                        k.d(obj2, "args[0]");
                        String placementName = this$0.getPlacementName(obj2);
                        DeviceLog.debug("Placement content ready: " + placementName);
                        f0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(this$0, placementName, null), 3);
                        break;
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        Object obj3 = objArr[0];
                        k.d(obj3, "args[0]");
                        String placementName2 = this$0.getPlacementName(obj3);
                        DeviceLog.debug("Placement content dismissed: " + placementName2);
                        f0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(this$0, placementName2, null), 3);
                        return null;
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        Object obj4 = objArr[0];
                        k.d(obj4, "args[0]");
                        String placementName3 = this$0.getPlacementName(obj4);
                        DeviceLog.debug("Placement content shown: " + placementName3);
                        f0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(this$0, placementName3, null), 3);
                        return null;
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        Object placementObj = objArr[0];
                        k.d(placementObj, "placementObj");
                        String placementName4 = this$0.getPlacementName(placementObj);
                        Boolean bool = (Boolean) placementObj.getClass().getDeclaredMethod("isContentAvailable", null).invoke(placementObj, null);
                        if (bool != null) {
                            z10 = bool.booleanValue();
                        }
                        DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + z10);
                        f0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(z10, this$0, placementName4, null), 3);
                        return null;
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        Object obj5 = objArr[0];
                        k.d(obj5, "args[0]");
                        String placementName5 = this$0.getPlacementName(obj5);
                        HashMap<String, Object> hashMap = this$0.placementsMap;
                        if (placementName5 == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str = placementName5;
                        }
                        hashMap.remove(str);
                        Object obj6 = objArr[1];
                        DeviceLog.error("Placement request failed: " + placementName5 + " - errorCode: " + ((Integer) obj6.getClass().getField("code").get(obj6)) + ", errorMessage: " + ((String) obj6.getClass().getField("message").get(obj6)));
                        f0.w(this$0.scope, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$2(this$0, placementName5, null), 3);
                        return null;
                    }
                    break;
            }
        }
        return null;
    }

    public final u0 getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    public final String getVersion() {
        try {
            String str = (String) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod(MobileAdsBridge.versionMethodName, null).invoke(null, null);
            if (str == null) {
                return "0.0.0";
            }
            return str;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }

    public final boolean isAdReady(String placementName) {
        Method method;
        k.e(placementName, "placementName");
        Object placement = getPlacement(placementName);
        Object obj = null;
        if (placement != null) {
            method = placement.getClass().getDeclaredMethod("isContentReady", null);
        } else {
            method = null;
        }
        if (method != null) {
            obj = method.invoke(placement, null);
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isConnected() {
        try {
            Boolean bool = (Boolean) Class.forName("com.tapjoy.Tapjoy").getDeclaredMethod("isConnected", null).invoke(null, null);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void loadAd(String placementName) {
        Method method;
        k.e(placementName, "placementName");
        Object placement = getPlacement(placementName);
        this.placementsMap.put(placementName, placement);
        if (placement != null) {
            method = placement.getClass().getDeclaredMethod("requestContent", null);
        } else {
            method = null;
        }
        if (method != null) {
            method.invoke(placement, null);
        }
    }

    public final void showAd(String placementName) {
        Method method;
        Object obj;
        boolean z10;
        Method method2;
        k.e(placementName, "placementName");
        Object obj2 = this.placementsMap.get(placementName);
        if (obj2 != null) {
            method = obj2.getClass().getDeclaredMethod("isContentAvailable", null);
        } else {
            method = null;
        }
        if (method != null) {
            obj = method.invoke(obj2, null);
        } else {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            if (obj2 != null) {
                method2 = obj2.getClass().getDeclaredMethod("showContent", null);
            } else {
                method2 = null;
            }
            if (method2 != null) {
                method2.invoke(obj2, null);
            }
        } else {
            f0.w(this.scope, null, new OfferwallAdapterBridge$showAd$1(this, placementName, null), 3);
        }
        this.placementsMap.remove(placementName);
    }
}
