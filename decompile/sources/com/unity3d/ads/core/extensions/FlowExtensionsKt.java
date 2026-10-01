package com.unity3d.ads.core.extensions;

import jf.a;
import kf.d;
import kf.h;
import kotlin.jvm.internal.k;
import le.i;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FlowExtensionsKt {
    public static final <T> h timeoutAfter(h hVar, long j, boolean z10, p block) {
        k.e(hVar, "<this>");
        k.e(block, "block");
        return new d(new FlowExtensionsKt$timeoutAfter$1(j, z10, block, hVar, null), i.f8353x, -2, a.f7436x);
    }

    public static /* synthetic */ h timeoutAfter$default(h hVar, long j, boolean z10, p pVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z10 = true;
        }
        return timeoutAfter(hVar, j, z10, pVar);
    }
}
