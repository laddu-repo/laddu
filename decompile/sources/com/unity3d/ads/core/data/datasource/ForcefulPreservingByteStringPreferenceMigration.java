package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import b1.d;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import he.y;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ForcefulPreservingByteStringPreferenceMigration implements d {
    private final Context context;
    private final GetByteStringData getByteStringData;
    private final String key;
    private final String name;

    public ForcefulPreservingByteStringPreferenceMigration(Context context, String name, String key, GetByteStringData getByteStringData) {
        k.e(context, "context");
        k.e(name, "name");
        k.e(key, "key");
        k.e(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = name;
        this.key = key;
        this.getByteStringData = getByteStringData;
    }

    @Override // b1.d
    public Object cleanUp(c cVar) {
        return y.f6101a;
    }

    @Override // b1.d
    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, c cVar) {
        String string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null);
        if (string == null || string.length() == 0) {
            return byteStringStore;
        }
        ByteStringStoreOuterClass.ByteStringStore build = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        k.d(build, "newBuilder()\n           …\n                .build()");
        return build;
    }

    @Override // b1.d
    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, c cVar) {
        return Boolean.TRUE;
    }
}
