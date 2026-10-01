package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidTestDataInfo implements GetTestDataInfo {
    public static final Companion Companion = new Companion(null);
    public static final String EXCHANGE_TEST_MODE = "ExchangeTestMode";
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidTestDataInfo(AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        k.e(androidManifestIntPropertyReader, "androidManifestIntPropertyReader");
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    @Override // com.unity3d.ads.core.domain.GetTestDataInfo
    public TestDataOuterClass.TestData invoke() {
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder newBuilder = TestDataOuterClass.TestData.newBuilder();
        k.d(newBuilder, "newBuilder()");
        TestDataKt.Dsl _create = companion._create(newBuilder);
        Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName(EXCHANGE_TEST_MODE);
        if (propertyByName != null) {
            _create.setForceExchangeTestMode(propertyByName.intValue());
        }
        TestDataOuterClass.TestData _build = _create._build();
        if (_build.hasForceExchangeTestMode()) {
            return _build;
        }
        return null;
    }
}
