package com.unity3d.services.core.network.domain;

import java.io.File;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends j implements l {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // ve.l
    public final Boolean invoke(File p02) {
        k.e(p02, "p0");
        return Boolean.valueOf(p02.isFile());
    }
}
