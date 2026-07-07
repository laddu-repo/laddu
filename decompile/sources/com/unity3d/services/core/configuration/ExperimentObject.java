package com.unity3d.services.core.configuration;

import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ExperimentObject {
    private static final String APPLIED_KEY = "applied";
    private static final String VALUE_KEY = "value";
    private final JSONObject _experimentData;

    public ExperimentObject(JSONObject jSONObject) {
        this._experimentData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public ExperimentAppliedRule getAppliedRule() {
        ExperimentAppliedRule experimentAppliedRule = ExperimentAppliedRule.NEXT;
        String optString = this._experimentData.optString(APPLIED_KEY);
        if (!optString.isEmpty()) {
            try {
                return ExperimentAppliedRule.valueOf(optString.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return experimentAppliedRule;
            }
        }
        return experimentAppliedRule;
    }

    public boolean getBooleanValue() {
        return this._experimentData.optBoolean(VALUE_KEY);
    }

    public String getStringValue() {
        return this._experimentData.optString(VALUE_KEY);
    }
}
