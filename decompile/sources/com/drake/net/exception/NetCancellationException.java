package com.drake.net.exception;

import gf.c0;
import gf.z;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import s1.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class NetCancellationException extends CancellationException {
    public /* synthetic */ NetCancellationException(c0 c0Var, String str, int i6, f fVar) {
        this(c0Var, (i6 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetCancellationException(c0 coroutineScope, String str) {
        super(str);
        k.e(coroutineScope, "coroutineScope");
        c.c(coroutineScope.getCoroutineContext().get(z.f5729x));
    }
}
