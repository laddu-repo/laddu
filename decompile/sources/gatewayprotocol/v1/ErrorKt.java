package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ErrorKt {
    public static final ErrorKt INSTANCE = new ErrorKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ErrorOuterClass.Error.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                kotlin.jvm.internal.k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final void clearErrorCode() {
            this._builder.clearErrorCode();
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final ErrorOuterClass.PublicErrorCode getErrorCode() {
            ErrorOuterClass.PublicErrorCode errorCode = this._builder.getErrorCode();
            kotlin.jvm.internal.k.d(errorCode, "_builder.getErrorCode()");
            return errorCode;
        }

        public final int getErrorCodeValue() {
            return this._builder.getErrorCodeValue();
        }

        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            kotlin.jvm.internal.k.d(errorText, "_builder.getErrorText()");
            return errorText;
        }

        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            kotlin.jvm.internal.k.d(errorToken, "_builder.getErrorToken()");
            return errorToken;
        }

        public final void setErrorCode(ErrorOuterClass.PublicErrorCode value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setErrorCode(value);
        }

        public final void setErrorCodeValue(int i6) {
            this._builder.setErrorCodeValue(i6);
        }

        public final void setErrorText(String value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setErrorText(value);
        }

        public final void setErrorToken(ByteString value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setErrorToken(value);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }
    }

    private ErrorKt() {
    }
}
