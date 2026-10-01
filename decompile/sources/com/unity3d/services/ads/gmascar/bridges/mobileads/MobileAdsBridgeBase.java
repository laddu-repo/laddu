package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class MobileAdsBridgeBase extends GenericBridge implements IMobileAdsBridge {
    public static final String initializationStatusMethodName = "getInitializationStatus";
    public static final String initializeMethodName = "initialize";

    public MobileAdsBridgeBase(Map<String, Class<?>[]> map) {
        super(map);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.google.android.gms.ads.MobileAds";
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public Object getInitializationStatus() {
        return callNonVoidMethod(initializationStatusMethodName, null, new Object[0]);
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public String getVersionString() {
        Object callNonVoidMethod = callNonVoidMethod(getVersionMethodName(), null, new Object[0]);
        if (callNonVoidMethod == null) {
            return "0.0.0";
        }
        return callNonVoidMethod.toString();
    }

    public abstract boolean hasSCARBiddingSupport();

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public void initialize(Context context, Object obj) {
        callVoidMethod(initializeMethodName, null, context, obj);
    }
}
