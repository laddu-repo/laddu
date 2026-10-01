package com.unity3d.ads.core.extensions;

import com.unity3d.services.store.JsonSerializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import org.json.JSONArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class JsonSerializableExtensionsKt {
    public static final JSONArray toJsonArray(List<? extends JsonSerializable> list) {
        k.e(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends JsonSerializable> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJson());
        }
        return jSONArray;
    }
}
