package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import b1.h;
import b1.i;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import gf.f0;
import gf.y;
import k7.c;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UniversalRequestDataStoreProvider {
    private h cachedDataStore;
    private final Context context;
    private final y dispatcher;

    public UniversalRequestDataStoreProvider(Context context, y dispatcher) {
        k.e(context, "context");
        k.e(dispatcher, "dispatcher");
        this.context = context;
        this.dispatcher = dispatcher;
    }

    private final h createDataStore() {
        return i.a(new UniversalRequestStoreSerializer(), new c(UniversalRequestDataStoreProvider$createDataStore$1.INSTANCE), null, f0.b(this.dispatcher.plus(f0.e())), new UniversalRequestDataStoreProvider$createDataStore$2(this), 4);
    }

    public final Context getContext() {
        return this.context;
    }

    public final y getDispatcher() {
        return this.dispatcher;
    }

    public final h invoke() {
        synchronized (this) {
            h hVar = this.cachedDataStore;
            if (hVar != null) {
                return hVar;
            }
            h createDataStore = createDataStore();
            this.cachedDataStore = createDataStore;
            return createDataStore;
        }
    }
}
