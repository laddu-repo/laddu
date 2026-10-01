package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebviewConfiguration {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class WebViewConfiguration extends GeneratedMessageLite<WebViewConfiguration, Builder> implements WebViewConfigurationOrBuilder {
        public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
        private static final WebViewConfiguration DEFAULT_INSTANCE;
        public static final int ENTRY_POINT_FIELD_NUMBER = 2;
        private static volatile Parser<WebViewConfiguration> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int version_;
        private String entryPoint_ = HttpUrl.FRAGMENT_ENCODE_SET;
        private Internal.ProtobufList<String> additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        private String type_ = HttpUrl.FRAGMENT_ENCODE_SET;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<WebViewConfiguration, Builder> implements WebViewConfigurationOrBuilder {
            public /* synthetic */ Builder(fe.l0 l0Var) {
                this();
            }

            public Builder addAdditionalFiles(String str) {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).addAdditionalFiles(str);
                return this;
            }

            public Builder addAdditionalFilesBytes(ByteString byteString) {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).addAdditionalFilesBytes(byteString);
                return this;
            }

            public Builder addAllAdditionalFiles(Iterable<String> iterable) {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).addAllAdditionalFiles(iterable);
                return this;
            }

            public Builder clearAdditionalFiles() {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).clearAdditionalFiles();
                return this;
            }

            public Builder clearEntryPoint() {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).clearEntryPoint();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).clearType();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).clearVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public String getAdditionalFiles(int i6) {
                return ((WebViewConfiguration) this.instance).getAdditionalFiles(i6);
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public ByteString getAdditionalFilesBytes(int i6) {
                return ((WebViewConfiguration) this.instance).getAdditionalFilesBytes(i6);
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public int getAdditionalFilesCount() {
                return ((WebViewConfiguration) this.instance).getAdditionalFilesCount();
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public List<String> getAdditionalFilesList() {
                return Collections.unmodifiableList(((WebViewConfiguration) this.instance).getAdditionalFilesList());
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public String getEntryPoint() {
                return ((WebViewConfiguration) this.instance).getEntryPoint();
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public ByteString getEntryPointBytes() {
                return ((WebViewConfiguration) this.instance).getEntryPointBytes();
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public String getType() {
                return ((WebViewConfiguration) this.instance).getType();
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public ByteString getTypeBytes() {
                return ((WebViewConfiguration) this.instance).getTypeBytes();
            }

            @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
            public int getVersion() {
                return ((WebViewConfiguration) this.instance).getVersion();
            }

            public Builder setAdditionalFiles(int i6, String str) {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).setAdditionalFiles(i6, str);
                return this;
            }

            public Builder setEntryPoint(String str) {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).setEntryPoint(str);
                return this;
            }

            public Builder setEntryPointBytes(ByteString byteString) {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).setEntryPointBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setVersion(int i6) {
                copyOnWrite();
                ((WebViewConfiguration) this.instance).setVersion(i6);
                return this;
            }

            private Builder() {
                super(WebViewConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            WebViewConfiguration webViewConfiguration = new WebViewConfiguration();
            DEFAULT_INSTANCE = webViewConfiguration;
            GeneratedMessageLite.registerDefaultInstance(WebViewConfiguration.class, webViewConfiguration);
        }

        private WebViewConfiguration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalFiles(String str) {
            str.getClass();
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalFilesBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAdditionalFiles(Iterable<String> iterable) {
            ensureAdditionalFilesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.additionalFiles_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdditionalFiles() {
            this.additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEntryPoint() {
            this.entryPoint_ = getDefaultInstance().getEntryPoint();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        private void ensureAdditionalFilesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.additionalFiles_;
            if (!protobufList.isModifiable()) {
                this.additionalFiles_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static WebViewConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WebViewConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (WebViewConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebViewConfiguration parseFrom(ByteBuffer byteBuffer) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WebViewConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalFiles(int i6, String str) {
            str.getClass();
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.set(i6, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPoint(String str) {
            str.getClass();
            this.entryPoint_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPointBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.entryPoint_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i6) {
            this.version_ = i6;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            fe.l0 l0Var = null;
            switch (fe.l0.f5254a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebViewConfiguration();
                case 2:
                    return new Builder(l0Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"version_", "entryPoint_", "additionalFiles_", "type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WebViewConfiguration> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (WebViewConfiguration.class) {
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

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public String getAdditionalFiles(int i6) {
            return this.additionalFiles_.get(i6);
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public ByteString getAdditionalFilesBytes(int i6) {
            return ByteString.copyFromUtf8(this.additionalFiles_.get(i6));
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public int getAdditionalFilesCount() {
            return this.additionalFiles_.size();
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public List<String> getAdditionalFilesList() {
            return this.additionalFiles_;
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public String getEntryPoint() {
            return this.entryPoint_;
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public ByteString getEntryPointBytes() {
            return ByteString.copyFromUtf8(this.entryPoint_);
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // gatewayprotocol.v1.WebviewConfiguration.WebViewConfigurationOrBuilder
        public int getVersion() {
            return this.version_;
        }

        public static Builder newBuilder(WebViewConfiguration webViewConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(webViewConfiguration);
        }

        public static WebViewConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebViewConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(ByteString byteString) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebViewConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(byte[] bArr) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebViewConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(InputStream inputStream) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebViewConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(CodedInputStream codedInputStream) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebViewConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface WebViewConfigurationOrBuilder extends MessageLiteOrBuilder {
        String getAdditionalFiles(int i6);

        ByteString getAdditionalFilesBytes(int i6);

        int getAdditionalFilesCount();

        List<String> getAdditionalFilesList();

        String getEntryPoint();

        ByteString getEntryPointBytes();

        String getType();

        ByteString getTypeBytes();

        int getVersion();
    }

    private WebviewConfiguration() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
