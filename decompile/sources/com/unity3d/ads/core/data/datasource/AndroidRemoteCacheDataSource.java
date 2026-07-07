package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import gf.f0;
import gf.y;
import java.io.File;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClientProvider httpClientProvider;
    private final y ioDispatcher;

    public AndroidRemoteCacheDataSource(y ioDispatcher, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClientProvider httpClientProvider) {
        k.e(ioDispatcher, "ioDispatcher");
        k.e(createFile, "createFile");
        k.e(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        k.e(httpClientProvider, "httpClientProvider");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClientProvider = httpClientProvider;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, c cVar) {
        return f0.J(this.ioDispatcher, new AndroidRemoteCacheDataSource$getFile$2(str2, this, file, str, num, null), cVar);
    }
}
