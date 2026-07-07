package com.unity3d.ads.core.extensions;

import af.c;
import android.support.v4.media.session.b;
import ie.l;
import ie.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import org.json.JSONArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) {
        k.e(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = jSONArray.get(i6);
            k.c(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List list = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (list == null) {
                list = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            k.d(string, "header.getString(1)");
            list.add(string);
            String string2 = jSONArray2.getString(0);
            k.d(string2, "header.getString(0)");
            linkedHashMap.put(string2, list);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        k.e(jSONArray, "<this>");
        c w10 = b.w(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(l.x(w10, 10));
        Iterator it = w10.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((v) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
