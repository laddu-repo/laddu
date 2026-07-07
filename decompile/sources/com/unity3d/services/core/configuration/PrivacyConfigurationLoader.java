package com.unity3d.services.core.configuration;

import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class PrivacyConfigurationLoader implements IConfigurationLoader {
    private final IConfigurationLoader _configurationLoader;
    private final ConfigurationRequestFactory _configurationRequestFactory;
    private final HttpClient _httpClient;
    private final PrivacyConfigStorage _privacyConfigStorage;

    public PrivacyConfigurationLoader(IConfigurationLoader iConfigurationLoader, ConfigurationRequestFactory configurationRequestFactory, PrivacyConfigStorage privacyConfigStorage, HttpClient httpClient) {
        this._configurationLoader = iConfigurationLoader;
        this._configurationRequestFactory = configurationRequestFactory;
        this._privacyConfigStorage = privacyConfigStorage;
        this._httpClient = httpClient;
    }

    private void load(IPrivacyConfigurationListener iPrivacyConfigurationListener) {
        try {
            HttpRequest httpRequest = WebRequestToHttpRequestKt.toHttpRequest(this._configurationRequestFactory.getWebRequest());
            InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestStart();
            HttpResponse executeBlocking = this._httpClient.executeBlocking(httpRequest);
            try {
                if (executeBlocking.getStatusCode() / 100 == 2) {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(true);
                    iPrivacyConfigurationListener.onSuccess(new PrivacyConfig(new JSONObject(executeBlocking.getBody().toString())));
                    return;
                }
                if (executeBlocking.getStatusCode() == 423) {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                    iPrivacyConfigurationListener.onError(PrivacyCallError.LOCKED_423, "Game ID is disabled " + ClientProperties.getGameId());
                    return;
                }
                InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                iPrivacyConfigurationListener.onError(PrivacyCallError.NETWORK_ISSUE, "Privacy request failed with code: " + executeBlocking.getStatusCode());
            } catch (Exception unused) {
                InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                iPrivacyConfigurationListener.onError(PrivacyCallError.NETWORK_ISSUE, "Could not create web request");
            }
        } catch (Exception e10) {
            iPrivacyConfigurationListener.onError(PrivacyCallError.NETWORK_ISSUE, "Could not create web request: " + e10);
        }
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public Configuration getLocalConfiguration() {
        return this._configurationLoader.getLocalConfiguration();
    }

    @Override // com.unity3d.services.core.configuration.IConfigurationLoader
    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this._privacyConfigStorage.getPrivacyConfig().getPrivacyStatus() == PrivacyConfigStatus.UNKNOWN) {
            load(new IPrivacyConfigurationListener() { // from class: com.unity3d.services.core.configuration.PrivacyConfigurationLoader.1
                @Override // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
                public void onError(PrivacyCallError privacyCallError, String str) {
                    DeviceLog.warning("Couldn't fetch privacy configuration: " + str);
                    PrivacyConfigurationLoader.this._privacyConfigStorage.setPrivacyConfig(new PrivacyConfig());
                    if (privacyCallError == PrivacyCallError.LOCKED_423) {
                        atomicBoolean.set(true);
                    }
                }

                @Override // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
                public void onSuccess(PrivacyConfig privacyConfig) {
                    PrivacyConfigurationLoader.this._privacyConfigStorage.setPrivacyConfig(privacyConfig);
                }
            });
        }
        if (!atomicBoolean.get()) {
            this._configurationLoader.loadConfiguration(iConfigurationLoaderListener);
            return;
        }
        throw new AbortRetryException("Game is disabled");
    }
}
