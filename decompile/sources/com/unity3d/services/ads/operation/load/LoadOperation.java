package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class LoadOperation extends AdOperation implements ILoadOperation {
    private LoadOperationState _loadOperationState;

    public LoadOperation(LoadOperationState loadOperationState, IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, "load");
        this._loadOperationState = loadOperationState;
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this._loadOperationState.f3405id;
    }

    @Override // com.unity3d.services.ads.operation.load.ILoadOperation
    public LoadOperationState getLoadOperationState() {
        return this._loadOperationState;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String str) {
        LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState != null && loadOperationState.listener != null && str != null) {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadOperation.1
                @Override // java.lang.Runnable
                public void run() {
                    if (LoadOperation.this._loadOperationState != null) {
                        LoadOperation.this._loadOperationState.onUnityAdsAdLoaded();
                    }
                }
            });
        }
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String str, final UnityAds.UnityAdsLoadError unityAdsLoadError, final String str2) {
        LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState != null && loadOperationState.listener != null && str != null) {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadOperation.2
                @Override // java.lang.Runnable
                public void run() {
                    if (LoadOperation.this._loadOperationState != null) {
                        LoadOperation.this._loadOperationState.onUnityAdsFailedToLoad(unityAdsLoadError, str2);
                    }
                }
            });
        }
    }
}
