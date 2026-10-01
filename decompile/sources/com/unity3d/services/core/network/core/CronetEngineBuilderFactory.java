package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.jvm.internal.k;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CronetEngineBuilderFactory {
    public final CronetEngine.Builder createCronetEngineBuilder(Context context) {
        k.e(context, "context");
        return new CronetEngine.Builder(context);
    }
}
