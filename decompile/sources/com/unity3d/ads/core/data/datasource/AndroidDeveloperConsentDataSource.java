package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage publicStorage;

    public AndroidDeveloperConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage publicStorage) {
        k.e(flattenerRulesUseCase, "flattenerRulesUseCase");
        k.e(publicStorage, "publicStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = publicStorage;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(String str, boolean z10) {
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        k.d(newBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl _create = companion._create(newBuilder);
        _create.setType(getDeveloperConsentType(str));
        if (_create.getType() == DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            _create.setCustomType(str);
        }
        _create.setValue(getDeveloperConsentChoice(Boolean.valueOf(z10)));
        return _create._build();
    }

    private final List<DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() {
        DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption;
        ArrayList arrayList = new ArrayList();
        JSONObject fetchData = fetchData();
        Iterator<String> keys = fetchData.keys();
        k.d(keys, "data.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = fetchData.get(key);
            if (obj instanceof Boolean) {
                k.d(key, "key");
                developerConsentOption = createDeveloperConsentOption(key, ((Boolean) obj).booleanValue());
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
                        k.d(key, "key");
                        developerConsentOption = createDeveloperConsentOption(key, Boolean.parseBoolean(str));
                    }
                }
                developerConsentOption = null;
            }
            if (developerConsentOption != null) {
                arrayList.add(developerConsentOption);
            }
        }
        return arrayList;
    }

    private final JSONObject fetchData() {
        if (this.publicStorage.getData() != null) {
            JSONObject flattenJson = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
            k.d(flattenJson, "flattener.flattenJson(\".… flattenerRulesUseCase())");
            return flattenJson;
        }
        return new JSONObject();
    }

    private final DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(Boolean bool) {
        if (k.a(bool, Boolean.TRUE)) {
            return DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE;
        }
        if (k.a(bool, Boolean.FALSE)) {
            return DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE;
        }
        return DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1998919769:
                    if (str.equals("user.nonbehavioral")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                    }
                    break;
                case -1078801183:
                    if (str.equals("pipl.consent")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                    }
                    break;
                case -5454905:
                    if (str.equals(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY)) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                    }
                    break;
                case 194451659:
                    if (str.equals("gdpr.consent")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                    }
                    break;
                case 519433140:
                    if (str.equals("privacy.consent")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                    }
                    break;
                case 2033752033:
                    if (str.equals("privacy.useroveragelimit")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                    }
                    break;
            }
            return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
        }
        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
    }

    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        k.d(newBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl _create = companion._create(newBuilder);
        _create.addAllOptions(_create.getOptions(), developerConsentList());
        return _create._build();
    }
}
