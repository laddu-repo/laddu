package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import df.u;
import java.io.File;
import kotlin.jvm.internal.k;
import le.c;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl) {
        k.e(createFile, "createFile");
        k.e(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, c cVar) {
        String str3;
        String str4;
        String str5;
        int i6;
        File invoke = this.createFile.invoke(file, str);
        if (invoke.exists()) {
            String name = invoke.getName();
            k.d(name, "file.name");
            if (!u.z(name, ".part", false)) {
                if (str2 != null && str2.length() != 0) {
                    str3 = this.getFileExtensionFromUrl.invoke(str2);
                } else {
                    str3 = null;
                }
                if (str2 == null) {
                    str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str4 = str2;
                }
                if (str3 == null) {
                    str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str5 = str3;
                }
                long length = invoke.length();
                if (num != null) {
                    i6 = num.intValue();
                } else {
                    i6 = Integer.MAX_VALUE;
                }
                return new CacheResult.Success(new CachedFile(str4, str, invoke, str5, length, null, i6, 32, null), CacheSource.LOCAL);
            }
        }
        return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL, null, 4, null);
    }

    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}
