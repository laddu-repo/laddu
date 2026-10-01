package com.unity3d.services.ads.operation;

import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class AdOperation implements IAdOperation {
    private static String invocationClassName = "webview";
    private String _invocationMethodName;
    private IWebViewBridgeInvocation _webViewBridgeInvocation;

    public AdOperation(IWebViewBridgeInvocation iWebViewBridgeInvocation, String str) {
        this._invocationMethodName = str;
        if (str != null && !str.isEmpty()) {
            this._webViewBridgeInvocation = iWebViewBridgeInvocation;
            if (iWebViewBridgeInvocation != null) {
                return;
            } else {
                throw new IllegalArgumentException("webViewBridgeInvocation cannot be null");
            }
        }
        throw new IllegalArgumentException("invocationMethodName cannot be null");
    }

    @Override // com.unity3d.services.ads.operation.IAdOperation
    public void invoke(int i6, Object... objArr) {
        this._webViewBridgeInvocation.invoke(invocationClassName, this._invocationMethodName, i6, objArr);
    }
}
