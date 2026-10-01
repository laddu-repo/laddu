package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        Locale locale = Locale.getDefault();
        k.d(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
