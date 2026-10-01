package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ErrorOuterClass;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AudienceManagementResponseOuterClass {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class AudienceManagementResponse extends GeneratedMessageLite<AudienceManagementResponse, Builder> implements AudienceManagementResponseOrBuilder {
        public static final int AUDIENCE_MANAGEMENT_DATA_FIELD_NUMBER = 1;
        private static final AudienceManagementResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 2;
        private static volatile Parser<AudienceManagementResponse> PARSER;
        private ByteString audienceManagementData_ = ByteString.EMPTY;
        private int bitField0_;
        private ErrorOuterClass.Error error_;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<AudienceManagementResponse, Builder> implements AudienceManagementResponseOrBuilder {
            public /* synthetic */ Builder(fe.i iVar) {
                this();
            }

            public Builder clearAudienceManagementData() {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).clearAudienceManagementData();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).clearError();
                return this;
            }

            @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
            public ByteString getAudienceManagementData() {
                return ((AudienceManagementResponse) this.instance).getAudienceManagementData();
            }

            @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((AudienceManagementResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
            public boolean hasError() {
                return ((AudienceManagementResponse) this.instance).hasError();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder setAudienceManagementData(ByteString byteString) {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).setAudienceManagementData(byteString);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).setError(error);
                return this;
            }

            private Builder() {
                super(AudienceManagementResponse.DEFAULT_INSTANCE);
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((AudienceManagementResponse) this.instance).setError(builder.build());
                return this;
            }
        }

        static {
            AudienceManagementResponse audienceManagementResponse = new AudienceManagementResponse();
            DEFAULT_INSTANCE = audienceManagementResponse;
            GeneratedMessageLite.registerDefaultInstance(AudienceManagementResponse.class, audienceManagementResponse);
        }

        private AudienceManagementResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudienceManagementData() {
            this.audienceManagementData_ = getDefaultInstance().getAudienceManagementData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        public static AudienceManagementResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(ErrorOuterClass.Error error) {
            error.getClass();
            ErrorOuterClass.Error error2 = this.error_;
            if (error2 != null && error2 != ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom((ErrorOuterClass.Error.Builder) error).buildPartial();
            } else {
                this.error_ = error;
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AudienceManagementResponse parseDelimitedFrom(InputStream inputStream) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementResponse parseFrom(ByteBuffer byteBuffer) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AudienceManagementResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudienceManagementData(ByteString byteString) {
            byteString.getClass();
            this.audienceManagementData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            fe.i iVar = null;
            switch (fe.i.f5247a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AudienceManagementResponse();
                case 2:
                    return new Builder(iVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002ဉ\u0000", new Object[]{"bitField0_", "audienceManagementData_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AudienceManagementResponse> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (AudienceManagementResponse.class) {
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

        @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
        public ByteString getAudienceManagementData() {
            return this.audienceManagementData_;
        }

        @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            if (error == null) {
                return ErrorOuterClass.Error.getDefaultInstance();
            }
            return error;
        }

        @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
        public boolean hasError() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(AudienceManagementResponse audienceManagementResponse) {
            return DEFAULT_INSTANCE.createBuilder(audienceManagementResponse);
        }

        public static AudienceManagementResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(ByteString byteString) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AudienceManagementResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(byte[] bArr) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AudienceManagementResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(InputStream inputStream) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(CodedInputStream codedInputStream) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AudienceManagementResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface AudienceManagementResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAudienceManagementData();

        ErrorOuterClass.Error getError();

        boolean hasError();
    }

    private AudienceManagementResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
