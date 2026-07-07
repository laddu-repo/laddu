package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PiiOuterClass {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Pii extends GeneratedMessageLite<Pii, Builder> implements PiiOrBuilder {
        public static final int ADVERTISING_ID_FIELD_NUMBER = 1;
        public static final int APPSET_ID_FIELD_NUMBER = 5;
        private static final Pii DEFAULT_INSTANCE;
        public static final int FID_FIELD_NUMBER = 4;
        public static final int OPEN_ADVERTISING_TRACKING_ID_FIELD_NUMBER = 3;
        private static volatile Parser<Pii> PARSER = null;
        public static final int VENDOR_ID_FIELD_NUMBER = 2;
        private ByteString advertisingId_;
        private String appsetId_;
        private int bitField0_;
        private String fid_;
        private ByteString openAdvertisingTrackingId_;
        private ByteString vendorId_;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Pii, Builder> implements PiiOrBuilder {
            public /* synthetic */ Builder(fe.b0 b0Var) {
                this();
            }

            public Builder clearAdvertisingId() {
                copyOnWrite();
                ((Pii) this.instance).clearAdvertisingId();
                return this;
            }

            public Builder clearAppsetId() {
                copyOnWrite();
                ((Pii) this.instance).clearAppsetId();
                return this;
            }

            public Builder clearFid() {
                copyOnWrite();
                ((Pii) this.instance).clearFid();
                return this;
            }

            public Builder clearOpenAdvertisingTrackingId() {
                copyOnWrite();
                ((Pii) this.instance).clearOpenAdvertisingTrackingId();
                return this;
            }

            public Builder clearVendorId() {
                copyOnWrite();
                ((Pii) this.instance).clearVendorId();
                return this;
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public ByteString getAdvertisingId() {
                return ((Pii) this.instance).getAdvertisingId();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public String getAppsetId() {
                return ((Pii) this.instance).getAppsetId();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public ByteString getAppsetIdBytes() {
                return ((Pii) this.instance).getAppsetIdBytes();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public String getFid() {
                return ((Pii) this.instance).getFid();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public ByteString getFidBytes() {
                return ((Pii) this.instance).getFidBytes();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public ByteString getOpenAdvertisingTrackingId() {
                return ((Pii) this.instance).getOpenAdvertisingTrackingId();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public ByteString getVendorId() {
                return ((Pii) this.instance).getVendorId();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public boolean hasAppsetId() {
                return ((Pii) this.instance).hasAppsetId();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public boolean hasFid() {
                return ((Pii) this.instance).hasFid();
            }

            public Builder setAdvertisingId(ByteString byteString) {
                copyOnWrite();
                ((Pii) this.instance).setAdvertisingId(byteString);
                return this;
            }

            public Builder setAppsetId(String str) {
                copyOnWrite();
                ((Pii) this.instance).setAppsetId(str);
                return this;
            }

            public Builder setAppsetIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Pii) this.instance).setAppsetIdBytes(byteString);
                return this;
            }

            public Builder setFid(String str) {
                copyOnWrite();
                ((Pii) this.instance).setFid(str);
                return this;
            }

            public Builder setFidBytes(ByteString byteString) {
                copyOnWrite();
                ((Pii) this.instance).setFidBytes(byteString);
                return this;
            }

            public Builder setOpenAdvertisingTrackingId(ByteString byteString) {
                copyOnWrite();
                ((Pii) this.instance).setOpenAdvertisingTrackingId(byteString);
                return this;
            }

            public Builder setVendorId(ByteString byteString) {
                copyOnWrite();
                ((Pii) this.instance).setVendorId(byteString);
                return this;
            }

            private Builder() {
                super(Pii.DEFAULT_INSTANCE);
            }
        }

        static {
            Pii pii = new Pii();
            DEFAULT_INSTANCE = pii;
            GeneratedMessageLite.registerDefaultInstance(Pii.class, pii);
        }

        private Pii() {
            ByteString byteString = ByteString.EMPTY;
            this.advertisingId_ = byteString;
            this.vendorId_ = byteString;
            this.openAdvertisingTrackingId_ = byteString;
            this.fid_ = HttpUrl.FRAGMENT_ENCODE_SET;
            this.appsetId_ = HttpUrl.FRAGMENT_ENCODE_SET;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdvertisingId() {
            this.advertisingId_ = getDefaultInstance().getAdvertisingId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppsetId() {
            this.bitField0_ &= -3;
            this.appsetId_ = getDefaultInstance().getAppsetId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFid() {
            this.bitField0_ &= -2;
            this.fid_ = getDefaultInstance().getFid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenAdvertisingTrackingId() {
            this.openAdvertisingTrackingId_ = getDefaultInstance().getOpenAdvertisingTrackingId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendorId() {
            this.vendorId_ = getDefaultInstance().getVendorId();
        }

        public static Pii getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Pii parseDelimitedFrom(InputStream inputStream) {
            return (Pii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Pii> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdvertisingId(ByteString byteString) {
            byteString.getClass();
            this.advertisingId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppsetId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.appsetId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppsetIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appsetId_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFid(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.fid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fid_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenAdvertisingTrackingId(ByteString byteString) {
            byteString.getClass();
            this.openAdvertisingTrackingId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendorId(ByteString byteString) {
            byteString.getClass();
            this.vendorId_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            fe.b0 b0Var = null;
            switch (fe.b0.f5234a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Pii();
                case 2:
                    return new Builder(b0Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004ለ\u0000\u0005ለ\u0001", new Object[]{"bitField0_", "advertisingId_", "vendorId_", "openAdvertisingTrackingId_", "fid_", "appsetId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Pii> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (Pii.class) {
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

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public ByteString getAdvertisingId() {
            return this.advertisingId_;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public String getAppsetId() {
            return this.appsetId_;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public ByteString getAppsetIdBytes() {
            return ByteString.copyFromUtf8(this.appsetId_);
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public String getFid() {
            return this.fid_;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public ByteString getFidBytes() {
            return ByteString.copyFromUtf8(this.fid_);
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public ByteString getOpenAdvertisingTrackingId() {
            return this.openAdvertisingTrackingId_;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public ByteString getVendorId() {
            return this.vendorId_;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public boolean hasAppsetId() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public boolean hasFid() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Pii pii) {
            return DEFAULT_INSTANCE.createBuilder(pii);
        }

        public static Pii parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Pii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Pii parseFrom(ByteString byteString) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Pii parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Pii parseFrom(byte[] bArr) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Pii parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Pii parseFrom(InputStream inputStream) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pii parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface PiiOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdvertisingId();

        String getAppsetId();

        ByteString getAppsetIdBytes();

        String getFid();

        ByteString getFidBytes();

        ByteString getOpenAdvertisingTrackingId();

        ByteString getVendorId();

        boolean hasAppsetId();

        boolean hasFid();
    }

    private PiiOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
