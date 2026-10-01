package gatewayprotocol.v1;

import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TestDataKtKt {
    /* renamed from: -initializetestData, reason: not valid java name */
    public static final TestDataOuterClass.TestData m144initializetestData(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder newBuilder = TestDataOuterClass.TestData.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        TestDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TestDataOuterClass.TestData copy(TestDataOuterClass.TestData testData, ve.l block) {
        kotlin.jvm.internal.k.e(testData, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder builder = testData.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        TestDataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
