package com.unity3d.ads.core.extensions;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ContextExtensionsKt {
    public static final File unityAdsDataStoreFile(Context context, String fileName) {
        k.e(context, "<this>");
        k.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), UnityAdsConstants.Cache.DATASTORE_PATH.concat(fileName));
    }
}
