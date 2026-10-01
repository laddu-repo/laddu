package com.unity3d.ads.core.data.datasource;

import b1.g0;
import b1.h;
import com.google.protobuf.ByteString;
import he.y;
import kf.u;
import kf.y0;
import kotlin.jvm.internal.k;
import le.c;
import me.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidByteStringDataSource implements ByteStringDataSource {
    private final h dataStore;

    public AndroidByteStringDataSource(h dataStore) {
        k.e(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(c cVar) {
        return y0.l(new u(((g0) this.dataStore).f1301d, new AndroidByteStringDataSource$get$2(null)), cVar);
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, c cVar) {
        Object i6 = ((g0) this.dataStore).i(new AndroidByteStringDataSource$set$2(byteString, null), cVar);
        if (i6 == a.f8833x) {
            return i6;
        }
        return y.f6101a;
    }
}
