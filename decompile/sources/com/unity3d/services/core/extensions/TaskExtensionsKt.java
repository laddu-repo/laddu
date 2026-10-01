package com.unity3d.services.core.extensions;

import com.unity3d.services.core.di.ServiceProvider;
import le.c;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TaskExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0113 -> B:11:0x0116). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0122 -> B:12:0x011c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object withRetry(long r18, int r20, double r21, java.lang.Exception r23, ve.p r24, le.c r25) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(long, int, double, java.lang.Exception, ve.p, le.c):java.lang.Object");
    }

    public static /* synthetic */ Object withRetry$default(long j, int i6, double d10, Exception exc, p pVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
        }
        if ((i10 & 2) != 0) {
            i6 = 6;
        }
        if ((i10 & 4) != 0) {
            d10 = 2.0d;
        }
        int i11 = i6;
        return withRetry(j, i11, d10, exc, pVar, cVar);
    }
}
