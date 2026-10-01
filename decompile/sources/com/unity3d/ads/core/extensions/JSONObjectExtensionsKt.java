package com.unity3d.ads.core.extensions;

import cf.a;
import cf.j;
import cf.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class JSONObjectExtensionsKt {
    public static final Map<String, Object> toBuiltInMap(JSONObject jSONObject) {
        k.e(jSONObject, "<this>");
        Iterator<String> keys = jSONObject.keys();
        k.d(keys, "keys()");
        j K = l.K(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((a) K).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object opt = jSONObject.opt((String) next);
            if (opt == null || String.valueOf(opt).equals("undefined") || String.valueOf(opt).equals("null")) {
                opt = null;
            }
            linkedHashMap.put(next, opt);
        }
        return linkedHashMap;
    }
}
