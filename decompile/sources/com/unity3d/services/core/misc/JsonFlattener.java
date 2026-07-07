package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class JsonFlattener {
    private final JSONObject _jsonData;

    public JsonFlattener(JSONObject jSONObject) {
        this._jsonData = jSONObject;
    }

    private boolean shouldIncludeKey(String str, List<String> list, List<String> list2) {
        if (list2.contains(str) || list.size() <= 0) {
            return false;
        }
        return list.contains(str);
    }

    public JSONObject flattenJson(String str, JsonFlattenerRules jsonFlattenerRules) {
        if (jsonFlattenerRules == null) {
            return new JSONObject();
        }
        return flattenJson(str, jsonFlattenerRules.getTopLevelToInclude(), jsonFlattenerRules.getReduceKeys(), jsonFlattenerRules.getSkipKeys());
    }

    public JSONObject flattenJson(String str, List<String> list, List<String> list2, List<String> list3) {
        List<String> list4;
        List<String> list5;
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> keys = this._jsonData.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (shouldIncludeKey(next, list, list3)) {
                    Object opt = this._jsonData.opt(next);
                    if (opt instanceof JSONObject) {
                        String str2 = str;
                        list4 = list2;
                        list5 = list3;
                        new JsonFlattener((JSONObject) opt).flattenJson(str2, next, jSONObject, list4, list5);
                        str = str2;
                    } else {
                        list4 = list2;
                        list5 = list3;
                        jSONObject.put(next, opt);
                    }
                    list2 = list4;
                    list3 = list5;
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            DeviceLog.error("Could not flatten JSON: %s", e10.getMessage());
            return jSONObject;
        }
    }

    public void flattenJson(String str, String str2, JSONObject jSONObject, List<String> list, List<String> list2) {
        String str3;
        String str4;
        JSONObject jSONObject2;
        List<String> list3;
        List<String> list4;
        Iterator<String> keys = this._jsonData.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!list2.contains(next)) {
                Object obj = this._jsonData.get(next);
                if (list.contains(next)) {
                    str3 = str2;
                } else {
                    str3 = str2 + str + next;
                }
                if (obj instanceof JSONObject) {
                    str4 = str;
                    jSONObject2 = jSONObject;
                    list3 = list;
                    list4 = list2;
                    new JsonFlattener((JSONObject) obj).flattenJson(str4, str3, jSONObject2, list3, list4);
                } else {
                    str4 = str;
                    jSONObject2 = jSONObject;
                    list3 = list;
                    list4 = list2;
                    jSONObject2.put(str3, obj);
                }
                str = str4;
                jSONObject = jSONObject2;
                list = list3;
                list2 = list4;
            }
        }
    }
}
