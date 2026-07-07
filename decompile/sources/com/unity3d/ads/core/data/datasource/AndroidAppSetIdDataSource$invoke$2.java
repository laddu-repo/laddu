package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.appset.AppSetIdInfo;
import he.y;
import kf.f1;
import kf.r0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidAppSetIdDataSource$invoke$2 extends l implements ve.l {
    final /* synthetic */ AndroidAppSetIdDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAppSetIdDataSource$invoke$2(AndroidAppSetIdDataSource androidAppSetIdDataSource) {
        super(1);
        this.this$0 = androidAppSetIdDataSource;
    }

    @Override // ve.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AppSetIdInfo) obj);
        return y.f6101a;
    }

    public final void invoke(AppSetIdInfo appSetIdInfo) {
        r0 r0Var;
        String id2 = appSetIdInfo.getId();
        k.d(id2, "it.id");
        r0Var = this.this$0._appSetIdFlow;
        f1 f1Var = (f1) r0Var;
        f1Var.getClass();
        f1Var.h(null, id2);
    }
}
