package com.unity3d.ads.beta;

import ie.s;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ShowOptions {
    private final Map<String, String> extras;

    public ShowOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public ShowOptions(Map<String, String> extras) {
        k.e(extras, "extras");
        this.extras = extras;
    }

    public /* synthetic */ ShowOptions(Map map, int i6, f fVar) {
        this((i6 & 1) != 0 ? s.f6847x : map);
    }
}
