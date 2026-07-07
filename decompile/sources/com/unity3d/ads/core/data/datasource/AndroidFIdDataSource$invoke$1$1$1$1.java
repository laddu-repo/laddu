package com.unity3d.ads.core.data.datasource;

import he.y;
import kotlin.jvm.internal.l;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidFIdDataSource$invoke$1$1$1$1 extends l implements ve.l {
    final /* synthetic */ c $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1$1$1(c cVar) {
        super(1);
        this.$cont = cVar;
    }

    @Override // ve.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return y.f6101a;
    }

    public final void invoke(String str) {
        this.$cont.resumeWith(str);
    }
}
