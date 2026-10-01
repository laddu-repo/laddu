package okhttp3;

import df.m;
import h8.c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i6, TimeUnit timeUnit) {
            k.e(timeUnit, "timeUnit");
            if (i6 >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i6));
                return this;
            }
            throw new IllegalArgumentException(c.i(i6, "maxAge < 0: ").toString());
        }

        public final Builder maxStale(int i6, TimeUnit timeUnit) {
            k.e(timeUnit, "timeUnit");
            if (i6 >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i6));
                return this;
            }
            throw new IllegalArgumentException(c.i(i6, "maxStale < 0: ").toString());
        }

        public final Builder minFresh(int i6, TimeUnit timeUnit) {
            k.e(timeUnit, "timeUnit");
            if (i6 >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i6));
                return this;
            }
            throw new IllegalArgumentException(c.i(i6, "minFresh < 0: ").toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i6) {
            int length = str.length();
            while (i6 < length) {
                if (m.J(str2, str.charAt(i6))) {
                    return i6;
                }
                i6++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i6, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                i6 = 0;
            }
            return companion.indexOfElement(str, str2, i6);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cf A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00c6 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl parse(okhttp3.Headers r27) {
            /*
                Method dump skipped, instructions count: 425
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z10, boolean z11, int i6, int i10, boolean z12, boolean z13, boolean z14, int i11, int i12, boolean z15, boolean z16, boolean z17, String str, f fVar) {
        this(z10, z11, i6, i10, z12, z13, z14, i11, i12, z15, z16, z17, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m170deprecated_immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m171deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m172deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m173deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m174deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m175deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m176deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m177deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m178deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m179deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.noCache) {
                sb2.append("no-cache, ");
            }
            if (this.noStore) {
                sb2.append("no-store, ");
            }
            if (this.maxAgeSeconds != -1) {
                sb2.append("max-age=");
                sb2.append(this.maxAgeSeconds);
                sb2.append(", ");
            }
            if (this.sMaxAgeSeconds != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.sMaxAgeSeconds);
                sb2.append(", ");
            }
            if (this.isPrivate) {
                sb2.append("private, ");
            }
            if (this.isPublic) {
                sb2.append("public, ");
            }
            if (this.mustRevalidate) {
                sb2.append("must-revalidate, ");
            }
            if (this.maxStaleSeconds != -1) {
                sb2.append("max-stale=");
                sb2.append(this.maxStaleSeconds);
                sb2.append(", ");
            }
            if (this.minFreshSeconds != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.minFreshSeconds);
                sb2.append(", ");
            }
            if (this.onlyIfCached) {
                sb2.append("only-if-cached, ");
            }
            if (this.noTransform) {
                sb2.append("no-transform, ");
            }
            if (this.immutable) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            k.d(sb3, "StringBuilder().apply(builderAction).toString()");
            this.headerValue = sb3;
            return sb3;
        }
        return str;
    }

    private CacheControl(boolean z10, boolean z11, int i6, int i10, boolean z12, boolean z13, boolean z14, int i11, int i12, boolean z15, boolean z16, boolean z17, String str) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i6;
        this.sMaxAgeSeconds = i10;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i11;
        this.minFreshSeconds = i12;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.headerValue = str;
    }
}
