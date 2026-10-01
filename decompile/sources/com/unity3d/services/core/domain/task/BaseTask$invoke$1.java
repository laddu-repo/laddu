package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import he.k;
import me.a;
import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
/* loaded from: classes.dex */
public final class BaseTask$invoke$1<P extends BaseParams, R> extends c {
    int label;
    /* synthetic */ Object result;

    public BaseTask$invoke$1(le.c cVar) {
        super(cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m72invokegIAlus = BaseTask.DefaultImpls.m72invokegIAlus(null, null, this);
        if (m72invokegIAlus == a.f8833x) {
            return m72invokegIAlus;
        }
        return new k(m72invokegIAlus);
    }
}
