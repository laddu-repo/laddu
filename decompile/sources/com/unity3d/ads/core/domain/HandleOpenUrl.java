package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface HandleOpenUrl {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(HandleOpenUrl handleOpenUrl, AdObject adObject, String str, String str2, String str3, Map map, boolean z10, c cVar, int i6, Object obj) {
            boolean z11;
            if (obj == null) {
                if ((i6 & 8) != 0) {
                    str3 = "android.intent.action.VIEW";
                }
                String str4 = str3;
                if ((i6 & 16) != 0) {
                    map = null;
                }
                Map map2 = map;
                if ((i6 & 32) != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                return handleOpenUrl.invoke(adObject, str, str2, str4, map2, z11, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object invoke(AdObject adObject, String str, String str2, String str3, Map<String, ? extends Object> map, boolean z10, c cVar);
}
