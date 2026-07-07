package com.unity3d.ads.gl;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OffscreenSurface extends EglSurfaceBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(EglCore eglCore, int i6, int i10) {
        super(eglCore);
        k.e(eglCore, "eglCore");
        createOffscreenSurface(i6, i10);
    }

    public final void release() {
        releaseEglSurface();
    }
}
