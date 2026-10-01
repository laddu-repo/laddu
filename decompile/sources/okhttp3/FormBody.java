package okhttp3;

import bg.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    public static final Companion Companion = new Companion(null);
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder add(String name, String value) {
            k.e(name, "name");
            k.e(value, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String name, String value) {
            k.e(name, "name");
            k.e(value, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i6, f fVar) {
            this((i6 & 1) != 0 ? null : charset);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public FormBody(List<String> encodedNames, List<String> encodedValues) {
        k.e(encodedNames, "encodedNames");
        k.e(encodedValues, "encodedValues");
        this.encodedNames = Util.toImmutableList(encodedNames);
        this.encodedValues = Util.toImmutableList(encodedValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(l lVar, boolean z10) {
        bg.k kVar;
        if (z10) {
            kVar = new Object();
        } else {
            k.b(lVar);
            kVar = lVar.a();
        }
        int size = this.encodedNames.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (i6 > 0) {
                kVar.l0(38);
            }
            kVar.s0(this.encodedNames.get(i6));
            kVar.l0(61);
            kVar.s0(this.encodedValues.get(i6));
        }
        if (z10) {
            long j = kVar.f1726y;
            kVar.d();
            return j;
        }
        return 0L;
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m198deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i6) {
        return this.encodedNames.get(i6);
    }

    public final String encodedValue(int i6) {
        return this.encodedValues.get(i6);
    }

    public final String name(int i6) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i6), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i6) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i6), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(l sink) {
        k.e(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
