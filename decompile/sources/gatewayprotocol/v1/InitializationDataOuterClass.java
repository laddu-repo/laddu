package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class InitializationDataOuterClass {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class InitializationData extends GeneratedMessageLite<InitializationData, Builder> implements InitializationDataOrBuilder {
        private static final InitializationData DEFAULT_INSTANCE;
        public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 1;
        private static volatile Parser<InitializationData> PARSER = null;
        public static final int SHARED_DATA_FIELD_NUMBER = 2;
        private int bitField0_;
        private InitializationRequestOuterClass.InitializationRequest initializationRequest_;
        private UniversalRequestOuterClass.UniversalRequest.SharedData sharedData_;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<InitializationData, Builder> implements InitializationDataOrBuilder {
            public /* synthetic */ Builder(fe.t tVar) {
                this();
            }

            public Builder clearInitializationRequest() {
                copyOnWrite();
                ((InitializationData) this.instance).clearInitializationRequest();
                return this;
            }

            public Builder clearSharedData() {
                copyOnWrite();
                ((InitializationData) this.instance).clearSharedData();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                return ((InitializationData) this.instance).getInitializationRequest();
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
                return ((InitializationData) this.instance).getSharedData();
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public boolean hasInitializationRequest() {
                return ((InitializationData) this.instance).hasInitializationRequest();
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public boolean hasSharedData() {
                return ((InitializationData) this.instance).hasSharedData();
            }

            public Builder mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                copyOnWrite();
                ((InitializationData) this.instance).mergeInitializationRequest(initializationRequest);
                return this;
            }

            public Builder mergeSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                ((InitializationData) this.instance).mergeSharedData(sharedData);
                return this;
            }

            public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                copyOnWrite();
                ((InitializationData) this.instance).setInitializationRequest(initializationRequest);
                return this;
            }

            public Builder setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                ((InitializationData) this.instance).setSharedData(sharedData);
                return this;
            }

            private Builder() {
                super(InitializationData.DEFAULT_INSTANCE);
            }

            public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                copyOnWrite();
                ((InitializationData) this.instance).setInitializationRequest(builder.build());
                return this;
            }

            public Builder setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                copyOnWrite();
                ((InitializationData) this.instance).setSharedData(builder.build());
                return this;
            }
        }

        static {
            InitializationData initializationData = new InitializationData();
            DEFAULT_INSTANCE = initializationData;
            GeneratedMessageLite.registerDefaultInstance(InitializationData.class, initializationData);
        }

        private InitializationData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitializationRequest() {
            this.initializationRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSharedData() {
            this.sharedData_ = null;
            this.bitField0_ &= -3;
        }

        public static InitializationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationRequest.getClass();
            InitializationRequestOuterClass.InitializationRequest initializationRequest2 = this.initializationRequest_;
            if (initializationRequest2 != null && initializationRequest2 != InitializationRequestOuterClass.InitializationRequest.getDefaultInstance()) {
                this.initializationRequest_ = InitializationRequestOuterClass.InitializationRequest.newBuilder(this.initializationRequest_).mergeFrom((InitializationRequestOuterClass.InitializationRequest.Builder) initializationRequest).buildPartial();
            } else {
                this.initializationRequest_ = initializationRequest;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData2 = this.sharedData_;
            if (sharedData2 != null && sharedData2 != UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance()) {
                this.sharedData_ = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder(this.sharedData_).mergeFrom((UniversalRequestOuterClass.UniversalRequest.SharedData.Builder) sharedData).buildPartial();
            } else {
                this.sharedData_ = sharedData;
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationData parseDelimitedFrom(InputStream inputStream) {
            return (InitializationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationData parseFrom(ByteBuffer byteBuffer) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InitializationData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationRequest.getClass();
            this.initializationRequest_ = initializationRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            this.sharedData_ = sharedData;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            fe.t tVar = null;
            switch (fe.t.f5262a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationData();
                case 2:
                    return new Builder(tVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "initializationRequest_", "sharedData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InitializationData> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (InitializationData.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            InitializationRequestOuterClass.InitializationRequest initializationRequest = this.initializationRequest_;
            if (initializationRequest == null) {
                return InitializationRequestOuterClass.InitializationRequest.getDefaultInstance();
            }
            return initializationRequest;
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this.sharedData_;
            if (sharedData == null) {
                return UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance();
            }
            return sharedData;
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public boolean hasInitializationRequest() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public boolean hasSharedData() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(InitializationData initializationData) {
            return DEFAULT_INSTANCE.createBuilder(initializationData);
        }

        public static InitializationData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationData parseFrom(ByteString byteString) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationData parseFrom(byte[] bArr) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationData parseFrom(InputStream inputStream) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationData parseFrom(CodedInputStream codedInputStream) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface InitializationDataOrBuilder extends MessageLiteOrBuilder {
        InitializationRequestOuterClass.InitializationRequest getInitializationRequest();

        UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData();

        boolean hasInitializationRequest();

        boolean hasSharedData();
    }

    private InitializationDataOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
