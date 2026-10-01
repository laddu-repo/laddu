package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MediationInitBlobMetadataReader extends MetadataReader<String> {
    public static final Companion Companion = new Companion(null);
    public static final String MEDIATION_UADS_INIT_BLOB = "mediation.uads_init_blob.value";

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationInitBlobMetadataReader(JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_UADS_INIT_BLOB);
        k.e(jsonStorage, "jsonStorage");
    }
}
