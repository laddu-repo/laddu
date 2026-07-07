package com.unity3d.ads.core.data.model;

import h8.c;
import java.io.File;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String url, String name, File file, String str, long j, String protocol, int i6) {
        k.e(url, "url");
        k.e(name, "name");
        k.e(protocol, "protocol");
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j;
        this.protocol = protocol;
        this.priority = i6;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, File file, String str3, long j, String str4, int i6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cachedFile.url;
        }
        if ((i10 & 2) != 0) {
            str2 = cachedFile.name;
        }
        if ((i10 & 4) != 0) {
            file = cachedFile.file;
        }
        if ((i10 & 8) != 0) {
            str3 = cachedFile.extension;
        }
        if ((i10 & 16) != 0) {
            j = cachedFile.contentLength;
        }
        if ((i10 & 32) != 0) {
            str4 = cachedFile.protocol;
        }
        if ((i10 & 64) != 0) {
            i6 = cachedFile.priority;
        }
        long j10 = j;
        File file2 = file;
        String str5 = str3;
        return cachedFile.copy(str, str2, file2, str5, j10, str4, i6);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.name;
    }

    public final File component3() {
        return this.file;
    }

    public final String component4() {
        return this.extension;
    }

    public final long component5() {
        return this.contentLength;
    }

    public final String component6() {
        return this.protocol;
    }

    public final int component7() {
        return this.priority;
    }

    public final CachedFile copy(String url, String name, File file, String str, long j, String protocol, int i6) {
        k.e(url, "url");
        k.e(name, "name");
        k.e(protocol, "protocol");
        return new CachedFile(url, name, file, str, j, protocol, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        if (k.a(this.url, cachedFile.url) && k.a(this.name, cachedFile.name) && k.a(this.file, cachedFile.file) && k.a(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && k.a(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority) {
            return true;
        }
        return false;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int g10 = c.g(this.name, this.url.hashCode() * 31, 31);
        File file = this.file;
        int i6 = 0;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        int i10 = (g10 + hashCode) * 31;
        String str = this.extension;
        if (str != null) {
            i6 = str.hashCode();
        }
        long j = this.contentLength;
        return c.g(this.protocol, (((i10 + i6) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31) + this.priority;
    }

    public String toString() {
        return "CachedFile(url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public /* synthetic */ CachedFile(String str, String str2, File file, String str3, long j, String str4, int i6, int i10, f fVar) {
        this(str, str2, (i10 & 4) != 0 ? null : file, (i10 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, (i10 & 16) != 0 ? -1L : j, (i10 & 32) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4, (i10 & 64) != 0 ? Integer.MAX_VALUE : i6);
    }
}
