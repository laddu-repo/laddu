package okhttp3;

import bg.b;
import bg.l;
import bg.n;
import df.a;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content) {
            k.e(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, n nVar, MediaType mediaType, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(nVar, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content, int i6) {
            k.e(content, "content");
            return create$default(this, mediaType, content, i6, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i6, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                mediaType = null;
            }
            if ((i11 & 2) != 0) {
                i6 = 0;
            }
            if ((i11 & 4) != 0) {
                i10 = bArr.length;
            }
            return companion.create(bArr, mediaType, i6, i10);
        }

        public final RequestBody create(byte[] bArr) {
            k.e(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            k.e(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i6) {
            k.e(bArr, "<this>");
            return create$default(this, bArr, mediaType, i6, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i6, int i10, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i6 = 0;
            }
            if ((i11 & 8) != 0) {
                i10 = bArr.length;
            }
            return companion.create(mediaType, bArr, i6, i10);
        }

        public final RequestBody create(String str, MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            k.d(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody create(final n nVar, final MediaType mediaType) {
            k.e(nVar, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return nVar.d();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(l sink) {
                    k.e(sink, "sink");
                    sink.n(nVar);
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i6, final int i10) {
            k.e(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i6, i10);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i10;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(l sink) {
                    k.e(sink, "sink");
                    sink.write(bArr, i6, i10);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            k.e(file, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(l sink) {
                    k.e(sink, "sink");
                    bg.f k8 = b.k(file);
                    try {
                        sink.T(k8);
                        k8.close();
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(MediaType mediaType, String content) {
            k.e(content, "content");
            return create(content, mediaType);
        }

        public final RequestBody create(MediaType mediaType, n content) {
            k.e(content, "content");
            return create(content, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] content, int i6, int i10) {
            k.e(content, "content");
            return create(content, mediaType, i6, i10);
        }

        public final RequestBody create(MediaType mediaType, File file) {
            k.e(file, "file");
            return create(file, mediaType);
        }
    }

    public static final RequestBody create(n nVar, MediaType mediaType) {
        return Companion.create(nVar, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(l lVar);

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, n nVar) {
        return Companion.create(mediaType, nVar);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i6) {
        return Companion.create(mediaType, bArr, i6);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i6, int i10) {
        return Companion.create(mediaType, bArr, i6, i10);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i6) {
        return Companion.create(bArr, mediaType, i6);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i6, int i10) {
        return Companion.create(bArr, mediaType, i6, i10);
    }
}
