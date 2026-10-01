package okhttp3;

import bg.m;
import bg.n;
import df.a;
import he.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import jb.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.Util;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final m source;

        public BomAwareReader(m source, Charset charset) {
            k.e(source, "source");
            k.e(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            y yVar;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                yVar = y.f6101a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i6, int i10) {
            k.e(cbuf, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.e0(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cbuf, i6, i10);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bg.m, bg.k] */
        public final ResponseBody create(String str, MediaType mediaType) {
            k.e(str, "<this>");
            Charset charset = a.f4115a;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            ?? obj = new Object();
            k.e(charset, "charset");
            obj.r0(str, 0, str.length(), charset);
            return create((m) obj, mediaType, obj.f1726y);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, n nVar, MediaType mediaType, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(nVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, m mVar, MediaType mediaType, long j, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                mediaType = null;
            }
            if ((i6 & 2) != 0) {
                j = -1;
            }
            return companion.create(mVar, mediaType, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bg.m, bg.k] */
        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            k.e(bArr, "<this>");
            ?? obj = new Object();
            obj.m0write(bArr);
            return create((m) obj, mediaType, bArr.length);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bg.m, bg.k] */
        public final ResponseBody create(n nVar, MediaType mediaType) {
            k.e(nVar, "<this>");
            ?? obj = new Object();
            obj.k0(nVar);
            return create((m) obj, mediaType, nVar.d());
        }

        public final ResponseBody create(final m mVar, final MediaType mediaType, final long j) {
            k.e(mVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public m source() {
                    return mVar;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String content) {
            k.e(content, "content");
            return create(content, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] content) {
            k.e(content, "content");
            return create(content, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, n content) {
            k.e(content, "content");
            return create(content, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, m content) {
            k.e(content, "content");
            return create(content, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        if (contentType != null && (charset = contentType.charset(a.f4115a)) != null) {
            return charset;
        }
        return a.f4115a;
    }

    private final <T> T consumeSource(l lVar, l lVar2) {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            m source = source();
            try {
                T t10 = (T) lVar.invoke(source);
                b.j(source, null);
                int intValue = ((Number) lVar2.invoke(t10)).intValue();
                if (contentLength != -1 && contentLength != intValue) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
                }
                return t10;
            } finally {
            }
        } else {
            throw new IOException(r4.a.j("Cannot buffer entire body for content length: ", contentLength));
        }
    }

    public static final ResponseBody create(m mVar, MediaType mediaType, long j) {
        return Companion.create(mVar, mediaType, j);
    }

    public final InputStream byteStream() {
        return source().e0();
    }

    public final n byteString() {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            m source = source();
            try {
                n N = source.N();
                source.close();
                int d10 = N.d();
                if (contentLength != -1 && contentLength != d10) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + d10 + ") disagree");
                }
                return N;
            } finally {
            }
        } else {
            throw new IOException(r4.a.j("Cannot buffer entire body for content length: ", contentLength));
        }
    }

    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            m source = source();
            try {
                byte[] p10 = source.p();
                source.close();
                int length = p10.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return p10;
            } finally {
            }
        } else {
            throw new IOException(r4.a.j("Cannot buffer entire body for content length: ", contentLength));
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract m source();

    public final String string() {
        m source = source();
        try {
            String H = source.H(Util.readBomAsCharset(source, charset()));
            source.close();
            return H;
        } finally {
        }
    }

    public static final ResponseBody create(n nVar, MediaType mediaType) {
        return Companion.create(nVar, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, m mVar) {
        return Companion.create(mediaType, j, mVar);
    }

    public static final ResponseBody create(MediaType mediaType, n nVar) {
        return Companion.create(mediaType, nVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
