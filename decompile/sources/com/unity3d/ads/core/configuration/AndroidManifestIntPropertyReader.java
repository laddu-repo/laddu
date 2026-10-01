package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        k.e(context, "context");
        this.context = context;
    }

    public final Integer getPropertyByName(String propertyName) {
        Bundle bundle;
        Integer valueOf;
        k.e(propertyName, "propertyName");
        try {
            bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            valueOf = Integer.valueOf(bundle.getInt(propertyName));
        } catch (Exception unused) {
        }
        if (!bundle.containsKey(propertyName)) {
            return null;
        }
        return valueOf;
    }
}
