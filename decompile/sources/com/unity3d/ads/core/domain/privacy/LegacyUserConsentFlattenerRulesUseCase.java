package com.unity3d.ads.core.domain.privacy;

import a8.g;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import ie.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(k.u("privacy", "unity", "pipl"), g.m("value"), k.u("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
