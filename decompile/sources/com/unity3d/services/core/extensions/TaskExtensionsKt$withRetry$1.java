package com.unity3d.services.core.extensions;

import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", l = {17, 30}, m = "withRetry")
/* loaded from: classes.dex */
public final class TaskExtensionsKt$withRetry$1<T> extends c {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public TaskExtensionsKt$withRetry$1(le.c cVar) {
        super(cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TaskExtensionsKt.withRetry(0L, 0, 0.0d, null, null, this);
    }
}
