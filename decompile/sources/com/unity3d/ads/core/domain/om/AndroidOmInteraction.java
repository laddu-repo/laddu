package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.jvm.internal.k;
import org.json.JSONObject;
import uc.f;
import uc.g;
import uc.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class AndroidOmInteraction implements OmInteraction {
    private final f getCreativeType(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("creativeType");
        if (optInt != 1) {
            if (optInt != 2) {
                if (optInt != 3) {
                    if (optInt != 4) {
                        if (optInt == 5) {
                            return f.AUDIO;
                        }
                        throw new IllegalArgumentException("Invalid creativeType");
                    }
                    return f.VIDEO;
                }
                return f.NATIVE_DISPLAY;
            }
            return f.HTML_DISPLAY;
        }
        return f.DEFINED_BY_JAVASCRIPT;
    }

    private final g getImpressionType(JSONObject jSONObject) {
        switch (jSONObject.optInt("impressionType")) {
            case 1:
                return g.DEFINED_BY_JAVASCRIPT;
            case 2:
                return g.UNSPECIFIED;
            case 3:
                return g.LOADED;
            case 4:
                return g.BEGIN_TO_RENDER;
            case 5:
                return g.ONE_PIXEL;
            case 6:
                return g.VIEWABLE;
            case 7:
                return g.AUDIBLE;
            case 8:
                return g.OTHER;
            default:
                throw new IllegalArgumentException("Invalid impressionType");
        }
    }

    private final h getImpressionsOwner(JSONObject jSONObject) {
        h hVar = h.NONE;
        try {
            int optInt = jSONObject.optInt("impressionOwner");
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt == 3) {
                        return hVar;
                    }
                    throw new IllegalArgumentException("Invalid impressionOwner");
                }
                return h.NATIVE;
            }
            return h.JAVASCRIPT;
        } catch (IllegalArgumentException unused) {
            return hVar;
        }
    }

    private final h getMediaEventsOwner(JSONObject jSONObject) {
        h hVar = h.NONE;
        try {
            int optInt = jSONObject.optInt("mediaEventsOwner");
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt == 3) {
                        return hVar;
                    }
                    throw new IllegalArgumentException("Invalid mediaEventsOwner");
                }
                return h.NATIVE;
            }
            return h.JAVASCRIPT;
        } catch (IllegalArgumentException unused) {
            return hVar;
        }
    }

    private final h getVideoEventsOwner(JSONObject jSONObject) {
        h hVar = h.NONE;
        try {
            int optInt = jSONObject.optInt("videoEventsOwner");
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt == 3) {
                        return hVar;
                    }
                    throw new IllegalArgumentException("Invalid videoEventsOwner");
                }
                return h.NATIVE;
            }
            return h.JAVASCRIPT;
        } catch (IllegalArgumentException unused) {
            return hVar;
        }
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public OmidOptions getOMidOptions(JSONObject options) {
        k.e(options, "options");
        return new OmidOptions(options.optBoolean("isolateVerificationScripts"), getImpressionsOwner(options), getVideoEventsOwner(options), options.optString("customReferenceData"), getImpressionType(options), getCreativeType(options), getMediaEventsOwner(options));
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public WebView getWebview(AdObject adObject) {
        k.e(adObject, "adObject");
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer instanceof AndroidFullscreenWebViewAdPlayer) {
            return ((AndroidFullscreenWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        if (adPlayer instanceof AndroidEmbeddableWebViewAdPlayer) {
            return ((AndroidEmbeddableWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        return null;
    }
}
