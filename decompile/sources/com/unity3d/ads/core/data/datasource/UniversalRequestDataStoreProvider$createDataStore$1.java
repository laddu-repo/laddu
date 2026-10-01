package com.unity3d.ads.core.data.datasource;

import b1.a;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UniversalRequestDataStoreProvider$createDataStore$1 extends l implements ve.l {
    public static final UniversalRequestDataStoreProvider$createDataStore$1 INSTANCE = new UniversalRequestDataStoreProvider$createDataStore$1();

    public UniversalRequestDataStoreProvider$createDataStore$1() {
        super(1);
    }

    @Override // ve.l
    public final UniversalRequestStoreOuterClass.UniversalRequestStore invoke(a it) {
        k.e(it, "it");
        return new UniversalRequestStoreSerializer().getDefaultValue();
    }
}
