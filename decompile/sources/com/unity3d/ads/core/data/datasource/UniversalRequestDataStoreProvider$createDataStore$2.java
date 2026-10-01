package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import kotlin.jvm.internal.l;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UniversalRequestDataStoreProvider$createDataStore$2 extends l implements a {
    final /* synthetic */ UniversalRequestDataStoreProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestDataStoreProvider$createDataStore$2(UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        super(0);
        this.this$0 = universalRequestDataStoreProvider;
    }

    @Override // ve.a
    public final File invoke() {
        return ContextExtensionsKt.unityAdsDataStoreFile(this.this$0.getContext(), ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
    }
}
