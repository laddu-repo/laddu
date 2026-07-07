package com.drake.net.exception;

import gf.c0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class NetCancellationExceptionKt {
    public static final NetCancellationException NetCancellationException(c0 c0Var, String str) {
        k.e(c0Var, "<this>");
        return new NetCancellationException(c0Var, str);
    }

    public static /* synthetic */ NetCancellationException NetCancellationException$default(c0 c0Var, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = null;
        }
        return NetCancellationException(c0Var, str);
    }
}
