package com.unity3d.services.core.network.domain;

import he.i;
import ie.j;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CleanupDirectory$invoke$additionalFiles$2 extends l implements p {
    public static final CleanupDirectory$invoke$additionalFiles$2 INSTANCE = new CleanupDirectory$invoke$additionalFiles$2();

    public CleanupDirectory$invoke$additionalFiles$2() {
        super(2);
    }

    @Override // ve.p
    public final i invoke(i iVar, File file) {
        k.e(iVar, "<name for destructuring parameter 0>");
        k.e(file, "file");
        return new i(Long.valueOf(((Number) iVar.f6076x).longValue() - file.length()), j.Q((List) iVar.f6077y, file));
    }
}
