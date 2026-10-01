package com.unity3d.services.core.di;

import android.content.Context;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import java.io.File;
import kotlin.jvm.internal.l;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityAdsModule$provideByteStringDataStore$1 extends l implements a {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $dataStoreFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$provideByteStringDataStore$1(Context context, String str) {
        super(0);
        this.$context = context;
        this.$dataStoreFile = str;
    }

    @Override // ve.a
    public final File invoke() {
        return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, this.$dataStoreFile);
    }
}
