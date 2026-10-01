package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TimestampsOuterClass {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Timestamps extends GeneratedMessageLite<Timestamps, Builder> implements TimestampsOrBuilder {
        private static final Timestamps DEFAULT_INSTANCE;
        private static volatile Parser<Timestamps> PARSER = null;
        public static final int SESSION_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private int bitField0_;
        private long sessionTimestamp_;
        private Timestamp timestamp_;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Timestamps, Builder> implements TimestampsOrBuilder {
            public /* synthetic */ Builder(fe.h0 h0Var) {
                this();
            }

            public Builder clearSessionTimestamp() {
                copyOnWrite();
                ((Timestamps) this.instance).clearSessionTimestamp();
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                ((Timestamps) this.instance).clearTimestamp();
                return this;
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public long getSessionTimestamp() {
                return ((Timestamps) this.instance).getSessionTimestamp();
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public Timestamp getTimestamp() {
                return ((Timestamps) this.instance).getTimestamp();
            }

            @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
            public boolean hasTimestamp() {
                return ((Timestamps) this.instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((Timestamps) this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public Builder setSessionTimestamp(long j) {
                copyOnWrite();
                ((Timestamps) this.instance).setSessionTimestamp(j);
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                copyOnWrite();
                ((Timestamps) this.instance).setTimestamp(timestamp);
                return this;
            }

            private Builder() {
                super(Timestamps.DEFAULT_INSTANCE);
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                ((Timestamps) this.instance).setTimestamp(builder.build());
                return this;
            }
        }

        static {
            Timestamps timestamps = new Timestamps();
            DEFAULT_INSTANCE = timestamps;
            GeneratedMessageLite.registerDefaultInstance(Timestamps.class, timestamps);
        }

        private Timestamps() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionTimestamp() {
            this.sessionTimestamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        public static Timestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.timestamp_ = timestamp;
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream) {
            return (Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Timestamps> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionTimestamp(long j) {
            this.sessionTimestamp_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            fe.h0 h0Var = null;
            switch (fe.h0.f5246a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Timestamps();
                case 2:
                    return new Builder(h0Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"bitField0_", "timestamp_", "sessionTimestamp_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Timestamps> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (Timestamps.class) {
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

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public long getSessionTimestamp() {
            return this.sessionTimestamp_;
        }

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            if (timestamp == null) {
                return Timestamp.getDefaultInstance();
            }
            return timestamp;
        }

        @Override // gatewayprotocol.v1.TimestampsOuterClass.TimestampsOrBuilder
        public boolean hasTimestamp() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Timestamps timestamps) {
            return DEFAULT_INSTANCE.createBuilder(timestamps);
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteString byteString) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Timestamps parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Timestamps parseFrom(byte[] bArr) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Timestamps parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Timestamps parseFrom(InputStream inputStream) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamps parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface TimestampsOrBuilder extends MessageLiteOrBuilder {
        long getSessionTimestamp();

        Timestamp getTimestamp();

        boolean hasTimestamp();
    }

    private TimestampsOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
