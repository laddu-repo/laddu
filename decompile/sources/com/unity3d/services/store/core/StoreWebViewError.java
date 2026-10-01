package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.g;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class StoreWebViewError extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(Enum<?> r22, String str, Object... errorArguments) {
        super(r22, str, Arrays.copyOf(errorArguments, errorArguments.length));
        k.e(errorArguments, "errorArguments");
    }

    @Override // com.unity3d.scar.adapter.common.g
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
