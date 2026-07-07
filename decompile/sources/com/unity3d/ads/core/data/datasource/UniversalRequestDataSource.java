package com.unity3d.ads.core.data.datasource;

import b1.g0;
import com.google.protobuf.ByteString;
import he.y;
import kf.u;
import kf.y0;
import kotlin.jvm.internal.k;
import le.c;
import me.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UniversalRequestDataSource {
    private final UniversalRequestDataStoreProvider universalRequestStoreProvider;

    public UniversalRequestDataSource(UniversalRequestDataStoreProvider universalRequestStoreProvider) {
        k.e(universalRequestStoreProvider, "universalRequestStoreProvider");
        this.universalRequestStoreProvider = universalRequestStoreProvider;
    }

    public final Object get(c cVar) {
        return y0.l(new u(((g0) this.universalRequestStoreProvider.invoke()).f1301d, new UniversalRequestDataSource$get$2(null)), cVar);
    }

    public final Object remove(String str, c cVar) {
        Object i6 = ((g0) this.universalRequestStoreProvider.invoke()).i(new UniversalRequestDataSource$remove$2(str, null), cVar);
        if (i6 == a.f8833x) {
            return i6;
        }
        return y.f6101a;
    }

    public final Object set(String str, ByteString byteString, c cVar) {
        Object i6 = ((g0) this.universalRequestStoreProvider.invoke()).i(new UniversalRequestDataSource$set$2(str, byteString, null), cVar);
        if (i6 == a.f8833x) {
            return i6;
        }
        return y.f6101a;
    }
}
